package com.appodeal.ads;

import com.appodeal.ads.api.Stats;

/* renamed from: com.appodeal.ads.e0 */
public enum C9173e0 {
    Successful(Stats.AdUnitRequestResult.SUCCESSFUL),
    NoFill(Stats.AdUnitRequestResult.NOFILL),
    TimeOutReached(Stats.AdUnitRequestResult.TIMEOUTREACHED),
    Exception(Stats.AdUnitRequestResult.EXCEPTION),
    UndefinedAdapter(Stats.AdUnitRequestResult.UNDEFINEDADAPTER),
    IncorrectAdunit(Stats.AdUnitRequestResult.INCORRECTADUNIT),
    InvalidAssets(Stats.AdUnitRequestResult.INVALIDASSETS),
    Canceled(Stats.AdUnitRequestResult.CANCELED),
    IncorrectCreative(Stats.AdUnitRequestResult.EXCEPTION);
    

    /* renamed from: a */
    public final Stats.AdUnitRequestResult f23025a;

    /* access modifiers changed from: public */
    C9173e0(Stats.AdUnitRequestResult adUnitRequestResult) {
        this.f23025a = adUnitRequestResult;
    }

    /* renamed from: a */
    public final Stats.AdUnitRequestResult mo59904a() {
        return this.f23025a;
    }
}
