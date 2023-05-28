package com.bytedance.sdk.component.adexpress.p299c;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.component.adexpress.c.b */
/* compiled from: ScreenUtils */
public class C10305b {

    /* renamed from: a */
    private static boolean f25478a;

    /* renamed from: a */
    public static int m29748a(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    /* renamed from: a */
    public static float m29747a(Context context, float f) {
        if (context == null) {
            context = C10262a.m29464a().mo63095c().mo1819b();
        }
        return (f * m29754d(context)) + 0.5f;
    }

    /* renamed from: b */
    public static int m29751b(Context context, float f) {
        if (context == null) {
            context = C10262a.m29464a().mo63095c().mo1819b();
        }
        float d = m29754d(context);
        if (d <= 0.0f) {
            d = 1.0f;
        }
        return (int) ((f / d) + 0.5f);
    }

    /* renamed from: c */
    public static float m29752c(Context context, float f) {
        if (context == null) {
            context = C10262a.m29464a().mo63095c().mo1819b();
        }
        return f * m29754d(context);
    }

    /* renamed from: d */
    private static float m29754d(Context context) {
        try {
            if (f25478a) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = loadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((float) ((Integer) declaredMethod.invoke(loadClass, new Object[0])).intValue()) / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static int m29749a(Context context) {
        if (context == null) {
            context = C10262a.m29464a().mo63095c().mo1819b();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m29750b(Context context) {
        if (context == null) {
            context = C10262a.m29464a().mo63095c().mo1819b();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: c */
    public static int m29753c(Context context) {
        if (context == null) {
            context = C10262a.m29464a().mo63095c().mo1819b();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }
}
