package com.yandex.metrica.billing.p079v4.library;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.billing_interface.C1802d;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.impl.p082ob.C2819b3;
import com.yandex.metrica.impl.p082ob.C2906e;
import com.yandex.metrica.impl.p082ob.C3070j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0003¢\u0006\u0004\b\b\u0010\rJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006#"}, mo38199d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseResponseListenerImpl;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "b", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "onQueryPurchasesResponse", "Lcom/yandex/metrica/impl/ob/j;", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/android/billingclient/api/SkuDetails;", "d", "Ljava/util/List;", "skuDetails", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "c", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "type", "<init>", "(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/j;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl */
public final class PurchaseResponseListenerImpl implements PurchasesResponseListener {

    /* renamed from: a */
    private final C3070j f4876a;

    /* renamed from: b */
    private final Function0<Unit> f4877b;

    /* renamed from: c */
    private final List<PurchaseHistoryRecord> f4878c;

    /* renamed from: d */
    private final List<SkuDetails> f4879d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1795b f4880e;

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl$a */
    public static final class C1790a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ PurchaseResponseListenerImpl f4881a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f4882b;

        /* renamed from: c */
        final /* synthetic */ List f4883c;

        C1790a(PurchaseResponseListenerImpl purchaseResponseListenerImpl, BillingResult billingResult, List list) {
            this.f4881a = purchaseResponseListenerImpl;
            this.f4882b = billingResult;
            this.f4883c = list;
        }

        /* renamed from: a */
        public void mo15219a() {
            this.f4881a.m6708a(this.f4882b, this.f4883c);
            this.f4881a.f4880e.mo15225b(this.f4881a);
        }
    }

    public PurchaseResponseListenerImpl(String str, C3070j jVar, Function0<Unit> function0, List<? extends PurchaseHistoryRecord> list, List<? extends SkuDetails> list2, C1795b bVar) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(function0, "billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, "purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(list2, "skuDetails");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f4876a = jVar;
        this.f4877b = function0;
        this.f4878c = list;
        this.f4879d = list2;
        this.f4880e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6708a(BillingResult billingResult, List<? extends Purchase> list) {
        C1802d dVar;
        if (billingResult.getResponseCode() == 0) {
            Map<String, Purchase> b = m6709b(list);
            Map<String, PurchaseHistoryRecord> a = m6707a(this.f4878c);
            List<SkuDetails> list2 = this.f4879d;
            ArrayList arrayList = new ArrayList();
            for (SkuDetails skuDetails : list2) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) ((LinkedHashMap) a).get(skuDetails.getSku());
                if (purchaseHistoryRecord != null) {
                    dVar = C2906e.f7688a.mo17474a(purchaseHistoryRecord, skuDetails, (Purchase) ((LinkedHashMap) b).get(skuDetails.getSku()));
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            ((C2819b3) this.f4876a.mo15230d()).mo17210a((List<C1802d>) arrayList);
            this.f4877b.invoke();
        }
    }

    /* renamed from: b */
    private final Map<String, Purchase> m6709b(List<? extends Purchase> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Purchase purchase : list) {
            Iterator<String> it = purchase.getSkus().iterator();
            while (it.hasNext()) {
                String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                linkedHashMap.put(next, purchase);
            }
        }
        return linkedHashMap;
    }

    public void onQueryPurchasesResponse(BillingResult billingResult, List<? extends Purchase> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(list, "purchases");
        this.f4876a.mo15226a().execute(new C1790a(this, billingResult, list));
    }

    /* renamed from: a */
    private final Map<String, PurchaseHistoryRecord> m6707a(List<? extends PurchaseHistoryRecord> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            Iterator<String> it = purchaseHistoryRecord.getSkus().iterator();
            while (it.hasNext()) {
                String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                linkedHashMap.put(next, purchaseHistoryRecord);
            }
        }
        return linkedHashMap;
    }
}
