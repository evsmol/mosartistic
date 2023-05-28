package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ua */
public class C3533ua {

    /* renamed from: com.yandex.metrica.impl.ob.ua$a */
    class C3534a implements C3293nm<C3437ra, C3392qa> {
        C3534a(C3533ua uaVar) {
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return ((C3437ra) obj).f9003a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$b */
    class C3535b implements C3293nm<C3437ra, C3392qa> {
        C3535b(C3533ua uaVar) {
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return ((C3437ra) obj).f9005c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$c */
    class C3536c implements C3613wa {
        C3536c(C3533ua uaVar) {
        }

        /* renamed from: a */
        public long mo17911a(C2764Z8 z8) {
            return z8.mo17106c(Long.MAX_VALUE);
        }

        /* renamed from: a */
        public void mo17912a(C2764Z8 z8, long j) {
            z8.mo17108e(j);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$d */
    class C3537d implements C3293nm<C3437ra, C3392qa> {
        C3537d(C3533ua uaVar) {
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return ((C3437ra) obj).f9004b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$e */
    class C3538e implements C3613wa {
        C3538e(C3533ua uaVar) {
        }

        /* renamed from: a */
        public long mo17911a(C2764Z8 z8) {
            return z8.mo17105b(Long.MAX_VALUE);
        }

        /* renamed from: a */
        public void mo17912a(C2764Z8 z8, long j) {
            z8.mo17107d(j);
        }
    }

    /* renamed from: a */
    public C3503ta<YandexMetricaConfig> mo18253a(Context context, C2444Q0 q0) {
        C2726Xl xl = new C2726Xl();
        return new C3503ta(context, q0, "activation", new C3256na(xl, new C3694ya()), new C3534a(this), new C3314oa(xl));
    }

    /* renamed from: b */
    public C3503ta<C3566v3> mo18254b(Context context, C2444Q0 q0) {
        return new C3503ta(context, q0, "clids_info", new C3346pa(), new C3537d(this), new C3538e(this));
    }

    /* renamed from: c */
    public C3503ta<C2600Ud> mo18255c(Context context, C2444Q0 q0) {
        return new C3503ta(context, q0, "preload_info", new C3649xa(), new C3535b(this), new C3536c(this));
    }
}
