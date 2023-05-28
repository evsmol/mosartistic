package com.yandex.metrica.billing.p333v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.billing_interface.C1805g;
import com.yandex.metrica.impl.p082ob.C3044i;
import com.yandex.metrica.impl.p082ob.C3070j;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl */
class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: a */
    private final C3044i f26801a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f26802b;

    /* renamed from: c */
    private final Executor f26803c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BillingClient f26804d;

    /* renamed from: e */
    private final C3070j f26805e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10715b f26806f;

    /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$a */
    class C10706a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ BillingResult f26807a;

        C10706a(BillingResult billingResult) {
            this.f26807a = billingResult;
        }

        /* renamed from: a */
        public void mo15219a() throws Throwable {
            BillingClientStateListenerImpl.this.m31529a(this.f26807a);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b */
    class C10707b extends C1804f {

        /* renamed from: a */
        final /* synthetic */ String f26809a;

        /* renamed from: b */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f26810b;

        /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b$a */
        class C10708a extends C1804f {
            C10708a() {
            }

            /* renamed from: a */
            public void mo15219a() {
                BillingClientStateListenerImpl.this.f26806f.mo64732b(C10707b.this.f26810b);
            }
        }

        C10707b(String str, PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
            this.f26809a = str;
            this.f26810b = purchaseHistoryResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo15219a() throws Throwable {
            if (BillingClientStateListenerImpl.this.f26804d.isReady()) {
                BillingClientStateListenerImpl.this.f26804d.queryPurchaseHistoryAsync(this.f26809a, this.f26810b);
            } else {
                BillingClientStateListenerImpl.this.f26802b.execute(new C10708a());
            }
        }
    }

    BillingClientStateListenerImpl(C3044i iVar, Executor executor, Executor executor2, BillingClient billingClient, C3070j jVar, C10715b bVar) {
        this.f26801a = iVar;
        this.f26802b = executor;
        this.f26803c = executor2;
        this.f26804d = billingClient;
        this.f26805e = jVar;
        this.f26806f = bVar;
    }

    public void onBillingServiceDisconnected() {
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        this.f26802b.execute(new C10706a(billingResult));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31529a(BillingResult billingResult) throws Throwable {
        if (billingResult.getResponseCode() == 0) {
            for (String str : Arrays.asList(new String[]{"inapp", "subs"})) {
                C3044i iVar = this.f26801a;
                Executor executor = this.f26802b;
                Executor executor2 = this.f26803c;
                BillingClient billingClient = this.f26804d;
                C3070j jVar = this.f26805e;
                C10715b bVar = this.f26806f;
                PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(iVar, executor, executor2, billingClient, jVar, str, bVar, new C1805g());
                bVar.mo64731a((Object) purchaseHistoryResponseListenerImpl);
                this.f26803c.execute(new C10707b(str, purchaseHistoryResponseListenerImpl));
            }
        }
    }
}
