package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ub */
public class C3539ub {

    /* renamed from: a */
    public final C3504tb f9198a;

    /* renamed from: b */
    public final C2577U0 f9199b;

    /* renamed from: c */
    public final String f9200c;

    public C3539ub() {
        this((C3504tb) null, C2577U0.UNKNOWN, "identifier info has never been updated");
    }

    /* renamed from: a */
    public boolean mo18256a() {
        C3504tb tbVar = this.f9198a;
        return tbVar != null && !TextUtils.isEmpty(tbVar.f9142b);
    }

    public String toString() {
        return "AdTrackingInfoResult{mAdTrackingInfo=" + this.f9198a + ", mStatus=" + this.f9199b + ", mErrorExplanation='" + this.f9200c + '\'' + '}';
    }

    public C3539ub(C3504tb tbVar, C2577U0 u0, String str) {
        this.f9198a = tbVar;
        this.f9199b = u0;
        this.f9200c = str;
    }
}
