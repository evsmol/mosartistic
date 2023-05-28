package com.bytedance.sdk.openadsdk.core.video.p034c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.p271vk.openvk.component.video.api.C10181a;
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
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0701d;
import com.bytedance.sdk.openadsdk.core.video.p032a.C0639a;
import com.bytedance.sdk.openadsdk.core.widget.C0742e;
import com.bytedance.sdk.openadsdk.p049k.C0890e;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a */
/* compiled from: BaseVideoController */
public abstract class C0651a extends C0639a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f2418A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f2419B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C10192c.C10193a f2420C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f2421D = false;

    /* renamed from: E */
    private boolean f2422E = false;

    /* renamed from: F */
    private boolean f2423F = false;

    /* renamed from: G */
    private WeakReference<C10192c.C10194b> f2424G;

    /* renamed from: H */
    private int f2425H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f2426I = false;

    /* renamed from: J */
    private boolean f2427J = true;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f2428K;

    /* renamed from: L */
    private boolean f2429L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f2430M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final Runnable f2431N = new Runnable() {
        public void run() {
            if (C0651a.this.f2420C != null) {
                C0651a.this.mo652z();
                C0651a.this.f2420C.mo32a();
            }
        }
    };

    /* renamed from: O */
    private long f2432O;

    /* renamed from: P */
    private final BroadcastReceiver f2433P = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C0651a.this.mo2155b();
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
                    C0651a.this.m3168a(context, i);
                }
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: Q */
    private int f2434Q = 1;

    /* renamed from: R */
    private boolean f2435R = false;

    /* renamed from: s */
    protected Map<String, Object> f2436s = null;

    /* renamed from: t */
    protected long f2437t = 0;

    /* renamed from: u */
    protected long f2438u = 0;

    /* renamed from: v */
    protected boolean f2439v = false;

    /* renamed from: w */
    protected boolean f2440w = false;

    /* renamed from: x */
    protected C10188c f2441x;

    /* renamed from: y */
    C10181a.C10182a f2442y = new C10181a.C10182a() {
        /* renamed from: d */
        public void mo2184d(C10181a aVar) {
        }

        /* renamed from: e */
        public void mo2185e(C10181a aVar) {
        }

        /* renamed from: a */
        public void mo2173a(C10181a aVar) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onCompletion: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    C0651a.this.m3143O();
                }
            });
            if (C0651a.this.f2378e.mo1403ax() != null && C0651a.this.f2378e.mo1403ax().mo1726a() != null) {
                C0651a.this.f2378e.mo1403ax().mo1726a().mo1799d(C0651a.this.mo2109g());
                C0651a.this.f2378e.mo1403ax().mo1726a().mo1801e(C0651a.this.mo2109g());
            }
        }

        /* renamed from: a */
        public void mo2177a(C10181a aVar, final long j) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRenderStart: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    if (C0651a.this.f2377d != null) {
                        C0651a.this.f2377d.mo2312b();
                        C0651a.this.f2384k.removeCallbacks(C0651a.this.f2431N);
                        boolean unused = C0651a.this.f2426I = false;
                    }
                    if (!C0651a.this.f2421D) {
                        C0651a.this.f2438u = j;
                        C0651a.this.mo650x();
                        C0651a.this.m3158V();
                        boolean unused2 = C0651a.this.f2421D = true;
                        C0651a.this.f2440w = true;
                    }
                }
            });
            long unused = C0651a.this.f2428K = System.currentTimeMillis();
        }

        /* renamed from: b */
        public void mo2181b(C10181a aVar) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onPrepared: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    if (C0651a.this.f2384k != null) {
                        C0651a.this.f2384k.removeCallbacks(C0651a.this.f2431N);
                    }
                    if (C0651a.this.f2377d != null) {
                        C0651a.this.f2377d.mo2312b();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2179a(C10181a aVar, final C10186a aVar2) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onError: ");
            if (aVar2 != null) {
                C0651a.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0651a.this.mo644a(aVar2.mo62896a(), aVar2.mo62897b());
                        C0651a.this.f2384k.removeCallbacks(C0651a.this.f2431N);
                        if (C0651a.this.f2377d != null) {
                            C0651a.this.f2377d.mo2312b();
                        }
                        if (C0651a.this.f2420C != null) {
                            C0651a.this.f2420C.mo35b(C0651a.this.f2419B, C10176a.m29068a(C0651a.this.f2379f, C0651a.this.f2390q));
                        }
                    }
                });
                aVar2.mo62896a();
                aVar2.mo62898c();
            }
        }

        /* renamed from: a */
        public void mo2180a(C10181a aVar, boolean z) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onSeekCompletion: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    C0651a.this.f2384k.removeCallbacks(C0651a.this.f2431N);
                    if (C0651a.this.f2377d != null) {
                        C0651a.this.f2377d.mo2312b();
                    }
                }
            });
        }

        /* renamed from: c */
        public void mo2183c(C10181a aVar) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRelease: ");
        }

        /* renamed from: a */
        public void mo2175a(C10181a aVar, int i, int i2) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onVideoSizeChanged: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    if (!C0651a.this.m3146P()) {
                        C0651a.this.m3148Q();
                    } else if (C0651a.this.f2378e != null && (C0464l.m1967b(C0651a.this.f2378e) || C0651a.this.f2430M)) {
                        C0651a.this.mo2169g(true);
                    } else if (C0651a.this.f2378e != null && C0651a.this.f2378e.mo1469t() == 3) {
                        C0651a.this.mo2169g(true);
                    } else if (C0651a.this.f2378e == null || C0651a.this.f2378e.mo1469t() != 0) {
                        C0651a.this.m3151S();
                    } else {
                        C0651a.this.m3154T();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2176a(C10181a aVar, int i, int i2, int i3) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferStart: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    if (C0651a.this.f2377d != null) {
                        C0651a.this.f2377d.mo2328u();
                        C0651a.this.m3141N();
                        boolean unused = C0651a.this.f2426I = true;
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2174a(C10181a aVar, int i) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferEnd: ");
            C0651a.this.f2384k.post(new Runnable() {
                public void run() {
                    if (C0651a.this.f2377d != null) {
                        C0651a.this.f2377d.mo2312b();
                        C0651a.this.f2384k.removeCallbacks(C0651a.this.f2431N);
                        boolean unused = C0651a.this.f2426I = false;
                    }
                }
            });
        }

        /* renamed from: b */
        public void mo2182b(C10181a aVar, int i) {
            C10638l.m31238c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferingUpdate: ");
        }

        /* renamed from: a */
        public void mo2178a(C10181a aVar, long j, long j2) {
            if (Math.abs(j - C0651a.this.f2379f) >= 50) {
                final long j3 = j;
                final long j4 = j2;
                C0651a.this.f2384k.post(new Runnable() {
                    public void run() {
                        C0651a.this.m3165a(j3, j4);
                    }
                });
                if (C0651a.this.f2378e.mo1403ax() != null && C0651a.this.f2378e.mo1403ax().mo1726a() != null) {
                    C0651a.this.f2378e.mo1403ax().mo1726a().mo1786a(j, j2);
                }
            }
        }
    };

    /* renamed from: z */
    private final ViewGroup f2443z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo644a(int i, int i2);

    /* renamed from: a */
    public void mo2146a(C10190b bVar, View view, boolean z) {
    }

    /* renamed from: a */
    public void mo2150a(C10192c.C10196d dVar) {
    }

    /* renamed from: d */
    public void mo2164d(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo646t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo647u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo648v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo649w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo650x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo651y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo652z();

    /* renamed from: H */
    public void mo2135H() {
        C10181a.C10182a aVar = this.f2442y;
        if (aVar != null) {
            aVar.mo2175a((C10181a) null, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2169g(boolean z) {
        try {
            C10638l.m31238c("changeVideoSize", "landingPageChangeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f2378e.mo1477x());
            if (!m3150R() || z) {
                C10638l.m31238c("changeVideoSize", "landingPageChangeVideoSize start check condition complete ... go ..");
                float j = (float) this.f2376c.mo62867j();
                float k = (float) this.f2376c.mo62868k();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) j, (int) k);
                layoutParams.addRule(13);
                if (mo2137J() != null) {
                    if (mo2137J() instanceof TextureView) {
                        ((TextureView) mo2137J()).setLayoutParams(layoutParams);
                    } else if (mo2137J() instanceof SurfaceView) {
                        ((SurfaceView) mo2137J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f2443z.getLayoutParams();
                    if (this.f2443z.getHeight() > 0) {
                        float min = Math.min(((float) this.f2443z.getWidth()) / j, ((float) this.f2443z.getHeight()) / k);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (j * min);
                            layoutParams.height = (int) (k * min);
                            if (mo2137J() instanceof TextureView) {
                                ((TextureView) mo2137J()).setLayoutParams(layoutParams);
                            } else if (mo2137J() instanceof SurfaceView) {
                                ((SurfaceView) mo2137J()).setLayoutParams(layoutParams);
                            }
                            if (this.f2430M) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.f2443z.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                C10638l.m31235b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            C10638l.m31239c("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    private void m3167a(Context context) {
        EnumSet<E> noneOf = EnumSet.noneOf(C10190b.C10191a.class);
        noneOf.add(C10190b.C10191a.hideCloseBtn);
        noneOf.add(C10190b.C10191a.hideBackBtn);
        this.f2377d = new C0701d(context.getApplicationContext(), LayoutInflater.from(context.getApplicationContext()).inflate(C10647t.m31284f(context, "tt_video_play_layout_for_live"), (ViewGroup) null, false), true, noneOf, this.f2378e, this);
        this.f2377d.mo2306a((C10189a) this);
    }

    protected C0651a(Context context, ViewGroup viewGroup, C0477n nVar) {
        this.f2434Q = C10642o.m31260c(context);
        this.f2443z = viewGroup;
        this.f2381h = new WeakReference(context);
        this.f2378e = nVar;
        m3167a(context);
        this.f2425H = C0996u.m4657f(this.f2378e);
    }

    /* renamed from: a */
    public boolean mo2154a(C10188c cVar) {
        mo2106c(false);
        if (cVar == null) {
            return false;
        }
        if (this.f2376c == null || !this.f2376c.mo62870m()) {
            this.f2441x = cVar;
            C10638l.m31235b("CSJ_VIDEO_BaseController", "video local url " + cVar.mo62961j());
            if (TextUtils.isEmpty(cVar.mo62961j())) {
                C10638l.m31242e("CSJ_VIDEO_BaseController", "No video info");
                return false;
            }
            mo651y();
            this.f2439v = !cVar.mo62961j().startsWith("http");
            this.f2387n = cVar.mo62956f();
            if (cVar.mo62952e() > 0) {
                this.f2379f = cVar.mo62952e();
                this.f2380g = this.f2380g > this.f2379f ? this.f2380g : this.f2379f;
            }
            if (this.f2377d != null) {
                this.f2377d.mo2262a();
                this.f2377d.mo2282g();
                this.f2377d.mo2319c(cVar.mo62946c(), cVar.mo62949d());
                this.f2377d.mo2320c(this.f2443z);
            }
            if (!(this.f2376c != null || cVar.mo62963l() == -2 || cVar.mo62963l() == 1)) {
                this.f2376c = new C10161d();
            }
            if (this.f2376c != null) {
                this.f2376c.mo62854a(this.f2442y);
            }
            mo2086A();
            this.f2419B = 0;
            try {
                m3191c(cVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            this.f2376c.mo62849a();
            return true;
        }
    }

    /* renamed from: r */
    public boolean mo2172r() {
        return this.f2426I;
    }

    /* renamed from: e */
    public void mo2167e(boolean z) {
        this.f2427J = z;
    }

    /* renamed from: b */
    public void mo2156b(C10188c cVar) {
        this.f2441x = cVar;
    }

    /* renamed from: l */
    public int mo2171l() {
        return C10176a.m29068a(this.f2380g, this.f2390q);
    }

    /* renamed from: a */
    public void mo2152a(Map<String, Object> map) {
        this.f2436s = map;
    }

    /* renamed from: c */
    private void m3191c(C10188c cVar) throws Exception {
        if (cVar != null) {
            this.f2441x = cVar;
            if (this.f2376c != null) {
                if (this.f2378e != null) {
                    this.f2378e.mo1330J();
                    cVar.mo62951d(String.valueOf(C0996u.m4657f(this.f2378e)));
                }
                cVar.mo62947c(1);
                this.f2376c.mo62855a(cVar);
            }
            this.f2418A = System.currentTimeMillis();
            if (!TextUtils.isEmpty(cVar.mo62961j())) {
                this.f2377d.mo2321d(8);
                this.f2377d.mo2321d(0);
                mo2097a((Runnable) new Runnable() {
                    public void run() {
                        long unused = C0651a.this.f2418A = System.currentTimeMillis();
                        C0651a.this.f2377d.mo2277c(0);
                        if (C0651a.this.f2376c != null && C0651a.this.f2379f == 0) {
                            C0651a.this.f2376c.mo62857a(true, 0, C0651a.this.f2387n);
                        } else if (C0651a.this.f2376c != null) {
                            C0651a.this.f2376c.mo62857a(true, C0651a.this.f2379f, C0651a.this.f2387n);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m3141N() {
        int i;
        int t = mo646t();
        if (t == 2 || t == 1) {
            i = C0558m.m2673h().mo1724y() * 1000;
        } else {
            i = t == 3 ? C0558m.m2673h().mo1687e(String.valueOf(this.f2425H)) : 5;
        }
        this.f2384k.removeCallbacks(this.f2431N);
        this.f2384k.postDelayed(this.f2431N, (long) i);
    }

    /* renamed from: a */
    public void mo2149a(C10192c.C10194b bVar) {
        this.f2424G = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m3143O() {
        if (mo2088C() && this.f2377d != null) {
            this.f2384k.removeCallbacks(this.f2431N);
            this.f2377d.mo2312b();
            long currentTimeMillis = System.currentTimeMillis() - this.f2418A;
            this.f2419B = currentTimeMillis;
            C10192c.C10193a aVar = this.f2420C;
            if (aVar != null) {
                aVar.mo33a(currentTimeMillis, C10176a.m29068a(this.f2379f, this.f2390q));
            }
            if (!this.f2422E) {
                this.f2422E = true;
                m3165a(this.f2390q, this.f2390q);
                long j = this.f2390q;
                this.f2379f = j;
                this.f2380g = j;
                mo647u();
            }
            this.f2385l = true;
        }
    }

    /* renamed from: a */
    public void mo2148a(C10192c.C10193a aVar) {
        this.f2420C = aVar;
    }

    /* renamed from: b */
    public void mo2155b() {
        if (this.f2376c != null) {
            this.f2376c.mo62858b();
        }
        if (!this.f2422E && this.f2421D) {
            mo648v();
            if (this.f2378e.mo1403ax() != null && this.f2378e.mo1403ax().mo1726a() != null) {
                this.f2378e.mo1403ax().mo1726a().mo1795b(this.f2379f);
            }
        }
    }

    /* renamed from: d */
    public void mo2161d() {
        if (this.f2377d != null) {
            this.f2377d.mo2262a();
            this.f2377d.mo2326s();
            this.f2377d.mo2329v();
        }
        C10638l.m31231a("CSJ_VIDEO_BaseController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f2383j));
        if (this.f2376c != null) {
            if (this.f2376c.mo62870m()) {
                if (this.f2383j) {
                    mo2090E();
                } else {
                    mo2102b(this.f2391r);
                }
                C10638l.m31231a("CSJ_VIDEO_BaseController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f2383j));
            } else {
                this.f2376c.mo62857a(false, this.f2379f, this.f2387n);
            }
        }
        if (!this.f2422E && this.f2421D) {
            mo649w();
            if (this.f2378e.mo1403ax() != null && this.f2378e.mo1403ax().mo1726a() != null) {
                this.f2378e.mo1403ax().mo1726a().mo1797c(mo2109g());
            }
        }
    }

    /* renamed from: I */
    public void mo2136I() {
        if (!this.f2422E && this.f2421D) {
            mo649w();
            if (this.f2378e.mo1403ax() != null && this.f2378e.mo1403ax().mo1726a() != null) {
                this.f2378e.mo1403ax().mo1726a().mo1797c(mo2109g());
            }
        }
    }

    /* renamed from: d */
    public void mo2162d(long j) {
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
        if (this.f2376c != null) {
            this.f2376c.mo62861d();
            this.f2376c = null;
        }
        if (this.f2377d != null) {
            this.f2377d.mo2284i();
        }
        if (this.f2384k != null) {
            this.f2384k.removeCallbacks(this.f2431N);
            this.f2384k.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: a */
    public void mo2153a(boolean z, int i) {
        mo2165e();
    }

    /* renamed from: f */
    public void mo2168f() {
        mo2165e();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public boolean m3146P() {
        if (this.f2378e == null || this.f2378e.mo1393an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m3148Q() {
        try {
            if (mo2137J() != null && this.f2376c != null) {
                if (this.f2443z != null) {
                    int width = this.f2443z.getWidth();
                    int height = this.f2443z.getHeight();
                    float j = (float) this.f2376c.mo62867j();
                    float k = (float) this.f2376c.mo62868k();
                    float f = (float) width;
                    float f2 = (float) height;
                    if (j / (f * 1.0f) <= k / (f2 * 1.0f)) {
                        f = (f2 / (k * 1.0f)) * j;
                    } else {
                        f2 = (f / (j * 1.0f)) * k;
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                    layoutParams.addRule(13);
                    if (mo2137J() instanceof TextureView) {
                        ((TextureView) mo2137J()).setLayoutParams(layoutParams);
                    } else if (mo2137J() instanceof SurfaceView) {
                        ((SurfaceView) mo2137J()).setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            C10638l.m31239c("changeVideoSize", "changeVideoSizeSupportInteraction error", th);
        }
    }

    /* renamed from: R */
    private boolean m3150R() throws Throwable {
        if (this.f2381h == null || this.f2381h.get() == null || mo2137J() == null || this.f2376c == null || this.f2378e == null || this.f2378e.mo1327G() != null || this.f2378e.mo1473v() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0139 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014d A[Catch:{ all -> 0x0187 }] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3151S() {
        /*
            r15 = this;
            java.lang.String r0 = ",videoWidth="
            java.lang.String r1 = "changeVideoSize"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r2.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "changeVideoSize start.......mMaterialMeta.getAdSlot()="
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.openadsdk.core.e.n r3 = r15.f2378e     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.openadsdk.AdSlot r3 = r3.mo1477x()     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r2)     // Catch:{ all -> 0x0187 }
            boolean r2 = r15.m3150R()     // Catch:{ all -> 0x0187 }
            if (r2 == 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.String r2 = "changeVideoSize start check condition complete ... go .."
            com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r2)     // Catch:{ all -> 0x0187 }
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x0187 }
            int[] r2 = com.bytedance.sdk.openadsdk.utils.C1002v.m4737b((android.content.Context) r2)     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.openadsdk.core.e.n r3 = r15.f2378e     // Catch:{ all -> 0x0187 }
            int r3 = r3.mo1392am()     // Catch:{ all -> 0x0187 }
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            r6 = r2[r4]     // Catch:{ all -> 0x0187 }
            float r8 = (float) r6     // Catch:{ all -> 0x0187 }
            r2 = r2[r5]     // Catch:{ all -> 0x0187 }
            float r9 = (float) r2     // Catch:{ all -> 0x0187 }
            com.bykv.vk.openvk.component.video.api.a r2 = r15.f2376c     // Catch:{ all -> 0x0187 }
            int r2 = r2.mo62867j()     // Catch:{ all -> 0x0187 }
            float r10 = (float) r2     // Catch:{ all -> 0x0187 }
            com.bykv.vk.openvk.component.video.api.a r2 = r15.f2376c     // Catch:{ all -> 0x0187 }
            int r2 = r2.mo62868k()     // Catch:{ all -> 0x0187 }
            float r11 = (float) r2     // Catch:{ all -> 0x0187 }
            if (r3 == 0) goto L_0x0064
            int r2 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0073
            java.lang.String r0 = "Separate adaptation for landscape to portrait ....."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r12 = 1
            r7 = r15
            r7.m3164a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0187 }
            return
        L_0x0064:
            int r2 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0073
            java.lang.String r0 = "Separate adaptation for portrait to landscape....."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r12 = 0
            r7 = r15
            r7.m3164a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0187 }
            return
        L_0x0073:
            float r2 = r10 / r11
            float r6 = r8 / r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = "screenHeight="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = ",screenWidth="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r8)     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = "videoHeight="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r11)     // Catch:{ all -> 0x0187 }
            r7.append(r0)     // Catch:{ all -> 0x0187 }
            r7.append(r10)     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = "video w/h,videoScale="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = ",screen  w/h .screenScale="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = ",VERTICAL_SCALE(9:16)="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r12 = 1058013184(0x3f100000, float:0.5625)
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            java.lang.String r13 = ",HORIZONTAL_SCALE(16:9) ="
            r7.append(r13)     // Catch:{ all -> 0x0187 }
            r13 = 1071877689(0x3fe38e39, float:1.7777778)
            r7.append(r13)     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0187 }
            r7 = 1098907648(0x41800000, float:16.0)
            r14 = 1091567616(0x41100000, float:9.0)
            if (r3 == 0) goto L_0x00f2
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0100
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0100
            float r14 = r14 * r9
            float r10 = r14 / r7
            r11 = r9
            goto L_0x00ff
        L_0x00f2:
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0100
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0100
            float r14 = r14 * r8
            float r11 = r14 / r7
            r10 = r8
        L_0x00ff:
            r4 = 1
        L_0x0100:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r2.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "适配后宽高：videoHeight="
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            r2.append(r0)     // Catch:{ all -> 0x0187 }
            r2.append(r10)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r0)     // Catch:{ all -> 0x0187 }
            if (r4 != 0) goto L_0x0139
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r0.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " Screen w/h == Video w/h and in other cases，use screen width and height，videoHeight="
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            r0.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "，videoWidth="
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            r0.append(r8)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r0)     // Catch:{ all -> 0x0187 }
            goto L_0x013b
        L_0x0139:
            r8 = r10
            r9 = r11
        L_0x013b:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0187 }
            int r2 = (int) r8     // Catch:{ all -> 0x0187 }
            int r3 = (int) r9     // Catch:{ all -> 0x0187 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0187 }
            r4 = 13
            r0.addRule(r4)     // Catch:{ all -> 0x0187 }
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.mo2137J()     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x0181
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.mo2137J()     // Catch:{ all -> 0x0187 }
            boolean r4 = r4 instanceof android.view.TextureView     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x015f
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.mo2137J()     // Catch:{ all -> 0x0187 }
            android.view.TextureView r4 = (android.view.TextureView) r4     // Catch:{ all -> 0x0187 }
            r4.setLayoutParams(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0170
        L_0x015f:
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.mo2137J()     // Catch:{ all -> 0x0187 }
            boolean r4 = r4 instanceof android.view.SurfaceView     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x0170
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.mo2137J()     // Catch:{ all -> 0x0187 }
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4     // Catch:{ all -> 0x0187 }
            r4.setLayoutParams(r0)     // Catch:{ all -> 0x0187 }
        L_0x0170:
            android.view.ViewGroup r0 = r15.f2443z     // Catch:{ all -> 0x0187 }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0181
            r0.height = r3     // Catch:{ all -> 0x0187 }
            r0.width = r2     // Catch:{ all -> 0x0187 }
            android.view.ViewGroup r2 = r15.f2443z     // Catch:{ all -> 0x0187 }
            r2.setLayoutParams(r0)     // Catch:{ all -> 0x0187 }
        L_0x0181:
            java.lang.String r0 = "changeVideoSize .... complete ... end !!!"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            goto L_0x018d
        L_0x0187:
            r0 = move-exception
            java.lang.String r2 = "changeSize error"
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r2, r0)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p034c.C0651a.m3151S():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m3154T() {
        try {
            if (this.f2381h != null && this.f2381h.get() != null && mo2137J() != null && this.f2376c != null) {
                if (this.f2378e != null) {
                    boolean z = this.f2378e.mo1392am() == 1;
                    int[] b = C1002v.m4737b(C0558m.m2663a());
                    m3164a((float) b[0], (float) b[1], (float) this.f2376c.mo62867j(), (float) this.f2376c.mo62868k(), z);
                    C10638l.m31235b("changeVideoSize", "changeSize=end");
                }
            }
        } catch (Throwable th) {
            C10638l.m31230a("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    private void m3164a(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            C10638l.m31235b("changeVideoSize", "screenWidth=" + f + ",screenHeight=" + f2);
            C10638l.m31235b("changeVideoSize", "videoHeight=" + f4 + ",videoWidth=" + f3);
            if (f3 <= 0.0f || f4 <= 0.0f) {
                f3 = (float) this.f2378e.mo1330J().mo62907c();
                f4 = (float) this.f2378e.mo1330J().mo62904b();
            }
            if (f4 <= 0.0f) {
                return;
            }
            if (f3 > 0.0f) {
                if (z) {
                    if (f3 >= f4) {
                        C10638l.m31235b("changeVideoSize", "Vertical screen mode use video width compute scale value");
                        layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
                        layoutParams.addRule(13);
                    } else {
                        return;
                    }
                } else if (f3 <= f4) {
                    C10638l.m31235b("changeVideoSize", "Landscape screen mode use video height compute scale value");
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
                    layoutParams2.addRule(13);
                    layoutParams = layoutParams2;
                } else {
                    return;
                }
                if (mo2137J() == null) {
                    return;
                }
                if (mo2137J() instanceof TextureView) {
                    ((TextureView) mo2137J()).setLayoutParams(layoutParams);
                } else if (mo2137J() instanceof SurfaceView) {
                    ((SurfaceView) mo2137J()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            C10638l.m31230a("changeVideoSize", "changeSize error", th);
        }
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
                    this.f2377d.mo2320c(this.f2443z);
                }
                mo2162d(this.f2379f);
                if (this.f2377d != null) {
                    this.f2377d.mo2317b(false, false);
                }
            } else {
                mo2161d();
                if (this.f2377d != null) {
                    this.f2377d.mo2317b(false, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2143a(C10190b bVar, int i) {
        if (this.f2376c != null) {
            m3166a(this.f2432O, m3187b(i));
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
                this.f2432O = (long) ((int) n);
            } else {
                this.f2432O = 0;
            }
            if (this.f2377d != null) {
                this.f2377d.mo2264a(this.f2432O);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3165a(long j, long j2) {
        this.f2379f = j;
        this.f2390q = j2;
        this.f2377d.mo2265a(j, j2);
        this.f2377d.mo2263a(C10176a.m29068a(j, j2));
        try {
            if (this.f2420C != null) {
                this.f2420C.mo34a(j, j2);
            }
        } catch (Throwable th) {
            C10638l.m31239c("CSJ_VIDEO_BaseController", "onProgressUpdate error: ", th);
        }
    }

    /* renamed from: b */
    public void mo2158b(C10190b bVar, View view) {
        mo2159b(bVar, view, false, false);
    }

    /* renamed from: b */
    public void mo2159b(C10190b bVar, View view, boolean z, boolean z2) {
        if (mo2088C()) {
            mo2108f(!this.f2389p);
            if (!(this.f2381h.get() instanceof Activity)) {
                C10638l.m31235b("CSJ_VIDEO_BaseController", "context is not activity, not support this function.");
                return;
            }
            if (this.f2389p) {
                mo2142a(z ? 8 : 0);
                if (this.f2377d != null) {
                    this.f2377d.mo2268a(this.f2443z);
                    this.f2377d.mo2278c(false);
                }
            } else {
                mo2142a(1);
                if (this.f2377d != null) {
                    this.f2377d.mo2274b(this.f2443z);
                    this.f2377d.mo2278c(false);
                }
            }
            WeakReference<C10192c.C10194b> weakReference = this.f2424G;
            C10192c.C10194b bVar2 = weakReference != null ? (C10192c.C10194b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.mo258a(this.f2389p);
            }
        }
    }

    /* renamed from: a */
    public void mo2142a(int i) {
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
        mo2153a(true, 3);
    }

    /* renamed from: a */
    public void mo2147a(C10190b bVar, View view, boolean z, boolean z2) {
        if (this.f2386m) {
            mo2155b();
        }
        if (z && !this.f2386m && !mo2138K()) {
            this.f2377d.mo2317b(!mo2139L(), false);
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
                this.f2377d.mo2274b(this.f2443z);
            }
            mo2142a(1);
            return;
        }
        mo2153a(true, 3);
    }

    /* renamed from: e */
    public void mo2166e(C10190b bVar, View view) {
        mo2146a(bVar, view, false);
    }

    /* renamed from: J */
    public C10206b mo2137J() {
        if (this.f2381h == null || this.f2381h.get() == null || this.f2377d == null) {
            return null;
        }
        return this.f2377d.mo2324q();
    }

    /* renamed from: K */
    public boolean mo2138K() {
        return this.f2376c.mo62865h();
    }

    /* renamed from: a */
    public void mo2141a() {
        if (this.f2377d != null) {
            this.f2377d.mo2280e();
            this.f2377d.mo2262a();
        }
        if (this.f2377d != null) {
            this.f2377d.mo2329v();
        }
        mo2162d(-1);
    }

    /* renamed from: L */
    public boolean mo2139L() {
        return this.f2376c != null && this.f2376c.mo62869l();
    }

    /* renamed from: a */
    private void m3166a(long j, boolean z) {
        if (this.f2376c != null) {
            if (z) {
                m3156U();
            }
            this.f2376c.mo62850a(j);
        }
    }

    /* renamed from: b */
    private boolean m3187b(int i) {
        return this.f2377d.mo2276b(i);
    }

    /* renamed from: U */
    private void m3156U() {
        if (this.f2377d != null) {
            this.f2377d.mo2277c(0);
            this.f2377d.mo2272a(false, false);
            this.f2377d.mo2278c(false);
            this.f2377d.mo2280e();
            this.f2377d.mo2282g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a$5 */
    /* compiled from: BaseVideoController */
    static /* synthetic */ class C06655 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2461a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2461a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2461a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2461a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C0742e.C0744a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p034c.C0651a.C06655.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo2151a(C0742e.C0744a aVar, String str) {
        int i = C06655.f2461a[aVar.ordinal()];
        if (i == 1) {
            mo2155b();
        } else if (i == 2) {
            mo2153a(true, 3);
        } else if (i == 3) {
            mo2161d();
            this.f2388o = false;
            this.f2423F = true;
        }
    }

    /* renamed from: b */
    private boolean m3188b(int i, int i2) {
        if (i2 != 4 && i2 != 0) {
            mo2155b();
            this.f2388o = true;
            this.f2423F = false;
            if (!(this.f2377d == null || this.f2378e == null)) {
                return this.f2377d.mo2310a(i, this.f2378e.mo1330J(), true);
            }
        } else if (i2 == 4) {
            this.f2388o = false;
            if (this.f2377d != null) {
                this.f2377d.mo2326s();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3168a(Context context, int i) {
        if (mo2088C() && this.f2434Q != i) {
            if (!this.f2423F) {
                m3188b(2, i);
            }
            this.f2434Q = i;
        }
    }

    /* renamed from: M */
    public void mo2140M() {
        this.f2430M = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m3158V() {
        if (this.f2378e != null) {
            C0558m.m2672g().mo2740a(C0890e.m4260a(this.f2378e.mo1340T(), true, this.f2378e));
        }
    }

    /* renamed from: k */
    public long mo2170k() {
        return mo2109g() + mo2110h();
    }
}
