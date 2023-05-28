package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3598w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.ib */
public final class C3056ib {

    /* renamed from: a */
    private C2637Uh f8044a;

    /* renamed from: b */
    private C2991gb f8045b;

    /* renamed from: c */
    private final C3598w f8046c;

    /* renamed from: d */
    private final C3025hb f8047d;

    /* renamed from: com.yandex.metrica.impl.ob.ib$a */
    static final class C3057a implements C3598w.C3600b {

        /* renamed from: a */
        final /* synthetic */ C3056ib f8048a;

        C3057a(C3056ib ibVar) {
            this.f8048a = ibVar;
        }

        /* renamed from: a */
        public final void mo17481a(C3598w.C3599a aVar) {
            this.f8048a.m9745b();
        }
    }

    public C3056ib(C3598w wVar, C3025hb hbVar) {
        this.f8046c = wVar;
        this.f8047d = hbVar;
    }

    /* renamed from: b */
    public synchronized void mo17711b(C3356pi piVar) {
        if (!Intrinsics.areEqual((Object) piVar.mo17981m(), (Object) this.f8044a)) {
            this.f8044a = piVar.mo17981m();
            C2991gb gbVar = this.f8045b;
            if (gbVar != null) {
                gbVar.mo17630a();
            }
            this.f8045b = null;
            if (m9744a()) {
                if (this.f8045b == null) {
                    C2637Uh uh = this.f8044a;
                    if (uh != null) {
                        this.f8045b = this.f8047d.mo17656a(uh);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17710a(C3356pi piVar) {
        this.f8044a = piVar.mo17981m();
        this.f8046c.mo18345a((C3598w.C3600b) new C3057a(this));
        m9745b();
    }

    /* renamed from: a */
    private final boolean m9744a() {
        boolean z;
        C2637Uh uh = this.f8044a;
        if (uh == null) {
            return false;
        }
        C3598w.C3599a c = this.f8046c.mo18348c();
        Intrinsics.checkNotNullExpressionValue(c, "applicationStateProvider.currentState");
        if (!(uh.mo16844c().length() > 0)) {
            return false;
        }
        int ordinal = c.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            z = uh.mo16845d();
        } else if (ordinal == 2) {
            z = true;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m9745b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.gb r0 = r2.f8045b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            boolean r1 = r2.m9744a()     // Catch:{ all -> 0x0031 }
            if (r1 != r0) goto L_0x0010
            monitor-exit(r2)
            return
        L_0x0010:
            if (r0 == 0) goto L_0x001e
            com.yandex.metrica.impl.ob.gb r0 = r2.f8045b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0019
            r0.mo17630a()     // Catch:{ all -> 0x0031 }
        L_0x0019:
            r0 = 0
            r2.f8045b = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)
            return
        L_0x001e:
            com.yandex.metrica.impl.ob.gb r0 = r2.f8045b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0023
            goto L_0x002f
        L_0x0023:
            com.yandex.metrica.impl.ob.Uh r0 = r2.f8044a     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.yandex.metrica.impl.ob.hb r1 = r2.f8047d     // Catch:{ all -> 0x0031 }
            com.yandex.metrica.impl.ob.gb r0 = r1.mo17656a(r0)     // Catch:{ all -> 0x0031 }
            r2.f8045b = r0     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r2)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3056ib.m9745b():void");
    }
}
