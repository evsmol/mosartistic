package com.yandex.metrica.billing.p079v4.library;

import android.os.Handler;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.impl.p082ob.C3044i;
import com.yandex.metrica.impl.p082ob.C3070j;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo38199d2 = {"Lcom/yandex/metrica/billing/v4/library/BillingClientStateListenerImpl;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "a", "(Lcom/android/billingclient/api/BillingResult;)V", "onBillingSetupFinished", "onBillingServiceDisconnected", "()V", "Lcom/yandex/metrica/impl/ob/i;", "Lcom/yandex/metrica/impl/ob/i;", "config", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/yandex/metrica/billing/v4/library/b;", "d", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "<init>", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/billing/v4/library/b;)V", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;)V", "billing-v4_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl */
public final class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: a */
    private final C3044i f4851a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f4852b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3070j f4853c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1795b f4854d;

    /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$a */
    public static final class C1783a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ BillingClientStateListenerImpl f4855a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f4856b;

        C1783a(BillingClientStateListenerImpl billingClientStateListenerImpl, BillingResult billingResult) {
            this.f4855a = billingClientStateListenerImpl;
            this.f4856b = billingResult;
        }

        /* renamed from: a */
        public void mo15219a() {
            this.f4855a.m6697a(this.f4856b);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b */
    public static final class C1784b extends C1804f {

        /* renamed from: a */
        final /* synthetic */ String f4857a;

        /* renamed from: b */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f4858b;

        /* renamed from: c */
        final /* synthetic */ BillingClientStateListenerImpl f4859c;

        /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b$a */
        public static final class C1785a extends C1804f {

            /* renamed from: a */
            final /* synthetic */ C1784b f4860a;

            C1785a(C1784b bVar) {
                this.f4860a = bVar;
            }

            /* renamed from: a */
            public void mo15219a() {
                this.f4860a.f4859c.f4854d.mo15225b(this.f4860a.f4858b);
            }
        }

        C1784b(String str, PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingClientStateListenerImpl billingClientStateListenerImpl) {
            this.f4857a = str;
            this.f4858b = purchaseHistoryResponseListenerImpl;
            this.f4859c = billingClientStateListenerImpl;
        }

        /* renamed from: a */
        public void mo15219a() {
            if (this.f4859c.f4852b.isReady()) {
                this.f4859c.f4852b.queryPurchaseHistoryAsync(this.f4857a, this.f4858b);
            } else {
                this.f4859c.f4853c.mo15226a().execute(new C1785a(this));
            }
        }
    }

    public BillingClientStateListenerImpl(C3044i iVar, BillingClient billingClient, C3070j jVar, C1795b bVar) {
        Intrinsics.checkNotNullParameter(iVar, Constants.CONFIG);
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f4851a = iVar;
        this.f4852b = billingClient;
        this.f4853c = jVar;
        this.f4854d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6697a(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            for (String str : CollectionsKt.listOf("inapp", "subs")) {
                PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(this.f4851a, this.f4852b, this.f4853c, str, this.f4854d);
                this.f4854d.mo15224a((Object) purchaseHistoryResponseListenerImpl);
                this.f4853c.mo15229c().execute(new C1784b(str, purchaseHistoryResponseListenerImpl, this));
            }
        }
    }

    public void onBillingServiceDisconnected() {
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f4853c.mo15226a().execute(new C1783a(this, billingResult));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BillingClientStateListenerImpl(C3044i iVar, BillingClient billingClient, C3070j jVar) {
        this(iVar, billingClient, jVar, new C1795b(billingClient, (Handler) null, 2));
        Intrinsics.checkNotNullParameter(iVar, Constants.CONFIG);
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
    }
}
