package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.H0 */
public class C2071H0 {

    /* renamed from: a */
    private final ICommonExecutor f5471a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2170J0 f5472b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2075d f5473c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f5474d = new C2072a();

    /* renamed from: e */
    private final Runnable f5475e = new C2073b();

    /* renamed from: com.yandex.metrica.impl.ob.H0$a */
    class C2072a implements Runnable {
        C2072a() {
        }

        public void run() {
            C2071H0.this.f5472b.mo15554a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.H0$b */
    class C2073b implements Runnable {
        C2073b() {
        }

        public void run() {
            if (((C3565v2) C2071H0.this.f5473c).mo15805b()) {
                C2071H0.this.f5474d.run();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.H0$c */
    public static class C2074c {
        /* renamed from: a */
        public C2071H0 mo15843a(ICommonExecutor iCommonExecutor, C2170J0 j0, C2075d dVar) {
            return new C2071H0(iCommonExecutor, j0, dVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.H0$d */
    public interface C2075d {
    }

    public C2071H0(ICommonExecutor iCommonExecutor, C2170J0 j0, C2075d dVar) {
        this.f5471a = iCommonExecutor;
        this.f5472b = j0;
        this.f5473c = dVar;
    }

    /* renamed from: d */
    public void mo15840d() {
        this.f5471a.remove(this.f5474d);
        this.f5471a.remove(this.f5475e);
    }

    /* renamed from: a */
    public void mo15837a() {
        this.f5471a.remove(this.f5474d);
        this.f5471a.executeDelayed(this.f5474d, 90, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void mo15838b() {
        this.f5471a.execute(this.f5475e);
    }

    /* renamed from: c */
    public void mo15839c() {
        this.f5471a.remove(this.f5474d);
        this.f5471a.executeDelayed(this.f5474d, 90, TimeUnit.SECONDS);
    }
}
