package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Scopes;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSynchronizer {
    protected final Object LOCK = new Object();
    /* access modifiers changed from: private */
    public boolean canMakeUpdates;
    /* access modifiers changed from: private */
    public OneSignalStateSynchronizer.UserStateSynchronizerType channel;
    private UserState currentUserState;
    private final Queue<OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler> deviceInfoCompletionHandler = new ConcurrentLinkedQueue();
    private final Queue<OneSignal.OSInternalExternalUserIdUpdateCompletionHandler> externalUserIdUpdateHandlers = new ConcurrentLinkedQueue();
    private final Object networkHandlerSyncLock = new Object() {
    };
    HashMap<Integer, NetworkHandlerThread> networkHandlerThreads = new HashMap<>();
    /* access modifiers changed from: private */
    public AtomicBoolean runningSyncUserState = new AtomicBoolean();
    private final Queue<OneSignal.ChangeTagsUpdateHandler> sendTagsHandlers = new ConcurrentLinkedQueue();
    private UserState toSyncUserState;
    protected boolean waitingForSessionResponse = false;

    /* access modifiers changed from: protected */
    public abstract void addOnSessionOrCreateExtras(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void fireEventsForUpdateFailure(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract String getId();

    /* access modifiers changed from: protected */
    public abstract OneSignal.LOG_LEVEL getLogLevel();

    /* access modifiers changed from: package-private */
    public abstract GetTagsResult getTags(boolean z);

    /* access modifiers changed from: protected */
    public abstract UserState newUserState(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract void onSuccessfulSync(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public abstract void saveChannelId(String str);

    /* access modifiers changed from: protected */
    public abstract void scheduleSyncToServer();

    /* access modifiers changed from: package-private */
    public abstract void updateIdDependents(String str);

    /* access modifiers changed from: package-private */
    public abstract void updateState(JSONObject jSONObject);

    UserStateSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        this.channel = userStateSynchronizerType;
    }

    /* access modifiers changed from: package-private */
    public String getChannelString() {
        return this.channel.name().toLowerCase();
    }

    static class GetTagsResult {
        JSONObject result;
        boolean serverSuccess;

        GetTagsResult(boolean z, JSONObject jSONObject) {
            this.serverSuccess = z;
            this.result = jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public String getRegistrationId() {
        return getToSyncUserState().getSyncValues().optString("identifier", (String) null);
    }

    class NetworkHandlerThread extends HandlerThread {
        int currentRetry;
        Handler mHandler = new Handler(getLooper());
        int mType;

        NetworkHandlerThread(int i) {
            super("OSH_NetworkHandlerThread_" + UserStateSynchronizer.this.channel);
            this.mType = i;
            start();
        }

        /* access modifiers changed from: package-private */
        public void runNewJobDelayed() {
            if (UserStateSynchronizer.this.canMakeUpdates) {
                synchronized (this.mHandler) {
                    this.currentRetry = 0;
                    this.mHandler.removeCallbacksAndMessages((Object) null);
                    this.mHandler.postDelayed(getNewRunnable(), 5000);
                }
            }
        }

        private Runnable getNewRunnable() {
            if (this.mType != 0) {
                return null;
            }
            return new Runnable() {
                public void run() {
                    if (!UserStateSynchronizer.this.runningSyncUserState.get()) {
                        UserStateSynchronizer.this.syncUserState(false);
                    }
                }
            };
        }

        /* access modifiers changed from: package-private */
        public boolean doRetry() {
            boolean hasMessages;
            synchronized (this.mHandler) {
                boolean z = this.currentRetry < 3;
                boolean hasMessages2 = this.mHandler.hasMessages(0);
                if (z && !hasMessages2) {
                    this.currentRetry++;
                    this.mHandler.postDelayed(getNewRunnable(), (long) (this.currentRetry * 15000));
                }
                hasMessages = this.mHandler.hasMessages(0);
            }
            return hasMessages;
        }
    }

    /* access modifiers changed from: protected */
    public JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject generateJsonDiff;
        synchronized (this.LOCK) {
            generateJsonDiff = JSONUtils.generateJsonDiff(jSONObject, jSONObject2, jSONObject3, set);
        }
        return generateJsonDiff;
    }

    /* access modifiers changed from: protected */
    public UserState getCurrentUserState() {
        if (this.currentUserState == null) {
            synchronized (this.LOCK) {
                if (this.currentUserState == null) {
                    this.currentUserState = newUserState("CURRENT_STATE", true);
                }
            }
        }
        return this.currentUserState;
    }

    /* access modifiers changed from: protected */
    public UserState getToSyncUserState() {
        if (this.toSyncUserState == null) {
            synchronized (this.LOCK) {
                if (this.toSyncUserState == null) {
                    this.toSyncUserState = newUserState("TOSYNC_STATE", true);
                }
            }
        }
        return this.toSyncUserState;
    }

    /* access modifiers changed from: package-private */
    public void initUserState() {
        if (this.currentUserState == null) {
            synchronized (this.LOCK) {
                if (this.currentUserState == null) {
                    this.currentUserState = newUserState("CURRENT_STATE", true);
                }
            }
        }
        getToSyncUserState();
    }

    /* access modifiers changed from: package-private */
    public void clearLocation() {
        getToSyncUserState().clearLocation();
        getToSyncUserState().persistState();
    }

    /* access modifiers changed from: package-private */
    public boolean persist() {
        boolean z = false;
        if (this.toSyncUserState == null) {
            return false;
        }
        synchronized (this.LOCK) {
            if (getCurrentUserState().generateJsonDiff(this.toSyncUserState, isSessionCall()) != null) {
                z = true;
            }
            this.toSyncUserState.persistState();
        }
        return z;
    }

    private boolean isSessionCall() {
        return (getToSyncUserState().getDependValues().optBoolean("session") || getId() == null) && !this.waitingForSessionResponse;
    }

    private boolean syncEmailLogout() {
        return getToSyncUserState().getDependValues().optBoolean("logoutEmail", false);
    }

    /* access modifiers changed from: package-private */
    public void syncUserState(boolean z) {
        this.runningSyncUserState.set(true);
        internalSyncUserState(z);
        this.runningSyncUserState.set(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r9 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        doPutSync(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        doCreateOrNewSession(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void internalSyncUserState(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.getId()
            boolean r1 = r8.syncEmailLogout()
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r8.doEmailLogout(r0)
            return
        L_0x0010:
            com.onesignal.UserState r1 = r8.currentUserState
            if (r1 != 0) goto L_0x0017
            r8.initUserState()
        L_0x0017:
            if (r9 != 0) goto L_0x0021
            boolean r9 = r8.isSessionCall()
            if (r9 == 0) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            java.lang.Object r1 = r8.LOCK
            monitor-enter(r1)
            com.onesignal.UserState r2 = r8.getCurrentUserState()     // Catch:{ all -> 0x0082 }
            com.onesignal.UserState r3 = r8.getToSyncUserState()     // Catch:{ all -> 0x0082 }
            org.json.JSONObject r2 = r2.generateJsonDiff(r3, r9)     // Catch:{ all -> 0x0082 }
            com.onesignal.UserState r3 = r8.getToSyncUserState()     // Catch:{ all -> 0x0082 }
            com.onesignal.UserState r4 = r8.getCurrentUserState()     // Catch:{ all -> 0x0082 }
            r5 = 0
            org.json.JSONObject r3 = r4.generateJsonDiffFromDependValues(r3, r5)     // Catch:{ all -> 0x0082 }
            com.onesignal.OneSignal$LOG_LEVEL r4 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r6.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "UserStateSynchronizer internalSyncUserState from session call: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r9)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = " jsonBody: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0082 }
            com.onesignal.OneSignal.onesignalLog(r4, r6)     // Catch:{ all -> 0x0082 }
            if (r2 != 0) goto L_0x0070
            com.onesignal.UserState r9 = r8.getCurrentUserState()     // Catch:{ all -> 0x0082 }
            r9.persistStateAfterSync(r3, r5)     // Catch:{ all -> 0x0082 }
            r8.sendTagsHandlersPerformOnSuccess()     // Catch:{ all -> 0x0082 }
            r8.externalUserIdUpdateHandlersPerformOnSuccess()     // Catch:{ all -> 0x0082 }
            r8.deviceInfoHandlersPerformOnSuccess()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            return
        L_0x0070:
            com.onesignal.UserState r4 = r8.getToSyncUserState()     // Catch:{ all -> 0x0082 }
            r4.persistState()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x007e
            r8.doPutSync(r0, r2, r3)
            goto L_0x0081
        L_0x007e:
            r8.doCreateOrNewSession(r0, r2, r3)
        L_0x0081:
            return
        L_0x0082:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.UserStateSynchronizer.internalSyncUserState(boolean):void");
    }

    private void doEmailLogout(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            ImmutableJSONObject dependValues = getCurrentUserState().getDependValues();
            if (dependValues.has("email_auth_hash")) {
                jSONObject.put("email_auth_hash", dependValues.optString("email_auth_hash"));
            }
            ImmutableJSONObject syncValues = getCurrentUserState().getSyncValues();
            if (syncValues.has("parent_player_id")) {
                jSONObject.put("parent_player_id", syncValues.optString("parent_player_id"));
            }
            jSONObject.put("app_id", syncValues.optString("app_id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        OneSignalRestClient.postSync(str2, jSONObject, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                OneSignal.Log(log_level, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "already logged out of email")) {
                    UserStateSynchronizer.this.logoutEmailSyncSuccess();
                } else if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "not a valid device_type")) {
                    UserStateSynchronizer.this.handlePlayerDeletedFromServer();
                } else {
                    UserStateSynchronizer.this.handleNetworkFailure(i);
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                UserStateSynchronizer.this.logoutEmailSyncSuccess();
            }
        });
    }

    /* access modifiers changed from: private */
    public void logoutEmailSyncSuccess() {
        getToSyncUserState().removeFromDependValues("logoutEmail");
        this.toSyncUserState.removeFromDependValues("email_auth_hash");
        this.toSyncUserState.removeFromSyncValues("parent_player_id");
        this.toSyncUserState.removeFromSyncValues(Scopes.EMAIL);
        this.toSyncUserState.persistState();
        getCurrentUserState().removeFromDependValues("email_auth_hash");
        getCurrentUserState().removeFromSyncValues("parent_player_id");
        String optString = getCurrentUserState().getSyncValues().optString(Scopes.EMAIL);
        getCurrentUserState().removeFromSyncValues(Scopes.EMAIL);
        OneSignalStateSynchronizer.setNewSessionForEmail();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.Log(log_level, "Device successfully logged out of email: " + optString);
        OneSignal.handleSuccessfulEmailLogout();
    }

    private void doPutSync(String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (str == null) {
            OneSignal.onesignalLog(getLogLevel(), "Error updating the user record because of the null user id");
            sendTagsHandlersPerformOnFailure(new OneSignal.SendTagsError(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            externalUserIdUpdateHandlersPerformOnFailure();
            deviceInfoHandlersPerformOnFailure(new OneSignalStateSynchronizer.OSDeviceInfoError(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        OneSignalRestClient.putSync("players/" + str, jSONObject, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.Log(log_level, "Failed PUT sync request with status code: " + i + " and response: " + str);
                synchronized (UserStateSynchronizer.this.LOCK) {
                    if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "No user with this id found")) {
                        UserStateSynchronizer.this.handlePlayerDeletedFromServer();
                    } else {
                        UserStateSynchronizer.this.handleNetworkFailure(i);
                    }
                }
                if (jSONObject.has("tags")) {
                    UserStateSynchronizer.this.sendTagsHandlersPerformOnFailure(new OneSignal.SendTagsError(i, str));
                }
                if (jSONObject.has("external_user_id")) {
                    OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.onesignalLog(log_level2, "Error setting external user id for push with status code: " + i + " and message: " + str);
                    UserStateSynchronizer.this.externalUserIdUpdateHandlersPerformOnFailure();
                }
                if (jSONObject.has("language")) {
                    UserStateSynchronizer.this.deviceInfoHandlersPerformOnFailure(new OneSignalStateSynchronizer.OSDeviceInfoError(i, str));
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                synchronized (UserStateSynchronizer.this.LOCK) {
                    UserStateSynchronizer.this.getCurrentUserState().persistStateAfterSync(jSONObject2, jSONObject);
                    UserStateSynchronizer.this.onSuccessfulSync(jSONObject);
                }
                if (jSONObject.has("tags")) {
                    UserStateSynchronizer.this.sendTagsHandlersPerformOnSuccess();
                }
                if (jSONObject.has("external_user_id")) {
                    UserStateSynchronizer.this.externalUserIdUpdateHandlersPerformOnSuccess();
                }
                if (jSONObject.has("language")) {
                    UserStateSynchronizer.this.deviceInfoHandlersPerformOnSuccess();
                }
            }
        });
    }

    private void doCreateOrNewSession(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.waitingForSessionResponse = true;
        addOnSessionOrCreateExtras(jSONObject);
        OneSignalRestClient.postSync(str2, jSONObject, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                synchronized (UserStateSynchronizer.this.LOCK) {
                    UserStateSynchronizer.this.waitingForSessionResponse = false;
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                    OneSignal.Log(log_level, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                    if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "not a valid device_type")) {
                        UserStateSynchronizer.this.handlePlayerDeletedFromServer();
                    } else {
                        UserStateSynchronizer.this.handleNetworkFailure(i);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                synchronized (UserStateSynchronizer.this.LOCK) {
                    UserStateSynchronizer.this.waitingForSessionResponse = false;
                    UserStateSynchronizer.this.getCurrentUserState().persistStateAfterSync(jSONObject2, jSONObject);
                    try {
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                        OneSignal.onesignalLog(log_level, "doCreateOrNewSession:response: " + str);
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("id")) {
                            String optString = jSONObject.optString("id");
                            UserStateSynchronizer.this.updateIdDependents(optString);
                            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.INFO;
                            OneSignal.Log(log_level2, "Device registered, UserId = " + optString);
                        } else {
                            OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.INFO;
                            OneSignal.Log(log_level3, "session sent, UserId = " + str);
                        }
                        UserStateSynchronizer.this.getUserStateForModification().putOnDependValues("session", false);
                        UserStateSynchronizer.this.getUserStateForModification().persistState();
                        if (jSONObject.has("in_app_messages")) {
                            OneSignal.getInAppMessageController().receivedInAppMessageJson(jSONObject.getJSONArray("in_app_messages"));
                        }
                        UserStateSynchronizer.this.onSuccessfulSync(jSONObject);
                    } catch (JSONException e) {
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "ERROR parsing on_session or create JSON Response.", e);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void handleNetworkFailure(int i) {
        if (i == 403) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            fireNetworkFailureEvents();
        } else if (!getNetworkHandlerThread(0).doRetry()) {
            fireNetworkFailureEvents();
        }
    }

    private void fireNetworkFailureEvents() {
        JSONObject generateJsonDiff = getCurrentUserState().generateJsonDiff(this.toSyncUserState, false);
        if (generateJsonDiff != null) {
            fireEventsForUpdateFailure(generateJsonDiff);
        }
        if (getToSyncUserState().getDependValues().optBoolean("logoutEmail", false)) {
            OneSignal.handleFailedEmailLogout();
        }
    }

    /* access modifiers changed from: private */
    public boolean response400WithErrorsContaining(int i, String str, String str2) {
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("errors") || !jSONObject.optString("errors").contains(str2)) {
                    return false;
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public NetworkHandlerThread getNetworkHandlerThread(Integer num) {
        NetworkHandlerThread networkHandlerThread;
        synchronized (this.networkHandlerSyncLock) {
            if (!this.networkHandlerThreads.containsKey(num)) {
                this.networkHandlerThreads.put(num, new NetworkHandlerThread(num.intValue()));
            }
            networkHandlerThread = this.networkHandlerThreads.get(num);
        }
        return networkHandlerThread;
    }

    /* access modifiers changed from: protected */
    public UserState getUserStateForModification() {
        if (this.toSyncUserState == null) {
            this.toSyncUserState = getCurrentUserState().deepClone("TOSYNC_STATE");
        }
        scheduleSyncToServer();
        return this.toSyncUserState;
    }

    /* access modifiers changed from: package-private */
    public void updateDeviceInfo(JSONObject jSONObject, OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler) {
        if (oSDeviceInfoCompletionHandler != null) {
            this.deviceInfoCompletionHandler.add(oSDeviceInfoCompletionHandler);
        }
        getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void setNewSession() {
        try {
            synchronized (this.LOCK) {
                getUserStateForModification().putOnDependValues("session", true);
                getUserStateForModification().persistState();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean getSyncAsNewSession() {
        return getUserStateForModification().getDependValues().optBoolean("session");
    }

    /* access modifiers changed from: package-private */
    public void sendTags(JSONObject jSONObject, OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (changeTagsUpdateHandler != null) {
            this.sendTagsHandlers.add(changeTagsUpdateHandler);
        }
        getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: private */
    public void handlePlayerDeletedFromServer() {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.handleSuccessfulEmailLogout();
        resetCurrentState();
        updateIdDependents((String) null);
        scheduleSyncToServer();
    }

    /* access modifiers changed from: package-private */
    public void resetCurrentState() {
        getCurrentUserState().setSyncValues(new JSONObject());
        getCurrentUserState().persistState();
    }

    /* access modifiers changed from: package-private */
    public void updateLocation(LocationController.LocationPoint locationPoint) {
        getUserStateForModification().setLocation(locationPoint);
    }

    /* access modifiers changed from: package-private */
    public void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        OneSignalRestClient.post("players/" + getId() + "/on_purchase", jSONObject, responseHandler);
    }

    /* access modifiers changed from: package-private */
    public void readyToUpdate(boolean z) {
        boolean z2 = this.canMakeUpdates != z;
        this.canMakeUpdates = z;
        if (z2 && z) {
            scheduleSyncToServer();
        }
    }

    /* access modifiers changed from: private */
    public void sendTagsHandlersPerformOnSuccess() {
        JSONObject jSONObject = OneSignalStateSynchronizer.getTags(false).result;
        while (true) {
            OneSignal.ChangeTagsUpdateHandler poll = this.sendTagsHandlers.poll();
            if (poll != null) {
                poll.onSuccess(jSONObject);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendTagsHandlersPerformOnFailure(OneSignal.SendTagsError sendTagsError) {
        while (true) {
            OneSignal.ChangeTagsUpdateHandler poll = this.sendTagsHandlers.poll();
            if (poll != null) {
                poll.onFailure(sendTagsError);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void externalUserIdUpdateHandlersPerformOnSuccess() {
        while (true) {
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler poll = this.externalUserIdUpdateHandlers.poll();
            if (poll != null) {
                poll.onComplete(getChannelString(), true);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void externalUserIdUpdateHandlersPerformOnFailure() {
        while (true) {
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler poll = this.externalUserIdUpdateHandlers.poll();
            if (poll != null) {
                poll.onComplete(getChannelString(), false);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void deviceInfoHandlersPerformOnSuccess() {
        String language = OneSignalStateSynchronizer.getLanguage();
        while (true) {
            OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler poll = this.deviceInfoCompletionHandler.poll();
            if (poll != null) {
                poll.onSuccess(language);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void deviceInfoHandlersPerformOnFailure(OneSignalStateSynchronizer.OSDeviceInfoError oSDeviceInfoError) {
        while (true) {
            OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler poll = this.deviceInfoCompletionHandler.poll();
            if (poll != null) {
                poll.onFailure(oSDeviceInfoError);
            } else {
                return;
            }
        }
    }
}
