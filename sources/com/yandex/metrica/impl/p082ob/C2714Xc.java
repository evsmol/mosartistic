package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Xc */
public class C2714Xc implements C2170J0 {

    /* renamed from: a */
    private final C2917e9 f7173a;

    /* renamed from: b */
    private final C3641x2 f7174b;

    /* renamed from: c */
    private C2713Xb f7175c;

    /* renamed from: d */
    private final C2081H2 f7176d;

    /* renamed from: e */
    private final TimeProvider f7177e;

    /* renamed from: f */
    private final C2715a f7178f;

    /* renamed from: g */
    private final C2686Wc f7179g;

    /* renamed from: com.yandex.metrica.impl.ob.Xc$a */
    static class C2715a {
        C2715a() {
        }
    }

    public C2714Xc(Context context, C2713Xb xb) {
        this(xb, C2081H2.m7295a(context));
    }

    /* renamed from: a */
    public void mo17036a(C2713Xb xb) {
        if (!C1848A2.m6810a((Object) this.f7175c, (Object) xb)) {
            this.f7175c = xb;
            if (xb != null && xb.f7171a.f6525a) {
                this.f7179g.mo16934a(this.f7176d.mo15848b());
            }
        }
    }

    /* renamed from: b */
    public void mo17037b() {
        C2713Xb xb = this.f7175c;
        if (xb != null && xb.f7172b != null && this.f7174b.mo18390b(this.f7173a.mo17521f(0), this.f7175c.f7172b.f7086b, "last wifi scan attempt time")) {
            this.f7178f.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (this.f7176d.mo15847a(countDownLatch, this.f7179g)) {
                this.f7173a.mo17531k(this.f7177e.currentTimeSeconds());
                try {
                    countDownLatch.await(5, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private C2714Xc(C2713Xb xb, C2081H2 h2) {
        this(h2, C2007F0.m7154g().mo15756s(), new C3641x2(), new SystemTimeProvider(), new C2715a(), xb, new C2686Wc((C2644V<List<C2010F2>>) null, h2.mo15844a()));
    }

    /* renamed from: a */
    public void mo15554a() {
        C2713Xb xb = this.f7175c;
        if (xb != null && xb.f7171a.f6525a) {
            this.f7179g.mo16934a(this.f7176d.mo15848b());
        }
    }

    C2714Xc(C2081H2 h2, C2917e9 e9Var, C3641x2 x2Var, TimeProvider timeProvider, C2715a aVar, C2713Xb xb, C2686Wc wc) {
        this.f7176d = h2;
        this.f7173a = e9Var;
        this.f7174b = x2Var;
        this.f7178f = aVar;
        this.f7175c = xb;
        this.f7177e = timeProvider;
        this.f7179g = wc;
    }
}
