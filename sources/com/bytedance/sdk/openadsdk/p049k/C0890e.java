package com.bytedance.sdk.openadsdk.p049k;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C0517j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p057b.C1010a;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.k.e */
/* compiled from: TrackAdUrlUtils */
public class C0890e {
    /* renamed from: a */
    private static int m4257a(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i == 5 || i == 15) {
                        return i2;
                    }
                    return -1;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static List<String> m4259a(List<String> list, boolean z) {
        String a = C0517j.m2474a(C0558m.m2663a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a)) {
                next = next.replace("{UID}", a).replace("__UID__", a);
            }
            if (z) {
                next = m4258a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m4258a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static List<String> m4260a(List<String> list, boolean z, C0477n nVar) {
        String a = C0517j.m2474a(C0558m.m2663a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a)) {
                next = next.replace("{UID}", a).replace("__UID__", a);
            }
            if (next.contains("__CID__") && nVar != null && !TextUtils.isEmpty(nVar.mo1345Y())) {
                next = next.replace("__CID__", nVar.mo1345Y());
            }
            if (next.contains("__CTYPE__") && nVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(m4257a(nVar.mo1383ad())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", C1010a.m4777a().mo2932b());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", BuildConfig.ADAPTER_VERSION);
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(C0996u.m4631b()));
            }
            if (z) {
                next = m4258a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
