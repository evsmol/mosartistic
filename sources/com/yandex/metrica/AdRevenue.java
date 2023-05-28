package com.yandex.metrica;

import com.yandex.metrica.impl.p082ob.C1848A2;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a */
        private final BigDecimal f26708a;

        /* renamed from: b */
        private final Currency f26709b;

        /* renamed from: c */
        private AdType f26710c;

        /* renamed from: d */
        private String f26711d;

        /* renamed from: e */
        private String f26712e;

        /* renamed from: f */
        private String f26713f;

        /* renamed from: g */
        private String f26714g;

        /* renamed from: h */
        private String f26715h;

        /* renamed from: i */
        private String f26716i;

        /* renamed from: j */
        private Map<String, String> f26717j;

        public AdRevenue build() {
            return new AdRevenue(this.f26708a, this.f26709b, this.f26710c, this.f26711d, this.f26712e, this.f26713f, this.f26714g, this.f26715h, this.f26716i, this.f26717j);
        }

        public Builder withAdNetwork(String str) {
            this.f26711d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f26714g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f26715h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f26710c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f26712e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f26713f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f26717j = (map != null && !C1848A2.m6815b((Map) map)) ? new HashMap(map) : null;
            return this;
        }

        public Builder withPrecision(String str) {
            this.f26716i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f26708a = bigDecimal;
            this.f26709b = currency;
        }
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency2) {
        return new Builder(bigDecimal, currency2);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency2, AdType adType2, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        Map<String, String> map2;
        this.adRevenue = bigDecimal;
        this.currency = currency2;
        this.adType = adType2;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        if (map == null) {
            map2 = null;
        } else {
            map2 = C1848A2.m6818d(map);
        }
        this.payload = map2;
    }

    public static Builder newBuilder(long j, Currency currency2) {
        return new Builder(C1848A2.m6799a(j), currency2);
    }

    public static Builder newBuilder(double d, Currency currency2) {
        return new Builder(new BigDecimal(C1848A2.m6792a(d, 0.0d)), currency2);
    }
}
