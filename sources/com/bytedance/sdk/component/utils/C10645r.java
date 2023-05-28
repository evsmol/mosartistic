package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.utils.r */
/* compiled from: ProcessUtil */
public class C10645r {

    /* renamed from: a */
    private static String f26529a;

    /* renamed from: a */
    public static boolean m31269a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getApplicationContext().getPackageName().equals(m31271b(context));
    }

    /* renamed from: b */
    public static String m31271b(Context context) {
        if (!TextUtils.isEmpty(f26529a)) {
            return f26529a;
        }
        String a = m31268a();
        f26529a = a;
        if (!TextUtils.isEmpty(a)) {
            return f26529a;
        }
        String b = m31270b();
        f26529a = b;
        if (!TextUtils.isEmpty(b)) {
            return f26529a;
        }
        String c = m31272c(context);
        f26529a = c;
        return c;
    }

    /* renamed from: a */
    private static String m31268a() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static String m31270b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static String m31272c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }
}
