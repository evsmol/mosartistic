package com.yandex.metrica.impl.p081ac;

import com.yandex.metrica.impl.p082ob.C1848A2;
import dalvik.system.PathClassLoader;

/* renamed from: com.yandex.metrica.impl.ac.HandlerRunner */
public class HandlerRunner {
    /* renamed from: a */
    private static void m6768a(String str) {
        try {
            String findLibrary = new PathClassLoader(System.getProperty("java.class.path"), System.getProperty("java.library.path"), ClassLoader.getSystemClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                System.load(findLibrary);
            }
        } catch (Throwable unused) {
        }
    }

    public static void main(String[] strArr) {
        if (C1848A2.m6808a(24)) {
            try {
                System.loadLibrary("appmetrica-native-runner");
            } catch (Throwable unused) {
                m6768a("appmetrica-native-runner");
            }
        } else {
            m6768a("appmetrica-native-runner");
        }
        runHandler(strArr);
    }

    private static native void runHandler(String[] strArr);
}
