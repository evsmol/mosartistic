package com.applovin.exoplayer2;

import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.ai */
public class C6809ai extends IOException {

    /* renamed from: a */
    public final boolean f14803a;

    /* renamed from: b */
    public final int f14804b;

    protected C6809ai(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f14803a = z;
        this.f14804b = i;
    }

    /* renamed from: a */
    public static C6809ai m17538a(String str) {
        return new C6809ai(str, (Throwable) null, false, 1);
    }

    /* renamed from: a */
    public static C6809ai m17539a(String str, Throwable th) {
        return new C6809ai(str, th, true, 0);
    }

    /* renamed from: b */
    public static C6809ai m17540b(String str, Throwable th) {
        return new C6809ai(str, th, true, 1);
    }
}
