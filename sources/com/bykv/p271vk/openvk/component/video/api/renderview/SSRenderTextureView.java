package com.bykv.p271vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.api.renderview.C10206b;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView */
public class SSRenderTextureView extends TextureView implements TextureView.SurfaceTextureListener, C10206b {

    /* renamed from: a */
    private C10205a f25222a;

    /* renamed from: b */
    private C10206b.C10207a f25223b;

    public SurfaceHolder getHolder() {
        return null;
    }

    public View getView() {
        return this;
    }

    public SSRenderTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SSRenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo62972a(C10205a aVar) {
        this.f25222a = aVar;
        setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public void mo62971a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            th.printStackTrace();
            if (C10202c.m29292b()) {
                C10202c.m29290b("CSJ_VIDEO_TextureView", "rethrow exception for debug & local_test, (TextureView)", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C10202c.m29289b("CSJ_VIDEO_TextureView", "onSurfaceTextureAvailable: ");
        C10205a aVar = this.f25222a;
        if (aVar != null) {
            aVar.mo2301a(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C10202c.m29289b("CSJ_VIDEO_TextureView", "onSurfaceTextureSizeChanged: ");
        C10205a aVar = this.f25222a;
        if (aVar != null) {
            aVar.mo2315b(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C10202c.m29289b("CSJ_VIDEO_TextureView", "onSurfaceTextureDestroyed: ");
        C10205a aVar = this.f25222a;
        if (aVar != null) {
            return aVar.mo2311a(surfaceTexture);
        }
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C10205a aVar = this.f25222a;
        if (aVar != null) {
            aVar.mo2314b(surfaceTexture);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C10206b.C10207a aVar = this.f25223b;
        if (aVar != null) {
            aVar.mo62990a(i);
        }
    }

    public void setWindowVisibilityChangedListener(C10206b.C10207a aVar) {
        this.f25223b = aVar;
    }
}
