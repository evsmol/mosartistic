package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.f0 */
public class C2936f0 extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f7782b = 0;

    /* renamed from: a */
    private final C2937a f7783a;

    /* renamed from: com.yandex.metrica.impl.ob.f0$a */
    public interface C2937a {
        /* renamed from: a */
        void mo16696a(int i, Bundle bundle);
    }

    public C2936f0(Handler handler, C2937a aVar) {
        super(handler);
        this.f7783a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(C2972fl.class.getClassLoader());
        this.f7783a.mo16696a(i, bundle);
    }
}
