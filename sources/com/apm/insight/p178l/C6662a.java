package com.apm.insight.p178l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.entity.C6594a;
import com.apm.insight.p166b.C6563f;
import com.apm.insight.runtime.p179a.C6720b;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.a */
public final class C6662a {

    /* renamed from: a */
    private static String f14342a = null;

    /* renamed from: b */
    private static Class<?> f14343b = null;

    /* renamed from: c */
    private static Field f14344c = null;

    /* renamed from: d */
    private static Field f14345d = null;

    /* renamed from: e */
    private static boolean f14346e = false;

    /* renamed from: a */
    private static long m16470a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m16471a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int myPid = Process.myPid();
        int i2 = 0;
        while (i2 < i) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
                    if (next.pid == myPid && next.condition == 2) {
                        return next;
                    }
                }
            }
            i2++;
            if (i == i2 || C6563f.m16052a()) {
                break;
            }
            SystemClock.sleep(200);
        }
        return null;
    }

    /* renamed from: a */
    private static String m16472a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C6677k.m16550a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C6677k.m16550a((Closeable) bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C6677k.m16550a((Closeable) bufferedReader);
            return null;
        }
    }

    /* renamed from: a */
    public static void m16473a(Context context, JSONObject jSONObject) {
        try {
            m16475a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m16478b(jSONObject, activityManager);
            }
            m16476a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16474a(String str) {
        f14342a = str;
    }

    /* renamed from: a */
    private static void m16475a(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m16470a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m16470a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m16470a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m16470a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m16470a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m16470a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m16470a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m16470a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m16470a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C6664c.m16486a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m16470a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C6664c.m16487b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m16470a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m16470a(C6664c.m16488c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: a */
    private static void m16476a(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        boolean z = true;
        C6594a.m16164a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        if (((float) (j - freeMemory)) <= ((float) maxMemory) * 0.95f) {
            z = false;
        }
        C6594a.m16164a(jSONObject, "filters", "java_heap_leak", String.valueOf(z));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static boolean m16477a(Context context) {
        return context == null ? C6720b.m16835d().mo52251f() : C6720b.m16835d().mo52251f() || m16483f(context);
    }

    /* renamed from: b */
    private static void m16478b(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", C6681n.m16581a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: b */
    public static boolean m16479b(Context context) {
        String c = m16480c(context);
        if (c != null && c.contains(":")) {
            return false;
        }
        if (c == null || !c.equals(context.getPackageName())) {
            return c != null && c.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    /* renamed from: c */
    public static String m16480c(Context context) {
        if (!TextUtils.isEmpty(f14342a)) {
            return f14342a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        String str = next.processName;
                        f14342a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m16472a();
        f14342a = a;
        return a == null ? "" : a;
    }

    /* renamed from: d */
    public static String m16481d(Context context) {
        Class<?> g = m16484g(context);
        if (f14344c == null && g != null) {
            try {
                f14344c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f14344c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get((Object) null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m16482e(Context context) {
        Class<?> g = m16484g(context);
        if (f14345d == null && g != null) {
            try {
                f14345d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f14345d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get((Object) null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5 = r5.get(0).topActivity;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m16483f(android.content.Context r5) {
        /*
            java.lang.String r0 = r5.getPackageName()
            r1 = 0
            java.lang.String r2 = "activity"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch:{ all -> 0x005d }
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005d }
            r3 = 21
            if (r2 >= r3) goto L_0x0038
            r2 = 1
            java.util.List r5 = r5.getRunningTasks(r2)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            boolean r3 = r5.isEmpty()     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x005d }
            android.app.ActivityManager$RunningTaskInfo r5 = (android.app.ActivityManager.RunningTaskInfo) r5     // Catch:{ all -> 0x005d }
            android.content.ComponentName r5 = r5.topActivity     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x005d }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            return r2
        L_0x0038:
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x0042:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x005d }
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch:{ all -> 0x005d }
            int r3 = r2.importance     // Catch:{ all -> 0x005d }
            r4 = 100
            if (r3 != r4) goto L_0x0042
            java.lang.String[] r5 = r2.pkgList     // Catch:{ all -> 0x005d }
            r5 = r5[r1]     // Catch:{ all -> 0x005d }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x005d }
            return r5
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p178l.C6662a.m16483f(android.content.Context):boolean");
    }

    /* renamed from: g */
    private static Class<?> m16484g(Context context) {
        if (f14343b == null && !f14346e) {
            try {
                f14343b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f14346e = true;
        }
        return f14343b;
    }
}
