package com.applovin.impl.sdk.p253b;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.c */
public class C8377c {

    /* renamed from: a */
    private final String f20639a;

    /* renamed from: b */
    private Map<String, String> f20640b;

    private C8377c(String str, Map<String, String> map) {
        this.f20639a = str;
        this.f20640b = map;
    }

    /* renamed from: a */
    public static C8377c m25184a(String str) {
        return m25185a(str, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C8377c m25185a(String str, Map<String, String> map) {
        return new C8377c(str, map);
    }

    /* renamed from: a */
    public Map<String, String> mo57077a() {
        return this.f20640b;
    }

    /* renamed from: b */
    public String mo57078b() {
        return this.f20639a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f20639a + '\'' + "params='" + this.f20640b + '\'' + '}';
    }
}
