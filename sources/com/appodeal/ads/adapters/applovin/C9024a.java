package com.appodeal.ads.adapters.applovin;

import com.applovin.sdk.AppLovinAd;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.appodeal.ads.adapters.applovin.a */
public final class C9024a {

    /* renamed from: a */
    public static final Object f22820a = new Object();

    /* renamed from: b */
    public static final HashMap f22821b = new HashMap();

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static AppLovinAd m27129a(String str) {
        AppLovinAd appLovinAd;
        synchronized (f22820a) {
            Queue queue = (Queue) f22821b.get(str);
            appLovinAd = (queue == null || queue.isEmpty()) ? null : (AppLovinAd) queue.poll();
        }
        return appLovinAd;
    }

    /* renamed from: a */
    public static void m27130a(AppLovinAd appLovinAd) {
        synchronized (f22820a) {
            HashMap hashMap = f22821b;
            Queue queue = (Queue) hashMap.get(appLovinAd.getZoneId());
            if (queue == null) {
                queue = new LinkedList();
                hashMap.put(appLovinAd.getZoneId(), queue);
            }
            queue.offer(appLovinAd);
        }
    }
}
