package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.Xj */
public class C2723Xj extends C3419qj {

    /* renamed from: a */
    private int f7202a;

    /* renamed from: b */
    private C3419qj f7203b;

    public C2723Xj(Context context, ICommonExecutor iCommonExecutor) {
        this(context.getApplicationContext(), new C3241mn(), iCommonExecutor);
    }

    /* renamed from: a */
    public synchronized void mo15940a() {
        int i = this.f7202a + 1;
        this.f7202a = i;
        if (i == 1) {
            this.f7203b.mo15940a();
        }
    }

    /* renamed from: b */
    public synchronized void mo15946b() {
        int i = this.f7202a - 1;
        this.f7202a = i;
        if (i == 0) {
            this.f7203b.mo15946b();
        }
    }

    C2723Xj(Context context, C3241mn mnVar, ICommonExecutor iCommonExecutor) {
        if (mnVar.mo17879a(context, "android.hardware.telephony")) {
            this.f7203b = new C2159Ij(context, iCommonExecutor);
        } else {
            this.f7203b = new C2247Kj();
        }
    }

    /* renamed from: a */
    public synchronized void mo15941a(C2810ak akVar) {
        this.f7203b.mo15941a(akVar);
    }

    /* renamed from: a */
    public synchronized void mo15944a(C3593vj vjVar) {
        this.f7203b.mo15944a(vjVar);
    }

    /* renamed from: a */
    public void mo15945a(boolean z) {
        this.f7203b.mo15945a(z);
    }

    /* renamed from: a */
    public void mo15943a(C3356pi piVar) {
        this.f7203b.mo15943a(piVar);
    }

    /* renamed from: a */
    public void mo15942a(C3208mc mcVar) {
        this.f7203b.mo15942a(mcVar);
    }
}
