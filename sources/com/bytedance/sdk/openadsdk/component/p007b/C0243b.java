package com.bytedance.sdk.openadsdk.component.p007b;

import android.content.Context;
import android.view.View;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p022f.C0489a;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.p053b.C0935a;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.component.b.b */
/* compiled from: TTFeedAdImpl */
class C0243b extends C0489a implements C10192c.C10195c, C10192c.C10196d, TTFeedAd, C0935a.C0936a {

    /* renamed from: a */
    C0935a f801a;

    /* renamed from: b */
    boolean f802b = false;

    /* renamed from: c */
    boolean f803c = true;

    /* renamed from: d */
    int f804d;

    /* renamed from: e */
    AdSlot f805e;

    /* renamed from: f */
    int f806f;

    /* renamed from: m */
    private TTFeedAd.VideoAdListener f807m;

    /* renamed from: n */
    private WeakReference<NativeVideoTsView> f808n;

    C0243b(Context context, C0477n nVar, int i, AdSlot adSlot) {
        super(context, nVar, i);
        this.f806f = i;
        this.f805e = adSlot;
        this.f801a = new C0935a();
        int f = C0996u.m4657f(this.f1772h);
        this.f804d = f;
        m943a(f);
        mo605a("embeded_ad");
    }

    public View getAdView() {
        NativeVideoTsView nativeVideoTsView;
        if (!(this.f1772h == null || this.f1773i == null)) {
            if (C0477n.m2012c(this.f1772h)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f1773i, this.f1772h, this.f1771g.mo1832a());
                    this.f808n = new WeakReference<>(nativeVideoTsView);
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.C0673a() {
                        /* renamed from: a */
                        public void mo618a(View view, int i) {
                            if (C0243b.this.f1771g != null) {
                                C0243b.this.f1771g.mo1833a(view, i);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.C0674b() {
                        /* renamed from: a */
                        public void mo619a(boolean z, long j, long j2, long j3, boolean z2) {
                            C0243b.this.f801a.f3246a = z;
                            C0243b.this.f801a.f3250e = j;
                            C0243b.this.f801a.f3251f = j2;
                            C0243b.this.f801a.f3252g = j3;
                            C0243b.this.f801a.f3249d = z2;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.f806f) {
                        nativeVideoTsView.setIsAutoPlay(this.f802b ? this.f805e.isAutoPlay() : this.f803c);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.f803c);
                    }
                    nativeVideoTsView.setIsQuiet(C0558m.m2673h().mo1676a(this.f804d));
                } catch (Exception unused) {
                }
                if (C0477n.m2012c(this.f1772h) || nativeVideoTsView == null || !nativeVideoTsView.mo2201a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (C0477n.m2012c(this.f1772h)) {
            }
        }
        return null;
    }

    public void play() {
        try {
            if (this.f808n != null && this.f808n.get() != null && this.f802b) {
                ((NativeVideoTsView) this.f808n.get()).mo2212m();
            }
        } catch (Throwable unused) {
        }
    }

    public void pause() {
        try {
            if (this.f808n != null && this.f808n.get() != null && this.f802b) {
                ((NativeVideoTsView) this.f808n.get()).mo2210k();
            }
        } catch (Throwable unused) {
        }
    }

    public double currentPlayTime() {
        try {
            if (this.f808n == null || this.f808n.get() == null || !this.f802b) {
                return 0.0d;
            }
            return ((NativeVideoTsView) this.f808n.get()).getCurrentPlayTime();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* renamed from: a */
    private void m943a(int i) {
        int c = C0558m.m2673h().mo1680c(i);
        if (3 == c) {
            this.f802b = false;
            this.f803c = false;
        } else if (4 == c) {
            this.f802b = true;
        } else {
            int c2 = C10642o.m31260c(C0558m.m2663a());
            if (1 == c && C0996u.m4656e(c2)) {
                this.f802b = false;
                this.f803c = true;
            } else if (2 == c) {
                if (C0996u.m4661f(c2) || C0996u.m4656e(c2) || C0996u.m4666g(c2)) {
                    this.f802b = false;
                    this.f803c = true;
                }
            } else if (5 != c) {
            } else {
                if (C0996u.m4656e(c2) || C0996u.m4666g(c2)) {
                    this.f803c = true;
                }
            }
        }
    }

    public void setVideoAdListener(TTFeedAd.VideoAdListener videoAdListener) {
        this.f807m = videoAdListener;
    }

    public double getVideoDuration() {
        if (this.f1772h == null || this.f1772h.mo1330J() == null) {
            return 0.0d;
        }
        return this.f1772h.mo1330J().mo62916f();
    }

    /* renamed from: e_ */
    public void mo611e_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onVideoLoad(this);
        }
    }

    /* renamed from: a */
    public void mo603a(int i, int i2) {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onVideoError(i, i2);
        }
    }

    /* renamed from: a_ */
    public void mo606a_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdStartPlay(this);
        }
    }

    /* renamed from: b_ */
    public void mo607b_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdPaused(this);
        }
    }

    /* renamed from: c_ */
    public void mo608c_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdContinuePlay(this);
        }
    }

    /* renamed from: a */
    public void mo604a(long j, long j2) {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onProgressUpdate(j, j2);
        }
    }

    /* renamed from: d_ */
    public void mo610d_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f807m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdComplete(this);
        }
    }

    /* renamed from: f */
    public C0935a mo612f() {
        return this.f801a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo605a(String str) {
        super.mo605a(str);
    }
}
