package com.iab.omid.library.amazon.p101d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.amazon.C4146a;

/* renamed from: com.iab.omid.library.amazon.d.c */
public final class C4171c {
    /* renamed from: a */
    public static void m11596a(String str) {
        if (C4146a.f9907a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m11597a(String str, Exception exc) {
        if ((C4146a.f9907a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
