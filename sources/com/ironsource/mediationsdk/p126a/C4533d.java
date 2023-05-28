package com.ironsource.mediationsdk.p126a;

import com.ironsource.mediationsdk.p126a.C4525b;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.d */
public final class C4533d extends C4525b {

    /* renamed from: w */
    private static C4533d f11124w;

    /* renamed from: x */
    private String f11125x = "";

    private C4533d() {
        this.f11096r = "ironbeast";
        this.f11095q = 2;
        this.f11097s = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    /* renamed from: e */
    public static synchronized C4533d m13173e() {
        C4533d dVar;
        synchronized (C4533d.class) {
            if (f11124w == null) {
                C4533d dVar2 = new C4533d();
                f11124w = dVar2;
                dVar2.mo33637a();
            }
            dVar = f11124w;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33647b() {
        this.f11098t.add(2001);
        this.f11098t.add(2002);
        this.f11098t.add(2003);
        this.f11098t.add(2004);
        this.f11098t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f11098t.add(3001);
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD_FAILED));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f11098t.add(3002);
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f11098t.add(3005);
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f11098t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_SHOW));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo33656c(C4532c cVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo33657d(int i) {
        return this.f11125x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo33660d(C4532c cVar) {
        int a = cVar.mo33668a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3009;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo33661e(C4532c cVar) {
        return C4731o.m13872a().mo34207b(m13134e(cVar.mo33668a()) == C4525b.C4530a.BANNER.f11118f ? 3 : 2);
    }
}
