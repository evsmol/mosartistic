package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2259L3;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.S1 */
public class C2503S1<C extends C2259L3> extends C3603w2<C> {

    /* renamed from: e */
    private Runnable f6616e = new C2504a();

    /* renamed from: f */
    private final ICommonExecutor f6617f;

    /* renamed from: com.yandex.metrica.impl.ob.S1$a */
    class C2504a implements Runnable {
        C2504a() {
        }

        public void run() {
            C2503S1.this.mo18354d();
        }
    }

    public C2503S1(C c, C3707yi yiVar, ICommonExecutor iCommonExecutor) {
        super(c, yiVar);
        this.f6617f = iCommonExecutor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16585c() {
        this.f6617f.remove(this.f6616e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16586f() {
        super.mo16586f();
        C2275Lg m = ((C2259L3) mo18355e()).mo16135m();
        if (m.mo16189F()) {
            String B = m.mo16185B();
            if (!TextUtils.isEmpty(B) && !"-1".equals(B)) {
                try {
                    NetworkServiceLocator.getInstance().getNetworkCore().startTask(C3443rd.m10617a((C2259L3) mo18355e()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: g */
    public void mo16587g() {
        synchronized (this.f9366b) {
            if (!this.f9367c) {
                mo16585c();
                if (((C2259L3) mo18355e()).mo16135m().mo16190G() > 0) {
                    this.f6617f.executeDelayed(this.f6616e, TimeUnit.SECONDS.toMillis((long) ((C2259L3) mo18355e()).mo16135m().mo16190G()));
                }
            }
        }
    }
}
