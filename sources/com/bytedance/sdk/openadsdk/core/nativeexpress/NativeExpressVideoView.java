package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.adexpress.p298b.C10286d;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundFrameLayout;
import com.bytedance.sdk.openadsdk.multipro.p053b.C0935a;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class NativeExpressVideoView extends NativeExpressView implements C10192c.C10195c, C10192c.C10196d, C0597j {

    /* renamed from: a */
    int f2109a = 1;

    /* renamed from: b */
    boolean f2110b = false;

    /* renamed from: c */
    boolean f2111c = true;

    /* renamed from: d */
    int f2112d;

    /* renamed from: e */
    boolean f2113e = true;

    /* renamed from: u */
    private ExpressVideoView f2114u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C0935a f2115v;

    /* renamed from: w */
    private long f2116w;

    /* renamed from: x */
    private long f2117x;

    /* renamed from: b */
    public void mo131b() {
    }

    /* renamed from: e */
    public void mo135e() {
    }

    public NativeExpressVideoView(Context context, C0477n nVar, AdSlot adSlot, String str) {
        super(context, nVar, adSlot, str, false);
        mo1876h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo1876h() {
        this.f2155k = new RoundFrameLayout(this.f2150f);
        int f = C0996u.m4657f(this.f2153i);
        this.f2112d = f;
        mo1874c(f);
        m2714o();
        addView(this.f2155k, new FrameLayout.LayoutParams(-1, -1));
        super.mo967g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    /* renamed from: o */
    private void m2714o() {
        try {
            this.f2115v = new C0935a();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.f2150f, this.f2153i, this.f2151g, this.f2161r);
            this.f2114u = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.f2114u.setControllerStatusCallBack(new NativeVideoTsView.C0674b() {
                /* renamed from: a */
                public void mo619a(boolean z, long j, long j2, long j3, boolean z2) {
                    NativeExpressVideoView.this.f2115v.f3246a = z;
                    NativeExpressVideoView.this.f2115v.f3250e = j;
                    NativeExpressVideoView.this.f2115v.f3251f = j2;
                    NativeExpressVideoView.this.f2115v.f3252g = j3;
                    NativeExpressVideoView.this.f2115v.f3249d = z2;
                }
            });
            this.f2114u.setVideoAdLoadListener(this);
            this.f2114u.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f2151g)) {
                this.f2114u.setIsAutoPlay(this.f2110b ? this.f2152h.isAutoPlay() : this.f2111c);
            } else if ("open_ad".equals(this.f2151g)) {
                this.f2114u.setIsAutoPlay(true);
            } else {
                this.f2114u.setIsAutoPlay(this.f2111c);
            }
            if ("open_ad".equals(this.f2151g)) {
                this.f2114u.setIsQuiet(true);
            } else {
                this.f2114u.setIsQuiet(C0558m.m2673h().mo1676a(this.f2112d));
            }
            this.f2114u.mo1863d();
        } catch (Exception unused) {
            this.f2114u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1874c(int i) {
        int c = C0558m.m2673h().mo1680c(i);
        if (3 == c) {
            this.f2110b = false;
            this.f2111c = false;
        } else if (4 == c) {
            this.f2110b = true;
        } else {
            int c2 = C10642o.m31260c(C0558m.m2663a());
            if (1 == c) {
                this.f2110b = false;
                this.f2111c = C0996u.m4656e(c2);
            } else if (2 == c) {
                if (C0996u.m4661f(c2) || C0996u.m4656e(c2) || C0996u.m4666g(c2)) {
                    this.f2110b = false;
                    this.f2111c = true;
                }
            } else if (5 == c && (C0996u.m4656e(c2) || C0996u.m4666g(c2))) {
                this.f2110b = false;
                this.f2111c = true;
            }
        }
        if (!this.f2111c) {
            this.f2109a = 3;
        }
        C10638l.m31238c("NativeVideoAdView", "mIsAutoPlay=" + this.f2111c + ",status=" + c);
    }

    public C0935a getVideoModel() {
        return this.f2115v;
    }

    public void setCanInterruptVideoPlay(boolean z) {
        ExpressVideoView expressVideoView = this.f2114u;
        if (expressVideoView != null) {
            expressVideoView.setCanInterruptVideoPlay(z);
        }
    }

    private void setShowAdInteractionView(boolean z) {
        ExpressVideoView expressVideoView = this.f2114u;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z);
        }
    }

    /* renamed from: a */
    public void mo966a(C10286d<? extends View> dVar, C10298m mVar) {
        this.f2163t = dVar;
        if ((this.f2163t instanceof C0604o) && ((C0604o) this.f2163t).mo2005p() != null) {
            ((C0604o) this.f2163t).mo2005p().mo2346a((C0597j) this);
        }
        if (mVar != null && mVar.mo63212a()) {
            m2711a(mVar);
        }
        super.mo966a(dVar, mVar);
    }

    /* renamed from: a */
    private void m2711a(final C10298m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m2713b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        NativeExpressVideoView.this.m2713b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2713b(C10298m mVar) {
        if (mVar != null) {
            double d = mVar.mo63221d();
            double e = mVar.mo63224e();
            double f = mVar.mo63226f();
            double g = mVar.mo63228g();
            int b = (int) C1002v.m4731b(this.f2150f, (float) d);
            int b2 = (int) C1002v.m4731b(this.f2150f, (float) e);
            int b3 = (int) C1002v.m4731b(this.f2150f, (float) f);
            int b4 = (int) C1002v.m4731b(this.f2150f, (float) g);
            float b5 = C1002v.m4731b(this.f2150f, mVar.mo63230i());
            float b6 = C1002v.m4731b(this.f2150f, mVar.mo63231j());
            float b7 = C1002v.m4731b(this.f2150f, mVar.mo63232k());
            float b8 = C1002v.m4731b(this.f2150f, mVar.mo63233l());
            C10638l.m31235b("ExpressView", "videoWidth:" + f);
            C10638l.m31235b("ExpressView", "videoHeight:" + g);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2155k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b3, b4);
            }
            layoutParams.width = b3;
            layoutParams.height = b4;
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b;
            this.f2155k.setLayoutParams(layoutParams);
            this.f2155k.removeAllViews();
            if (this.f2114u != null) {
                this.f2155k.addView(this.f2114u);
                ((RoundFrameLayout) this.f2155k).mo2417a(b5, b6, b7, b8);
                this.f2114u.mo2201a(0, true, false);
                mo1874c(this.f2112d);
                if (!C10642o.m31261d(this.f2150f) && !this.f2111c && this.f2113e) {
                    this.f2114u.mo1864e();
                }
                setShowAdInteractionView(false);
            }
        }
    }

    /* renamed from: a */
    public void mo130a(boolean z) {
        C10638l.m31235b("NativeExpressVideoView", "onMuteVideo,mute:" + z);
        ExpressVideoView expressVideoView = this.f2114u;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    /* renamed from: a */
    public void mo128a() {
        C10638l.m31235b("NativeExpressVideoView", "onSkipVideo");
    }

    /* renamed from: a */
    public void mo129a(int i) {
        C10638l.m31235b("NativeExpressVideoView", "onChangeVideoState,stateType:" + i);
        ExpressVideoView expressVideoView = this.f2114u;
        if (expressVideoView == null) {
            C10638l.m31242e("NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
        } else if (i == 1) {
            expressVideoView.mo2201a(0, true, false);
        } else if (i == 2 || i == 3) {
            this.f2114u.setCanInterruptVideoPlay(true);
            this.f2114u.performClick();
        } else if (i == 4) {
            expressVideoView.getNativeVideoController().mo2168f();
        } else if (i == 5) {
            expressVideoView.mo2201a(0, true, false);
        }
    }

    /* renamed from: a */
    public void mo965a(View view, int i, C10281b bVar) {
        if (i != -1 && bVar != null) {
            if (i != 4) {
                if (i != 11) {
                    super.mo965a(view, i, bVar);
                    return;
                }
            } else if (this.f2151g == "draw_ad") {
                ExpressVideoView expressVideoView = this.f2114u;
                if (expressVideoView != null) {
                    expressVideoView.performClick();
                    return;
                }
                return;
            }
            try {
                if (this.f2114u != null) {
                    this.f2114u.setCanInterruptVideoPlay(true);
                    this.f2114u.performClick();
                    if (this.f2156l) {
                        this.f2114u.findViewById(C10647t.m31283e(this.f2114u.getContext(), "tt_video_play")).setVisibility(0);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public long mo133c() {
        return this.f2116w;
    }

    /* renamed from: d */
    public int mo134d() {
        ExpressVideoView expressVideoView;
        if (this.f2109a == 3 && (expressVideoView = this.f2114u) != null) {
            expressVideoView.mo1863d();
        }
        ExpressVideoView expressVideoView2 = this.f2114u;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().mo2172r()) {
            return this.f2109a;
        }
        return 1;
    }

    /* renamed from: a_ */
    public void mo606a_() {
        this.f2113e = false;
        C10638l.m31235b("NativeExpressVideoView", "onVideoAdStartPlay");
        if (this.f2154j != null) {
            this.f2154j.onVideoAdStartPlay();
        }
        this.f2109a = 2;
    }

    /* renamed from: b_ */
    public void mo607b_() {
        this.f2113e = false;
        C10638l.m31235b("NativeExpressVideoView", "onVideoAdPaused");
        if (this.f2154j != null) {
            this.f2154j.onVideoAdPaused();
        }
        this.f2156l = true;
        this.f2109a = 3;
    }

    /* renamed from: c_ */
    public void mo608c_() {
        this.f2113e = false;
        C10638l.m31235b("NativeExpressVideoView", "onVideoAdContinuePlay");
        if (this.f2154j != null) {
            this.f2154j.onVideoAdContinuePlay();
        }
        this.f2156l = false;
        this.f2109a = 2;
    }

    /* renamed from: a */
    public void mo604a(long j, long j2) {
        this.f2113e = false;
        if (this.f2154j != null) {
            this.f2154j.onProgressUpdate(j, j2);
        }
        int i = this.f2109a;
        if (!(i == 5 || i == 3 || j <= this.f2116w)) {
            this.f2109a = 2;
        }
        this.f2116w = j;
        this.f2117x = j2;
        if (this.f2162s != null && this.f2162s.mo63164d() != null) {
            this.f2162s.mo63164d().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
    }

    /* renamed from: d_ */
    public void mo610d_() {
        this.f2113e = false;
        C10638l.m31235b("NativeExpressVideoView", "onVideoComplete");
        if (this.f2154j != null) {
            this.f2154j.onVideoAdComplete();
        }
        this.f2109a = 5;
        if (this.f2162s != null && this.f2162s.mo63164d() != null) {
            this.f2162s.mo63164d().mo1884f();
        }
    }

    /* renamed from: e_ */
    public void mo611e_() {
        C10638l.m31235b("NativeExpressVideoView", "onVideoLoad");
        if (this.f2154j != null) {
            this.f2154j.onVideoLoad();
        }
    }

    /* renamed from: a */
    public void mo603a(int i, int i2) {
        C10638l.m31235b("NativeExpressVideoView", "onVideoError,errorCode:" + i + ",extraCode:" + i2);
        if (this.f2154j != null) {
            this.f2154j.onVideoError(i, i2);
        }
        this.f2116w = this.f2117x;
        this.f2109a = 4;
    }
}
