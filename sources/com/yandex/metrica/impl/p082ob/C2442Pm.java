package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.Pm */
public class C2442Pm {

    /* renamed from: a */
    private final C2408Om f6496a;

    /* renamed from: b */
    private volatile ICommonExecutor f6497b;

    /* renamed from: c */
    private volatile ICommonExecutor f6498c;

    /* renamed from: d */
    private volatile ICommonExecutor f6499d;

    /* renamed from: e */
    private volatile IHandlerExecutor f6500e;

    /* renamed from: f */
    private volatile ICommonExecutor f6501f;

    /* renamed from: g */
    private volatile ICommonExecutor f6502g;

    /* renamed from: h */
    private volatile ICommonExecutor f6503h;

    /* renamed from: i */
    private volatile ICommonExecutor f6504i;

    /* renamed from: j */
    private volatile Executor f6505j;

    public C2442Pm() {
        this(new C2408Om());
    }

    /* renamed from: a */
    public ICommonExecutor mo16486a() {
        if (this.f6503h == null) {
            synchronized (this) {
                if (this.f6503h == null) {
                    this.f6496a.getClass();
                    this.f6503h = new C2211Jm("YMM-DE");
                }
            }
        }
        return this.f6503h;
    }

    /* renamed from: b */
    public IHandlerExecutor mo16488b() {
        if (this.f6500e == null) {
            synchronized (this) {
                if (this.f6500e == null) {
                    this.f6496a.getClass();
                    this.f6500e = new C2211Jm("YMM-UH-1");
                }
            }
        }
        return this.f6500e;
    }

    /* renamed from: c */
    public ICommonExecutor mo16490c() {
        if (this.f6497b == null) {
            synchronized (this) {
                if (this.f6497b == null) {
                    this.f6496a.getClass();
                    this.f6497b = new C2211Jm("YMM-MC");
                }
            }
        }
        return this.f6497b;
    }

    /* renamed from: d */
    public ICommonExecutor mo16491d() {
        if (this.f6501f == null) {
            synchronized (this) {
                if (this.f6501f == null) {
                    this.f6496a.getClass();
                    this.f6501f = new C2211Jm("YMM-CTH");
                }
            }
        }
        return this.f6501f;
    }

    /* renamed from: e */
    public ICommonExecutor mo16492e() {
        if (this.f6498c == null) {
            synchronized (this) {
                if (this.f6498c == null) {
                    this.f6496a.getClass();
                    this.f6498c = new C2211Jm("YMM-MSTE");
                }
            }
        }
        return this.f6498c;
    }

    /* renamed from: f */
    public ICommonExecutor mo16493f() {
        if (this.f6504i == null) {
            synchronized (this) {
                if (this.f6504i == null) {
                    this.f6496a.getClass();
                    this.f6504i = new C2211Jm("YMM-RTM");
                }
            }
        }
        return this.f6504i;
    }

    /* renamed from: g */
    public ICommonExecutor mo16494g() {
        if (this.f6502g == null) {
            synchronized (this) {
                if (this.f6502g == null) {
                    this.f6496a.getClass();
                    this.f6502g = new C2211Jm("YMM-SIO");
                }
            }
        }
        return this.f6502g;
    }

    /* renamed from: h */
    public ICommonExecutor mo16495h() {
        if (this.f6499d == null) {
            synchronized (this) {
                if (this.f6499d == null) {
                    this.f6496a.getClass();
                    this.f6499d = new C2211Jm("YMM-TP");
                }
            }
        }
        return this.f6499d;
    }

    /* renamed from: i */
    public Executor mo16496i() {
        if (this.f6505j == null) {
            synchronized (this) {
                if (this.f6505j == null) {
                    C2408Om om = this.f6496a;
                    om.getClass();
                    this.f6505j = new C2352Nm(om, new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.f6505j;
    }

    C2442Pm(C2408Om om) {
        this.f6496a = om;
    }

    /* renamed from: b */
    public C2288Lm mo16489b(Runnable runnable) {
        this.f6496a.getClass();
        return C2322Mm.m7981a("YMM-IB", runnable);
    }

    /* renamed from: a */
    public C2288Lm mo16487a(Runnable runnable) {
        this.f6496a.getClass();
        return C2322Mm.m7981a("YMM-HMSR", runnable);
    }
}
