package com.appsgeyser.sdk.p270ui;

import android.app.Dialog;
import android.content.Context;
import com.appsgeyser.sdk.R;

/* renamed from: com.appsgeyser.sdk.ui.AppsgeyserProgressDialog */
public class AppsgeyserProgressDialog extends Dialog {
    public AppsgeyserProgressDialog(Context context) {
        super(context);
        setCancelable(false);
        setContentView(R.layout.appsgeysersdk_progress_dialog);
    }
}
