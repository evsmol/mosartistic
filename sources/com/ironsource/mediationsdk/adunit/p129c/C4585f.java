package com.ironsource.mediationsdk.adunit.p129c;

import com.ironsource.mediationsdk.C4540aa;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4574c;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4590b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.f */
public abstract class C4585f<Smash extends C4590b<?>> extends C4580d<Smash, BaseAdInteractionAdapter<?, AdapterAdRewardListener>> implements C4574c {
    public C4585f(C4571a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    /* renamed from: a */
    public final void mo33803a(C4590b<?> bVar, Placement placement) {
        IronLog.INTERNAL.verbose(mo33817a(bVar.mo33846l()));
        C4575b bVar2 = this.f11291r;
        if (bVar2.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C4540aa.m13201a().mo33676a(placement);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.f11261a);
    }
}
