package com.bytedance.sdk.openadsdk.p037d;

import android.content.Context;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import com.bytedance.sdk.component.p313d.C10492b;
import com.bytedance.sdk.component.p313d.C10540d;
import com.bytedance.sdk.component.p313d.C10556e;
import com.bytedance.sdk.component.p313d.C10560i;
import com.bytedance.sdk.component.p313d.C10563l;
import com.bytedance.sdk.component.p313d.C10564m;
import com.bytedance.sdk.component.p313d.C10569r;
import com.bytedance.sdk.component.p313d.p315b.C10496d;
import com.bytedance.sdk.component.p313d.p315b.C10497e;
import com.bytedance.sdk.component.p313d.p316c.C10521b;
import com.bytedance.sdk.component.p313d.p316c.C10534e;
import com.bytedance.sdk.component.p313d.p316c.p317a.C10500a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.utils.C0994s;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.d.a */
/* compiled from: ImageLoaderWrapper */
public class C0750a {
    /* renamed from: a */
    public static C10560i m3821a(String str) {
        return C0751a.m3833b(str);
    }

    /* renamed from: a */
    public static C10560i m3820a(C0463k kVar) {
        return C0751a.m3832b(kVar);
    }

    /* renamed from: a */
    public static InputStream m3823a(String str, String str2) {
        return C0751a.m3834b(str, str2);
    }

    /* renamed from: a */
    public static boolean m3824a(String str, String str2, String str3) {
        return C0751a.m3835b(str, str2, str3);
    }

    /* renamed from: a */
    public static C10564m m3822a() {
        return C0751a.f2896a;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.d.a$a */
    /* compiled from: ImageLoaderWrapper */
    private static final class C0751a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C10564m f2896a = m3829a(C0558m.m2663a());

        /* renamed from: a */
        private static C10564m m3829a(Context context) {
            return C10521b.m30772a(context, (C10563l) new C10534e.C10536a().mo64129a((C10492b) new C10500a(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040, new File(CacheDirFactory.getImageCacheDir()))).mo64131a(C10615e.m31157a(5)).mo64130a((C10540d) new C10540d() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.Closeable} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.bytedance.sdk.component.p313d.p315b.C10496d mo2506a(com.bytedance.sdk.component.p313d.C10556e r7) {
                    /*
                        r6 = this;
                        com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.p046i.C0835d.m4093a()
                        com.bytedance.sdk.component.e.a r0 = r0.mo2660b()
                        com.bytedance.sdk.component.b.a.i r0 = r0.mo64153e()
                        com.bytedance.sdk.component.b.a.k$a r1 = new com.bytedance.sdk.component.b.a.k$a
                        r1.<init>()
                        java.lang.String r2 = r7.mo64003a()
                        com.bytedance.sdk.component.b.a.k$a r1 = r1.mo63986a((java.lang.String) r2)
                        com.bytedance.sdk.component.b.a.k$a r1 = r1.mo63981a()
                        com.bytedance.sdk.component.b.a.k r1 = r1.mo63989b()
                        boolean r2 = r7.mo64005c()
                        r3 = 0
                        if (r2 == 0) goto L_0x002e
                        com.bytedance.sdk.component.d.b.e r2 = new com.bytedance.sdk.component.d.b.e
                        r2.<init>()
                        goto L_0x002f
                    L_0x002e:
                        r2 = r3
                    L_0x002f:
                        if (r2 == 0) goto L_0x0038
                        long r4 = java.lang.System.currentTimeMillis()
                        r2.mo64013a(r4)
                    L_0x0038:
                        com.bytedance.sdk.component.b.a.b r0 = r0.mo63868a(r1)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.b.a.m r3 = r0.mo63859a()     // Catch:{ all -> 0x0070 }
                        if (r2 == 0) goto L_0x0049
                        long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
                        r2.mo64014b(r0)     // Catch:{ all -> 0x0070 }
                    L_0x0049:
                        java.util.Map r7 = r6.m3837a((com.bytedance.sdk.component.p313d.C10556e) r7, (com.bytedance.sdk.component.p307b.p308a.C10483m) r3)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.b.a.n r0 = r3.mo63893f()     // Catch:{ all -> 0x0070 }
                        byte[] r0 = r0.mo63901d()     // Catch:{ all -> 0x0070 }
                        if (r2 == 0) goto L_0x005e
                        long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
                        r2.mo64015c(r4)     // Catch:{ all -> 0x0070 }
                    L_0x005e:
                        com.bytedance.sdk.component.d.b.d r1 = new com.bytedance.sdk.component.d.b.d     // Catch:{ all -> 0x0070 }
                        int r4 = r3.mo63889c()     // Catch:{ all -> 0x0070 }
                        java.lang.String r5 = ""
                        r1.<init>(r4, r0, r5, r7)     // Catch:{ all -> 0x0070 }
                        r1.mo64007a(r2)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
                        return r1
                    L_0x0070:
                        r7 = move-exception
                        com.bytedance.sdk.component.d.b.d r7 = r6.m3836a((com.bytedance.sdk.component.p313d.p315b.C10497e) r2, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0079 }
                        com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
                        return r7
                    L_0x0079:
                        r7 = move-exception
                        com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p037d.C0750a.C0751a.C07521.mo2506a(com.bytedance.sdk.component.d.e):com.bytedance.sdk.component.d.b.d");
                }

                /* renamed from: a */
                private Map<String, String> m3837a(C10556e eVar, C10483m mVar) {
                    if (!eVar.mo64004b()) {
                        return null;
                    }
                    C10469e g = mVar.mo63894g();
                    HashMap hashMap = new HashMap();
                    int a = g.mo63945a();
                    for (int i = 0; i < a; i++) {
                        String a2 = g.mo63946a(i);
                        String b = g.mo63947b(i);
                        if (a2 != null) {
                            hashMap.put(a2, b);
                        }
                    }
                    return hashMap;
                }

                /* renamed from: a */
                private C10496d m3836a(C10497e eVar, Throwable th) {
                    C10638l.m31241d("ImageLoaderWrapper", th.getMessage());
                    if (eVar != null) {
                        eVar.mo64015c(System.currentTimeMillis());
                    }
                    C10496d dVar = new C10496d(0, th, "net failed");
                    dVar.mo64007a(eVar);
                    return dVar;
                }
            }).mo64132a());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C10560i m3833b(String str) {
            return m3825a(f2896a.mo64068a(str));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C10560i m3832b(C0463k kVar) {
            return m3825a(f2896a.mo64068a(kVar.mo1281a()).mo64103a(kVar.mo1285b()).mo64110b(kVar.mo1288c()).mo64108a(kVar.mo1292g()));
        }

        /* renamed from: a */
        private static C10560i m3825a(C10560i iVar) {
            return C0994s.m4603a() ? iVar.mo64106a((C10569r) new C0753b()) : iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static InputStream m3834b(String str, String str2) {
            return f2896a.mo64069a(str, str2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m3835b(String str, String str2, String str3) {
            return f2896a.mo64070a(str, str2, str3);
        }
    }
}
