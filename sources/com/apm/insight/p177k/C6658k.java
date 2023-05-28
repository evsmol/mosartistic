package com.apm.insight.p177k;

import android.util.Log;
import com.apm.insight.C6617h;
import com.apm.insight.entity.C6595b;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.C6718a;
import com.apm.insight.runtime.C6741e;
import com.apm.insight.runtime.C6761p;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.k.k */
public class C6658k {

    /* renamed from: a */
    private static File f14332a = null;

    /* renamed from: b */
    private static boolean f14333b = false;

    /* renamed from: c */
    private static boolean f14334c = false;

    /* renamed from: d */
    private static String f14335d = "exception_modules";

    /* renamed from: e */
    private static String f14336e = "npth";

    /* renamed from: f */
    private static Map<String, String> f14337f;

    /* renamed from: a */
    public static void m16457a(String str) {
        if (f14337f == null) {
            f14337f = new HashMap();
        }
        f14337f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16458a(boolean r2, org.json.JSONArray r3) {
        /*
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0013 }
            android.content.Context r0 = com.apm.insight.C6617h.m16313g()     // Catch:{ IOException -> 0x0013 }
            java.lang.String r0 = com.apm.insight.p178l.C6685o.m16615j((android.content.Context) r0)     // Catch:{ IOException -> 0x0013 }
            java.lang.String r1 = "apminsight/configCrash/configFile"
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x0013 }
            r0 = 0
            com.apm.insight.p178l.C6675i.m16526a((java.io.File) r2, (org.json.JSONArray) r3, (boolean) r0)     // Catch:{ IOException -> 0x0013 }
        L_0x0013:
            java.io.File r2 = m16465f()     // Catch:{ all -> 0x001c }
            java.util.Map<java.lang.String, java.lang.String> r3 = f14337f     // Catch:{ all -> 0x001c }
            com.apm.insight.p178l.C6675i.m16525a((java.io.File) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x001c }
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6658k.m16458a(boolean, org.json.JSONArray):void");
    }

    /* renamed from: a */
    static boolean m16459a() {
        return f14333b;
    }

    /* renamed from: a */
    static boolean m16460a(boolean z) {
        try {
            Map<String, String> e = f14337f == null ? C6675i.m16545e(m16465f()) : f14337f;
            f14337f = e;
            if (e == null) {
                f14337f = new HashMap();
                return true;
            } else if (e.size() < C6595b.m16209c()) {
                return true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z2 = false;
                for (Map.Entry next : f14337f.entrySet()) {
                    if (currentTimeMillis - Long.decode((String) next.getValue()).longValue() > C6741e.m16936e((String) next.getKey())) {
                        z2 = true;
                    }
                }
                C6688q.m16625a((Object) z2 ? "config should be updated" : "config should not be updated");
                return z2;
            }
        } catch (Throwable th) {
            Log.e("npth", "err", th);
            return true;
        }
    }

    /* renamed from: b */
    static boolean m16461b() {
        return f14334c;
    }

    /* renamed from: c */
    static void m16462c() {
        if (!f14333b) {
            f14334c = true;
            File file = new File(C6685o.m16615j(C6617h.m16313g()), "apminsight/configCrash/configFile");
            if (file.exists()) {
                try {
                    C6718a.m16794a(new JSONArray(C6675i.m16539c(file)), false);
                    f14333b = true;
                } catch (Throwable unused) {
                    C6718a.m16794a((JSONArray) null, false);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m16463d() {
        m16462c();
        if (m16460a(false)) {
            C6633a.m16362a();
        }
    }

    /* renamed from: e */
    public static void m16464e() {
        C6761p.m17019b().mo52327a((Runnable) new Runnable() {
            public void run() {
                if (C6658k.m16460a(false)) {
                    C6633a.m16362a();
                }
            }
        });
    }

    /* renamed from: f */
    private static File m16465f() {
        if (f14332a == null) {
            f14332a = new File(C6685o.m16615j(C6617h.m16313g()), "apminsight/configCrash/configInvalid");
        }
        return f14332a;
    }
}
