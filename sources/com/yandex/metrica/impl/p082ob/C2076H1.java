package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.yandex.metrica.C10705b;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.H1 */
public final class C2076H1 {

    /* renamed from: a */
    private static final C3241mn f5478a = new C3241mn();

    /* renamed from: b */
    private static final C2780Zl<Integer, C2080d> f5479b;

    /* renamed from: c */
    private static final C2780Zl<Integer, C2080d> f5480c;

    /* renamed from: d */
    private static final C2780Zl<C2080d, Integer> f5481d = new C2079c(2);

    /* renamed from: com.yandex.metrica.impl.ob.H1$a */
    class C2077a extends C2780Zl<Integer, C2080d> {
        C2077a(C2080d dVar) {
            super(dVar);
            mo17128a(1, C2080d.WIFI);
            mo17128a(0, C2080d.CELL);
            mo17128a(7, C2080d.BLUETOOTH);
            mo17128a(9, C2080d.ETHERNET);
            mo17128a(4, C2080d.MOBILE_DUN);
            mo17128a(5, C2080d.MOBILE_HIPRI);
            mo17128a(2, C2080d.MOBILE_MMS);
            mo17128a(3, C2080d.MOBILE_SUPL);
            mo17128a(6, C2080d.WIMAX);
            if (C1848A2.m6808a(21)) {
                mo17128a(17, C2080d.VPN);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.H1$b */
    class C2078b extends C2780Zl<Integer, C2080d> {
        C2078b(C2080d dVar) {
            super(dVar);
            mo17128a(1, C2080d.WIFI);
            mo17128a(0, C2080d.CELL);
            mo17128a(3, C2080d.ETHERNET);
            mo17128a(2, C2080d.BLUETOOTH);
            mo17128a(4, C2080d.VPN);
            if (C1848A2.m6808a(27)) {
                mo17128a(6, C2080d.LOWPAN);
            }
            if (C1848A2.m6808a(26)) {
                mo17128a(5, C2080d.WIFI_AWARE);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.H1$c */
    class C2079c extends C2780Zl<C2080d, Integer> {
        C2079c(Integer num) {
            super(num);
            mo17128a(C2080d.CELL, 0);
            mo17128a(C2080d.WIFI, 1);
            mo17128a(C2080d.BLUETOOTH, 3);
            mo17128a(C2080d.ETHERNET, 4);
            mo17128a(C2080d.MOBILE_DUN, 5);
            mo17128a(C2080d.MOBILE_HIPRI, 6);
            mo17128a(C2080d.MOBILE_MMS, 7);
            mo17128a(C2080d.MOBILE_SUPL, 8);
            mo17128a(C2080d.VPN, 9);
            mo17128a(C2080d.WIMAX, 10);
            mo17128a(C2080d.LOWPAN, 11);
            mo17128a(C2080d.WIFI_AWARE, 12);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.H1$d */
    public enum C2080d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        C2080d dVar = C2080d.UNDEFINED;
        f5479b = new C2077a(dVar);
        f5480c = new C2078b(dVar);
    }

    /* renamed from: a */
    public static C10705b m7288a(Context context, Point point) {
        float f;
        try {
            f = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return C10705b.PHONE;
        }
        float f2 = (float) point.x;
        float f3 = (float) point.y;
        float min = Math.min(f2 / f, f3 / f);
        float f4 = f * 160.0f;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        if (sqrt >= 15.0d && !f5478a.mo17879a(context, "android.hardware.touchscreen")) {
            return C10705b.TV;
        }
        if (sqrt >= 7.0d || min >= 600.0f) {
            return C10705b.TABLET;
        }
        return C10705b.PHONE;
    }

    /* renamed from: b */
    static C2080d m7294b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C2080d.OFFLINE;
        }
        return f5479b.mo17126a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    /* renamed from: b */
    public static int m7293b(Context context) {
        return f5481d.mo17126a(m7289a(context)).intValue();
    }

    /* renamed from: a */
    public static String m7291a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (C1848A2.m6808a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.metrica.impl.p082ob.C2076H1.C2080d m7289a(android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            com.yandex.metrica.impl.ob.H1$d r0 = com.yandex.metrica.impl.p082ob.C2076H1.C2080d.UNDEFINED
            if (r2 == 0) goto L_0x001e
            r1 = 23
            boolean r1 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r1)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0019
            com.yandex.metrica.impl.ob.H1$d r2 = m7290a((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x001e }
            goto L_0x001f
        L_0x0019:
            com.yandex.metrica.impl.ob.H1$d r2 = m7294b((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2076H1.m7289a(android.content.Context):com.yandex.metrica.impl.ob.H1$d");
    }

    /* renamed from: a */
    static C2080d m7290a(ConnectivityManager connectivityManager) {
        C2080d dVar = C2080d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (m7292a(connectivityManager, activeNetwork)) {
            return C2080d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer next : f5480c.mo17127a()) {
            if (networkCapabilities.hasTransport(next.intValue())) {
                return f5480c.mo17126a(next);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static boolean m7292a(ConnectivityManager connectivityManager, Network network) {
        if (C1848A2.m6808a(29)) {
            return network == null;
        }
        if (network == null) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
        if (networkInfo == null || networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
