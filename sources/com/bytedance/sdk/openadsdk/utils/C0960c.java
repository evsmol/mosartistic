package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0905c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.c */
/* compiled from: CommonDialogHelper */
public class C0960c {

    /* renamed from: a */
    private static final Map<String, C0962a> f3285a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static IListenerManager f3286b;

    /* renamed from: com.bytedance.sdk.openadsdk.utils.c$a */
    /* compiled from: CommonDialogHelper */
    public interface C0962a {
        /* renamed from: a */
        void mo2897a();

        /* renamed from: b */
        void mo2898b();

        /* renamed from: c */
        void mo2899c();
    }

    /* renamed from: a */
    public static void m4467a(String str) {
        m4468a(str, 1);
    }

    /* renamed from: b */
    public static void m4470b(String str) {
        m4468a(str, 2);
    }

    /* renamed from: c */
    public static void m4471c(String str) {
        m4468a(str, 3);
    }

    /* renamed from: d */
    public static C0962a m4472d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f3285a.remove(str);
    }

    /* renamed from: a */
    private static void m4468a(final String str, final int i) {
        if (!TextUtils.isEmpty(str)) {
            if (C0934b.m4334c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C0960c.m4469b().broadcastDialogListener(str, i);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C0962a d = m4472d(str);
            if (d != null) {
                if (i == 1) {
                    d.mo2897a();
                } else if (i == 2) {
                    d.mo2898b();
                } else if (i != 3) {
                    d.mo2899c();
                } else {
                    d.mo2899c();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static IListenerManager m4469b() {
        if (f3286b == null) {
            f3286b = C0905c.asInterface(C0898a.m4299a(C0558m.m2663a()).mo2767a(2));
        }
        return f3286b;
    }
}
