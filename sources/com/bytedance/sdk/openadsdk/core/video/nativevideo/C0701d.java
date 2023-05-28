package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p271vk.openvk.component.video.api.p287b.C10185a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10189a;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bykv.p271vk.openvk.component.video.api.renderview.C10205a;
import com.bykv.p271vk.openvk.component.video.api.renderview.C10206b;
import com.bykv.p271vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.p271vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bykv.p271vk.openvk.component.video.p272a.p285e.C10177b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.C0739d;
import com.bytedance.sdk.openadsdk.core.widget.C0742e;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.d */
/* compiled from: NativeVideoLayout */
public class C0701d implements C10185a, C10190b<C0477n>, C10205a, C10652x.C10653a, C0739d.C0741a, C0742e.C0745b {

    /* renamed from: A */
    C0675a f2616A;

    /* renamed from: B */
    boolean f2617B;

    /* renamed from: C */
    C1008c f2618C;

    /* renamed from: D */
    C10192c f2619D;

    /* renamed from: E */
    C0405a f2620E;

    /* renamed from: F */
    C0405a f2621F;

    /* renamed from: G */
    boolean f2622G;

    /* renamed from: H */
    private View f2623H;

    /* renamed from: I */
    private TextView f2624I;

    /* renamed from: J */
    private TextView f2625J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public NativeVideoTsView.C0673a f2626K;

    /* renamed from: L */
    private final String f2627L;

    /* renamed from: a */
    View f2628a;

    /* renamed from: b */
    C10206b f2629b;

    /* renamed from: c */
    ImageView f2630c;

    /* renamed from: d */
    View f2631d;

    /* renamed from: e */
    View f2632e;

    /* renamed from: f */
    ImageView f2633f;

    /* renamed from: g */
    ViewStub f2634g;

    /* renamed from: h */
    View f2635h;

    /* renamed from: i */
    ImageView f2636i;

    /* renamed from: j */
    View f2637j;

    /* renamed from: k */
    RoundImageView f2638k;

    /* renamed from: l */
    TextView f2639l;

    /* renamed from: m */
    TextView f2640m;

    /* renamed from: n */
    TextView f2641n;

    /* renamed from: o */
    ViewStub f2642o;

    /* renamed from: p */
    int f2643p;

    /* renamed from: q */
    int f2644q;

    /* renamed from: r */
    int f2645r;

    /* renamed from: s */
    int f2646s;

    /* renamed from: t */
    boolean f2647t;

    /* renamed from: u */
    boolean f2648u;

    /* renamed from: v */
    int f2649v;

    /* renamed from: w */
    EnumSet<C10190b.C10191a> f2650w;

    /* renamed from: x */
    C0477n f2651x;

    /* renamed from: y */
    Context f2652y;

    /* renamed from: z */
    C0742e f2653z;

    /* renamed from: a */
    public void mo2264a(long j) {
    }

    /* renamed from: a */
    public void mo2265a(long j, long j2) {
    }

    /* renamed from: a */
    public void mo5a(Message message) {
    }

    /* renamed from: a */
    public void mo2267a(View view, boolean z) {
    }

    /* renamed from: a */
    public void mo2268a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo2271a(String str) {
    }

    /* renamed from: b */
    public void mo2314b(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: b */
    public void mo2315b(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    /* renamed from: b */
    public void mo2274b(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo2275b(boolean z) {
    }

    /* renamed from: b */
    public boolean mo2276b(int i) {
        return false;
    }

    /* renamed from: c */
    public void mo2278c(boolean z) {
    }

    /* renamed from: e */
    public void mo2280e() {
    }

    /* renamed from: f */
    public void mo2281f() {
    }

    /* renamed from: j */
    public boolean mo2285j() {
        return false;
    }

    /* renamed from: n */
    public void mo2289n() {
    }

    public C0701d(Context context, View view, boolean z, EnumSet<C10190b.C10191a> enumSet, C0477n nVar, C10192c cVar, boolean z2) {
        this.f2647t = true;
        this.f2617B = true;
        this.f2622G = true;
        this.f2627L = Build.MODEL;
        if (!(this instanceof C0693c)) {
            this.f2652y = C0558m.m2663a().getApplicationContext();
            mo2322d(z2);
            this.f2628a = view;
            this.f2647t = z;
            this.f2650w = enumSet == null ? EnumSet.noneOf(C10190b.C10191a.class) : enumSet;
            this.f2619D = cVar;
            this.f2651x = nVar;
            mo2277c(8);
            mo2266a(context, this.f2628a);
            mo2279d();
            mo2323p();
        }
    }

    public C0701d(Context context, View view, boolean z, EnumSet<C10190b.C10191a> enumSet, C0477n nVar, C10192c cVar) {
        this(context, view, z, enumSet, nVar, cVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2323p() {
        int i;
        String str;
        C0405a aVar;
        String str2 = this.f2617B ? "embeded_ad" : "embeded_ad_landingpage";
        if (C0996u.m4637b(this.f2651x)) {
            str = this.f2617B ? "draw_ad" : "draw_ad_landingpage";
            i = 6;
        } else if (C0996u.m4644c(this.f2651x)) {
            str = "rewarded_video";
            i = 7;
        } else if (C0996u.m4650d(this.f2651x)) {
            str = "fullscreen_interstitial_ad";
            i = 5;
        } else {
            str = str2;
            i = 1;
        }
        if (this.f2651x.mo1332L() == 4) {
            this.f2618C = C1009d.m4776a(this.f2652y, this.f2651x, str);
        }
        m3529z();
        C0405a aVar2 = new C0405a(this.f2652y, this.f2651x, str, i);
        this.f2620E = aVar2;
        aVar2.mo1093b(true);
        if (this.f2617B) {
            this.f2620E.mo1091a(true);
        } else {
            this.f2620E.mo1091a(false);
            this.f2620E.mo1095c(true);
        }
        this.f2620E.mo1101a(this.f2619D);
        this.f2620E.mo1116d(true);
        this.f2620E.mo1104a((C0406b.C0407a) new C0406b.C0407a() {
            /* renamed from: a */
            public void mo28a(View view, int i) {
                if (C0701d.this.f2626K != null) {
                    C0701d.this.f2626K.mo618a(view, i);
                }
            }
        });
        C1008c cVar = this.f2618C;
        if (!(cVar == null || (aVar = this.f2620E) == null)) {
            aVar.mo1106a(cVar);
        }
        if (m3528y()) {
            C07032 r3 = new C0405a(this.f2652y, this.f2651x, str, i) {
                /* renamed from: b */
                public boolean mo1094b() {
                    boolean a = C0701d.this.f2653z != null ? C0701d.this.f2653z.mo2503a() : false;
                    StringBuilder sb = new StringBuilder();
                    sb.append("isVisible=");
                    sb.append(a);
                    sb.append(",mPlayBtn.getVisibility() == VISIBLE->");
                    sb.append(C0701d.this.f2630c.getVisibility() == 0);
                    C10638l.m31238c("ClickCreativeListener", sb.toString());
                    if (a || C0701d.this.f2630c.getVisibility() == 0) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: c */
                public boolean mo1096c() {
                    return (C0701d.this.f2635h != null && C0701d.this.f2635h.getVisibility() == 0) || (C0701d.this.f2637j != null && C0701d.this.f2637j.getVisibility() == 0) || ((C0701d.this.f2638k != null && C0701d.this.f2638k.getVisibility() == 0) || (C0701d.this.f2639l != null && C0701d.this.f2639l.getVisibility() == 0));
                }
            };
            this.f2621F = r3;
            r3.mo1104a((C0406b.C0407a) new C0406b.C0407a() {
                /* renamed from: a */
                public void mo28a(View view, int i) {
                    if (C0701d.this.f2626K != null) {
                        C0701d.this.f2626K.mo618a(view, i);
                    }
                }
            });
            this.f2621F.mo1093b(true);
            if (this.f2617B) {
                this.f2621F.mo1091a(true);
            } else {
                this.f2621F.mo1091a(false);
            }
            this.f2621F.mo1101a(this.f2619D);
            this.f2621F.mo1116d(true);
            C1008c cVar2 = this.f2618C;
            if (cVar2 != null) {
                this.f2621F.mo1106a(cVar2);
            }
            View view = this.f2628a;
            if (view != null) {
                view.setOnClickListener(this.f2621F);
                this.f2628a.setOnTouchListener(this.f2621F);
            }
        }
    }

    /* renamed from: y */
    private boolean m3528y() {
        return C0477n.m2012c(this.f2651x) && this.f2651x.mo1327G() == null && this.f2651x.mo1459p() == 1;
    }

    /* renamed from: a */
    public void mo2308a(NativeVideoTsView.C0673a aVar) {
        this.f2626K = aVar;
    }

    /* renamed from: a */
    public void mo2307a(TTNativeAd tTNativeAd) {
        C0405a aVar = this.f2620E;
        if (aVar != null) {
            aVar.mo1102a(tTNativeAd);
        }
        C0405a aVar2 = this.f2621F;
        if (aVar2 != null) {
            aVar2.mo1102a(tTNativeAd);
        }
    }

    /* renamed from: z */
    private void m3529z() {
        if (this.f2652y != null && this.f2628a != null) {
            C07054 r0 = new View(this.f2652y) {
                /* renamed from: a */
                private void m3596a() {
                }

                /* renamed from: b */
                private void m3597b() {
                }

                public void onFinishTemporaryDetach() {
                    super.onFinishTemporaryDetach();
                    m3596a();
                }

                /* access modifiers changed from: protected */
                public void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    m3597b();
                }

                public void onStartTemporaryDetach() {
                    super.onStartTemporaryDetach();
                    m3597b();
                }
            };
            View view = this.f2628a;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(r0, 0, new RelativeLayout.LayoutParams(0, 0));
            }
        }
    }

    /* renamed from: q */
    public C10206b mo2324q() {
        return this.f2629b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2266a(Context context, View view) {
        View view2;
        long currentTimeMillis = System.currentTimeMillis();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        C10192c cVar = this.f2619D;
        if (cVar == null || !cVar.mo2118s()) {
            view2 = new SSRenderSurfaceView(this.f2652y);
            C10638l.m31235b("NewLiveViewLayout", "use SurfaceView......");
        } else {
            view2 = new SSRenderTextureView(this.f2652y);
            C10638l.m31235b("NewLiveViewLayout", "use TextureView......");
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(view2, 0, layoutParams);
        }
        C1002v.m4716a(view2, 8);
        this.f2629b = (C10206b) view2;
        this.f2630c = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_play"));
        this.f2631d = view.findViewById(C10647t.m31283e(context, "tt_video_loading_retry_layout"));
        this.f2632e = view.findViewById(C10647t.m31283e(context, "tt_video_loading_progress"));
        this.f2633f = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_loading_cover_image"));
        this.f2634g = (ViewStub) view.findViewById(C10647t.m31283e(context, "tt_video_ad_cover"));
        this.f2642o = (ViewStub) view.findViewById(C10647t.m31283e(context, "tt_video_draw_layout_viewStub"));
        C10638l.m31235b("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2305a(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f2634g) != null && viewStub.getParent() != null && this.f2635h == null) {
            this.f2635h = this.f2634g.inflate();
            this.f2636i = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_finish_cover_image"));
            this.f2637j = view.findViewById(C10647t.m31283e(context, "tt_video_ad_cover_center_layout"));
            this.f2638k = (RoundImageView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_logo_image"));
            this.f2639l = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_btn_ad_image_tv"));
            this.f2640m = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_name"));
            this.f2641n = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_button"));
        }
    }

    /* renamed from: b */
    private void m3525b(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f2642o) != null && viewStub.getParent() != null && this.f2623H == null) {
            this.f2642o.inflate();
            this.f2623H = view.findViewById(C10647t.m31283e(context, "tt_video_ad_cover_center_layout_draw"));
            this.f2624I = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_button_draw"));
            this.f2625J = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_replay"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2325r() {
        if (this.f2616A != null && this.f2653z == null) {
            long currentTimeMillis = System.currentTimeMillis();
            C0742e eVar = new C0742e();
            this.f2653z = eVar;
            eVar.mo2500a(this.f2652y, this.f2628a);
            this.f2653z.mo2501a(this.f2616A, (C0742e.C0745b) this);
            C10638l.m31235b("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: a */
    public boolean mo2310a(int i, C10187b bVar, boolean z) {
        C0742e eVar = this.f2653z;
        return eVar == null || eVar.mo2504a(i, bVar, z);
    }

    /* renamed from: s */
    public void mo2326s() {
        C0742e eVar = this.f2653z;
        if (eVar != null) {
            eVar.mo2502a(false);
        }
    }

    /* renamed from: a */
    public void mo2306a(C10189a aVar) {
        if (aVar instanceof C0675a) {
            this.f2616A = (C0675a) aVar;
            mo2325r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo2327t() {
        if (this.f2616A != null) {
            return true;
        }
        C10638l.m31242e("NewLiveViewLayout", "callback is null");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2279d() {
        this.f2629b.mo62972a(this);
        this.f2630c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!C0701d.this.mo2327t()) {
                    return;
                }
                if (C0701d.this.f2641n == null || C0701d.this.f2641n.getVisibility() != 0) {
                    C0701d.this.f2616A.mo2145a((C10190b) C0701d.this, view);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo2321d(int i) {
        C1002v.m4716a(this.f2628a, 0);
        C10206b bVar = this.f2629b;
        if (bVar != null) {
            bVar.setVisibility(i);
        }
    }

    /* renamed from: d */
    public void mo2322d(boolean z) {
        this.f2617B = z;
        if (z) {
            C0405a aVar = this.f2620E;
            if (aVar != null) {
                aVar.mo1091a(true);
            }
            C0405a aVar2 = this.f2621F;
            if (aVar2 != null) {
                aVar2.mo1091a(true);
                return;
            }
            return;
        }
        C0405a aVar3 = this.f2620E;
        if (aVar3 != null) {
            aVar3.mo1091a(false);
        }
        C0405a aVar4 = this.f2621F;
        if (aVar4 != null) {
            aVar4.mo1091a(false);
        }
    }

    /* renamed from: a */
    public void mo2300a(int i, int i2) {
        if (i == -1) {
            i = C1002v.m4740c(this.f2652y);
        }
        if (i > 0) {
            this.f2643p = i;
            if (mo2286k() || mo2285j() || this.f2650w.contains(C10190b.C10191a.fixedSize)) {
                this.f2644q = i2;
            } else {
                this.f2644q = m3526e(i);
            }
            mo2313b(this.f2643p, this.f2644q);
        }
    }

    /* renamed from: b */
    public void mo2317b(boolean z, boolean z2) {
        ImageView imageView = this.f2630c;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageResource(C10647t.m31282d(this.f2652y, "tt_play_movebar_textpage"));
        } else {
            imageView.setImageResource(C10647t.m31282d(this.f2652y, "tt_stop_movebar_textpage"));
        }
    }

    /* renamed from: b */
    public void mo2313b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f2628a.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.f2628a.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private int m3526e(int i) {
        if (this.f2645r <= 0 || this.f2646s <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.f2652y.getResources().getDimensionPixelSize(C10647t.m31287i(this.f2652y, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.f2652y.getResources().getDimensionPixelSize(C10647t.m31287i(this.f2652y, "tt_video_container_minheight"));
        int i2 = (int) (((float) this.f2646s) * ((((float) i) * 1.0f) / ((float) this.f2645r)));
        if (i2 > dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return i2 < dimensionPixelSize2 ? dimensionPixelSize2 : i2;
    }

    /* renamed from: c */
    public void mo2319c(int i, int i2) {
        this.f2645r = i;
        this.f2646s = i2;
    }

    /* renamed from: a */
    public void mo2263a(int i) {
        C10638l.m31238c("Progress", "setSeekProgress-percent=" + i);
    }

    /* renamed from: c */
    public void mo2320c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            if (this.f2628a.getParent() == null) {
                viewGroup.addView(this.f2628a);
            }
            mo2277c(0);
        }
    }

    /* renamed from: c */
    public View mo2318c() {
        return this.f2628a;
    }

    /* renamed from: g */
    public void mo2282g() {
        C0477n nVar;
        C1002v.m4752f(this.f2631d);
        C1002v.m4752f(this.f2632e);
        if (!(this.f2633f == null || (nVar = this.f2651x) == null || nVar.mo1330J() == null || this.f2651x.mo1330J().mo62921h() == null)) {
            C1002v.m4752f((View) this.f2633f);
            C0835d.m4093a().mo2659a(this.f2651x.mo1330J().mo62921h(), this.f2633f);
        }
        if (this.f2630c.getVisibility() == 0) {
            C1002v.m4716a((View) this.f2630c, 8);
        }
    }

    /* renamed from: u */
    public void mo2328u() {
        C1002v.m4752f(this.f2631d);
        C1002v.m4752f(this.f2632e);
        if (this.f2630c.getVisibility() == 0) {
            C1002v.m4716a((View) this.f2630c, 8);
        }
    }

    /* renamed from: a */
    public void mo2262a() {
        mo2272a(false, this.f2647t);
        mo2330w();
    }

    /* renamed from: v */
    public void mo2329v() {
        C1002v.m4716a(this.f2628a, 0);
        C10206b bVar = this.f2629b;
        if (bVar != null) {
            C1002v.m4716a(bVar.getView(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2330w() {
        try {
            C1002v.m4716a(this.f2635h, 8);
            C1002v.m4716a((View) this.f2636i, 8);
            C1002v.m4716a(this.f2637j, 8);
            C1002v.m4716a((View) this.f2638k, 8);
            C1002v.m4716a((View) this.f2639l, 8);
            C1002v.m4716a((View) this.f2640m, 8);
            C1002v.m4716a((View) this.f2641n, 8);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m3527f(int i) {
        C1002v.m4716a(this.f2637j, i);
        C1002v.m4716a(this.f2623H, i);
    }

    /* renamed from: a */
    public void mo2309a(boolean z) {
        this.f2622G = z;
    }

    /* renamed from: a */
    public void mo2270a(C0477n nVar, WeakReference<Context> weakReference, boolean z) {
        String str;
        C0477n nVar2;
        C0477n nVar3;
        C0477n nVar4;
        if (nVar != null) {
            mo2272a(false, this.f2647t);
            mo2305a(this.f2628a, C0558m.m2663a());
            View view = this.f2635h;
            if (view != null) {
                C1002v.m4716a(view, 0);
            }
            ImageView imageView = this.f2636i;
            if (imageView != null) {
                C1002v.m4716a((View) imageView, 0);
            }
            if (C0996u.m4637b(this.f2651x)) {
                m3525b(this.f2628a, C0558m.m2663a());
                C1002v.m4716a(this.f2637j, 8);
                C1002v.m4716a((View) this.f2636i, 0);
                C1002v.m4716a(this.f2623H, 0);
                C1002v.m4716a((View) this.f2624I, 0);
                C1002v.m4716a((View) this.f2625J, 0);
                if (this.f2625J != null && C10642o.m31260c(C0558m.m2663a()) == 0) {
                    C1002v.m4716a((View) this.f2625J, 8);
                }
                View view2 = this.f2635h;
                if (view2 != null) {
                    view2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (C0701d.this.f2619D != null) {
                                ((C10189a) C0701d.this.f2619D).mo2141a();
                            }
                        }
                    });
                }
                if (!(this.f2636i == null || (nVar4 = this.f2651x) == null || nVar4.mo1330J() == null || this.f2651x.mo1330J().mo62921h() == null)) {
                    C10177b.m29071a((long) this.f2651x.mo1330J().mo62916f(), this.f2651x.mo1330J().mo62923i(), new C10177b.C10179b() {
                        /* renamed from: a */
                        public void mo2337a(Bitmap bitmap) {
                            if (bitmap != null) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C0701d.this.f2636i.getLayoutParams();
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    layoutParams.width = C1002v.m4740c(C0558m.m2663a());
                                    layoutParams.height = (int) ((float) ((bitmap.getHeight() * C1002v.m4740c(C0558m.m2663a())) / bitmap.getWidth()));
                                    layoutParams.addRule(13);
                                    C0701d.this.f2636i.setLayoutParams(layoutParams);
                                }
                                C0701d.this.f2636i.setImageBitmap(bitmap);
                                return;
                            }
                            C0835d.m4093a().mo2659a(C0701d.this.f2651x.mo1330J().mo62921h(), C0701d.this.f2636i);
                        }
                    });
                }
            } else {
                C1002v.m4716a(this.f2637j, 0);
                if (!(this.f2636i == null || (nVar3 = this.f2651x) == null || nVar3.mo1330J() == null || this.f2651x.mo1330J().mo62921h() == null)) {
                    C0835d.m4093a().mo2659a(this.f2651x.mo1330J().mo62921h(), this.f2636i);
                }
            }
            if (!TextUtils.isEmpty(nVar.mo1331K())) {
                str = nVar.mo1331K();
            } else if (!TextUtils.isEmpty(nVar.mo1341U())) {
                str = nVar.mo1341U();
            } else {
                str = !TextUtils.isEmpty(nVar.mo1342V()) ? nVar.mo1342V() : "";
            }
            if (this.f2638k != null && (nVar2 = this.f2651x) != null && nVar2.mo1333M() != null && this.f2651x.mo1333M().mo1281a() != null) {
                C1002v.m4716a((View) this.f2638k, 0);
                C1002v.m4716a((View) this.f2639l, 4);
                C0835d.m4093a().mo2658a(this.f2651x.mo1333M(), (ImageView) this.f2638k);
                if (m3528y()) {
                    this.f2638k.setOnClickListener(this.f2621F);
                    this.f2638k.setOnTouchListener(this.f2621F);
                } else {
                    this.f2638k.setOnClickListener(this.f2620E);
                    this.f2638k.setOnTouchListener(this.f2620E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                C1002v.m4716a((View) this.f2638k, 4);
                C1002v.m4716a((View) this.f2639l, 0);
                TextView textView = this.f2639l;
                if (textView != null) {
                    textView.setText(str.substring(0, 1));
                    if (m3528y()) {
                        this.f2639l.setOnClickListener(this.f2621F);
                        this.f2639l.setOnTouchListener(this.f2621F);
                    } else {
                        this.f2639l.setOnClickListener(this.f2620E);
                        this.f2639l.setOnTouchListener(this.f2620E);
                    }
                }
            }
            if (this.f2640m != null && !TextUtils.isEmpty(str)) {
                this.f2640m.setText(str);
            }
            C1002v.m4716a((View) this.f2640m, 0);
            C1002v.m4716a((View) this.f2641n, 0);
            String W = nVar.mo1343W();
            if (TextUtils.isEmpty(W)) {
                int L = nVar.mo1332L();
                if (L == 2 || L == 3) {
                    W = C10647t.m31276a(this.f2652y, "tt_video_mobile_go_detail");
                } else if (L != 4) {
                    W = L != 5 ? C10647t.m31276a(this.f2652y, "tt_video_mobile_go_detail") : C10647t.m31276a(this.f2652y, "tt_video_dial_phone");
                } else {
                    W = C10647t.m31276a(this.f2652y, "tt_video_download_apk");
                }
            }
            TextView textView2 = this.f2641n;
            if (textView2 != null) {
                textView2.setText(W);
                this.f2641n.setOnClickListener(this.f2620E);
                this.f2641n.setOnTouchListener(this.f2620E);
            }
            TextView textView3 = this.f2624I;
            if (textView3 != null) {
                textView3.setText(W);
                this.f2624I.setOnClickListener(this.f2620E);
                this.f2624I.setOnTouchListener(this.f2620E);
            }
            if (!this.f2622G) {
                m3527f(4);
            }
        }
    }

    /* renamed from: b */
    public void mo2312b() {
        C1002v.m4750e(this.f2631d);
        C1002v.m4750e(this.f2632e);
        ImageView imageView = this.f2633f;
        if (imageView != null) {
            C1002v.m4750e((View) imageView);
        }
    }

    /* renamed from: h */
    public void mo2283h() {
        C1002v.m4750e(this.f2631d);
    }

    /* renamed from: a */
    public void mo2303a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f2629b.getHolder()) {
            this.f2648u = true;
            if (mo2327t()) {
                this.f2616A.mo2095a((C10190b) this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public void mo2304a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f2629b.getHolder() && mo2327t()) {
            this.f2616A.mo2096a(this, surfaceHolder, i, i2, i3);
        }
    }

    /* renamed from: b */
    public void mo2316b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f2629b.getHolder()) {
            this.f2648u = false;
            if (mo2327t()) {
                this.f2616A.mo2101b((C10190b) this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public void mo2301a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f2648u = true;
        if (mo2327t()) {
            this.f2616A.mo2094a((C10190b) this, surfaceTexture);
        }
    }

    /* renamed from: a */
    public boolean mo2311a(SurfaceTexture surfaceTexture) {
        this.f2648u = false;
        if (!mo2327t()) {
            return true;
        }
        this.f2616A.mo2100b((C10190b) this, surfaceTexture);
        return true;
    }

    /* renamed from: i */
    public void mo2284i() {
        mo2277c(8);
        if (mo2331x()) {
            this.f2629b.setVisibility(8);
        }
        ImageView imageView = this.f2633f;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        mo2277c(8);
        C1002v.m4716a(this.f2635h, 8);
        C1002v.m4716a((View) this.f2636i, 8);
        C1002v.m4716a(this.f2637j, 8);
        C1002v.m4716a((View) this.f2638k, 8);
        C1002v.m4716a((View) this.f2639l, 8);
        C1002v.m4716a((View) this.f2640m, 8);
        C0742e eVar = this.f2653z;
        if (eVar != null) {
            eVar.mo2502a(true);
        }
    }

    /* renamed from: k */
    public boolean mo2286k() {
        return this.f2647t;
    }

    /* renamed from: a */
    public void mo2273a(boolean z, boolean z2, boolean z3) {
        C1002v.m4716a((View) this.f2630c, (!z || this.f2631d.getVisibility() == 0) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo2272a(boolean z, boolean z2) {
        C1002v.m4716a((View) this.f2630c, 8);
    }

    /* renamed from: l */
    public void mo2287l() {
        mo2272a(true, false);
    }

    /* renamed from: m */
    public boolean mo2288m() {
        return this.f2648u;
    }

    /* renamed from: c */
    public void mo2277c(int i) {
        this.f2649v = i;
        C1002v.m4716a(this.f2628a, i);
    }

    /* renamed from: o */
    public boolean mo2290o() {
        C0742e eVar = this.f2653z;
        return eVar != null && eVar.mo2503a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2331x() {
        return !this.f2650w.contains(C10190b.C10191a.alwayShowMediaView) || this.f2647t;
    }

    /* renamed from: a */
    public void mo2302a(Drawable drawable) {
        View view = this.f2628a;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }
}
