package com.bytedance.sdk.openadsdk.core.p021e;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.m */
/* compiled from: LoadingInfo */
public class C0476m {

    /* renamed from: a */
    private long f1638a = 10000;

    /* renamed from: b */
    private long f1639b = 10000;

    /* renamed from: c */
    private String f1640c = "";

    /* renamed from: a */
    public long mo1312a() {
        return this.f1638a;
    }

    /* renamed from: a */
    public void mo1313a(long j) {
        if (j <= 0) {
            this.f1638a = 10;
        } else {
            this.f1638a = j;
        }
    }

    /* renamed from: b */
    public long mo1315b() {
        return this.f1639b;
    }

    /* renamed from: b */
    public void mo1316b(long j) {
        if (j < 0) {
            this.f1639b = 20;
        } else {
            this.f1639b = j;
        }
    }

    /* renamed from: c */
    public String mo1317c() {
        return this.f1640c;
    }

    /* renamed from: a */
    public void mo1314a(String str) {
        this.f1640c = str;
    }
}
