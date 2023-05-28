package com.yandex.metrica.impl.p082ob;

import com.appodeal.ads.AppodealNetworks;
import com.yandex.metrica.impl.p082ob.C3504tb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ib */
public class C2116Ib {

    /* renamed from: a */
    public static final Map<String, C3504tb.C3505a> f5555a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("google", C3504tb.C3505a.GOOGLE);
        hashMap.put("huawei", C3504tb.C3505a.HMS);
        hashMap.put(AppodealNetworks.YANDEX, C3504tb.C3505a.YANDEX);
        f5555a = Collections.unmodifiableMap(hashMap);
    }
}
