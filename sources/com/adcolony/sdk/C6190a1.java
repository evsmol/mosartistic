package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.adcolony.sdk.C6288e0;
import com.appnext.base.p264b.C8850d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import kotlin.KotlinVersion;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.a1 */
class C6190a1 extends TextureView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private boolean f13260A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f13261B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f13262C;

    /* renamed from: D */
    private boolean f13263D;

    /* renamed from: E */
    private String f13264E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f13265F;

    /* renamed from: G */
    private FileInputStream f13266G;

    /* renamed from: H */
    private C6312h0 f13267H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C6223c f13268I;

    /* renamed from: J */
    private Surface f13269J;

    /* renamed from: K */
    private SurfaceTexture f13270K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public RectF f13271L = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C6200j f13272M;

    /* renamed from: N */
    private ProgressBar f13273N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public MediaPlayer f13274O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C6294f1 f13275P = C6235c0.m15073b();

    /* renamed from: Q */
    private ExecutorService f13276Q = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C6312h0 f13277R;

    /* renamed from: a */
    private float f13278a;

    /* renamed from: b */
    private float f13279b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f13280c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f13281d;

    /* renamed from: e */
    private float f13282e;

    /* renamed from: f */
    private float f13283f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f13284g;

    /* renamed from: h */
    private boolean f13285h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Paint f13286i = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Paint f13287j = new Paint(1);

    /* renamed from: k */
    private int f13288k;

    /* renamed from: l */
    private int f13289l;

    /* renamed from: m */
    private int f13290m;

    /* renamed from: n */
    private int f13291n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f13292o;

    /* renamed from: p */
    private int f13293p;

    /* renamed from: q */
    private int f13294q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public double f13295r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public double f13296s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f13297t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f13298u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f13299v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f13300w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f13301x;

    /* renamed from: y */
    private boolean f13302y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f13303z;

    /* renamed from: com.adcolony.sdk.a1$a */
    class C6191a implements C6327j0 {
        C6191a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6190a1.this.m14911a(h0Var)) {
                C6190a1.this.mo50438i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$b */
    class C6192b implements C6327j0 {
        C6192b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6190a1.this.m14911a(h0Var)) {
                C6190a1.this.m14919c(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$c */
    class C6193c implements C6327j0 {
        C6193c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6190a1.this.m14911a(h0Var)) {
                C6190a1.this.m14921d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$d */
    class C6194d implements C6327j0 {
        C6194d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6190a1.this.m14911a(h0Var)) {
                C6190a1.this.mo50437h();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$e */
    class C6195e implements C6327j0 {
        C6195e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6190a1.this.m14911a(h0Var)) {
                boolean unused = C6190a1.this.m14916b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$f */
    class C6196f implements C6327j0 {
        C6196f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6190a1.this.m14911a(h0Var)) {
                boolean unused = C6190a1.this.m14926e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$g */
    class C6197g implements Runnable {
        C6197g() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C6190a1.this.f13277R != null) {
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15077b(b, "id", C6190a1.this.f13292o);
                C6235c0.m15070a(b, "ad_session_id", C6190a1.this.f13265F);
                C6235c0.m15079b(b, "success", true);
                C6190a1.this.f13277R.mo50733a(b).mo50736c();
                C6312h0 unused = C6190a1.this.f13277R = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$h */
    class C6198h implements Runnable {
        C6198h() {
        }

        public void run() {
            long unused = C6190a1.this.f13297t = 0;
            while (!C6190a1.this.f13298u && !C6190a1.this.f13301x && C6185a.m14889c()) {
                Context a = C6185a.m14880a();
                if (!C6190a1.this.f13298u && !C6190a1.this.f13303z && a != null && (a instanceof Activity)) {
                    if (C6190a1.this.f13274O.isPlaying()) {
                        if (C6190a1.this.f13297t == 0 && C6185a.f13243d) {
                            long unused2 = C6190a1.this.f13297t = System.currentTimeMillis();
                        }
                        boolean unused3 = C6190a1.this.f13300w = true;
                        C6190a1 a1Var = C6190a1.this;
                        double unused4 = a1Var.f13295r = ((double) a1Var.f13274O.getCurrentPosition()) / 1000.0d;
                        C6190a1 a1Var2 = C6190a1.this;
                        double unused5 = a1Var2.f13296s = ((double) a1Var2.f13274O.getDuration()) / 1000.0d;
                        if (System.currentTimeMillis() - C6190a1.this.f13297t > 1000 && !C6190a1.this.f13262C && C6185a.f13243d) {
                            if (C6190a1.this.f13295r == 0.0d) {
                                new C6288e0.C6289a().mo50644a("getCurrentPosition() not working, firing ").mo50644a("AdSession.on_error").mo50645a(C6288e0.f13498i);
                                C6190a1.this.m14929g();
                            } else {
                                boolean unused6 = C6190a1.this.f13262C = true;
                            }
                        }
                        if (C6190a1.this.f13261B) {
                            C6190a1.this.mo50435e();
                        }
                    }
                    if (C6190a1.this.f13300w && !C6190a1.this.f13298u && !C6190a1.this.f13301x) {
                        C6235c0.m15077b(C6190a1.this.f13275P, "id", C6190a1.this.f13292o);
                        C6235c0.m15077b(C6190a1.this.f13275P, "container_id", C6190a1.this.f13268I.mo50532c());
                        C6235c0.m15070a(C6190a1.this.f13275P, "ad_session_id", C6190a1.this.f13265F);
                        C6235c0.m15067a(C6190a1.this.f13275P, "elapsed", C6190a1.this.f13295r);
                        C6235c0.m15067a(C6190a1.this.f13275P, IronSourceConstants.EVENTS_DURATION, C6190a1.this.f13296s);
                        new C6312h0("VideoView.on_progress", C6190a1.this.f13268I.mo50551k(), C6190a1.this.f13275P).mo50736c();
                    }
                    if (C6190a1.this.f13299v || ((Activity) a).isFinishing()) {
                        boolean unused7 = C6190a1.this.f13299v = false;
                        C6190a1.this.mo50439j();
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException unused8) {
                        C6190a1.this.m14929g();
                        new C6288e0.C6289a().mo50644a("InterruptedException in ADCVideoView's update thread.").mo50645a(C6288e0.f13497h);
                    }
                } else {
                    return;
                }
            }
            if (C6190a1.this.f13299v) {
                C6190a1.this.mo50439j();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$i */
    class C6199i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13312a;

        C6199i(Context context) {
            this.f13312a = context;
        }

        public void run() {
            C6200j unused = C6190a1.this.f13272M = new C6200j(this.f13312a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C6190a1.this.f13280c * 4.0f), (int) (C6190a1.this.f13280c * 4.0f));
            layoutParams.setMargins(0, C6190a1.this.f13268I.mo50529b() - ((int) (C6190a1.this.f13280c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            C6190a1.this.f13268I.addView(C6190a1.this.f13272M, layoutParams);
        }
    }

    /* renamed from: com.adcolony.sdk.a1$j */
    private class C6200j extends View {
        C6200j(Context context) {
            super(context);
            setWillNotDraw(false);
            Class<C6200j> cls = C6200j.class;
            try {
                cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(C6190a1.this.f13271L, 270.0f, C6190a1.this.f13281d, false, C6190a1.this.f13286i);
            canvas.drawText("" + C6190a1.this.f13284g, C6190a1.this.f13271L.centerX(), (float) (((double) C6190a1.this.f13271L.centerY()) + (((double) C6190a1.this.f13287j.getFontMetrics().bottom) * 1.35d)), C6190a1.this.f13287j);
            invalidate();
        }
    }

    C6190a1(Context context, C6312h0 h0Var, int i, C6223c cVar) {
        super(context);
        this.f13268I = cVar;
        this.f13267H = h0Var;
        this.f13292o = i;
        setSurfaceTextureListener(this);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f13298u = true;
        this.f13295r = this.f13296s;
        C6235c0.m15077b(this.f13275P, "id", this.f13292o);
        C6235c0.m15077b(this.f13275P, "container_id", this.f13268I.mo50532c());
        C6235c0.m15070a(this.f13275P, "ad_session_id", this.f13265F);
        C6235c0.m15067a(this.f13275P, "elapsed", this.f13295r);
        C6235c0.m15067a(this.f13275P, IronSourceConstants.EVENTS_DURATION, this.f13296s);
        new C6312h0("VideoView.on_progress", this.f13268I.mo50551k(), this.f13275P).mo50736c();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m14929g();
        C6288e0.C6289a aVar = new C6288e0.C6289a();
        aVar.mo50644a("MediaPlayer error: " + i + "," + i2).mo50645a(C6288e0.f13497h);
        return true;
    }

    public void onMeasure(int i, int i2) {
        m14935l();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f13302y = true;
        if (this.f13263D) {
            this.f13268I.removeView(this.f13273N);
        }
        if (this.f13260A) {
            this.f13293p = mediaPlayer.getVideoWidth();
            this.f13294q = mediaPlayer.getVideoHeight();
            m14935l();
            new C6288e0.C6289a().mo50644a("MediaPlayer getVideoWidth = ").mo50642a(mediaPlayer.getVideoWidth()).mo50645a(C6288e0.f13494e);
            new C6288e0.C6289a().mo50644a("MediaPlayer getVideoHeight = ").mo50642a(mediaPlayer.getVideoHeight()).mo50645a(C6288e0.f13494e);
        }
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15077b(b, "id", this.f13292o);
        C6235c0.m15077b(b, "container_id", this.f13268I.mo50532c());
        C6235c0.m15070a(b, "ad_session_id", this.f13265F);
        new C6312h0("VideoView.on_ready", this.f13268I.mo50551k(), b).mo50736c();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f13276Q;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f13276Q.submit(new C6197g());
            } catch (RejectedExecutionException unused) {
                m14929g();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.f13303z) {
            new C6288e0.C6289a().mo50644a("Null texture provided by system's onSurfaceTextureAvailable or ").mo50644a("MediaPlayer has been destroyed.").mo50645a(C6288e0.f13498i);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f13269J = surface;
        try {
            this.f13274O.setSurface(surface);
        } catch (IllegalStateException unused) {
            new C6288e0.C6289a().mo50644a("IllegalStateException thrown when calling MediaPlayer.setSurface()").mo50645a(C6288e0.f13497h);
            m14929g();
        }
        this.f13270K = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f13270K = surfaceTexture;
        if (!this.f13303z) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f13270K = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13270K = surfaceTexture;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C6328k b = C6185a.m14887b();
        C6252d c = b.mo50787c();
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C6294f1 b2 = C6235c0.m15073b();
        C6235c0.m15077b(b2, "view_id", this.f13292o);
        C6235c0.m15070a(b2, "ad_session_id", this.f13265F);
        C6235c0.m15077b(b2, "container_x", this.f13288k + x);
        C6235c0.m15077b(b2, "container_y", this.f13289l + y);
        C6235c0.m15077b(b2, "view_x", x);
        C6235c0.m15077b(b2, "view_y", y);
        C6235c0.m15077b(b2, "id", this.f13268I.mo50532c());
        if (action == 0) {
            new C6312h0("AdContainer.on_touch_began", this.f13268I.mo50551k(), b2).mo50736c();
        } else if (action == 1) {
            if (!this.f13268I.mo50558p()) {
                b.mo50777a(c.mo50618d().get(this.f13265F));
            }
            new C6312h0("AdContainer.on_touch_ended", this.f13268I.mo50551k(), b2).mo50736c();
        } else if (action == 2) {
            new C6312h0("AdContainer.on_touch_moved", this.f13268I.mo50551k(), b2).mo50736c();
        } else if (action == 3) {
            new C6312h0("AdContainer.on_touch_cancelled", this.f13268I.mo50551k(), b2).mo50736c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f13288k);
            C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f13289l);
            C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action2));
            C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C6312h0("AdContainer.on_touch_began", this.f13268I.mo50551k(), b2).mo50736c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f13288k);
            C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f13289l);
            C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action3));
            C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f13268I.mo50558p()) {
                b.mo50777a(c.mo50618d().get(this.f13265F));
            }
            new C6312h0("AdContainer.on_touch_ended", this.f13268I.mo50551k(), b2).mo50736c();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m14929g() {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "id", this.f13265F);
        new C6312h0("AdSession.on_error", this.f13268I.mo50551k(), b).mo50736c();
        this.f13298u = true;
    }

    /* renamed from: l */
    private void m14935l() {
        double min = Math.min(((double) this.f13290m) / ((double) this.f13293p), ((double) this.f13291n) / ((double) this.f13294q));
        int i = (int) (((double) this.f13293p) * min);
        int i2 = (int) (((double) this.f13294q) * min);
        new C6288e0.C6289a().mo50644a("setMeasuredDimension to ").mo50642a(i).mo50644a(" by ").mo50642a(i2).mo50645a(C6288e0.f13494e);
        setMeasuredDimension(i, i2);
        if (this.f13260A) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    private void m14938m() {
        try {
            this.f13276Q.submit(new C6198h());
        } catch (RejectedExecutionException unused) {
            m14929g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo50437h() {
        if (!this.f13302y) {
            new C6288e0.C6289a().mo50644a("ADCVideoView pause() called while MediaPlayer is not prepared.").mo50645a(C6288e0.f13496g);
            return false;
        } else if (!this.f13300w) {
            return false;
        } else {
            this.f13274O.getCurrentPosition();
            this.f13296s = (double) this.f13274O.getDuration();
            this.f13274O.pause();
            this.f13301x = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo50438i() {
        if (!this.f13302y) {
            return false;
        }
        if (!this.f13301x && C6185a.f13243d) {
            this.f13274O.start();
            m14938m();
        } else if (!this.f13298u && C6185a.f13243d) {
            this.f13274O.start();
            this.f13301x = false;
            if (!this.f13276Q.isShutdown()) {
                m14938m();
            }
            C6200j jVar = this.f13272M;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo50439j() {
        new C6288e0.C6289a().mo50644a("MediaPlayer stopped and released.").mo50645a(C6288e0.f13494e);
        try {
            if (!this.f13298u && this.f13302y && this.f13274O.isPlaying()) {
                this.f13274O.stop();
            }
        } catch (IllegalStateException unused) {
            new C6288e0.C6289a().mo50644a("Caught IllegalStateException when calling stop on MediaPlayer").mo50645a(C6288e0.f13496g);
        }
        ProgressBar progressBar = this.f13273N;
        if (progressBar != null) {
            this.f13268I.removeView(progressBar);
        }
        this.f13298u = true;
        this.f13302y = false;
        this.f13274O.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo50440k() {
        this.f13299v = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50434d() {
        Context a;
        C6294f1 a2 = this.f13267H.mo50732a();
        this.f13265F = C6235c0.m15087h(a2, "ad_session_id");
        this.f13288k = C6235c0.m15083d(a2, "x");
        this.f13289l = C6235c0.m15083d(a2, "y");
        this.f13290m = C6235c0.m15083d(a2, IabUtils.KEY_WIDTH);
        this.f13291n = C6235c0.m15083d(a2, IabUtils.KEY_HEIGHT);
        this.f13261B = C6235c0.m15076b(a2, "enable_timer");
        this.f13263D = C6235c0.m15076b(a2, "enable_progress");
        this.f13264E = C6235c0.m15087h(a2, "filepath");
        this.f13293p = C6235c0.m15083d(a2, "video_width");
        this.f13294q = C6235c0.m15083d(a2, "video_height");
        this.f13283f = C6185a.m14887b().mo50803n().mo50956s();
        new C6288e0.C6289a().mo50644a("Original video dimensions = ").mo50642a(this.f13293p).mo50644a("x").mo50642a(this.f13294q).mo50645a(C6288e0.f13492c);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13290m, this.f13291n);
        layoutParams.setMargins(this.f13288k, this.f13289l, 0, 0);
        layoutParams.gravity = 0;
        this.f13268I.addView(this, layoutParams);
        if (this.f13263D && (a = C6185a.m14880a()) != null) {
            ProgressBar progressBar = new ProgressBar(a);
            this.f13273N = progressBar;
            C6223c cVar = this.f13268I;
            int i = (int) (this.f13283f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
        }
        this.f13274O = new MediaPlayer();
        this.f13302y = false;
        try {
            if (!this.f13264E.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f13264E);
                this.f13266G = fileInputStream;
                this.f13274O.setDataSource(fileInputStream.getFD());
            } else {
                this.f13260A = true;
                this.f13274O.setDataSource(this.f13264E);
            }
            this.f13274O.setOnErrorListener(this);
            this.f13274O.setOnPreparedListener(this);
            this.f13274O.setOnCompletionListener(this);
            this.f13274O.prepareAsync();
        } catch (IOException e) {
            new C6288e0.C6289a().mo50644a("Failed to create/prepare MediaPlayer: ").mo50644a(e.toString()).mo50645a(C6288e0.f13497h);
            m14929g();
        }
        this.f13268I.mo50547i().add(C6185a.m14881a("VideoView.play", (C6327j0) new C6191a(), true));
        this.f13268I.mo50547i().add(C6185a.m14881a("VideoView.set_bounds", (C6327j0) new C6192b(), true));
        this.f13268I.mo50547i().add(C6185a.m14881a("VideoView.set_visible", (C6327j0) new C6193c(), true));
        this.f13268I.mo50547i().add(C6185a.m14881a("VideoView.pause", (C6327j0) new C6194d(), true));
        this.f13268I.mo50547i().add(C6185a.m14881a("VideoView.seek_to_time", (C6327j0) new C6195e(), true));
        this.f13268I.mo50547i().add(C6185a.m14881a("VideoView.set_volume", (C6327j0) new C6196f(), true));
        this.f13268I.mo50549j().add("VideoView.play");
        this.f13268I.mo50549j().add("VideoView.set_bounds");
        this.f13268I.mo50549j().add("VideoView.set_visible");
        this.f13268I.mo50549j().add("VideoView.pause");
        this.f13268I.mo50549j().add("VideoView.seek_to_time");
        this.f13268I.mo50549j().add("VideoView.set_volume");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50435e() {
        if (this.f13285h) {
            this.f13282e = (float) (360.0d / this.f13296s);
            this.f13287j.setColor(-3355444);
            this.f13287j.setShadowLayer((float) ((int) (this.f13283f * 2.0f)), 0.0f, 0.0f, -16777216);
            this.f13287j.setTextAlign(Paint.Align.CENTER);
            this.f13287j.setLinearText(true);
            this.f13287j.setTextSize(this.f13283f * 12.0f);
            this.f13286i.setStyle(Paint.Style.STROKE);
            float f = this.f13283f * 2.0f;
            if (f > 6.0f) {
                f = 6.0f;
            }
            if (f < 4.0f) {
                f = 4.0f;
            }
            this.f13286i.setStrokeWidth(f);
            this.f13286i.setShadowLayer((float) ((int) (this.f13283f * 3.0f)), 0.0f, 0.0f, -16777216);
            this.f13286i.setColor(-3355444);
            Rect rect = new Rect();
            this.f13287j.getTextBounds("0123456789", 0, 9, rect);
            this.f13280c = (float) rect.height();
            Context a = C6185a.m14880a();
            if (a != null) {
                C6509z0.m15953b((Runnable) new C6199i(a));
            }
            this.f13285h = false;
        }
        this.f13284g = (int) (this.f13296s - this.f13295r);
        float f2 = this.f13280c;
        float f3 = (float) ((int) f2);
        this.f13278a = f3;
        float f4 = (float) ((int) (3.0f * f2));
        this.f13279b = f4;
        float f5 = f2 / 2.0f;
        float f6 = f2 * 2.0f;
        this.f13271L.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
        this.f13281d = (float) (((double) this.f13282e) * (this.f13296s - this.f13295r));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo50436f() {
        return this.f13298u;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14919c(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13288k = C6235c0.m15083d(a, "x");
        this.f13289l = C6235c0.m15083d(a, "y");
        this.f13290m = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13291n = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f13288k, this.f13289l, 0, 0);
        layoutParams.width = this.f13290m;
        layoutParams.height = this.f13291n;
        setLayoutParams(layoutParams);
        if (this.f13261B && this.f13272M != null) {
            int i = (int) (this.f13280c * 4.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.setMargins(0, this.f13268I.mo50529b() - ((int) (this.f13280c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.f13272M.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m14916b(C6312h0 h0Var) {
        if (!this.f13302y) {
            return false;
        }
        if (this.f13298u) {
            this.f13298u = false;
        }
        this.f13277R = h0Var;
        int d = C6235c0.m15083d(h0Var.mo50732a(), C8850d.f22432fl);
        int duration = this.f13274O.getDuration() / 1000;
        this.f13274O.setOnSeekCompleteListener(this);
        this.f13274O.seekTo(d * 1000);
        if (duration == d) {
            this.f13298u = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50431a() {
        if (this.f13270K != null) {
            this.f13303z = true;
        }
        this.f13276Q.shutdown();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m14911a(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        return C6235c0.m15083d(a, "id") == this.f13292o && C6235c0.m15083d(a, "container_id") == this.f13268I.mo50532c() && C6235c0.m15087h(a, "ad_session_id").equals(this.f13268I.mo50523a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo50433c() {
        return this.f13274O != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaPlayer mo50432b() {
        return this.f13274O;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m14926e(C6312h0 h0Var) {
        boolean z = false;
        if (!this.f13302y) {
            return false;
        }
        float c = (float) C6235c0.m15081c(h0Var.mo50732a(), "volume");
        AdColonyInterstitial j = C6185a.m14887b().mo50799j();
        if (j != null) {
            if (((double) c) <= 0.0d) {
                z = true;
            }
            j.mo50342a(z);
        }
        this.f13274O.setVolume(c, c);
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15079b(b, "success", true);
        h0Var.mo50733a(b).mo50736c();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14921d(C6312h0 h0Var) {
        C6200j jVar;
        C6200j jVar2;
        if (C6235c0.m15076b(h0Var.mo50732a(), "visible")) {
            setVisibility(0);
            if (this.f13261B && (jVar2 = this.f13272M) != null) {
                jVar2.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.f13261B && (jVar = this.f13272M) != null) {
            jVar.setVisibility(4);
        }
    }
}
