package com.ironsource.mediationsdk.utils;

import java.util.Date;

/* renamed from: com.ironsource.mediationsdk.utils.f */
public final class C4718f {

    /* renamed from: a */
    private long f11800a = new Date().getTime();

    /* renamed from: a */
    public static long m13801a(C4718f fVar) {
        if (fVar == null) {
            return 0;
        }
        return new Date().getTime() - fVar.f11800a;
    }
}
