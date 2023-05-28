package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.StrictMode;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.h */
public class C8571h {

    /* renamed from: a */
    private static final Map<Integer, Point> f21646a = CollectionUtils.map(2);

    /* renamed from: a */
    public static Point m26081a(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        if (f21646a.containsKey(Integer.valueOf(orientation))) {
            return f21646a.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (m26084b()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        f21646a.put(Integer.valueOf(orientation), point);
        return point;
    }

    /* renamed from: a */
    public static void m26082a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m26083a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static boolean m26084b() {
        return Build.VERSION.SDK_INT >= 17;
    }

    /* renamed from: c */
    public static boolean m26085c() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: d */
    public static boolean m26086d() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: e */
    public static boolean m26087e() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: f */
    public static boolean m26088f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: g */
    public static boolean m26089g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: h */
    public static boolean m26090h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: i */
    public static boolean m26091i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: j */
    public static boolean m26092j() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: k */
    public static boolean m26093k() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
