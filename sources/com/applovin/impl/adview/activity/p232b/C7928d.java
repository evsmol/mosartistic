package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

/* renamed from: com.applovin.impl.adview.activity.b.d */
public class C7928d extends C7944f {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C8029a f19139F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Set<C8044k> f19140G = new HashSet();

    public C7928d(C8350e eVar, final Activity activity, final C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C8029a aVar = (C8029a) eVar;
        this.f19139F = aVar;
        if (aVar.mo55833aQ()) {
            this.f19181A = new ImageView(activity);
            this.f19181A.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f19181A.setClickable(true);
            this.f19181A.setVisibility(8);
            this.f19181A.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Uri b = C7928d.this.f19139F.mo55832aP().mo55904b();
                    if (b != null) {
                        C8626v vVar = C7928d.this.f19085c;
                        if (C8626v.m26252a()) {
                            C8626v vVar2 = C7928d.this.f19085c;
                            vVar2.mo57818b("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + b);
                        }
                        C7928d.this.m23493a(C8029a.C8033c.INDUSTRY_ICON_CLICK);
                        Utils.openUri(activity, b, nVar);
                    }
                }
            });
        }
        this.f19140G.addAll(this.f19139F.mo55826a(C8029a.C8033c.VIDEO, C8045l.f19484a));
        m23493a(C8029a.C8033c.IMPRESSION);
        m23495a(C8029a.C8033c.VIDEO, "creativeView");
        this.f19139F.mo55860o().mo56855d();
    }

    /* renamed from: C */
    private void m23488C() {
        if (mo55566r() && !this.f19140G.isEmpty()) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f19085c;
                vVar2.mo57821d("AppLovinFullscreenActivity", "Firing " + this.f19140G.size() + " un-fired video progress trackers when video was completed.");
            }
            m23497a(this.f19140G);
        }
    }

    /* renamed from: D */
    private boolean m23489D() {
        return this.f19181A != null && this.f19139F.mo55833aQ();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23493a(C8029a.C8033c cVar) {
        m23494a(cVar, C8038f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m23494a(C8029a.C8033c cVar, C8038f fVar) {
        m23496a(cVar, "", fVar);
    }

    /* renamed from: a */
    private void m23495a(C8029a.C8033c cVar, String str) {
        m23496a(cVar, str, C8038f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m23496a(C8029a.C8033c cVar, String str, C8038f fVar) {
        m23498a(this.f19139F.mo55825a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23497a(Set<C8044k> set) {
        m23498a(set, C8038f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m23498a(Set<C8044k> set, C8038f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds((long) this.f19199u.getCurrentPosition());
            C8050o aN = this.f19139F.mo55830aN();
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
    public void mo55599A() {
        m23488C();
        if (!C8046m.m23965c(this.f19139F)) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57818b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo55555h();
        } else if (!this.f19185E) {
            m23495a(C8029a.C8033c.COMPANION, "creativeView");
            this.f19139F.mo55860o().mo56881i();
            this.f19139F.mo55860o().mo56848a((View) this.f19088f, (List<C8324d>) Collections.singletonList(new C8324d(this.f19088f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.mo55599A();
        }
    }

    /* renamed from: a */
    public void mo55600a(PointF pointF) {
        m23493a(C8029a.C8033c.VIDEO_CLICK);
        this.f19139F.mo55860o().mo56887o();
        super.mo55600a(pointF);
    }

    /* renamed from: a */
    public void mo55540a(ViewGroup viewGroup) {
        super.mo55540a(viewGroup);
        if (m23489D()) {
            m23493a(C8029a.C8033c.INDUSTRY_ICON_IMPRESSION);
            Utils.setImageUrl(this.f19139F.mo55832aP().mo55903a().toString(), this.f19181A, this.f19084b);
            this.f19181A.setVisibility(0);
        }
        this.f19182B.mo55744a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (C7995j.C7997a) new C7995j.C7997a() {
            /* renamed from: a */
            public void mo55597a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(C7928d.this.f19184D - ((long) (C7928d.this.f19199u.getDuration() - C7928d.this.f19199u.getCurrentPosition())));
                int B = C7928d.this.mo55625B();
                HashSet hashSet = new HashSet();
                for (C8044k kVar : new HashSet(C7928d.this.f19140G)) {
                    if (kVar.mo55927a(seconds, B)) {
                        hashSet.add(kVar);
                        C7928d.this.f19140G.remove(kVar);
                    }
                }
                C7928d.this.m23497a((Set<C8044k>) hashSet);
                if (B >= 25 && B < 50) {
                    C7928d.this.f19139F.mo55860o().mo56878f();
                } else if (B >= 50 && B < 75) {
                    C7928d.this.f19139F.mo55860o().mo56879g();
                } else if (B >= 75) {
                    C7928d.this.f19139F.mo55860o().mo56880h();
                }
            }

            /* renamed from: b */
            public boolean mo55598b() {
                return !C7928d.this.f19185E;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.f19200v != null) {
            arrayList.add(new C8324d(this.f19200v, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.f19201w != null) {
            arrayList.add(new C8324d(this.f19201w, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.f19204z != null) {
            arrayList.add(new C8324d(this.f19204z, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.f19202x != null) {
            arrayList.add(new C8324d(this.f19202x, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.f19203y != null) {
            arrayList.add(new C8324d(this.f19203y, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.f19139F.mo55860o().mo56848a((View) this.f19199u, (List<C8324d>) arrayList);
    }

    /* renamed from: c */
    public void mo55591c() {
        m23495a(C8029a.C8033c.VIDEO, "skip");
        this.f19139F.mo55860o().mo56886n();
        super.mo55591c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55601c(long j) {
        super.mo55601c(j);
        this.f19139F.mo55860o().mo56876a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f19084b));
    }

    /* renamed from: c */
    public void mo55602c(String str) {
        m23494a(C8029a.C8033c.ERROR, C8038f.MEDIA_FILE_ERROR);
        this.f19139F.mo55860o().mo56850a(str);
        super.mo55602c(str);
    }

    /* renamed from: d */
    public void mo55551d() {
        mo55540a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo55552e() {
        this.f19182B.mo55746c();
        super.mo55552e();
    }

    /* renamed from: f */
    public void mo55553f() {
        super.mo55553f();
        m23495a(this.f19185E ? C8029a.C8033c.COMPANION : C8029a.C8033c.VIDEO, "resume");
        this.f19139F.mo55860o().mo56883k();
    }

    /* renamed from: g */
    public void mo55554g() {
        super.mo55554g();
        m23495a(this.f19185E ? C8029a.C8033c.COMPANION : C8029a.C8033c.VIDEO, "pause");
        this.f19139F.mo55860o().mo56882j();
    }

    /* renamed from: h */
    public void mo55555h() {
        if (this.f19139F != null) {
            m23495a(C8029a.C8033c.VIDEO, "close");
            m23495a(C8029a.C8033c.COMPANION, "close");
        }
        super.mo55555h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo55569u() {
        long j;
        int t;
        long j2 = 0;
        if (this.f19139F.mo56989ad() >= 0 || this.f19139F.mo56990ae() >= 0) {
            int i = (this.f19139F.mo56989ad() > 0 ? 1 : (this.f19139F.mo56989ad() == 0 ? 0 : -1));
            C8029a aVar = this.f19139F;
            if (i >= 0) {
                j = aVar.mo56989ad();
            } else {
                C8047n aM = aVar.mo55829aM();
                if (aM != null && aM.mo55934b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) aM.mo55934b());
                } else if (this.f19184D > 0) {
                    j2 = 0 + this.f19184D;
                }
                if (aVar.mo56991af() && (t = (int) aVar.mo57021t()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) t);
                }
                j = (long) (((double) j2) * (((double) this.f19139F.mo56990ae()) / 100.0d));
            }
            mo55547b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo55603x() {
        super.mo55603x();
        C8029a aVar = this.f19139F;
        if (aVar != null) {
            aVar.mo55860o().mo56884l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo55604y() {
        super.mo55604y();
        C8029a aVar = this.f19139F;
        if (aVar != null) {
            aVar.mo55860o().mo56885m();
        }
    }

    /* renamed from: z */
    public void mo55605z() {
        super.mo55605z();
        m23495a(C8029a.C8033c.VIDEO, this.f19183C ? "mute" : "unmute");
        this.f19139F.mo55860o().mo56877a(this.f19183C);
    }
}
