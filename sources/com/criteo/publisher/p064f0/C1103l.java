package com.criteo.publisher.p064f0;

import com.criteo.publisher.C1146i;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1270q;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.p061c0.C1058a;
import com.criteo.publisher.p064f0.C1103l;
import com.criteo.publisher.p064f0.C1112n;
import com.criteo.publisher.p064f0.C1118r;
import com.criteo.publisher.p070l0.C1170a;
import java.io.InterruptedIOException;
import java.util.concurrent.Executor;

/* renamed from: com.criteo.publisher.f0.l */
/* compiled from: CsmBidLifecycleListener */
public class C1103l implements C1058a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1118r f3574a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1128x f3575b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1146i f3576c;

    /* renamed from: d */
    private final C1276t f3577d;

    /* renamed from: e */
    private final C1170a f3578e;

    /* renamed from: f */
    private final Executor f3579f;

    public C1103l(C1118r rVar, C1128x xVar, C1146i iVar, C1276t tVar, C1170a aVar, Executor executor) {
        this.f3574a = rVar;
        this.f3575b = xVar;
        this.f3576c = iVar;
        this.f3577d = tVar;
        this.f3578e = aVar;
        this.f3579f = executor;
    }

    /* renamed from: a */
    public void mo3071a() {
        if (!m5114b()) {
            this.f3579f.execute(new C1104a());
        }
    }

    /* renamed from: com.criteo.publisher.f0.l$a */
    /* compiled from: CsmBidLifecycleListener */
    class C1104a extends C1330x {
        C1104a() {
        }

        /* renamed from: a */
        public void mo3040a() {
            C1103l.this.f3575b.mo3222a(C1103l.this.f3574a);
        }
    }

    /* renamed from: a */
    public void mo3073a(C1268o oVar) {
        if (!m5114b()) {
            this.f3579f.execute(new C1105b(oVar));
        }
    }

    /* renamed from: com.criteo.publisher.f0.l$b */
    /* compiled from: CsmBidLifecycleListener */
    class C1105b extends C1330x {

        /* renamed from: c */
        final /* synthetic */ C1268o f3581c;

        C1105b(C1268o oVar) {
            this.f3581c = oVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            long a = C1103l.this.f3576c.mo3242a();
            C1103l lVar = C1103l.this;
            C1268o oVar = this.f3581c;
            lVar.m5109a(oVar, (C1118r.C1119a) new C1118r.C1119a(a) {
                public final /* synthetic */ long f$1;

                {
                    this.f$1 = r2;
                }

                /* renamed from: a */
                public final void mo3130a(C1112n.C1113a aVar) {
                    C1103l.C1105b.m5124a(C1268o.this, this.f$1, aVar);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m5124a(C1268o oVar, long j, C1112n.C1113a aVar) {
            aVar.mo3152b(oVar.mo3394b());
            aVar.mo3151b(Long.valueOf(j));
            aVar.mo3145a(Integer.valueOf(oVar.mo3395c()));
        }
    }

    /* renamed from: a */
    public void mo3074a(C1268o oVar, C1271r rVar) {
        if (!m5114b()) {
            this.f3579f.execute(new C1106c(oVar, rVar));
        }
    }

    /* renamed from: com.criteo.publisher.f0.l$c */
    /* compiled from: CsmBidLifecycleListener */
    class C1106c extends C1330x {

        /* renamed from: c */
        final /* synthetic */ C1268o f3583c;

        /* renamed from: d */
        final /* synthetic */ C1271r f3584d;

        C1106c(C1268o oVar, C1271r rVar) {
            this.f3583c = oVar;
            this.f3584d = rVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            long a = C1103l.this.f3576c.mo3242a();
            for (C1270q a2 : this.f3583c.mo3399f()) {
                String a3 = a2.mo3412a();
                C1272s a4 = this.f3584d.mo3561a(a3);
                boolean z = a4 == null;
                boolean z2 = a4 != null && !a4.mo3585o();
                C1103l.this.f3574a.mo3207a(a3, (C1118r.C1119a) new C1118r.C1119a(z, a, z2, a4) {
                    public final /* synthetic */ boolean f$0;
                    public final /* synthetic */ long f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ C1272s f$3;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r4;
                        this.f$3 = r5;
                    }

                    /* renamed from: a */
                    public final void mo3130a(C1112n.C1113a aVar) {
                        C1103l.C1106c.m5126a(this.f$0, this.f$1, this.f$2, this.f$3, aVar);
                    }
                });
                if (z || z2) {
                    C1103l.this.f3575b.mo3223a(C1103l.this.f3574a, a3);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m5126a(boolean z, long j, boolean z2, C1272s sVar, C1112n.C1113a aVar) {
            if (z) {
                aVar.mo3146a(Long.valueOf(j));
                aVar.mo3155c(true);
            } else if (z2) {
                aVar.mo3155c(true);
            } else {
                aVar.mo3146a(Long.valueOf(j));
                aVar.mo3150b(sVar.mo3582l());
            }
        }
    }

    /* renamed from: a */
    public void mo3075a(C1268o oVar, Exception exc) {
        if (!m5114b()) {
            this.f3579f.execute(new C1107d(exc, oVar));
        }
    }

    /* renamed from: com.criteo.publisher.f0.l$d */
    /* compiled from: CsmBidLifecycleListener */
    class C1107d extends C1330x {

        /* renamed from: c */
        final /* synthetic */ Exception f3586c;

        /* renamed from: d */
        final /* synthetic */ C1268o f3587d;

        C1107d(Exception exc, C1268o oVar) {
            this.f3586c = exc;
            this.f3587d = oVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            if (this.f3586c instanceof InterruptedIOException) {
                C1103l.this.m5116c(this.f3587d);
            } else {
                C1103l.this.m5113b(this.f3587d);
            }
            for (C1270q a : this.f3587d.mo3399f()) {
                C1103l.this.f3575b.mo3223a(C1103l.this.f3574a, a.mo3412a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5113b(C1268o oVar) {
        m5109a(oVar, (C1118r.C1119a) $$Lambda$l$nQdlprxLcb16GX8Ipp8ilMgY.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5116c(C1268o oVar) {
        m5109a(oVar, (C1118r.C1119a) $$Lambda$l$njMW6tLZ_RGqdkLKJ76alC27Gw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m5112b(C1112n.C1113a aVar) {
        aVar.mo3153b(true);
        aVar.mo3155c(true);
    }

    /* renamed from: a */
    public void mo3072a(C1267n nVar, C1272s sVar) {
        if (!m5114b()) {
            this.f3579f.execute(new C1108e(sVar));
        }
    }

    /* renamed from: com.criteo.publisher.f0.l$e */
    /* compiled from: CsmBidLifecycleListener */
    class C1108e extends C1330x {

        /* renamed from: c */
        final /* synthetic */ C1272s f3589c;

        C1108e(C1272s sVar) {
            this.f3589c = sVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            String f = this.f3589c.mo3575f();
            if (f != null) {
                C1103l.this.f3574a.mo3207a(f, (C1118r.C1119a) new C1118r.C1119a(!this.f3589c.mo3569a(C1103l.this.f3576c), C1103l.this.f3576c.mo3242a()) {
                    public final /* synthetic */ boolean f$0;
                    public final /* synthetic */ long f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    /* renamed from: a */
                    public final void mo3130a(C1112n.C1113a aVar) {
                        C1103l.C1108e.m5129a(this.f$0, this.f$1, aVar);
                    }
                });
                C1103l.this.f3575b.mo3223a(C1103l.this.f3574a, f);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m5129a(boolean z, long j, C1112n.C1113a aVar) {
            if (z) {
                aVar.mo3154c(Long.valueOf(j));
            }
            aVar.mo3155c(true);
        }
    }

    /* renamed from: a */
    public void mo3076a(C1272s sVar) {
        if (!m5114b()) {
            this.f3579f.execute(new C1109f(sVar));
        }
    }

    /* renamed from: com.criteo.publisher.f0.l$f */
    /* compiled from: CsmBidLifecycleListener */
    class C1109f extends C1330x {

        /* renamed from: c */
        final /* synthetic */ C1272s f3591c;

        C1109f(C1272s sVar) {
            this.f3591c = sVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            String f = this.f3591c.mo3575f();
            if (f != null && this.f3591c.mo3585o()) {
                C1103l.this.f3574a.mo3207a(f, (C1118r.C1119a) $$Lambda$l$f$gQAJyVH5SqLWjF0HwAyc0LByDjw.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5109a(C1268o oVar, C1118r.C1119a aVar) {
        for (C1270q a : oVar.mo3399f()) {
            this.f3574a.mo3207a(a.mo3412a(), aVar);
        }
    }

    /* renamed from: b */
    private boolean m5114b() {
        return !this.f3577d.mo3598g() || !this.f3578e.mo3277b();
    }
}
