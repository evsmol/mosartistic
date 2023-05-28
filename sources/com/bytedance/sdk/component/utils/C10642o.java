package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.utils.o */
/* compiled from: NetworkUtils */
public class C10642o {

    /* renamed from: a */
    private static C10643p f26528a;

    /* renamed from: a */
    public static boolean m31257a(Context context) {
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
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static int m31259b(Context context) {
        int c = m31260c(context);
        if (c == 1) {
            return 0;
        }
        if (c == 4) {
            return 1;
        }
        if (c == 5) {
            return 4;
        }
        if (c != 6) {
            return c;
        }
        return 6;
    }

    /* renamed from: c */
    public static int m31260c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        if (f26528a == null || !f26528a.mo64270a(context, telephonyManager)) {
                            return 5;
                        }
                        return 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        if (TextUtils.isEmpty(subtypeName) || (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000"))) {
                            return 1;
                        }
                        return 3;
                }
            } else if (type != 1) {
                return 1;
            } else {
                return 4;
            }
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: d */
    public static boolean m31261d(Context context) {
        return m31260c(context) == 4;
    }

    /* renamed from: e */
    public static boolean m31262e(Context context) {
        return m31260c(context) == 5;
    }

    /* renamed from: f */
    public static boolean m31263f(Context context) {
        return m31260c(context) == 6;
    }

    /* renamed from: g */
    public static String m31264g(Context context) {
        int c = m31260c(context);
        if (c == 2) {
            return "2g";
        }
        if (c == 3) {
            return "3g";
        }
        if (c == 4) {
            return "wifi";
        }
        if (c != 5) {
            return c != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    /* renamed from: a */
    public static boolean m31258a(String str) {
        return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
    }
}
