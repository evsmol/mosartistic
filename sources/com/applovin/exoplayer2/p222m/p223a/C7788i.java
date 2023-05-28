package com.applovin.exoplayer2.p222m.p223a;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.p222m.C7806l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.exoplayer2.m.a.i */
public final class C7788i extends GLSurfaceView {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C7789a> f18400a;

    /* renamed from: b */
    private final SensorManager f18401b;

    /* renamed from: c */
    private final Sensor f18402c;

    /* renamed from: d */
    private final C7780d f18403d;

    /* renamed from: e */
    private final Handler f18404e;

    /* renamed from: f */
    private final C7787h f18405f;

    /* renamed from: g */
    private SurfaceTexture f18406g;

    /* renamed from: h */
    private Surface f18407h;

    /* renamed from: i */
    private boolean f18408i;

    /* renamed from: j */
    private boolean f18409j;

    /* renamed from: k */
    private boolean f18410k;

    /* renamed from: com.applovin.exoplayer2.m.a.i$a */
    public interface C7789a {
        /* renamed from: a */
        void mo52875a(Surface surface);
    }

    /* renamed from: a */
    private void m22539a() {
        boolean z = this.f18408i && this.f18409j;
        Sensor sensor = this.f18402c;
        if (sensor != null && z != this.f18410k) {
            if (z) {
                this.f18401b.registerListener(this.f18403d, sensor, 0);
            } else {
                this.f18401b.unregisterListener(this.f18403d);
            }
            this.f18410k = z;
        }
    }

    /* renamed from: a */
    private static void m22540a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22541b() {
        Surface surface = this.f18407h;
        if (surface != null) {
            Iterator<C7789a> it = this.f18400a.iterator();
            while (it.hasNext()) {
                it.next().mo52875a(surface);
            }
        }
        m22540a(this.f18406g, surface);
        this.f18406g = null;
        this.f18407h = null;
    }

    /* renamed from: a */
    public void mo55139a(C7789a aVar) {
        this.f18400a.add(aVar);
    }

    /* renamed from: b */
    public void mo55140b(C7789a aVar) {
        this.f18400a.remove(aVar);
    }

    public C7777a getCameraMotionListener() {
        return this.f18405f;
    }

    public C7806l getVideoFrameMetadataListener() {
        return this.f18405f;
    }

    public Surface getVideoSurface() {
        return this.f18407h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18404e.post(new Runnable() {
            public final void run() {
                C7788i.this.m22541b();
            }
        });
    }

    public void onPause() {
        this.f18409j = false;
        m22539a();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f18409j = true;
        m22539a();
    }

    public void setDefaultStereoMode(int i) {
        this.f18405f.mo55138a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f18408i = z;
        m22539a();
    }
}
