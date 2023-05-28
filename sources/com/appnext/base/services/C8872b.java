package com.appnext.base.services;

import android.content.Context;
import android.os.Bundle;
import com.appnext.base.operations.C8861a;
import com.appnext.base.operations.C8863b;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.p264b.C8856i;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.appnext.base.services.b */
public final class C8872b {
    /* renamed from: a */
    public final void mo58813a(Context context, String str, String str2, Bundle bundle, Object obj, C8861a.C8862a aVar) {
        try {
            C8856i.m26695aR().init(context.getApplicationContext());
            C8852e.init(context.getApplicationContext());
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
            if (advertisingIdInfo != null && advertisingIdInfo.isLimitAdTrackingEnabled()) {
                C8856i.m26695aR().putBoolean(C8856i.f22445fC, true);
                m26795b(aVar);
                return;
            }
            C8838c t = C8831a.m26576X().mo58686ab().mo58725t(str);
            if (t == null) {
                m26795b(aVar);
            } else {
                C8863b.m26748aI().mo58796a(t.getKey(), t, bundle, obj, aVar);
            }
        } catch (Throwable unused) {
            m26795b(aVar);
        }
    }

    /* renamed from: b */
    private static void m26795b(C8861a.C8862a aVar) {
        if (aVar != null) {
            try {
                aVar.mo58793aH();
            } catch (Throwable unused) {
            }
        }
    }
}
