package com.yandex.metrica.billing.p333v3.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.impl.p082ob.C3044i;
import com.yandex.metrica.impl.p082ob.C3070j;
import com.yandex.metrica.impl.p082ob.C3108k;
import com.yandex.metrica.impl.p082ob.C3137l;
import com.yandex.metrica.impl.p082ob.C3170m;
import com.yandex.metrica.impl.p082ob.C3295o;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.c */
public class C10716c implements C3070j, C3108k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f26845a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f26846b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f26847c;

    /* renamed from: d */
    private final C3137l f26848d;

    /* renamed from: e */
    private final C3295o f26849e;

    /* renamed from: f */
    private final C3170m f26850f;

    /* renamed from: g */
    private C3044i f26851g;

    /* renamed from: com.yandex.metrica.billing.v3.library.c$a */
    class C10717a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ C3044i f26852a;

        C10717a(C3044i iVar) {
            this.f26852a = iVar;
        }

        /* renamed from: a */
        public void mo15219a() {
            BillingClient build = BillingClient.newBuilder(C10716c.this.f26845a).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            build.startConnection(new BillingClientStateListenerImpl(this.f26852a, C10716c.this.f26846b, C10716c.this.f26847c, build, C10716c.this, new C10715b(build)));
        }
    }

    public C10716c(Context context, Executor executor, Executor executor2, C3137l lVar, C3295o oVar, C3170m mVar) {
        this.f26845a = context;
        this.f26846b = executor;
        this.f26847c = executor2;
        this.f26848d = lVar;
        this.f26849e = oVar;
        this.f26850f = mVar;
    }

    /* renamed from: d */
    public C3170m mo15230d() {
        return this.f26850f;
    }

    /* renamed from: e */
    public C3137l mo15231e() {
        return this.f26848d;
    }

    /* renamed from: f */
    public C3295o mo15232f() {
        return this.f26849e;
    }

    /* renamed from: a */
    public synchronized void mo15227a(C3044i iVar) {
        this.f26851g = iVar;
    }

    /* renamed from: b */
    public void mo15228b() throws Throwable {
        C3044i iVar = this.f26851g;
        if (iVar != null) {
            this.f26847c.execute(new C10717a(iVar));
        }
    }

    /* renamed from: c */
    public Executor mo15229c() {
        return this.f26847c;
    }

    /* renamed from: a */
    public Executor mo15226a() {
        return this.f26846b;
    }
}
