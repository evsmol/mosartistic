package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.p231a.C7898b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p251a.C8324d;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8568f;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.b */
public class C7922b extends C7905a {

    /* renamed from: u */
    private final C7898b f19129u = new C7898b(this.f19083a, this.f19087e, this.f19084b);

    /* renamed from: v */
    private C8568f f19130v;

    /* renamed from: w */
    private long f19131w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public AtomicBoolean f19132x = new AtomicBoolean();

    public C7922b(C8350e eVar, Activity activity, C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
    }

    /* renamed from: c */
    private long m23448c() {
        if (!(this.f19083a instanceof C8345a)) {
            return 0;
        }
        float l = ((C8345a) this.f19083a).mo56924l();
        if (l <= 0.0f) {
            l = (float) this.f19083a.mo57021t();
        }
        return (long) (((double) Utils.secondsToMillisLong(l)) * (((double) this.f19083a.mo56960R()) / 100.0d));
    }

    /* renamed from: a */
    public void mo55584a() {
    }

    /* renamed from: a */
    public void mo55538a(long j) {
    }

    /* renamed from: a */
    public void mo55540a(ViewGroup viewGroup) {
        this.f19129u.mo55528a(this.f19089g, this.f19088f, viewGroup);
        mo55545a(false);
        this.f19088f.renderAd(this.f19083a);
        mo55544a("javascript:al_onPoststitialShow();", (long) this.f19083a.mo56961S());
        if (mo55568t()) {
            long c = m23448c();
            this.f19131w = c;
            if (c > 0) {
                C8626v vVar = this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f19085c;
                    vVar2.mo57818b("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.f19131w + "ms...");
                }
                this.f19130v = C8568f.m26077a(this.f19131w, this.f19084b, new Runnable() {
                    public void run() {
                        C8626v vVar = C7922b.this.f19085c;
                        if (C8626v.m26252a()) {
                            C7922b.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        C7922b.this.f19132x.set(true);
                    }
                });
            }
        }
        if (this.f19089g != null) {
            if (this.f19083a.mo57021t() >= 0) {
                mo55541a(this.f19089g, this.f19083a.mo57021t(), new Runnable() {
                    public void run() {
                        C7922b.this.f19092j = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f19089g.setVisibility(0);
            }
        }
        mo55569u();
        this.f19084b.mo57337V().mo57229a((C8401a) new C8458z(this.f19084b, new Runnable() {
            public void run() {
                if (C7922b.this.f19089g != null) {
                    C7922b.this.f19083a.mo55860o().mo56848a((View) C7922b.this.f19088f, (List<C8324d>) Collections.singletonList(new C8324d(C7922b.this.f19089g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    C7922b.this.f19083a.mo55860o().mo56847a((View) C7922b.this.f19088f);
                }
            }
        }), C8432o.C8434a.MAIN, TimeUnit.SECONDS.toMillis(1));
        mo55570v();
        super.mo55549b(Utils.isVideoMutedInitially(this.f19084b));
    }

    /* renamed from: b */
    public void mo55585b() {
    }

    /* renamed from: d */
    public void mo55551d() {
        mo55540a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo55552e() {
    }

    /* renamed from: h */
    public void mo55555h() {
        mo55560m();
        C8568f fVar = this.f19130v;
        if (fVar != null) {
            fVar.mo57699a();
            this.f19130v = null;
        }
        super.mo55555h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo55560m() {
        C8568f fVar;
        boolean r = mo55566r();
        int i = 100;
        if (mo55568t()) {
            if (!r && (fVar = this.f19130v) != null) {
                i = (int) Math.min(100.0d, (((double) (this.f19131w - fVar.mo57700b())) / ((double) this.f19131w)) * 100.0d);
            }
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f19085c;
                vVar2.mo57818b("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        super.mo55537a(i, false, r, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo55566r() {
        if (mo55568t()) {
            return this.f19132x.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo55567s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo55569u() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f19083a.mo56989ad() >= 0 || this.f19083a.mo56990ae() >= 0) {
            int i = (this.f19083a.mo56989ad() > 0 ? 1 : (this.f19083a.mo56989ad() == 0 ? 0 : -1));
            C8350e eVar = this.f19083a;
            if (i >= 0) {
                j = eVar.mo56989ad();
            } else {
                if (eVar.mo56991af()) {
                    int l = (int) ((C8345a) this.f19083a).mo56924l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) l);
                    } else {
                        int t = (int) this.f19083a.mo57021t();
                        if (t > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) t);
                        }
                    }
                    j2 = 0 + millis;
                }
                j = (long) (((double) j2) * (((double) this.f19083a.mo56990ae()) / 100.0d));
            }
            mo55547b(j);
        }
    }

    /* renamed from: w */
    public void mo55571w() {
        super.mo55571w();
        this.f19129u.mo55526a(this.f19090h);
        this.f19092j = SystemClock.elapsedRealtime();
        this.f19132x.set(true);
    }
}
