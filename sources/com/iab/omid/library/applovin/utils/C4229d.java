package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C4196a;

/* renamed from: com.iab.omid.library.applovin.utils.d */
public final class C4229d {
    /* renamed from: a */
    public static void m11873a(String str) {
        if (C4196a.f10024a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m11874a(String str, Exception exc) {
        if ((C4196a.f10024a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
