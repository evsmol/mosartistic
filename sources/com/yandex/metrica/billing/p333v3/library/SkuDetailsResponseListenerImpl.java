package com.yandex.metrica.billing.p333v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.billing_interface.C1800c;
import com.yandex.metrica.billing_interface.C1802d;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.impl.p082ob.C2814b;
import com.yandex.metrica.impl.p082ob.C2819b3;
import com.yandex.metrica.impl.p082ob.C3070j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl */
class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {

    /* renamed from: a */
    private final String f26831a;

    /* renamed from: b */
    private final Executor f26832b;

    /* renamed from: c */
    private final BillingClient f26833c;

    /* renamed from: d */
    private final C3070j f26834d;

    /* renamed from: e */
    private final Callable<Void> f26835e;

    /* renamed from: f */
    private final Map<String, C1798a> f26836f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10715b f26837g;

    /* renamed from: com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl$a */
    class C10713a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ BillingResult f26838a;

        /* renamed from: b */
        final /* synthetic */ List f26839b;

        C10713a(BillingResult billingResult, List list) {
            this.f26838a = billingResult;
            this.f26839b = list;
        }

        /* renamed from: a */
        public void mo15219a() throws Throwable {
            SkuDetailsResponseListenerImpl.this.m31551a(this.f26838a, this.f26839b);
            SkuDetailsResponseListenerImpl.this.f26837g.mo64732b(SkuDetailsResponseListenerImpl.this);
        }
    }

    SkuDetailsResponseListenerImpl(String str, Executor executor, BillingClient billingClient, C3070j jVar, Callable<Void> callable, Map<String, C1798a> map, C10715b bVar) {
        this.f26831a = str;
        this.f26832b = executor;
        this.f26833c = billingClient;
        this.f26834d = jVar;
        this.f26835e = callable;
        this.f26836f = map;
        this.f26837g = bVar;
    }

    /* renamed from: b */
    private int m31553b(SkuDetails skuDetails) {
        if (!skuDetails.getFreeTrialPeriod().isEmpty()) {
            return 1;
        }
        try {
            return skuDetails.getIntroductoryPriceCycles();
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: c */
    private C1800c m31554c(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return C1800c.m6728a(skuDetails.getIntroductoryPricePeriod());
        }
        return C1800c.m6728a(skuDetails.getFreeTrialPeriod());
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
        this.f26832b.execute(new C10713a(billingResult, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31551a(BillingResult billingResult, List<SkuDetails> list) throws Throwable {
        if (billingResult.getResponseCode() == 0 && list != null && !list.isEmpty()) {
            Map<String, Purchase> a = m31550a();
            ArrayList arrayList = new ArrayList();
            for (SkuDetails next : list) {
                C1798a aVar = this.f26836f.get(next.getSku());
                Purchase purchase = (Purchase) ((HashMap) a).get(next.getSku());
                if (aVar != null) {
                    arrayList.add(m31549a(next, aVar, purchase));
                }
            }
            ((C2819b3) this.f26834d.mo15230d()).mo17210a((List<C1802d>) arrayList);
            this.f26835e.call();
        }
    }

    /* renamed from: a */
    private Map<String, Purchase> m31550a() {
        HashMap hashMap = new HashMap();
        Purchase.PurchasesResult queryPurchases = this.f26833c.queryPurchases(this.f26831a);
        List<Purchase> purchasesList = queryPurchases.getPurchasesList();
        if (queryPurchases.getResponseCode() == 0 && purchasesList != null) {
            for (Purchase purchase : purchasesList) {
                hashMap.put(purchase.getSku(), purchase);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private C1802d m31549a(SkuDetails skuDetails, C1798a aVar, Purchase purchase) {
        C1798a aVar2 = aVar;
        return new C1802d(C2814b.m9074d(skuDetails.getType()), skuDetails.getSku(), 1, skuDetails.getPriceAmountMicros(), skuDetails.getPriceCurrencyCode(), m31547a(skuDetails), m31554c(skuDetails), m31553b(skuDetails), C1800c.m6728a(skuDetails.getSubscriptionPeriod()), purchase != null ? purchase.getSignature() : "", aVar2.f4911c, aVar2.f4912d, purchase != null ? purchase.isAutoRenewing() : false, purchase != null ? purchase.getOriginalJson() : JsonUtils.EMPTY_JSON);
    }

    /* renamed from: a */
    private long m31547a(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0;
    }
}
