package com.bytedance.sdk.component.adexpress.p294a.p296b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10359c;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10279b;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10280c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10627f;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.a */
/* compiled from: TTDynamic */
public class C10266a {

    /* renamed from: a */
    static Object f25348a = new Object();

    /* renamed from: a */
    public static void m29491a() {
        C10268b.m29502a();
        C10359c.m30147a().mo63589c();
    }

    /* renamed from: b */
    public static void m29496b() {
        try {
            C10276e.m29545d();
            File f = C10268b.m29508f();
            if (f != null && f.exists()) {
                if (f.getParentFile() != null) {
                    C10627f.m31210c(f.getParentFile());
                } else {
                    C10627f.m31210c(f);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m29493a(C10280c cVar) {
        C10274d.m29528a().mo63117a(cVar, cVar.f25396f);
    }

    /* renamed from: c */
    public static String m29498c() {
        return C10272c.m29520c();
    }

    /* renamed from: a */
    public static C10279b m29490a(String str) {
        return C10274d.m29528a().mo63116a(str);
    }

    /* renamed from: b */
    public static Set<String> m29495b(String str) {
        return C10274d.m29528a().mo63119b(str);
    }

    /* renamed from: c */
    public static C10279b m29497c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C10279b a = C10274d.m29528a().mo63116a(str);
        if (a != null) {
            a.mo63140a(Long.valueOf(System.currentTimeMillis()));
            m29492a(a);
        }
        return a;
    }

    /* renamed from: a */
    private static void m29492a(final C10279b bVar) {
        C10615e.m31160a(new C10618g("updateTmplTime") {
            public void run() {
                synchronized (C10266a.f25348a) {
                    C10272c.m29519a().mo63110a(bVar);
                }
            }
        }, 10);
    }

    /* renamed from: d */
    public static C10277a m29499d() {
        return C10268b.m29502a().mo63103d();
    }

    /* renamed from: e */
    public static String m29500e() {
        if (m29499d() == null) {
            return null;
        }
        return m29499d().mo63126c();
    }

    /* renamed from: f */
    public static boolean m29501f() {
        return C10268b.m29502a().mo63102c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r2.mo63136b().equals(r6) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[SYNTHETIC, Splitter:B:18:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse m29489a(java.lang.String r4, com.bytedance.sdk.component.adexpress.p299c.C10306c.C10307a r5, java.lang.String r6) {
        /*
            boolean r0 = m29501f()
            r1 = 0
            if (r0 == 0) goto L_0x005c
            com.bytedance.sdk.component.adexpress.a.c.a r0 = m29499d()
            java.util.List r0 = r0.mo63130e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r0.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r2 = (com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a) r2
            java.lang.String r3 = r2.mo63133a()
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r2.mo63133a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0013
            java.lang.String r4 = r2.mo63133a()
            java.lang.String r4 = com.bytedance.sdk.component.utils.C10626e.m31201a((java.lang.String) r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r6 = r4
        L_0x003f:
            java.io.File r4 = new java.io.File
            java.io.File r0 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b.m29508f()
            r4.<init>(r0, r6)
            java.lang.String r6 = com.bytedance.sdk.component.utils.C10626e.m31200a((java.io.File) r4)
            java.lang.String r0 = r2.mo63136b()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r2.mo63136b()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x005d
        L_0x005c:
            r4 = r1
        L_0x005d:
            if (r4 == 0) goto L_0x0079
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.mo63236a()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0071 }
            r2.<init>(r4)     // Catch:{ all -> 0x0071 }
            r6.<init>(r5, r0, r2)     // Catch:{ all -> 0x0071 }
            r1 = r6
            goto L_0x0079
        L_0x0071:
            r4 = move-exception
            java.lang.String r5 = "TTDynamic"
            java.lang.String r6 = "get html WebResourceResponse error"
            com.bytedance.sdk.component.utils.C10638l.m31239c(r5, r6, r4)
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a.m29489a(java.lang.String, com.bytedance.sdk.component.adexpress.c.c$a, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public static boolean m29494a(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
            return false;
        }
        return true;
    }
}
