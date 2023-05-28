package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bykv.p271vk.openvk.component.video.p272a.p285e.C10176a;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.C0739d;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.c */
/* compiled from: NativeVideoDetailLayout */
public class C0693c extends C0701d {

    /* renamed from: H */
    private TextView f2563H;

    /* renamed from: I */
    private ImageView f2564I;

    /* renamed from: J */
    private View f2565J;

    /* renamed from: K */
    private TextView f2566K;

    /* renamed from: L */
    private TextView f2567L;

    /* renamed from: M */
    private TextView f2568M;

    /* renamed from: N */
    private ImageView f2569N;

    /* renamed from: O */
    private View f2570O;

    /* renamed from: P */
    private ImageView f2571P;

    /* renamed from: Q */
    private TextView f2572Q;

    /* renamed from: R */
    private View f2573R;

    /* renamed from: S */
    private SeekBar f2574S;

    /* renamed from: T */
    private TextView f2575T;

    /* renamed from: U */
    private TextView f2576U;

    /* renamed from: V */
    private ImageView f2577V;

    /* renamed from: W */
    private final C10652x f2578W = new C10652x(this);
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f2579X = false;

    /* renamed from: Y */
    private boolean f2580Y = false;

    /* renamed from: Z */
    private int f2581Z = 0;

    /* renamed from: aa */
    private int f2582aa = 0;

    /* renamed from: ab */
    private int f2583ab = 0;

    /* renamed from: ac */
    private int f2584ac = 0;

    /* renamed from: ad */
    private int f2585ad = 0;

    /* renamed from: ae */
    private final Rect f2586ae = new Rect();

    /* renamed from: af */
    private ColorStateList f2587af;

    /* renamed from: ag */
    private float f2588ag;

    /* renamed from: ah */
    private final Rect f2589ah = new Rect();

    /* renamed from: ai */
    private int f2590ai = 0;

    /* renamed from: aj */
    private boolean f2591aj;

    /* renamed from: ak */
    private int f2592ak = 0;

    /* renamed from: al */
    private int f2593al = 0;

    /* renamed from: am */
    private C0739d f2594am = null;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public boolean f2595an = false;

    /* renamed from: ao */
    private final View.OnTouchListener f2596ao = new View.OnTouchListener() {

        /* renamed from: b */
        private float f2615b;

        public boolean onTouch(View view, MotionEvent motionEvent) {
            float x = motionEvent.getX();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                boolean z = true;
                if (actionMasked == 1) {
                    C0693c cVar = C0693c.this;
                    if (Math.abs(this.f2615b - motionEvent.getX()) >= 10.0f) {
                        z = false;
                    }
                    boolean unused = cVar.f2595an = z;
                } else if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else {
                this.f2615b = x;
            }
            return false;
        }
    };

    /* renamed from: ap */
    private float f2597ap;

    /* renamed from: aq */
    private ColorStateList f2598aq;

    /* renamed from: ar */
    private float f2599ar;

    /* renamed from: as */
    private final Rect f2600as = new Rect();

    /* renamed from: at */
    private float f2601at;

    /* renamed from: au */
    private ColorStateList f2602au;

    /* renamed from: av */
    private float f2603av;

    /* renamed from: aw */
    private final Rect f2604aw = new Rect();

    /* renamed from: ax */
    private final Rect f2605ax = new Rect();

    /* renamed from: ay */
    private boolean f2606ay;

    /* renamed from: az */
    private boolean f2607az;

    public C0693c(Context context, View view, boolean z, EnumSet<C10190b.C10191a> enumSet, C0477n nVar, C10192c cVar, boolean z2) {
        super(context, view, z, enumSet, nVar, cVar, z2);
        this.f2652y = C0558m.m2663a().getApplicationContext();
        mo2322d(z2);
        this.f2628a = view;
        this.f2647t = z;
        C0739d dVar = new C0739d(this);
        this.f2594am = dVar;
        dVar.mo2498a(this.f2647t);
        DisplayMetrics displayMetrics = this.f2652y.getResources().getDisplayMetrics();
        this.f2592ak = displayMetrics.widthPixels;
        this.f2593al = displayMetrics.heightPixels;
        this.f2650w = enumSet == null ? EnumSet.noneOf(C10190b.C10191a.class) : enumSet;
        this.f2619D = cVar;
        this.f2651x = nVar;
        mo2277c(8);
        mo2266a(context, this.f2628a);
        mo2279d();
        mo2323p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2266a(Context context, View view) {
        super.mo2266a(context, view);
        this.f2563H = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_back"));
        this.f2564I = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_close"));
        this.f2565J = view.findViewById(C10647t.m31283e(context, "tt_video_top_layout"));
        this.f2569N = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_fullscreen_back"));
        this.f2566K = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_title"));
        this.f2567L = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_top_title"));
        this.f2568M = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_current_time"));
        this.f2570O = view.findViewById(C10647t.m31283e(context, "tt_video_loading_retry"));
        this.f2571P = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_retry"));
        TextView textView = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_retry_des"));
        this.f2572Q = textView;
        textView.setText(C10647t.m31276a(context, "tt_video_retry_des_txt"));
        this.f2574S = (SeekBar) view.findViewById(C10647t.m31283e(context, "tt_video_seekbar"));
        this.f2575T = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_time_left_time"));
        this.f2576U = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_time_play"));
        this.f2573R = view.findViewById(C10647t.m31283e(context, "tt_video_ad_bottom_layout"));
        this.f2577V = (ImageView) view.findViewById(C10647t.m31283e(context, "tt_video_ad_full_screen"));
        this.f2634g = (ViewStub) view.findViewById(C10647t.m31283e(context, "tt_video_ad_cover"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2279d() {
        super.mo2279d();
        this.f2594am.mo2497a(this.f2628a);
        int i = 8;
        C1002v.m4716a((View) this.f2564I, (this.f2647t || this.f2650w.contains(C10190b.C10191a.hideCloseBtn)) ? 8 : 0);
        this.f2564I.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0693c.this.mo2327t()) {
                    C0693c.this.f2616A.mo2160c(C0693c.this, view);
                }
            }
        });
        TextView textView = this.f2563H;
        if (!this.f2647t || this.f2650w.contains(C10190b.C10191a.alwayShowBackBtn)) {
            i = 0;
        }
        C1002v.m4716a((View) textView, i);
        this.f2563H.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0693c.this.mo2327t()) {
                    C0693c.this.f2616A.mo2163d(C0693c.this, view);
                }
            }
        });
        this.f2569N.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0693c.this.mo2327t()) {
                    C0693c.this.f2616A.mo2166e(C0693c.this, view);
                }
            }
        });
        this.f2571P.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0693c.this.mo2317b(false, true);
                C0693c.this.mo2283h();
                C0693c.this.mo2282g();
                if (C0693c.this.mo2327t()) {
                    C0693c.this.f2616A.mo2107f(C0693c.this, view);
                }
            }
        });
        this.f2577V.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0693c.this.mo2327t()) {
                    C0693c.this.f2616A.mo2158b((C10190b) C0693c.this, view);
                }
            }
        });
        this.f2574S.setThumbOffset(0);
        this.f2574S.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!C0693c.this.f2579X && C0693c.this.f2652y != null) {
                    seekBar.setThumb(C10647t.m31281c(C0558m.m2663a(), "tt_seek_thumb_normal"));
                }
                if (C0693c.this.mo2327t()) {
                    seekBar.setThumbOffset(0);
                    C0693c.this.f2616A.mo2143a((C10190b) C0693c.this, seekBar.getProgress());
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!C0693c.this.f2579X && C0693c.this.f2652y != null) {
                    seekBar.setThumb(C10647t.m31281c(C0558m.m2663a(), "tt_seek_thumb_press"));
                }
                if (C0693c.this.mo2327t()) {
                    seekBar.setThumbOffset(0);
                    C0693c.this.f2616A.mo2157b((C10190b) C0693c.this, seekBar.getProgress());
                }
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (C0693c.this.mo2327t()) {
                    C0693c.this.f2616A.mo2144a(C0693c.this, i, z);
                }
            }
        });
        this.f2574S.setOnTouchListener(this.f2596ao);
    }

    /* renamed from: e */
    public void mo2280e() {
        this.f2578W.removeMessages(1);
        this.f2578W.sendMessageDelayed(this.f2578W.obtainMessage(1), 2000);
    }

    /* renamed from: f */
    public void mo2281f() {
        this.f2578W.removeMessages(1);
    }

    /* renamed from: b */
    public void mo2275b(boolean z) {
        int i = mo2285j() ? this.f2593al : this.f2643p;
        int i2 = mo2285j() ? this.f2592ak : this.f2644q;
        if (this.f2646s > 0 && this.f2645r > 0 && i > 0) {
            if (!mo2286k() && !mo2285j() && !this.f2650w.contains(C10190b.C10191a.fixedSize)) {
                i2 = this.f2652y.getResources().getDimensionPixelSize(C10647t.m31287i(this.f2652y, "tt_video_container_maxheight"));
            }
            int i3 = (int) (((float) this.f2646s) * ((((float) i) * 1.0f) / ((float) this.f2645r)));
            if (i3 > i2) {
                i = (int) (((float) this.f2645r) * ((((float) i2) * 1.0f) / ((float) this.f2646s)));
            } else {
                i2 = i3;
            }
            if (!z && !mo2285j()) {
                i = this.f2643p;
                i2 = this.f2644q;
            }
            this.f2629b.mo62971a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo2271a(String str) {
        TextView textView = this.f2566K;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f2567L;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    /* renamed from: a */
    public void mo2263a(int i) {
        View view = this.f2573R;
        if (view == null || view.getVisibility() != 0) {
            this.f2574S.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo2265a(long j, long j2) {
        this.f2575T.setText(C10176a.m29069a(j2));
        this.f2576U.setText(C10176a.m29069a(j));
        this.f2574S.setProgress(C10176a.m29068a(j, j2));
    }

    /* renamed from: g */
    public void mo2282g() {
        C1002v.m4752f(this.f2631d);
        C1002v.m4752f(this.f2632e);
        C1002v.m4750e(this.f2570O);
        if (!(this.f2633f == null || this.f2651x == null || this.f2651x.mo1330J() == null || this.f2651x.mo1330J().mo62921h() == null)) {
            C1002v.m4752f((View) this.f2633f);
            C0835d.m4093a().mo2659a(this.f2651x.mo1330J().mo62921h(), this.f2633f);
        }
        if (this.f2630c.getVisibility() == 0) {
            C1002v.m4716a((View) this.f2630c, 8);
        }
    }

    /* renamed from: a */
    public void mo2262a() {
        mo2272a(false, this.f2647t);
        mo2330w();
    }

    /* renamed from: a */
    public void mo2264a(long j) {
        this.f2576U.setText(C10176a.m29069a(j));
    }

    /* renamed from: a */
    public void mo2270a(C0477n nVar, WeakReference<Context> weakReference, boolean z) {
        String str;
        String str2;
        if (nVar != null) {
            mo2305a(this.f2628a, C0558m.m2663a());
            mo2272a(false, this.f2647t);
            C1002v.m4716a(this.f2635h, 0);
            C1002v.m4716a((View) this.f2636i, 0);
            C1002v.m4716a(this.f2637j, 0);
            if (!(this.f2636i == null || this.f2651x == null || this.f2651x.mo1330J() == null || this.f2651x.mo1330J().mo62921h() == null)) {
                C0835d.m4093a().mo2659a(this.f2651x.mo1330J().mo62921h(), this.f2636i);
            }
            if (!TextUtils.isEmpty(nVar.mo1331K())) {
                str = nVar.mo1331K();
            } else if (!TextUtils.isEmpty(nVar.mo1341U())) {
                str = nVar.mo1341U();
            } else {
                str = !TextUtils.isEmpty(nVar.mo1342V()) ? nVar.mo1342V() : "";
            }
            if (this.f2651x != null && this.f2651x.mo1333M() != null && this.f2651x.mo1333M().mo1281a() != null) {
                C1002v.m4716a((View) this.f2638k, 0);
                C1002v.m4716a((View) this.f2639l, 4);
                if (this.f2638k != null) {
                    C0835d.m4093a().mo2658a(this.f2651x.mo1333M(), (ImageView) this.f2638k);
                    this.f2638k.setOnClickListener(this.f2620E);
                    this.f2638k.setOnTouchListener(this.f2620E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                C1002v.m4716a((View) this.f2638k, 4);
                C1002v.m4716a((View) this.f2639l, 0);
                if (this.f2639l != null) {
                    this.f2639l.setText(str.substring(0, 1));
                    this.f2639l.setOnClickListener(this.f2620E);
                    this.f2639l.setOnTouchListener(this.f2620E);
                }
            }
            if (this.f2640m != null && !TextUtils.isEmpty(str)) {
                this.f2640m.setText(str);
            }
            C1002v.m4716a((View) this.f2640m, 0);
            C1002v.m4716a((View) this.f2641n, 0);
            int L = nVar.mo1332L();
            if (L == 2 || L == 3) {
                str2 = C10647t.m31276a(this.f2652y, "tt_video_mobile_go_detail");
            } else if (L != 4) {
                str2 = L != 5 ? C10647t.m31276a(this.f2652y, "tt_video_mobile_go_detail") : C10647t.m31276a(this.f2652y, "tt_video_dial_phone");
            } else {
                str2 = C10647t.m31276a(this.f2652y, "tt_video_download_apk");
            }
            if (this.f2641n != null) {
                this.f2641n.setText(str2);
                this.f2641n.setOnClickListener(this.f2620E);
                this.f2641n.setOnTouchListener(this.f2620E);
            }
        }
    }

    /* renamed from: h */
    public void mo2283h() {
        C1002v.m4750e(this.f2631d);
        C1002v.m4750e(this.f2570O);
    }

    /* renamed from: i */
    public void mo2284i() {
        this.f2574S.setProgress(0);
        this.f2574S.setSecondaryProgress(0);
        this.f2575T.setText(C10647t.m31279b(this.f2652y, "tt_00_00"));
        this.f2576U.setText(C10647t.m31279b(this.f2652y, "tt_00_00"));
        mo2277c(8);
        if (mo2331x()) {
            this.f2629b.setVisibility(8);
        }
        if (this.f2633f != null) {
            this.f2633f.setImageDrawable((Drawable) null);
        }
        mo2277c(8);
        C1002v.m4716a(this.f2573R, 8);
        C1002v.m4716a(this.f2635h, 8);
        C1002v.m4716a((View) this.f2636i, 8);
        C1002v.m4716a(this.f2637j, 8);
        C1002v.m4716a((View) this.f2638k, 8);
        C1002v.m4716a((View) this.f2639l, 8);
        C1002v.m4716a((View) this.f2640m, 8);
        if (this.f2653z != null) {
            this.f2653z.mo2502a(true);
        }
    }

    /* renamed from: j */
    public boolean mo2285j() {
        return this.f2579X;
    }

    /* renamed from: k */
    public boolean mo2286k() {
        return this.f2647t;
    }

    /* renamed from: a */
    public void mo2268a(ViewGroup viewGroup) {
        if (viewGroup != null && (this.f2628a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f2579X = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2628a.getLayoutParams();
            this.f2582aa = marginLayoutParams.leftMargin;
            this.f2581Z = marginLayoutParams.topMargin;
            this.f2583ab = marginLayoutParams.width;
            this.f2584ac = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.f2628a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.f2585ad = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f2586ae.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C1002v.m4735b(viewGroup, 0, 0, 0, 0);
            }
            mo2275b(true);
            this.f2577V.setImageDrawable(C10647t.m31281c(this.f2652y, "tt_shrink_video"));
            this.f2574S.setThumb(C10647t.m31281c(this.f2652y, "tt_seek_thumb_fullscreen_selector"));
            this.f2574S.setThumbOffset(0);
            C10176a.m29070a(this.f2628a, false);
            m3491e(this.f2579X);
            C1002v.m4716a(this.f2565J, 8);
            if (!this.f2647t) {
                C1002v.m4716a((View) this.f2564I, 8);
                C1002v.m4716a((View) this.f2563H, 8);
            } else if (this.f2650w.contains(C10190b.C10191a.hideCloseBtn)) {
                C1002v.m4716a((View) this.f2564I, 8);
            }
        }
    }

    /* renamed from: b */
    public void mo2274b(ViewGroup viewGroup) {
        C10638l.m31242e("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup != null && this.f2628a != null && (this.f2628a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f2579X = false;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2628a.getLayoutParams();
            marginLayoutParams.width = this.f2583ab;
            marginLayoutParams.height = this.f2584ac;
            marginLayoutParams.leftMargin = this.f2582aa;
            marginLayoutParams.topMargin = this.f2581Z;
            this.f2628a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(3, this.f2585ad);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                C1002v.m4735b(viewGroup, this.f2586ae.left, this.f2586ae.top, this.f2586ae.right, this.f2586ae.bottom);
            }
            mo2275b(true);
            this.f2577V.setImageDrawable(C10647t.m31281c(this.f2652y, "tt_enlarge_video"));
            this.f2574S.setThumb(C10647t.m31281c(this.f2652y, "tt_seek_thumb_normal"));
            this.f2574S.setThumbOffset(0);
            C10176a.m29070a(this.f2628a, true);
            m3491e(this.f2579X);
            C1002v.m4716a(this.f2565J, 8);
            if (this.f2650w.contains(C10190b.C10191a.alwayShowBackBtn)) {
                C1002v.m4716a((View) this.f2563H, 0);
            }
        }
    }

    /* renamed from: e */
    private void m3491e(boolean z) {
        if (z) {
            m3492y();
        } else {
            m3493z();
        }
    }

    /* renamed from: y */
    private void m3492y() {
        DisplayMetrics displayMetrics = this.f2652y.getResources().getDisplayMetrics();
        TextView textView = this.f2576U;
        if (textView != null) {
            this.f2597ap = textView.getTextSize();
            this.f2576U.setTextSize(2, 14.0f);
            ColorStateList textColors = this.f2576U.getTextColors();
            this.f2598aq = textColors;
            if (textColors != null) {
                this.f2576U.setTextColor(C10647t.m31288j(this.f2652y, "tt_ssxinzi15"));
            }
            this.f2599ar = this.f2576U.getAlpha();
            this.f2576U.setAlpha(0.85f);
            this.f2576U.setShadowLayer(0.0f, C1002v.m4731b(this.f2652y, 0.5f), C1002v.m4731b(this.f2652y, 0.5f), C10647t.m31288j(this.f2652y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.f2576U.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f2600as.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                C1002v.m4735b(this.f2576U, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f2600as.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f2600as.bottom);
            }
        }
        TextView textView2 = this.f2575T;
        if (textView2 != null) {
            this.f2601at = textView2.getTextSize();
            this.f2575T.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.f2575T.getTextColors();
            this.f2602au = textColors2;
            if (textColors2 != null) {
                this.f2575T.setTextColor(C10647t.m31288j(this.f2652y, "tt_ssxinzi15"));
            }
            this.f2603av = this.f2575T.getAlpha();
            this.f2575T.setAlpha(0.85f);
            this.f2575T.setShadowLayer(0.0f, C1002v.m4731b(this.f2652y, 0.5f), C1002v.m4731b(this.f2652y, 0.5f), C10647t.m31288j(this.f2652y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.f2575T.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.f2604aw.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C1002v.m4735b(this.f2575T, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f2604aw.top, this.f2604aw.right, this.f2604aw.bottom);
            }
        }
        ImageView imageView = this.f2577V;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.f2605ax.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                C1002v.m4735b(this.f2577V, this.f2605ax.left, this.f2605ax.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f2605ax.bottom);
            }
        }
        ImageView imageView2 = this.f2577V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C10647t.m31281c(this.f2652y, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.f2567L;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.f2587af = textColors3;
            if (textColors3 != null) {
                this.f2567L.setTextColor(C10647t.m31288j(this.f2652y, "tt_ssxinzi15"));
            }
            this.f2588ag = this.f2567L.getAlpha();
            this.f2567L.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.f2567L.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.f2589ah.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                C1002v.m4735b(this.f2567L, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), this.f2604aw.top, this.f2604aw.right, this.f2604aw.bottom);
            }
        }
        View view = this.f2565J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.f2590ai = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.f2565J.setLayoutParams(layoutParams5);
            this.f2565J.setBackgroundResource(C10647t.m31282d(this.f2652y, "tt_shadow_fullscreen_top"));
        }
        mo2317b(this.f2591aj, true);
    }

    /* renamed from: z */
    private void m3493z() {
        TextView textView = this.f2576U;
        if (textView != null) {
            textView.setTextSize(0, this.f2597ap);
            ColorStateList colorStateList = this.f2598aq;
            if (colorStateList != null) {
                this.f2576U.setTextColor(colorStateList);
            }
            this.f2576U.setAlpha(this.f2599ar);
            this.f2576U.setShadowLayer(C1002v.m4731b(this.f2652y, 1.0f), 0.0f, 0.0f, C10647t.m31288j(this.f2652y, "tt_video_shadow_color"));
            C1002v.m4735b(this.f2576U, this.f2600as.left, this.f2600as.top, this.f2600as.right, this.f2600as.bottom);
        }
        TextView textView2 = this.f2575T;
        if (textView2 != null) {
            textView2.setTextSize(0, this.f2601at);
            ColorStateList colorStateList2 = this.f2602au;
            if (colorStateList2 != null) {
                this.f2575T.setTextColor(colorStateList2);
            }
            this.f2575T.setAlpha(this.f2603av);
            this.f2575T.setShadowLayer(C1002v.m4731b(this.f2652y, 1.0f), 0.0f, 0.0f, C10647t.m31288j(this.f2652y, "tt_video_shadow_color"));
            C1002v.m4735b(this.f2575T, this.f2604aw.left, this.f2604aw.top, this.f2604aw.right, this.f2604aw.bottom);
        }
        ImageView imageView = this.f2577V;
        if (imageView != null) {
            C1002v.m4735b(imageView, this.f2605ax.left, this.f2605ax.top, this.f2605ax.right, this.f2605ax.bottom);
        }
        ImageView imageView2 = this.f2577V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C10647t.m31281c(this.f2652y, "tt_enlarge_video"));
        }
        TextView textView3 = this.f2567L;
        if (textView3 != null) {
            ColorStateList colorStateList3 = this.f2587af;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.f2567L.setAlpha(this.f2588ag);
            C1002v.m4735b(this.f2567L, this.f2604aw.left, this.f2604aw.top, this.f2604aw.right, this.f2604aw.bottom);
        }
        View view = this.f2565J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f2590ai;
            this.f2565J.setLayoutParams(layoutParams);
            this.f2565J.setBackgroundResource(C10647t.m31282d(this.f2652y, "tt_video_black_desc_gradient"));
        }
        mo2317b(this.f2591aj, true);
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message.what == 1) {
            mo2287l();
        }
    }

    /* renamed from: a */
    public void mo2273a(boolean z, boolean z2, boolean z3) {
        C1002v.m4716a(this.f2573R, 0);
        int i = 8;
        if (this.f2579X) {
            C1002v.m4716a(this.f2565J, 0);
            C1002v.m4716a((View) this.f2567L, 0);
        } else if (z3) {
            C1002v.m4716a(this.f2565J, 8);
        }
        C1002v.m4716a((View) this.f2630c, (!z || this.f2631d.getVisibility() == 0) ? 8 : 0);
        if (!this.f2647t && !this.f2579X) {
            if (!this.f2650w.contains(C10190b.C10191a.hideCloseBtn) && !z3) {
                C1002v.m4716a((View) this.f2564I, 0);
            }
            TextView textView = this.f2563H;
            if (!z3) {
                i = 0;
            }
            C1002v.m4716a((View) textView, i);
        }
        C1002v.m4716a((View) this.f2575T, 0);
        C1002v.m4716a((View) this.f2576U, 0);
        C1002v.m4716a((View) this.f2574S, 0);
    }

    /* renamed from: a */
    public void mo2272a(boolean z, boolean z2) {
        C1002v.m4716a(this.f2573R, 8);
        C1002v.m4716a(this.f2565J, 8);
        C1002v.m4716a((View) this.f2630c, 8);
        if (!this.f2647t && !this.f2579X) {
            C1002v.m4716a((View) this.f2564I, 8);
            if (!this.f2650w.contains(C10190b.C10191a.alwayShowBackBtn)) {
                C1002v.m4716a((View) this.f2563H, 8);
            }
        } else if (this.f2650w.contains(C10190b.C10191a.hideCloseBtn)) {
            C1002v.m4716a((View) this.f2564I, 8);
        }
        if (z2) {
            C1002v.m4716a((View) this.f2564I, 8);
            C1002v.m4716a((View) this.f2563H, 8);
        }
        mo2278c(false);
    }

    /* renamed from: l */
    public void mo2287l() {
        mo2272a(true, false);
    }

    /* renamed from: b */
    public boolean mo2276b(int i) {
        SeekBar seekBar = this.f2574S;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    /* renamed from: c */
    public void mo2278c(boolean z) {
        if (this.f2566K != null) {
            int i = 8;
            if (this.f2647t) {
                C1002v.m4716a((View) this.f2566K, 8);
                return;
            }
            TextView textView = this.f2566K;
            if (z) {
                i = 0;
            }
            C1002v.m4716a((View) textView, i);
        }
    }

    /* renamed from: m */
    public boolean mo2288m() {
        return this.f2648u;
    }

    /* renamed from: c */
    public void mo2277c(int i) {
        this.f2649v = i;
        C1002v.m4716a(this.f2628a, i);
        if (i != 0) {
            this.f2607az = false;
        } else if (this.f2606ay) {
            this.f2607az = true;
        }
    }

    /* renamed from: a */
    public void mo2267a(View view, boolean z) {
        if (mo2285j()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if (this.f2651x != null && !TextUtils.isEmpty(this.f2651x.mo1341U())) {
                mo2271a(this.f2651x.mo1341U());
            }
            this.f2568M.setText(format);
        } else {
            mo2271a("");
            this.f2568M.setText("");
        }
        if (!this.f2617B) {
            boolean z2 = false;
            mo2278c(this.f2647t && !this.f2579X);
            if (mo2327t()) {
                C0675a aVar = this.f2616A;
                if (this.f2631d.getVisibility() != 0) {
                    z2 = true;
                }
                aVar.mo2147a(this, view, true, z2);
            }
        }
    }

    /* renamed from: n */
    public void mo2289n() {
        mo2287l();
        mo2278c(false);
    }

    /* renamed from: o */
    public boolean mo2290o() {
        return this.f2653z != null && this.f2653z.mo2503a();
    }
}
