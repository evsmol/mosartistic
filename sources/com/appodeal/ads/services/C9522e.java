package com.appodeal.ads.services;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.C9409q4;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(mo38568c = "com.appodeal.ads.services.ServicesSolutionImpl", mo38569f = "ServicesSolutionImpl.kt", mo38570l = {47}, mo38571m = "validatePurchase")
/* renamed from: com.appodeal.ads.services.e */
public final class C9522e extends ContinuationImpl {

    /* renamed from: a */
    public InAppPurchase f24150a;

    /* renamed from: b */
    public InAppPurchaseValidateCallback f24151b;

    /* renamed from: c */
    public /* synthetic */ Object f24152c;

    /* renamed from: d */
    public final /* synthetic */ C9517d f24153d;

    /* renamed from: e */
    public int f24154e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9522e(C9517d dVar, Continuation<? super C9522e> continuation) {
        super(continuation);
        this.f24153d = dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f24152c = obj;
        this.f24154e |= RecyclerView.UNDEFINED_DURATION;
        return this.f24153d.mo60760a((InAppPurchase) null, (InAppPurchaseValidateCallback) null, (C9409q4.C9417h.C9418a) null, this);
    }
}
