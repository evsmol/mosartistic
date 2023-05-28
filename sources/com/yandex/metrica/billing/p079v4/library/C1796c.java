package com.yandex.metrica.billing.p079v4.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.impl.p082ob.C3044i;
import com.yandex.metrica.impl.p082ob.C3070j;
import com.yandex.metrica.impl.p082ob.C3108k;
import com.yandex.metrica.impl.p082ob.C3137l;
import com.yandex.metrica.impl.p082ob.C3170m;
import com.yandex.metrica.impl.p082ob.C3242n;
import com.yandex.metrica.impl.p082ob.C3295o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.billing.v4.library.c */
public final class C1796c implements C3070j, C3108k {

    /* renamed from: a */
    private C3044i f4900a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f4901b;

    /* renamed from: c */
    private final Executor f4902c;

    /* renamed from: d */
    private final Executor f4903d;

    /* renamed from: e */
    private final C3170m f4904e;

    /* renamed from: f */
    private final C3137l f4905f;

    /* renamed from: g */
    private final C3295o f4906g;

    /* renamed from: com.yandex.metrica.billing.v4.library.c$a */
    public static final class C1797a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ C1796c f4907a;

        /* renamed from: b */
        final /* synthetic */ C3044i f4908b;

        C1797a(C1796c cVar, C3044i iVar) {
            this.f4907a = cVar;
            this.f4908b = iVar;
        }

        /* renamed from: a */
        public void mo15219a() {
            BillingClient build = BillingClient.newBuilder(this.f4907a.f4901b).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            Intrinsics.checkNotNullExpressionValue(build, "BillingClient\n          …                 .build()");
            build.startConnection(new BillingClientStateListenerImpl(this.f4908b, build, this.f4907a));
        }
    }

    public C1796c(Context context, Executor executor, Executor executor2, C3242n nVar, C3170m mVar, C3137l lVar, C3295o oVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "workerExecutor");
        Intrinsics.checkNotNullParameter(executor2, "uiExecutor");
        Intrinsics.checkNotNullParameter(nVar, "billingInfoStorage");
        Intrinsics.checkNotNullParameter(mVar, "billingInfoSender");
        Intrinsics.checkNotNullParameter(lVar, "billingInfoManager");
        Intrinsics.checkNotNullParameter(oVar, "updatePolicy");
        this.f4901b = context;
        this.f4902c = executor;
        this.f4903d = executor2;
        this.f4904e = mVar;
        this.f4905f = lVar;
        this.f4906g = oVar;
    }

    /* renamed from: b */
    public void mo15228b() {
        C3044i iVar = this.f4900a;
        if (iVar != null) {
            this.f4903d.execute(new C1797a(this, iVar));
        }
    }

    /* renamed from: c */
    public Executor mo15229c() {
        return this.f4903d;
    }

    /* renamed from: d */
    public C3170m mo15230d() {
        return this.f4904e;
    }

    /* renamed from: e */
    public C3137l mo15231e() {
        return this.f4905f;
    }

    /* renamed from: f */
    public C3295o mo15232f() {
        return this.f4906g;
    }

    /* renamed from: a */
    public synchronized void mo15227a(C3044i iVar) {
        this.f4900a = iVar;
    }

    /* renamed from: a */
    public Executor mo15226a() {
        return this.f4902c;
    }
}
