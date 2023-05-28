package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.mg */
public final class C3230mg {

    /* renamed from: a */
    private final Lazy f8379a = LazyKt.lazy(new C3233c(this));

    /* renamed from: b */
    private final Lazy f8380b = LazyKt.lazy(new C3232b(this));

    /* renamed from: c */
    private final Lazy f8381c = LazyKt.lazy(new C3234d(this));

    /* renamed from: d */
    private final List<C2895dg> f8382d = new ArrayList();

    /* renamed from: e */
    private final C3480sg f8383e;

    /* renamed from: f */
    private final C3623wg f8384f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3002gg f8385g;

    /* renamed from: h */
    private final C3666xg f8386h;

    /* renamed from: com.yandex.metrica.impl.ob.mg$a */
    private interface C3231a {
        /* renamed from: a */
        void mo17863a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$b */
    static final class C3232b extends Lambda implements Function0<C3262ng> {

        /* renamed from: a */
        final /* synthetic */ C3230mg f8387a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3232b(C3230mg mgVar) {
            super(0);
            this.f8387a = mgVar;
        }

        public Object invoke() {
            return new C3262ng(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$c */
    static final class C3233c extends Lambda implements Function0<C3321og> {

        /* renamed from: a */
        final /* synthetic */ C3230mg f8388a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3233c(C3230mg mgVar) {
            super(0);
            this.f8388a = mgVar;
        }

        public Object invoke() {
            return new C3321og(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$d */
    static final class C3234d extends Lambda implements Function0<C3354pg> {

        /* renamed from: a */
        final /* synthetic */ C3230mg f8389a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3234d(C3230mg mgVar) {
            super(0);
            this.f8389a = mgVar;
        }

        public Object invoke() {
            return new C3354pg(this);
        }
    }

    public C3230mg(C3480sg sgVar, C3623wg wgVar, C3002gg ggVar, C3666xg xgVar) {
        this.f8383e = sgVar;
        this.f8384f = wgVar;
        this.f8385g = ggVar;
        this.f8386h = xgVar;
    }

    /* renamed from: b */
    public static final C3231a m10079b(C3230mg mgVar) {
        return (C3231a) mgVar.f8380b.getValue();
    }

    /* renamed from: c */
    public static final C3231a m10080c(C3230mg mgVar) {
        return (C3231a) mgVar.f8379a.getValue();
    }

    /* renamed from: a */
    public static final void m10078a(C3230mg mgVar, C2895dg dgVar, C3231a aVar) {
        mgVar.f8382d.add(dgVar);
        if (mgVar.f8386h.mo18406a(dgVar)) {
            mgVar.f8383e.mo18212a(dgVar);
        } else {
            aVar.mo17863a();
        }
    }

    /* renamed from: b */
    public final void mo17862b() {
        this.f8384f.mo18371a((C3590vg) this.f8381c.getValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10076a() {
        List<C2895dg> list = this.f8382d;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (this.f8386h.mo18407b((C2895dg) next)) {
                arrayList.add(next);
            }
        }
        this.f8383e.mo18212a(this.f8386h.mo18405a((List<C2895dg>) CollectionsKt.filterNotNull(arrayList)));
    }
}
