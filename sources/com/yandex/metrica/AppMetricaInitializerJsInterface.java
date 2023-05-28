package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.p082ob.C2603Uf;

public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    private final C2603Uf f26718a;

    public AppMetricaInitializerJsInterface(C2603Uf uf) {
        this.f26718a = uf;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f26718a.mo16799c(str);
    }
}
