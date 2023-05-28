package com.bytedance.sdk.openadsdk.p005c;

import android.util.SparseArray;
import com.bytedance.sdk.component.utils.C10638l;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.c.a */
/* compiled from: BaseHook */
public abstract class C0193a implements C0195c {

    /* renamed from: a */
    private SparseArray<Method> f674a;

    /* renamed from: b */
    private Object f675b;

    /* renamed from: a */
    public abstract String mo519a();

    /* renamed from: a */
    public <T> T mo518a(int i, Object... objArr) {
        Object obj;
        Method method = this.f674a.get(i);
        if (method == null || (obj = this.f675b) == null) {
            String a = mo519a();
            C10638l.m31241d(a, "call method " + i + " failed for null ");
            return null;
        }
        try {
            if (obj instanceof Class) {
                return method.invoke((Object) null, objArr);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            String a2 = mo519a();
            C10638l.m31241d(a2, "call method " + i + " failed: " + th.getMessage());
            return null;
        }
    }
}
