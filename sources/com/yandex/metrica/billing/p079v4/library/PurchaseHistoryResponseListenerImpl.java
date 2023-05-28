package com.yandex.metrica.billing.p079v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.billing_interface.C1803e;
import com.yandex.metrica.billing_interface.C1804f;
import com.yandex.metrica.billing_interface.C1805g;
import com.yandex.metrica.impl.p082ob.C2978g;
import com.yandex.metrica.impl.p082ob.C3044i;
import com.yandex.metrica.impl.p082ob.C3070j;
import com.yandex.metrica.impl.p082ob.C3137l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\rJ9\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003¢\u0006\u0004\b\b\u0010\u0011J'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, mo38199d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseHistoryResponseListenerImpl;", "Lcom/android/billingclient/api/PurchaseHistoryResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "Lcom/yandex/metrica/billing_interface/a;", "(Ljava/util/List;)Ljava/util/Map;", "newSkus", "Lkotlin/Function0;", "billingInfoSentListener", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "list", "onPurchaseHistoryResponse", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/yandex/metrica/impl/ob/i;", "Lcom/yandex/metrica/impl/ob/i;", "config", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "d", "Ljava/lang/String;", "type", "<init>", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Ljava/lang/String;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl */
public final class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    private final C3044i f4861a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f4862b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3070j f4863c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f4864d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1795b f4865e;

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$a */
    public static final class C1786a extends C1804f {

        /* renamed from: a */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f4866a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f4867b;

        /* renamed from: c */
        final /* synthetic */ List f4868c;

        C1786a(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingResult billingResult, List list) {
            this.f4866a = purchaseHistoryResponseListenerImpl;
            this.f4867b = billingResult;
            this.f4868c = list;
        }

        /* renamed from: a */
        public void mo15219a() {
            this.f4866a.m6702a(this.f4867b, this.f4868c);
            this.f4866a.f4865e.mo15225b(this.f4866a);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$b */
    static final class C1787b extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f4869a;

        /* renamed from: b */
        final /* synthetic */ Map f4870b;

        /* renamed from: c */
        final /* synthetic */ Map f4871c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1787b(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, Map map, Map map2) {
            super(0);
            this.f4869a = purchaseHistoryResponseListenerImpl;
            this.f4870b = map;
            this.f4871c = map2;
        }

        public Object invoke() {
            C2978g gVar = C2978g.f7879a;
            Map map = this.f4870b;
            Map map2 = this.f4871c;
            String access$getType$p = this.f4869a.f4864d;
            C3137l e = this.f4869a.f4863c.mo15231e();
            Intrinsics.checkNotNullExpressionValue(e, "utilsProvider.billingInfoManager");
            C2978g.m9591a(gVar, map, map2, access$getType$p, e, (C1805g) null, 16);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c */
    public static final class C1788c extends C1804f {

        /* renamed from: a */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f4872a;

        /* renamed from: b */
        final /* synthetic */ SkuDetailsParams f4873b;

        /* renamed from: c */
        final /* synthetic */ SkuDetailsResponseListenerImpl f4874c;

        /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c$a */
        public static final class C1789a extends C1804f {

            /* renamed from: a */
            final /* synthetic */ C1788c f4875a;

            C1789a(C1788c cVar) {
                this.f4875a = cVar;
            }

            /* renamed from: a */
            public void mo15219a() {
                this.f4875a.f4872a.f4865e.mo15225b(this.f4875a.f4874c);
            }
        }

        C1788c(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, SkuDetailsParams skuDetailsParams, SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
            this.f4872a = purchaseHistoryResponseListenerImpl;
            this.f4873b = skuDetailsParams;
            this.f4874c = skuDetailsResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo15219a() {
            if (this.f4872a.f4862b.isReady()) {
                this.f4872a.f4862b.querySkuDetailsAsync(this.f4873b, this.f4874c);
            } else {
                this.f4872a.f4863c.mo15226a().execute(new C1789a(this));
            }
        }
    }

    public PurchaseHistoryResponseListenerImpl(C3044i iVar, BillingClient billingClient, C3070j jVar, String str, C1795b bVar) {
        Intrinsics.checkNotNullParameter(iVar, Constants.CONFIG);
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f4861a = iVar;
        this.f4862b = billingClient;
        this.f4863c = jVar;
        this.f4864d = str;
        this.f4865e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6702a(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            Map<String, C1798a> a = m6701a(list);
            Map<String, C1798a> a2 = this.f4863c.mo15232f().mo17427a(this.f4861a, a, this.f4863c.mo15231e());
            Intrinsics.checkNotNullExpressionValue(a2, "utilsProvider.updatePoli…lingInfoManager\n        )");
            if (a2.isEmpty()) {
                C2978g gVar = C2978g.f7879a;
                String str = this.f4864d;
                C3137l e = this.f4863c.mo15231e();
                Intrinsics.checkNotNullExpressionValue(e, "utilsProvider.billingInfoManager");
                C2978g.m9591a(gVar, a, a2, str, e, (C1805g) null, 16);
                return;
            }
            m6703a(list, CollectionsKt.toList(a2.keySet()), new C1787b(this, a, a2));
        }
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f4863c.mo15226a().execute(new C1786a(this, billingResult, list));
    }

    /* renamed from: a */
    private final Map<String, C1798a> m6701a(List<? extends PurchaseHistoryRecord> list) {
        C1803e eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            Iterator<String> it = purchaseHistoryRecord.getSkus().iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str = this.f4864d;
                Intrinsics.checkNotNullParameter(str, "type");
                int hashCode = str.hashCode();
                if (hashCode != 3541555) {
                    if (hashCode == 100343516 && str.equals("inapp")) {
                        eVar = C1803e.INAPP;
                        C1798a aVar = new C1798a(eVar, next, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                        Intrinsics.checkNotNullExpressionValue(next, "info.sku");
                        linkedHashMap.put(next, aVar);
                    }
                } else if (str.equals("subs")) {
                    eVar = C1803e.SUBS;
                    C1798a aVar2 = new C1798a(eVar, next, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                    Intrinsics.checkNotNullExpressionValue(next, "info.sku");
                    linkedHashMap.put(next, aVar2);
                }
                eVar = C1803e.UNKNOWN;
                C1798a aVar22 = new C1798a(eVar, next, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                Intrinsics.checkNotNullExpressionValue(next, "info.sku");
                linkedHashMap.put(next, aVar22);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private final void m6703a(List<? extends PurchaseHistoryRecord> list, List<String> list2, Function0<Unit> function0) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f4864d).setSkusList(list2).build();
        Intrinsics.checkNotNullExpressionValue(build, "SkuDetailsParams.newBuil…kus)\n            .build()");
        SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = new SkuDetailsResponseListenerImpl(this.f4864d, this.f4862b, this.f4863c, function0, list, this.f4865e);
        this.f4865e.mo15224a((Object) skuDetailsResponseListenerImpl);
        this.f4863c.mo15229c().execute(new C1788c(this, build, skuDetailsResponseListenerImpl));
    }
}
