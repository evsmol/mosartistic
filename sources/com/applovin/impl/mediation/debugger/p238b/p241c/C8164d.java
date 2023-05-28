package com.applovin.impl.mediation.debugger.p238b.p241c;

import android.content.Context;
import com.applovin.impl.sdk.utils.C8571h;

/* renamed from: com.applovin.impl.mediation.debugger.b.c.d */
public class C8164d {

    /* renamed from: a */
    private final String f19964a;

    /* renamed from: b */
    private final String f19965b;

    /* renamed from: c */
    private final boolean f19966c;

    C8164d(String str, String str2, Context context) {
        this.f19964a = str.replace("android.permission.", "");
        this.f19965b = str2;
        this.f19966c = C8571h.m26083a(str, context);
    }

    /* renamed from: a */
    public String mo56398a() {
        return this.f19964a;
    }

    /* renamed from: b */
    public String mo56399b() {
        return this.f19965b;
    }

    /* renamed from: c */
    public boolean mo56400c() {
        return this.f19966c;
    }
}
