package com.appodeal.ads.services;

import com.appodeal.ads.C9409q4;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.revenue.RevenueInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* renamed from: com.appodeal.ads.services.c */
public interface C9515c {

    /* renamed from: com.appodeal.ads.services.c$a */
    public interface C9516a {
        /* renamed from: a */
        Object mo60764a(List<? extends Service<? extends ServiceOptions>> list, Continuation<? super Unit> continuation);
    }

    /* renamed from: a */
    Object mo60760a(InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, C9409q4.C9417h.C9418a aVar, Continuation continuation);

    /* renamed from: a */
    Object mo60761a(RevenueInfo revenueInfo, Continuation<? super Unit> continuation);

    /* renamed from: a */
    Object mo60762a(String str, Map<String, ? extends Object> map, Continuation<? super Unit> continuation);

    ArrayList getServicesData();
}
