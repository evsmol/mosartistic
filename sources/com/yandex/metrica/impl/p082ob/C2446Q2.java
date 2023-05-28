package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Q2 */
public class C2446Q2 {

    /* renamed from: a */
    private final C3042hm f6511a;

    /* renamed from: b */
    private Boolean f6512b;

    /* renamed from: c */
    private C2502S0 f6513c;

    /* renamed from: d */
    private C2540T0 f6514d;

    public C2446Q2() {
        this(new C3042hm());
    }

    /* renamed from: a */
    public synchronized C2502S0 mo16508a(Context context, C2166Im im) {
        if (this.f6513c == null) {
            if (m8182a(context)) {
                this.f6513c = new C3290nj(im.mo15961b(), im.mo15961b().getHandler(), im.mo15960a(), new C2443Q());
            } else {
                this.f6513c = new C2415P2(context, im);
            }
        }
        return this.f6513c;
    }

    C2446Q2(C3042hm hmVar) {
        this.f6511a = hmVar;
    }

    /* renamed from: a */
    public synchronized C2540T0 mo16509a(Context context, C2502S0 s0) {
        if (this.f6514d == null) {
            if (m8182a(context)) {
                this.f6514d = new C3324oj();
            } else {
                this.f6514d = new C2548T2(context, s0);
            }
        }
        return this.f6514d;
    }

    /* renamed from: a */
    private synchronized boolean m8182a(Context context) {
        if (this.f6512b == null) {
            this.f6512b = Boolean.valueOf(!this.f6511a.mo17689a(context));
        }
        return this.f6512b.booleanValue();
    }
}
