package com.iab.omid.library.appodeal.p107d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.appodeal.C4253a;

/* renamed from: com.iab.omid.library.appodeal.d.c */
public final class C4278c {
    /* renamed from: a */
    public static void m12075a(String str) {
        if (C4253a.f10149a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m12076a(String str, Exception exc) {
        if ((C4253a.f10149a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
