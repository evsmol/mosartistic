package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;

/* renamed from: com.yandex.metrica.impl.ob.Sc */
class C2518Sc implements C2022Fc {

    /* renamed from: a */
    private final Context f6634a;

    /* renamed from: b */
    private C3356pi f6635b;

    /* renamed from: c */
    private volatile C3208mc f6636c;

    /* renamed from: d */
    private final C2594U7 f6637d;

    /* renamed from: e */
    private final C2555T7 f6638e;

    /* renamed from: f */
    private final TimeProvider f6639f;

    /* renamed from: g */
    private final C2964fd f6640g;

    /* renamed from: h */
    private final ActivationBarrier f6641h;

    /* renamed from: i */
    private final ActivationBarrier.IActivationBarrierCallback f6642i;

    /* renamed from: j */
    private final ICommonExecutor f6643j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6644k;

    /* renamed from: com.yandex.metrica.impl.ob.Sc$a */
    class C2519a implements ActivationBarrier.IActivationBarrierCallback {
        C2519a() {
        }

        public void onWaitFinished() {
            boolean unused = C2518Sc.this.f6644k = true;
            C2518Sc.m8329a(C2518Sc.this);
        }
    }

    public C2518Sc(Context context, C3356pi piVar, C3208mc mcVar, C2594U7 u7, C2555T7 t7, ICommonExecutor iCommonExecutor) {
        this(context, piVar, mcVar, u7, t7, iCommonExecutor, new SystemTimeProvider(), new C2964fd(), UtilityServiceLocator.getInstance().getActivationBarrier());
    }

    /* renamed from: a */
    static void m8329a(C2518Sc sc) {
        C3208mc mcVar = sc.f6636c;
        if (mcVar != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(sc.f6640g.mo17598a(sc.f6634a, sc.f6635b, mcVar, sc));
        }
    }

    C2518Sc(Context context, C3356pi piVar, C3208mc mcVar, C2594U7 u7, C2555T7 t7, ICommonExecutor iCommonExecutor, TimeProvider timeProvider, C2964fd fdVar, ActivationBarrier activationBarrier) {
        this.f6644k = false;
        this.f6634a = context;
        this.f6636c = mcVar;
        this.f6635b = piVar;
        this.f6637d = u7;
        this.f6638e = t7;
        this.f6643j = iCommonExecutor;
        this.f6639f = timeProvider;
        this.f6640g = fdVar;
        this.f6641h = activationBarrier;
        this.f6642i = new C2519a();
    }

    /* renamed from: a */
    public void mo15784a() {
        if (!(m8330a((C2180J7) this.f6637d) || m8330a((C2180J7) this.f6638e))) {
            return;
        }
        if (!this.f6644k) {
            this.f6641h.subscribe(ActivationBarrier.ACTIVATION_DELAY, this.f6643j, this.f6642i);
            return;
        }
        C3208mc mcVar = this.f6636c;
        if (mcVar != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(this.f6640g.mo17598a(this.f6634a, this.f6635b, mcVar, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8330a(com.yandex.metrica.impl.p082ob.C2180J7 r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.mc r0 = r9.f6636c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            com.yandex.metrica.impl.ob.mc r0 = r9.f6636c
            if (r0 == 0) goto L_0x001c
            int r0 = r0.f8309c
            long r3 = (long) r0
            long r5 = r10.mo15988c()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0040
            com.yandex.metrica.impl.ob.mc r0 = r9.f6636c
            if (r0 == 0) goto L_0x003b
            long r3 = r0.f8311e
            com.yandex.metrica.coreutils.services.TimeProvider r0 = r9.f6639f
            long r5 = r0.currentTimeMillis()
            long r7 = r10.mo15985b()
            long r5 = r5 - r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0036
            r10 = 1
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x003b
            r10 = 1
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2518Sc.m8330a(com.yandex.metrica.impl.ob.J7):boolean");
    }

    /* renamed from: a */
    public void mo16608a(C3356pi piVar) {
        this.f6635b = piVar;
    }

    /* renamed from: a */
    public void mo16607a(C3208mc mcVar) {
        this.f6636c = mcVar;
    }
}
