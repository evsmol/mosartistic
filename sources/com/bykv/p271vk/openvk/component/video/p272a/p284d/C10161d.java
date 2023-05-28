package com.bykv.p271vk.openvk.component.video.p272a.p284d;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bykv.p271vk.openvk.component.video.api.C10181a;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10186a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10203d;
import com.bykv.p271vk.openvk.component.video.p272a.p284d.C10153c;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.d */
/* compiled from: SSMediaPlayerWrapper */
public class C10161d implements C10153c.C10154a, C10153c.C10155b, C10153c.C10156c, C10153c.C10157d, C10153c.C10158e, C10153c.C10159f, C10153c.C10160g, C10181a, C10203d.C10204a {

    /* renamed from: v */
    private static boolean f25096v = false;

    /* renamed from: x */
    private static final SparseIntArray f25097x = new SparseIntArray();

    /* renamed from: A */
    private C10188c f25098A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f25099B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public volatile int f25100C;

    /* renamed from: D */
    private Surface f25101D;

    /* renamed from: E */
    private Runnable f25102E;

    /* renamed from: F */
    private C10175a f25103F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f25104G;

    /* renamed from: H */
    private final Object f25105H;

    /* renamed from: I */
    private StringBuilder f25106I;

    /* renamed from: J */
    private long f25107J;

    /* renamed from: K */
    private long f25108K;

    /* renamed from: L */
    private boolean f25109L;

    /* renamed from: a */
    private SurfaceTexture f25110a;

    /* renamed from: b */
    private SurfaceHolder f25111b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f25112c;

    /* renamed from: d */
    private boolean f25113d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10153c f25114e;

    /* renamed from: f */
    private boolean f25115f;

    /* renamed from: g */
    private boolean f25116g;

    /* renamed from: h */
    private boolean f25117h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f25118i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile int f25119j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f25120k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Handler f25121l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f25122m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f25123n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f25124o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f25125p;

    /* renamed from: q */
    private long f25126q;

    /* renamed from: r */
    private long f25127r;

    /* renamed from: s */
    private boolean f25128s;

    /* renamed from: t */
    private ArrayList<Runnable> f25129t;

    /* renamed from: u */
    private int f25130u;

    /* renamed from: w */
    private String f25131w;

    /* renamed from: y */
    private boolean f25132y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final List<WeakReference<C10181a.C10182a>> f25133z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28999a(long j, long j2) {
        for (WeakReference next : this.f25133z) {
            if (!(next == null || next.get() == null)) {
                ((C10181a.C10182a) next.get()).mo2178a((C10181a) this, j, j2);
            }
        }
    }

    public C10161d() {
        boolean z = false;
        this.f25112c = 0;
        this.f25113d = false;
        this.f25114e = null;
        this.f25115f = false;
        this.f25116g = false;
        this.f25119j = 201;
        this.f25120k = -1;
        this.f25122m = false;
        this.f25123n = 0;
        this.f25124o = Long.MIN_VALUE;
        this.f25125p = 0;
        this.f25126q = 0;
        this.f25127r = 0;
        this.f25130u = 0;
        this.f25131w = BuildConfig.ADAPTER_VERSION;
        this.f25133z = Collections.synchronizedList(new ArrayList());
        this.f25098A = null;
        this.f25099B = false;
        this.f25100C = 200;
        this.f25101D = null;
        this.f25102E = new Runnable() {
            public void run() {
                long s = C10161d.this.mo62876s();
                if (s > 0 && Build.VERSION.SDK_INT >= 23 && C10161d.this.mo62869l() && C10161d.this.f25124o != Long.MIN_VALUE) {
                    if (C10161d.this.f25124o == s) {
                        if (!C10161d.this.f25122m && C10161d.this.f25125p >= 400) {
                            C10161d.this.m29007b(701, 800);
                            boolean unused = C10161d.this.f25122m = true;
                        }
                        C10161d dVar = C10161d.this;
                        long unused2 = dVar.f25125p = dVar.f25125p + ((long) C10161d.this.f25100C);
                    } else {
                        if (C10161d.this.f25122m) {
                            C10161d dVar2 = C10161d.this;
                            long unused3 = dVar2.f25123n = dVar2.f25123n + C10161d.this.f25125p;
                            C10161d.this.m29007b(702, 800);
                            C10202c.m29291b("CSJ_VIDEO_MEDIA", "handleMsg:  bufferingDuration =", Long.valueOf(C10161d.this.f25123n), "  bufferCount =", Integer.valueOf(C10161d.this.f25112c));
                        }
                        long unused4 = C10161d.this.f25125p = 0;
                        boolean unused5 = C10161d.this.f25122m = false;
                    }
                }
                if (C10161d.this.mo62874q() > 0) {
                    if (C10161d.this.f25124o != s) {
                        if (C10184b.m29131f()) {
                            C10202c.m29291b("CSJ_VIDEO_MEDIA", "run: lastCur = ", Long.valueOf(C10161d.this.f25124o), "  curPosition = ", Long.valueOf(s));
                        }
                        C10161d dVar3 = C10161d.this;
                        dVar3.m28999a(s, dVar3.mo62874q());
                    }
                    long unused6 = C10161d.this.f25124o = s;
                }
                if (!C10161d.this.mo62865h()) {
                    C10161d.this.f25121l.postDelayed(this, (long) C10161d.this.f25100C);
                    return;
                }
                C10161d dVar4 = C10161d.this;
                dVar4.m28999a(dVar4.mo62874q(), C10161d.this.mo62874q());
            }
        };
        this.f25103F = new C10175a();
        this.f25105H = new Object();
        this.f25106I = null;
        this.f25107J = 0;
        this.f25108K = 0;
        this.f25109L = false;
        this.f25130u = 0;
        HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_SSMediaPlayerWrapper", -1);
        handlerThread.start();
        this.f25121l = new C10203d(handlerThread.getLooper(), this);
        this.f25109L = Build.VERSION.SDK_INT >= 17 ? true : z;
        this.f25121l.post(new Runnable() {
            public void run() {
                C10161d.this.m29026u();
            }
        });
    }

    /* renamed from: t */
    private void m29025t() {
        this.f25123n = 0;
        this.f25112c = 0;
        this.f25125p = 0;
        this.f25122m = false;
        this.f25124o = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo62859b(final boolean z) {
        this.f25132y = z;
        C10153c cVar = this.f25114e;
        if (cVar != null) {
            cVar.mo62809a(z);
        } else {
            this.f25121l.post(new Runnable() {
                public void run() {
                    if (C10161d.this.f25114e != null) {
                        C10161d.this.f25114e.mo62809a(z);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m29026u() {
        if (this.f25114e == null) {
            C10151b bVar = new C10151b();
            this.f25114e = bVar;
            this.f25131w = BuildConfig.ADAPTER_VERSION;
            bVar.mo62806a((C10153c.C10158e) this);
            this.f25114e.mo62803a((C10153c.C10155b) this);
            this.f25114e.mo62804a((C10153c.C10156c) this);
            this.f25114e.mo62802a((C10153c.C10154a) this);
            this.f25114e.mo62807a((C10153c.C10159f) this);
            this.f25114e.mo62805a((C10153c.C10157d) this);
            this.f25114e.mo62808a((C10153c.C10160g) this);
            try {
                this.f25114e.mo62822c(this.f25115f);
            } catch (Throwable th) {
                C10202c.m29287a("CSJ_VIDEO_MEDIA", "setLooping error: ", th);
            }
            this.f25116g = false;
        }
    }

    /* renamed from: a */
    public void mo62857a(boolean z, long j, boolean z2) {
        C10202c.m29286a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start firstSeekToPosition=" + j + ",firstPlay :" + z + ",isPauseOtherMusicVolume=" + z2);
        if (this.f25114e != null) {
            this.f25099B = z2;
            this.f25104G = false;
            mo62856a(z2);
            if (z) {
                C10202c.m29286a("CSJ_VIDEO_MEDIA", "[video] first start , SSMediaPlayer  start method !");
                this.f25120k = j;
                m29027v();
            } else {
                this.f25103F.mo62890a(j);
                if (this.f25132y) {
                    m29008b((Runnable) this.f25103F);
                } else {
                    m29002a((Runnable) this.f25103F);
                }
            }
            this.f25121l.postDelayed(this.f25102E, (long) this.f25100C);
        }
    }

    /* renamed from: a */
    public void mo62849a() {
        Handler handler = this.f25121l;
        if (handler != null) {
            handler.post(new Runnable() {
                public void run() {
                    if (C10161d.this.mo62870m() && C10161d.this.f25114e != null) {
                        try {
                            C10161d.this.f25114e.mo62824e();
                            C10202c.m29289b("CSJ_VIDEO_MEDIA", "resume play exec start ");
                            for (WeakReference weakReference : C10161d.this.f25133z) {
                                if (!(weakReference == null || weakReference.get() == null)) {
                                    ((C10181a.C10182a) weakReference.get()).mo2185e(C10161d.this);
                                }
                            }
                            int unused = C10161d.this.f25119j = LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE;
                        } catch (Throwable th) {
                            C10202c.m29291b("CSJ_VIDEO_MEDIA", "play: catch exception ", th.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.d.d$a */
    /* compiled from: SSMediaPlayerWrapper */
    class C10175a implements Runnable {

        /* renamed from: b */
        private long f25154b;

        C10175a() {
        }

        /* renamed from: a */
        public void mo62890a(long j) {
            this.f25154b = j;
        }

        public void run() {
            if (C10161d.this.f25114e != null) {
                try {
                    long unused = C10161d.this.f25120k = Math.max(this.f25154b, C10161d.this.f25114e.mo62829i());
                } catch (Throwable th) {
                    C10202c.m29286a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start  error: getCurrentPosition :" + th.toString());
                }
            }
            C10161d.this.f25121l.sendEmptyMessageDelayed(100, 0);
            C10202c.m29286a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
        }
    }

    /* renamed from: b */
    public void mo62858b() {
        C10202c.m29289b("CSJ_VIDEO_MEDIA", "pause: ");
        this.f25121l.removeMessages(100);
        this.f25104G = true;
        this.f25121l.sendEmptyMessage(101);
    }

    /* renamed from: d */
    public void mo62861d() {
        this.f25119j = LossReason.LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE;
        m28995B();
        if (this.f25121l != null) {
            try {
                m29009b("release");
                this.f25121l.removeCallbacksAndMessages((Object) null);
                if (this.f25114e != null) {
                    this.f25118i = true;
                    this.f25121l.sendEmptyMessage(103);
                }
            } catch (Throwable th) {
                m29029x();
                throw th;
            }
            m29029x();
        }
    }

    /* renamed from: v */
    private void m29027v() {
        C10202c.m29286a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke !");
        m29008b((Runnable) new Runnable() {
            public void run() {
                if (C10161d.this.f25121l != null) {
                    C10161d.this.f25121l.sendEmptyMessage(104);
                    C10202c.m29286a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
                }
            }
        });
    }

    /* renamed from: c */
    public void mo62860c() {
        m29008b((Runnable) new Runnable() {
            public void run() {
                if (C10161d.this.f25121l != null) {
                    C10161d.this.f25121l.sendEmptyMessage(105);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo62850a(final long j) {
        if (this.f25119j == 207 || this.f25119j == 206 || this.f25119j == 209) {
            m29008b((Runnable) new Runnable() {
                public void run() {
                    if (C10161d.this.f25121l != null) {
                        C10161d.this.f25121l.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public boolean mo62862e() {
        return this.f25113d;
    }

    /* renamed from: a */
    public void mo62851a(final SurfaceTexture surfaceTexture) {
        this.f25110a = surfaceTexture;
        mo62859b(true);
        m29008b((Runnable) new Runnable() {
            public void run() {
                C10161d.this.m29026u();
                if (C10161d.this.f25121l != null) {
                    C10161d.this.f25121l.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo62853a(final SurfaceHolder surfaceHolder) {
        this.f25111b = surfaceHolder;
        mo62859b(true);
        m29008b((Runnable) new Runnable() {
            public void run() {
                C10161d.this.m29026u();
                if (C10161d.this.f25121l != null) {
                    C10161d.this.f25121l.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo62855a(final C10188c cVar) {
        this.f25098A = cVar;
        m29008b((Runnable) new Runnable() {
            public void run() {
                C10161d.this.m29026u();
                if (C10161d.this.f25121l != null) {
                    C10161d.this.f25121l.obtainMessage(107, cVar).sendToTarget();
                }
            }
        });
    }

    /* renamed from: l */
    public boolean mo62869l() {
        return (this.f25119j == 206 || this.f25121l.hasMessages(100)) && !this.f25104G;
    }

    /* renamed from: i */
    public boolean mo62866i() {
        return mo62875r() || mo62869l() || mo62870m();
    }

    /* renamed from: m */
    public boolean mo62870m() {
        return (this.f25119j == 207 || this.f25104G) && !this.f25121l.hasMessages(100);
    }

    /* renamed from: n */
    public boolean mo62871n() {
        return this.f25119j == 203;
    }

    /* renamed from: r */
    public boolean mo62875r() {
        return this.f25119j == 205;
    }

    /* renamed from: h */
    public boolean mo62865h() {
        return this.f25119j == 209;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62852a(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r0.what
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[video]  execute , mCurrentState = "
            r3.append(r4)
            int r4 = r1.f25119j
            r3.append(r4)
            java.lang.String r4 = " handlerMsg="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CSJ_VIDEO_MEDIA"
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r3)
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f25114e
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x02e7
            int r3 = r0.what
            java.lang.String r7 = "[video] OP_RELEASE execute , releaseMediaplayer !"
            r8 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 205(0xcd, float:2.87E-43)
            r14 = 208(0xd0, float:2.91E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r9 = 206(0xce, float:2.89E-43)
            r10 = 207(0xcf, float:2.9E-43)
            switch(r3) {
                case 100: goto L_0x02a6;
                case 101: goto L_0x024c;
                case 102: goto L_0x0238;
                case 103: goto L_0x0201;
                case 104: goto L_0x01e1;
                case 105: goto L_0x01bc;
                case 106: goto L_0x0199;
                case 107: goto L_0x008d;
                case 108: goto L_0x0043;
                case 109: goto L_0x0043;
                case 110: goto L_0x006d;
                case 111: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x02e7
        L_0x0045:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0065 }
            r7 = 14
            if (r3 < r7) goto L_0x005b
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0065 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ all -> 0x0065 }
            android.view.Surface r3 = new android.view.Surface     // Catch:{ all -> 0x0065 }
            r3.<init>(r0)     // Catch:{ all -> 0x0065 }
            r1.f25101D = r3     // Catch:{ all -> 0x0065 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x0065 }
            r0.mo62816a((android.view.Surface) r3)     // Catch:{ all -> 0x0065 }
        L_0x005b:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x0065 }
            r0.mo62821b(r6)     // Catch:{ all -> 0x0065 }
            r16.m28994A()     // Catch:{ all -> 0x0065 }
            goto L_0x02e7
        L_0x0065:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_SURFACE error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x006d:
            java.lang.String r3 = "resumeVideo:  OP_SET_DISPLAY "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29289b((java.lang.String) r4, (java.lang.String) r3)
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0085 }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f25114e     // Catch:{ all -> 0x0085 }
            r3.mo62817a((android.view.SurfaceHolder) r0)     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x0085 }
            r0.mo62821b(r6)     // Catch:{ all -> 0x0085 }
            r16.m28994A()     // Catch:{ all -> 0x0085 }
            goto L_0x02e7
        L_0x0085:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DISPLAY error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x008d:
            r16.m29025t()
            int r3 = r1.f25119j
            if (r3 == r11) goto L_0x0098
            int r3 = r1.f25119j
            if (r3 != r8) goto L_0x01ea
        L_0x0098:
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.c.c r0 = (com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r0     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r0.mo62936a()     // Catch:{ all -> 0x0191 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = com.bykv.p271vk.openvk.component.video.api.C10184b.m29127b()     // Catch:{ all -> 0x0191 }
            r0.mo62939a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
        L_0x00ad:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo62936a()     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r0.mo62962k()     // Catch:{ all -> 0x0191 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0191 }
            boolean r7 = r3.exists()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x00f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r0.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： try paly local:"
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            boolean r0 = com.bykv.p271vk.openvk.component.video.api.C10184b.m29129d()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r1.m29003a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00e7:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.mo62820a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： paly net:"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo62961j()     // Catch:{ all -> 0x0191 }
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            int r3 = r0.f25186b     // Catch:{ all -> 0x0191 }
            r7 = 23
            if (r3 != r6) goto L_0x0136
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 >= r7) goto L_0x0136
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f25114e     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo62961j()     // Catch:{ all -> 0x0191 }
            r3.mo62820a((java.lang.String) r7)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 直接设置 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.mo62961j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0136:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 < r7) goto L_0x0158
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f25114e     // Catch:{ all -> 0x0191 }
            r3.mo62818a((com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r0)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 使用MediaDataSource接口 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.mo62961j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0158:
            com.bykv.vk.openvk.component.video.a.b.f.a r3 = com.bykv.p271vk.openvk.component.video.p272a.p276b.p282f.C10126a.m28843a()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.mo62769b(r0)     // Catch:{ all -> 0x0191 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 本地代理模式 local url = "
            r3[r5] = r7     // Catch:{ all -> 0x0191 }
            r3[r6] = r0     // Catch:{ all -> 0x0191 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29288a((java.lang.String) r4, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0188
            boolean r3 = com.bykv.p271vk.openvk.component.video.api.C10184b.m29129d()     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            java.lang.String r3 = "file"
            boolean r3 = r0.startsWith(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0191 }
            r1.m29003a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0188:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f25114e     // Catch:{ all -> 0x0191 }
            r3.mo62820a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
        L_0x018d:
            r1.f25119j = r12     // Catch:{ all -> 0x0191 }
            goto L_0x02e7
        L_0x0191:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DATASOURCE error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x0199:
            int r3 = r1.f25119j
            if (r3 == r9) goto L_0x01a5
            int r3 = r1.f25119j
            if (r3 == r10) goto L_0x01a5
            int r3 = r1.f25119j
            if (r3 != r15) goto L_0x01ea
        L_0x01a5:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f25114e     // Catch:{ all -> 0x01b4 }
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x01b4 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01b4 }
            long r7 = r0.longValue()     // Catch:{ all -> 0x01b4 }
            r3.mo62815a((long) r7)     // Catch:{ all -> 0x01b4 }
            goto L_0x02e7
        L_0x01b4:
            r0 = move-exception
            java.lang.String r3 = "OP_SEEKTO error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x01bc:
            int r0 = r1.f25119j
            if (r0 == r13) goto L_0x01d0
            int r0 = r1.f25119j
            if (r0 == r9) goto L_0x01d0
            int r0 = r1.f25119j
            if (r0 == r14) goto L_0x01d0
            int r0 = r1.f25119j
            if (r0 == r10) goto L_0x01d0
            int r0 = r1.f25119j
            if (r0 != r15) goto L_0x01ea
        L_0x01d0:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x01d9 }
            r0.mo62825f()     // Catch:{ all -> 0x01d9 }
            r1.f25119j = r14     // Catch:{ all -> 0x01d9 }
            goto L_0x02e7
        L_0x01d9:
            r0 = move-exception
            java.lang.String r3 = "OP_STOP error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x01e1:
            int r0 = r1.f25119j
            if (r0 == r12) goto L_0x01ed
            int r0 = r1.f25119j
            if (r0 != r14) goto L_0x01ea
            goto L_0x01ed
        L_0x01ea:
            r5 = 1
            goto L_0x02e7
        L_0x01ed:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x01f9 }
            r0.mo62828h()     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = "[video] OP_PREPARE_ASYNC execute , mMediaPlayer real prepareAsync !"
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x02e7
        L_0x01f9:
            r0 = move-exception
            java.lang.String r3 = "OP_PREPARE_ASYNC error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29294c(r4, r3, r0)
            goto L_0x02e7
        L_0x0201:
            r16.m29028w()     // Catch:{ all -> 0x0208 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0208 }
            goto L_0x020e
        L_0x0208:
            r0 = move-exception
            java.lang.String r3 = "OP_RELEASE error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29294c(r4, r3, r0)
        L_0x020e:
            r1.f25118i = r5
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.f25133z
            java.util.Iterator r0 = r0.iterator()
        L_0x0216:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0234
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x0216
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x0216
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p271vk.openvk.component.video.api.C10181a.C10182a) r3
            r3.mo2183c(r1)
            goto L_0x0216
        L_0x0234:
            r1.f25119j = r8
            goto L_0x02e7
        L_0x0238:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x0244 }
            r0.mo62832l()     // Catch:{ all -> 0x0244 }
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0244 }
            r1.f25119j = r11     // Catch:{ all -> 0x0244 }
            goto L_0x02e7
        L_0x0244:
            r0 = move-exception
            java.lang.String r3 = "OP_RESET error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x024c:
            boolean r0 = r1.f25122m
            if (r0 == 0) goto L_0x0257
            long r7 = r1.f25123n
            long r11 = r1.f25125p
            long r7 = r7 + r11
            r1.f25123n = r7
        L_0x0257:
            r1.f25122m = r5
            r7 = 0
            r1.f25125p = r7
            r7 = -9223372036854775808
            r1.f25124o = r7
            int r0 = r1.f25119j
            if (r0 == r9) goto L_0x026d
            int r0 = r1.f25119j
            if (r0 == r10) goto L_0x026d
            int r0 = r1.f25119j
            if (r0 != r15) goto L_0x01ea
        L_0x026d:
            java.lang.String r0 = "[video] OP_PAUSE execute , mMediaPlayer  OP_PAUSE !"
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x029f }
            r0.mo62827g()     // Catch:{ all -> 0x029f }
            r1.f25119j = r10     // Catch:{ all -> 0x029f }
            r1.f25104G = r5     // Catch:{ all -> 0x029f }
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.f25133z     // Catch:{ all -> 0x029f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x029f }
        L_0x0281:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x02e7
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x029f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x0281
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x029f }
            if (r7 == 0) goto L_0x0281
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p271vk.openvk.component.video.api.C10181a.C10182a) r3     // Catch:{ all -> 0x029f }
            r3.mo2184d(r1)     // Catch:{ all -> 0x029f }
            goto L_0x0281
        L_0x029f:
            r0 = move-exception
            java.lang.String r3 = "OP_PAUSE error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
            goto L_0x02e7
        L_0x02a6:
            int r0 = r1.f25119j
            if (r0 == r13) goto L_0x02b2
            int r0 = r1.f25119j
            if (r0 == r10) goto L_0x02b2
            int r0 = r1.f25119j
            if (r0 != r15) goto L_0x01ea
        L_0x02b2:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x02e1 }
            r0.mo62824e()     // Catch:{ all -> 0x02e1 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02e1 }
            r1.f25127r = r7     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "[video] OP_START execute , mMediaPlayer real start !"
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29286a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x02e1 }
            r1.f25119j = r9     // Catch:{ all -> 0x02e1 }
            long r7 = r1.f25120k     // Catch:{ all -> 0x02e1 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d7
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f25114e     // Catch:{ all -> 0x02e1 }
            long r7 = r1.f25120k     // Catch:{ all -> 0x02e1 }
            r0.mo62815a((long) r7)     // Catch:{ all -> 0x02e1 }
            r7 = -1
            r1.f25120k = r7     // Catch:{ all -> 0x02e1 }
        L_0x02d7:
            com.bykv.vk.openvk.component.video.api.c.c r0 = r1.f25098A     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x02e7
            boolean r0 = r1.f25099B     // Catch:{ all -> 0x02e1 }
            r1.mo62856a((boolean) r0)     // Catch:{ all -> 0x02e1 }
            goto L_0x02e7
        L_0x02e1:
            r0 = move-exception
            java.lang.String r3 = "OP_START error: "
            com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29287a(r4, r3, r0)
        L_0x02e7:
            if (r5 == 0) goto L_0x031e
            r0 = 200(0xc8, float:2.8E-43)
            r1.f25119j = r0
            boolean r0 = r1.f25116g
            if (r0 != 0) goto L_0x031e
            com.bykv.vk.openvk.component.video.api.c.a r0 = new com.bykv.vk.openvk.component.video.api.c.a
            r3 = 308(0x134, float:4.32E-43)
            r0.<init>(r3, r2)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r2 = r1.f25133z
            java.util.Iterator r2 = r2.iterator()
        L_0x02fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031c
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x02fe
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x02fe
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p271vk.openvk.component.video.api.C10181a.C10182a) r3
            r3.mo2179a((com.bykv.p271vk.openvk.component.video.api.C10181a) r1, (com.bykv.p271vk.openvk.component.video.api.p288c.C10186a) r0)
            goto L_0x02fe
        L_0x031c:
            r1.f25116g = r6
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p284d.C10161d.mo62852a(android.os.Message):void");
    }

    /* renamed from: a */
    private void m29003a(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f25114e.mo62819a(fileInputStream.getFD());
        fileInputStream.close();
    }

    /* renamed from: w */
    private void m29028w() {
        C10202c.m29289b("CSJ_VIDEO_MEDIA", "releaseMediaPlayer: ");
        C10153c cVar = this.f25114e;
        if (cVar != null) {
            try {
                cVar.mo62832l();
            } catch (Throwable th) {
                C10202c.m29287a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error1: ", th);
            }
            this.f25114e.mo62803a((C10153c.C10155b) null);
            this.f25114e.mo62808a((C10153c.C10160g) null);
            this.f25114e.mo62802a((C10153c.C10154a) null);
            this.f25114e.mo62805a((C10153c.C10157d) null);
            this.f25114e.mo62804a((C10153c.C10156c) null);
            this.f25114e.mo62806a((C10153c.C10158e) null);
            this.f25114e.mo62807a((C10153c.C10159f) null);
            try {
                this.f25114e.mo62831k();
            } catch (Throwable th2) {
                C10202c.m29287a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error2: ", th2);
            }
        }
    }

    /* renamed from: x */
    private void m29029x() {
        Handler handler = this.f25121l;
        if (handler != null && handler.getLooper() != null) {
            this.f25121l.post(new Runnable() {
                public void run() {
                    if (C10161d.this.f25121l.getLooper() != null) {
                        try {
                            C10202c.m29286a("CSJ_VIDEO_MEDIA", "onDestory............");
                            C10161d.this.f25121l.getLooper().quit();
                        } catch (Throwable th) {
                            C10202c.m29287a("CSJ_VIDEO_MEDIA", "onDestroy error: ", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo62842a(C10153c cVar, int i) {
        if (this.f25114e == cVar) {
            for (WeakReference next : this.f25133z) {
                if (!(next == null || next.get() == null)) {
                    ((C10181a.C10182a) next.get()).mo2182b(this, i);
                }
            }
        }
    }

    /* renamed from: y */
    private void m29030y() {
        Integer valueOf = Integer.valueOf(f25097x.get(this.f25130u));
        if (valueOf == null) {
            f25097x.put(this.f25130u, 1);
        } else {
            f25097x.put(this.f25130u, Integer.valueOf(valueOf.intValue() + 1).intValue());
        }
    }

    /* renamed from: a */
    public void mo62843a(C10153c cVar) {
        this.f25119j = !this.f25115f ? LossReason.f4818xd24c0733 : LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE;
        f25097x.delete(this.f25130u);
        for (WeakReference next : this.f25133z) {
            if (!(next == null || next.get() == null)) {
                ((C10181a.C10182a) next.get()).mo2173a(this);
            }
        }
        m29009b("completion");
    }

    /* renamed from: a */
    public boolean mo62844a(C10153c cVar, int i, int i2) {
        C10202c.m29293c("CSJ_VIDEO_MEDIA", "what=" + i + "extra=" + i2);
        m29030y();
        this.f25119j = 200;
        Handler handler = this.f25121l;
        if (handler != null) {
            handler.removeCallbacks(this.f25102E);
        }
        if (m29004a(i, i2)) {
            m29029x();
        }
        if (!this.f25116g) {
            C10186a aVar = new C10186a(308, i2);
            for (WeakReference next : this.f25133z) {
                if (!(next == null || next.get() == null)) {
                    ((C10181a.C10182a) next.get()).mo2179a((C10181a) this, aVar);
                }
            }
            this.f25116g = true;
            return true;
        }
        C10186a aVar2 = new C10186a(i, i2);
        for (WeakReference next2 : this.f25133z) {
            if (!(next2 == null || next2.get() == null)) {
                ((C10181a.C10182a) next2.get()).mo2179a((C10181a) this, aVar2);
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m29004a(int i, int i2) {
        C10202c.m29286a("CSJ_VIDEO_MEDIA", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo62845b(C10153c cVar, int i, int i2) {
        C10202c.m29293c("CSJ_VIDEO_MEDIA", "what,extra:" + i + "," + i2);
        if (this.f25114e != cVar) {
            return false;
        }
        if (i2 == -1004) {
            C10186a aVar = new C10186a(i, i2);
            for (WeakReference next : this.f25133z) {
                if (!(next == null || next.get() == null)) {
                    ((C10181a.C10182a) next.get()).mo2179a((C10181a) this, aVar);
                }
            }
        }
        m29007b(i, i2);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29007b(int i, int i2) {
        String str;
        int i3 = i;
        if (i3 == 701) {
            this.f25107J = SystemClock.elapsedRealtime();
            this.f25112c++;
            for (WeakReference next : this.f25133z) {
                if (!(next == null || next.get() == null)) {
                    ((C10181a.C10182a) next.get()).mo2176a(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            C10202c.m29291b("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f25112c));
        } else if (i3 == 702) {
            if (this.f25107J > 0) {
                str = "CSJ_VIDEO_MEDIA";
                this.f25108K += SystemClock.elapsedRealtime() - this.f25107J;
                this.f25107J = 0;
            } else {
                str = "CSJ_VIDEO_MEDIA";
            }
            for (WeakReference next2 : this.f25133z) {
                if (!(next2 == null || next2.get() == null)) {
                    ((C10181a.C10182a) next2.get()).mo2174a((C10181a) this, Integer.MAX_VALUE);
                }
            }
            C10202c.m29291b(str, "bufferCount = ", Integer.valueOf(this.f25112c), " mBufferTotalTime = ", Long.valueOf(this.f25108K));
        } else {
            String str2 = "CSJ_VIDEO_MEDIA";
            if (this.f25109L && i3 == 3) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25127r;
                this.f25113d = true;
                for (WeakReference next3 : this.f25133z) {
                    if (!(next3 == null || next3.get() == null)) {
                        ((C10181a.C10182a) next3.get()).mo2177a((C10181a) this, elapsedRealtime);
                    }
                }
                mo62856a(this.f25099B);
                C10202c.m29289b(str2, "onRenderStart");
            }
        }
    }

    /* renamed from: b */
    public void mo62846b(C10153c cVar) {
        this.f25119j = LossReason.LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE;
        if (this.f25104G) {
            this.f25121l.post(new Runnable() {
                public void run() {
                    try {
                        C10161d.this.f25114e.mo62827g();
                        int unused = C10161d.this.f25119j = LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE;
                        boolean unused2 = C10161d.this.f25104G = false;
                    } catch (Throwable th) {
                        C10202c.m29287a("CSJ_VIDEO_MEDIA", "onPrepared error: ", th);
                    }
                }
            });
        } else {
            Handler handler = this.f25121l;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        f25097x.delete(this.f25130u);
        if (!this.f25109L && !this.f25128s) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25127r;
            for (WeakReference next : this.f25133z) {
                if (!(next == null || next.get() == null)) {
                    ((C10181a.C10182a) next.get()).mo2177a((C10181a) this, elapsedRealtime);
                }
            }
            this.f25113d = true;
            this.f25128s = true;
        }
        for (WeakReference next2 : this.f25133z) {
            if (!(next2 == null || next2.get() == null)) {
                ((C10181a.C10182a) next2.get()).mo2181b(this);
            }
        }
    }

    /* renamed from: c */
    public void mo62847c(C10153c cVar) {
        for (WeakReference next : this.f25133z) {
            if (!(next == null || next.get() == null)) {
                ((C10181a.C10182a) next.get()).mo2180a((C10181a) this, true);
            }
        }
    }

    /* renamed from: a */
    private void m29002a(Runnable runnable) {
        if (this.f25129t == null) {
            this.f25129t = new ArrayList<>();
        }
        this.f25129t.add(runnable);
    }

    /* renamed from: z */
    private void m29031z() {
        if (!this.f25117h) {
            this.f25117h = true;
            Iterator it = new ArrayList(this.f25129t).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f25129t.clear();
            this.f25117h = false;
        }
    }

    /* renamed from: A */
    private void m28994A() {
        ArrayList<Runnable> arrayList = this.f25129t;
        if (arrayList != null && !arrayList.isEmpty()) {
            m29031z();
        }
    }

    /* renamed from: B */
    private void m28995B() {
        ArrayList<Runnable> arrayList = this.f25129t;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f25129t.clear();
        }
    }

    /* renamed from: b */
    private void m29008b(Runnable runnable) {
        if (runnable != null) {
            if (!this.f25118i) {
                runnable.run();
            } else {
                m29002a(runnable);
            }
        }
    }

    /* renamed from: a */
    public void mo62856a(final boolean z) {
        C10184b.m29128c().post(new Runnable() {
            public void run() {
                C10202c.m29291b("CSJ_VIDEO_MEDIA", "run:before setQuietPlay ", Boolean.valueOf(z));
                if (!C10161d.this.f25118i && C10161d.this.f25119j != 203 && C10161d.this.f25114e != null) {
                    try {
                        C10202c.m29291b("CSJ_VIDEO_MEDIA", "run:exec  setQuietPlay ", Boolean.valueOf(z));
                        boolean unused = C10161d.this.f25099B = z;
                        C10161d.this.f25114e.mo62823d(z);
                    } catch (Throwable th) {
                        C10202c.m29287a("CSJ_VIDEO_MEDIA", "setQuietPlay error: ", th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m29009b(String str) {
        Handler handler = this.f25121l;
        if (handler != null) {
            handler.removeMessages(201);
        }
        synchronized (this.f25105H) {
            if (this.f25106I != null) {
                this.f25106I = null;
            }
        }
    }

    /* renamed from: o */
    public long mo62872o() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.f25108K;
        }
        if (this.f25122m) {
            long j = this.f25125p;
            if (j > 0) {
                return this.f25123n + j;
            }
        }
        return this.f25123n;
    }

    /* renamed from: j */
    public int mo62867j() {
        C10153c cVar = this.f25114e;
        if (cVar != null) {
            return cVar.mo62833m();
        }
        return 0;
    }

    /* renamed from: k */
    public int mo62868k() {
        C10153c cVar = this.f25114e;
        if (cVar != null) {
            return cVar.mo62834n();
        }
        return 0;
    }

    /* renamed from: p */
    public int mo62873p() {
        return this.f25112c;
    }

    /* renamed from: a */
    public void mo62848a(C10153c cVar, int i, int i2, int i3, int i4) {
        for (WeakReference next : this.f25133z) {
            if (!(next == null || next.get() == null)) {
                ((C10181a.C10182a) next.get()).mo2175a((C10181a) this, i, i2);
            }
        }
    }

    /* renamed from: q */
    public long mo62874q() {
        long j = this.f25126q;
        if (j != 0) {
            return j;
        }
        if (this.f25119j == 206 || this.f25119j == 207) {
            try {
                this.f25126q = this.f25114e.mo62830j();
            } catch (Throwable unused) {
            }
        }
        return this.f25126q;
    }

    /* renamed from: s */
    public long mo62876s() {
        if (this.f25119j != 206 && this.f25119j != 207) {
            return 0;
        }
        try {
            return this.f25114e.mo62829i();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo62854a(C10181a.C10182a aVar) {
        if (aVar != null) {
            for (WeakReference next : this.f25133z) {
                if (next != null && next.get() == aVar) {
                    return;
                }
            }
            this.f25133z.add(new WeakReference(aVar));
        }
    }

    /* renamed from: f */
    public SurfaceHolder mo62863f() {
        return this.f25111b;
    }

    /* renamed from: g */
    public SurfaceTexture mo62864g() {
        return this.f25110a;
    }
}
