package com.appnext.base.services.p266b;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.services.p265a.C8869a;
import com.appnext.base.services.p265a.C8870b;
import com.appnext.base.services.p265a.C8871c;
import java.util.List;

/* renamed from: com.appnext.base.services.b.a */
public class C8873a {

    /* renamed from: eM */
    private static volatile C8873a f22486eM;

    /* renamed from: eN */
    private C8871c f22487eN;

    public C8873a(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f22487eN = new C8870b(context);
            } else {
                this.f22487eN = new C8869a(context);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static C8873a m26797d(Context context) {
        if (f22486eM == null) {
            synchronized (C8873a.class) {
                if (f22486eM == null) {
                    f22486eM = new C8873a(context);
                }
            }
        }
        return f22486eM;
    }

    /* renamed from: a */
    public final void mo58814a(C8838c cVar, boolean z) {
        this.f22487eN.mo58810a(cVar, z, (Bundle) null);
    }

    /* renamed from: c */
    public final void mo58815c(C8838c cVar) {
        this.f22487eN.mo58811c(cVar);
    }

    /* renamed from: h */
    public final void mo58816h(List<C8838c> list) {
        this.f22487eN.mo58812h(list);
    }
}
