package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.C0484f;

/* renamed from: com.bytedance.sdk.openadsdk.core.e */
/* compiled from: DBAdapter */
public class C0447e extends C0484f {

    /* renamed from: a */
    private static volatile C0447e f1477a;

    private C0447e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C0447e m1823a(Context context) {
        Class<C0447e> cls = C0447e.class;
        if (f1477a == null) {
            synchronized (cls) {
                if (f1477a == null) {
                    f1477a = new C0447e(context);
                }
            }
        }
        return f1477a;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0484f.C0488c mo1193a() {
        return super.mo1193a();
    }
}
