package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.eg */
public class C2925eg extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f7759b = 0;

    /* renamed from: a */
    private final C2869cg f7760a;

    public C2925eg(Handler handler, C2869cg cgVar) {
        super(handler);
        this.f7760a = cgVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C2895dg dgVar = null;
            try {
                dgVar = C2895dg.m9369a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
            }
            this.f7760a.mo15775a(dgVar);
        }
    }
}
