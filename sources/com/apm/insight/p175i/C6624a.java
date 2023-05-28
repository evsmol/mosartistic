package com.apm.insight.p175i;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.apm.insight.i.a */
public class C6624a {

    /* renamed from: a */
    private static volatile UUID f14235a = null;

    /* renamed from: b */
    private static String f14236b = "";

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|(1:9)(6:10|11|(3:14|15|16)(1:18)|17|19|20))|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|(3:14|15|16)(1:18)|17|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C6624a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.UUID r0 = f14235a
            if (r0 != 0) goto L_0x0052
            java.lang.Class<com.apm.insight.i.a> r0 = com.apm.insight.p175i.C6624a.class
            monitor-enter(r0)
            java.util.UUID r1 = f14235a     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004d
            com.apm.insight.runtime.s r1 = com.apm.insight.runtime.C6766s.m17031a()     // Catch:{ all -> 0x004f }
            r2 = 0
            java.lang.String r1 = r1.mo52314a((java.lang.String) r2)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0020
            java.util.UUID r4 = java.util.UUID.fromString(r1)     // Catch:{ all -> 0x004f }
            f14235a = r4     // Catch:{ all -> 0x004f }
            goto L_0x004d
        L_0x0020:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r4, r1)     // Catch:{ all -> 0x002b }
            goto L_0x002c
        L_0x002b:
        L_0x002c:
            if (r2 == 0) goto L_0x003b
            java.lang.String r4 = "utf8"
            byte[] r4 = r2.getBytes(r4)     // Catch:{ all -> 0x0040 }
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)     // Catch:{ all -> 0x0040 }
        L_0x0038:
            f14235a = r4     // Catch:{ all -> 0x0040 }
            goto L_0x0040
        L_0x003b:
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0040 }
            goto L_0x0038
        L_0x0040:
            com.apm.insight.runtime.s r4 = com.apm.insight.runtime.C6766s.m17031a()     // Catch:{ all -> 0x004d }
            java.util.UUID r1 = f14235a     // Catch:{ all -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004d }
            r4.mo52320c((java.lang.String) r1)     // Catch:{ all -> 0x004d }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0052
        L_0x004f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r4
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p175i.C6624a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static synchronized String m16344a(Context context) {
        String str;
        UUID a;
        synchronized (C6624a.class) {
            if (TextUtils.isEmpty(f14236b) && (a = new C6624a(context).mo52112a()) != null) {
                f14236b = a.toString();
            }
            str = f14236b;
        }
        return str;
    }

    /* renamed from: a */
    public UUID mo52112a() {
        return f14235a;
    }
}
