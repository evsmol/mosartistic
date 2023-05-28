package p084e;

import java.util.ArrayList;
import java.util.List;
import p084e.C3789a;
import p085f.C3796b;
import p085f.C3797c;
import p085f.C3799e;
import p086g.C3800a;
import p150io.bidmachine.analytics.AnalyticsConfig;
import p150io.bidmachine.analytics.entity.Event;
import p158a.C5785a;
import p163b.C6148a;

/* renamed from: e.a */
public class C3789a {

    /* renamed from: a */
    public final AnalyticsConfig f9759a;

    /* renamed from: b */
    public final C3800a f9760b;

    /* renamed from: c */
    public final C3791b f9761c;

    /* renamed from: d */
    public final Runnable f9762d = new Runnable() {
        public final void run() {
            C3789a.this.m11172a();
        }
    };

    /* renamed from: e.a$b */
    public static final class C3791b implements C3796b<C3799e>, C3797c<C3799e> {

        /* renamed from: a */
        public final C3800a f9763a;

        private C3791b(C3800a aVar) {
            this.f9763a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m11182a(C3799e eVar) {
            try {
                this.f9763a.mo18699c(eVar.mo18693h());
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11183b(C3799e eVar) {
            try {
                this.f9763a.mo18696a(eVar.mo18693h());
            } catch (Throwable unused) {
            }
        }

        /* renamed from: c */
        public void mo18674b(C3799e eVar) {
            C5785a.m14757b(new Runnable(eVar) {
                public final /* synthetic */ C3799e f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C3789a.C3791b.this.m11182a(this.f$1);
                }
            });
        }

        /* renamed from: d */
        public void mo18673a(C3799e eVar) {
            C5785a.m14757b(new Runnable(eVar) {
                public final /* synthetic */ C3799e f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C3789a.C3791b.this.m11183b(this.f$1);
                }
            });
        }
    }

    public C3789a(AnalyticsConfig analyticsConfig, C3800a aVar) {
        this.f9759a = analyticsConfig;
        this.f9760b = aVar;
        this.f9761c = new C3791b(aVar);
        C5785a.m14757b(new Runnable() {
            public final void run() {
                C3789a.this.mo18671c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11172a() {
        mo18665a(0);
    }

    /* renamed from: a */
    public final void mo18665a(int i) {
        try {
            List<C6148a> a = this.f9760b.mo18695a(this.f9759a.getEventBatchMaxSize());
            int size = a.size();
            if (size <= 0 || size < i) {
                mo18668b();
            } else {
                mo18667a(a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo18666a(C6148a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        mo18667a((List<C6148a>) arrayList);
    }

    /* renamed from: a */
    public final void mo18667a(List<C6148a> list) {
        for (List next : C5785a.m14749a(list, this.f9759a.getEventBatchMaxSize())) {
            this.f9760b.mo18698b(next);
            ((C3799e) ((C3799e) new C3799e(this.f9759a.getRequestUrl(), next).mo18678a(this.f9761c)).mo18677a(this.f9761c)).mo18688f();
        }
        mo18668b();
    }

    /* renamed from: b */
    public final void mo18668b() {
        C5785a.m14758b(this.f9762d, this.f9759a.getIntervalMs());
    }

    /* renamed from: b */
    public void mo18669b(Event event) {
        C5785a.m14757b(new Runnable(event) {
            public final /* synthetic */ Event f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C3789a.this.m11173a(this.f$1);
            }
        });
    }

    /* renamed from: b */
    public final boolean mo18670b(C6148a aVar) {
        return this.f9760b.mo18697a(aVar);
    }

    /* renamed from: c */
    public final void mo18671c() {
        try {
            mo18667a(this.f9760b.mo18694a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final synchronized void m11173a(Event event) {
        try {
            C6148a aVar = new C6148a(this.f9759a.getContext(), event);
            if (mo18670b(aVar)) {
                mo18665a(this.f9759a.getEventBatchSize());
            } else {
                mo18666a(aVar);
            }
        } catch (Throwable unused) {
        }
    }
}
