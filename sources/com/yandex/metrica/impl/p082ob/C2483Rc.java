package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C3316oc;

/* renamed from: com.yandex.metrica.impl.ob.Rc */
class C2483Rc extends C2644V<Location> {

    /* renamed from: b */
    private C2594U7 f6565b;

    /* renamed from: c */
    private C2659Vb f6566c;

    /* renamed from: d */
    private SystemTimeProvider f6567d;

    /* renamed from: e */
    private final C1967E f6568e;

    /* renamed from: f */
    private final C3598w f6569f;

    C2483Rc(C2644V<Location> v, C2594U7 u7, C2659Vb vb, SystemTimeProvider systemTimeProvider, C1967E e, C3598w wVar) {
        super(v);
        this.f6565b = u7;
        this.f6566c = vb;
        this.f6567d = systemTimeProvider;
        this.f6568e = e;
        this.f6569f = wVar;
    }

    /* renamed from: b */
    public void mo16557b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            C2091Hc hc = new C2091Hc(C3316oc.C3317a.m10241a(this.f6569f.mo18348c()), this.f6567d.currentTimeMillis(), this.f6567d.elapsedRealtime(), location, this.f6568e.mo15642b(), (Long) null);
            String a = this.f6566c.mo16971a(hc);
            if (!TextUtils.isEmpty(a)) {
                this.f6565b.mo15983a(hc.mo15860e(), a);
            }
        }
    }
}
