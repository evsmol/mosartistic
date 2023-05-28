package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.t */
public class C8552t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f21602a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f21603b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f21604c;

    /* renamed from: d */
    private final Object f21605d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f21606e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f21607f;

    /* renamed from: g */
    private Object f21608g;

    C8552t(C8490n nVar) {
        this.f21602a = nVar;
    }

    /* renamed from: a */
    public void mo57671a(final Object obj) {
        if (!C8134c.m24358a(obj) && this.f21603b.compareAndSet(false, true)) {
            this.f21608g = obj;
            this.f21604c = System.currentTimeMillis();
            this.f21602a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f21602a.mo57320D();
                D.mo57818b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f21604c);
            }
            this.f21602a.mo57372am().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f21602a.mo57342a(C8380b.f20844co)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        if (C8552t.this.f21603b.get() && System.currentTimeMillis() - C8552t.this.f21604c >= longValue) {
                            C8552t.this.f21602a.mo57320D();
                            if (C8626v.m26252a()) {
                                C8552t.this.f21602a.mo57320D().mo57818b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            C8552t.this.mo57674b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    /* renamed from: a */
    public void mo57672a(boolean z) {
        synchronized (this.f21605d) {
            this.f21606e.set(z);
            if (z) {
                this.f21607f = System.currentTimeMillis();
                this.f21602a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = this.f21602a.mo57320D();
                    D.mo57818b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f21607f);
                }
                final long longValue = ((Long) this.f21602a.mo57342a(C8380b.f20843cn)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                        public void run() {
                            if (C8552t.this.mo57673a() && System.currentTimeMillis() - C8552t.this.f21607f >= longValue) {
                                C8552t.this.f21602a.mo57320D();
                                if (C8626v.m26252a()) {
                                    C8552t.this.f21602a.mo57320D().mo57818b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                C8552t.this.f21606e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f21607f = 0;
                this.f21602a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D2 = this.f21602a.mo57320D();
                    D2.mo57818b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo57673a() {
        return this.f21606e.get();
    }

    /* renamed from: b */
    public void mo57674b(Object obj) {
        if (!C8134c.m24358a(obj) && this.f21603b.compareAndSet(true, false)) {
            this.f21608g = null;
            this.f21602a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f21602a.mo57320D();
                D.mo57818b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            this.f21602a.mo57372am().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* renamed from: b */
    public boolean mo57675b() {
        return this.f21603b.get();
    }

    /* renamed from: c */
    public Object mo57676c() {
        return this.f21608g;
    }
}
