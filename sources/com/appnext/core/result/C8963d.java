package com.appnext.core.result;

/* renamed from: com.appnext.core.result.d */
public final class C8963d {

    /* renamed from: ik */
    private static C8963d f22698ik;

    /* renamed from: if */
    private C8962c f22699if;

    private C8963d() {
    }

    /* renamed from: br */
    public static synchronized C8963d m27050br() {
        C8963d dVar;
        synchronized (C8963d.class) {
            if (f22698ik == null) {
                f22698ik = new C8963d();
            }
            dVar = f22698ik;
        }
        return dVar;
    }

    /* renamed from: bs */
    public final C8962c mo59084bs() {
        return this.f22699if;
    }

    /* renamed from: a */
    public final void mo59083a(C8962c cVar) {
        this.f22699if = cVar;
    }
}
