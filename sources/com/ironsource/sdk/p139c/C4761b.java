package com.ironsource.sdk.p139c;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.c.b */
public final class C4761b {

    /* renamed from: a */
    private C4762c f12095a;

    C4761b(C4762c cVar) {
        this.f12095a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f12095a.handleMessageFromAd(str);
    }
}
