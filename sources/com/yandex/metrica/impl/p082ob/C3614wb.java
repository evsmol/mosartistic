package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.appodeal.advertising.AdvertisingInfo;

/* renamed from: com.yandex.metrica.impl.ob.wb */
public class C3614wb implements C3579vb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3579vb f9381a;

    /* renamed from: com.yandex.metrica.impl.ob.wb$a */
    class C3615a implements C3422qm<C3539ub> {

        /* renamed from: a */
        final /* synthetic */ Context f9382a;

        C3615a(Context context) {
            this.f9382a = context;
        }

        /* renamed from: b */
        public C3539ub mo16401a() {
            return C3614wb.this.f9381a.mo16075a(this.f9382a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wb$b */
    class C3616b implements C3422qm<C3539ub> {

        /* renamed from: a */
        final /* synthetic */ Context f9384a;

        /* renamed from: b */
        final /* synthetic */ C2057Gb f9385b;

        C3616b(Context context, C2057Gb gb) {
            this.f9384a = context;
            this.f9385b = gb;
        }

        /* renamed from: a */
        public Object mo16401a() {
            return C3614wb.this.f9381a.mo16076a(this.f9384a, this.f9385b);
        }
    }

    public C3614wb(C3579vb vbVar) {
        this.f9381a = vbVar;
    }

    /* renamed from: a */
    public C3539ub mo16075a(Context context) {
        return m10945a((C3422qm<C3539ub>) new C3615a(context));
    }

    /* renamed from: a */
    public C3539ub mo16076a(Context context, C2057Gb gb) {
        return m10945a((C3422qm<C3539ub>) new C3616b(context, gb));
    }

    /* renamed from: a */
    private C3539ub m10945a(C3422qm<C3539ub> qmVar) {
        C3539ub a = qmVar.mo16401a();
        C3504tb tbVar = a.f9198a;
        return (tbVar == null || !AdvertisingInfo.defaultAdvertisingId.equals(tbVar.f9142b)) ? a : new C3539ub((C3504tb) null, C2577U0.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
