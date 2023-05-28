package com.onesignal;

import android.app.Activity;
import com.google.android.gms.stats.CodePackage;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo38199d2 = {"Lcom/onesignal/LocationPermissionController;", "Lcom/onesignal/PermissionsActivity$PermissionCallback;", "()V", "PERMISSION_TYPE", "", "onAccept", "", "onReject", "fallbackToSettings", "", "onResponse", "result", "Lcom/onesignal/OneSignal$PromptActionResult;", "prompt", "androidPermissionString", "showFallbackAlertDialog", "onesignal_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* compiled from: LocationPermissionController.kt */
public final class LocationPermissionController implements PermissionsActivity.PermissionCallback {
    public static final LocationPermissionController INSTANCE;

    static {
        LocationPermissionController locationPermissionController = new LocationPermissionController();
        INSTANCE = locationPermissionController;
        PermissionsActivity.registerAsCallback(CodePackage.LOCATION, locationPermissionController);
    }

    private LocationPermissionController() {
    }

    public final void prompt(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "androidPermissionString");
        PermissionsActivity.startPrompt(z, CodePackage.LOCATION, str, getClass());
    }

    private final void onResponse(OneSignal.PromptActionResult promptActionResult) {
        LocationController.sendAndClearPromptHandlers(true, promptActionResult);
    }

    public void onAccept() {
        onResponse(OneSignal.PromptActionResult.PERMISSION_GRANTED);
        LocationController.startGetLocation();
    }

    public void onReject(boolean z) {
        onResponse(OneSignal.PromptActionResult.PERMISSION_DENIED);
        if (z) {
            showFallbackAlertDialog();
        }
        LocationController.fireFailedComplete();
    }

    private final void showFallbackAlertDialog() {
        Activity currentActivity = OneSignal.getCurrentActivity();
        if (currentActivity != null) {
            Intrinsics.checkNotNullExpressionValue(currentActivity, "OneSignal.getCurrentActivity() ?: return");
            AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
            String string = currentActivity.getString(R.string.location_permission_name_for_title);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = currentActivity.getString(R.string.location_permission_settings_message);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.str…mission_settings_message)");
            alertDialogPrepromptForAndroidSettings.show(currentActivity, string, string2, new LocationPermissionController$showFallbackAlertDialog$1(currentActivity));
        }
    }
}
