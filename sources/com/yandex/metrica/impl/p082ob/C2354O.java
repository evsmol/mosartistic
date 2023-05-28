package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.p082ob.C1937D1;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.O */
public class C2354O extends C1937D1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2830b9 f6289a;

    /* renamed from: com.yandex.metrica.impl.ob.O$a */
    class C2355a extends SparseArray<C1937D1.C1938a> {
        C2355a() {
            put(47, new C2357c(C2354O.this.f6289a));
            put(66, new C2358d(C2354O.this, C2354O.this.f6289a));
            put(89, new C2356b(C2354O.this.f6289a));
            put(99, new C2359e(C2354O.this.f6289a));
            put(105, new C2360f(C2354O.this.f6289a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O$d */
    private class C2358d implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2830b9 f6293a;

        public C2358d(C2354O o, C2830b9 b9Var) {
            this.f6293a = b9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f6293a.mo17451f(new C2484Rd("COOKIE_BROWSERS", (String) null).mo16558a());
            this.f6293a.mo17451f(new C2484Rd("BIND_ID_URL", (String) null).mo16558a());
            C2254L0.m7688a(context, "b_meta.dat");
            C2254L0.m7688a(context, "browsers.dat");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O$e */
    static class C2359e implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2830b9 f6294a;

        C2359e(C2830b9 b9Var) {
            this.f6294a = b9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f6294a.mo17451f(new C2484Rd("DEVICE_ID_POSSIBLE", (String) null).mo16558a()).mo17448d();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O$f */
    static class C2360f implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2830b9 f6295a;

        C2360f(C2830b9 b9Var) {
            this.f6295a = b9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f6295a.mo17451f(new C2484Rd("STARTUP_REQUEST_TIME", (String) null).mo16558a()).mo17448d();
        }
    }

    public C2354O(Context context) {
        this(new C2830b9(C3093ja.m9805a(context).mo17742d()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SparseArray<C1937D1.C1938a> mo15599a() {
        return new C2355a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15598a(C2339Nd nd) {
        return (int) this.f6289a.mo17245b(-1);
    }

    C2354O(C2830b9 b9Var) {
        this.f6289a = b9Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15601a(C2339Nd nd, int i) {
        this.f6289a.mo17255e((long) i);
        nd.mo16358g().mo16079b();
    }

    /* renamed from: com.yandex.metrica.impl.ob.O$b */
    static class C2356b implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2830b9 f6291a;

        C2356b(C2830b9 b9Var) {
            this.f6291a = b9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            String l = this.f6291a.mo17276l((String) null);
            String n = this.f6291a.mo17280n((String) null);
            String m = this.f6291a.mo17278m((String) null);
            String g = this.f6291a.mo17263g((String) null);
            String h = this.f6291a.mo17266h((String) null);
            String j = this.f6291a.mo17272j((String) null);
            this.f6291a.mo17256e(m8043a(l));
            this.f6291a.mo17268i(m8043a(n));
            this.f6291a.mo17253d(m8043a(m));
            this.f6291a.mo17238a(m8043a(g));
            this.f6291a.mo17246b(m8043a(h));
            this.f6291a.mo17265h(m8043a(j));
        }

        /* renamed from: a */
        private C2673W0 m8043a(String str) {
            boolean isEmpty = TextUtils.isEmpty(str);
            return new C2673W0(str, isEmpty ? C2577U0.UNKNOWN : C2577U0.OK, isEmpty ? "no identifier saved in previous version" : null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O$c */
    static class C2357c implements C1937D1.C1938a {

        /* renamed from: a */
        private C2830b9 f6292a;

        public C2357c(C2830b9 b9Var) {
            this.f6292a = b9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2272Ld ld = new C2272Ld(context);
            if (C1848A2.m6815b((Map) ld.mo16175g())) {
                return;
            }
            if (this.f6292a.mo17280n((String) null) == null || this.f6292a.mo17276l((String) null) == null) {
                String e = ld.mo16172e((String) null);
                if (m8045a(e, this.f6292a.mo17276l((String) null))) {
                    this.f6292a.mo17289s(e);
                }
                String f = ld.mo16174f((String) null);
                if (m8045a(f, this.f6292a.mo17280n((String) null))) {
                    this.f6292a.mo17291t(f);
                }
                String b = ld.mo16169b((String) null);
                if (m8045a(b, this.f6292a.mo17263g((String) null))) {
                    this.f6292a.mo17282o(b);
                }
                String c = ld.mo16170c((String) null);
                if (m8045a(c, this.f6292a.mo17266h((String) null))) {
                    this.f6292a.mo17284p(c);
                }
                String d = ld.mo16171d((String) null);
                if (m8045a(d, this.f6292a.mo17272j((String) null))) {
                    this.f6292a.mo17286q(d);
                }
                long a = ld.mo16168a(-1);
                if (a != -1 && this.f6292a.mo17252d(-1) == -1) {
                    this.f6292a.mo17264h(a);
                }
                this.f6292a.mo17448d();
                ld.mo16173f().mo16079b();
            }
        }

        /* renamed from: a */
        private boolean m8045a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
