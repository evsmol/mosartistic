package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.C7995j;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.p233b.C8038f;
import com.applovin.impl.p233b.C8044k;
import com.applovin.impl.p233b.C8045l;
import com.applovin.impl.p233b.C8046m;
import com.applovin.impl.p233b.C8047n;
import com.applovin.impl.p233b.C8050o;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p251a.C8324d;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.activity.b.c */
public class C7926c extends C7931e {
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C8029a f19136H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final Set<C8044k> f19137I = new HashSet();

    public C7926c(C8350e eVar, Activity activity, C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C8029a aVar = (C8029a) eVar;
        this.f19136H = aVar;
        this.f19137I.addAll(aVar.mo55826a(C8029a.C8033c.VIDEO, C8045l.f19484a));
        m23464a(C8029a.C8033c.IMPRESSION);
        m23466a(C8029a.C8033c.VIDEO, "creativeView");
        this.f19136H.mo55860o().mo56855d();
    }

    /* renamed from: G */
    private void m23461G() {
        if (mo55566r() && !this.f19137I.isEmpty()) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f19085c;
                vVar2.mo57821d("AppLovinFullscreenActivity", "Firing " + this.f19137I.size() + " un-fired video progress trackers when video was completed.");
            }
            m23468a(this.f19137I);
        }
    }

    /* renamed from: a */
    private void m23464a(C8029a.C8033c cVar) {
        m23465a(cVar, C8038f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m23465a(C8029a.C8033c cVar, C8038f fVar) {
        m23467a(cVar, "", fVar);
    }

    /* renamed from: a */
    private void m23466a(C8029a.C8033c cVar, String str) {
        m23467a(cVar, str, C8038f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m23467a(C8029a.C8033c cVar, String str, C8038f fVar) {
        m23469a(this.f19136H.mo55825a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23468a(Set<C8044k> set) {
        m23469a(set, C8038f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m23469a(Set<C8044k> set, C8038f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f19162v.mo52752I());
            C8050o aN = this.f19136H.mo55830aN();
            Uri a = aN != null ? aN.mo55944a() : null;
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f19085c;
                vVar2.mo57818b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
            }
            C8046m.m23958a(set, seconds, a, fVar, this.f19084b);
        }
    }

    /* renamed from: A */
    public void mo55589A() {
        m23461G();
        if (!C8046m.m23965c(this.f19136H)) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57818b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo55555h();
        } else if (!this.f19150F) {
            m23466a(C8029a.C8033c.COMPANION, "creativeView");
            this.f19136H.mo55860o().mo56881i();
            this.f19136H.mo55860o().mo56848a((View) this.f19088f, (List<C8324d>) Collections.singletonList(new C8324d(this.f19088f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.mo55589A();
        }
    }

    /* renamed from: a */
    public void mo55590a(PointF pointF) {
        m23464a(C8029a.C8033c.VIDEO_CLICK);
        this.f19136H.mo55860o().mo56887o();
        super.mo55590a(pointF);
    }

    /* renamed from: a */
    public void mo55540a(ViewGroup viewGroup) {
        super.mo55540a(viewGroup);
        this.f19146B.mo55744a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (C7995j.C7997a) new C7995j.C7997a() {
            /* renamed from: a */
            public void mo55597a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(C7926c.this.f19148D - (C7926c.this.f19162v.mo52751H() - C7926c.this.f19162v.mo52752I()));
                int F = C7926c.this.mo55611F();
                HashSet hashSet = new HashSet();
                for (C8044k kVar : new HashSet(C7926c.this.f19137I)) {
                    if (kVar.mo55927a(seconds, F)) {
                        hashSet.add(kVar);
                        C7926c.this.f19137I.remove(kVar);
                    }
                }
                C7926c.this.m23468a((Set<C8044k>) hashSet);
                if (F >= 25 && F < 50) {
                    C7926c.this.f19136H.mo55860o().mo56878f();
                } else if (F >= 50 && F < 75) {
                    C7926c.this.f19136H.mo55860o().mo56879g();
                } else if (F >= 75) {
                    C7926c.this.f19136H.mo55860o().mo56880h();
                }
            }

            /* renamed from: b */
            public boolean mo55598b() {
                return !C7926c.this.f19150F;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.f19163w != null) {
            arrayList.add(new C8324d(this.f19163w, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.f19164x != null) {
            arrayList.add(new C8324d(this.f19164x, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.f19145A != null) {
            arrayList.add(new C8324d(this.f19145A, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.f19165y != null) {
            arrayList.add(new C8324d(this.f19165y, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.f19166z != null) {
            arrayList.add(new C8324d(this.f19166z, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.f19136H.mo55860o().mo56848a((View) this.f19161u, (List<C8324d>) arrayList);
    }

    /* renamed from: c */
    public void mo55591c() {
        m23466a(C8029a.C8033c.VIDEO, "skip");
        this.f19136H.mo55860o().mo56886n();
        super.mo55591c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55592c(long j) {
        super.mo55592c(j);
        this.f19136H.mo55860o().mo56876a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f19084b));
    }

    /* renamed from: c */
    public void mo55593c(String str) {
        m23465a(C8029a.C8033c.ERROR, C8038f.MEDIA_FILE_ERROR);
        this.f19136H.mo55860o().mo56850a(str);
        super.mo55593c(str);
    }

    /* renamed from: d */
    public void mo55551d() {
        mo55540a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo55552e() {
        this.f19146B.mo55746c();
        super.mo55552e();
    }

    /* renamed from: f */
    public void mo55553f() {
        super.mo55553f();
        m23466a(this.f19150F ? C8029a.C8033c.COMPANION : C8029a.C8033c.VIDEO, "resume");
        this.f19136H.mo55860o().mo56883k();
    }

    /* renamed from: g */
    public void mo55554g() {
        super.mo55554g();
        m23466a(this.f19150F ? C8029a.C8033c.COMPANION : C8029a.C8033c.VIDEO, "pause");
        this.f19136H.mo55860o().mo56882j();
    }

    /* renamed from: h */
    public void mo55555h() {
        if (this.f19136H != null) {
            m23466a(C8029a.C8033c.VIDEO, "close");
            m23466a(C8029a.C8033c.COMPANION, "close");
        }
        super.mo55555h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo55569u() {
        long j;
        int t;
        long j2 = 0;
        if (this.f19136H.mo56989ad() >= 0 || this.f19136H.mo56990ae() >= 0) {
            int i = (this.f19136H.mo56989ad() > 0 ? 1 : (this.f19136H.mo56989ad() == 0 ? 0 : -1));
            C8029a aVar = this.f19136H;
            if (i >= 0) {
                j = aVar.mo56989ad();
            } else {
                C8047n aM = aVar.mo55829aM();
                if (aM != null && aM.mo55934b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) aM.mo55934b());
                } else if (this.f19148D > 0) {
                    j2 = 0 + this.f19148D;
                }
                if (aVar.mo56991af() && (t = (int) aVar.mo57021t()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) t);
                }
                j = (long) (((double) j2) * (((double) this.f19136H.mo56990ae()) / 100.0d));
            }
            mo55547b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo55594x() {
        super.mo55594x();
        C8029a aVar = this.f19136H;
        if (aVar != null) {
            aVar.mo55860o().mo56884l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo55595y() {
        super.mo55595y();
        C8029a aVar = this.f19136H;
        if (aVar != null) {
            aVar.mo55860o().mo56885m();
        }
    }

    /* renamed from: z */
    public void mo55596z() {
        super.mo55596z();
        m23466a(C8029a.C8033c.VIDEO, this.f19147C ? "mute" : "unmute");
        this.f19136H.mo55860o().mo56877a(this.f19147C);
    }
}
