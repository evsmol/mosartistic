package com.applovin.impl.sdk.p255d;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d.a */
public class C8388a {

    /* renamed from: a */
    private final String f21033a;

    /* renamed from: b */
    private final String f21034b;

    /* renamed from: c */
    private final Map<String, String> f21035c;

    /* renamed from: d */
    private final boolean f21036d;

    public C8388a(String str, String str2) {
        this(str, str2, (Map<String, String>) null, false);
    }

    public C8388a(String str, String str2, Map<String, String> map, boolean z) {
        this.f21033a = str;
        this.f21034b = str2;
        this.f21035c = map;
        this.f21036d = z;
    }

    /* renamed from: a */
    public String mo57120a() {
        return this.f21033a;
    }

    /* renamed from: b */
    public String mo57121b() {
        return this.f21034b;
    }

    /* renamed from: c */
    public Map<String, String> mo57122c() {
        return this.f21035c;
    }

    /* renamed from: d */
    public boolean mo57123d() {
        return this.f21036d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f21033a + '\'' + ", backupUrl='" + this.f21034b + '\'' + ", headers='" + this.f21035c + '\'' + ", shouldFireInWebView='" + this.f21036d + '\'' + '}';
    }
}
