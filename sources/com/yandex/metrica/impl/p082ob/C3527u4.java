package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p082ob.C1941D3;

/* renamed from: com.yandex.metrica.impl.ob.u4 */
public class C3527u4 implements C3146l4, C3308o4<C2259L3> {
    /* renamed from: c */
    public C2259L3 mo17649a(Context context, C2108I3 i3, C1941D3.C1942a aVar, C3450ri riVar) {
        return new C2883d4(context, i3, aVar, C2007F0.m7154g().mo15758u(), riVar.mo18175d(), (C3592vi) new C3626wi(riVar));
    }

    /* renamed from: d */
    public C3720z4 mo17650b(Context context, C2108I3 i3, C1941D3.C1942a aVar, C3450ri riVar) {
        return new C3720z4(context, i3, aVar, riVar.mo18175d(), new C3626wi(riVar), CounterConfiguration.C10685b.MANUAL);
    }

    /* renamed from: a */
    public C3116k4 mo17798a(Context context, C3339p4 p4Var, C3049i4 i4Var, C1941D3 d3) {
        return new C3494t4(context, p4Var.mo17939b(new C2108I3(i4Var.mo17703b(), i4Var.mo17702a()), d3, new C2732Y3(this)));
    }
}
