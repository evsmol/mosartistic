package com.bytedance.mobsec.metasec.p292ov;

import android.content.Context;
import p152ms.p153bd.p154o.Pgl.C5662l0;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSManagerUtils */
public final class PglMSManagerUtils {
    private PglMSManagerUtils() {
    }

    public static synchronized PglMSManager get(String str) {
        PglMSManager pglMSManager;
        synchronized (PglMSManagerUtils.class) {
            C5662l0.pgla a = C5662l0.m14579a(str);
            pglMSManager = a != null ? new PglMSManager(a) : null;
        }
        return pglMSManager;
    }

    public static synchronized boolean init(Context context, PglMSConfig pglMSConfig) {
        boolean a;
        synchronized (PglMSManagerUtils.class) {
            a = C5662l0.m14580a(context, pglMSConfig.mo62995a(), "Pglmetasec_ov", "ms_sensor_ov");
        }
        return a;
    }

    public static String versionInfo() {
        return C5662l0.m14578a();
    }
}
