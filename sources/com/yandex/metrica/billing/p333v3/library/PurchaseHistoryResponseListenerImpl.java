package com.yandex.metrica.billing.p333v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.billing_interface.C1803e;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.billing_interface.C1805g;
import com.yandex.metrica.impl.p082ob.C2814b;
import com.yandex.metrica.impl.p082ob.C3044i;
import com.yandex.metrica.impl.p082ob.C3070j;
import com.yandex.metrica.impl.p082ob.C3137l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl */
class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    private final C3044i f26813a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f26814b;

    /* renamed from: c */
    private final Executor f26815c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BillingClient f26816d;

    /* renamed from: e */
    private final C3070j f26817e;

    /* renamed from: f */
    private final String f26818f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10715b f26819g;

    /* renamed from: h */
    private final C1805g f26820h;

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$a */
    class C10709a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ BillingResult f26821a;

        /* renamed from: b */
        final /* synthetic */ List f26822b;

        C10709a(BillingResult billingResult, List list) {
            this.f26821a = billingResult;
            this.f26822b = list;
        }

        /* renamed from: a */
        public void mo15219a() throws Throwable {
            PurchaseHistoryResponseListenerImpl.this.m31538a(this.f26821a, (List<PurchaseHistoryRecord>) this.f26822b);
            PurchaseHistoryResponseListenerImpl.this.f26819g.mo64732b(PurchaseHistoryResponseListenerImpl.this);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$b */
    class C10710b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f26824a;

        /* renamed from: b */
        final /* synthetic */ Map f26825b;

        C10710b(Map map, Map map2) {
            this.f26824a = map;
            this.f26825b = map2;
        }

        public Object call() throws Exception {
            PurchaseHistoryResponseListenerImpl.this.mo64729a((Map<String, C1798a>) this.f26824a, (Map<String, C1798a>) this.f26825b);
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c */
    class C10711c extends C1804f {

        /* renamed from: a */
        final /* synthetic */ SkuDetailsParams f26827a;

        /* renamed from: b */
        final /* synthetic */ SkuDetailsResponseListenerImpl f26828b;

        /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c$a */
        class C10712a extends C1804f {
            C10712a() {
            }

            /* renamed from: a */
            public void mo15219a() {
                PurchaseHistoryResponseListenerImpl.this.f26819g.mo64732b(C10711c.this.f26828b);
            }
        }

        C10711c(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
            this.f26827a = skuDetailsParams;
            this.f26828b = skuDetailsResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo15219a() throws Throwable {
            if (PurchaseHistoryResponseListenerImpl.this.f26816d.isReady()) {
                PurchaseHistoryResponseListenerImpl.this.f26816d.querySkuDetailsAsync(this.f26827a, this.f26828b);
            } else {
                PurchaseHistoryResponseListenerImpl.this.f26814b.execute(new C10712a());
            }
        }
    }

    PurchaseHistoryResponseListenerImpl(C3044i iVar, Executor executor, Executor executor2, BillingClient billingClient, C3070j jVar, String str, C10715b bVar, C1805g gVar) {
        this.f26813a = iVar;
        this.f26814b = executor;
        this.f26815c = executor2;
        this.f26816d = billingClient;
        this.f26817e = jVar;
        this.f26818f = str;
        this.f26819g = bVar;
        this.f26820h = gVar;
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        this.f26814b.execute(new C10709a(billingResult, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31538a(BillingResult billingResult, List<PurchaseHistoryRecord> list) throws Throwable {
        if (billingResult.getResponseCode() == 0 && list != null) {
            Map<String, C1798a> a = m31537a(list);
            Map<String, C1798a> a2 = this.f26817e.mo15232f().mo17427a(this.f26813a, a, this.f26817e.mo15231e());
            if (a2.isEmpty()) {
                mo64729a(a, a2);
            } else {
                m31540a(a2, (Callable<Void>) new C10710b(a, a2));
            }
        }
    }

    /* renamed from: a */
    private Map<String, C1798a> m31537a(List<PurchaseHistoryRecord> list) {
        HashMap hashMap = new HashMap();
        for (PurchaseHistoryRecord next : list) {
            C1803e d = C2814b.m9074d(this.f26818f);
            String sku = next.getSku();
            hashMap.put(sku, new C1798a(d, sku, next.getPurchaseToken(), next.getPurchaseTime(), 0));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m31540a(Map<String, C1798a> map, Callable<Void> callable) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f26818f).setSkusList(new ArrayList(map.keySet())).build();
        String str = this.f26818f;
        Executor executor = this.f26814b;
        BillingClient billingClient = this.f26816d;
        C3070j jVar = this.f26817e;
        C10715b bVar = this.f26819g;
        SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = new SkuDetailsResponseListenerImpl(str, executor, billingClient, jVar, callable, map, bVar);
        bVar.mo64731a((Object) skuDetailsResponseListenerImpl);
        this.f26815c.execute(new C10711c(build, skuDetailsResponseListenerImpl));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64729a(Map<String, C1798a> map, Map<String, C1798a> map2) {
        C3137l e = this.f26817e.mo15231e();
        this.f26820h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (C1798a next : map.values()) {
            if (map2.containsKey(next.f4910b)) {
                next.f4913e = currentTimeMillis;
            } else {
                C1798a a = e.mo17316a(next.f4910b);
                if (a != null) {
                    next.f4913e = a.f4913e;
                }
            }
        }
        e.mo17317a(map);
        if (!e.mo17318a() && "inapp".equals(this.f26818f)) {
            e.mo17319b();
        }
    }
}
