package com.bytedance.sdk.component.p323e.p327d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.e.d.g */
/* compiled from: WeakHandler */
public class C10605g extends Handler {

    /* renamed from: a */
    private final WeakReference<C10606a> f26461a;

    /* renamed from: com.bytedance.sdk.component.e.d.g$a */
    /* compiled from: WeakHandler */
    public interface C10606a {
        /* renamed from: a */
        void mo64188a(Message message);
    }

    public C10605g(Looper looper, C10606a aVar) {
        super(looper);
        this.f26461a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C10606a aVar = (C10606a) this.f26461a.get();
        if (aVar != null && message != null) {
            aVar.mo64188a(message);
        }
    }
}
