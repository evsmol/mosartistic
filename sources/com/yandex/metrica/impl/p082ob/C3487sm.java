package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.sm */
public class C3487sm {

    /* renamed from: a */
    private final ReentrantLock f9117a;

    /* renamed from: b */
    private final C3518tm f9118b;

    public C3487sm(Context context, String str) {
        this(new ReentrantLock(), new C3518tm(context, str));
    }

    /* renamed from: a */
    public void mo18221a() throws Throwable {
        this.f9117a.lock();
        this.f9118b.mo18240a();
    }

    /* renamed from: b */
    public void mo18222b() {
        this.f9118b.mo18241b();
        this.f9117a.unlock();
    }

    /* renamed from: c */
    public void mo18223c() {
        this.f9118b.mo18242c();
        this.f9117a.unlock();
    }

    C3487sm(ReentrantLock reentrantLock, C3518tm tmVar) {
        this.f9117a = reentrantLock;
        this.f9118b = tmVar;
    }
}
