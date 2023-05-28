package com.applovin.exoplayer2.p221l;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.applovin.exoplayer2.l.b */
public final class C7730b {

    /* renamed from: a */
    private static Method f18264a;

    /* renamed from: a */
    public static IBinder m22270a(Bundle bundle, String str) {
        return C7728ai.f18249a >= 18 ? bundle.getBinder(str) : m22271b(bundle, str);
    }

    /* renamed from: b */
    private static IBinder m22271b(Bundle bundle, String str) {
        String str2;
        Method method = f18264a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f18264a = method2;
                method2.setAccessible(true);
                method = f18264a;
            } catch (NoSuchMethodException e) {
                e = e;
                str2 = "Failed to retrieve getIBinder method";
                C7755q.m22357a("BundleUtil", str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            e = e2;
            str2 = "Failed to invoke getIBinder via reflection";
            C7755q.m22357a("BundleUtil", str2, e);
            return null;
        }
    }
}
