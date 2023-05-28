package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.impl.p082ob.C2867cf;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.Sg */
public final class C2523Sg {

    /* renamed from: a */
    private final C2977fn<String> f6652a;

    /* renamed from: b */
    private final C2977fn<String> f6653b;

    /* renamed from: c */
    private final AdRevenue f6654c;

    /* renamed from: com.yandex.metrica.impl.ob.Sg$a */
    static final class C2524a extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6655a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2524a(C2867cf cfVar) {
            super(1);
            this.f6655a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6655a.f7603e = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Sg$b */
    static final class C2525b extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6656a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2525b(C2867cf cfVar) {
            super(1);
            this.f6656a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6656a.f7606h = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Sg$c */
    static final class C2526c extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6657a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2526c(C2867cf cfVar) {
            super(1);
            this.f6657a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6657a.f7607i = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Sg$d */
    static final class C2527d extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6658a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2527d(C2867cf cfVar) {
            super(1);
            this.f6658a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6658a.f7604f = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Sg$e */
    static final class C2528e extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6659a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2528e(C2867cf cfVar) {
            super(1);
            this.f6659a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6659a.f7605g = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Sg$f */
    static final class C2529f extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6660a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2529f(C2867cf cfVar) {
            super(1);
            this.f6660a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6660a.f7608j = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Sg$g */
    static final class C2530g extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C2867cf f6661a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2530g(C2867cf cfVar) {
            super(1);
            this.f6661a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f6661a.f7601c = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    public C2523Sg(AdRevenue adRevenue, C2875cm cmVar) {
        this.f6654c = adRevenue;
        this.f6652a = new C2905dn(100, "ad revenue strings", cmVar);
        this.f6653b = new C2876cn(30720, "ad revenue payload", cmVar);
    }

    /* renamed from: a */
    public final Pair<byte[], Integer> mo16617a() {
        C2867cf cfVar = new C2867cf();
        Pair pair = TuplesKt.m14544to(this.f6654c.adNetwork, new C2524a(cfVar));
        int i = 0;
        Currency currency = this.f6654c.currency;
        Intrinsics.checkNotNullExpressionValue(currency, "revenue.currency");
        int i2 = 0;
        for (Pair pair2 : CollectionsKt.listOf(pair, TuplesKt.m14544to(this.f6654c.adPlacementId, new C2525b(cfVar)), TuplesKt.m14544to(this.f6654c.adPlacementName, new C2526c(cfVar)), TuplesKt.m14544to(this.f6654c.adUnitId, new C2527d(cfVar)), TuplesKt.m14544to(this.f6654c.adUnitName, new C2528e(cfVar)), TuplesKt.m14544to(this.f6654c.precision, new C2529f(cfVar)), TuplesKt.m14544to(currency.getCurrencyCode(), new C2530g(cfVar)))) {
            String str = (String) pair2.getFirst();
            byte[] e = C2814b.m9075e(str);
            Intrinsics.checkNotNullExpressionValue(e, "StringUtils.stringToBytesForProtobuf(value)");
            byte[] e2 = C2814b.m9075e(this.f6652a.mo16729a(str));
            Intrinsics.checkNotNullExpressionValue(e2, "StringUtils.stringToBytesForProtobuf(result)");
            ((Function1) pair2.getSecond()).invoke(e2);
            i2 += e.length - e2.length;
        }
        Integer num = (Integer) C2567Tg.f6798a.get(this.f6654c.adType);
        if (num != null) {
            i = num.intValue();
        }
        cfVar.f7602d = i;
        C2867cf.C2868a aVar = new C2867cf.C2868a();
        BigDecimal bigDecimal = this.f6654c.adRevenue;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "revenue.adRevenue");
        Pair a = C2407Ol.m8087a(bigDecimal);
        C2350Nl nl = new C2350Nl(((Number) a.getFirst()).longValue(), ((Number) a.getSecond()).intValue());
        aVar.f7610a = nl.mo16370b();
        aVar.f7611b = nl.mo16369a();
        cfVar.f7600b = aVar;
        Map<String, String> map = this.f6654c.payload;
        if (map != null) {
            String g = C2572Tl.m8546g(map);
            byte[] e3 = C2814b.m9075e(this.f6653b.mo16729a(g));
            Intrinsics.checkNotNullExpressionValue(e3, "StringUtils.stringToByte…oadTrimmer.trim(payload))");
            cfVar.f7609k = e3;
            i2 += C2814b.m9075e(g).length - e3.length;
        }
        return TuplesKt.m14544to(MessageNano.toByteArray(cfVar), Integer.valueOf(i2));
    }
}
