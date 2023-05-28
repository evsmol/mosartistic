package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0906d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.d */
/* compiled from: CommonPermissionUtils */
public class C0963d {

    /* renamed from: a */
    private static final Map<String, C0966a> f3289a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static IListenerManager f3290b;

    /* renamed from: com.bytedance.sdk.openadsdk.utils.d$a */
    /* compiled from: CommonPermissionUtils */
    public interface C0966a {
        /* renamed from: a */
        void mo2902a();

        /* renamed from: a */
        void mo2903a(String str);
    }

    /* renamed from: a */
    public static void m4477a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C0934b.m4334c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C10638l.m31235b("MultiProcess", "handleYes-1，key=" + str);
                            C0963d.m4479b().broadcastPermissionListener(str, (String) null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C0966a b = m4480b(str);
            if (b != null) {
                b.mo2902a();
            }
        }
    }

    /* renamed from: a */
    public static void m4478a(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (C0934b.m4334c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C10638l.m31235b("MultiProcess", "handleNo-1，key=" + str + "，permission=" + str2);
                            C0963d.m4479b().broadcastPermissionListener(str, str2);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C0966a b = m4480b(str);
            if (b != null) {
                b.mo2903a(str2);
            }
        }
    }

    /* renamed from: b */
    private static C0966a m4480b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f3289a.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static IListenerManager m4479b() {
        if (f3290b == null) {
            f3290b = C0906d.asInterface(C0898a.m4299a(C0558m.m2663a()).mo2767a(4));
        }
        return f3290b;
    }
}
