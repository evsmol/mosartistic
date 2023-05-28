package com.criteo.publisher.context;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.context.a */
/* compiled from: ConnectionTypeFetcher.kt */
public class C1063a {

    /* renamed from: a */
    private final C1195g f3468a;

    /* renamed from: b */
    private final Context f3469b;

    public C1063a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f3469b = context;
        C1195g b = C1197h.m5407b(C1063a.class);
        Intrinsics.checkExpressionValueIsNotNull(b, "LoggerFactory.getLogger(…nTypeFetcher::class.java)");
        this.f3468a = b;
    }

    /* renamed from: b */
    public C1064a mo3090b() {
        Object systemService = this.f3469b.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            systemService = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager == null) {
            return null;
        }
        try {
            return m4958a(connectivityManager);
        } catch (LinkageError e) {
            this.f3468a.mo3338a("Deprecated way to get connection type is not available, fallback on new API", (Throwable) e);
            return m4960b(connectivityManager);
        }
    }

    /* renamed from: b */
    private C1064a m4960b(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        TelephonyManager telephonyManager = null;
        if (networkCapabilities == null) {
            return null;
        }
        if (mo3092c(networkCapabilities)) {
            return C1064a.WIRED;
        }
        if (mo3091b(networkCapabilities)) {
            return C1064a.WIFI;
        }
        if (!mo3089a(networkCapabilities)) {
            return null;
        }
        Object systemService = this.f3469b.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = systemService;
        }
        return mo3088a(telephonyManager);
    }

    /* renamed from: c */
    public boolean mo3092c(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkParameterIsNotNull(networkCapabilities, "networkCapabilities");
        return networkCapabilities.hasTransport(3);
    }

    /* renamed from: b */
    public boolean mo3091b(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkParameterIsNotNull(networkCapabilities, "networkCapabilities");
        return networkCapabilities.hasTransport(1);
    }

    /* renamed from: a */
    public boolean mo3089a(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkParameterIsNotNull(networkCapabilities, "networkCapabilities");
        return networkCapabilities.hasTransport(0);
    }

    /* renamed from: a */
    private C1064a m4958a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Integer valueOf = activeNetworkInfo != null ? Integer.valueOf(activeNetworkInfo.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 9) {
            return C1064a.WIRED;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return C1064a.WIFI;
        }
        if (valueOf != null && valueOf.intValue() == 0) {
            return m4957a(activeNetworkInfo.getSubtype());
        }
        return null;
    }

    /* renamed from: a */
    public C1064a mo3088a(TelephonyManager telephonyManager) {
        if (telephonyManager == null || !m4959a()) {
            return C1064a.CELLULAR_UNKNOWN;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return m4957a(telephonyManager.getDataNetworkType());
        }
        return m4957a(telephonyManager.getNetworkType());
    }

    /* renamed from: a */
    private boolean m4959a() {
        return ContextCompat.checkSelfPermission(this.f3469b, "android.permission.READ_PHONE_STATE") == 0;
    }

    /* renamed from: a */
    private C1064a m4957a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return C1064a.CELLULAR_2G;
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
                return C1064a.CELLULAR_3G;
            case 13:
            case 18:
            case 19:
                return C1064a.CELLULAR_4G;
            case 20:
                return C1064a.CELLULAR_5G;
            default:
                return C1064a.CELLULAR_UNKNOWN;
        }
    }

    /* renamed from: com.criteo.publisher.context.a$a */
    /* compiled from: ConnectionTypeFetcher.kt */
    public enum C1064a {
        WIRED(1),
        WIFI(2),
        CELLULAR_UNKNOWN(3),
        CELLULAR_2G(4),
        CELLULAR_3G(5),
        CELLULAR_4G(6),
        CELLULAR_5G(7);
        

        /* renamed from: a */
        private final int f3478a;

        private C1064a(int i) {
            this.f3478a = i;
        }

        /* renamed from: a */
        public final int mo3093a() {
            return this.f3478a;
        }
    }
}
