package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.data.OSOutcomeEventsFactory;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class OSOutcomeEventsController {
    private final OSSessionManager osSessionManager;
    /* access modifiers changed from: private */
    public final OSOutcomeEventsFactory outcomeEventsFactory;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public OSOutcomeEventsController(OSSessionManager oSSessionManager, OSOutcomeEventsFactory oSOutcomeEventsFactory) {
        this.osSessionManager = oSSessionManager;
        this.outcomeEventsFactory = oSOutcomeEventsFactory;
        initUniqueOutcomeEventsSentSets();
    }

    private void initUniqueOutcomeEventsSentSets() {
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        Set<String> unattributedUniqueOutcomeEventsSent = this.outcomeEventsFactory.getRepository().getUnattributedUniqueOutcomeEventsSent();
        if (unattributedUniqueOutcomeEventsSent != null) {
            this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSent;
        }
    }

    /* access modifiers changed from: package-private */
    public void cleanOutcomes() {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "OneSignal cleanOutcomes for session");
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    /* access modifiers changed from: package-private */
    public void cleanCachedUniqueOutcomes() {
        new Thread(new Runnable() {
            public void run() {
                Thread.currentThread().setPriority(10);
                OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().cleanCachedUniqueOutcomeEventNotifications("notification", "notification_id");
            }
        }, "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    /* access modifiers changed from: package-private */
    public void sendSavedOutcomes() {
        new Thread(new Runnable() {
            public void run() {
                Thread.currentThread().setPriority(10);
                for (OSOutcomeEventParams access$100 : OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().getSavedOutcomeEvents()) {
                    OSOutcomeEventsController.this.sendSavedOutcomeEvent(access$100);
                }
            }
        }, "OS_SEND_SAVED_OUTCOMES").start();
    }

    /* access modifiers changed from: private */
    public void sendSavedOutcomeEvent(final OSOutcomeEventParams oSOutcomeEventParams) {
        int deviceType = new OSUtils().getDeviceType();
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(OneSignal.appId, deviceType, oSOutcomeEventParams, new OneSignalApiResponseHandler() {
            public void onFailure(int i, String str, Throwable th) {
            }

            public void onSuccess(String str) {
                OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().removeEvent(oSOutcomeEventParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void sendClickActionOutcomes(List<OSInAppMessageOutcome> list) {
        for (OSInAppMessageOutcome next : list) {
            String name = next.getName();
            if (next.isUnique()) {
                sendUniqueOutcomeEvent(name, (OneSignal.OutcomeCallback) null);
            } else if (next.getWeight() > 0.0f) {
                sendOutcomeEventWithValue(name, next.getWeight(), (OneSignal.OutcomeCallback) null);
            } else {
                sendOutcomeEvent(name, (OneSignal.OutcomeCallback) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void sendUniqueOutcomeEvent(String str, OneSignal.OutcomeCallback outcomeCallback) {
        sendUniqueOutcomeEvent(str, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    /* access modifiers changed from: package-private */
    public void sendOutcomeEvent(String str, OneSignal.OutcomeCallback outcomeCallback) {
        sendAndCreateOutcomeEvent(str, 0.0f, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    /* access modifiers changed from: package-private */
    public void sendOutcomeEventWithValue(String str, float f, OneSignal.OutcomeCallback outcomeCallback) {
        sendAndCreateOutcomeEvent(str, f, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    private void sendUniqueOutcomeEvent(String str, List<OSInfluence> list, OneSignal.OutcomeCallback outcomeCallback) {
        List<OSInfluence> removeDisabledInfluences = removeDisabledInfluences(list);
        if (removeDisabledInfluences.isEmpty()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean z = false;
        Iterator<OSInfluence> it = removeDisabledInfluences.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getInfluenceType().isAttributed()) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            List<OSInfluence> uniqueIds = getUniqueIds(str, removeDisabledInfluences);
            if (uniqueIds == null) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.Log(log_level, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + removeDisabledInfluences.toString() + "\nOutcome name: " + str);
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess((OSOutcomeEvent) null);
                    return;
                }
                return;
            }
            sendAndCreateOutcomeEvent(str, 0.0f, uniqueIds, outcomeCallback);
        } else if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level2, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + OSInfluenceType.UNATTRIBUTED + "\nOutcome name: " + str);
            if (outcomeCallback != null) {
                outcomeCallback.onSuccess((OSOutcomeEvent) null);
            }
        } else {
            this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
            sendAndCreateOutcomeEvent(str, 0.0f, removeDisabledInfluences, outcomeCallback);
        }
    }

    private void sendAndCreateOutcomeEvent(String str, float f, List<OSInfluence> list, OneSignal.OutcomeCallback outcomeCallback) {
        OneSignal.OutcomeCallback outcomeCallback2 = outcomeCallback;
        final long currentTimeMillis = OneSignal.getTime().getCurrentTimeMillis() / 1000;
        int deviceType = new OSUtils().getDeviceType();
        String str2 = OneSignal.appId;
        boolean z = false;
        OSOutcomeSourceBody oSOutcomeSourceBody = null;
        OSOutcomeSourceBody oSOutcomeSourceBody2 = null;
        for (OSInfluence next : list) {
            int i = C50556.$SwitchMap$com$onesignal$influence$domain$OSInfluenceType[next.getInfluenceType().ordinal()];
            if (i == 1) {
                if (oSOutcomeSourceBody == null) {
                    oSOutcomeSourceBody = new OSOutcomeSourceBody();
                }
                oSOutcomeSourceBody = setSourceChannelIds(next, oSOutcomeSourceBody);
            } else if (i == 2) {
                if (oSOutcomeSourceBody2 == null) {
                    oSOutcomeSourceBody2 = new OSOutcomeSourceBody();
                }
                oSOutcomeSourceBody2 = setSourceChannelIds(next, oSOutcomeSourceBody2);
            } else if (i == 3) {
                z = true;
            } else if (i == 4) {
                OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for channel: " + next.getInfluenceChannel());
                if (outcomeCallback2 != null) {
                    outcomeCallback2.onSuccess((OSOutcomeEvent) null);
                    return;
                }
                return;
            }
        }
        if (oSOutcomeSourceBody == null && oSOutcomeSourceBody2 == null && !z) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for all channels");
            if (outcomeCallback2 != null) {
                outcomeCallback2.onSuccess((OSOutcomeEvent) null);
                return;
            }
            return;
        }
        OSOutcomeEventParams oSOutcomeEventParams = new OSOutcomeEventParams(str, new OSOutcomeSource(oSOutcomeSourceBody, oSOutcomeSourceBody2), f, 0);
        final OSOutcomeEventParams oSOutcomeEventParams2 = oSOutcomeEventParams;
        final OneSignal.OutcomeCallback outcomeCallback3 = outcomeCallback;
        final String str3 = str;
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(str2, deviceType, oSOutcomeEventParams, new OneSignalApiResponseHandler() {
            public void onSuccess(String str) {
                OSOutcomeEventsController.this.saveUniqueOutcome(oSOutcomeEventParams2);
                OneSignal.OutcomeCallback outcomeCallback = outcomeCallback3;
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess(OSOutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1(oSOutcomeEventParams2));
                }
            }

            public void onFailure(int i, String str, Throwable th) {
                new Thread(new Runnable() {
                    public void run() {
                        Thread.currentThread().setPriority(10);
                        oSOutcomeEventParams2.setTimestamp(currentTimeMillis);
                        OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().saveOutcomeEvent(oSOutcomeEventParams2);
                    }
                }, "OS_SAVE_OUTCOMES").start();
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                OneSignal.onesignalLog(log_level, "Sending outcome with name: " + str3 + " failed with status code: " + i + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start");
                OneSignal.OutcomeCallback outcomeCallback = outcomeCallback3;
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess((OSOutcomeEvent) null);
                }
            }
        });
    }

    /* renamed from: com.onesignal.OSOutcomeEventsController$6 */
    static /* synthetic */ class C50556 {
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$influence$domain$OSInfluenceChannel;
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$influence$domain$OSInfluenceType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.onesignal.influence.domain.OSInfluenceChannel[] r0 = com.onesignal.influence.domain.OSInfluenceChannel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$onesignal$influence$domain$OSInfluenceChannel = r0
                r1 = 1
                com.onesignal.influence.domain.OSInfluenceChannel r2 = com.onesignal.influence.domain.OSInfluenceChannel.IAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$onesignal$influence$domain$OSInfluenceChannel     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.influence.domain.OSInfluenceChannel r3 = com.onesignal.influence.domain.OSInfluenceChannel.NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.onesignal.influence.domain.OSInfluenceType[] r2 = com.onesignal.influence.domain.OSInfluenceType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$onesignal$influence$domain$OSInfluenceType = r2
                com.onesignal.influence.domain.OSInfluenceType r3 = com.onesignal.influence.domain.OSInfluenceType.DIRECT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = $SwitchMap$com$onesignal$influence$domain$OSInfluenceType     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.onesignal.influence.domain.OSInfluenceType r2 = com.onesignal.influence.domain.OSInfluenceType.INDIRECT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = $SwitchMap$com$onesignal$influence$domain$OSInfluenceType     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.onesignal.influence.domain.OSInfluenceType r1 = com.onesignal.influence.domain.OSInfluenceType.UNATTRIBUTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$onesignal$influence$domain$OSInfluenceType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.onesignal.influence.domain.OSInfluenceType r1 = com.onesignal.influence.domain.OSInfluenceType.DISABLED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSOutcomeEventsController.C50556.<clinit>():void");
        }
    }

    private OSOutcomeSourceBody setSourceChannelIds(OSInfluence oSInfluence, OSOutcomeSourceBody oSOutcomeSourceBody) {
        int i = C50556.$SwitchMap$com$onesignal$influence$domain$OSInfluenceChannel[oSInfluence.getInfluenceChannel().ordinal()];
        if (i == 1) {
            oSOutcomeSourceBody.setInAppMessagesIds(oSInfluence.getIds());
        } else if (i == 2) {
            oSOutcomeSourceBody.setNotificationIds(oSInfluence.getIds());
        }
        return oSOutcomeSourceBody;
    }

    private List<OSInfluence> removeDisabledInfluences(List<OSInfluence> list) {
        ArrayList arrayList = new ArrayList(list);
        for (OSInfluence next : list) {
            if (next.getInfluenceType().isDisabled()) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.onesignalLog(log_level, "Outcomes disabled for channel: " + next.getInfluenceChannel().toString());
                arrayList.remove(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void saveUniqueOutcome(OSOutcomeEventParams oSOutcomeEventParams) {
        if (oSOutcomeEventParams.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(oSOutcomeEventParams);
        }
    }

    private void saveAttributedUniqueOutcomeNotifications(final OSOutcomeEventParams oSOutcomeEventParams) {
        new Thread(new Runnable() {
            public void run() {
                Thread.currentThread().setPriority(10);
                OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().saveUniqueOutcomeNotifications(oSOutcomeEventParams);
            }
        }, "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    private void saveUnattributedUniqueOutcomeEvents() {
        this.outcomeEventsFactory.getRepository().saveUnattributedUniqueOutcomeEventsSent(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private List<OSInfluence> getUniqueIds(String str, List<OSInfluence> list) {
        List<OSInfluence> notCachedUniqueOutcome = this.outcomeEventsFactory.getRepository().getNotCachedUniqueOutcome(str, list);
        if (notCachedUniqueOutcome.size() > 0) {
            return notCachedUniqueOutcome;
        }
        return null;
    }
}
