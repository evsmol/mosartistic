package com.apm.insight.p177k;

import android.content.Context;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.runtime.C6761p;

/* renamed from: com.apm.insight.k.i */
public final class C6656i implements Runnable {

    /* renamed from: a */
    private Context f14325a;

    private C6656i(Context context) {
        this.f14325a = context;
    }

    /* renamed from: a */
    public static void m16449a(Context context) {
        m16450a(context, 0);
    }

    /* renamed from: a */
    public static void m16450a(Context context, int i) {
        C6761p.m17019b().mo52328a((Runnable) new C6656i(context), (long) i);
    }

    /* renamed from: a */
    public static boolean m16451a() {
        return C6635b.m16372a().mo52124c() || !C6662a.m16479b(C6617h.m16313g());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|(1:5)(1:6)|7|(1:21)|14|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.apm.insight.p178l.C6688q.m16632b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        com.apm.insight.runtime.C6766s.m17031a().mo52316a(com.apm.insight.C6617h.m16297a().mo52291b(), com.apm.insight.entity.C6595b.m16208b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (com.apm.insight.runtime.C6761p.m17019b().mo52325a() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        com.apm.insight.runtime.C6766s.m17031a().mo52316a(com.apm.insight.C6617h.m16297a().mo52291b(), com.apm.insight.entity.C6595b.m16208b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
        if (com.apm.insight.runtime.C6761p.m17019b().mo52325a() != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        com.apm.insight.p176j.C6632d.m16360a(com.apm.insight.runtime.C6761p.m17019b().mo52325a(), r4.f14325a).mo52120a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015 A[Catch:{ all -> 0x0044, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023 A[Catch:{ all -> 0x0044, all -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            android.content.Context r0 = r4.f14325a     // Catch:{ all -> 0x000d }
            com.apm.insight.b.g r0 = com.apm.insight.p166b.C6564g.m16054a(r0)     // Catch:{ all -> 0x000d }
            com.apm.insight.b.b r0 = r0.mo51997a()     // Catch:{ all -> 0x000d }
            r0.mo51987f()     // Catch:{ all -> 0x000d }
        L_0x000d:
            android.content.Context r0 = r4.f14325a     // Catch:{ all -> 0x0044 }
            boolean r0 = com.apm.insight.p178l.C6662a.m16479b(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0023
            com.apm.insight.k.b r0 = com.apm.insight.p177k.C6635b.m16372a()     // Catch:{ all -> 0x0044 }
            android.content.Context r1 = r4.f14325a     // Catch:{ all -> 0x0044 }
            boolean r1 = com.apm.insight.p178l.C6686p.m16623b(r1)     // Catch:{ all -> 0x0044 }
            r0.mo52122a((boolean) r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0026
        L_0x0023:
            com.apm.insight.nativecrash.NativeImpl.m16727i()     // Catch:{ all -> 0x0044 }
        L_0x0026:
            com.apm.insight.runtime.s r0 = com.apm.insight.runtime.C6766s.m17031a()
            com.apm.insight.runtime.d r1 = com.apm.insight.C6617h.m16297a()
            java.util.Map r1 = r1.mo52291b()
            org.json.JSONArray r2 = com.apm.insight.entity.C6595b.m16208b()
            r0.mo52316a((java.util.Map<java.lang.String, java.lang.Object>) r1, (org.json.JSONArray) r2)
            com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C6761p.m17019b()
            android.os.Handler r0 = r0.mo52325a()
            if (r0 == 0) goto L_0x0076
            goto L_0x0065
        L_0x0044:
            r0 = move-exception
            com.apm.insight.p178l.C6688q.m16632b((java.lang.Throwable) r0)     // Catch:{ all -> 0x0077 }
            com.apm.insight.runtime.s r0 = com.apm.insight.runtime.C6766s.m17031a()
            com.apm.insight.runtime.d r1 = com.apm.insight.C6617h.m16297a()
            java.util.Map r1 = r1.mo52291b()
            org.json.JSONArray r2 = com.apm.insight.entity.C6595b.m16208b()
            r0.mo52316a((java.util.Map<java.lang.String, java.lang.Object>) r1, (org.json.JSONArray) r2)
            com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C6761p.m17019b()
            android.os.Handler r0 = r0.mo52325a()
            if (r0 == 0) goto L_0x0076
        L_0x0065:
            com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C6761p.m17019b()
            android.os.Handler r0 = r0.mo52325a()
            android.content.Context r1 = r4.f14325a
            com.apm.insight.j.d r0 = com.apm.insight.p176j.C6632d.m16360a(r0, r1)
            r0.mo52120a()
        L_0x0076:
            return
        L_0x0077:
            r0 = move-exception
            com.apm.insight.runtime.s r1 = com.apm.insight.runtime.C6766s.m17031a()
            com.apm.insight.runtime.d r2 = com.apm.insight.C6617h.m16297a()
            java.util.Map r2 = r2.mo52291b()
            org.json.JSONArray r3 = com.apm.insight.entity.C6595b.m16208b()
            r1.mo52316a((java.util.Map<java.lang.String, java.lang.Object>) r2, (org.json.JSONArray) r3)
            com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C6761p.m17019b()
            android.os.Handler r1 = r1.mo52325a()
            if (r1 == 0) goto L_0x00a6
            com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C6761p.m17019b()
            android.os.Handler r1 = r1.mo52325a()
            android.content.Context r2 = r4.f14325a
            com.apm.insight.j.d r1 = com.apm.insight.p176j.C6632d.m16360a(r1, r2)
            r1.mo52120a()
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6656i.run():void");
    }
}
