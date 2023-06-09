package com.bytedance.sdk.component.p323e.p327d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: com.bytedance.sdk.component.e.d.e */
/* compiled from: NetworkUtils */
public class C10603e {
    /* renamed from: a */
    public static boolean m31129a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            Log.e("ignored", th.toString());
        }
        return false;
    }
}
