package com.bytedance.sdk.openadsdk.p000b;

import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0991p;

/* renamed from: com.bytedance.sdk.openadsdk.b.o */
/* compiled from: LastShowAdManager */
public class C0154o {
    /* renamed from: a */
    public static void m728a(final C0477n nVar, final String str) {
        if (nVar != null) {
            C10631h.m31217a().post(new Runnable() {
                public void run() {
                    try {
                        C0991p.m4590a(nVar.mo1397ar().toString(), str);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
