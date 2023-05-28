package com.yandex.metrica.impl.p082ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n0 */
public class C3243n0 {

    /* renamed from: a */
    public final Map<String, String> f8408a;

    /* renamed from: b */
    public final String f8409b;

    /* renamed from: c */
    public final String f8410c;

    public C3243n0(String str, Map<String, String> map, String str2) {
        this.f8409b = str;
        this.f8408a = map;
        this.f8410c = str2;
    }

    public String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f8408a + ", mDeeplink='" + this.f8409b + '\'' + ", mUnparsedReferrer='" + this.f8410c + '\'' + '}';
    }
}
