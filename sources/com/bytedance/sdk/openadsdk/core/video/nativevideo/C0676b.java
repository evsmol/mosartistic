package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bykv.p271vk.openvk.component.video.api.C10181a;
import com.bykv.p271vk.openvk.component.video.api.p287b.C10185a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10186a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10189a;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bykv.p271vk.openvk.component.video.api.renderview.C10206b;
import com.bykv.p271vk.openvk.component.video.p272a.p284d.C10161d;
import com.bykv.p271vk.openvk.component.video.p272a.p285e.C10176a;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0604o;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.video.p032a.C0639a;
import com.bytedance.sdk.openadsdk.core.widget.C0742e;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;
import com.bytedance.sdk.openadsdk.p049k.C0890e;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b */
/* compiled from: NativeVideoController */
public class C0676b extends C0639a {

    /* renamed from: A */
    private String f2509A;

    /* renamed from: B */
    private boolean f2510B;

    /* renamed from: C */
    private boolean f2511C;

    /* renamed from: D */
    private WeakReference<C10192c.C10194b> f2512D;

    /* renamed from: E */
    private boolean f2513E;

    /* renamed from: F */
    private boolean f2514F;

    /* renamed from: G */
    private boolean f2515G;

    /* renamed from: H */
    private boolean f2516H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public WeakReference<C10192c.C10196d> f2517I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public WeakReference<C0692a> f2518J;

    /* renamed from: K */
    private int f2519K;

    /* renamed from: L */
    private int f2520L;

    /* renamed from: M */
    private int f2521M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f2522N;

    /* renamed from: O */
    private boolean f2523O;

    /* renamed from: P */
    private C10188c f2524P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f2525Q;

    /* renamed from: R */
    private C0146j f2526R;

    /* renamed from: S */
    private C10181a.C10182a f2527S;

    /* renamed from: T */
    private int f2528T;

    /* renamed from: U */
    private long f2529U;

    /* renamed from: V */
    private long f2530V;

    /* renamed from: W */
    private long f2531W;

    /* renamed from: X */
    private long f2532X;

    /* renamed from: Y */
    private final BroadcastReceiver f2533Y;

    /* renamed from: Z */
    private int f2534Z;

    /* renamed from: aa */
    private boolean f2535aa;

    /* renamed from: s */
    Runnable f2536s;

    /* renamed from: t */
    private final WeakReference<ViewGroup> f2537t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f2538u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f2539v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C10192c.C10193a f2540w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final boolean f2541x;

    /* renamed from: y */
    private boolean f2542y;

    /* renamed from: z */
    private boolean f2543z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$a */
    /* compiled from: NativeVideoController */
    public interface C0692a {
        /* renamed from: a */
        void mo2200a(int i);

        /* renamed from: f */
        void mo2203f();
    }

    /* renamed from: a */
    public void mo2234a(int i) {
    }

    /* renamed from: a */
    public void mo2152a(Map<String, Object> map) {
    }

    /* renamed from: g */
    public void mo2244g(boolean z) {
        this.f2516H = z;
    }

    /* renamed from: a */
    public void mo2239a(final NativeVideoTsView.C0673a aVar) {
        if (this.f2386m && this.f2377d != null) {
            this.f2377d.mo2308a((NativeVideoTsView.C0673a) new NativeVideoTsView.C0673a() {
                /* renamed from: a */
                public void mo618a(View view, int i) {
                    NativeVideoTsView.C0673a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo618a(view, i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo2238a(TTNativeAd tTNativeAd) {
        if (this.f2386m && this.f2377d != null) {
            this.f2377d.mo2307a(tTNativeAd);
        }
    }

    /* renamed from: a */
    public void mo2235a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.f2519K = i;
            this.f2520L = i2;
            C10638l.m31235b("CSJ_VIDEO_NativeController", "width=" + i + "height=" + i2);
        }
    }

    /* renamed from: a */
    private void m3377a(Context context) {
        View view;
        EnumSet<E> noneOf = EnumSet.noneOf(C10190b.C10191a.class);
        noneOf.add(C10190b.C10191a.hideCloseBtn);
        noneOf.add(C10190b.C10191a.hideBackBtn);
        if (this.f2386m) {
            view = m3387b(context);
        } else {
            view = LayoutInflater.from(context.getApplicationContext()).inflate(C10647t.m31284f(context, "tt_video_detail_layout"), (ViewGroup) null, false);
        }
        View view2 = view;
        if (view2 != null) {
            if (this.f2386m) {
                this.f2377d = new C0701d(context, view2, true, noneOf, this.f2378e, this, mo2092G());
            } else {
                this.f2377d = new C0693c(context, view2, true, noneOf, this.f2378e, this, false);
            }
            this.f2377d.mo2306a((C10189a) this);
        }
    }

    /* renamed from: b */
    private View m3387b(Context context) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(C10647t.m31283e(context, "tt_root_view"));
        relativeLayout.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout2.setId(C10647t.m31283e(context, "tt_video_loading_retry_layout"));
        relativeLayout2.setBackgroundColor(0);
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        relativeLayout.addView(relativeLayout2);
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        imageView.setId(C10647t.m31283e(context, "tt_video_loading_cover_image"));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams2);
        relativeLayout2.addView(imageView);
        ProgressBar progressBar = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        progressBar.setId(C10647t.m31283e(context, "tt_video_loading_progress"));
        layoutParams3.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams3);
        progressBar.setIndeterminateDrawable(C10647t.m31281c(context, "tt_video_loading_progress_bar"));
        relativeLayout2.addView(progressBar);
        ImageView imageView2 = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setId(C10647t.m31283e(context, "tt_video_play"));
        layoutParams4.addRule(13, -1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(C10647t.m31282d(context, "tt_play_movebar_textpage"));
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView2);
        ViewStub viewStub = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        viewStub.setId(C10647t.m31283e(context, "tt_video_ad_cover"));
        viewStub.setLayoutParams(layoutParams5);
        viewStub.setLayoutResource(C10647t.m31284f(context, "tt_video_ad_cover_layout"));
        relativeLayout.addView(viewStub);
        ViewStub viewStub2 = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        viewStub2.setId(C10647t.m31283e(context, "tt_video_draw_layout_viewStub"));
        viewStub2.setLayoutParams(layoutParams6);
        viewStub2.setLayoutResource(C10647t.m31284f(context, "tt_video_draw_btn_layout"));
        relativeLayout.addView(viewStub2);
        return relativeLayout;
    }

    public C0676b(Context context, ViewGroup viewGroup, C0477n nVar, String str, boolean z, boolean z2, boolean z3, C0146j jVar) {
        boolean z4 = false;
        this.f2542y = false;
        this.f2543z = false;
        this.f2509A = "embeded_ad";
        this.f2510B = false;
        this.f2511C = true;
        this.f2513E = false;
        this.f2514F = false;
        this.f2515G = true;
        this.f2516H = true;
        this.f2519K = 0;
        this.f2520L = 0;
        this.f2521M = 0;
        this.f2522N = false;
        this.f2523O = true;
        this.f2527S = new C10181a.C10182a() {
            /* renamed from: b */
            public void mo2182b(C10181a aVar, int i) {
            }

            /* renamed from: c */
            public void mo2183c(C10181a aVar) {
            }

            /* renamed from: d */
            public void mo2184d(C10181a aVar) {
            }

            /* renamed from: e */
            public void mo2185e(C10181a aVar) {
            }

            /* renamed from: a */
            public void mo2173a(C10181a aVar) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0676b.this.m3419x();
                    }
                });
                C0676b.this.mo2234a(4);
            }

            /* renamed from: a */
            public void mo2177a(C10181a aVar, long j) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2312b();
                            C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                            boolean unused = C0676b.this.f2522N = false;
                        }
                        if (!(!C0676b.this.f2386m || C0676b.this.f2518J == null || C0676b.this.f2518J.get() == null)) {
                            ((C0692a) C0676b.this.f2518J.get()).mo2203f();
                        }
                        C0676b.this.m3358L();
                        C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                    }
                });
                C0676b.this.m3423z();
                long unused = C0676b.this.f2525Q = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo2181b(C10181a aVar) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (!(C0676b.this.f2517I == null || C0676b.this.f2517I.get() == null)) {
                            ((C10192c.C10196d) C0676b.this.f2517I.get()).mo611e_();
                        }
                        if (!C0676b.this.f2541x) {
                            C0676b.this.m3423z();
                        }
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2312b();
                        }
                        C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                    }
                });
            }

            /* renamed from: a */
            public void mo2179a(C10181a aVar, final C10186a aVar2) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        int a = aVar2.mo62896a();
                        int b = aVar2.mo62897b();
                        C0676b.this.m3389b(a, b);
                        C10638l.m31242e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!C0676b.this.mo2247u() || b == -1004) {
                            C10638l.m31242e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a + "," + b);
                            if (C0676b.this.m3398d(a, b)) {
                                C10638l.m31242e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                C0676b.this.f2377d.mo2270a(C0676b.this.f2378e, (WeakReference<Context>) C0676b.this.f2381h, false);
                                C0676b.this.mo2106c(true);
                                C0676b.this.mo2168f();
                            }
                            if (C0676b.this.f2377d != null) {
                                C0676b.this.f2377d.mo2312b();
                            }
                            if (C0676b.this.f2540w != null) {
                                C0676b.this.f2540w.mo35b(C0676b.this.f2539v, C10176a.m29068a(C0676b.this.f2379f, C0676b.this.f2390q));
                            }
                            if (C0676b.this.f2517I != null && C0676b.this.f2517I.get() != null && !C0676b.this.mo2247u()) {
                                ((C10192c.C10196d) C0676b.this.f2517I.get()).mo603a(a, b);
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo2180a(C10181a aVar, boolean z) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2312b();
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo2175a(C10181a aVar, int i, int i2) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0676b.this.m3350H();
                    }
                });
            }

            /* renamed from: a */
            public void mo2176a(C10181a aVar, int i, int i2, int i3) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2328u();
                            C0676b.this.f2384k.postDelayed(C0676b.this.f2536s, 8000);
                            boolean unused = C0676b.this.f2522N = true;
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo2174a(C10181a aVar, int i) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0676b.this.f2377d.mo2312b();
                        C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                        boolean unused = C0676b.this.f2522N = false;
                    }
                });
            }

            /* renamed from: a */
            public void mo2178a(C10181a aVar, long j, long j2) {
                if (Math.abs(j - C0676b.this.f2379f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    C0676b.this.f2384k.post(new Runnable() {
                        public void run() {
                            C0676b.this.m3375a(j3, j4);
                        }
                    });
                }
            }
        };
        this.f2528T = 0;
        this.f2529U = 0;
        this.f2536s = new Runnable() {
            public void run() {
                if (C0676b.this.f2377d != null) {
                    C0676b.this.f2377d.mo2270a(C0676b.this.f2378e, (WeakReference<Context>) C0676b.this.f2381h, false);
                    C0676b.this.f2377d.mo2312b();
                    C0676b.this.mo2106c(true);
                    C10638l.m31242e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.f2530V = 0;
        this.f2531W = 0;
        this.f2533Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C0676b.this.mo2155b();
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    int i = 0;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            int type = networkInfo.getType();
                            if (type == 1) {
                                i = 4;
                            } else if (type == 0) {
                                i = 1;
                            }
                        } else {
                            i = C10642o.m31260c(context);
                        }
                    }
                    C0676b.this.m3393c(context, i);
                }
            }
        };
        this.f2534Z = 1;
        this.f2535aa = false;
        this.f2534Z = C10642o.m31260c(context);
        mo2098a(z);
        this.f2509A = str;
        try {
            this.f2519K = viewGroup.getWidth();
            this.f2520L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f2537t = new WeakReference<>(viewGroup);
        this.f2381h = new WeakReference(context);
        this.f2378e = nVar;
        m3377a(context);
        this.f2541x = Build.VERSION.SDK_INT >= 17 ? true : z4;
        this.f2510B = z2;
        this.f2511C = z3;
        if (jVar != null) {
            this.f2526R = jVar;
        }
    }

    public C0676b(Context context, ViewGroup viewGroup, C0477n nVar, String str, boolean z, boolean z2, C0146j jVar) {
        boolean z3 = false;
        this.f2542y = false;
        this.f2543z = false;
        this.f2509A = "embeded_ad";
        this.f2510B = false;
        this.f2511C = true;
        this.f2513E = false;
        this.f2514F = false;
        this.f2515G = true;
        this.f2516H = true;
        this.f2519K = 0;
        this.f2520L = 0;
        this.f2521M = 0;
        this.f2522N = false;
        this.f2523O = true;
        this.f2527S = new C10181a.C10182a() {
            /* renamed from: b */
            public void mo2182b(C10181a aVar, int i) {
            }

            /* renamed from: c */
            public void mo2183c(C10181a aVar) {
            }

            /* renamed from: d */
            public void mo2184d(C10181a aVar) {
            }

            /* renamed from: e */
            public void mo2185e(C10181a aVar) {
            }

            /* renamed from: a */
            public void mo2173a(C10181a aVar) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0676b.this.m3419x();
                    }
                });
                C0676b.this.mo2234a(4);
            }

            /* renamed from: a */
            public void mo2177a(C10181a aVar, long j) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2312b();
                            C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                            boolean unused = C0676b.this.f2522N = false;
                        }
                        if (!(!C0676b.this.f2386m || C0676b.this.f2518J == null || C0676b.this.f2518J.get() == null)) {
                            ((C0692a) C0676b.this.f2518J.get()).mo2203f();
                        }
                        C0676b.this.m3358L();
                        C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                    }
                });
                C0676b.this.m3423z();
                long unused = C0676b.this.f2525Q = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo2181b(C10181a aVar) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (!(C0676b.this.f2517I == null || C0676b.this.f2517I.get() == null)) {
                            ((C10192c.C10196d) C0676b.this.f2517I.get()).mo611e_();
                        }
                        if (!C0676b.this.f2541x) {
                            C0676b.this.m3423z();
                        }
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2312b();
                        }
                        C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                    }
                });
            }

            /* renamed from: a */
            public void mo2179a(C10181a aVar, final C10186a aVar2) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        int a = aVar2.mo62896a();
                        int b = aVar2.mo62897b();
                        C0676b.this.m3389b(a, b);
                        C10638l.m31242e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!C0676b.this.mo2247u() || b == -1004) {
                            C10638l.m31242e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a + "," + b);
                            if (C0676b.this.m3398d(a, b)) {
                                C10638l.m31242e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                C0676b.this.f2377d.mo2270a(C0676b.this.f2378e, (WeakReference<Context>) C0676b.this.f2381h, false);
                                C0676b.this.mo2106c(true);
                                C0676b.this.mo2168f();
                            }
                            if (C0676b.this.f2377d != null) {
                                C0676b.this.f2377d.mo2312b();
                            }
                            if (C0676b.this.f2540w != null) {
                                C0676b.this.f2540w.mo35b(C0676b.this.f2539v, C10176a.m29068a(C0676b.this.f2379f, C0676b.this.f2390q));
                            }
                            if (C0676b.this.f2517I != null && C0676b.this.f2517I.get() != null && !C0676b.this.mo2247u()) {
                                ((C10192c.C10196d) C0676b.this.f2517I.get()).mo603a(a, b);
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo2180a(C10181a aVar, boolean z) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2312b();
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo2175a(C10181a aVar, int i, int i2) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0676b.this.m3350H();
                    }
                });
            }

            /* renamed from: a */
            public void mo2176a(C10181a aVar, int i, int i2, int i3) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        if (C0676b.this.f2377d != null) {
                            C0676b.this.f2377d.mo2328u();
                            C0676b.this.f2384k.postDelayed(C0676b.this.f2536s, 8000);
                            boolean unused = C0676b.this.f2522N = true;
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo2174a(C10181a aVar, int i) {
                C0676b.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0676b.this.f2377d.mo2312b();
                        C0676b.this.f2384k.removeCallbacks(C0676b.this.f2536s);
                        boolean unused = C0676b.this.f2522N = false;
                    }
                });
            }

            /* renamed from: a */
            public void mo2178a(C10181a aVar, long j, long j2) {
                if (Math.abs(j - C0676b.this.f2379f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    C0676b.this.f2384k.post(new Runnable() {
                        public void run() {
                            C0676b.this.m3375a(j3, j4);
                        }
                    });
                }
            }
        };
        this.f2528T = 0;
        this.f2529U = 0;
        this.f2536s = new Runnable() {
            public void run() {
                if (C0676b.this.f2377d != null) {
                    C0676b.this.f2377d.mo2270a(C0676b.this.f2378e, (WeakReference<Context>) C0676b.this.f2381h, false);
                    C0676b.this.f2377d.mo2312b();
                    C0676b.this.mo2106c(true);
                    C10638l.m31242e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.f2530V = 0;
        this.f2531W = 0;
        this.f2533Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C0676b.this.mo2155b();
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    int i = 0;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            int type = networkInfo.getType();
                            if (type == 1) {
                                i = 4;
                            } else if (type == 0) {
                                i = 1;
                            }
                        } else {
                            i = C10642o.m31260c(context);
                        }
                    }
                    C0676b.this.m3393c(context, i);
                }
            }
        };
        this.f2534Z = 1;
        this.f2535aa = false;
        this.f2534Z = C10642o.m31260c(context);
        try {
            this.f2519K = viewGroup.getWidth();
            this.f2520L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f2537t = new WeakReference<>(viewGroup);
        this.f2509A = str;
        this.f2381h = new WeakReference(context);
        this.f2378e = nVar;
        m3377a(context);
        this.f2541x = Build.VERSION.SDK_INT >= 17 ? true : z3;
        this.f2510B = z;
        this.f2511C = z2;
        if (jVar != null) {
            this.f2526R = jVar;
        }
    }

    /* renamed from: F */
    public C0701d mo2115o() {
        return this.f2377d;
    }

    /* renamed from: a */
    public void mo2150a(C10192c.C10196d dVar) {
        this.f2517I = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public boolean mo2154a(C10188c cVar) {
        mo2106c(false);
        C10638l.m31235b("tag_video_play", "[video] start NativeVideoController#playVideoUrl and video url is :\r\n" + cVar.mo62961j());
        if (TextUtils.isEmpty(cVar.mo62961j())) {
            C10638l.m31242e("tag_video_play", "[video] play video stop , because no video info");
            return false;
        }
        this.f2524P = cVar;
        m3360M();
        this.f2387n = cVar.mo62956f();
        if (!C0604o.m2910b(this.f2509A) || this.f2379f <= 0) {
            this.f2379f = cVar.mo62952e();
        }
        if (cVar.mo62952e() <= 0) {
            this.f2543z = false;
            this.f2542y = false;
        }
        if (cVar.mo62952e() > 0) {
            this.f2379f = cVar.mo62952e();
            this.f2380g = this.f2380g > this.f2379f ? this.f2380g : this.f2379f;
        }
        if (this.f2377d != null) {
            this.f2377d.mo2262a();
            if (this.f2528T == 0) {
                this.f2377d.mo2282g();
            }
            this.f2377d.mo2319c(cVar.mo62946c(), cVar.mo62949d());
            this.f2377d.mo2320c((ViewGroup) this.f2537t.get());
            this.f2377d.mo2300a(cVar.mo62946c(), cVar.mo62949d());
        }
        if (!(this.f2376c != null || cVar.mo62963l() == -2 || cVar.mo62963l() == 1)) {
            this.f2376c = new C10161d();
        }
        if (this.f2376c != null) {
            this.f2376c.mo62854a(this.f2527S);
        }
        mo2086A();
        C10638l.m31235b("tag_video_play", "[video] new MediaPlayer");
        this.f2539v = 0;
        try {
            m3394c(cVar);
            return true;
        } catch (Exception e) {
            C10638l.m31242e("tag_video_play", "[video] invoke NativeVideoController#playVideo cause exception :" + e.toString());
            return false;
        }
    }

    /* renamed from: l */
    public int mo2171l() {
        return C10176a.m29068a(this.f2380g, this.f2390q);
    }

    /* renamed from: c */
    private void m3394c(C10188c cVar) {
        C10638l.m31235b("tag_video_play", "[video] NativeVideoController#playVideo has invoke !");
        if (cVar == null) {
            C10638l.m31235b("tag_video_play", "VideoUrlModel is null  !!!");
            return;
        }
        if (this.f2376c != null) {
            if (this.f2378e != null) {
                cVar.mo62951d(String.valueOf(C0996u.m4657f(this.f2378e)));
            }
            cVar.mo62947c(0);
            this.f2376c.mo62855a(cVar);
            C10638l.m31235b("tag_video_play", "[video] MediaPlayerProxy has setDataSource !");
        }
        this.f2538u = System.currentTimeMillis();
        if (!TextUtils.isEmpty(cVar.mo62961j())) {
            this.f2377d.mo2321d(8);
            this.f2377d.mo2321d(0);
            mo2097a((Runnable) new Runnable() {
                public void run() {
                    long unused = C0676b.this.f2538u = System.currentTimeMillis();
                    C0676b.this.f2377d.mo2277c(0);
                    if (C0676b.this.f2376c != null && C0676b.this.f2379f == 0) {
                        C0676b.this.f2376c.mo62857a(true, 0, C0676b.this.f2387n);
                    } else if (C0676b.this.f2376c != null) {
                        C0676b.this.f2376c.mo62857a(true, C0676b.this.f2379f, C0676b.this.f2387n);
                    }
                }
            });
        }
        if (this.f2386m) {
            mo2248v();
        }
    }

    /* renamed from: a */
    public void mo2149a(C10192c.C10194b bVar) {
        this.f2512D = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public long mo2110h() {
        if (mo2114n() == null) {
            return 0;
        }
        return mo2114n().mo62872o();
    }

    /* renamed from: i */
    public int mo2111i() {
        if (mo2114n() == null) {
            return 0;
        }
        return mo2114n().mo62873p();
    }

    /* renamed from: j */
    public long mo2112j() {
        if (mo2114n() == null) {
            return 0;
        }
        return mo2114n().mo62874q();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m3419x() {
        this.f2528T++;
        if (mo2088C() && this.f2377d != null) {
            this.f2377d.mo2312b();
            C10192c.C10193a aVar = this.f2540w;
            if (aVar != null) {
                aVar.mo33a(this.f2539v, C10176a.m29068a(this.f2379f, this.f2390q));
            }
            this.f2539v = System.currentTimeMillis() - this.f2538u;
            if ((!C0996u.m4637b(this.f2378e) || this.f2528T >= 2) && this.f2516H) {
                this.f2377d.mo2270a(this.f2378e, (WeakReference<Context>) this.f2381h, true);
            }
            if (!this.f2543z) {
                this.f2543z = true;
                m3375a(this.f2390q, this.f2390q);
                long j = this.f2390q;
                this.f2379f = j;
                this.f2380g = j;
                C0130o.C0131a aVar2 = new C0130o.C0131a();
                aVar2.mo372a(mo2109g());
                aVar2.mo379c(mo2112j());
                aVar2.mo376b(mo2110h());
                aVar2.mo385f(mo2111i());
                C0113a.m480b(this.f2377d, aVar2, this.f2526R);
            }
            if (!this.f2386m && this.f2389p) {
                mo2166e(this.f2377d, (View) null);
            }
            this.f2385l = true;
            if (C0996u.m4637b(this.f2378e) && this.f2528T < 2) {
                mo2141a();
            }
        }
    }

    /* renamed from: a */
    public void mo2148a(C10192c.C10193a aVar) {
        this.f2540w = aVar;
    }

    /* renamed from: b */
    public void mo2155b() {
        if (this.f2376c != null) {
            this.f2376c.mo62858b();
        }
        if (!this.f2543z && this.f2542y) {
            if (C0934b.m4334c()) {
                if (C0947a.m4407a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", true)) {
                    C0130o.C0131a aVar = new C0130o.C0131a();
                    aVar.mo372a(mo2109g());
                    aVar.mo379c(mo2112j());
                    aVar.mo376b(mo2110h());
                    C0113a.m469a((C10185a) this.f2377d, aVar);
                }
                C0947a.m4400a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", (Boolean) true);
                return;
            }
            if (C0625t.m3022a().mo2030b()) {
                C0130o.C0131a aVar2 = new C0130o.C0131a();
                aVar2.mo372a(mo2109g());
                aVar2.mo379c(mo2112j());
                aVar2.mo376b(mo2110h());
                C0113a.m469a((C10185a) this.f2377d, aVar2);
            }
            C0625t.m3022a().mo2028a(true);
        }
    }

    /* renamed from: d */
    public void mo2161d() {
        if (this.f2377d != null) {
            this.f2377d.mo2262a();
        }
        if (this.f2377d != null) {
            this.f2377d.mo2329v();
        }
        m3421y();
    }

    /* renamed from: h */
    public void mo2245h(boolean z) {
        if (this.f2377d != null) {
            this.f2377d.mo2262a();
        }
        if (this.f2377d != null && z) {
            this.f2377d.mo2329v();
        }
        m3421y();
    }

    /* renamed from: y */
    private void m3421y() {
        C10638l.m31231a("CSJ_VIDEO_NativeController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f2383j));
        if (this.f2376c != null) {
            if (this.f2376c.mo62870m()) {
                if (this.f2383j) {
                    mo2090E();
                } else {
                    mo2102b(this.f2391r);
                }
                C10638l.m31231a("CSJ_VIDEO_NativeController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f2383j));
            } else {
                this.f2376c.mo62857a(false, this.f2379f, this.f2387n);
            }
        }
        if (this.f2542y) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo372a(mo2109g());
            aVar.mo379c(mo2112j());
            aVar.mo376b(mo2110h());
            C0113a.m479b(mo2115o(), aVar);
        }
    }

    /* renamed from: d */
    public void mo2243d(long j) {
        this.f2379f = j;
        this.f2380g = this.f2380g > this.f2379f ? this.f2380g : this.f2379f;
        if (this.f2377d != null) {
            this.f2377d.mo2262a();
        }
        if (this.f2376c != null) {
            this.f2376c.mo62857a(true, this.f2379f, this.f2387n);
        }
    }

    /* renamed from: e */
    public void mo2165e() {
        mo2153a(true, 3);
    }

    /* renamed from: a */
    public void mo2153a(boolean z, int i) {
        if (this.f2386m) {
            this.f2529U = mo2112j();
            mo2234a(1);
        }
        if (!this.f2543z && this.f2542y) {
            if (z) {
                C0130o.C0131a aVar = new C0130o.C0131a();
                aVar.mo372a(mo2109g());
                aVar.mo379c(mo2112j());
                aVar.mo376b(mo2110h());
                aVar.mo383e(i);
                aVar.mo385f(mo2111i());
                C0113a.m470a((C10185a) this.f2377d, aVar, this.f2526R);
                this.f2543z = false;
            } else {
                C0130o.C0131a aVar2 = new C0130o.C0131a();
                aVar2.mo372a(mo2109g());
                aVar2.mo379c(mo2112j());
                aVar2.mo376b(mo2110h());
                C0113a.m469a((C10185a) this.f2377d, aVar2);
            }
        }
        mo2168f();
    }

    /* renamed from: f */
    public void mo2168f() {
        if (this.f2376c != null) {
            this.f2376c.mo62861d();
            this.f2376c = null;
        }
        if (!C0996u.m4637b(this.f2378e) || this.f2528T == 2) {
            if (this.f2516H) {
                this.f2377d.mo2270a(this.f2378e, (WeakReference<Context>) this.f2381h, true);
            } else {
                return;
            }
        }
        if (this.f2384k != null) {
            this.f2384k.removeCallbacksAndMessages((Object) null);
        }
        if (this.f2382i != null) {
            this.f2382i.clear();
        }
        if (this.f2386m) {
            mo2249w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m3423z() {
        if (!this.f2542y) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo373a(this.f2515G);
            aVar.mo379c(mo2112j());
            C0113a.m468a(C0558m.m2663a(), (C10185a) this.f2377d, aVar, this.f2526R);
            this.f2542y = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3389b(int i, int i2) {
        if (this.f2378e != null) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo376b(mo2110h());
            aVar.mo379c(mo2112j());
            aVar.mo372a(mo2109g());
            aVar.mo371a(i);
            aVar.mo375b(i2);
            C0113a.m483c(mo2115o(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m3350H() {
        int i;
        int i2;
        C10638l.m31235b("ChangeVideoSize", "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (!(this.f2381h == null || this.f2381h.get() == null || m3351I() == null || this.f2376c == null || this.f2537t == null)) {
                if (this.f2537t.get() != null) {
                    int j = this.f2376c.mo62867j();
                    int k = this.f2376c.mo62868k();
                    int width = ((ViewGroup) this.f2537t.get()).getWidth();
                    int height = ((ViewGroup) this.f2537t.get()).getHeight();
                    if (width > 0 && height > 0 && k > 0) {
                        if (j > 0) {
                            if (j == k) {
                                i2 = width > height ? height : width;
                                i = i2;
                            } else if (j > k) {
                                i2 = (int) ((((double) width) * 1.0d) / ((double) ((((float) j) * 1.0f) / ((float) k))));
                                i = width;
                            } else {
                                i = (int) ((((double) height) * 1.0d) / ((double) ((((float) k) * 1.0f) / ((float) j))));
                                i2 = height;
                            }
                            if (i2 <= height) {
                                if (i2 > 0) {
                                    height = i2;
                                }
                            }
                            if (i <= width) {
                                if (i > 0) {
                                    width = i;
                                }
                            }
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(13);
                            if (m3351I() instanceof TextureView) {
                                ((TextureView) m3351I()).setLayoutParams(layoutParams);
                                C10638l.m31235b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                return;
                            } else if (m3351I() instanceof SurfaceView) {
                                ((SurfaceView) m3351I()).setLayoutParams(layoutParams);
                                C10638l.m31235b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    C10638l.m31235b("ChangeVideoSize", " container or video exist size <= 0");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[step-1] >>>>> mContextRef=");
            sb.append(this.f2381h);
            sb.append(",mContextRef.get()=");
            sb.append(this.f2381h != null ? (Context) this.f2381h.get() : null);
            sb.append(",getIRenderView() =");
            sb.append(m3351I());
            C10638l.m31235b("ChangeVideoSize", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[step-1] >>>>> mMediaPlayerProxy == null:");
            boolean z = true;
            sb2.append(this.f2376c == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            if (this.f2376c == null) {
                z = false;
            }
            sb2.append(z);
            C10638l.m31235b("ChangeVideoSize", sb2.toString());
        } catch (Throwable th) {
            C10638l.m31235b("ChangeVideoSize", "[step-11] >>>>> changeVideoSize error !!!!! ：" + th.toString());
        }
    }

    /* renamed from: I */
    private C10206b m3351I() {
        if (this.f2381h == null || this.f2381h.get() == null || ((Context) this.f2381h.get()).getResources().getConfiguration().orientation != 1 || this.f2377d == null) {
            return null;
        }
        return this.f2377d.mo2324q();
    }

    /* renamed from: a */
    public void mo2145a(C10190b bVar, View view) {
        if (this.f2376c != null && mo2088C()) {
            if (this.f2376c.mo62869l()) {
                mo2155b();
                this.f2377d.mo2317b(true, false);
                this.f2377d.mo2281f();
            } else if (!this.f2376c.mo62870m()) {
                if (this.f2377d != null) {
                    this.f2377d.mo2320c((ViewGroup) this.f2537t.get());
                }
                mo2243d(this.f2379f);
                if (this.f2377d != null) {
                    this.f2377d.mo2317b(false, false);
                }
            } else {
                mo2245h(false);
                if (this.f2377d != null) {
                    this.f2377d.mo2317b(false, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2143a(C10190b bVar, int i) {
        if (this.f2376c != null) {
            m3376a(this.f2532X, m3395c(i));
        }
    }

    /* renamed from: b */
    public void mo2157b(C10190b bVar, int i) {
        if (this.f2377d != null) {
            this.f2377d.mo2281f();
        }
    }

    /* renamed from: a */
    public void mo2144a(C10190b bVar, int i, boolean z) {
        if (mo2088C()) {
            long n = (long) ((((float) (((long) i) * this.f2390q)) * 1.0f) / ((float) C10647t.m31292n((Context) this.f2381h.get(), "tt_video_progress_max")));
            if (this.f2390q > 0) {
                this.f2532X = (long) ((int) n);
            } else {
                this.f2532X = 0;
            }
            if (this.f2377d != null) {
                this.f2377d.mo2264a(this.f2532X);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3375a(long j, long j2) {
        this.f2379f = j;
        this.f2390q = j2;
        this.f2377d.mo2265a(j, j2);
        this.f2377d.mo2263a(C10176a.m29068a(j, j2));
        try {
            if (this.f2540w != null) {
                this.f2540w.mo34a(j, j2);
            }
        } catch (Throwable th) {
            C10638l.m31239c("CSJ_VIDEO_NativeController", "onProgressUpdate error: ", th);
        }
    }

    /* renamed from: b */
    public void mo2158b(C10190b bVar, View view) {
        mo2242b(bVar, view, false, false);
    }

    /* renamed from: b */
    public void mo2242b(C10190b bVar, View view, boolean z, boolean z2) {
        if (mo2088C()) {
            mo2108f(!this.f2389p);
            if (!(this.f2381h.get() instanceof Activity)) {
                C10638l.m31235b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f2389p) {
                mo2241b(z ? 8 : 0);
                if (this.f2377d != null) {
                    this.f2377d.mo2268a((ViewGroup) this.f2537t.get());
                    this.f2377d.mo2278c(false);
                }
            } else {
                mo2241b(1);
                if (this.f2377d != null) {
                    this.f2377d.mo2274b((ViewGroup) this.f2537t.get());
                    this.f2377d.mo2278c(false);
                }
            }
            WeakReference<C10192c.C10194b> weakReference = this.f2512D;
            C10192c.C10194b bVar2 = weakReference != null ? (C10192c.C10194b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.mo258a(this.f2389p);
            }
        }
    }

    /* renamed from: b */
    public void mo2241b(int i) {
        if (mo2088C()) {
            boolean z = i == 0 || i == 8;
            Context context = (Context) this.f2381h.get();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    activity.setRequestedOrientation(i);
                } catch (Throwable unused) {
                }
                if (!z) {
                    activity.getWindow().setFlags(1024, 1024);
                } else {
                    activity.getWindow().clearFlags(1024);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2160c(C10190b bVar, View view) {
        if (this.f2377d != null) {
            this.f2377d.mo2284i();
        }
        mo2165e();
    }

    /* renamed from: a */
    public void mo2147a(C10190b bVar, View view, boolean z, boolean z2) {
        if (this.f2386m) {
            mo2155b();
        }
        if (z && !this.f2386m && !mo2246t()) {
            this.f2377d.mo2317b(!mo2247u(), false);
            this.f2377d.mo2273a(z2, true, false);
        }
        if (this.f2376c == null || !this.f2376c.mo62869l()) {
            this.f2377d.mo2281f();
            return;
        }
        this.f2377d.mo2281f();
        this.f2377d.mo2280e();
    }

    /* renamed from: d */
    public void mo2163d(C10190b bVar, View view) {
        if (this.f2389p) {
            mo2108f(false);
            if (this.f2377d != null) {
                this.f2377d.mo2274b((ViewGroup) this.f2537t.get());
            }
            mo2241b(1);
            return;
        }
        mo2165e();
    }

    /* renamed from: e */
    public void mo2166e(C10190b bVar, View view) {
        mo2237a(bVar, view, false);
    }

    /* renamed from: a */
    public void mo2237a(C10190b bVar, View view, boolean z) {
        m3354J();
    }

    /* renamed from: J */
    private void m3354J() {
        if (mo2088C()) {
            mo2108f(!this.f2389p);
            if (!(this.f2381h.get() instanceof Activity)) {
                C10638l.m31235b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f2377d != null) {
                this.f2377d.mo2274b((ViewGroup) this.f2537t.get());
                this.f2377d.mo2278c(false);
            }
            mo2241b(1);
            WeakReference<C10192c.C10194b> weakReference = this.f2512D;
            C10192c.C10194b bVar = weakReference != null ? (C10192c.C10194b) weakReference.get() : null;
            if (bVar != null) {
                bVar.mo258a(this.f2389p);
            }
        }
    }

    /* renamed from: t */
    public boolean mo2246t() {
        return this.f2376c == null || this.f2376c.mo62865h();
    }

    /* renamed from: a */
    public void mo2141a() {
        if (C10642o.m31260c(C0558m.m2663a()) != 0) {
            mo2168f();
            C10188c cVar = this.f2524P;
            if (cVar != null) {
                cVar.mo62945b(this.f2378e.mo1345Y());
                this.f2524P.mo62937a(this.f2519K);
                this.f2524P.mo62944b(this.f2520L);
                this.f2524P.mo62941a((List<String>) null);
                this.f2524P.mo62948c(this.f2378e.mo1382ac());
                this.f2524P.mo62938a(0);
                this.f2524P.mo62942a(mo2116p());
                C10188c cVar2 = this.f2524P;
                cVar2.mo62939a(cVar2.mo62936a());
                mo2154a(this.f2524P);
                mo2106c(false);
            }
        }
    }

    /* renamed from: u */
    public boolean mo2247u() {
        return this.f2376c != null && this.f2376c.mo62869l();
    }

    /* renamed from: a */
    private void m3376a(long j, boolean z) {
        if (this.f2376c != null) {
            if (z) {
                m3356K();
            }
            this.f2376c.mo62850a(j);
        }
    }

    /* renamed from: c */
    private boolean m3395c(int i) {
        return this.f2377d.mo2276b(i);
    }

    /* renamed from: K */
    private void m3356K() {
        if (this.f2377d != null) {
            this.f2377d.mo2277c(0);
            this.f2377d.mo2272a(false, false);
            this.f2377d.mo2278c(false);
            this.f2377d.mo2280e();
            this.f2377d.mo2282g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$6 */
    /* compiled from: NativeVideoController */
    static /* synthetic */ class C06916 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2562a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2562a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2562a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2562a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.C0676b.C06916.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo2151a(C0742e.C0744a aVar, String str) {
        int i = C06916.f2562a[aVar.ordinal()];
        if (i == 1) {
            mo2155b();
        } else if (i == 2) {
            mo2165e();
        } else if (i == 3) {
            mo2161d();
            this.f2388o = false;
            this.f2513E = true;
        }
    }

    /* renamed from: c */
    private boolean m3396c(int i, int i2) {
        if (i2 == 0) {
            mo2155b();
            this.f2388o = true;
            if (this.f2377d != null) {
                this.f2377d.mo2270a(this.f2378e, (WeakReference<Context>) this.f2381h, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.f2377d != null) {
                this.f2377d.mo2262a();
            }
            mo2155b();
            this.f2388o = true;
            this.f2513E = false;
            if (!(this.f2377d == null || this.f2378e == null)) {
                return this.f2377d.mo2310a(i, this.f2378e.mo1330J(), this.f2511C);
            }
        } else if (i2 == 4) {
            this.f2388o = false;
            if (this.f2377d != null) {
                this.f2377d.mo2326s();
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m3390b(Context context, int i) {
        if (mo2088C() && context != null && this.f2534Z != i) {
            this.f2534Z = i;
            if (!(i == 4 || i == 0)) {
                this.f2513E = false;
            }
            if (!this.f2513E && !mo2117q() && this.f2510B) {
                m3396c(2, i);
            }
            WeakReference<C0692a> weakReference = this.f2518J;
            if (weakReference != null && weakReference.get() != null) {
                ((C0692a) this.f2518J.get()).mo2200a(this.f2534Z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3393c(Context context, int i) {
        m3390b(context, i);
        if (i == 4) {
            this.f2388o = false;
        }
    }

    /* renamed from: a */
    public void mo2236a(Context context, int i) {
        m3390b(context, i);
        if (i == 4) {
            this.f2388o = false;
            mo2161d();
        }
    }

    /* renamed from: v */
    public void mo2248v() {
        if (!this.f2535aa && this.f2523O) {
            Context applicationContext = C0558m.m2663a().getApplicationContext();
            this.f2535aa = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                applicationContext.registerReceiver(this.f2533Y, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: w */
    public void mo2249w() {
        if (this.f2535aa && this.f2523O) {
            Context applicationContext = C0558m.m2663a().getApplicationContext();
            this.f2535aa = false;
            try {
                applicationContext.unregisterReceiver(this.f2533Y);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo2240a(C0692a aVar) {
        this.f2518J = new WeakReference<>(aVar);
    }

    /* renamed from: c */
    public void mo2106c(boolean z) {
        this.f2385l = z;
    }

    /* renamed from: d */
    public void mo2164d(boolean z) {
        this.f2515G = z;
    }

    /* renamed from: r */
    public boolean mo2172r() {
        return this.f2522N;
    }

    /* renamed from: e */
    public void mo2167e(boolean z) {
        this.f2523O = z;
    }

    /* renamed from: b */
    public void mo2156b(C10188c cVar) {
        this.f2524P = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m3398d(int i, int i2) {
        C10638l.m31235b("TTVideoLandingPage", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* renamed from: k */
    public long mo2170k() {
        return mo2109g() + mo2110h();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m3358L() {
        if (this.f2378e != null) {
            C0558m.m2672g().mo2740a(C0890e.m4260a(this.f2378e.mo1340T(), true, this.f2378e));
        }
    }

    /* renamed from: M */
    private void m3360M() {
        if (this.f2381h != null) {
            C0113a.m476a(this.f2378e, (C10185a) this.f2377d, this.f2524P);
        }
    }
}
