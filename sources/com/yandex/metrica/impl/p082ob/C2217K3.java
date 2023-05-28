package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C3460s;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.K3 */
public class C2217K3 {

    /* renamed from: a */
    private final C2259L3 f5926a;

    /* renamed from: b */
    private final C2118Id f5927b;

    /* renamed from: c */
    private List<C2227j> f5928c;

    /* renamed from: com.yandex.metrica.impl.ob.K3$b */
    public static class C2219b {

        /* renamed from: a */
        private final C2259L3 f5929a;

        public C2219b(C2259L3 l3) {
            this.f5929a = l3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2217K3 mo16064a(C2118Id id) {
            return new C2217K3(this.f5929a, id);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$c */
    static class C2220c extends C2227j {

        /* renamed from: b */
        private final C2307Md f5930b;

        /* renamed from: c */
        private final C2861c9 f5931c;

        C2220c(C2259L3 l3) {
            super(l3);
            this.f5930b = new C2307Md(l3.mo16129g(), l3.mo16127e().toString());
            this.f5931c = l3.mo16128f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            C2914e6 e6Var = new C2914e6(this.f5931c, "background");
            if (!e6Var.mo17495h()) {
                long c = this.f5930b.mo16286c(-1);
                if (c != -1) {
                    e6Var.mo17489d(c);
                }
                long a = this.f5930b.mo16281a(Long.MIN_VALUE);
                if (a != Long.MIN_VALUE) {
                    e6Var.mo17482a(a);
                }
                long b = this.f5930b.mo16284b(0);
                if (b != 0) {
                    e6Var.mo17487c(b);
                }
                long d = this.f5930b.mo16287d(0);
                if (d != 0) {
                    e6Var.mo17491e(d);
                }
                e6Var.mo17486b();
            }
            C2914e6 e6Var2 = new C2914e6(this.f5931c, "foreground");
            if (!e6Var2.mo17495h()) {
                long g = this.f5930b.mo16291g(-1);
                if (-1 != g) {
                    e6Var2.mo17489d(g);
                }
                boolean booleanValue = this.f5930b.mo16283a(true).booleanValue();
                if (booleanValue) {
                    e6Var2.mo17483a(booleanValue);
                }
                long e = this.f5930b.mo16288e(Long.MIN_VALUE);
                if (e != Long.MIN_VALUE) {
                    e6Var2.mo17482a(e);
                }
                long f = this.f5930b.mo16289f(0);
                if (f != 0) {
                    e6Var2.mo17487c(f);
                }
                long h = this.f5930b.mo16293h(0);
                if (h != 0) {
                    e6Var2.mo17491e(h);
                }
                e6Var2.mo17486b();
            }
            C3460s.C3461a f2 = this.f5930b.mo16290f();
            if (f2 != null) {
                this.f5931c.mo17384a(f2);
            }
            String b2 = this.f5930b.mo16285b((String) null);
            if (!TextUtils.isEmpty(b2) && TextUtils.isEmpty(this.f5931c.mo17403n())) {
                this.f5931c.mo17398j(b2);
            }
            long i = this.f5930b.mo16295i(Long.MIN_VALUE);
            if (i != Long.MIN_VALUE && this.f5931c.mo17386b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f5931c.mo17387c(i);
            }
            this.f5930b.mo16294h();
            this.f5931c.mo17448d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return this.f5930b.mo16292g();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$d */
    static class C2221d extends C2228k {
        C2221d(C2259L3 l3, C2118Id id) {
            super(l3, id);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            mo16068d().mo15894a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return mo16067a() instanceof C2588U3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$e */
    static class C2222e extends C2227j {

        /* renamed from: b */
        private final C2186Jd f5932b;

        /* renamed from: c */
        private final C2798a9 f5933c;

        C2222e(C2259L3 l3, C2186Jd jd) {
            super(l3);
            this.f5932b = jd;
            this.f5933c = l3.mo16137o();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            if ("DONE".equals(this.f5932b.mo15996c((String) null))) {
                this.f5933c.mo17177j();
            }
            if ("DONE".equals(this.f5932b.mo15998d((String) null))) {
                this.f5933c.mo17178k();
            }
            this.f5932b.mo16001h();
            this.f5932b.mo16000g();
            this.f5932b.mo16002i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return "DONE".equals(this.f5932b.mo15996c((String) null)) || "DONE".equals(this.f5932b.mo15998d((String) null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$f */
    static class C2223f extends C2228k {
        C2223f(C2259L3 l3, C2118Id id) {
            super(l3, id);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            C2118Id d = mo16068d();
            if (mo16067a() instanceof C2588U3) {
                d.mo15896b();
            } else {
                d.mo15897c();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return mo16067a().mo16137o().mo17173g((String) null) == null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$g */
    static class C2224g extends C2227j {

        /* renamed from: b */
        private final C2917e9 f5934b;

        C2224g(C2259L3 l3, C2917e9 e9Var) {
            super(l3);
            this.f5934b = e9Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            if (this.f5934b.mo17440a(new C2484Rd("REFERRER_HANDLED", (String) null).mo16558a(), false)) {
                mo16067a().mo16128f().mo17406q();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$h */
    static class C2225h extends C2227j {
        @Deprecated

        /* renamed from: c */
        static final C2484Rd f5935c = new C2484Rd("SESSION_SLEEP_START", (String) null);
        @Deprecated

        /* renamed from: d */
        static final C2484Rd f5936d = new C2484Rd("SESSION_ID", (String) null);
        @Deprecated

        /* renamed from: e */
        static final C2484Rd f5937e = new C2484Rd("SESSION_COUNTER_ID", (String) null);
        @Deprecated

        /* renamed from: f */
        static final C2484Rd f5938f = new C2484Rd("SESSION_INIT_TIME", (String) null);
        @Deprecated

        /* renamed from: g */
        static final C2484Rd f5939g = new C2484Rd("SESSION_IS_ALIVE_REPORT_NEEDED", (String) null);
        @Deprecated

        /* renamed from: h */
        static final C2484Rd f5940h = new C2484Rd("BG_SESSION_ID", (String) null);
        @Deprecated

        /* renamed from: i */
        static final C2484Rd f5941i = new C2484Rd("BG_SESSION_SLEEP_START", (String) null);
        @Deprecated

        /* renamed from: j */
        static final C2484Rd f5942j = new C2484Rd("BG_SESSION_COUNTER_ID", (String) null);
        @Deprecated

        /* renamed from: k */
        static final C2484Rd f5943k = new C2484Rd("BG_SESSION_INIT_TIME", (String) null);
        @Deprecated

        /* renamed from: l */
        static final C2484Rd f5944l = new C2484Rd("BG_SESSION_IS_ALIVE_REPORT_NEEDED", (String) null);

        /* renamed from: b */
        private final C2861c9 f5945b;

        C2225h(C2259L3 l3) {
            super(l3);
            this.f5945b = l3.mo16128f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            C2861c9 c9Var = this.f5945b;
            C2484Rd rd = f5941i;
            long a = c9Var.mo17437a(rd.mo16558a(), -2147483648L);
            if (a != -2147483648L) {
                C2914e6 e6Var = new C2914e6(this.f5945b, "background");
                if (!e6Var.mo17495h()) {
                    if (a != 0) {
                        e6Var.mo17491e(a);
                    }
                    long a2 = this.f5945b.mo17437a(f5940h.mo16558a(), -1);
                    if (a2 != -1) {
                        e6Var.mo17489d(a2);
                    }
                    boolean a3 = this.f5945b.mo17440a(f5944l.mo16558a(), true);
                    if (a3) {
                        e6Var.mo17483a(a3);
                    }
                    long a4 = this.f5945b.mo17437a(f5943k.mo16558a(), Long.MIN_VALUE);
                    if (a4 != Long.MIN_VALUE) {
                        e6Var.mo17482a(a4);
                    }
                    long a5 = this.f5945b.mo17437a(f5942j.mo16558a(), 0);
                    if (a5 != 0) {
                        e6Var.mo17487c(a5);
                    }
                    e6Var.mo17486b();
                }
            }
            C2861c9 c9Var2 = this.f5945b;
            C2484Rd rd2 = f5935c;
            long a6 = c9Var2.mo17437a(rd2.mo16558a(), -2147483648L);
            if (a6 != -2147483648L) {
                C2914e6 e6Var2 = new C2914e6(this.f5945b, "foreground");
                if (!e6Var2.mo17495h()) {
                    if (a6 != 0) {
                        e6Var2.mo17491e(a6);
                    }
                    long a7 = this.f5945b.mo17437a(f5936d.mo16558a(), -1);
                    if (-1 != a7) {
                        e6Var2.mo17489d(a7);
                    }
                    boolean a8 = this.f5945b.mo17440a(f5939g.mo16558a(), true);
                    if (a8) {
                        e6Var2.mo17483a(a8);
                    }
                    long a9 = this.f5945b.mo17437a(f5938f.mo16558a(), Long.MIN_VALUE);
                    if (a9 != Long.MIN_VALUE) {
                        e6Var2.mo17482a(a9);
                    }
                    long a10 = this.f5945b.mo17437a(f5937e.mo16558a(), 0);
                    if (a10 != 0) {
                        e6Var2.mo17487c(a10);
                    }
                    e6Var2.mo17486b();
                }
            }
            this.f5945b.mo17451f(rd2.mo16558a());
            this.f5945b.mo17451f(f5936d.mo16558a());
            this.f5945b.mo17451f(f5937e.mo16558a());
            this.f5945b.mo17451f(f5938f.mo16558a());
            this.f5945b.mo17451f(f5939g.mo16558a());
            this.f5945b.mo17451f(f5940h.mo16558a());
            this.f5945b.mo17451f(rd.mo16558a());
            this.f5945b.mo17451f(f5942j.mo16558a());
            this.f5945b.mo17451f(f5943k.mo16558a());
            this.f5945b.mo17451f(f5944l.mo16558a());
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$i */
    static class C2226i extends C2227j {

        /* renamed from: b */
        private final C2798a9 f5946b;

        /* renamed from: c */
        private final C2861c9 f5947c;

        /* renamed from: d */
        private final C2827b8 f5948d;

        /* renamed from: e */
        private final String f5949e = new C2484Rd("LAST_REQUEST_ID").mo16558a();

        /* renamed from: f */
        private final String f5950f = new C2484Rd("NEXT_EVENT_GLOBAL_NUMBER").mo16558a();

        /* renamed from: g */
        private final String f5951g = new C2484Rd("CURRENT_SESSION_ID").mo16558a();

        /* renamed from: h */
        private final String f5952h = new C2484Rd("ATTRIBUTION_ID").mo16558a();

        /* renamed from: i */
        private final String f5953i = new C2484Rd("OPEN_ID").mo16558a();

        C2226i(C2259L3 l3) {
            super(l3);
            this.f5946b = l3.mo16137o();
            this.f5947c = l3.mo16128f();
            this.f5948d = l3.mo16145x();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            JSONObject jSONObject = new JSONObject();
            for (String next : this.f5947c.mo17450e()) {
                if (next.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(next.substring(21))), this.f5947c.mo17436a(next, 0));
                        this.f5947c.mo17451f(next);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f5948d.mo17222a(this.f5946b.mo17172f(), this.f5946b.mo17174g(), this.f5947c.mo17446c(this.f5949e) ? Integer.valueOf(this.f5947c.mo17436a(this.f5949e, -1)) : null, this.f5947c.mo17446c(this.f5950f) ? Integer.valueOf(this.f5947c.mo17436a(this.f5950f, 0)) : null, this.f5947c.mo17446c(this.f5951g) ? Long.valueOf(this.f5947c.mo17437a(this.f5951g, -1)) : null, this.f5947c.mo17409t(), jSONObject, this.f5947c.mo17446c(this.f5953i) ? Integer.valueOf(this.f5947c.mo17436a(this.f5953i, 1)) : null, this.f5947c.mo17446c(this.f5952h) ? Integer.valueOf(this.f5947c.mo17436a(this.f5952h, 1)) : null, this.f5947c.mo17399j());
            this.f5946b.mo17175h().mo17176i().mo17448d();
            this.f5947c.mo17408s().mo17407r().mo17451f(this.f5949e).mo17451f(this.f5950f).mo17451f(this.f5951g).mo17451f(this.f5952h).mo17451f(this.f5953i).mo17448d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$j */
    static abstract class C2227j {

        /* renamed from: a */
        private final C2259L3 f5954a;

        C2227j(C2259L3 l3) {
            this.f5954a = l3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2259L3 mo16067a() {
            return this.f5954a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo16065b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract boolean mo16066c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$k */
    private static abstract class C2228k extends C2227j {

        /* renamed from: b */
        private C2118Id f5955b;

        C2228k(C2259L3 l3, C2118Id id) {
            super(l3);
            this.f5955b = id;
        }

        /* renamed from: d */
        public C2118Id mo16068d() {
            return this.f5955b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K3$l */
    static class C2229l extends C2227j {

        /* renamed from: b */
        private final C2798a9 f5956b;

        C2229l(C2259L3 l3) {
            super(l3);
            this.f5956b = l3.mo16137o();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16065b() {
            this.f5956b.mo17451f(new C2484Rd("first_event_description_key", (String) null).mo16558a()).mo17448d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo16066c() {
            return true;
        }
    }

    /* renamed from: b */
    private void m7603b() {
        LinkedList linkedList = new LinkedList();
        this.f5928c = linkedList;
        linkedList.add(new C2221d(this.f5926a, this.f5927b));
        this.f5928c.add(new C2223f(this.f5926a, this.f5927b));
        List<C2227j> list = this.f5928c;
        C2259L3 l3 = this.f5926a;
        list.add(new C2222e(l3, l3.mo16136n()));
        this.f5928c.add(new C2220c(this.f5926a));
        this.f5928c.add(new C2225h(this.f5926a));
        List<C2227j> list2 = this.f5928c;
        C2259L3 l32 = this.f5926a;
        list2.add(new C2224g(l32, l32.mo16141t()));
        this.f5928c.add(new C2229l(this.f5926a));
        this.f5928c.add(new C2226i(this.f5926a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16063a() {
        if (!C2118Id.f5556b.values().contains(this.f5926a.mo16127e().mo15878a())) {
            for (C2227j next : this.f5928c) {
                if (next.mo16066c()) {
                    next.mo16065b();
                }
            }
        }
    }

    private C2217K3(C2259L3 l3, C2118Id id) {
        this.f5926a = l3;
        this.f5927b = id;
        m7603b();
    }
}
