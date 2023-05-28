package com.yandex.metrica.impl.p082ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2895dg;

/* renamed from: com.yandex.metrica.impl.ob.qg */
public class C3411qg implements C3129kg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InstallReferrerClient f8849a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ICommonExecutor f8850b;

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    class C3412a implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ C3590vg f8851a;

        /* renamed from: com.yandex.metrica.impl.ob.qg$a$a */
        class C3413a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2895dg f8853a;

            C3413a(C2895dg dgVar) {
                this.f8853a = dgVar;
            }

            public void run() {
                C3412a.this.f8851a.mo17887a(this.f8853a);
            }
        }

        C3412a(C3590vg vgVar) {
            this.f8851a = vgVar;
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = C3411qg.this.f8849a.getInstallReferrer();
                    C3411qg.this.f8850b.execute(new C3413a(new C2895dg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), C2895dg.C2896a.GP)));
                } catch (Throwable th) {
                    C3411qg.m10500a(C3411qg.this, this.f8851a, th);
                }
            } else {
                C3411qg qgVar = C3411qg.this;
                C3590vg vgVar = this.f8851a;
                C3411qg.m10500a(qgVar, vgVar, new IllegalStateException("Referrer check failed with error " + i));
            }
            try {
                C3411qg.this.f8849a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    C3411qg(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f8849a = installReferrerClient;
        this.f8850b = iCommonExecutor;
    }

    /* renamed from: a */
    public void mo17782a(C3590vg vgVar) throws Throwable {
        this.f8849a.startConnection(new C3412a(vgVar));
    }

    /* renamed from: a */
    static void m10500a(C3411qg qgVar, C3590vg vgVar, Throwable th) {
        qgVar.f8850b.execute(new C3448rg(qgVar, vgVar, th));
    }
}
