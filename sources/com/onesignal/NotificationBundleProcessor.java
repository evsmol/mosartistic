package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationBundleProcessor {

    interface NotificationProcessingCallback {
        void onResult(boolean z);
    }

    interface ProcessBundleReceiverCallback {
        void onBundleProcessed(ProcessedBundleResult processedBundleResult);
    }

    static void processFromFCMIntentService(Context context, BundleCompat bundleCompat) {
        OneSignal.initWithContext(context);
        try {
            final String string = bundleCompat.getString("json_payload");
            if (string == null) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.Log(log_level, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + bundleCompat);
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            boolean z = bundleCompat.getBoolean("is_restoring", false);
            final long longValue = bundleCompat.getLong("timestamp").longValue();
            final int intValue = bundleCompat.containsKey("android_notif_id") ? bundleCompat.getInt("android_notif_id").intValue() : 0;
            final boolean z2 = z;
            final JSONObject jSONObject2 = jSONObject;
            final Context context2 = context;
            OneSignal.notValidOrDuplicated(context, jSONObject, new OSNotificationDataController.InvalidOrDuplicateNotificationCallback() {
                public void onResult(boolean z) {
                    if (z2 || !z) {
                        OSNotificationWorkManager.beginEnqueueingWork(context2, OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject2), intValue, string, longValue, z2, false);
                        if (z2) {
                            OSUtils.sleep(100);
                        }
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static int processJobForDisplay(OSNotificationGenerationJob oSNotificationGenerationJob, boolean z) {
        return processJobForDisplay(new OSNotificationController(oSNotificationGenerationJob, oSNotificationGenerationJob.isRestoring(), true), false, z);
    }

    static int processJobForDisplay(OSNotificationController oSNotificationController, boolean z) {
        return processJobForDisplay(oSNotificationController, false, z);
    }

    private static int processJobForDisplay(OSNotificationController oSNotificationController, boolean z, boolean z2) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "Starting processJobForDisplay opened: " + z + " fromBackgroundLogic: " + z2);
        OSNotificationGenerationJob notificationJob = oSNotificationController.getNotificationJob();
        processCollapseKey(notificationJob);
        int intValue = notificationJob.getAndroidId().intValue();
        boolean z3 = false;
        if (shouldDisplayNotification(notificationJob)) {
            notificationJob.setIsNotificationToDisplay(true);
            if (!z2 || !OneSignal.shouldFireForegroundHandlers(notificationJob)) {
                z3 = GenerateNotification.displayNotification(notificationJob);
            } else {
                oSNotificationController.setFromBackgroundLogic(false);
                OneSignal.fireForegroundHandlers(oSNotificationController);
                return intValue;
            }
        }
        if (!notificationJob.isRestoring()) {
            processNotification(notificationJob, z, z3);
            OSNotificationWorkManager.removeNotificationIdProcessed(OSNotificationFormatHelper.getOSNotificationIdFromJson(oSNotificationController.getNotificationJob().getJsonPayload()));
            OneSignal.handleNotificationReceived(notificationJob);
        }
        return intValue;
    }

    private static boolean shouldDisplayNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        return oSNotificationGenerationJob.hasExtender() || OSUtils.isStringNotEmpty(oSNotificationGenerationJob.getJsonPayload().optString("alert"));
    }

    static void processNotification(OSNotificationGenerationJob oSNotificationGenerationJob, boolean z, boolean z2) {
        saveNotification(oSNotificationGenerationJob, z);
        if (!z2) {
            markNotificationAsDismissed(oSNotificationGenerationJob);
            return;
        }
        String apiNotificationId = oSNotificationGenerationJob.getApiNotificationId();
        OSReceiveReceiptController.getInstance().beginEnqueueingWork(oSNotificationGenerationJob.getContext(), apiNotificationId);
        OneSignal.getSessionManager().onNotificationReceived(apiNotificationId);
    }

    private static void saveNotification(OSNotificationGenerationJob oSNotificationGenerationJob, boolean z) {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Saving Notification job: " + oSNotificationGenerationJob.toString());
        Context context = oSNotificationGenerationJob.getContext();
        JSONObject jsonPayload = oSNotificationGenerationJob.getJsonPayload();
        try {
            JSONObject customJSONObject = getCustomJSONObject(oSNotificationGenerationJob.getJsonPayload());
            OneSignalDbHelper instance = OneSignalDbHelper.getInstance(oSNotificationGenerationJob.getContext());
            int i = 1;
            if (oSNotificationGenerationJob.isNotificationToDisplay()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                instance.update("notification", contentValues, "android_notification_id = " + oSNotificationGenerationJob.getAndroidId(), (String[]) null);
                BadgeCountUpdater.update(instance, context);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", customJSONObject.optString("i"));
            if (jsonPayload.has("grp")) {
                contentValues2.put("group_id", jsonPayload.optString("grp"));
            }
            if (jsonPayload.has("collapse_key") && !"do_not_collapse".equals(jsonPayload.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jsonPayload.optString("collapse_key"));
            }
            if (!z) {
                i = 0;
            }
            contentValues2.put("opened", Integer.valueOf(i));
            if (!z) {
                contentValues2.put("android_notification_id", oSNotificationGenerationJob.getAndroidId());
            }
            if (oSNotificationGenerationJob.getTitle() != null) {
                contentValues2.put("title", oSNotificationGenerationJob.getTitle().toString());
            }
            if (oSNotificationGenerationJob.getBody() != null) {
                contentValues2.put("message", oSNotificationGenerationJob.getBody().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((jsonPayload.optLong("google.sent_time", OneSignal.getTime().getCurrentTimeMillis()) / 1000) + ((long) jsonPayload.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", jsonPayload.toString());
            instance.insertOrThrow("notification", (String) null, contentValues2);
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Notification saved values: " + contentValues2.toString());
            if (!z) {
                BadgeCountUpdater.update(instance, context);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static void markNotificationAsDismissed(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (oSNotificationGenerationJob.isNotificationToDisplay()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Marking restored or disabled notifications as dismissed: " + oSNotificationGenerationJob.toString());
            OneSignalDbHelper instance = OneSignalDbHelper.getInstance(oSNotificationGenerationJob.getContext());
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", 1);
            instance.update("notification", contentValues, "android_notification_id = " + oSNotificationGenerationJob.getAndroidId(), (String[]) null);
            BadgeCountUpdater.update(instance, oSNotificationGenerationJob.getContext());
        }
    }

    static JSONObject bundleAsJSONObject(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.Log(log_level, "bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    private static void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", "__DEFAULT__");
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private static void processCollapseKey(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (!oSNotificationGenerationJob.isRestoring() && oSNotificationGenerationJob.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(oSNotificationGenerationJob.getJsonPayload().optString("collapse_key"))) {
            Cursor query = OneSignalDbHelper.getInstance(oSNotificationGenerationJob.getContext()).query("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{oSNotificationGenerationJob.getJsonPayload().optString("collapse_key")}, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                oSNotificationGenerationJob.getNotification().setAndroidNotificationId(query.getInt(query.getColumnIndex("android_notification_id")));
            }
            query.close();
        }
    }

    static void processBundleFromReceiver(Context context, Bundle bundle, final ProcessBundleReceiverCallback processBundleReceiverCallback) {
        final ProcessedBundleResult processedBundleResult = new ProcessedBundleResult();
        if (!OSNotificationFormatHelper.isOneSignalBundle(bundle)) {
            processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            return;
        }
        processedBundleResult.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        if (OSInAppMessagePreviewHandler.notificationReceived(context, bundle)) {
            processedBundleResult.setInAppPreviewShown(true);
            processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            return;
        }
        startNotificationProcessing(context, bundle, processedBundleResult, new NotificationProcessingCallback() {
            public void onResult(boolean z) {
                if (!z) {
                    ProcessedBundleResult.this.setDup(true);
                }
                processBundleReceiverCallback.onBundleProcessed(ProcessedBundleResult.this);
            }
        });
    }

    private static void startNotificationProcessing(Context context, Bundle bundle, ProcessedBundleResult processedBundleResult, NotificationProcessingCallback notificationProcessingCallback) {
        JSONObject bundleAsJSONObject = bundleAsJSONObject(bundle);
        final long currentTimeMillis = OneSignal.getTime().getCurrentTimeMillis() / 1000;
        boolean z = bundle.getBoolean("is_restoring", false);
        final boolean z2 = Integer.parseInt(bundle.getString("pri", BuildConfig.ADAPTER_VERSION)) > 9;
        final boolean z3 = z;
        final Context context2 = context;
        final Bundle bundle2 = bundle;
        final NotificationProcessingCallback notificationProcessingCallback2 = notificationProcessingCallback;
        final JSONObject jSONObject = bundleAsJSONObject;
        final ProcessedBundleResult processedBundleResult2 = processedBundleResult;
        OneSignal.notValidOrDuplicated(context, bundleAsJSONObject, new OSNotificationDataController.InvalidOrDuplicateNotificationCallback() {
            public void onResult(boolean z) {
                if (z3 || !z) {
                    OSNotificationWorkManager.beginEnqueueingWork(context2, OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject), bundle2.containsKey("android_notif_id") ? bundle2.getInt("android_notif_id") : 0, jSONObject.toString(), currentTimeMillis, z3, z2);
                    processedBundleResult2.setWorkManagerProcessing(true);
                    notificationProcessingCallback2.onResult(true);
                    return;
                }
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.Log(log_level, "startNotificationProcessing returning, with context: " + context2 + " and bundle: " + bundle2);
                notificationProcessingCallback2.onResult(false);
            }
        });
    }

    static JSONArray newJsonArray(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    static JSONObject getCustomJSONObject(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    static boolean hasRemoteResource(Bundle bundle) {
        return isBuildKeyRemote(bundle, "licon") || isBuildKeyRemote(bundle, "bicon") || bundle.getString("bg_img", (String) null) != null;
    }

    private static boolean isBuildKeyRemote(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    static class ProcessedBundleResult {
        private boolean inAppPreviewShown;
        private boolean isDup;
        private boolean isOneSignalPayload;
        private boolean isWorkManagerProcessing;

        ProcessedBundleResult() {
        }

        /* access modifiers changed from: package-private */
        public boolean processed() {
            return !this.isOneSignalPayload || this.isDup || this.inAppPreviewShown || this.isWorkManagerProcessing;
        }

        /* access modifiers changed from: package-private */
        public void setOneSignalPayload(boolean z) {
            this.isOneSignalPayload = z;
        }

        /* access modifiers changed from: package-private */
        public boolean isDup() {
            return this.isDup;
        }

        /* access modifiers changed from: package-private */
        public void setDup(boolean z) {
            this.isDup = z;
        }

        public void setInAppPreviewShown(boolean z) {
            this.inAppPreviewShown = z;
        }

        public boolean isWorkManagerProcessing() {
            return this.isWorkManagerProcessing;
        }

        public void setWorkManagerProcessing(boolean z) {
            this.isWorkManagerProcessing = z;
        }
    }
}
