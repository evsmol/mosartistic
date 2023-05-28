package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C4845x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.d */
class C4783d {

    /* renamed from: b */
    private static final String f12171b = C4783d.class.getSimpleName();

    /* renamed from: a */
    final C4845x.C4868d f12172a;

    C4783d(C4845x.C4868d dVar) {
        this.f12172a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo34329a(String str, String str2) {
        if (this.f12172a == null) {
            Logger.m14505e(f12171b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C4845x.C4868d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (Build.VERSION.SDK_INT >= 17) {
            if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                throw new AccessControlException("Trying to access a private function: " + str);
            }
        }
        declaredMethod.invoke(this.f12172a, new Object[]{str2});
    }
}
