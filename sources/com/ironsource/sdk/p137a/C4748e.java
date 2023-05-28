package com.ironsource.sdk.p137a;

import com.ironsource.mediationsdk.adunit.p127a.C4559a;
import com.ironsource.sdk.p144g.C4935c;
import com.ironsource.sdk.p144g.C4936d;

/* renamed from: com.ironsource.sdk.a.e */
public class C4748e {

    /* renamed from: a */
    private C4559a f12036a = new C4559a();

    /* renamed from: a */
    public static C4936d.C4941e m13922a(C4935c cVar, C4936d.C4941e eVar) {
        return (cVar == null || cVar.f12640d == null || cVar.f12640d.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f12640d.get("rewarded")) ? C4936d.C4941e.RewardedVideo : C4936d.C4941e.Interstitial;
    }

    /* renamed from: a */
    public static boolean m13923a(C4935c cVar) {
        if (cVar == null || cVar.f12640d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f12640d.get("inAppBidding"));
    }

    /* renamed from: a */
    public void mo34235a(int i) {
        C4559a.m13270a("sdia", (Object) Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo34236b(int i) {
        C4559a.m13270a("sdra", (Object) Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo34237c(int i) {
        C4559a.m13270a("sdba", (Object) Integer.valueOf(i));
    }
}
