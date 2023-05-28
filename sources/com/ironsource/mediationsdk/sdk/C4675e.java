package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.e */
public final class C4675e {

    /* renamed from: a */
    private static C4675e f11701a;

    /* renamed from: b */
    private JSONObject f11702b = new JSONObject();

    private C4675e() {
    }

    /* renamed from: a */
    public static synchronized C4675e m13718a() {
        C4675e eVar;
        synchronized (C4675e.class) {
            if (f11701a == null) {
                f11701a = new C4675e();
            }
            eVar = f11701a;
        }
        return eVar;
    }

    /* renamed from: a */
    public final synchronized String mo34127a(String str) {
        return this.f11702b.optString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo34128a(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.f11702b     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.sdk.C4675e.mo34128a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final synchronized void mo34129a(Map<String, Object> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                mo34128a(next, map.get(next));
            }
        }
    }

    /* renamed from: b */
    public final synchronized JSONObject mo34130b() {
        return this.f11702b;
    }
}
