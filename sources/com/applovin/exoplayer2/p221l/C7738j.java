package com.applovin.exoplayer2.p221l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: com.applovin.exoplayer2.l.j */
public final class C7738j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    private static final int[] f18278a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f18279b;

    /* renamed from: c */
    private final int[] f18280c;

    /* renamed from: d */
    private final C7741b f18281d;

    /* renamed from: e */
    private EGLDisplay f18282e;

    /* renamed from: f */
    private EGLContext f18283f;

    /* renamed from: g */
    private EGLSurface f18284g;

    /* renamed from: h */
    private SurfaceTexture f18285h;

    /* renamed from: com.applovin.exoplayer2.l.j$a */
    public static final class C7740a extends RuntimeException {
        private C7740a(String str) {
            super(str);
        }
    }

    /* renamed from: com.applovin.exoplayer2.l.j$b */
    public interface C7741b {
        /* renamed from: a */
        void mo55007a();
    }

    public C7738j(Handler handler) {
        this(handler, (C7741b) null);
    }

    public C7738j(Handler handler, C7741b bVar) {
        this.f18279b = handler;
        this.f18281d = bVar;
        this.f18280c = new int[1];
    }

    /* renamed from: a */
    private static EGLConfig m22299a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f18278a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C7740a(C7728ai.m22200a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: a */
    private static EGLContext m22300a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C7740a("eglCreateContext failed");
    }

    /* renamed from: a */
    private static EGLSurface m22301a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new C7740a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C7740a("eglMakeCurrent failed");
    }

    /* renamed from: a */
    private static void m22302a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C7747n.m22329b();
    }

    /* renamed from: c */
    private void m22303c() {
        C7741b bVar = this.f18281d;
        if (bVar != null) {
            bVar.mo55007a();
        }
    }

    /* renamed from: d */
    private static EGLDisplay m22304d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C7740a("eglInitialize failed");
        }
        throw new C7740a("eglGetDisplay failed");
    }

    /* renamed from: a */
    public void mo55002a() {
        this.f18279b.removeCallbacks(this);
        try {
            if (this.f18285h != null) {
                this.f18285h.release();
                GLES20.glDeleteTextures(1, this.f18280c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f18282e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.f18282e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.f18284g;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f18282e, this.f18284g);
            }
            EGLContext eGLContext = this.f18283f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f18282e, eGLContext);
            }
            if (C7728ai.f18249a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay2 = this.f18282e;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f18282e);
            }
            this.f18282e = null;
            this.f18283f = null;
            this.f18284g = null;
            this.f18285h = null;
        }
    }

    /* renamed from: a */
    public void mo55003a(int i) {
        EGLDisplay d = m22304d();
        this.f18282e = d;
        EGLConfig a = m22299a(d);
        EGLContext a2 = m22300a(this.f18282e, a, i);
        this.f18283f = a2;
        this.f18284g = m22301a(this.f18282e, a, a2, i);
        m22302a(this.f18280c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f18280c[0]);
        this.f18285h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: b */
    public SurfaceTexture mo55004b() {
        return (SurfaceTexture) C7717a.m22120b(this.f18285h);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18279b.post(this);
    }

    public void run() {
        m22303c();
        SurfaceTexture surfaceTexture = this.f18285h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
