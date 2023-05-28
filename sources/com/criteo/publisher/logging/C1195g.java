package com.criteo.publisher.logging;

import com.criteo.publisher.p065g0.C1134a;
import java.util.List;

/* renamed from: com.criteo.publisher.logging.g */
/* compiled from: Logger */
public class C1195g {

    /* renamed from: c */
    private static final String f3750c = C1194f.m5402a("Logger");

    /* renamed from: d */
    private static final ThreadLocal<Integer> f3751d = new C1196a();

    /* renamed from: a */
    private final String f3752a;

    /* renamed from: b */
    private final List<C1134a<C1192d>> f3753b;

    /* renamed from: com.criteo.publisher.logging.g$a */
    /* compiled from: Logger */
    class C1196a extends ThreadLocal<Integer> {
        C1196a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer initialValue() {
            return 0;
        }
    }

    public C1195g(Class<?> cls, List<C1134a<C1192d>> list) {
        this(cls.getSimpleName(), list);
    }

    C1195g(String str, List<C1134a<C1192d>> list) {
        this.f3752a = str;
        this.f3753b = list;
    }

    /* renamed from: a */
    public void mo3338a(String str, Throwable th) {
        mo3337a(new C1193e(3, str, th, (String) null));
    }

    /* renamed from: a */
    public void mo3339a(String str, Object... objArr) {
        mo3337a(new C1193e(3, String.format(str, objArr), (Throwable) null, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r0 != 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        f3751d.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        f3751d.set(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0 == 0) goto L_0x0056;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3337a(com.criteo.publisher.logging.C1193e r8) {
        /*
            r7 = this;
            java.lang.ThreadLocal<java.lang.Integer> r0 = f3751d
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 <= r1) goto L_0x0010
            return
        L_0x0010:
            java.util.List<com.criteo.publisher.g0.a<com.criteo.publisher.logging.d>> r1 = r7.f3753b
            java.util.Iterator r1 = r1.iterator()
        L_0x0016:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r1.next()
            com.criteo.publisher.g0.a r2 = (com.criteo.publisher.p065g0.C1134a) r2
            java.lang.ThreadLocal<java.lang.Integer> r3 = f3751d
            int r4 = r0 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.set(r4)
            java.lang.Object r3 = r2.mo3228a()     // Catch:{ Exception -> 0x003d }
            com.criteo.publisher.logging.d r3 = (com.criteo.publisher.logging.C1192d) r3     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = r7.f3752a     // Catch:{ Exception -> 0x003d }
            r3.mo3328a(r4, r8)     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x005c
            goto L_0x0056
        L_0x003b:
            r8 = move-exception
            goto L_0x0066
        L_0x003d:
            r3 = move-exception
            java.lang.String r4 = f3750c     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r5.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r6 = "Impossible to log with handler: "
            r5.append(r6)     // Catch:{ all -> 0x003b }
            r5.append(r2)     // Catch:{ all -> 0x003b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x003b }
            android.util.Log.w(r4, r2, r3)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x005c
        L_0x0056:
            java.lang.ThreadLocal<java.lang.Integer> r2 = f3751d
            r2.remove()
            goto L_0x0016
        L_0x005c:
            java.lang.ThreadLocal<java.lang.Integer> r2 = f3751d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.set(r3)
            goto L_0x0016
        L_0x0066:
            if (r0 != 0) goto L_0x006e
            java.lang.ThreadLocal<java.lang.Integer> r0 = f3751d
            r0.remove()
            goto L_0x0077
        L_0x006e:
            java.lang.ThreadLocal<java.lang.Integer> r1 = f3751d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.set(r0)
        L_0x0077:
            throw r8
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.logging.C1195g.mo3337a(com.criteo.publisher.logging.e):void");
    }
}
