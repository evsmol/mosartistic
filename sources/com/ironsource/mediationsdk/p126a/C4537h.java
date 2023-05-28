package com.ironsource.mediationsdk.p126a;

import com.ironsource.mediationsdk.p126a.C4525b;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.h */
public final class C4537h extends C4525b {

    /* renamed from: w */
    private static C4537h f11132w;

    /* renamed from: x */
    private String f11133x = "";

    private C4537h() {
        this.f11096r = "outcome";
        this.f11095q = 3;
        this.f11097s = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    /* renamed from: e */
    public static synchronized C4537h m13193e() {
        C4537h hVar;
        synchronized (C4537h.class) {
            if (f11132w == null) {
                C4537h hVar2 = new C4537h();
                f11132w = hVar2;
                hVar2.mo33637a();
            }
            hVar = f11132w;
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33647b() {
        this.f11098t.add(1000);
        this.f11098t.add(1001);
        this.f11098t.add(1002);
        this.f11098t.add(1003);
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo33656c(C4532c cVar) {
        return cVar.mo33668a() == 305;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo33657d(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f11133x : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo33660d(C4532c cVar) {
        int a = cVar.mo33668a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo33661e(C4532c cVar) {
        return C4731o.m13872a().mo34207b((m13134e(cVar.mo33668a()) == C4525b.C4530a.OFFERWALL.f11118f ? 1 : 0) ^ 1);
    }
}
