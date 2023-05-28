package com.adcolony.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.g0 */
class C6297g0 {

    /* renamed from: f */
    static boolean f13517f = false;

    /* renamed from: g */
    static int f13518g = 3;

    /* renamed from: h */
    static int f13519h = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6294f1 f13520a = C6235c0.m15073b();

    /* renamed from: b */
    private C6290e1 f13521b = null;

    /* renamed from: c */
    private ExecutorService f13522c = null;

    /* renamed from: d */
    private final Queue<Runnable> f13523d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    C6424s0 f13524e;

    /* renamed from: com.adcolony.sdk.g0$a */
    class C6298a implements C6327j0 {
        C6298a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 0, C6235c0.m15087h(h0Var.mo50732a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$b */
    class C6299b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13526a;

        /* renamed from: b */
        final /* synthetic */ String f13527b;

        /* renamed from: c */
        final /* synthetic */ int f13528c;

        /* renamed from: d */
        final /* synthetic */ boolean f13529d;

        C6299b(int i, String str, int i2, boolean z) {
            this.f13526a = i;
            this.f13527b = str;
            this.f13528c = i2;
            this.f13529d = z;
        }

        public void run() {
            C6297g0.this.m15286a(this.f13526a, this.f13527b, this.f13528c);
            int i = 0;
            while (i <= this.f13527b.length() / TTAdSdk.INIT_LOCAL_FAIL_CODE) {
                int i2 = i * TTAdSdk.INIT_LOCAL_FAIL_CODE;
                i++;
                int min = Math.min(i * TTAdSdk.INIT_LOCAL_FAIL_CODE, this.f13527b.length());
                if (this.f13528c == 3) {
                    C6297g0 g0Var = C6297g0.this;
                    if (g0Var.mo50724a(C6235c0.m15085f(g0Var.f13520a, Integer.toString(this.f13526a)), 3, this.f13529d)) {
                        Log.d("AdColony [TRACE]", this.f13527b.substring(i2, min));
                    }
                }
                if (this.f13528c == 2) {
                    C6297g0 g0Var2 = C6297g0.this;
                    if (g0Var2.mo50724a(C6235c0.m15085f(g0Var2.f13520a, Integer.toString(this.f13526a)), 2, this.f13529d)) {
                        Log.i("AdColony [INFO]", this.f13527b.substring(i2, min));
                    }
                }
                if (this.f13528c == 1) {
                    C6297g0 g0Var3 = C6297g0.this;
                    if (g0Var3.mo50724a(C6235c0.m15085f(g0Var3.f13520a, Integer.toString(this.f13526a)), 1, this.f13529d)) {
                        Log.w("AdColony [WARNING]", this.f13527b.substring(i2, min));
                    }
                }
                if (this.f13528c == 0) {
                    C6297g0 g0Var4 = C6297g0.this;
                    if (g0Var4.mo50724a(C6235c0.m15085f(g0Var4.f13520a, Integer.toString(this.f13526a)), 0, this.f13529d)) {
                        Log.e("AdColony [ERROR]", this.f13527b.substring(i2, min));
                    }
                }
                if (this.f13528c == -1 && C6297g0.f13518g >= -1) {
                    Log.e("AdColony [FATAL]", this.f13527b.substring(i2, min));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.g0$c */
    class C6300c implements C6327j0 {
        C6300c(C6297g0 g0Var) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.f13518g = C6235c0.m15083d(h0Var.mo50732a(), AppLovinEventTypes.USER_COMPLETED_LEVEL);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$d */
    class C6301d implements C6327j0 {
        C6301d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 3, C6235c0.m15087h(h0Var.mo50732a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$e */
    class C6302e implements C6327j0 {
        C6302e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 3, C6235c0.m15087h(h0Var.mo50732a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$f */
    class C6303f implements C6327j0 {
        C6303f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 2, C6235c0.m15087h(h0Var.mo50732a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$g */
    class C6304g implements C6327j0 {
        C6304g() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 2, C6235c0.m15087h(h0Var.mo50732a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$h */
    class C6305h implements C6327j0 {
        C6305h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 1, C6235c0.m15087h(h0Var.mo50732a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$i */
    class C6306i implements C6327j0 {
        C6306i() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 1, C6235c0.m15087h(h0Var.mo50732a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$j */
    class C6307j implements C6327j0 {
        C6307j() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6297g0.this.mo50726b(C6235c0.m15083d(h0Var.mo50732a(), "module"), 0, C6235c0.m15087h(h0Var.mo50732a(), "message"), false);
        }
    }

    C6297g0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50726b(int i, int i2, String str, boolean z) {
        if (!m15288a(m15285a(i, i2, str, z))) {
            synchronized (this.f13523d) {
                this.f13523d.add(m15285a(i, i2, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50728c() {
        C6185a.m14886a("Log.set_log_level", (C6327j0) new C6300c(this));
        C6185a.m14886a("Log.public.trace", (C6327j0) new C6301d());
        C6185a.m14886a("Log.private.trace", (C6327j0) new C6302e());
        C6185a.m14886a("Log.public.info", (C6327j0) new C6303f());
        C6185a.m14886a("Log.private.info", (C6327j0) new C6304g());
        C6185a.m14886a("Log.public.warning", (C6327j0) new C6305h());
        C6185a.m14886a("Log.private.warning", (C6327j0) new C6306i());
        C6185a.m14886a("Log.public.error", (C6327j0) new C6307j());
        C6185a.m14886a("Log.private.error", (C6327j0) new C6298a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50730d() {
        ExecutorService executorService = this.f13522c;
        if (executorService == null || executorService.isShutdown() || this.f13522c.isTerminated()) {
            this.f13522c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f13523d) {
            while (!this.f13523d.isEmpty()) {
                m15288a(this.f13523d.poll());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50721a(int i, String str, boolean z) {
        mo50726b(0, i, str, z);
    }

    /* renamed from: a */
    private Runnable m15285a(int i, int i2, String str, boolean z) {
        return new C6299b(i, str, i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50724a(C6294f1 f1Var, int i, boolean z) {
        int d = C6235c0.m15083d(f1Var, "print_level");
        boolean b = C6235c0.m15076b(f1Var, "log_private");
        if (f1Var.mo50689b()) {
            d = f13518g;
            b = f13517f;
        }
        return (!z || b) && d != 4 && d >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50727b(C6290e1 e1Var) {
        this.f13520a = mo50719a(e1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6290e1 mo50725b() {
        return this.f13521b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50723a(C6294f1 f1Var, int i) {
        int d = C6235c0.m15083d(f1Var, "send_level");
        if (f1Var.mo50689b()) {
            d = f13519h;
        }
        return d >= i && d != 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50722a(HashMap<String, Object> hashMap) {
        try {
            C6424s0 s0Var = new C6424s0(new C6284d0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f13524e = s0Var;
            s0Var.mo50988a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15286a(int i, String str, int i2) {
        if (this.f13524e != null) {
            if (i2 == 3 && mo50723a(C6235c0.m15085f(this.f13520a, Integer.toString(i)), 3)) {
                this.f13524e.mo50989a(str);
            } else if (i2 == 2 && mo50723a(C6235c0.m15085f(this.f13520a, Integer.toString(i)), 2)) {
                this.f13524e.mo50993c(str);
            } else if (i2 == 1 && mo50723a(C6235c0.m15085f(this.f13520a, Integer.toString(i)), 1)) {
                this.f13524e.mo50994d(str);
            } else if (i2 == 0 && mo50723a(C6235c0.m15085f(this.f13520a, Integer.toString(i)), 0)) {
                this.f13524e.mo50992b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6294f1 mo50719a(C6290e1 e1Var) {
        C6294f1 b = C6235c0.m15073b();
        for (int i = 0; i < e1Var.mo50650b(); i++) {
            C6294f1 a = C6235c0.m15062a(e1Var, i);
            C6235c0.m15069a(b, Integer.toString(C6235c0.m15083d(a, "id")), a);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m15288a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f13522c;
            if (executorService == null || executorService.isShutdown() || this.f13522c.isTerminated()) {
                return false;
            }
            this.f13522c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50729c(C6290e1 e1Var) {
        if (e1Var != null) {
            e1Var.mo50652b(AppLovinEventTypes.USER_COMPLETED_LEVEL);
            e1Var.mo50652b("message");
        }
        this.f13521b = e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6424s0 mo50720a() {
        return this.f13524e;
    }
}
