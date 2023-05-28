package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p082ob.C3544uf;

/* renamed from: com.yandex.metrica.impl.ob.W1 */
class C2675W1 {

    /* renamed from: a */
    private final Revenue f7068a;

    /* renamed from: b */
    private final C2977fn<String> f7069b;

    /* renamed from: c */
    private final C2977fn<String> f7070c;

    /* renamed from: d */
    private final C2977fn<String> f7071d;

    /* renamed from: e */
    private final C2875cm f7072e;

    C2675W1(Revenue revenue, C2875cm cmVar) {
        this.f7072e = cmVar;
        this.f7068a = revenue;
        this.f7069b = new C2876cn(30720, "revenue payload", cmVar);
        this.f7070c = new C2934en(new C2876cn(184320, "receipt data", cmVar), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f7071d = new C2934en(new C2905dn(1000, "receipt signature", cmVar), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<byte[], Integer> mo16989a() {
        C3544uf ufVar = new C3544uf();
        ufVar.f9208c = this.f7068a.currency.getCurrencyCode().getBytes();
        if (C1848A2.m6809a((Object) this.f7068a.price)) {
            ufVar.f9207b = this.f7068a.price.doubleValue();
        }
        if (C1848A2.m6809a((Object) this.f7068a.priceMicros)) {
            ufVar.f9212g = this.f7068a.priceMicros.longValue();
        }
        ufVar.f9209d = C2814b.m9075e(new C2905dn(200, "revenue productID", this.f7072e).mo16729a(this.f7068a.productID));
        Integer num = this.f7068a.quantity;
        if (num == null) {
            num = 1;
        }
        ufVar.f9206a = num.intValue();
        ufVar.f9210e = C2814b.m9075e(this.f7069b.mo16729a(this.f7068a.payload));
        int i = 0;
        if (C1848A2.m6809a((Object) this.f7068a.receipt)) {
            C3544uf.C3545a aVar = new C3544uf.C3545a();
            String a = this.f7070c.mo16729a(this.f7068a.receipt.data);
            if (C2814b.m9071b(this.f7068a.receipt.data, a)) {
                i = this.f7068a.receipt.data.length() + 0;
            }
            aVar.f9218a = C2814b.m9075e(a);
            aVar.f9219b = C2814b.m9075e(this.f7071d.mo16729a(this.f7068a.receipt.signature));
            ufVar.f9211f = aVar;
        }
        return new Pair<>(MessageNano.toByteArray(ufVar), Integer.valueOf(i));
    }
}
