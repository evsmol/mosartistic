package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.e8 */
public final class C2916e8 {

    /* renamed from: a */
    private final Map<String, C2827b8> f7710a = new LinkedHashMap();

    /* renamed from: b */
    private final C1877B0 f7711b;

    /* renamed from: c */
    private final C2451Q7 f7712c;

    /* renamed from: d */
    private final C2796a8 f7713d;

    /* renamed from: e */
    private final C2796a8 f7714e;

    /* renamed from: f */
    private final Context f7715f;

    public C2916e8(Context context) {
        this.f7715f = context;
        C1877B0 b0 = new C1877B0();
        this.f7711b = b0;
        C2451Q7 q7 = new C2451Q7(context, "appmetrica_vital.dat", b0);
        this.f7712c = q7;
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        C2917e9 s = g.mo15756s();
        Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…ance().servicePreferences");
        this.f7713d = new C2796a8(s, q7);
        C3093ja a = C3093ja.m9805a(context);
        Intrinsics.checkNotNullExpressionValue(a, "DatabaseStorageFactory.getInstance(context)");
        this.f7714e = new C2796a8(new C2917e9(a.mo17748j()), q7);
    }

    /* renamed from: a */
    public final C2796a8 mo17499a() {
        return this.f7713d;
    }

    /* renamed from: b */
    public final C2796a8 mo17501b() {
        return this.f7714e;
    }

    /* renamed from: a */
    public final synchronized C2827b8 mo17500a(C2108I3 i3) {
        C2827b8 b8Var;
        String valueOf = String.valueOf(i3.mo15878a());
        Map<String, C2827b8> map = this.f7710a;
        b8Var = map.get(valueOf);
        if (b8Var == null) {
            C2861c9 c9Var = new C2861c9(C3093ja.m9805a(this.f7715f).mo17739b(i3));
            Context context = this.f7715f;
            String a = i3.mo15878a();
            b8Var = new C2827b8(c9Var, new C2451Q7(context, "appmetrica_vital_" + a + ".dat", this.f7711b), valueOf);
            map.put(valueOf, b8Var);
        }
        return b8Var;
    }
}
