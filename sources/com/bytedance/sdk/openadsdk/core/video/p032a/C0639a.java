package com.bytedance.sdk.openadsdk.core.video.p032a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import com.bykv.p271vk.openvk.component.video.api.C10181a;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bykv.p271vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0675a;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0701d;
import com.bytedance.sdk.openadsdk.utils.C0985m;
import com.bytedance.sdk.openadsdk.utils.C0990o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.a.a */
/* compiled from: BaseController */
public abstract class C0639a implements C10192c, C10652x.C10653a, C0675a {

    /* renamed from: a */
    protected SurfaceHolder f2374a;

    /* renamed from: b */
    protected SurfaceTexture f2375b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C10181a f2376c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public C0701d f2377d;
    /* access modifiers changed from: protected */

    /* renamed from: e */
    public C0477n f2378e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public long f2379f = 0;

    /* renamed from: g */
    protected long f2380g = 0;
    /* access modifiers changed from: protected */

    /* renamed from: h */
    public WeakReference<Context> f2381h;

    /* renamed from: i */
    protected List<Runnable> f2382i;

    /* renamed from: j */
    protected boolean f2383j = false;
    /* access modifiers changed from: protected */

    /* renamed from: k */
    public final C10652x f2384k = new C10652x(Looper.getMainLooper(), this);

    /* renamed from: l */
    protected boolean f2385l = false;
    /* access modifiers changed from: protected */

    /* renamed from: m */
    public boolean f2386m = true;
    /* access modifiers changed from: protected */

    /* renamed from: n */
    public boolean f2387n = false;

    /* renamed from: o */
    protected boolean f2388o = false;

    /* renamed from: p */
    protected boolean f2389p = false;
    /* access modifiers changed from: protected */

    /* renamed from: q */
    public long f2390q;

    /* renamed from: r */
    protected Runnable f2391r = new Runnable() {
        public void run() {
            C10638l.m31231a("CSJ_VIDEO_Controller", "resumeVideo: run ", Boolean.valueOf(C0639a.this.f2383j));
            C0639a.this.mo2090E();
        }
    };

    /* renamed from: s */
    private long f2392s = 0;

    /* renamed from: a */
    public void mo5a(Message message) {
    }

    /* renamed from: a */
    public void mo2096a(C10190b bVar, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* renamed from: f */
    public void mo2107f(C10190b bVar, View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo2086A() {
        if (this.f2376c != null) {
            if (mo2087B()) {
                SurfaceTexture surfaceTexture = this.f2375b;
                if (surfaceTexture != null && surfaceTexture != this.f2376c.mo62864g()) {
                    this.f2376c.mo62851a(this.f2375b);
                    return;
                }
                return;
            }
            SurfaceHolder surfaceHolder = this.f2374a;
            if (surfaceHolder != null && surfaceHolder != this.f2376c.mo62863f()) {
                this.f2376c.mo62853a(this.f2374a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo2087B() {
        C0701d dVar = this.f2377d;
        if (dVar != null) {
            return dVar.mo2324q() instanceof SSRenderTextureView;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo2118s() {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        C0477n nVar = this.f2378e;
        if (nVar != null && nVar.mo1373aD() == 1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if ((!C0985m.m4562e() || Build.VERSION.SDK_INT < 30) && !C0990o.m4587a(this.f2378e)) {
            return C0503h.m2281d().mo1616q();
        }
        return true;
    }

    /* renamed from: g */
    public long mo2109g() {
        return this.f2379f;
    }

    /* renamed from: a */
    public void mo2093a(long j) {
        this.f2379f = j;
        long j2 = this.f2380g;
        if (j2 > j) {
            j = j2;
        }
        this.f2380g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo2088C() {
        WeakReference<Context> weakReference = this.f2381h;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2097a(Runnable runnable) {
        if (runnable != null) {
            if (!this.f2377d.mo2288m() || !this.f2383j) {
                mo2102b(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2102b(Runnable runnable) {
        if (this.f2382i == null) {
            this.f2382i = new ArrayList();
        }
        this.f2382i.add(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo2089D() {
        C10638l.m31238c("CSJ_VIDEO_Controller", "execPendingActions: before ");
        List<Runnable> list = this.f2382i;
        if (list != null && !list.isEmpty()) {
            C10638l.m31238c("CSJ_VIDEO_Controller", "execPendingActions:  exec");
            Iterator it = new ArrayList(this.f2382i).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f2382i.clear();
        }
    }

    /* renamed from: a */
    public void mo2095a(C10190b bVar, SurfaceHolder surfaceHolder) {
        this.f2383j = true;
        this.f2374a = surfaceHolder;
        C10181a aVar = this.f2376c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo62853a(surfaceHolder);
            }
            C10638l.m31238c("CSJ_VIDEO_Controller", "surfaceCreated: ");
            mo2089D();
        }
    }

    /* renamed from: b */
    public void mo2101b(C10190b bVar, SurfaceHolder surfaceHolder) {
        this.f2383j = false;
        this.f2374a = null;
        C10181a aVar = this.f2376c;
        if (aVar != null) {
            aVar.mo62859b(false);
        }
    }

    /* renamed from: a */
    public void mo2094a(C10190b bVar, SurfaceTexture surfaceTexture) {
        this.f2383j = true;
        this.f2375b = surfaceTexture;
        C10181a aVar = this.f2376c;
        if (aVar != null) {
            aVar.mo62851a(surfaceTexture);
            this.f2376c.mo62859b(this.f2383j);
        }
        C10638l.m31238c("CSJ_VIDEO_Controller", "surfaceTextureCreated: ");
        mo2089D();
    }

    /* renamed from: b */
    public void mo2100b(C10190b bVar, SurfaceTexture surfaceTexture) {
        this.f2383j = false;
        C10638l.m31238c("CSJ_VIDEO_Controller", "surfaceTextureDestroyed: ");
        C10181a aVar = this.f2376c;
        if (aVar != null) {
            aVar.mo62859b(false);
        }
        this.f2375b = null;
        mo2089D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo2090E() {
        this.f2384k.postAtFrontOfQueue(new Runnable() {
            public void run() {
                if (C0639a.this.f2376c != null) {
                    C10638l.m31231a("CSJ_VIDEO_Controller", "resumeVideo: execResumePlay", Boolean.valueOf(C0639a.this.f2383j));
                    C0639a.this.f2376c.mo62849a();
                }
            }
        });
    }

    /* renamed from: n */
    public C10181a mo2114n() {
        return this.f2376c;
    }

    /* renamed from: F */
    public C0701d mo2115o() {
        return this.f2377d;
    }

    /* renamed from: a */
    public void mo2098a(boolean z) {
        this.f2386m = z;
        C0701d dVar = this.f2377d;
        if (dVar != null) {
            dVar.mo2322d(z);
        }
    }

    /* renamed from: G */
    public boolean mo2092G() {
        return this.f2386m;
    }

    /* renamed from: m */
    public boolean mo2113m() {
        return this.f2388o;
    }

    /* renamed from: b */
    public void mo2099b(long j) {
        this.f2392s = j;
    }

    /* renamed from: c */
    public void mo2105c(long j) {
        this.f2390q = j;
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
        C10181a aVar = this.f2376c;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo62873p();
    }

    /* renamed from: p */
    public boolean mo2116p() {
        return this.f2387n;
    }

    /* renamed from: b */
    public void mo2103b(boolean z) {
        this.f2387n = z;
        C10181a aVar = this.f2376c;
        if (aVar != null) {
            aVar.mo62856a(z);
        }
    }

    /* renamed from: j */
    public long mo2112j() {
        C10181a aVar = this.f2376c;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo62874q();
    }

    /* renamed from: q */
    public boolean mo2117q() {
        return this.f2385l;
    }

    /* renamed from: c */
    public void mo2106c(boolean z) {
        this.f2385l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2108f(boolean z) {
        this.f2389p = z;
    }

    /* renamed from: c */
    public void mo2104c() {
        C10181a aVar = this.f2376c;
        if (aVar != null) {
            aVar.mo62860c();
        }
    }
}
