package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.w */
public class C8628w {

    /* renamed from: a */
    private final C8626v f21789a;

    /* renamed from: b */
    private final Map<String, C8070a> f21790b = CollectionUtils.map(4);

    /* renamed from: c */
    private final Object f21791c = new Object();

    C8628w(C8490n nVar) {
        this.f21789a = nVar.mo57320D();
    }

    /* renamed from: a */
    public C8070a mo57823a(String str) {
        C8070a aVar;
        synchronized (this.f21791c) {
            aVar = this.f21790b.get(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo57824a(C8070a aVar) {
        synchronized (this.f21791c) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21789a;
                vVar.mo57818b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.f21790b.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* renamed from: b */
    public void mo57825b(C8070a aVar) {
        synchronized (this.f21791c) {
            String adUnitId = aVar.getAdUnitId();
            C8076f fVar = this.f21790b.get(adUnitId);
            if (aVar == fVar) {
                if (C8626v.m26252a()) {
                    C8626v vVar = this.f21789a;
                    vVar.mo57818b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + fVar);
                }
                this.f21790b.remove(adUnitId);
            } else if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21789a;
                vVar2.mo57818b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + fVar);
            }
        }
    }
}
