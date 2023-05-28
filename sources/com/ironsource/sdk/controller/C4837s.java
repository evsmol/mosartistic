package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.s */
final class C4837s {

    /* renamed from: a */
    private C4838t f12332a;

    /* renamed from: b */
    private boolean f12333b = false;

    C4837s(C4838t tVar) {
        this.f12332a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f12333b) {
            return "";
        }
        this.f12333b = true;
        return this.f12332a.f12334a;
    }
}
