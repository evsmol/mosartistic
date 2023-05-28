package com.bykv.p271vk.openvk.component.video.api.p289d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bykv.p271vk.openvk.component.video.api.p287b.C10185a;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.d.b */
/* compiled from: IMediaLayout */
public interface C10190b<T> extends C10185a {

    /* renamed from: com.bykv.vk.openvk.component.video.api.d.b$a */
    /* compiled from: IMediaLayout */
    public enum C10191a {
        hideCloseBtn,
        alwayShowBackBtn,
        alwayShowMediaView,
        fixedSize,
        hideBackBtn,
        hideTopMoreBtn
    }

    /* renamed from: a */
    void mo2262a();

    /* renamed from: a */
    void mo2302a(Drawable drawable);

    /* renamed from: a */
    void mo2270a(T t, WeakReference<Context> weakReference, boolean z);

    /* renamed from: a */
    void mo2309a(boolean z);

    /* renamed from: b */
    void mo2312b();

    /* renamed from: c */
    View mo2318c();
}
