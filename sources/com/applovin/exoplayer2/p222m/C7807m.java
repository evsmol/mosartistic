package com.applovin.exoplayer2.p222m;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import p150io.bidmachine.BidMachineFetcher;

/* renamed from: com.applovin.exoplayer2.m.m */
public final class C7807m {

    /* renamed from: a */
    private final C7795e f18514a = new C7795e();

    /* renamed from: b */
    private final C7809b f18515b;

    /* renamed from: c */
    private final C7813e f18516c;

    /* renamed from: d */
    private boolean f18517d;

    /* renamed from: e */
    private Surface f18518e;

    /* renamed from: f */
    private float f18519f;

    /* renamed from: g */
    private float f18520g;

    /* renamed from: h */
    private float f18521h;

    /* renamed from: i */
    private float f18522i;

    /* renamed from: j */
    private int f18523j;

    /* renamed from: k */
    private long f18524k;

    /* renamed from: l */
    private long f18525l;

    /* renamed from: m */
    private long f18526m;

    /* renamed from: n */
    private long f18527n;

    /* renamed from: o */
    private long f18528o;

    /* renamed from: p */
    private long f18529p;

    /* renamed from: q */
    private long f18530q;

    /* renamed from: com.applovin.exoplayer2.m.m$a */
    private static final class C7808a {
        /* renamed from: a */
        public static void m22666a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                C7755q.m22362c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.m.m$b */
    private interface C7809b {

        /* renamed from: com.applovin.exoplayer2.m.m$b$a */
        public interface C7810a {
            void onDefaultDisplayChanged(Display display);
        }

        /* renamed from: a */
        void mo55202a();

        /* renamed from: a */
        void mo55203a(C7810a aVar);
    }

    /* renamed from: com.applovin.exoplayer2.m.m$c */
    private static final class C7811c implements C7809b {

        /* renamed from: a */
        private final WindowManager f18531a;

        private C7811c(WindowManager windowManager) {
            this.f18531a = windowManager;
        }

        /* renamed from: a */
        public static C7809b m22669a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C7811c(windowManager);
            }
            return null;
        }

        /* renamed from: a */
        public void mo55202a() {
        }

        /* renamed from: a */
        public void mo55203a(C7809b.C7810a aVar) {
            aVar.onDefaultDisplayChanged(this.f18531a.getDefaultDisplay());
        }
    }

    /* renamed from: com.applovin.exoplayer2.m.m$d */
    private static final class C7812d implements DisplayManager.DisplayListener, C7809b {

        /* renamed from: a */
        private final DisplayManager f18532a;

        /* renamed from: b */
        private C7809b.C7810a f18533b;

        private C7812d(DisplayManager displayManager) {
            this.f18532a = displayManager;
        }

        /* renamed from: a */
        public static C7809b m22672a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(BidMachineFetcher.AD_TYPE_DISPLAY);
            if (displayManager != null) {
                return new C7812d(displayManager);
            }
            return null;
        }

        /* renamed from: b */
        private Display m22673b() {
            return this.f18532a.getDisplay(0);
        }

        /* renamed from: a */
        public void mo55202a() {
            this.f18532a.unregisterDisplayListener(this);
            this.f18533b = null;
        }

        /* renamed from: a */
        public void mo55203a(C7809b.C7810a aVar) {
            this.f18533b = aVar;
            this.f18532a.registerDisplayListener(this, C7728ai.m22194a());
            aVar.onDefaultDisplayChanged(m22673b());
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            C7809b.C7810a aVar = this.f18533b;
            if (aVar != null && i == 0) {
                aVar.onDefaultDisplayChanged(m22673b());
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: com.applovin.exoplayer2.m.m$e */
    private static final class C7813e implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: b */
        private static final C7813e f18534b = new C7813e();

        /* renamed from: a */
        public volatile long f18535a = -9223372036854775807L;

        /* renamed from: c */
        private final Handler f18536c;

        /* renamed from: d */
        private final HandlerThread f18537d;

        /* renamed from: e */
        private Choreographer f18538e;

        /* renamed from: f */
        private int f18539f;

        private C7813e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f18537d = handlerThread;
            handlerThread.start();
            Handler a = C7728ai.m22196a(this.f18537d.getLooper(), (Handler.Callback) this);
            this.f18536c = a;
            a.sendEmptyMessage(0);
        }

        /* renamed from: a */
        public static C7813e m22676a() {
            return f18534b;
        }

        /* renamed from: d */
        private void m22677d() {
            this.f18538e = Choreographer.getInstance();
        }

        /* renamed from: e */
        private void m22678e() {
            int i = this.f18539f + 1;
            this.f18539f = i;
            if (i == 1) {
                ((Choreographer) C7717a.m22120b(this.f18538e)).postFrameCallback(this);
            }
        }

        /* renamed from: f */
        private void m22679f() {
            int i = this.f18539f - 1;
            this.f18539f = i;
            if (i == 0) {
                ((Choreographer) C7717a.m22120b(this.f18538e)).removeFrameCallback(this);
                this.f18535a = -9223372036854775807L;
            }
        }

        /* renamed from: b */
        public void mo55207b() {
            this.f18536c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void mo55208c() {
            this.f18536c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f18535a = j;
            ((Choreographer) C7717a.m22120b(this.f18538e)).postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m22677d();
                return true;
            } else if (i == 1) {
                m22678e();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m22679f();
                return true;
            }
        }
    }

    public C7807m(Context context) {
        C7809b a = m22648a(context);
        this.f18515b = a;
        this.f18516c = a != null ? C7813e.m22676a() : null;
        this.f18524k = -9223372036854775807L;
        this.f18525l = -9223372036854775807L;
        this.f18519f = -1.0f;
        this.f18522i = 1.0f;
        this.f18523j = 0;
    }

    /* renamed from: a */
    private static long m22647a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: a */
    private static C7809b m22648a(Context context) {
        C7809b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C7728ai.f18249a >= 17) {
            bVar = C7812d.m22672a(applicationContext);
        }
        return bVar == null ? C7811c.m22669a(applicationContext) : bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22649a(Display display) {
        long j;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f18524k = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            C7755q.m22361c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            this.f18524k = -9223372036854775807L;
        }
        this.f18525l = j;
    }

    /* renamed from: a */
    private void m22650a(boolean z) {
        if (C7728ai.f18249a >= 30 && this.f18518e != null && this.f18523j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f18517d) {
                float f2 = this.f18520g;
                if (f2 != -1.0f) {
                    f = this.f18522i * f2;
                }
            }
            if (z || this.f18521h != f) {
                this.f18521h = f;
                C7808a.m22666a(this.f18518e, f);
            }
        }
    }

    /* renamed from: a */
    private static boolean m22651a(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: f */
    private void m22652f() {
        this.f18526m = 0;
        this.f18529p = -1;
        this.f18527n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f18520g) >= (r8.f18514a.mo55158b() && (r8.f18514a.mo55160d() > 5000000000L ? 1 : (r8.f18514a.mo55160d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r8.f18514a.mo55159c() >= 30) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22653g() {
        /*
            r8 = this;
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r8.f18518e
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            com.applovin.exoplayer2.m.e r0 = r8.f18514a
            boolean r0 = r0.mo55158b()
            if (r0 == 0) goto L_0x001b
            com.applovin.exoplayer2.m.e r0 = r8.f18514a
            float r0 = r0.mo55162f()
            goto L_0x001d
        L_0x001b:
            float r0 = r8.f18519f
        L_0x001d:
            float r2 = r8.f18520g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            com.applovin.exoplayer2.m.e r1 = r8.f18514a
            boolean r1 = r1.mo55158b()
            if (r1 == 0) goto L_0x0049
            com.applovin.exoplayer2.m.e r1 = r8.f18514a
            long r1 = r1.mo55160d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r8.f18520g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r5 = 0
            goto L_0x006c
        L_0x0061:
            if (r6 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            com.applovin.exoplayer2.m.e r2 = r8.f18514a
            int r2 = r2.mo55159c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r5 == 0) goto L_0x0073
            r8.f18520g = r0
            r8.m22650a((boolean) r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p222m.C7807m.m22653g():void");
    }

    /* renamed from: h */
    private void m22654h() {
        Surface surface;
        if (C7728ai.f18249a >= 30 && (surface = this.f18518e) != null && this.f18523j != Integer.MIN_VALUE && this.f18521h != 0.0f) {
            this.f18521h = 0.0f;
            C7808a.m22666a(surface, 0.0f);
        }
    }

    /* renamed from: a */
    public void mo55191a() {
        if (this.f18515b != null) {
            ((C7813e) C7717a.m22120b(this.f18516c)).mo55207b();
            this.f18515b.mo55203a(new C7809b.C7810a() {
                public final void onDefaultDisplayChanged(Display display) {
                    C7807m.this.m22649a(display);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo55192a(float f) {
        this.f18522i = f;
        m22652f();
        m22650a(false);
    }

    /* renamed from: a */
    public void mo55193a(int i) {
        if (this.f18523j != i) {
            this.f18523j = i;
            m22650a(true);
        }
    }

    /* renamed from: a */
    public void mo55194a(long j) {
        long j2 = this.f18527n;
        if (j2 != -1) {
            this.f18529p = j2;
            this.f18530q = this.f18528o;
        }
        this.f18526m++;
        this.f18514a.mo55157a(j * 1000);
        m22653g();
    }

    /* renamed from: a */
    public void mo55195a(Surface surface) {
        if (surface instanceof C7792d) {
            surface = null;
        }
        if (this.f18518e != surface) {
            m22654h();
            this.f18518e = surface;
            m22650a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo55196b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f18529p
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            com.applovin.exoplayer2.m.e r0 = r10.f18514a
            boolean r0 = r0.mo55158b()
            if (r0 == 0) goto L_0x0030
            com.applovin.exoplayer2.m.e r0 = r10.f18514a
            long r0 = r0.mo55161e()
            long r2 = r10.f18530q
            long r4 = r10.f18526m
            long r6 = r10.f18529p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f18522i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = m22651a(r11, r2)
            if (r0 == 0) goto L_0x002d
            r4 = r2
            goto L_0x0031
        L_0x002d:
            r10.m22652f()
        L_0x0030:
            r4 = r11
        L_0x0031:
            long r11 = r10.f18526m
            r10.f18527n = r11
            r10.f18528o = r4
            com.applovin.exoplayer2.m.m$e r11 = r10.f18516c
            if (r11 == 0) goto L_0x0058
            long r0 = r10.f18524k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            long r6 = r11.f18535a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            return r4
        L_0x004e:
            long r8 = r10.f18524k
            long r11 = m22647a(r4, r6, r8)
            long r0 = r10.f18525l
            long r11 = r11 - r0
            return r11
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p222m.C7807m.mo55196b(long):long");
    }

    /* renamed from: b */
    public void mo55197b() {
        this.f18517d = true;
        m22652f();
        m22650a(false);
    }

    /* renamed from: b */
    public void mo55198b(float f) {
        this.f18519f = f;
        this.f18514a.mo55156a();
        m22653g();
    }

    /* renamed from: c */
    public void mo55199c() {
        m22652f();
    }

    /* renamed from: d */
    public void mo55200d() {
        this.f18517d = false;
        m22654h();
    }

    /* renamed from: e */
    public void mo55201e() {
        C7809b bVar = this.f18515b;
        if (bVar != null) {
            bVar.mo55202a();
            ((C7813e) C7717a.m22120b(this.f18516c)).mo55208c();
        }
    }
}
