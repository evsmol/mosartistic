package com.apm.insight.p177k;

import com.apm.insight.C6617h;
import com.apm.insight.entity.C6595b;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6686p;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.C6770u;
import java.util.Map;

/* renamed from: com.apm.insight.k.a */
public class C6633a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Runnable f14254a = new Runnable() {
        public void run() {
            long j;
            Runnable runnable;
            C6770u uVar;
            if (C6686p.m16623b(C6617h.m16313g())) {
                C6633a.m16370i();
            }
            if (C6633a.f14255b > 0) {
                if (C6662a.m16479b(C6617h.m16313g())) {
                    uVar = C6761p.m17019b();
                    runnable = C6633a.f14254a;
                    j = 15000;
                } else {
                    uVar = C6761p.m17019b();
                    runnable = C6633a.f14254a;
                    j = 60000;
                }
                uVar.mo52328a(runnable, j);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f14255b = 0;

    /* renamed from: a */
    public static void m16362a() {
        f14255b = 40;
        C6761p.m17019b().mo52327a(f14254a);
    }

    /* renamed from: b */
    public static void m16363b() {
        if (!C6658k.m16461b()) {
            C6658k.m16462c();
        }
        if (C6686p.m16623b(C6617h.m16313g()) && C6658k.m16460a(false)) {
            m16370i();
        }
    }

    /* renamed from: c */
    public static boolean m16364c() {
        return false;
    }

    /* renamed from: d */
    public static void m16365d() {
    }

    /* renamed from: h */
    private static byte[] m16369h() {
        try {
            return C6647e.m16419a(C6617h.m16315i().getConfigUrl(), (Map<String, String>) null, C6595b.m16199a().toString().getBytes());
        } catch (Throwable th) {
            C6688q.m16630a(th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (com.apm.insight.p177k.C6658k.m16459a() != false) goto L_0x0054;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m16370i() {
        /*
            java.lang.Class<com.apm.insight.k.a> r0 = com.apm.insight.p177k.C6633a.class
            monitor-enter(r0)
            int r1 = f14255b     // Catch:{ all -> 0x006a }
            r2 = 1
            if (r1 <= 0) goto L_0x000d
            int r1 = f14255b     // Catch:{ all -> 0x006a }
            int r1 = r1 - r2
            f14255b = r1     // Catch:{ all -> 0x006a }
        L_0x000d:
            java.lang.String r1 = "try fetchApmConfig"
            com.apm.insight.p178l.C6688q.m16625a((java.lang.Object) r1)     // Catch:{ all -> 0x006a }
            android.content.Context r1 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x006a }
            boolean r1 = com.apm.insight.p178l.C6662a.m16479b(r1)     // Catch:{ all -> 0x006a }
            r3 = 0
            if (r1 == 0) goto L_0x005e
            r1 = 0
            byte[] r4 = m16369h()     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x003b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0035 }
            r6.<init>(r4)     // Catch:{ all -> 0x0035 }
            r5.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "data"
            org.json.JSONArray r1 = r5.optJSONArray(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = "npth"
            com.apm.insight.p178l.C6688q.m16629a((java.lang.String) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x006a }
        L_0x003b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r4.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "after fetchApmConfig net "
            r4.append(r5)     // Catch:{ all -> 0x006a }
            r4.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006a }
            com.apm.insight.p178l.C6688q.m16625a((java.lang.Object) r4)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0057
            com.apm.insight.runtime.C6718a.m16794a((org.json.JSONArray) r1, (boolean) r2)     // Catch:{ all -> 0x006a }
        L_0x0054:
            f14255b = r3     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0057:
            int r1 = f14255b     // Catch:{ all -> 0x006a }
            int r1 = r1 + -10
            f14255b = r1     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x005e:
            com.apm.insight.p177k.C6658k.m16462c()     // Catch:{ all -> 0x006a }
            boolean r1 = com.apm.insight.p177k.C6658k.m16459a()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            goto L_0x0054
        L_0x0068:
            monitor-exit(r0)
            return
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6633a.m16370i():void");
    }
}
