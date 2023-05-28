package com.iab.omid.library.adcolony.p095d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.adcolony.C4096a;

/* renamed from: com.iab.omid.library.adcolony.d.c */
public final class C4121c {
    /* renamed from: a */
    public static void m11366a(String str) {
        if (C4096a.f9790a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m11367a(String str, Exception exc) {
        if ((C4096a.f9790a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
