package com.appodeal.ads.utils;

import android.content.DialogInterface;

/* renamed from: com.appodeal.ads.utils.g */
public final class C9625g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9626h f24396a;

    public C9625g(C9626h hVar) {
        this.f24396a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9626h hVar = this.f24396a;
        if (i == 0) {
            hVar.sort(new C9628i());
        } else if (i != 1) {
            hVar.getClass();
        } else {
            hVar.sort(new C9629j());
        }
        dialogInterface.dismiss();
    }
}
