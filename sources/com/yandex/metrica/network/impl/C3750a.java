package com.yandex.metrica.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.network.impl.a */
final class C3750a extends Lambda implements Function0 {

    /* renamed from: a */
    final /* synthetic */ HttpsURLConnection f9645a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3750a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f9645a = httpsURLConnection;
    }

    public Object invoke() {
        return this.f9645a.getInputStream();
    }
}
