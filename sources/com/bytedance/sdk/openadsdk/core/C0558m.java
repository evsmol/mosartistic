package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p000b.C0132c;
import com.bytedance.sdk.openadsdk.p000b.C0135d;
import com.bytedance.sdk.openadsdk.p000b.C0139f;
import com.bytedance.sdk.openadsdk.p000b.C0140g;
import com.bytedance.sdk.openadsdk.p000b.C0141h;
import com.bytedance.sdk.openadsdk.p000b.C0160q;
import com.bytedance.sdk.openadsdk.p000b.C0161r;
import com.bytedance.sdk.openadsdk.p000b.C0162s;
import com.bytedance.sdk.openadsdk.p000b.C0163t;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0816a;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0822d;
import com.bytedance.sdk.openadsdk.p049k.C0883a;
import com.bytedance.sdk.openadsdk.p049k.C0884b;
import com.bytedance.sdk.openadsdk.p049k.C0888c;
import com.bytedance.sdk.openadsdk.p049k.C0893h;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.core.m */
/* compiled from: InternalContainer */
public class C0558m {

    /* renamed from: a */
    public static int f2080a = 8;

    /* renamed from: b */
    private static volatile C0132c<C0106a> f2081b;

    /* renamed from: c */
    private static volatile C0132c<C0818c.C0821a> f2082c;

    /* renamed from: d */
    private static volatile C0132c<C0818c.C0821a> f2083d;

    /* renamed from: e */
    private static volatile C0561n<C0106a> f2084e;

    /* renamed from: f */
    private static volatile C0883a f2085f;

    /* renamed from: g */
    private static volatile C0816a f2086g;

    /* renamed from: h */
    private static volatile Context f2087h;

    /* renamed from: i */
    private static volatile C0516f f2088i;

    /* renamed from: a */
    public static synchronized Context m2663a() {
        Context context;
        synchronized (C0558m.class) {
            if (f2087h == null) {
                m2665a((Context) null);
            }
            context = f2087h;
        }
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m2665a(android.content.Context r2) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.core.m> r0 = com.bytedance.sdk.openadsdk.core.C0558m.class
            monitor-enter(r0)
            android.content.Context r1 = f2087h     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.C0558m.C0560a.m2677a()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001a
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.C0558m.C0560a.m2677a()     // Catch:{ all -> 0x0019 }
            f2087h = r1     // Catch:{ all -> 0x0019 }
            android.content.Context r1 = f2087h     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)
            return
        L_0x0019:
        L_0x001a:
            if (r2 == 0) goto L_0x0030
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0032 }
            f2087h = r2     // Catch:{ all -> 0x0032 }
            android.content.Context r2 = m2663a()     // Catch:{ all -> 0x0032 }
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)     // Catch:{ all -> 0x0032 }
            int r2 = r2.getScaledTouchSlop()     // Catch:{ all -> 0x0032 }
            f2080a = r2     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0558m.m2665a(android.content.Context):void");
    }

    /* renamed from: b */
    public static void m2667b() {
        f2081b = null;
        f2085f = null;
        f2086g = null;
    }

    /* renamed from: c */
    public static C0132c<C0106a> m2668c() {
        if (!C0515e.m2397a()) {
            return C0132c.m573c();
        }
        if (f2081b == null) {
            synchronized (C0558m.class) {
                if (f2081b == null) {
                    if (C0934b.m4334c()) {
                        f2081b = new C0135d();
                    } else {
                        f2081b = new C0132c<>(new C0140g(f2087h), m2671f(), m2675j(), m2666b(f2087h));
                    }
                }
            }
        }
        return f2081b;
    }

    /* renamed from: d */
    public static C0132c<C0818c.C0821a> m2669d() {
        if (!C0515e.m2397a()) {
            return C0132c.m574d();
        }
        if (f2083d == null) {
            synchronized (C0558m.class) {
                if (f2083d == null) {
                    if (C0934b.m4334c()) {
                        f2083d = new C0161r(false);
                    } else {
                        f2083d = m2664a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
        }
        return f2083d;
    }

    /* renamed from: e */
    public static C0132c<C0818c.C0821a> m2670e() {
        if (!C0515e.m2397a()) {
            return C0132c.m574d();
        }
        if (f2082c == null) {
            synchronized (C0558m.class) {
                if (f2082c == null) {
                    if (C0934b.m4334c()) {
                        f2082c = new C0161r(true);
                    } else {
                        f2082c = m2664a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
        }
        return f2082c;
    }

    /* renamed from: f */
    public static C0561n<C0106a> m2671f() {
        if (f2084e == null) {
            synchronized (C0558m.class) {
                if (f2084e == null) {
                    f2084e = new C0607o(f2087h);
                }
            }
        }
        return f2084e;
    }

    /* renamed from: g */
    public static C0883a m2672g() {
        if (!C0515e.m2397a()) {
            return C0884b.m4243d();
        }
        if (f2085f == null) {
            synchronized (C0883a.class) {
                if (f2085f == null) {
                    if (C0934b.m4334c()) {
                        f2085f = new C0888c();
                    } else {
                        f2085f = new C0884b(f2087h, new C0893h(f2087h));
                    }
                }
            }
        }
        return f2085f;
    }

    /* renamed from: j */
    private static C0141h.C0144c m2675j() {
        return C0141h.C0144c.m688a();
    }

    /* renamed from: a */
    public static C0132c<C0818c.C0821a> m2664a(String str, String str2, boolean z) {
        C0139f fVar;
        C0141h.C0144c cVar;
        if (z) {
            fVar = new C0162s(f2087h);
            cVar = C0141h.C0144c.m688a();
        } else {
            cVar = C0141h.C0144c.m689b();
            fVar = new C0160q(f2087h);
        }
        C0141h.C0143b b = m2666b(f2087h);
        return new C0132c(fVar, (C0561n) null, cVar, b, new C0163t(str, str2, fVar, (C0561n) null, cVar, b));
    }

    /* renamed from: b */
    private static C0141h.C0143b m2666b(final Context context) {
        return new C0141h.C0143b() {
            /* renamed from: a */
            public boolean mo418a() {
                Context context = context;
                if (context == null) {
                    context = C0558m.m2663a();
                }
                return C10642o.m31257a(context);
            }
        };
    }

    /* renamed from: h */
    public static C0516f m2673h() {
        if (f2088i == null) {
            synchronized (C0516f.class) {
                if (f2088i == null) {
                    f2088i = new C0516f();
                }
            }
        }
        return f2088i;
    }

    /* renamed from: i */
    public static C0816a m2674i() {
        if (!C0515e.m2397a()) {
            return C0818c.m4032c();
        }
        if (f2086g == null) {
            synchronized (C0818c.class) {
                if (f2086g == null) {
                    if (C0934b.m4334c()) {
                        f2086g = new C0822d();
                    } else {
                        f2086g = new C0818c();
                    }
                }
            }
        }
        return f2086g;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.m$a */
    /* compiled from: InternalContainer */
    private static class C0560a {

        /* renamed from: a */
        private static volatile Application f2090a;

        /* renamed from: a */
        public static Application m2677a() {
            return f2090a;
        }

        static {
            try {
                Object b = m2678b();
                f2090a = (Application) b.getClass().getMethod("getApplication", new Class[0]).invoke(b, new Object[0]);
                C10638l.m31242e("MyApplication", "application get success");
            } catch (Throwable th) {
                C10638l.m31239c("MyApplication", "application get failed", th);
            }
        }

        /* renamed from: b */
        private static Object m2678b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke((Object) null, new Object[0]);
            } catch (Throwable th) {
                C10638l.m31239c("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
