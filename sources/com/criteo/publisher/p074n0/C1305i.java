package com.criteo.publisher.p074n0;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.criteo.publisher.C1319p;
import com.criteo.publisher.p072m0.C1217d;

/* renamed from: com.criteo.publisher.n0.i */
/* compiled from: CriteoResultReceiver */
public class C1305i extends ResultReceiver {

    /* renamed from: a */
    private final C1217d f4025a;

    public C1305i(Handler handler, C1217d dVar) {
        super(handler);
        this.f4025a = dVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 100) {
            int i2 = bundle.getInt("Action");
            if (i2 == 201) {
                this.f4025a.mo3356a(C1319p.CLOSE);
            } else if (i2 == 202) {
                this.f4025a.mo3356a(C1319p.CLICK);
            }
        }
    }
}
