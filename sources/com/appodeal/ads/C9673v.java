package com.appodeal.ads;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;

/* renamed from: com.appodeal.ads.v */
public final class C9673v extends C9376o<C9420r<Object>, C9258l> {

    /* renamed from: d */
    public final /* synthetic */ C9258l f24496d;

    /* renamed from: e */
    public final /* synthetic */ C9420r f24497e;

    /* renamed from: f */
    public final /* synthetic */ C9577u f24498f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9673v(C9577u uVar, C9420r rVar, C9258l lVar, int i, C9258l lVar2, C9420r rVar2) {
        super(rVar, lVar, i);
        this.f24498f = uVar;
        this.f24496d = lVar2;
        this.f24497e = rVar2;
    }

    /* renamed from: a */
    public final void mo60577a() {
        C9315n0 k = C9409q4.m27875k();
        AdType adType = this.f24498f.f24288f;
        double ecpm = this.f24496d.f23269c.getEcpm();
        C9258l lVar = this.f24496d;
        k.mo60330d(adType, ecpm, lVar.f23270d, lVar.f23269c.getAdUnitName());
        C9128b0<AdObjectType, AdRequestType, ?> b0Var = this.f24498f.f24286d;
        C9420r rVar = this.f24497e;
        C9258l lVar2 = this.f24496d;
        b0Var.getClass();
        rVar.getClass();
        if (lVar2 != null && !TextUtils.isEmpty(lVar2.f23269c.getId())) {
            lVar2.f23269c.mo59899b(System.currentTimeMillis());
        }
        b0Var.f22929a.mo60836a(LogConstants.EVENT_LOAD_START, (AdUnit) lVar2, (LoadingError) null);
    }
}
