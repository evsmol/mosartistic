package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0746x;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0604o;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0676b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeVideoTsView extends FrameLayout implements C10192c.C10193a, C10652x.C10653a, C0676b.C0692a {

    /* renamed from: v */
    private static Integer f2469v = 0;

    /* renamed from: w */
    private static Integer f2470w = 1;

    /* renamed from: A */
    private long f2471A;

    /* renamed from: B */
    private boolean f2472B;

    /* renamed from: C */
    private final C10652x f2473C;

    /* renamed from: D */
    private boolean f2474D;

    /* renamed from: E */
    private final String f2475E;

    /* renamed from: F */
    private ViewStub f2476F;

    /* renamed from: G */
    private C10192c.C10195c f2477G;

    /* renamed from: H */
    private boolean f2478H;

    /* renamed from: I */
    private final AtomicBoolean f2479I;

    /* renamed from: J */
    private boolean f2480J;

    /* renamed from: K */
    private AtomicBoolean f2481K;

    /* renamed from: a */
    protected final C0477n f2482a;

    /* renamed from: b */
    protected C10192c f2483b;

    /* renamed from: c */
    protected FrameLayout f2484c;

    /* renamed from: d */
    protected boolean f2485d;

    /* renamed from: e */
    public boolean f2486e;

    /* renamed from: f */
    public C0146j f2487f;

    /* renamed from: g */
    protected RelativeLayout f2488g;

    /* renamed from: h */
    protected ImageView f2489h;

    /* renamed from: i */
    protected ImageView f2490i;

    /* renamed from: j */
    protected ImageView f2491j;

    /* renamed from: k */
    protected boolean f2492k;

    /* renamed from: l */
    protected String f2493l;

    /* renamed from: m */
    protected int f2494m;

    /* renamed from: n */
    AtomicBoolean f2495n;

    /* renamed from: o */
    boolean f2496o;

    /* renamed from: p */
    public C0674b f2497p;

    /* renamed from: q */
    private final Context f2498q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ViewGroup f2499r;

    /* renamed from: s */
    private boolean f2500s;

    /* renamed from: t */
    private boolean f2501t;

    /* renamed from: u */
    private String f2502u;

    /* renamed from: x */
    private boolean f2503x;

    /* renamed from: y */
    private boolean f2504y;

    /* renamed from: z */
    private boolean f2505z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView$a */
    public interface C0673a {
        /* renamed from: a */
        void mo618a(View view, int i);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView$b */
    public interface C0674b {
        /* renamed from: a */
        void mo619a(boolean z, long j, long j2, long j3, boolean z2);
    }

    /* renamed from: a */
    public void mo32a() {
    }

    /* renamed from: b */
    public void mo35b(long j, int i) {
    }

    public void setIsNeedShowDetail(boolean z) {
        this.f2478H = z;
    }

    public void setAdCreativeClickListener(C0673a aVar) {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            ((C0676b) cVar).mo2239a(aVar);
        }
    }

    public void setControllerStatusCallBack(C0674b bVar) {
        this.f2497p = bVar;
    }

    /* renamed from: a */
    public void mo33a(long j, int i) {
        C10192c.C10195c cVar = this.f2477G;
        if (cVar != null) {
            cVar.mo610d_();
        }
    }

    /* renamed from: d */
    private void mo1863d() {
        mo33a(0, 0);
        this.f2477G = null;
    }

    /* renamed from: a */
    public void mo34a(long j, long j2) {
        C10192c.C10195c cVar = this.f2477G;
        if (cVar != null) {
            cVar.mo604a(j, j2);
        }
    }

    public NativeVideoTsView(Context context, C0477n nVar, boolean z, C0146j jVar) {
        this(context, nVar, z, "embeded_ad", false, false, jVar);
    }

    public NativeVideoTsView(Context context, C0477n nVar, String str, boolean z, boolean z2, C0146j jVar) {
        this(context, nVar, false, str, z, z2, jVar);
    }

    public NativeVideoTsView(Context context, C0477n nVar, C0146j jVar) {
        this(context, nVar, false, jVar);
    }

    public NativeVideoTsView(Context context, C0477n nVar, boolean z, String str, boolean z2, boolean z3, C0146j jVar) {
        super(context);
        this.f2500s = true;
        this.f2485d = true;
        this.f2501t = false;
        this.f2486e = false;
        this.f2503x = false;
        this.f2504y = true;
        this.f2492k = true;
        this.f2493l = "embeded_ad";
        this.f2494m = 50;
        this.f2505z = true;
        this.f2495n = new AtomicBoolean(false);
        this.f2472B = false;
        this.f2473C = new C10652x(this);
        this.f2474D = false;
        this.f2475E = Build.MODEL;
        this.f2496o = false;
        this.f2478H = true;
        this.f2479I = new AtomicBoolean(false);
        this.f2480J = true;
        this.f2481K = new AtomicBoolean(false);
        if (jVar != null) {
            this.f2487f = jVar;
        }
        this.f2493l = str;
        this.f2498q = context;
        this.f2482a = nVar;
        this.f2501t = z;
        setContentDescription("NativeVideoAdView");
        this.f2503x = z2;
        this.f2504y = z3;
        mo1861b();
        mo1864e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1861b() {
        C0477n nVar = this.f2482a;
        if (nVar != null) {
            int f = C0996u.m4657f(nVar);
            int c = C0558m.m2673h().mo1680c(f);
            int c2 = C10642o.m31260c(C0558m.m2663a());
            if (c == 1) {
                this.f2500s = C0996u.m4656e(c2);
            } else if (c == 2) {
                this.f2500s = C0996u.m4661f(c2) || C0996u.m4656e(c2) || C0996u.m4666g(c2);
            } else if (c == 3) {
                this.f2500s = false;
            } else if (c == 4) {
                this.f2496o = true;
            } else if (c == 5) {
                this.f2500s = C0996u.m4656e(c2) || C0996u.m4666g(c2);
            }
            if (this.f2501t) {
                this.f2485d = false;
            } else if (!this.f2486e || !C0604o.m2910b(this.f2493l)) {
                this.f2485d = C0558m.m2673h().mo1676a(f);
            }
            if ("open_ad".equals(this.f2493l)) {
                this.f2500s = true;
                this.f2485d = true;
            }
            C10192c cVar = this.f2483b;
            if (cVar != null) {
                cVar.mo2164d(this.f2500s);
            }
            this.f2486e = true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0674b bVar;
        C10192c cVar;
        if (!(this.f2501t || (bVar = this.f2497p) == null || (cVar = this.f2483b) == null)) {
            bVar.mo619a(cVar.mo2117q(), this.f2483b.mo2112j(), this.f2483b.mo2170k(), this.f2483b.mo2109g(), this.f2500s);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private View m3302a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setId(C10647t.m31283e(this.f2498q, "tt_native_video_layout"));
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        this.f2499r = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(C10647t.m31283e(this.f2498q, "tt_native_video_frame"));
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout.addView(frameLayout2);
        this.f2484c = frameLayout2;
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(C10647t.m31283e(this.f2498q, "tt_native_video_img_cover_viewStub"));
        viewStub.setLayoutResource(C10647t.m31284f(this.f2498q, "tt_native_video_img_cover_layout"));
        viewStub.setLayoutParams(layoutParams3);
        frameLayout.addView(viewStub);
        this.f2476F = viewStub;
        return frameLayout;
    }

    /* renamed from: e */
    private void mo1864e() {
        addView(m3302a(this.f2498q));
        m3308o();
    }

    public void setVideoAdClickListenerTTNativeAd(TTNativeAd tTNativeAd) {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            ((C0676b) cVar).mo2238a(tTNativeAd);
        }
    }

    /* renamed from: g */
    public void mo2204g() {
        ViewStub viewStub;
        if (this.f2498q != null && (viewStub = this.f2476F) != null && viewStub.getParent() != null && this.f2482a != null && this.f2488g == null) {
            this.f2488g = (RelativeLayout) this.f2476F.inflate();
            this.f2489h = (ImageView) findViewById(C10647t.m31283e(this.f2498q, "tt_native_video_img_id"));
            ImageView imageView = (ImageView) findViewById(C10647t.m31283e(this.f2498q, "tt_native_video_play"));
            this.f2491j = imageView;
            if (this.f2492k) {
                C1002v.m4716a((View) imageView, 0);
            }
            if (!(this.f2482a.mo1330J() == null || this.f2482a.mo1330J().mo62921h() == null)) {
                C0835d.m4093a().mo2659a(this.f2482a.mo1330J().mo62921h(), this.f2489h);
            }
            ImageView imageView2 = this.f2491j;
            if (imageView2 != null) {
                imageView2.setClickable(true);
                this.f2491j.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        NativeVideoTsView.this.mo1862c();
                    }
                });
            }
            m3307n();
        }
    }

    /* renamed from: n */
    private void m3307n() {
        if ((this instanceof NativeDrawVideoTsView) && !this.f2495n.get() && C0503h.m2281d().mo1617r() != null) {
            this.f2491j.setImageBitmap(C0503h.m2281d().mo1617r());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f2491j.getLayoutParams();
            int b = (int) C1002v.m4731b(getContext(), (float) this.f2494m);
            layoutParams.width = b;
            layoutParams.height = b;
            this.f2491j.setLayoutParams(layoutParams);
            this.f2495n.set(true);
        }
    }

    /* renamed from: o */
    private void m3308o() {
        this.f2483b = new C0676b(this.f2498q, this.f2484c, this.f2482a, this.f2493l, !m3300A(), this.f2503x, this.f2504y, this.f2487f);
        m3309p();
        this.f2499r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (NativeVideoTsView.this.f2499r != null && NativeVideoTsView.this.f2499r.getViewTreeObserver() != null && NativeVideoTsView.this.f2483b != null) {
                    ((C0676b) NativeVideoTsView.this.f2483b).mo2235a(NativeVideoTsView.this.f2499r.getWidth(), NativeVideoTsView.this.f2499r.getHeight());
                    NativeVideoTsView.this.f2499r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    public void setVideoAdLoadListener(C10192c.C10196d dVar) {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            cVar.mo2150a(dVar);
        }
    }

    public void setNativeVideoAdListener(C10192c.C10193a aVar) {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            cVar.mo2148a(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo2201a(long j, boolean z, boolean z2) {
        boolean z3 = false;
        this.f2499r.setVisibility(0);
        if (this.f2483b == null) {
            this.f2483b = new C0676b(this.f2498q, this.f2484c, this.f2482a, this.f2493l, this.f2503x, this.f2504y, this.f2487f);
            m3309p();
        }
        this.f2471A = j;
        if (!m3300A()) {
            return true;
        }
        this.f2483b.mo2098a(false);
        C0477n nVar = this.f2482a;
        if (!(nVar == null || nVar.mo1330J() == null)) {
            C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f2482a.mo1373aD()).mo62645a(), this.f2482a);
            a.mo62945b(this.f2482a.mo1345Y());
            a.mo62937a(this.f2499r.getWidth());
            a.mo62944b(this.f2499r.getHeight());
            a.mo62948c(this.f2482a.mo1382ac());
            a.mo62938a(j);
            a.mo62942a(m3319z());
            if (z2) {
                this.f2483b.mo2156b(a);
                return true;
            }
            z3 = this.f2483b.mo2154a(a);
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (((i > 0 && !z && !z2) || (i > 0 && z && !this.f2472B)) && this.f2483b != null) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo372a(this.f2483b.mo2109g());
            aVar.mo379c(this.f2483b.mo2112j());
            aVar.mo376b(this.f2483b.mo2110h());
            C0113a.m479b(this.f2483b.mo2115o(), aVar);
        }
        return z3;
    }

    /* renamed from: p */
    private void m3309p() {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            cVar.mo2164d(this.f2500s);
            ((C0676b) this.f2483b).mo2240a((C0676b.C0692a) this);
            this.f2483b.mo2148a((C10192c.C10193a) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3310q();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m3310q();
    }

    /* renamed from: q */
    private void m3310q() {
        C10192c cVar = this.f2483b;
        if (cVar == null) {
            m3308o();
        } else if ((cVar instanceof C0676b) && !m3300A()) {
            ((C0676b) this.f2483b).mo2248v();
        }
        if (this.f2483b != null && this.f2479I.get()) {
            this.f2479I.set(false);
            mo1861b();
            if (mo2207h()) {
                C1002v.m4716a((View) this.f2488g, 8);
                ImageView imageView = this.f2490i;
                if (imageView != null) {
                    C1002v.m4716a((View) imageView, 8);
                }
                C0477n nVar = this.f2482a;
                if (nVar == null || nVar.mo1330J() == null) {
                    C10638l.m31242e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                    return;
                }
                C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f2482a.mo1373aD()).mo62645a(), this.f2482a);
                a.mo62945b(this.f2482a.mo1345Y());
                a.mo62937a(this.f2499r.getWidth());
                a.mo62944b(this.f2499r.getHeight());
                a.mo62948c(this.f2482a.mo1382ac());
                a.mo62938a(0);
                a.mo62942a(m3319z());
                this.f2483b.mo2154a(a);
                this.f2483b.mo2106c(false);
            } else if (this.f2483b.mo2117q()) {
                C10638l.m31235b("NativeVideoAdView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.f2483b.mo2117q());
                mo2202b(true);
            } else {
                C10638l.m31238c("NativeVideoAdView", "attachTask.......mRlImgCover.....VISIBLE");
                mo2204g();
                C1002v.m4716a((View) this.f2488g, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3311r();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m3311r();
    }

    /* renamed from: r */
    private void m3311r() {
        this.f2497p = null;
        mo2208i();
        mo1860a(false);
        m3312s();
    }

    /* renamed from: s */
    private void m3312s() {
        if (!this.f2479I.get()) {
            this.f2479I.set(true);
            C10192c cVar = this.f2483b;
            if (cVar != null) {
                cVar.mo2153a(true, 3);
            }
        }
        this.f2481K.set(false);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m3312s();
        }
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message.what == 1) {
            m3313t();
        }
    }

    /* renamed from: t */
    private void m3313t() {
        m3304a(mo2209j(), f2469v.intValue());
        this.f2473C.sendEmptyMessageDelayed(1, 500);
    }

    /* renamed from: u */
    private boolean m3314u() {
        if (m3300A()) {
            return false;
        }
        boolean a = C0947a.m4407a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
        if (C0947a.m4407a("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || a) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private void m3315v() {
        if (!m3300A()) {
            C0947a.m4400a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) false);
            C0947a.m4400a("sp_multi_native_video_data", "key_video_is_from_detail_page", (Boolean) false);
        }
    }

    /* renamed from: a */
    private void m3304a(boolean z, int i) {
        if (this.f2482a != null && this.f2483b != null) {
            boolean u = m3314u();
            m3315v();
            if (u && this.f2483b.mo2117q()) {
                C10638l.m31235b("NativeVideoAdView", "changeVideoStatus---isFromDetailPage()=" + u + "，mNativeVideoController.isPlayComplete()=" + this.f2483b.mo2117q());
                mo2202b(true);
                mo1863d();
            } else if (!z || this.f2483b.mo2117q() || this.f2483b.mo2113m()) {
                if (this.f2483b.mo2114n() != null && this.f2483b.mo2114n().mo62869l()) {
                    this.f2483b.mo2155b();
                    mo1860a(true);
                    C10192c.C10195c cVar = this.f2477G;
                    if (cVar != null) {
                        cVar.mo607b_();
                    }
                }
            } else if (this.f2483b.mo2114n() == null || !this.f2483b.mo2114n().mo62870m()) {
                if (this.f2500s && this.f2483b.mo2114n() == null) {
                    if (!this.f2479I.get()) {
                        this.f2479I.set(true);
                    }
                    this.f2481K.set(false);
                    m3310q();
                }
            } else if (this.f2500s || i == 1) {
                C10192c cVar2 = this.f2483b;
                if (cVar2 != null) {
                    setIsQuiet(cVar2.mo2116p());
                }
                if ("ALP-AL00".equals(this.f2475E)) {
                    this.f2483b.mo2161d();
                } else {
                    if (!C0503h.m2281d().mo1616q()) {
                        u = true;
                    }
                    ((C0676b) this.f2483b).mo2245h(u);
                }
                mo1860a(false);
                C10192c.C10195c cVar3 = this.f2477G;
                if (cVar3 != null) {
                    cVar3.mo608c_();
                }
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C10192c cVar;
        C10192c cVar2;
        C10192c cVar3;
        C10192c cVar4;
        super.onWindowFocusChanged(z);
        m3316w();
        if (!m3314u() || (cVar4 = this.f2483b) == null || !cVar4.mo2117q()) {
            mo1861b();
            if (m3300A() || !mo2207h() || (cVar2 = this.f2483b) == null || cVar2.mo2113m()) {
                if (mo2207h()) {
                    return;
                }
                if (!z && (cVar = this.f2483b) != null && cVar.mo2114n() != null && this.f2483b.mo2114n().mo62869l()) {
                    this.f2473C.removeMessages(1);
                    m3304a(false, f2469v.intValue());
                } else if (z) {
                    this.f2473C.obtainMessage(1).sendToTarget();
                }
            } else if (this.f2473C == null) {
            } else {
                if (!z || (cVar3 = this.f2483b) == null || cVar3.mo2117q()) {
                    this.f2473C.removeMessages(1);
                    m3304a(false, f2469v.intValue());
                    return;
                }
                this.f2473C.obtainMessage(1).sendToTarget();
            }
        } else {
            m3315v();
            C1002v.m4716a((View) this.f2488g, 8);
            mo2202b(true);
            mo1863d();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        C10192c cVar;
        C0477n nVar;
        C10192c cVar2;
        C10192c cVar3;
        super.onWindowVisibilityChanged(i);
        m3316w();
        if (this.f2480J) {
            this.f2480J = i == 0;
        }
        if (!m3314u() || (cVar3 = this.f2483b) == null || !cVar3.mo2117q()) {
            mo1861b();
            if (!m3300A() && mo2207h() && (cVar = this.f2483b) != null && !cVar.mo2113m() && (nVar = this.f2482a) != null) {
                if (!this.f2505z || nVar.mo1330J() == null) {
                    C10638l.m31242e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                } else {
                    this.f2482a.mo1330J();
                    C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f2482a.mo1373aD()).mo62645a(), this.f2482a);
                    a.mo62945b(this.f2482a.mo1345Y());
                    a.mo62937a(this.f2499r.getWidth());
                    a.mo62944b(this.f2499r.getHeight());
                    a.mo62948c(this.f2482a.mo1382ac());
                    a.mo62938a(this.f2471A);
                    a.mo62942a(m3319z());
                    this.f2483b.mo2154a(a);
                    this.f2505z = false;
                    C1002v.m4716a((View) this.f2488g, 8);
                }
                if (i == 0 && this.f2473C != null && (cVar2 = this.f2483b) != null && !cVar2.mo2117q()) {
                    this.f2473C.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        m3315v();
        C1002v.m4716a((View) this.f2488g, 8);
        mo2202b(true);
        mo1863d();
    }

    /* renamed from: w */
    private void m3316w() {
        if (!(this.f2483b == null || m3300A() || !C0947a.m4407a("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            boolean a = C0947a.m4407a("sp_multi_native_video_data", "key_native_video_complete", false);
            long a2 = C0947a.m4396a("sp_multi_native_video_data", "key_video_current_play_position", 0);
            long a3 = C0947a.m4396a("sp_multi_native_video_data", "key_video_total_play_duration", this.f2483b.mo2112j() + this.f2483b.mo2110h());
            long a4 = C0947a.m4396a("sp_multi_native_video_data", "key_video_duration", this.f2483b.mo2112j());
            this.f2483b.mo2106c(a);
            this.f2483b.mo2093a(a2);
            this.f2483b.mo2099b(a3);
            this.f2483b.mo2105c(a4);
            C0947a.m4400a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) false);
            C10638l.m31242e("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + a + ",position=" + a2 + ",totalPlayDuration=" + a3 + ",duration=" + a4);
        }
    }

    public void setNativeVideoController(C10192c cVar) {
        this.f2483b = cVar;
    }

    public C10192c getNativeVideoController() {
        return this.f2483b;
    }

    /* renamed from: h */
    public boolean mo2207h() {
        return this.f2500s;
    }

    public void setIsAutoPlay(boolean z) {
        if (!this.f2474D) {
            int c = C0558m.m2673h().mo1680c(C0996u.m4657f(this.f2482a));
            if (z && c != 4 && (!C10642o.m31262e(this.f2498q) ? !(!C10642o.m31263f(this.f2498q) ? C10642o.m31261d(this.f2498q) : m3317x() || m3318y()) : !m3317x())) {
                z = false;
            }
            this.f2500s = z;
            C10192c cVar = this.f2483b;
            if (cVar != null) {
                cVar.mo2164d(z);
            }
            if (!this.f2500s) {
                mo2204g();
                RelativeLayout relativeLayout = this.f2488g;
                if (relativeLayout != null) {
                    C1002v.m4716a((View) relativeLayout, 0);
                    C0477n nVar = this.f2482a;
                    if (!(nVar == null || nVar.mo1330J() == null)) {
                        C0835d.m4093a().mo2659a(this.f2482a.mo1330J().mo62921h(), this.f2489h);
                    }
                }
            } else {
                C1002v.m4716a((View) this.f2488g, 8);
            }
            this.f2474D = true;
        }
    }

    /* renamed from: x */
    private boolean m3317x() {
        return 2 == C0558m.m2673h().mo1680c(C0996u.m4657f(this.f2482a));
    }

    /* renamed from: y */
    private boolean m3318y() {
        return 5 == C0558m.m2673h().mo1680c(C0996u.m4657f(this.f2482a));
    }

    /* renamed from: z */
    private boolean m3319z() {
        return this.f2485d;
    }

    public void setIsQuiet(boolean z) {
        this.f2485d = z;
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            cVar.mo2103b(z);
        }
    }

    /* renamed from: A */
    private boolean m3300A() {
        return this.f2501t;
    }

    public void setVideoAdInteractionListener(C10192c.C10195c cVar) {
        this.f2477G = cVar;
    }

    /* renamed from: f */
    public void mo2203f() {
        C10192c.C10195c cVar = this.f2477G;
        if (cVar != null) {
            cVar.mo606a_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.f2492k = z;
    }

    /* renamed from: a */
    public void mo2200a(int i) {
        mo1861b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1862c() {
        if (!mo2210k()) {
            mo2212m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1860a(boolean z) {
        if (this.f2490i == null) {
            this.f2490i = new ImageView(getContext());
            if (C0503h.m2281d().mo1617r() != null) {
                this.f2490i.setImageBitmap(C0503h.m2281d().mo1617r());
            } else {
                this.f2490i.setImageResource(C10647t.m31282d(C0558m.m2663a(), "tt_new_play_video"));
            }
            this.f2490i.setScaleType(ImageView.ScaleType.FIT_XY);
            int b = (int) C1002v.m4731b(getContext(), (float) this.f2494m);
            int b2 = (int) C1002v.m4731b(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = b2;
            layoutParams.bottomMargin = b2;
            this.f2499r.addView(this.f2490i, layoutParams);
            this.f2490i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    NativeVideoTsView.this.mo2212m();
                }
            });
        }
        if (z) {
            this.f2490i.setVisibility(0);
        } else {
            this.f2490i.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo2202b(boolean z) {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            cVar.mo2106c(z);
            C10190b o = this.f2483b.mo2115o();
            if (o != null) {
                o.mo2312b();
                View c = o.mo2318c();
                if (c != null) {
                    if (c.getParent() != null) {
                        ((ViewGroup) c.getParent()).removeView(c);
                    }
                    c.setVisibility(0);
                    addView(c);
                    o.mo2270a(this.f2482a, new WeakReference(this.f2498q), false);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo2208i() {
        C10190b o;
        C10192c cVar = this.f2483b;
        if (cVar != null && (o = cVar.mo2115o()) != null) {
            o.mo2262a();
            View c = o.mo2318c();
            if (c != null) {
                c.setVisibility(8);
                if (c.getParent() != null) {
                    ((ViewGroup) c.getParent()).removeView(c);
                }
            }
        }
    }

    /* renamed from: B */
    private void m3301B() {
        C1002v.m4750e((View) this.f2490i);
        C1002v.m4750e((View) this.f2488g);
    }

    public void setVideoCacheUrl(String str) {
        this.f2502u = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo2209j() {
        return C0746x.m3803a(this, 50, C0604o.m2910b(this.f2493l) ? 1 : 5);
    }

    /* renamed from: k */
    public boolean mo2210k() {
        boolean z = false;
        if (C10642o.m31260c(C0558m.m2663a()) == 0) {
            return false;
        }
        if (this.f2483b.mo2114n() != null && this.f2483b.mo2114n().mo62869l()) {
            m3304a(false, f2469v.intValue());
            C10652x xVar = this.f2473C;
            z = true;
            if (xVar != null) {
                xVar.removeMessages(1);
            }
        }
        return z;
    }

    /* renamed from: l */
    public void mo2211l() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof C0676b)) {
            C0676b bVar = (C0676b) getNativeVideoController();
            bVar.mo2145a((C10190b) bVar.mo2115o(), (View) this);
        }
    }

    /* renamed from: m */
    public void mo2212m() {
        if (C10642o.m31260c(C0558m.m2663a()) == 0 || !mo2209j()) {
            return;
        }
        if (this.f2483b.mo2114n() != null && this.f2483b.mo2114n().mo62870m()) {
            m3304a(true, f2470w.intValue());
            mo1861b();
            C10652x xVar = this.f2473C;
            if (xVar != null) {
                xVar.sendEmptyMessageDelayed(1, 500);
            }
        } else if (!mo2207h() && !this.f2481K.get()) {
            this.f2481K.set(true);
            m3301B();
            C0477n nVar = this.f2482a;
            if (!(nVar == null || nVar.mo1330J() == null)) {
                m3301B();
                this.f2482a.mo1330J();
                C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f2482a.mo1373aD()).mo62645a(), this.f2482a);
                a.mo62945b(this.f2482a.mo1345Y());
                a.mo62937a(this.f2499r.getWidth());
                a.mo62944b(this.f2499r.getHeight());
                a.mo62948c(this.f2482a.mo1382ac());
                a.mo62938a(this.f2471A);
                a.mo62942a(m3319z());
                a.mo62939a(CacheDirFactory.getICacheDir(this.f2482a.mo1373aD()).mo62645a());
                this.f2483b.mo2154a(a);
            }
            C10652x xVar2 = this.f2473C;
            if (xVar2 != null) {
                xVar2.sendEmptyMessageDelayed(1, 500);
            }
            mo1860a(false);
        }
    }

    public double getCurrentPlayTime() {
        C10192c cVar = this.f2483b;
        if (cVar != null) {
            return (((double) cVar.mo2109g()) * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }
}
