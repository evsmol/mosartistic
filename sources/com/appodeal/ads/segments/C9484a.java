package com.appodeal.ads.segments;

import com.appodeal.ads.C9270m;

/* renamed from: com.appodeal.ads.segments.a */
public final /* synthetic */ class C9484a {
    /* renamed from: a */
    public static int m28061a(String str) {
        for (int i : C9270m.m27456b(2)) {
            if (m28062a(i).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static /* synthetic */ String m28062a(int i) {
        if (i == 1) {
            return "AND";
        }
        if (i == 2) {
            return "OR";
        }
        throw null;
    }
}
