package com.apm.insight.runtime;

import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.appodeal.ads.modules.common.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.apm.insight.runtime.b */
public class C6737b {

    /* renamed from: a */
    private static long f14472a = -30000;

    /* renamed from: b */
    private static File f14473b;

    /* renamed from: a */
    public static String m16910a(long j, String str) {
        try {
            String j2 = C6685o.m16615j(C6617h.m16313g());
            return C6675i.m16539c(new File(j2, "apminsight/TrackInfo/" + ((j - (j % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* renamed from: a */
    public static void m16911a() {
        File file = new File(C6685o.m16615j(C6617h.m16313g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                C6675i.m16532a(new File(file, list[i]));
            }
        }
    }

    /* renamed from: a */
    public static void m16912a(long j) {
        if (j - f14472a >= 30000) {
            f14472a = j;
            try {
                C6675i.m16524a(m16913b(), String.valueOf(System.currentTimeMillis()), false);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    private static File m16913b() {
        if (f14473b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String j = C6685o.m16615j(C6617h.m16313g());
            f14473b = new File(j, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY) + "/" + C6617h.m16312f());
        }
        return f14473b;
    }
}
