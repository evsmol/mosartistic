package com.bytedance.sdk.component.adexpress.p294a.p296b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a;
import com.bytedance.sdk.component.utils.C10626e;
import java.io.File;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.e */
/* compiled from: Version */
public class C10276e {

    /* renamed from: a */
    private static C10277a f25375a;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[SYNTHETIC, Splitter:B:27:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29540a() {
        /*
            java.lang.String r0 = "Version"
            r1 = 0
            java.io.File r2 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b.m29508f()     // Catch:{ all -> 0x0077 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "temp_pkg_info.json"
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0077 }
            long r4 = r3.length()     // Catch:{ all -> 0x0077 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0077 }
            long r4 = r2.longValue()     // Catch:{ all -> 0x0077 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x006c
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r3.isFile()     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x006c
            int r2 = r2.intValue()     // Catch:{ all -> 0x0077 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0077 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0077 }
            r4.<init>(r3)     // Catch:{ all -> 0x0077 }
            r4.read(r2)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "utf-8"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x006a }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x006a }
            r2.<init>(r1)     // Catch:{ all -> 0x006a }
            com.bytedance.sdk.component.adexpress.a.c.a r1 = com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.m29546a((org.json.JSONObject) r2)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            f25375a = r1     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r1.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "old version read success: "
            r1.append(r2)     // Catch:{ all -> 0x006a }
            com.bytedance.sdk.component.adexpress.a.c.a r2 = f25375a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = r2.mo63124b()     // Catch:{ all -> 0x006a }
            r1.append(r2)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x006a }
        L_0x0068:
            r1 = r4
            goto L_0x0071
        L_0x006a:
            r1 = move-exception
            goto L_0x007a
        L_0x006c:
            java.lang.String r2 = "version pkg json file does not exist"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r1 == 0) goto L_0x0084
            r1.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0084
        L_0x0077:
            r2 = move-exception
            r4 = r1
            r1 = r2
        L_0x007a:
            java.lang.String r2 = "version init error"
            com.bytedance.sdk.component.utils.C10638l.m31239c(r0, r2, r1)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0084
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return
        L_0x0085:
            r0 = move-exception
            if (r4 == 0) goto L_0x008b
            r4.close()     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29540a():void");
    }

    /* renamed from: b */
    public static synchronized C10277a m29542b() {
        C10277a aVar;
        synchronized (C10276e.class) {
            aVar = f25375a;
        }
        return aVar;
    }

    /* renamed from: a */
    public static synchronized void m29541a(C10277a aVar) {
        synchronized (C10276e.class) {
            if (aVar != null) {
                if (aVar.mo63131f()) {
                    f25375a = aVar;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC, Splitter:B:29:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29544c() {
        /*
            com.bytedance.sdk.component.adexpress.a.c.a r0 = f25375a
            java.lang.String r1 = "Version"
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "version save error1"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)
            return
        L_0x000c:
            java.lang.String r0 = r0.mo63132g()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "version save error2"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)
            return
        L_0x001c:
            java.io.File r2 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b.m29508f()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "temp_pkg_info.json"
            r3.<init>(r2, r4)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = ".tmp"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x0046
            r2.delete()
        L_0x0046:
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0068 }
            r5.<init>(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "utf-8"
            byte[] r0 = r0.getBytes(r4)     // Catch:{ all -> 0x0065 }
            r5.write(r0)     // Catch:{ all -> 0x0065 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005e
            r3.delete()     // Catch:{ all -> 0x0065 }
        L_0x005e:
            r2.renameTo(r3)     // Catch:{ all -> 0x0065 }
            r5.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0073
        L_0x0065:
            r0 = move-exception
            r4 = r5
            goto L_0x0069
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            java.lang.String r2 = "version save error3"
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r2, r0)     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0073
            r4.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            return
        L_0x0074:
            r0 = move-exception
            if (r4 == 0) goto L_0x007a
            r4.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29544c():void");
    }

    /* renamed from: a */
    public static C10277a.C10278a m29539a(String str) {
        if (!TextUtils.isEmpty(str) && m29542b() != null && m29542b().mo63130e() != null && m29542b().mo63131f()) {
            for (C10277a.C10278a next : m29542b().mo63130e()) {
                if (next.mo63133a() != null && next.mo63133a().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m29543b(String str) {
        try {
            if (m29542b() != null) {
                if (!TextUtils.isEmpty(m29542b().mo63124b())) {
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    String b = m29542b().mo63124b();
                    String[] split = str.split("\\.");
                    String[] split2 = b.split("\\.");
                    int min = Math.min(split.length, split2.length);
                    int i = 0;
                    while (i < min) {
                        int length = split[i].length() - split2[i].length();
                        if (length == 0) {
                            int compareTo = split[i].compareTo(split2[i]);
                            if (compareTo > 0) {
                                return true;
                            }
                            if (compareTo < 0) {
                                return false;
                            }
                            if (i != min - 1) {
                                i++;
                            } else if (split.length > split2.length) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (length > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static void m29545d() {
        C10277a b = m29542b();
        if (b != null) {
            File f = C10268b.m29508f();
            try {
                new File(f, "temp_pkg_info.json").delete();
            } catch (Throwable unused) {
            }
            if (b.mo63130e() != null) {
                for (C10277a.C10278a a : b.mo63130e()) {
                    try {
                        new File(f, C10626e.m31201a(a.mo63133a())).delete();
                    } catch (Throwable unused2) {
                    }
                }
            }
            f25375a = null;
        }
    }
}
