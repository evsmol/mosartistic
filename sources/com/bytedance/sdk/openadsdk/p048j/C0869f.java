package com.bytedance.sdk.openadsdk.p048j;

/* renamed from: com.bytedance.sdk.openadsdk.j.f */
/* compiled from: PlayableLog */
public class C0869f {

    /* renamed from: a */
    private static C0870a f3095a;

    /* renamed from: com.bytedance.sdk.openadsdk.j.f$a */
    /* compiled from: PlayableLog */
    public interface C0870a {
        /* renamed from: a */
        void mo202a(String str, String str2);

        /* renamed from: a */
        void mo203a(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m4153a(C0870a aVar) {
        f3095a = aVar;
    }

    /* renamed from: a */
    public static boolean m4156a() {
        return f3095a != null;
    }

    /* renamed from: a */
    public static void m4154a(String str, String str2) {
        C0870a aVar = f3095a;
        if (aVar != null) {
            aVar.mo202a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m4155a(String str, String str2, Throwable th) {
        if (f3095a != null) {
            if (th == null) {
                th = new Throwable();
            }
            f3095a.mo203a(str, str2, th);
        }
    }
}
