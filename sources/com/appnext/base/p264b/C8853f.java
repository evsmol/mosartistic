package com.appnext.base.p264b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import com.appnext.core.C8917f;

/* renamed from: com.appnext.base.b.f */
public class C8853f {
    public static final String TAG = C8853f.class.getSimpleName();

    /* renamed from: e */
    public static NetworkInfo m26678e(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* renamed from: a */
    public static boolean m26677a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    public static String getKey() {
        C8855h.m26688aO();
        return C8855h.m26685J(C8917f.m26931b(C8852e.getContext(), false));
    }
}
