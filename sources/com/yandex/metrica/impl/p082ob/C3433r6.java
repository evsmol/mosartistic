package com.yandex.metrica.impl.p082ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.r6 */
public class C3433r6 {

    /* renamed from: c */
    private static SparseArray<C3433r6> f8996c;

    /* renamed from: a */
    public final String f8997a;

    /* renamed from: b */
    public final String f8998b;

    static {
        SparseArray<C3433r6> sparseArray = new SparseArray<>();
        f8996c = sparseArray;
        sparseArray.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED.mo17139b(), new C3433r6("jvm", "binder"));
        f8996c.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo17139b(), new C3433r6("jvm", "binder"));
        f8996c.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo17139b(), new C3433r6("jvm", "intent"));
        f8996c.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo17139b(), new C3433r6("jvm", "file"));
        f8996c.put(C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.mo17139b(), new C3433r6("jni_native", "file"));
        f8996c.put(C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.mo17139b(), new C3433r6("jni_native", "file"));
        f8996c.put(C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.mo17139b(), new C3433r6("jni_native", "file"));
        f8996c.put(C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.mo17139b(), new C3433r6("jni_native", "file"));
        f8996c.put(C2788a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.mo17139b(), new C3433r6("jni_native", "file"));
        f8996c.put(C2788a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.mo17139b(), new C3433r6("jni_native", "binder"));
    }

    private C3433r6(String str, String str2) {
        this.f8997a = str;
        this.f8998b = str2;
    }

    /* renamed from: a */
    public static C3433r6 m10607a(int i) {
        return f8996c.get(i);
    }
}
