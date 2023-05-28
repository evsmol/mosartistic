package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.metrica.impl.ob.Jg */
public final class C2197Jg {

    /* renamed from: a */
    private final List<String> f5888a;

    /* renamed from: b */
    private final C3492t2 f5889b;

    public C2197Jg(C3492t2 t2Var) {
        this.f5889b = t2Var;
        this.f5888a = m7554a(new String[]{"https://startup.mobile.yandex.net/", "", "", ""});
    }

    /* renamed from: a */
    public final Collection<String> mo16029a() {
        String[] strArr = (String[]) this.f5889b.mo16943a();
        if (strArr != null) {
            List<String> a = m7554a(strArr);
            if (!(!a.isEmpty())) {
                a = null;
            }
            if (a != null) {
                return a;
            }
        }
        return this.f5888a;
    }

    /* renamed from: a */
    private final List<String> m7554a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !(!StringsKt.isBlank(str))) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2197Jg() {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.t2 r0 = new com.yandex.metrica.impl.ob.t2
            com.yandex.metrica.impl.ob.F0 r1 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            java.lang.String r2 = "GlobalServiceLocator.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.content.Context r1 = r1.mo15743e()
            java.lang.String r2 = "GlobalServiceLocator.getInstance().context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "appmetrica_startup_hosts"
            r0.<init>(r1, r2)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2197Jg.<init>():void");
    }
}
