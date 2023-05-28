package com.ironsource.mediationsdk.adunit.p129c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.C4714c;
import java.util.List;

/* renamed from: com.ironsource.mediationsdk.adunit.c.a */
public final class C4571a {

    /* renamed from: a */
    IronSource.AD_UNIT f11252a;

    /* renamed from: b */
    String f11253b;

    /* renamed from: c */
    List<NetworkSettings> f11254c;

    /* renamed from: d */
    C4714c f11255d;

    /* renamed from: e */
    int f11256e;

    /* renamed from: f */
    int f11257f;

    /* renamed from: g */
    int f11258g;

    /* renamed from: h */
    C4576a f11259h;

    /* renamed from: i */
    int f11260i;

    public C4571a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, C4714c cVar, int i, int i2, int i3, int i4, C4576a aVar) {
        this.f11252a = ad_unit;
        this.f11253b = str;
        this.f11254c = list;
        this.f11255d = cVar;
        this.f11256e = i;
        this.f11258g = i2;
        this.f11257f = i3;
        this.f11259h = aVar;
        this.f11260i = i4;
    }

    /* renamed from: a */
    public final NetworkSettings mo33791a(String str) {
        for (NetworkSettings next : this.f11254c) {
            if (next.getProviderInstanceName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo33792a() {
        return this.f11255d.f11777e > 0;
    }
}
