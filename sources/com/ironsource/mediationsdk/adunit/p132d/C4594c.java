package com.ironsource.mediationsdk.adunit.p132d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4574c;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4590b;
import com.ironsource.mediationsdk.model.C4646a;

/* renamed from: com.ironsource.mediationsdk.adunit.d.c */
public final class C4594c extends C4590b<C4574c> implements RewardedVideoAdListener {
    public C4594c(C4588a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C4574c cVar) {
        super(aVar, baseAdInteractionAdapter, new C4646a(aVar.f11311c, aVar.f11311c.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), cVar);
    }
}
