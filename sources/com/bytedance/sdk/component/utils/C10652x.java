package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.utils.x */
/* compiled from: WeakHandler */
public class C10652x extends Handler {

    /* renamed from: a */
    private final WeakReference<C10653a> f26548a;

    /* renamed from: com.bytedance.sdk.component.utils.x$a */
    /* compiled from: WeakHandler */
    public interface C10653a {
        /* renamed from: a */
        void mo5a(Message message);
    }

    public C10652x(C10653a aVar) {
        this.f26548a = new WeakReference<>(aVar);
    }

    public C10652x(Looper looper, C10653a aVar) {
        super(looper);
        this.f26548a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C10653a aVar = (C10653a) this.f26548a.get();
        if (aVar != null && message != null) {
            aVar.mo5a(message);
        }
    }
}
