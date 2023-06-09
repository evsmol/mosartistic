package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;

class GooglePlayServicesUpgradePrompt {
    private static boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = OneSignal.appContext.getPackageManager();
            return !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    static void showUpdateGPSDialog() {
        if (OSUtils.isAndroidDeviceType() && isGooglePlayStoreInstalled() && !OneSignal.getDisableGMSMissingPrompt() && !OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.runOnMainUIThread(new Runnable() {
                public void run() {
                    final Activity currentActivity = OneSignal.getCurrentActivity();
                    if (currentActivity != null) {
                        String resourceString = OSUtils.getResourceString(currentActivity, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                        String resourceString2 = OSUtils.getResourceString(currentActivity, "onesignal_gms_missing_alert_button_update", "Update");
                        String resourceString3 = OSUtils.getResourceString(currentActivity, "onesignal_gms_missing_alert_button_skip", "Skip");
                        new AlertDialog.Builder(currentActivity).setMessage(resourceString).setPositiveButton(resourceString2, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                GooglePlayServicesUpgradePrompt.OpenPlayStoreToApp(currentActivity);
                            }
                        }).setNegativeButton(resourceString3, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "GT_DO_NOT_SHOW_MISSING_GPS", true);
                            }
                        }).setNeutralButton(OSUtils.getResourceString(currentActivity, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void OpenPlayStoreToApp(Activity activity) {
        try {
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            PendingIntent errorResolutionPendingIntent = instance.getErrorResolutionPendingIntent(activity, instance.isGooglePlayServicesAvailable(OneSignal.appContext), 9000);
            if (errorResolutionPendingIntent != null) {
                errorResolutionPendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }
}
