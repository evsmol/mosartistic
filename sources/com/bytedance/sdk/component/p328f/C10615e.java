package com.bytedance.sdk.component.p328f;

import com.bytedance.sdk.component.p328f.C10607a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.f.e */
/* compiled from: TTExecutor */
public class C10615e {

    /* renamed from: a */
    public static final int f26491a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static C10612c f26492b;

    /* renamed from: c */
    public static int f26493c = 120;

    /* renamed from: d */
    public static boolean f26494d = true;

    /* renamed from: e */
    private static volatile ThreadPoolExecutor f26495e;

    /* renamed from: f */
    private static volatile ThreadPoolExecutor f26496f;

    /* renamed from: g */
    private static volatile ThreadPoolExecutor f26497g;

    /* renamed from: h */
    private static volatile ScheduledExecutorService f26498h;

    /* renamed from: a */
    public static ExecutorService m31156a() {
        return m31157a(10);
    }

    /* renamed from: a */
    public static ExecutorService m31157a(int i) {
        if (f26495e == null) {
            synchronized (C10615e.class) {
                if (f26495e == null) {
                    f26495e = new C10607a.C10609a().mo64234a("io").mo64232a(4).mo64239b(i).mo64233a(40).mo64237a(TimeUnit.SECONDS).mo64235a((BlockingQueue<Runnable>) new PriorityBlockingQueue(f26491a)).mo64236a(m31171f()).mo64238a();
                    f26495e.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f26495e;
    }

    /* renamed from: a */
    public static void m31159a(C10618g gVar) {
        if (f26495e == null) {
            m31156a();
        }
        if (f26495e != null) {
            f26495e.execute(gVar);
        }
    }

    /* renamed from: a */
    public static void m31160a(C10618g gVar, int i) {
        if (f26495e == null) {
            m31156a();
        }
        if (gVar != null && f26495e != null) {
            gVar.mo64255a(i);
            f26495e.execute(gVar);
        }
    }

    /* renamed from: a */
    public static void m31161a(C10618g gVar, int i, int i2) {
        if (f26495e == null) {
            m31157a(i2);
        }
        if (gVar != null && f26495e != null) {
            gVar.mo64255a(i);
            f26495e.execute(gVar);
        }
    }

    /* renamed from: b */
    public static ExecutorService m31163b() {
        if (f26496f == null) {
            synchronized (C10615e.class) {
                if (f26496f == null) {
                    f26496f = new C10607a.C10609a().mo64234a("log").mo64239b(10).mo64232a(2).mo64233a(40).mo64237a(TimeUnit.SECONDS).mo64235a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).mo64236a(m31171f()).mo64238a();
                    f26496f.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f26496f;
    }

    /* renamed from: b */
    public static void m31165b(C10618g gVar) {
        if (f26496f == null) {
            m31163b();
        }
        if (f26496f != null) {
            f26496f.execute(gVar);
        }
    }

    /* renamed from: b */
    public static void m31166b(C10618g gVar, int i) {
        if (f26496f == null) {
            m31163b();
        }
        if (gVar != null && f26496f != null) {
            gVar.mo64255a(i);
            f26496f.execute(gVar);
        }
    }

    /* renamed from: c */
    public static void m31168c(C10618g gVar, int i) {
        if (f26497g == null) {
            m31167c();
        }
        if (gVar != null && f26497g != null) {
            gVar.mo64255a(i);
            f26497g.execute(gVar);
        }
    }

    /* renamed from: c */
    public static ExecutorService m31167c() {
        if (f26497g == null) {
            synchronized (C10615e.class) {
                if (f26497g == null) {
                    f26497g = new C10607a.C10609a().mo64234a("aidl").mo64239b(10).mo64232a(2).mo64233a(30).mo64237a(TimeUnit.SECONDS).mo64235a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).mo64236a(m31171f()).mo64238a();
                    f26497g.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f26497g;
    }

    /* renamed from: d */
    public static ScheduledExecutorService m31169d() {
        if (f26498h == null) {
            synchronized (C10615e.class) {
                if (f26498h == null) {
                    f26498h = Executors.newSingleThreadScheduledExecutor(new C10619h(5, "scheduled"));
                }
            }
        }
        return f26498h;
    }

    /* renamed from: e */
    public static boolean m31170e() {
        return f26494d;
    }

    /* renamed from: a */
    public static void m31162a(boolean z) {
        f26494d = z;
    }

    /* renamed from: f */
    public static RejectedExecutionHandler m31171f() {
        return new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    /* renamed from: g */
    public static C10612c m31172g() {
        return f26492b;
    }

    /* renamed from: a */
    public static void m31158a(C10612c cVar) {
        f26492b = cVar;
    }

    /* renamed from: b */
    public static void m31164b(int i) {
        f26493c = i;
    }
}
