package com.apm.insight.p173g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.entity.C6594a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p177k.C6645d;
import com.apm.insight.p177k.C6656i;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6670e;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6677k;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.p178l.C6689r;
import com.apm.insight.p178l.C6693v;
import com.apm.insight.runtime.C6718a;
import com.apm.insight.runtime.C6756o;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.p179a.C6729f;
import com.appnext.base.p264b.C8849c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.g.a */
public class C6608a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static C6608a f14187a = null;

    /* renamed from: i */
    private static volatile boolean f14188i = false;

    /* renamed from: j */
    private static volatile ThreadLocal<Boolean> f14189j = new ThreadLocal<>();

    /* renamed from: k */
    private static ArrayList<C6612b> f14190k = new ArrayList<>();

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f14191b;

    /* renamed from: c */
    private C6613c f14192c;

    /* renamed from: d */
    private C6613c f14193d;

    /* renamed from: e */
    private volatile int f14194e = 0;

    /* renamed from: f */
    private volatile int f14195f = 0;

    /* renamed from: g */
    private ConcurrentHashMap<String, Object> f14196g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private ConcurrentHashMap<String, Object> f14197h = new ConcurrentHashMap<>();

    private C6608a() {
        m16275d();
    }

    /* renamed from: a */
    private static int m16262a(Throwable th, Thread thread) {
        int i = 0;
        int i2 = 0;
        while (i < f14190k.size()) {
            try {
                try {
                    i2 |= f14190k.get(i).mo52104a(th, thread);
                } catch (Throwable th2) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th2);
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static C6608a m16263a() {
        if (f14187a == null) {
            f14187a = new C6608a();
        }
        return f14187a;
    }

    /* renamed from: a */
    private String m16264a(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f14197h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.m16713c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z2) {
            int h = NativeImpl.m16725h(absolutePath);
            if (h > 0) {
                try {
                    NativeImpl.m16702a(h, C6662a.m16480c(C6617h.m16313g()));
                    NativeImpl.m16702a(h, "\n");
                    NativeImpl.m16702a(h, th.getMessage());
                    NativeImpl.m16702a(h, "\n");
                    NativeImpl.m16702a(h, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m16702a(h, ": ");
                        NativeImpl.m16702a(h, th.getMessage());
                    }
                    NativeImpl.m16702a(h, "\n");
                    NativeImpl.m16702a(h, thread.getName());
                    NativeImpl.m16702a(h, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m16702a(h, "stack:");
                    NativeImpl.m16702a(h, "\n");
                } catch (Throwable unused3) {
                }
                C6693v.m16667a(th, h);
                NativeImpl.m16710b(h);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    if (!C6689r.m16637a(32768)) {
                        fileOutputStream.write((C6662a.m16480c(C6617h.m16313g()) + "\n").getBytes());
                        fileOutputStream.write((th.getMessage() + "\n").getBytes());
                        fileOutputStream.write((th + "\n").getBytes());
                        fileOutputStream.write((thread.getName() + "\n").getBytes());
                        try {
                            fileOutputStream.write("stack:\n".getBytes());
                        } catch (Throwable unused4) {
                        }
                        try {
                            if (!C6689r.m16637a(8192)) {
                                str2 = C6693v.m16659a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new C6670e.C6671a() {

                                    /* renamed from: a */
                                    boolean f14198a = false;

                                    /* renamed from: a */
                                    public boolean mo52101a(String str) {
                                        if (!this.f14198a && str.contains("android.os.Looper.loop")) {
                                            this.f14198a = true;
                                        }
                                        return !this.f14198a;
                                    }
                                } : new C6670e.C6671a());
                                C6677k.m16550a((Closeable) fileOutputStream);
                                C6677k.m16550a((Closeable) fileOutputStream);
                            } else {
                                throw new RuntimeException("test exception npth write stack");
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.write("err:\n".getBytes());
                                fileOutputStream.write((th + "\n").getBytes());
                                fileOutputStream.write((th2 + "\n").getBytes());
                            } catch (Throwable unused5) {
                            }
                        }
                    } else {
                        throw new RuntimeException("test exception before write stack");
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
            }
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fa A[Catch:{ all -> 0x0225, all -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC, Splitter:B:23:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ all -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[ADDED_TO_REGION, Catch:{ all -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2 A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9 A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fc A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f A[SYNTHETIC, Splitter:B:60:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0166 A[SYNTHETIC, Splitter:B:75:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable m16265a(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
            r22 = this;
            r8 = r22
            r15 = r23
            r14 = r24
            int r0 = r8.f14194e
            r18 = 0
            r1 = 3
            if (r0 < r1) goto L_0x0016
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = com.apm.insight.p178l.C6689r.m16637a((int) r0)
            if (r0 != 0) goto L_0x0016
            return r18
        L_0x0016:
            int r0 = r8.f14194e
            r13 = 1
            int r0 = r0 + r13
            r8.f14194e = r0
            int r0 = r8.f14195f
            int r0 = r0 + r13
            r8.f14195f = r0
            boolean r0 = f14188i
            if (r0 == 0) goto L_0x002e
            java.lang.ThreadLocal<java.lang.Boolean> r0 = f14189j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0.set(r1)
        L_0x002e:
            f14188i = r13
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = m16268a((long) r10)
            r9 = 0
            boolean r0 = com.apm.insight.p178l.C6693v.m16679c((java.lang.Throwable) r24)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            boolean r1 = com.apm.insight.p178l.C6693v.m16680d(r24)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            r19 = r1
            goto L_0x004e
        L_0x004b:
            r0 = 0
        L_0x004c:
            r19 = 0
        L_0x004e:
            if (r12 == 0) goto L_0x0053
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01ea }
            goto L_0x0055
        L_0x0053:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01ea }
        L_0x0055:
            java.lang.String r7 = com.apm.insight.C6617h.m16298a(r10, r1, r0, r9)     // Catch:{ all -> 0x01ea }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01ea }
            android.content.Context r1 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x01ea }
            java.io.File r1 = com.apm.insight.p178l.C6685o.m16585a((android.content.Context) r1)     // Catch:{ all -> 0x01ea }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x01ea }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x01ea }
            java.lang.String r1 = "logEventStack"
            r5.<init>(r6, r1)     // Catch:{ all -> 0x01ea }
            r1 = r22
            r2 = r5
            r3 = r0
            r4 = r24
            r16 = r5
            r5 = r7
            r9 = r6
            r6 = r23
            r20 = r7
            r7 = r19
            java.lang.String r7 = r1.m16264a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ea }
            int r1 = m16262a((java.lang.Throwable) r14, (java.lang.Thread) r15)     // Catch:{ all -> 0x01ea }
            r1 = r1 & r13
            if (r1 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x0095
            com.apm.insight.runtime.ConfigManager r1 = com.apm.insight.C6617h.m16315i()     // Catch:{ all -> 0x01ea }
            boolean r1 = r1.isCrashIgnored(r7)     // Catch:{ all -> 0x01ea }
            if (r1 == 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            r21 = 0
            goto L_0x009a
        L_0x0098:
            r21 = 1
        L_0x009a:
            org.json.JSONArray r1 = com.apm.insight.entity.C6595b.m16204a((java.lang.Throwable) r14, (java.lang.Thread) r15, (java.io.File) r9)     // Catch:{ all -> 0x01e1 }
            if (r1 != 0) goto L_0x00a2
            r1 = 1
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            if (r1 != 0) goto L_0x00ab
            if (r21 == 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r0 = r20
            goto L_0x00cf
        L_0x00ab:
            if (r12 == 0) goto L_0x00b0
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01e1 }
            goto L_0x00b2
        L_0x00b0:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01e1 }
        L_0x00b2:
            java.lang.String r0 = com.apm.insight.C6617h.m16298a(r10, r1, r0, r13)     // Catch:{ all -> 0x01e1 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01e1 }
            android.content.Context r2 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x01e1 }
            java.io.File r2 = com.apm.insight.p178l.C6685o.m16585a((android.content.Context) r2)     // Catch:{ all -> 0x01e1 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01e1 }
            r9.renameTo(r1)     // Catch:{ all -> 0x01e1 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "logEventStack"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x01e1 }
            r16 = r2
        L_0x00cf:
            com.apm.insight.p178l.C6672f.m16507a()     // Catch:{ all -> 0x01e1 }
            com.apm.insight.k.b r1 = com.apm.insight.p177k.C6635b.m16372a()     // Catch:{ all -> 0x01e1 }
            r1.mo52123b()     // Catch:{ all -> 0x01e1 }
            boolean r20 = r22.m16278g()     // Catch:{ all -> 0x01e1 }
            if (r19 == 0) goto L_0x00ec
            if (r20 == 0) goto L_0x00ec
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r12
            r5 = r10
            r1.m16266a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x01da }
        L_0x00ec:
            boolean r1 = com.apm.insight.p178l.C6689r.m16637a((int) r13)     // Catch:{ all -> 0x01da }
            if (r1 == 0) goto L_0x00f7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r8.f14197h     // Catch:{ all -> 0x01da }
            r1.clear()     // Catch:{ all -> 0x01da }
        L_0x00f7:
            if (r12 == 0) goto L_0x00fc
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01da }
            goto L_0x00fe
        L_0x00fc:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01da }
        L_0x00fe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r2.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "[uncaughtException] isLaunchCrash="
            r2.append(r3)     // Catch:{ all -> 0x01da }
            r2.append(r12)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01da }
            com.apm.insight.p178l.C6688q.m16625a((java.lang.Object) r2)     // Catch:{ all -> 0x01da }
            com.apm.insight.a.a r2 = com.apm.insight.p165a.C6549a.m15999a()     // Catch:{ all -> 0x01da }
            r2.mo51976a((com.apm.insight.CrashType) r1, (long) r10, (java.lang.String) r0)     // Catch:{ all -> 0x01da }
            boolean r1 = r22.m16271b((java.lang.Thread) r23, (java.lang.Throwable) r24)     // Catch:{ all -> 0x01da }
            if (r1 == 0) goto L_0x0160
            com.apm.insight.g.c r2 = r8.f14192c     // Catch:{ all -> 0x0158 }
            if (r2 == 0) goto L_0x0160
            if (r12 == 0) goto L_0x0160
            com.apm.insight.g.c r2 = r8.f14192c     // Catch:{ all -> 0x0158 }
            boolean r2 = r2.mo52107a(r14)     // Catch:{ all -> 0x0158 }
            if (r2 == 0) goto L_0x0160
            com.apm.insight.g.c r9 = r8.f14192c     // Catch:{ all -> 0x0158 }
            r5 = r10
            r4 = r12
            r12 = r23
            r2 = 1
            r13 = r24
            r3 = r14
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.mo52106a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r0.<init>()     // Catch:{ all -> 0x019e }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x019e }
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x019e }
            goto L_0x0199
        L_0x0158:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r2 = 1
            r9 = r14
        L_0x015d:
            r7 = r15
            goto L_0x01f4
        L_0x0160:
            r5 = r10
            r4 = r12
            r3 = r14
            r2 = 1
            if (r1 == 0) goto L_0x01a8
            com.apm.insight.g.c r9 = r8.f14193d     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01a8
            com.apm.insight.g.c r9 = r8.f14193d     // Catch:{ all -> 0x01a4 }
            boolean r9 = r9.mo52107a(r3)     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01a8
            com.apm.insight.g.c r9 = r8.f14193d     // Catch:{ all -> 0x01a1 }
            r10 = r5
            r12 = r23
            r13 = r24
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.mo52106a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r0.<init>()     // Catch:{ all -> 0x019e }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x019e }
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x019e }
        L_0x0199:
            com.apm.insight.p178l.C6688q.m16625a((java.lang.Object) r0)     // Catch:{ all -> 0x019e }
            r7 = r1
            goto L_0x01a9
        L_0x019e:
            r0 = move-exception
            r7 = r1
            goto L_0x01a6
        L_0x01a1:
            r0 = move-exception
            r9 = r3
            goto L_0x015d
        L_0x01a4:
            r0 = move-exception
            r7 = r15
        L_0x01a6:
            r9 = r3
            goto L_0x01f4
        L_0x01a8:
            r7 = r15
        L_0x01a9:
            if (r21 != 0) goto L_0x01c5
            if (r19 == 0) goto L_0x01ba
            if (r20 != 0) goto L_0x01ba
            r1 = r22
            r2 = r23
            r9 = r3
            r3 = r24
            r1.m16266a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0210 }
            goto L_0x01bb
        L_0x01ba:
            r9 = r3
        L_0x01bb:
            r22.m16277f()     // Catch:{ all -> 0x0210 }
        L_0x01be:
            r22.m16276e()     // Catch:{ all -> 0x0210 }
            r22.m16273c(r23, r24)     // Catch:{ all -> 0x0210 }
            goto L_0x0210
        L_0x01c5:
            r9 = r3
            monitor-enter(r22)
            int r0 = r8.f14195f     // Catch:{ all -> 0x01d7 }
            int r0 = r0 - r2
            r8.f14195f = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r8.f14194e     // Catch:{ all -> 0x01d7 }
            int r0 = r0 - r2
            r8.f14194e = r0     // Catch:{ all -> 0x01d7 }
            monitor-exit(r22)     // Catch:{ all -> 0x01d7 }
            java.lang.Throwable r0 = m16269b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01d7 }
            throw r0
        L_0x01da:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r9 = r14
            r7 = r15
            r2 = 1
            goto L_0x01f4
        L_0x01e1:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r9 = r14
            r7 = r15
            r2 = 1
            r20 = 0
            goto L_0x01f4
        L_0x01ea:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r9 = r14
            r7 = r15
            r2 = 1
            r20 = 0
            r21 = 0
        L_0x01f4:
            boolean r1 = com.apm.insight.p178l.C6693v.m16679c((java.lang.Throwable) r0)     // Catch:{ all -> 0x0225 }
            if (r1 != 0) goto L_0x01fd
            com.apm.insight.p178l.C6688q.m16630a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0225 }
        L_0x01fd:
            if (r21 != 0) goto L_0x0211
            if (r19 == 0) goto L_0x020c
            if (r20 != 0) goto L_0x020c
            r1 = r22
            r2 = r23
            r3 = r24
            r1.m16266a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0210 }
        L_0x020c:
            r22.m16277f()     // Catch:{ all -> 0x0210 }
            goto L_0x01be
        L_0x0210:
            return r18
        L_0x0211:
            monitor-enter(r22)
            int r0 = r8.f14195f     // Catch:{ all -> 0x0222 }
            int r0 = r0 - r2
            r8.f14195f = r0     // Catch:{ all -> 0x0222 }
            int r0 = r8.f14194e     // Catch:{ all -> 0x0222 }
            int r0 = r0 - r2
            r8.f14194e = r0     // Catch:{ all -> 0x0222 }
            monitor-exit(r22)     // Catch:{ all -> 0x0222 }
            java.lang.Throwable r0 = m16269b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0222:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0222 }
            throw r0
        L_0x0225:
            r0 = move-exception
            if (r21 != 0) goto L_0x023f
            if (r19 == 0) goto L_0x0235
            if (r20 != 0) goto L_0x0235
            r1 = r22
            r2 = r23
            r3 = r24
            r1.m16266a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x023e }
        L_0x0235:
            r22.m16277f()     // Catch:{ all -> 0x023e }
            r22.m16276e()     // Catch:{ all -> 0x023e }
            r22.m16273c(r23, r24)     // Catch:{ all -> 0x023e }
        L_0x023e:
            throw r0
        L_0x023f:
            monitor-enter(r22)
            int r0 = r8.f14195f     // Catch:{ all -> 0x0250 }
            int r0 = r0 - r2
            r8.f14195f = r0     // Catch:{ all -> 0x0250 }
            int r0 = r8.f14194e     // Catch:{ all -> 0x0250 }
            int r0 = r0 - r2
            r8.f14194e = r0     // Catch:{ all -> 0x0250 }
            monitor-exit(r22)     // Catch:{ all -> 0x0250 }
            java.lang.Throwable r0 = m16269b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0250:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0250 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p173g.C6608a.m16265a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: a */
    private void m16266a(Thread thread, Throwable th, boolean z, long j) {
        List<IOOMCallback> a = C6756o.m16977a().mo52281a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback onCrash : a) {
            try {
                onCrash.onCrash(crashType, th, thread, j);
            } catch (Throwable th2) {
                C6688q.m16632b(th2);
            }
        }
    }

    /* renamed from: a */
    public static void m16267a(final Throwable th) {
        if (th != null) {
            try {
                C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            C6594a a = C6594a.m16163a(System.currentTimeMillis(), C6617h.m16313g(), (Thread) null, th);
                            a.mo52052a("userdefine", (Object) 1);
                            C6594a a2 = C6729f.m16893a().mo52278a(CrashType.CUSTOM_JAVA, a);
                            if (a2 != null) {
                                C6645d.m16403a().mo52135b(a2.mo52066h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m16268a(long j) {
        return C6616e.m16296a(j);
    }

    /* renamed from: b */
    private static Throwable m16269b(Throwable th, Thread thread) {
        int i = 0;
        while (i < f14190k.size()) {
            try {
                try {
                    f14190k.get(i).mo52105b(th, thread);
                    i++;
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    /* renamed from: b */
    public static boolean m16270b() {
        return f14188i;
    }

    /* renamed from: b */
    private boolean m16271b(Thread thread, Throwable th) {
        ICrashFilter b = C6617h.m16307b().mo51972b();
        if (b == null) {
            return true;
        }
        try {
            return b.onJavaCrashFilter(th, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static void m16272c(final String str) {
        if (str != null) {
            try {
                C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            C6594a aVar = new C6594a();
                            aVar.mo52052a(C8849c.DATA, (Object) str);
                            aVar.mo52052a("userdefine", (Object) 1);
                            C6594a a = C6729f.m16893a().mo52278a(CrashType.CUSTOM_JAVA, aVar);
                            if (a != null) {
                                C6645d.m16403a().mo52135b(a.mo52066h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private void m16273c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14191b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !C6689r.m16637a(512)) {
            this.f14191b.uncaughtException(thread, th);
        }
    }

    /* renamed from: c */
    public static boolean m16274c() {
        Boolean bool = f14189j.get();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: d */
    private void m16275d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f14191b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: e */
    private void m16276e() {
        synchronized (this) {
            this.f14195f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f14195f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: f */
    private void m16277f() {
        File a = C6685o.m16585a(C6617h.m16313g());
        File a2 = C6685o.m16584a();
        if (!C6675i.m16538b(a) || !C6675i.m16538b(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!C6656i.m16451a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m16278g() {
        return C6718a.m16790a("exception_modules", "oom_callback") == 1;
    }

    /* renamed from: a */
    public void mo52095a(C6613c cVar) {
        this.f14192c = cVar;
    }

    /* renamed from: a */
    public void mo52096a(String str) {
        this.f14196g.put(str, new Object());
    }

    /* renamed from: a */
    public void mo52097a(Thread thread, Throwable th, boolean z, C6594a aVar) {
        List<ICrashCallback> list;
        CrashType crashType;
        if (z) {
            list = C6756o.m16977a().mo52284b();
            crashType = CrashType.LAUNCH;
        } else {
            list = C6756o.m16977a().mo52287c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback next : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                next.onCrash(crashType, C6693v.m16658a(th), thread);
                aVar.mo52054b("callback_cost_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                C6688q.m16632b(th2);
                aVar.mo52054b("callback_err_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: b */
    public void mo52098b(C6613c cVar) {
        this.f14193d = cVar;
    }

    /* renamed from: b */
    public boolean mo52099b(String str) {
        return this.f14196g.containsKey(str);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m16265a(thread, th);
        } while (th != null);
    }
}
