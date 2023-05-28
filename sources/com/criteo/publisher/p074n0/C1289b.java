package com.criteo.publisher.p074n0;

import android.content.Context;
import android.os.Looper;
import com.appodeal.advertising.AdvertisingInfo;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.criteo.publisher.n0.b */
/* compiled from: AdvertisingInfo */
public class C1289b {

    /* renamed from: a */
    private final C1195g f4000a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final C1295f f4001b;

    /* renamed from: c */
    private final Context f4002c;

    /* renamed from: d */
    private final Executor f4003d;

    /* renamed from: e */
    private final AtomicReference<C1292c> f4004e = new AtomicReference<>();

    public C1289b(Context context, Executor executor, C1295f fVar) {
        this.f4002c = context;
        this.f4003d = executor;
        this.f4001b = fVar;
    }

    /* renamed from: com.criteo.publisher.n0.b$a */
    /* compiled from: AdvertisingInfo */
    class C1290a extends C1330x {
        C1290a() {
        }

        /* renamed from: a */
        public void mo3040a() {
            C1289b.this.mo3613b();
        }
    }

    /* renamed from: f */
    public void mo3615f() {
        this.f4003d.execute(new C1290a());
    }

    /* renamed from: b */
    public String mo3613b() {
        return m5730c().mo3616b();
    }

    /* renamed from: d */
    public boolean mo3614d() {
        return m5730c().mo3617c();
    }

    /* renamed from: c */
    private C1292c m5730c() {
        if (this.f4004e.get() == null) {
            if (m5731e()) {
                this.f4003d.execute(new C1291b());
            } else {
                m5728a();
            }
        }
        C1292c cVar = this.f4004e.get();
        return cVar == null ? C1292c.m5737a() : cVar;
    }

    /* renamed from: com.criteo.publisher.n0.b$b */
    /* compiled from: AdvertisingInfo */
    class C1291b extends C1330x {
        C1291b() {
        }

        /* renamed from: a */
        public void mo3040a() {
            C1289b.this.m5728a();
        }
    }

    /* renamed from: e */
    private boolean m5731e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return Thread.currentThread().equals(mainLooper.getThread());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5728a() {
        C1292c cVar;
        try {
            C1292c a = this.f4001b.mo3618a(this.f4002c);
            if (a.mo3617c()) {
                cVar = C1292c.m5739d();
            } else {
                cVar = C1292c.m5738a(a.mo3616b());
            }
        } catch (C1294e e) {
            C1292c a2 = C1292c.m5737a();
            this.f4000a.mo3338a("Error getting advertising id", (Throwable) e);
            cVar = a2;
        } catch (Exception e2) {
            C1311o.m5779a((Throwable) new C1293d(e2));
            return;
        }
        this.f4004e.compareAndSet((Object) null, cVar);
    }

    /* renamed from: com.criteo.publisher.n0.b$f */
    /* compiled from: AdvertisingInfo */
    public static class C1295f {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1292c mo3618a(Context context) throws Exception {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                return new C1292c(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (LinkageError e) {
                throw new C1294e(e);
            }
        }
    }

    /* renamed from: com.criteo.publisher.n0.b$c */
    /* compiled from: AdvertisingInfo */
    static class C1292c {

        /* renamed from: c */
        private static final C1292c f4007c = new C1292c((String) null, false);

        /* renamed from: d */
        private static final C1292c f4008d = new C1292c(AdvertisingInfo.defaultAdvertisingId, true);

        /* renamed from: a */
        private final String f4009a;

        /* renamed from: b */
        private final boolean f4010b;

        C1292c(String str, boolean z) {
            this.f4009a = str;
            this.f4010b = z;
        }

        /* renamed from: a */
        static C1292c m5738a(String str) {
            return new C1292c(str, false);
        }

        /* renamed from: d */
        static C1292c m5739d() {
            return f4008d;
        }

        /* renamed from: a */
        static C1292c m5737a() {
            return f4007c;
        }

        /* renamed from: b */
        public String mo3616b() {
            return this.f4009a;
        }

        /* renamed from: c */
        public boolean mo3617c() {
            return this.f4010b;
        }
    }

    /* renamed from: com.criteo.publisher.n0.b$e */
    /* compiled from: AdvertisingInfo */
    static class C1294e extends Exception {
        C1294e(Throwable th) {
            super("play-services-ads-identifier does not seems to be in the classpath", th);
        }
    }

    /* renamed from: com.criteo.publisher.n0.b$d */
    /* compiled from: AdvertisingInfo */
    static class C1293d extends Exception {
        C1293d(Throwable th) {
            super("Error getting advertising id", th);
        }
    }
}
