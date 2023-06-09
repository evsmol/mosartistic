package com.onesignal;

import android.content.DialogInterface;
import com.onesignal.AlertDialogPrepromptForAndroidSettings;
import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo38199d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo38200k = 3, mo38201mv = {1, 4, 2})
/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
final class AlertDialogPrepromptForAndroidSettings$show$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ AlertDialogPrepromptForAndroidSettings.Callback $callback;

    AlertDialogPrepromptForAndroidSettings$show$1(AlertDialogPrepromptForAndroidSettings.Callback callback) {
        this.$callback = callback;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.$callback.onAccept();
    }
}
