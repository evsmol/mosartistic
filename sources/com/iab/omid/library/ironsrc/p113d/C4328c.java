package com.iab.omid.library.ironsrc.p113d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C4303a;

/* renamed from: com.iab.omid.library.ironsrc.d.c */
public final class C4328c {
    /* renamed from: a */
    public static void m12296a(String str) {
        if (C4303a.f10262a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m12297a(String str, Exception exc) {
        if ((C4303a.f10262a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
