package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;

/* renamed from: com.yandex.metrica.impl.ob.uh */
public class C3551uh {

    /* renamed from: a */
    private final Context f9237a;

    /* renamed from: b */
    private final C1877B0 f9238b;

    /* renamed from: c */
    private final ICommonExecutor f9239c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final CacheControlHttpsConnectionPerformer f9240d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3355ph f9241e;

    /* renamed from: f */
    private final TimeProvider f9242f;

    /* renamed from: g */
    private final IExecutionPolicy f9243g;

    /* renamed from: h */
    private final ActivationBarrier f9244h;

    /* renamed from: i */
    private boolean f9245i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3551uh(android.content.Context r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.B0 r2 = new com.yandex.metrica.impl.ob.B0
            r2.<init>()
            com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer r3 = new com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.sd r0 = r0.mo15757t()
            r0.getClass()
            r0 = 0
            r3.<init>(r0)
            com.yandex.metrica.coreutils.services.SystemTimeProvider r4 = new com.yandex.metrica.coreutils.services.SystemTimeProvider
            r4.<init>()
            com.yandex.metrica.impl.ob.od r5 = new com.yandex.metrica.impl.ob.od
            r5.<init>(r10)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Pm r0 = r0.mo15754q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r0.mo16494g()
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.e9 r7 = r0.mo15756s()
            com.yandex.metrica.coreutils.services.UtilityServiceLocator r0 = com.yandex.metrica.coreutils.services.UtilityServiceLocator.getInstance()
            com.yandex.metrica.coreutils.services.ActivationBarrier r8 = r0.getActivationBarrier()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3551uh.<init>(android.content.Context):void");
    }

    /* renamed from: c */
    static void m10793c(C3551uh uhVar) {
        synchronized (uhVar) {
            uhVar.f9245i = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18271a(com.yandex.metrica.impl.p082ob.C3356pi r11, com.yandex.metrica.impl.p082ob.C1997Eh r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.yandex.metrica.impl.ob.di r5 = r11.mo17959M()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0009
            monitor-exit(r10)
            return
        L_0x0009:
            com.yandex.metrica.impl.ob.B0 r0 = r10.f9238b     // Catch:{ all -> 0x0061 }
            android.content.Context r1 = r10.f9237a     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "certificate.p12"
            java.io.File r3 = r0.mo15519a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0061 }
            r0 = 1
            if (r3 == 0) goto L_0x001e
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r12.mo15725a((java.io.File) r3)     // Catch:{ all -> 0x0061 }
        L_0x0024:
            com.yandex.metrica.coreutils.services.TimeProvider r2 = r10.f9242f     // Catch:{ all -> 0x0061 }
            long r6 = r2.currentTimeSeconds()     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.ph r2 = r10.f9241e     // Catch:{ all -> 0x0061 }
            long r8 = r2.mo17504a()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0036
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
        L_0x0036:
            boolean r1 = r10.f9245i     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x005f
            java.lang.String r2 = r11.mo17973e()     // Catch:{ all -> 0x0061 }
            boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0061 }
            if (r11 != 0) goto L_0x005f
            com.yandex.metrica.networktasks.api.IExecutionPolicy r11 = r10.f9243g     // Catch:{ all -> 0x0061 }
            boolean r11 = r11.canBeExecuted()     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x005f
            r10.f9245i = r0     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.coreutils.services.ActivationBarrier r11 = r10.f9244h     // Catch:{ all -> 0x0061 }
            long r6 = com.yandex.metrica.coreutils.services.ActivationBarrier.ACTIVATION_DELAY     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r8 = r10.f9239c     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.sh r9 = new com.yandex.metrica.impl.ob.sh     // Catch:{ all -> 0x0061 }
            r0 = r9
            r1 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            r11.subscribe(r6, r8, r9)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r10)
            return
        L_0x0061:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3551uh.mo18271a(com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Eh):void");
    }

    C3551uh(Context context, C1877B0 b0, CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, TimeProvider timeProvider, IExecutionPolicy iExecutionPolicy, ICommonExecutor iCommonExecutor, C3355ph phVar, ActivationBarrier activationBarrier) {
        this.f9245i = false;
        this.f9237a = context;
        this.f9238b = b0;
        this.f9240d = cacheControlHttpsConnectionPerformer;
        this.f9242f = timeProvider;
        this.f9243g = iExecutionPolicy;
        this.f9239c = iCommonExecutor;
        this.f9241e = phVar;
        this.f9244h = activationBarrier;
    }

    /* renamed from: a */
    static void m10791a(C3551uh uhVar, long j) {
        uhVar.f9241e.mo17507a(uhVar.f9242f.currentTimeSeconds() + j);
    }
}
