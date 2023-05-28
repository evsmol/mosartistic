package com.explorestack.iab.vast;

import android.text.TextUtils;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.explorestack.iab.vast.c */
public class C1462c {

    /* renamed from: a */
    public static final Map<VastRequest, Boolean> f4531a = new WeakHashMap();

    /* renamed from: a */
    public static synchronized VastRequest m6523a(String str) {
        synchronized (C1462c.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (Map.Entry<VastRequest, Boolean> key : f4531a.entrySet()) {
                VastRequest vastRequest = (VastRequest) key.getKey();
                if (vastRequest.getId().equals(str)) {
                    return vastRequest;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized void m6524b(VastRequest vastRequest) {
        synchronized (C1462c.class) {
            if (vastRequest != null) {
                f4531a.put(vastRequest, Boolean.TRUE);
            }
        }
    }
}
