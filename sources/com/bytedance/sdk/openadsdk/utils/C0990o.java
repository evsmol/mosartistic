package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.utils.o */
/* compiled from: SlotUtils */
public class C0990o {
    /* renamed from: a */
    public static boolean m4587a(C0477n nVar) {
        int e;
        if (nVar == null || (e = C0996u.m4653e(nVar)) == 8 || e == 7 || nVar.mo1327G() == null || Build.VERSION.SDK_INT > 27) {
            return false;
        }
        return true;
    }
}
