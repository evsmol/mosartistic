package com.bytedance.sdk.component.p323e.p327d;

/* renamed from: com.bytedance.sdk.component.e.d.b */
/* compiled from: Logger */
public class C10596b {

    /* renamed from: a */
    private C10598a f26450a;

    /* renamed from: b */
    private C10599b f26451b;

    /* renamed from: com.bytedance.sdk.component.e.d.b$a */
    /* compiled from: Logger */
    public enum C10598a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$b */
    /* compiled from: Logger */
    public interface C10599b {
        /* renamed from: a */
        void mo64223a(String str, String str2);

        /* renamed from: b */
        void mo64224b(String str, String str2);
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$c */
    /* compiled from: Logger */
    private static class C10600c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10596b f26457a = new C10596b();
    }

    private C10596b() {
        this.f26450a = C10598a.OFF;
        this.f26451b = new C10595a();
    }

    /* renamed from: a */
    public static void m31117a(C10598a aVar) {
        synchronized (C10596b.class) {
            C10600c.f26457a.f26450a = aVar;
        }
    }

    /* renamed from: a */
    public static void m31118a(String str, String str2) {
        if (C10600c.f26457a.f26450a.compareTo(C10598a.ERROR) <= 0) {
            C10600c.f26457a.f26451b.mo64223a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m31119b(String str, String str2) {
        if (C10600c.f26457a.f26450a.compareTo(C10598a.DEBUG) <= 0) {
            C10600c.f26457a.f26451b.mo64224b(str, str2);
        }
    }
}
