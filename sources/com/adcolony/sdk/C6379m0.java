package com.adcolony.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.C6288e0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.m0 */
class C6379m0 {

    /* renamed from: a */
    private ScheduledExecutorService f13678a;

    /* renamed from: b */
    private ScheduledFuture<?> f13679b;

    /* renamed from: c */
    private String f13680c;

    /* renamed from: com.adcolony.sdk.m0$a */
    class C6380a implements C6327j0 {
        C6380a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6379m0.this.m15512c();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$b */
    class C6381b implements C6327j0 {
        C6381b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6379m0.this.m15515f();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$c */
    class C6382c implements Runnable {
        C6382c() {
        }

        public void run() {
            C6379m0.this.m15514d();
        }
    }

    C6379m0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m15514d() {
        String e = mo50844e();
        if (!e.equals(this.f13680c)) {
            this.f13680c = e;
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "network_type", e);
            new C6312h0("Network.on_status_change", 1, b).mo50736c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m15515f() {
        ScheduledFuture<?> scheduledFuture = this.f13679b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f13679b.cancel(false);
            }
            this.f13679b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo50844e() {
        return m15509a();
    }

    /* renamed from: a */
    private String m15509a() {
        NetworkInfo networkInfo;
        Context a = C6185a.m14880a();
        if (a == null) {
            return "none";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return "none";
            }
            int type = networkInfo.getType();
            if (type == 1) {
                return "wifi";
            }
            if (type == 0) {
                return "cell";
            }
            if (type >= 2) {
                return "cell";
            }
            return "none";
        } catch (SecurityException e) {
            new C6288e0.C6289a().mo50644a("SecurityException - please ensure you added the ").mo50644a("ACCESS_NETWORK_STATE permission: ").mo50644a(e.toString()).mo50645a(C6288e0.f13497h);
            return "none";
        } catch (Exception e2) {
            new C6288e0.C6289a().mo50644a("Exception occurred when retrieving activeNetworkInfo in ").mo50644a("ADCNetwork.getConnectivityStatus(): ").mo50644a(e2.toString()).mo50645a(C6288e0.f13498i);
            return "none";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15512c() {
        if (this.f13678a == null) {
            this.f13678a = Executors.newSingleThreadScheduledExecutor();
        }
        if (this.f13679b == null) {
            try {
                this.f13679b = this.f13678a.scheduleAtFixedRate(new C6382c(), 0, 1000, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C6288e0.C6289a().mo50644a("Error when scheduling network checks: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            }
            m15514d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50843b() {
        this.f13680c = mo50844e();
        C6185a.m14886a("Network.start_notifications", (C6327j0) new C6380a());
        C6185a.m14886a("Network.stop_notifications", (C6327j0) new C6381b());
    }
}
