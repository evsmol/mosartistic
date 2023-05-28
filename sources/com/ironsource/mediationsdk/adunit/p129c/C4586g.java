package com.ironsource.mediationsdk.adunit.p129c;

import com.ironsource.mediationsdk.C4616d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p132d.C4588a;
import com.ironsource.mediationsdk.adunit.p132d.C4593b;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* renamed from: com.ironsource.mediationsdk.adunit.c.g */
public final class C4586g extends C4580d<C4593b, BaseAdInteractionAdapter<?, AdapterAdInteractionListener>> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4586g(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> r18, com.ironsource.mediationsdk.model.C4653h r19, java.lang.String r20, java.util.Set<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> r21, com.ironsource.mediationsdk.IronSourceSegment r22) {
        /*
            r17 = this;
            r0 = r19
            com.ironsource.mediationsdk.adunit.c.a r10 = new com.ironsource.mediationsdk.adunit.c.a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.mediationsdk.utils.c r4 = r0.f11623i
            int r5 = r0.f11617c
            int r6 = r0.f11619e
            int r7 = r0.f11620f
            com.ironsource.mediationsdk.adunit.c.b.a r9 = new com.ironsource.mediationsdk.adunit.c.b.a
            com.ironsource.mediationsdk.adunit.c.b.a$a r12 = com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a.C4577a.MANUAL
            com.ironsource.mediationsdk.utils.c r2 = r0.f11623i
            long r13 = r2.f11783k
            com.ironsource.mediationsdk.utils.c r0 = r0.f11623i
            long r2 = r0.f11782j
            r11 = r9
            r15 = r2
            r11.<init>(r12, r13, r15)
            r8 = -1
            r0 = r10
            r2 = r20
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r1 = r21
            r2 = r22
            r0.<init>(r10, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p129c.C4586g.<init>(java.util.List, com.ironsource.mediationsdk.model.h, java.lang.String, java.util.Set, com.ironsource.mediationsdk.IronSourceSegment):void");
    }

    /* renamed from: b */
    private static BaseAdInteractionAdapter<?, AdapterAdInteractionListener> m13409b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b = C4616d.m13502a().mo33897b(networkSettings, ad_unit);
        if (b == null || !(b instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b;
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ BaseAdAdapter mo33815a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return m13409b(networkSettings, ad_unit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C4591c mo33816a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str) {
        return new C4593b(new C4588a(IronSource.AD_UNIT.INTERSTITIAL, this.f11286m.f11253b, i, this.f11281h, str, this.f11279f, this.f11280g, networkSettings, this.f11286m.f11258g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
