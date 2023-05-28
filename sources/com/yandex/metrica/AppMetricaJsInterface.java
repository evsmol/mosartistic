package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.p082ob.C2603Uf;

public class AppMetricaJsInterface {

    /* renamed from: a */
    private final C2603Uf f26719a;

    public AppMetricaJsInterface(C2603Uf uf) {
        this.f26719a = uf;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f26719a.mo16800c(str, str2);
    }
}
