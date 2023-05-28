package com.bykv.p271vk.openvk.component.video.api.p291f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.d */
/* compiled from: WeakHandler */
public class C10203d extends Handler {

    /* renamed from: a */
    private final WeakReference<C10204a> f25217a;

    /* renamed from: com.bykv.vk.openvk.component.video.api.f.d$a */
    /* compiled from: WeakHandler */
    public interface C10204a {
        /* renamed from: a */
        void mo62852a(Message message);
    }

    public C10203d(Looper looper, C10204a aVar) {
        super(looper);
        this.f25217a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C10204a aVar = (C10204a) this.f25217a.get();
        if (aVar != null && message != null) {
            aVar.mo62852a(message);
        }
    }
}
