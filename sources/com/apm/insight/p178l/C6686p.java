package com.apm.insight.p178l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.insight.p177k.C6647e;

/* renamed from: com.apm.insight.l.p */
public final class C6686p {

    /* renamed from: com.apm.insight.l.p$1 */
    static /* synthetic */ class C66871 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.apm.insight.k.e$b[] r0 = com.apm.insight.p177k.C6647e.C6649b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14371a = r0
                com.apm.insight.k.e$b r1 = com.apm.insight.p177k.C6647e.C6649b.WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14371a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.k.e$b r1 = com.apm.insight.p177k.C6647e.C6649b.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14371a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.k.e$b r1 = com.apm.insight.p177k.C6647e.C6649b.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14371a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.apm.insight.k.e$b r1 = com.apm.insight.p177k.C6647e.C6649b.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14371a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.apm.insight.k.e$b r1 = com.apm.insight.p177k.C6647e.C6649b.MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14371a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.apm.insight.k.e$b r1 = com.apm.insight.p177k.C6647e.C6649b.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p178l.C6686p.C66871.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m16621a(Context context) {
        return m16622a(m16624c(context));
    }

    /* renamed from: a */
    public static String m16622a(C6647e.C6649b bVar) {
        String str;
        try {
            switch (C66871.f14371a[bVar.ordinal()]) {
                case 1:
                    str = "wifi";
                    break;
                case 2:
                    str = "2g";
                    break;
                case 3:
                    str = "3g";
                    break;
                case 4:
                    str = "4g";
                    break;
                case 5:
                    str = "mobile";
                    break;
                case 6:
                    str = "5g";
                    break;
                default:
                    return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16623b(android.content.Context r2) {
        /*
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch:{ Exception -> 0x0019 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Exception -> 0x0019 }
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0019 }
            if (r2 == 0) goto L_0x0019
            boolean r2 = r2.isAvailable()     // Catch:{ Exception -> 0x0019 }
            if (r2 == 0) goto L_0x0019
            r0 = 1
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p178l.C6686p.m16623b(android.content.Context):boolean");
    }

    /* renamed from: c */
    private static C6647e.C6649b m16624c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return C6647e.C6649b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return C6647e.C6649b.WIFI;
                    }
                    if (type != 0) {
                        return C6647e.C6649b.MOBILE;
                    }
                    int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    if (networkType != 3) {
                        if (networkType == 20) {
                            return C6647e.C6649b.MOBILE_5G;
                        }
                        if (!(networkType == 5 || networkType == 6)) {
                            switch (networkType) {
                                case 8:
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (networkType) {
                                        case 12:
                                        case 14:
                                        case 15:
                                            break;
                                        case 13:
                                            return C6647e.C6649b.MOBILE_4G;
                                        default:
                                            return C6647e.C6649b.MOBILE;
                                    }
                            }
                        }
                    }
                    return C6647e.C6649b.MOBILE_3G;
                }
            }
            return C6647e.C6649b.NONE;
        } catch (Throwable unused) {
            return C6647e.C6649b.MOBILE;
        }
    }
}
