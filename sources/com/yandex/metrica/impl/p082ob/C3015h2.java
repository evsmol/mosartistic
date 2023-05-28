package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import android.util.Log;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.h2 */
public class C3015h2 {

    /* renamed from: a */
    private static final Pattern f7943a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b */
    private static final Pattern f7944b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: com.yandex.metrica.impl.ob.h2$a */
    static class C3016a {

        /* renamed from: a */
        static final String f7945a;

        static {
            String str;
            if (C3015h2.m9660a("com.unity3d.player.UnityPlayer")) {
                str = "unity";
            } else if (C3015h2.m9660a("mono.MonoPackageManager")) {
                str = PluginErrorDetails.Platform.XAMARIN;
            } else if (C3015h2.m9660a("org.apache.cordova.CordovaPlugin")) {
                str = PluginErrorDetails.Platform.CORDOVA;
            } else if (C3015h2.m9660a("com.facebook.react.ReactRootView")) {
                str = "react";
            } else {
                str = C3015h2.m9660a("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
            }
            f7945a = str;
        }
    }

    /* renamed from: a */
    public static void m9658a(String str, Object... objArr) {
        Log.i("AppMetrica-Attribution", String.format(str, objArr));
    }

    /* renamed from: b */
    static void m9663b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Initializing of Metrica, ");
        String str = "release";
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else {
            char charAt = str.charAt(0);
            if (!Character.isUpperCase(charAt)) {
                str = Character.toUpperCase(charAt) + "elease";
            }
        }
        sb.append(str);
        sb.append(" type, Version ");
        sb.append("5.3.0");
        sb.append(", API Level ");
        sb.append(YandexMetrica.getLibraryApiLevel());
        sb.append(", Dated ");
        sb.append("03.03.2023");
        sb.append(".");
        Log.i("AppMetrica", sb.toString());
    }

    /* renamed from: a */
    public static void m9659a(Throwable th, String str, Object... objArr) {
        Log.e("AppMetrica-Attribution", String.format(str, objArr), th);
    }

    /* renamed from: a */
    public static String m9657a() {
        return C3016a.f7945a;
    }

    /* renamed from: a */
    static boolean m9661a(Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f7944b.matcher(str).find();
    }

    /* renamed from: a */
    public static boolean m9660a(String str) {
        return m9662b(str) != null;
    }

    /* renamed from: b */
    public static void m9664b(String str, Object... objArr) {
        Log.w("AppMetrica-Attribution", String.format(str, objArr));
    }

    /* renamed from: b */
    static boolean m9665b(Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f7943a.matcher(str).find();
    }

    /* renamed from: b */
    public static Class m9662b(String str) {
        try {
            return Class.forName(str, false, C3015h2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
