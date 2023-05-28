package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.p165a.C6551b;
import com.apm.insight.p165a.C6552c;
import com.apm.insight.p177k.C6655h;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.runtime.C6750j;
import com.apm.insight.runtime.C6756o;
import com.apm.insight.runtime.ConfigManager;
import java.util.Map;

public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C6617h.m16307b().mo51974b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C6617h.m16307b().mo51968a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            C6617h.m16307b().mo51971a(map);
        }
    }

    public static void dumpHprof(String str) {
        C6756o.m17000c(str);
    }

    public static void enableALogCollector(String str, C6551b bVar, C6552c cVar) {
        C6756o.m16988a(str, bVar, cVar);
    }

    public static void enableThreadsBoost() {
        C6617h.m16299a(1);
    }

    public static ConfigManager getConfigManager() {
        return C6617h.m16315i();
    }

    public static boolean hasCrash() {
        return C6756o.m17011k();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return C6756o.m17012l();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return C6756o.m17013m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void init(android.app.Application r10, android.content.Context r11, com.apm.insight.ICommonParams r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17) {
        /*
            java.lang.Class<com.apm.insight.Npth> r1 = com.apm.insight.Npth.class
            monitor-enter(r1)
            boolean r0 = sInit     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            r0 = 1
            sInit = r0     // Catch:{ all -> 0x006e }
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 1
            r2 = r10
            r3 = r11
            r8 = r17
            com.apm.insight.runtime.C6756o.m16979a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006e }
            com.apm.insight.C6617h.m16303a(r10, r11, r12)     // Catch:{ all -> 0x006e }
            com.apm.insight.runtime.d r0 = com.apm.insight.C6617h.m16297a()     // Catch:{ all -> 0x006e }
            java.util.Map r0 = r0.mo52290a()     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "update_version_code"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x006e }
            r3 = 0
            int r2 = com.apm.insight.p178l.C6689r.m16633a(r2, r3)     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "aid"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x006e }
            r4 = 4444(0x115c, float:6.227E-42)
            int r3 = com.apm.insight.p178l.C6689r.m16633a(r3, r4)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "app_version"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x006e }
            long r5 = (long) r2     // Catch:{ all -> 0x006e }
            r2 = r11
            com.apm.insight.MonitorCrash r2 = com.apm.insight.MonitorCrash.init(r11, r3, r5, r4)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x006c
            com.apm.insight.MonitorCrash$Config r2 = r2.config()     // Catch:{ all -> 0x006e }
            com.apm.insight.runtime.d r3 = com.apm.insight.C6617h.m16297a()     // Catch:{ all -> 0x006e }
            java.lang.String r3 = r3.mo52293d()     // Catch:{ all -> 0x006e }
            com.apm.insight.MonitorCrash$Config r2 = r2.setDeviceId(r3)     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "channel"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006e }
            r2.setChannel(r0)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r1)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.Npth.init(android.app.Application, android.content.Context, com.apm.insight.ICommonParams, boolean, boolean, boolean, boolean, long):void");
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            init(context, iCommonParams, true, false, false);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z, z2, z3);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z2, z3, z4, 0);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        Context context2 = context;
        synchronized (Npth.class) {
            if (C6617h.m16314h() != null) {
                application = C6617h.m16314h();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                } finally {
                    str = "初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).";
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
                }
            }
            init(application, context2, iCommonParams, z, z2, z3, z4, j);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            C6617h.m16306a(true);
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
        synchronized (Npth.class) {
            C6617h.m16306a(true);
            C6617h.m16308b(i, str);
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static boolean isANREnable() {
        return C6756o.m17002c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return C6756o.m16998b();
    }

    public static boolean isNativeCrashEnable() {
        return C6756o.m17004d();
    }

    public static boolean isRunning() {
        return C6756o.m17009i();
    }

    public static boolean isStopUpload() {
        return C6756o.m17014n();
    }

    public static void openANRMonitor() {
        C6756o.m17007g();
    }

    public static void openJavaCrashMonitor() {
        C6756o.m17006f();
    }

    public static boolean openNativeCrashMonitor() {
        return C6756o.m17008h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C6756o.m16981a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        C6756o.m16982a(iOOMCallback);
    }

    public static void registerSdk(int i, String str) {
        C6617h.m16300a(i, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C6617h.m16307b().mo51975b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C6617h.m16307b().mo51969a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        C6756o.m16987a(str);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C6600f fVar) {
        C6756o.m16990a(str, map, map2, fVar);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C6600f fVar) {
        C6756o.m16991a(str, map, map2, map3, fVar);
    }

    @Deprecated
    public static void reportError(String str) {
        C6756o.m16996b(str);
    }

    @Deprecated
    public static void reportError(Throwable th) {
        C6756o.m16992a(th);
    }

    public static void setAlogFlushAddr(long j) {
        C6756o.m16978a(j);
    }

    public static void setAlogFlushV2Addr(long j) {
        C6756o.m16994b(j);
    }

    public static void setAlogLogDirAddr(long j) {
        C6756o.m16999c(j);
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void setAnrInfoFileObserver(String str, C6588e eVar) {
        C6756o.m16989a(str, eVar);
    }

    public static void setApplication(Application application) {
        C6617h.m16301a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C6617h.m16307b().mo51968a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            C6617h.m16305a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        C6617h.m16307b().mo51970a(iCrashFilter);
    }

    public static void setCurProcessName(String str) {
        C6662a.m16474a(str);
    }

    public static void setEncryptImpl(C6585d dVar) {
        C6756o.m16984a(dVar);
    }

    public static void setLogcatImpl(C6750j jVar) {
        C6756o.m16986a(jVar);
    }

    public static void setRequestIntercept(C6655h hVar) {
        C6756o.m16985a(hVar);
    }

    public static void stopAnr() {
        C6756o.m17010j();
    }

    public static void stopUpload() {
        C6756o.m17015o();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C6756o.m16995b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        C6756o.m16983a(iOOMCallback, crashType);
    }
}
