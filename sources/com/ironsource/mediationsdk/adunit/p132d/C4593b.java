package com.ironsource.mediationsdk.adunit.p132d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4572a;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4589a;
import com.ironsource.mediationsdk.model.C4646a;

/* renamed from: com.ironsource.mediationsdk.adunit.d.b */
public final class C4593b extends C4589a<C4572a> implements InterstitialAdListener {
    public C4593b(C4588a aVar, BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter, C4572a aVar2) {
        super(aVar, baseAdInteractionAdapter, new C4646a(aVar.f11311c, aVar.f11311c.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), aVar2);
    }
}
