package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.sh */
class C3482sh implements ActivationBarrier.IActivationBarrierCallback {

    /* renamed from: a */
    final /* synthetic */ String f9107a;

    /* renamed from: b */
    final /* synthetic */ File f9108b;

    /* renamed from: c */
    final /* synthetic */ C1997Eh f9109c;

    /* renamed from: d */
    final /* synthetic */ C2900di f9110d;

    /* renamed from: e */
    final /* synthetic */ C3551uh f9111e;

    C3482sh(C3551uh uhVar, String str, File file, C1997Eh eh, C2900di diVar) {
        this.f9111e = uhVar;
        this.f9107a = str;
        this.f9108b = file;
        this.f9109c = eh;
        this.f9110d = diVar;
    }

    public void onWaitFinished() {
        CacheControlHttpsConnectionPerformer a = this.f9111e.f9240d;
        String str = this.f9107a;
        C3551uh uhVar = this.f9111e;
        File file = this.f9108b;
        C1997Eh eh = this.f9109c;
        C2900di diVar = this.f9110d;
        uhVar.getClass();
        a.performConnection(str, new C3511th(uhVar, diVar, file, eh));
    }
}
