package com.ironsource.sdk.p149k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.C4377a;
import com.ironsource.sdk.p144g.C4942e;
import com.ironsource.sdk.p145h.C4948c;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.k.a */
public final class C4964a extends Handler {

    /* renamed from: a */
    public C4969c f12695a;

    public C4964a(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.f12695a == null) {
            Logger.m14507i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            if (message.what != 1016) {
                this.f12695a.mo34396a((C4948c) message.obj, new C4942e(message.what, C4377a.C43781.m12450a(message.what)));
                return;
            }
            this.f12695a.mo34395a((C4948c) message.obj);
        } catch (Throwable th) {
            Logger.m14507i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
