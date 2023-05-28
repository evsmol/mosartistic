package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.p082ob.C3364q;

/* renamed from: com.yandex.metrica.impl.ob.a0 */
public final class C2786a0 {

    /* renamed from: a */
    private Context f7300a;

    /* renamed from: b */
    private final C3364q.C3366b f7301b;

    /* renamed from: c */
    private final C3364q f7302c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final IReporter f7303d;

    /* renamed from: com.yandex.metrica.impl.ob.a0$a */
    static final class C2787a implements C3364q.C3366b {

        /* renamed from: a */
        final /* synthetic */ C2786a0 f7304a;

        C2787a(C2786a0 a0Var) {
            this.f7304a = a0Var;
        }

        /* renamed from: a */
        public final void mo17137a(Activity activity, C3364q.C3365a aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                this.f7304a.f7303d.resumeSession();
            } else if (ordinal == 2) {
                this.f7304a.f7303d.pauseSession();
            }
        }
    }

    public C2786a0(C3364q qVar) {
        this(qVar, (IReporter) null, 2);
    }

    public C2786a0(C3364q qVar, IReporter iReporter) {
        this.f7302c = qVar;
        this.f7303d = iReporter;
        this.f7301b = new C2787a(this);
    }

    /* renamed from: a */
    public final synchronized void mo17136a(Context context) {
        if (this.f7300a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f7302c.mo18055a(applicationContext);
            this.f7302c.mo18056a(this.f7301b, C3364q.C3365a.RESUMED, C3364q.C3365a.PAUSED);
            this.f7300a = applicationContext;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2786a0(com.yandex.metrica.impl.p082ob.C3364q r1, com.yandex.metrica.IReporter r2, int r3) {
        /*
            r0 = this;
            r2 = r3 & 2
            if (r2 == 0) goto L_0x000e
            com.yandex.metrica.impl.ob.M0 r2 = com.yandex.metrica.impl.p082ob.C3322oh.m10248a()
            java.lang.String r3 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2786a0.<init>(com.yandex.metrica.impl.ob.q, com.yandex.metrica.IReporter, int):void");
    }
}
