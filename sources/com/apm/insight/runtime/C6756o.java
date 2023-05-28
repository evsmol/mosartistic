package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C6585d;
import com.apm.insight.C6588e;
import com.apm.insight.C6600f;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p165a.C6549a;
import com.apm.insight.p165a.C6551b;
import com.apm.insight.p165a.C6552c;
import com.apm.insight.p166b.C6558c;
import com.apm.insight.p166b.C6560d;
import com.apm.insight.p166b.C6564g;
import com.apm.insight.p168d.C6586a;
import com.apm.insight.p173g.C6608a;
import com.apm.insight.p173g.C6613c;
import com.apm.insight.p173g.C6614d;
import com.apm.insight.p175i.C6625b;
import com.apm.insight.p177k.C6647e;
import com.apm.insight.p177k.C6655h;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6688q;
import java.io.File;
import java.util.Map;

/* renamed from: com.apm.insight.runtime.o */
public class C6756o {

    /* renamed from: a */
    private static boolean f14512a = false;

    /* renamed from: b */
    private static boolean f14513b = false;

    /* renamed from: c */
    private static boolean f14514c = false;

    /* renamed from: d */
    private static boolean f14515d = false;

    /* renamed from: e */
    private static boolean f14516e = false;

    /* renamed from: f */
    private static C6738c f14517f = new C6738c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static volatile boolean f14518g = false;

    /* renamed from: h */
    private static boolean f14519h = false;

    /* renamed from: a */
    public static C6738c m16977a() {
        return f14517f;
    }

    /* renamed from: a */
    public static void m16978a(long j) {
        NativeImpl.m16703a(j);
    }

    /* renamed from: a */
    public static synchronized void m16979a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (C6756o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!f14512a) {
                f14512a = true;
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                }
                C6617h.m16302a(application, context);
                if (z || z2) {
                    C6608a a = C6608a.m16263a();
                    if (z2) {
                        a.mo52095a((C6613c) new C6625b(context));
                    }
                    if (z) {
                        a.mo52098b((C6613c) new C6614d(context));
                    }
                    f14513b = true;
                }
                NativeImpl.m16707a();
                if (z3) {
                    boolean a2 = NativeImpl.m16708a(context);
                    f14515d = a2;
                    if (!a2) {
                        f14516e = true;
                    }
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    f14518g = true;
                    NativeImpl.m16726h();
                }
                m17001c(z4);
                C6688q.m16625a((Object) "Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m16980a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        synchronized (C6756o.class) {
            if (C6617h.m16314h() != null) {
                application = C6617h.m16314h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context = application.getBaseContext();
                    }
                } finally {
                    str = "初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).";
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
                }
            }
            m16979a(application, context, z, z2, z3, z4, j);
        }
    }

    /* renamed from: a */
    public static void m16981a(ICrashCallback iCrashCallback, CrashType crashType) {
        m16977a().mo52282a(iCrashCallback, crashType);
    }

    /* renamed from: a */
    public static void m16982a(IOOMCallback iOOMCallback) {
        m16977a().mo52283a(iOOMCallback);
    }

    /* renamed from: a */
    public static void m16983a(IOOMCallback iOOMCallback, CrashType crashType) {
        m16977a().mo52286b(iOOMCallback);
    }

    /* renamed from: a */
    public static void m16984a(C6585d dVar) {
        C6617h.m16315i().setEncryptImpl(dVar);
    }

    /* renamed from: a */
    public static void m16985a(C6655h hVar) {
        C6647e.m16415a(hVar);
    }

    /* renamed from: a */
    public static void m16986a(C6750j jVar) {
        C6751k.m16958a(jVar);
    }

    /* renamed from: a */
    public static void m16987a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C6586a.m16118a(str);
        }
    }

    /* renamed from: a */
    public static void m16988a(String str, C6551b bVar, C6552c cVar) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            C6549a.m15999a().mo51978a(str, bVar, cVar);
        }
    }

    /* renamed from: a */
    public static void m16989a(final String str, final C6588e eVar) {
        C6761p.m17019b().mo52327a((Runnable) new Runnable() {
            public void run() {
                if (C6662a.m16479b(C6617h.m16313g())) {
                    C6560d.m16045a(str, eVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m16990a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C6600f fVar) {
        if (!TextUtils.isEmpty(str)) {
            C6586a.m16119a(str, map, map2, fVar);
        }
    }

    /* renamed from: a */
    public static void m16991a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C6600f fVar) {
        if (!TextUtils.isEmpty(str)) {
            C6586a.m16120a(str, map, map2, map3, fVar);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m16992a(Throwable th) {
        if (C6617h.m16315i().isReportErrorEnable()) {
            C6608a.m16267a(th);
        }
    }

    /* renamed from: b */
    public static void m16994b(long j) {
        NativeImpl.m16711b(j);
    }

    /* renamed from: b */
    public static void m16995b(ICrashCallback iCrashCallback, CrashType crashType) {
        m16977a().mo52285b(iCrashCallback, crashType);
    }

    @Deprecated
    /* renamed from: b */
    public static void m16996b(String str) {
        if (C6617h.m16315i().isReportErrorEnable()) {
            C6608a.m16272c(str);
        }
    }

    /* renamed from: b */
    public static boolean m16998b() {
        return f14513b;
    }

    /* renamed from: c */
    public static void m16999c(long j) {
        NativeImpl.m16716c(j);
    }

    /* renamed from: c */
    public static void m17000c(String str) {
        NativeImpl.m16712b(str);
    }

    /* renamed from: c */
    private static void m17001c(final boolean z) {
        C6761p.m17019b().mo52328a((Runnable) new Runnable() {
            public void run() {
                if (!C6756o.f14518g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            boolean unused = C6756o.f14518g = true;
                            NativeImpl.m16726h();
                        }
                    });
                }
                C6756o.m17003d(z);
            }
        }, 0);
    }

    /* renamed from: c */
    public static boolean m17002c() {
        return f14514c;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m17003d(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.C6617h.m16313g()
            com.apm.insight.runtime.p179a.C6729f.m16893a()
            com.apm.insight.runtime.C6754m.m16967a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.C6627j.m16354a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.m16709b()
            com.apm.insight.C6627j.m16353a()
            com.apm.insight.nativecrash.NativeImpl.m16715c()
            boolean r2 = f14516e
            if (r2 == 0) goto L_0x0027
            com.apm.insight.c r1 = com.apm.insight.C6553b.m16004a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L_0x0023:
            r1.mo52017a((java.lang.String) r2)
            goto L_0x0030
        L_0x0027:
            if (r1 >= 0) goto L_0x0030
            com.apm.insight.c r1 = com.apm.insight.C6553b.m16004a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L_0x0023
        L_0x0030:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.C6627j.m16354a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.p169e.C6589a.m16122a()
            r1.mo52025a((android.content.Context) r0)
            com.apm.insight.C6627j.m16353a()
            com.apm.insight.C6553b.m16004a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.C6627j.m16354a(r1)
            com.apm.insight.p177k.C6656i.m16449a(r0)
            com.apm.insight.C6627j.m16353a()
            if (r3 == 0) goto L_0x0060
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.C6627j.m16354a(r1)
            com.apm.insight.b.g r1 = com.apm.insight.p166b.C6564g.m16054a(r0)
            r1.mo51998c()
            com.apm.insight.C6627j.m16353a()
            f14514c = r3
        L_0x0060:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.C6627j.m16354a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.p177k.C6651g.m16435a()
            r3.mo52139b()
            com.apm.insight.C6627j.m16353a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.C6627j.m16354a(r3)
            com.apm.insight.C6627j.m16353a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.C6627j.m16354a(r3)
            com.apm.insight.C6627j.m16353a()
            com.apm.insight.nativecrash.NativeImpl.m16721f()
            com.apm.insight.C6623i.m16343a()
            java.lang.String r3 = "fastbot"
            java.io.File r3 = r0.getExternalFilesDir(r3)     // Catch:{ all -> 0x00a9 }
            android.content.Context r0 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x00a9 }
            boolean r0 = com.apm.insight.p178l.C6662a.m16479b(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.exists()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.runtime.o$3 r0 = new com.apm.insight.runtime.o$3     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.p166b.C6560d.m16045a((java.lang.String) r3, (com.apm.insight.C6588e) r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            com.apm.insight.p177k.C6658k.m16463d()
            com.apm.insight.nativecrash.NativeImpl.m16729j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.C6764r.m17029a((java.lang.String) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C6756o.m17003d(boolean):void");
    }

    /* renamed from: d */
    public static boolean m17004d() {
        return f14515d;
    }

    /* renamed from: e */
    public static boolean m17005e() {
        return f14512a;
    }

    /* renamed from: f */
    public static void m17006f() {
        if (f14512a && !f14513b) {
            Context g = C6617h.m16313g();
            C6608a a = C6608a.m16263a();
            a.mo52095a((C6613c) new C6625b(g));
            a.mo52098b((C6613c) new C6614d(g));
        }
    }

    /* renamed from: g */
    public static void m17007g() {
        if (f14512a) {
            C6564g.m16054a(C6617h.m16313g()).mo51998c();
            f14514c = true;
        }
    }

    /* renamed from: h */
    public static boolean m17008h() {
        if (f14512a && !f14515d) {
            boolean a = NativeImpl.m16708a(C6617h.m16313g());
            f14515d = a;
            if (!a) {
                f14516e = true;
            }
        }
        return f14515d;
    }

    /* renamed from: i */
    public static boolean m17009i() {
        return C6558c.m16038c();
    }

    /* renamed from: j */
    public static void m17010j() {
        if (f14512a) {
            C6564g.m16054a(C6617h.m16313g()).mo51999d();
            f14514c = false;
        }
    }

    /* renamed from: k */
    public static boolean m17011k() {
        return C6608a.m16270b() || NativeImpl.m16718d();
    }

    /* renamed from: l */
    public static boolean m17012l() {
        return C6608a.m16274c() || NativeImpl.m16718d();
    }

    /* renamed from: m */
    public static boolean m17013m() {
        return C6608a.m16270b();
    }

    /* renamed from: n */
    public static boolean m17014n() {
        return f14519h;
    }

    /* renamed from: o */
    public static void m17015o() {
        f14519h = true;
    }
}
