package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.C4407h;

/* renamed from: com.ironsource.sdk.utils.a */
public final class C4983a {

    /* renamed from: g */
    private static C4983a f12746g;

    /* renamed from: a */
    public String f12747a = C4407h.m12559h();

    /* renamed from: b */
    public String f12748b = C4407h.m12557g();

    /* renamed from: c */
    public String f12749c = C4407h.m12561i();

    /* renamed from: d */
    public String f12750d = C4407h.m12553e();

    /* renamed from: e */
    public int f12751e = C4407h.m12555f();

    /* renamed from: f */
    public String f12752f;

    private C4983a(Context context) {
        this.f12752f = C4407h.m12562i(context);
    }

    /* renamed from: a */
    public static C4983a m14513a(Context context) {
        if (f12746g == null) {
            f12746g = new C4983a(context);
        }
        return f12746g;
    }

    /* renamed from: a */
    public static void m14514a() {
        f12746g = null;
    }

    /* renamed from: b */
    public static float m14515b(Context context) {
        return C4407h.m12567l(context);
    }
}
