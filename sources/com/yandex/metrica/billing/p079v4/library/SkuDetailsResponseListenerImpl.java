package com.yandex.metrica.billing.p079v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.impl.p082ob.C3070j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\n\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, mo38199d2 = {"Lcom/yandex/metrica/billing/v4/library/SkuDetailsResponseListenerImpl;", "Lcom/android/billingclient/api/SkuDetailsResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/SkuDetails;", "skuDetails", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "onSkuDetailsResponse", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "e", "Ljava/util/List;", "purchaseHistoryRecords", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "", "Ljava/lang/String;", "type", "Lcom/yandex/metrica/billing/v4/library/b;", "f", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl */
public final class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f4884a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f4885b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3070j f4886c;

    /* renamed from: d */
    private final Function0<Unit> f4887d;

    /* renamed from: e */
    private final List<PurchaseHistoryRecord> f4888e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1795b f4889f;

    /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$a */
    public static final class C1791a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ SkuDetailsResponseListenerImpl f4890a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f4891b;

        /* renamed from: c */
        final /* synthetic */ List f4892c;

        C1791a(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, BillingResult billingResult, List list) {
            this.f4890a = skuDetailsResponseListenerImpl;
            this.f4891b = billingResult;
            this.f4892c = list;
        }

        /* renamed from: a */
        public void mo15219a() {
            this.f4890a.m6711a(this.f4891b, this.f4892c);
            this.f4890a.f4889f.mo15225b(this.f4890a);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b */
    public static final class C1792b extends C1804f {

        /* renamed from: a */
        final /* synthetic */ SkuDetailsResponseListenerImpl f4893a;

        /* renamed from: b */
        final /* synthetic */ PurchaseResponseListenerImpl f4894b;

        /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b$a */
        public static final class C1793a extends C1804f {

            /* renamed from: a */
            final /* synthetic */ C1792b f4895a;

            C1793a(C1792b bVar) {
                this.f4895a = bVar;
            }

            /* renamed from: a */
            public void mo15219a() {
                this.f4895a.f4893a.f4889f.mo15225b(this.f4895a.f4894b);
            }
        }

        C1792b(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, PurchaseResponseListenerImpl purchaseResponseListenerImpl) {
            this.f4893a = skuDetailsResponseListenerImpl;
            this.f4894b = purchaseResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo15219a() {
            if (this.f4893a.f4885b.isReady()) {
                this.f4893a.f4885b.queryPurchasesAsync(this.f4893a.f4884a, (PurchasesResponseListener) this.f4894b);
            } else {
                this.f4893a.f4886c.mo15226a().execute(new C1793a(this));
            }
        }
    }

    public SkuDetailsResponseListenerImpl(String str, BillingClient billingClient, C3070j jVar, Function0<Unit> function0, List<? extends PurchaseHistoryRecord> list, C1795b bVar) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(function0, "billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, "purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f4884a = str;
        this.f4885b = billingClient;
        this.f4886c = jVar;
        this.f4887d = function0;
        this.f4888e = list;
        this.f4889f = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6711a(BillingResult billingResult, List<? extends SkuDetails> list) {
        if (billingResult.getResponseCode() == 0) {
            if (!(list == null || list.isEmpty())) {
                PurchaseResponseListenerImpl purchaseResponseListenerImpl = new PurchaseResponseListenerImpl(this.f4884a, this.f4886c, this.f4887d, this.f4888e, list, this.f4889f);
                this.f4889f.mo15224a((Object) purchaseResponseListenerImpl);
                this.f4886c.mo15229c().execute(new C1792b(this, purchaseResponseListenerImpl));
            }
        }
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f4886c.mo15226a().execute(new C1791a(this, billingResult, list));
    }
}
