package com.bykv.p271vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.api.renderview.C10206b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, C10206b {

    /* renamed from: c */
    private static final ArrayList<C10208c> f25218c = new ArrayList<>();

    /* renamed from: a */
    private WeakReference<C10205a> f25219a;

    /* renamed from: b */
    private C10208c f25220b;

    /* renamed from: d */
    private C10206b.C10207a f25221d;

    public View getView() {
        return this;
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        C10202c.m29289b("CSJ_VIDEO_SurfaceView", "SSRenderSurfaceView: ");
        m29296a();
    }

    /* renamed from: a */
    private void m29296a() {
        C10208c cVar = new C10208c(this);
        this.f25220b = cVar;
        f25218c.add(cVar);
    }

    /* renamed from: a */
    public void mo62972a(C10205a aVar) {
        this.f25219a = new WeakReference<>(aVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<C10208c> it = f25218c.iterator();
        while (it.hasNext()) {
            C10208c next = it.next();
            if (next != null && next.mo62991a() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f25220b);
    }

    /* renamed from: a */
    public void mo62971a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<C10205a> weakReference = this.f25219a;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((C10205a) this.f25219a.get()).mo2303a(surfaceHolder);
        }
        C10202c.m29289b("CSJ_VIDEO_SurfaceView", "surfaceCreated: ");
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C10202c.m29289b("CSJ_VIDEO_SurfaceView", "surfaceChanged: ");
        WeakReference<C10205a> weakReference = this.f25219a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10205a) this.f25219a.get()).mo2304a(surfaceHolder, i, i2, i3);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C10202c.m29289b("CSJ_VIDEO_SurfaceView", "surfaceDestroyed: ");
        WeakReference<C10205a> weakReference = this.f25219a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10205a) this.f25219a.get()).mo2316b(surfaceHolder);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C10206b.C10207a aVar = this.f25221d;
        if (aVar != null) {
            aVar.mo62990a(i);
        }
    }

    public void setWindowVisibilityChangedListener(C10206b.C10207a aVar) {
        this.f25221d = aVar;
    }
}
