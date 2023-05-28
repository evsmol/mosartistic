package com.bytedance.sdk.openadsdk.p042h.p045c;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.b */
/* compiled from: LogStatsCache */
public class C0817b {

    /* renamed from: a */
    private static volatile C0817b f3015a;

    /* renamed from: b */
    private Context f3016b;

    /* renamed from: c */
    private AtomicBoolean f3017c = new AtomicBoolean(false);

    /* renamed from: a */
    public static C0817b m4026a() {
        if (f3015a == null) {
            synchronized (C0817b.class) {
                if (f3015a == null) {
                    f3015a = new C0817b();
                }
            }
        }
        return f3015a;
    }

    private C0817b() {
        mo2625b();
    }

    /* renamed from: b */
    public void mo2625b() {
        if (!this.f3017c.get() && C0558m.m2663a() != null) {
            this.f3016b = C0558m.m2663a();
            this.f3017c.set(true);
        }
    }

    /* renamed from: c */
    public synchronized void mo2626c() {
        if (!this.f3017c.get()) {
            mo2625b();
            return;
        }
        try {
            C0895a.m4282a(this.f3016b, "logstats", "retry >=?", new String[]{String.valueOf(5)});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|27|26|10|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e A[Catch:{ all -> 0x0065 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.bytedance.sdk.openadsdk.p042h.p045c.C0818c.C0821a> mo2627d() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f3017c     // Catch:{ all -> 0x006a }
            boolean r1 = r1.get()     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0013
            r10.mo2625b()     // Catch:{ all -> 0x006a }
            monitor-exit(r10)
            return r0
        L_0x0013:
            com.bytedance.sdk.openadsdk.multipro.aidl.c r1 = new com.bytedance.sdk.openadsdk.multipro.aidl.c     // Catch:{ all -> 0x006a }
            android.content.Context r2 = r10.f3016b     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "logstats"
            java.lang.String r4 = "id"
            java.lang.String r5 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "retry <?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x006a }
            r7 = 0
            r8 = 5
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x006a }
            r6[r7] = r8     // Catch:{ all -> 0x006a }
            r7 = 0
            r8 = 0
            r9 = 0
            java.util.Map r2 = com.bytedance.sdk.openadsdk.multipro.p050a.C0895a.m4285a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006a }
            r1.<init>(r2)     // Catch:{ all -> 0x006a }
        L_0x0038:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "value"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x0065 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0038 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0038 }
            com.bytedance.sdk.openadsdk.h.c.c$a r3 = new com.bytedance.sdk.openadsdk.h.c.c$a     // Catch:{ Exception -> 0x0038 }
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0038 }
            r0.add(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0038
        L_0x0060:
            r1.close()     // Catch:{ all -> 0x006a }
            monitor-exit(r10)
            return r0
        L_0x0065:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p042h.p045c.C0817b.mo2627d():java.util.List");
    }
}
