package com.onesignal;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo38199d2 = {"Lcom/onesignal/NavigateToAndroidSettingsForNotifications;", "", "()V", "show", "", "context", "Landroid/content/Context;", "onesignal_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* compiled from: NavigateToAndroidSettingsForNotifications.kt */
public final class NavigateToAndroidSettingsForNotifications {
    public static final NavigateToAndroidSettingsForNotifications INSTANCE = new NavigateToAndroidSettingsForNotifications();

    private NavigateToAndroidSettingsForNotifications() {
    }

    public final void show(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
