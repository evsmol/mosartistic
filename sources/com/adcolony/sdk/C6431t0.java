package com.adcolony.sdk;

import android.os.SystemClock;
import com.adcolony.sdk.C6288e0;
import java.util.LinkedHashMap;

/* renamed from: com.adcolony.sdk.t0 */
class C6431t0 {

    /* renamed from: a */
    private long f13820a = 1800000;

    /* renamed from: b */
    private int f13821b;

    /* renamed from: c */
    private long f13822c;

    /* renamed from: d */
    private boolean f13823d = true;

    /* renamed from: e */
    private boolean f13824e = true;

    /* renamed from: f */
    private boolean f13825f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f13826g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f13827h = false;

    /* renamed from: i */
    private boolean f13828i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13829j;

    /* renamed from: k */
    private boolean f13830k;

    /* renamed from: l */
    private C6447u0 f13831l;

    /* renamed from: com.adcolony.sdk.t0$a */
    class C6432a implements C6327j0 {
        C6432a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6431t0.this.f13829j = true;
        }
    }

    /* renamed from: com.adcolony.sdk.t0$b */
    class C6433b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6361l f13833a;

        /* renamed from: b */
        final /* synthetic */ C6328k f13834b;

        C6433b(C6431t0 t0Var, C6361l lVar, C6328k kVar) {
            this.f13833a = lVar;
            this.f13834b = kVar;
        }

        public void run() {
            this.f13833a.mo50566b();
            this.f13834b.mo50806q().mo50730d();
        }
    }

    /* renamed from: com.adcolony.sdk.t0$c */
    class C6434c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f13835a;

        C6434c(boolean z) {
            this.f13835a = z;
        }

        public void run() {
            LinkedHashMap<Integer, C6360k0> d = C6185a.m14887b().mo50807r().mo50749d();
            synchronized (d) {
                for (C6360k0 next : d.values()) {
                    C6294f1 b = C6235c0.m15073b();
                    C6235c0.m15079b(b, "from_window_focus", this.f13835a);
                    if (C6431t0.this.f13827h && !C6431t0.this.f13826g) {
                        C6235c0.m15079b(b, "app_in_foreground", false);
                        boolean unused = C6431t0.this.f13827h = false;
                    }
                    new C6312h0("SessionInfo.on_pause", next.getModuleId(), b).mo50736c();
                }
            }
            C6185a.m14892f();
        }
    }

    /* renamed from: com.adcolony.sdk.t0$d */
    class C6435d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f13837a;

        C6435d(boolean z) {
            this.f13837a = z;
        }

        public void run() {
            C6328k b = C6185a.m14887b();
            LinkedHashMap<Integer, C6360k0> d = b.mo50807r().mo50749d();
            synchronized (d) {
                for (C6360k0 next : d.values()) {
                    C6294f1 b2 = C6235c0.m15073b();
                    C6235c0.m15079b(b2, "from_window_focus", this.f13837a);
                    if (C6431t0.this.f13827h && C6431t0.this.f13826g) {
                        C6235c0.m15079b(b2, "app_in_foreground", true);
                        boolean unused = C6431t0.this.f13827h = false;
                    }
                    new C6312h0("SessionInfo.on_resume", next.getModuleId(), b2).mo50736c();
                }
            }
            b.mo50806q().mo50730d();
        }
    }

    C6431t0() {
    }

    /* renamed from: h */
    private void m15732h() {
        mo51007a(false);
    }

    /* renamed from: i */
    private void m15733i() {
        mo51009b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo51011c(boolean z) {
        C6328k b = C6185a.m14887b();
        if (!this.f13825f) {
            if (this.f13828i) {
                b.mo50788c(false);
                this.f13828i = false;
            }
            this.f13821b = 0;
            this.f13822c = SystemClock.uptimeMillis();
            this.f13823d = true;
            this.f13825f = true;
            this.f13826g = true;
            this.f13827h = false;
            AdColony.m14790c();
            if (z) {
                C6294f1 b2 = C6235c0.m15073b();
                C6235c0.m15070a(b2, "id", C6509z0.m15929a());
                new C6312h0("SessionInfo.on_start", 1, b2).mo50736c();
                C6361l c = C6185a.m14887b().mo50807r().mo50747c();
                if (c != null && !AdColony.m14786a((Runnable) new C6433b(this, c, b))) {
                    new C6288e0.C6289a().mo50644a("RejectedExecutionException on controller update.").mo50645a(C6288e0.f13498i);
                }
            }
            b.mo50807r().mo50752h();
            C6450v.m15783a().mo51047b();
        }
    }

    /* renamed from: d */
    public void mo51012d() {
        C6185a.m14886a("SessionInfo.stopped", (C6327j0) new C6432a());
        this.f13831l = new C6447u0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo51015e() {
        return this.f13823d;
    }

    /* renamed from: f */
    public void mo51016f(boolean z) {
        this.f13828i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo51018g(boolean z) {
        this.f13830k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo51020j() {
        C6424s0 a = C6185a.m14887b().mo50806q().mo50720a();
        this.f13825f = false;
        this.f13823d = false;
        if (a != null) {
            a.mo50990b();
        }
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15067a(b, "session_length", ((double) (SystemClock.uptimeMillis() - this.f13822c)) / 1000.0d);
        new C6312h0("SessionInfo.on_stop", 1, b).mo50736c();
        C6185a.m14892f();
        AdColony.m14794g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo51014e(boolean z) {
        if (this.f13826g != z) {
            this.f13826g = z;
            this.f13827h = true;
            if (!z) {
                m15732h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo51017f() {
        return this.f13825f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo51019g() {
        return this.f13830k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51007a(boolean z) {
        this.f13824e = true;
        this.f13831l.mo51038b();
        if (!AdColony.m14786a((Runnable) new C6434c(z))) {
            new C6288e0.C6289a().mo50644a("RejectedExecutionException on session pause.").mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51009b(boolean z) {
        this.f13824e = false;
        this.f13831l.mo51039c();
        if (!AdColony.m14786a((Runnable) new C6435d(z))) {
            new C6288e0.C6289a().mo50644a("RejectedExecutionException on session resume.").mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo51013d(boolean z) {
        if (z && this.f13824e) {
            m15733i();
        } else if (!z && !this.f13824e) {
            m15732h();
        }
        this.f13823d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo51005a() {
        return this.f13820a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51006a(int i) {
        this.f13820a = i <= 0 ? this.f13820a : (long) (i * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo51008b() {
        return this.f13821b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo51010c() {
        this.f13821b++;
    }
}
