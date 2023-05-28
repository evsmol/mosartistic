package com.bytedance.sdk.openadsdk.core.p023g;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* renamed from: com.bytedance.sdk.openadsdk.core.g.b */
/* compiled from: PermissionActivityCompat */
public class C0494b {
    /* renamed from: a */
    public static void m2260a(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.requestPermissions(strArr, i);
        }
    }

    /* renamed from: a */
    public static int m2259a(Context context, String str) {
        if (str != null) {
            try {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            } catch (Throwable th) {
                th.printStackTrace();
                return Build.VERSION.SDK_INT >= 23 ? -1 : 0;
            }
        } else {
            throw new IllegalArgumentException("permission is null");
        }
    }
}
