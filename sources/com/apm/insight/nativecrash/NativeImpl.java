package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.C6617h;
import com.apm.insight.p166b.C6560d;
import com.apm.insight.p166b.C6563f;
import com.apm.insight.p166b.C6564g;
import com.apm.insight.p174h.C6620b;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6692u;
import com.apm.insight.p178l.C6696x;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    private static volatile boolean f14382a = false;

    /* renamed from: b */
    private static volatile boolean f14383b = false;

    /* renamed from: c */
    private static boolean f14384c = true;

    /* renamed from: a */
    public static int m16700a(int i) {
        if (f14382a && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m16701a(String str) {
        if (!f14382a) {
            return null;
        }
        return doGetCrashHeader(str);
    }

    /* renamed from: a */
    public static void m16702a(int i, String str) {
        if (f14382a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16703a(long j) {
    }

    /* renamed from: a */
    public static void m16704a(File file) {
        if (f14382a) {
            doRebuildTombstone(C6685o.m16595c(file).getAbsolutePath(), C6685o.m16591b(file).getAbsolutePath(), C6685o.m16599d(file).getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static void m16705a(String str, String str2, String str3) {
        if (f14382a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16706a(boolean z) {
        f14384c = z;
        if (f14382a) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public static boolean m16707a() {
        if (f14383b) {
            return f14382a;
        }
        f14383b = true;
        if (!f14382a) {
            f14382a = C6692u.m16656a("apminsighta");
        }
        return f14382a;
    }

    /* renamed from: a */
    public static boolean m16708a(Context context) {
        String str;
        boolean a = m16707a();
        if (a) {
            String str2 = C6685o.m16615j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                str = context.getApplicationInfo().nativeLibraryDir;
            } else {
                str = C6620b.m16331a();
                C6620b.m16334b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, str, str2, C6617h.m16312f(), C6617h.m16318l());
        }
        return a;
    }

    /* renamed from: b */
    public static int m16709b() {
        if (!f14382a) {
            return -1;
        }
        return doCreateCallbackThread();
    }

    /* renamed from: b */
    public static void m16710b(int i) {
        if (f14382a) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m16711b(long j) {
        if (f14382a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m16712b(String str) {
        if (f14382a) {
            doDumpHprof(str);
        }
    }

    /* renamed from: c */
    public static int m16713c(String str) {
        if (f14382a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m16714c(int i) {
        if (!f14382a) {
            return 0;
        }
        return doGetThreadCpuTime(i);
    }

    /* renamed from: c */
    public static void m16715c() {
    }

    /* renamed from: c */
    public static void m16716c(long j) {
        if (f14382a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m16717d(String str) {
        if (f14382a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m16718d() {
        if (!f14382a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, String str, String str2, String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    /* renamed from: e */
    public static void m16719e(String str) {
        if (f14382a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m16720e() {
        if (!f14382a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m16721f() {
        C6696x.m16692a(new Runnable() {
            public void run() {
                try {
                    NativeImpl.m16731l();
                } catch (Throwable unused) {
                }
            }
        }, "NPTH-AnrMonitor");
    }

    /* renamed from: f */
    public static void m16722f(String str) {
        if (f14382a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m16723g(String str) {
        if (f14382a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static boolean m16724g() {
        return f14384c;
    }

    /* renamed from: h */
    public static int m16725h(String str) {
        if (!f14382a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static void m16726h() {
        if (f14382a) {
            doSignalMainThread();
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: i */
    public static void m16727i() {
        if (f14382a) {
            doSetUploadEnd();
        }
    }

    /* renamed from: i */
    public static void m16728i(String str) {
        if (f14382a) {
            doDump(str);
        }
    }

    private static native boolean is64Bit();

    /* renamed from: j */
    public static void m16729j() {
        if (f14382a) {
            doInitThreadDump();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m16731l() {
        if (f14382a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            C6617h.m16316j();
            C6563f.m16053b(true);
            C6560d.m16047b();
            C6564g.m16054a(C6617h.m16313g()).mo51997a().mo51986e();
        } catch (Throwable unused) {
        }
    }
}
