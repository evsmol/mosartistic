package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.C7888a;
import com.applovin.impl.adview.C7991g;
import com.applovin.impl.adview.C8008m;
import com.applovin.impl.adview.activity.p231a.C7903d;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p251a.C8324d;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.C8656R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.g */
public class C7959g extends C7905a implements C7991g {

    /* renamed from: A */
    private double f19221A;

    /* renamed from: B */
    private AtomicBoolean f19222B = new AtomicBoolean();

    /* renamed from: C */
    private AtomicBoolean f19223C = new AtomicBoolean();

    /* renamed from: D */
    private boolean f19224D = Utils.isVideoMutedInitially(this.f19084b);
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f19225E = -2;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public long f19226F = 0;

    /* renamed from: u */
    private final C7903d f19227u = new C7903d(this.f19083a, this.f19087e, this.f19084b);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C8008m f19228v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final ImageView f19229w;

    /* renamed from: x */
    private final C7888a f19230x;

    /* renamed from: y */
    private final boolean f19231y = this.f19083a.mo55846f();

    /* renamed from: z */
    private double f19232z;

    /* renamed from: com.applovin.impl.adview.activity.b.g$a */
    private class C7964a implements View.OnClickListener {
        private C7964a() {
        }

        public void onClick(View view) {
            if (view == C7959g.this.f19228v) {
                if (C7959g.this.mo55567s()) {
                    C7959g.this.mo55564p();
                    C7959g.this.f19101s.mo57069b();
                    return;
                }
                C7959g.this.mo55645x();
            } else if (view == C7959g.this.f19229w) {
                C7959g.this.mo55647z();
            } else {
                C8626v vVar = C7959g.this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = C7959g.this.f19085c;
                    vVar2.mo57822e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public C7959g(C8350e eVar, Activity activity, C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C7964a aVar = new C7964a();
        if (eVar.mo57019r() >= 0) {
            C8008m mVar = new C8008m(eVar.mo57025x(), activity);
            this.f19228v = mVar;
            mVar.setVisibility(8);
            this.f19228v.setOnClickListener(aVar);
        } else {
            this.f19228v = null;
        }
        if (m23625a(this.f19224D, nVar)) {
            ImageView imageView = new ImageView(activity);
            this.f19229w = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f19229w.setClickable(true);
            this.f19229w.setOnClickListener(aVar);
            m23629d(this.f19224D);
        } else {
            this.f19229w = null;
        }
        if (this.f19231y) {
            C7888a aVar2 = new C7888a(activity, ((Integer) nVar.mo57342a(C8380b.f20813cJ)).intValue(), 16842874);
            this.f19230x = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            this.f19230x.setBackgroundColor(Color.parseColor("#00000000"));
            this.f19230x.setVisibility(8);
            return;
        }
        this.f19230x = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m23622A() {
        if (this.f19223C.compareAndSet(false, true)) {
            mo55541a(this.f19228v, this.f19083a.mo57019r(), new Runnable() {
                public void run() {
                    long unused = C7959g.this.f19225E = -1;
                    long unused2 = C7959g.this.f19226F = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m23625a(boolean z, C8490n nVar) {
        if (!((Boolean) nVar.mo57342a(C8380b.f20854cy)).booleanValue()) {
            return false;
        }
        if (!((Boolean) nVar.mo57342a(C8380b.f20855cz)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) nVar.mo57342a(C8380b.f20805cB)).booleanValue();
    }

    /* renamed from: d */
    private void m23629d(boolean z) {
        if (C8571h.m26086d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f19087e.getDrawable(z ? C8656R.C8659drawable.applovin_ic_unmute_to_mute : C8656R.C8659drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f19229w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f19229w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f19083a.mo56976aC() : this.f19083a.mo56977aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f19229w.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    public void mo55584a() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* renamed from: a */
    public void mo55641a(double d) {
        mo55548b("javascript:al_setVideoMuted(" + this.f19224D + ");");
        C7888a aVar = this.f19230x;
        if (aVar != null) {
            aVar.mo55510b();
        }
        if (this.f19228v != null) {
            m23622A();
        }
        this.f19088f.getController().mo55680m();
        this.f19221A = d;
        mo55569u();
        if (this.f19083a.mo56998am()) {
            this.f19101s.mo57067a(this.f19083a, (Runnable) null);
        }
    }

    /* renamed from: a */
    public void mo55538a(long j) {
    }

    /* renamed from: a */
    public void mo55540a(ViewGroup viewGroup) {
        this.f19227u.mo55534a(this.f19229w, this.f19228v, this.f19089g, this.f19230x, this.f19088f, viewGroup);
        this.f19088f.getController().mo55659a((C7991g) this);
        mo55545a(false);
        C7888a aVar = this.f19230x;
        if (aVar != null) {
            aVar.mo55509a();
        }
        this.f19088f.renderAd(this.f19083a);
        if (this.f19228v != null) {
            this.f19084b.mo57337V().mo57230a(new C8458z(this.f19084b, new Runnable() {
                public void run() {
                    C7959g.this.m23622A();
                }
            }), C8432o.C8434a.MAIN, this.f19083a.mo57020s(), true);
        }
        this.f19084b.mo57337V().mo57229a((C8401a) new C8458z(this.f19084b, new Runnable() {
            public void run() {
                if (C7959g.this.f19089g != null) {
                    C7959g.this.f19083a.mo55860o().mo56848a((View) C7959g.this.f19088f, (List<C8324d>) Collections.singletonList(new C8324d(C7959g.this.f19089g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    C7959g.this.f19083a.mo55860o().mo56847a((View) C7959g.this.f19088f);
                }
            }
        }), C8432o.C8434a.MAIN, 500);
        super.mo55549b(this.f19224D);
    }

    /* renamed from: b */
    public void mo55585b() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo55645x();
    }

    /* renamed from: b */
    public void mo55642b(double d) {
        this.f19232z = d;
    }

    /* renamed from: c */
    public void mo55591c() {
        C7888a aVar = this.f19230x;
        if (aVar != null) {
            aVar.mo55510b();
        }
    }

    /* renamed from: d */
    public void mo55551d() {
        mo55540a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo55552e() {
    }

    /* renamed from: g_ */
    public void mo55643g_() {
        mo55646y();
    }

    /* renamed from: h */
    public void mo55555h() {
        mo55560m();
        super.mo55555h();
    }

    /* renamed from: h_ */
    public void mo55644h_() {
        C7888a aVar = this.f19230x;
        if (aVar != null) {
            aVar.mo55509a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo55560m() {
        super.mo55537a((int) this.f19232z, this.f19231y, mo55566r(), this.f19225E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo55566r() {
        return this.f19232z >= ((double) this.f19083a.mo56959Q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo55567s() {
        return mo55568t() && !mo55566r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo55569u() {
        long j;
        int l;
        long j2 = 0;
        if (this.f19083a.mo56989ad() >= 0 || this.f19083a.mo56990ae() >= 0) {
            int i = (this.f19083a.mo56989ad() > 0 ? 1 : (this.f19083a.mo56989ad() == 0 ? 0 : -1));
            C8350e eVar = this.f19083a;
            if (i >= 0) {
                j = eVar.mo56989ad();
            } else {
                C8345a aVar = (C8345a) eVar;
                if (this.f19221A > 0.0d) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) this.f19221A);
                }
                if (aVar.mo56991af() && ((l = (int) ((C8345a) this.f19083a).mo56924l()) > 0 || (l = (int) aVar.mo57021t()) > 0)) {
                    j2 += TimeUnit.SECONDS.toMillis((long) l);
                }
                j = (long) (((double) j2) * (((double) this.f19083a.mo56990ae()) / 100.0d));
            }
            mo55547b(j);
        }
    }

    /* renamed from: w */
    public void mo55571w() {
        super.mo55571w();
        this.f19227u.mo55526a(this.f19090h);
        this.f19092j = SystemClock.elapsedRealtime();
        this.f19232z = 100.0d;
    }

    /* renamed from: x */
    public void mo55645x() {
        this.f19225E = SystemClock.elapsedRealtime() - this.f19226F;
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f19225E + "ms");
        }
        this.f19086d.mo57138f();
        this.f19094l++;
        if (this.f19083a.mo57026y()) {
            mo55555h();
        } else {
            mo55646y();
        }
    }

    /* renamed from: y */
    public void mo55646y() {
        if (this.f19222B.compareAndSet(false, true)) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57818b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            mo55548b("javascript:al_showPostitial();");
            C8008m mVar = this.f19228v;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.f19229w;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C7888a aVar = this.f19230x;
            if (aVar != null) {
                aVar.mo55510b();
            }
            if (this.f19089g != null) {
                if (this.f19083a.mo57021t() >= 0) {
                    mo55541a(this.f19089g, this.f19083a.mo57021t(), new Runnable() {
                        public void run() {
                            C7959g.this.f19092j = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f19089g.setVisibility(0);
                }
            }
            this.f19088f.getController().mo55681n();
            mo55570v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo55647z() {
        this.f19224D = !this.f19224D;
        mo55548b("javascript:al_setVideoMuted(" + this.f19224D + ");");
        m23629d(this.f19224D);
        mo55546a(this.f19224D, 0);
    }
}
