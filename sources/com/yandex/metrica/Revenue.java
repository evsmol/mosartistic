package com.yandex.metrica;

import com.yandex.metrica.impl.p082ob.C2069Gn;
import com.yandex.metrica.impl.p082ob.C2103Hn;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import java.util.Currency;

public class Revenue {
    public final Currency currency;
    public final String payload;
    @Deprecated
    public final Double price;
    public final Long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public String f26758a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f26759b;

            Builder() {
            }

            public Receipt build() {
                return new Receipt(this);
            }

            public Builder withData(String str) {
                this.f26758a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f26759b = str;
                return this;
            }
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        private Receipt(Builder builder) {
            this.data = builder.f26758a;
            this.signature = builder.f26759b;
        }
    }

    @Deprecated
    public static Builder newBuilder(double d, Currency currency2) {
        return new Builder(d, currency2);
    }

    public static Builder newBuilderWithMicros(long j, Currency currency2) {
        return new Builder(j, currency2);
    }

    private Revenue(Builder builder) {
        this.price = builder.f26751a;
        this.priceMicros = builder.f26752b;
        this.currency = builder.f26753c;
        this.quantity = builder.f26754d;
        this.productID = builder.f26755e;
        this.payload = builder.f26756f;
        this.receipt = builder.f26757g;
    }

    public static class Builder {

        /* renamed from: h */
        private static final C2252Kn<Currency> f26750h = new C2103Hn(new C2069Gn("revenue currency"));

        /* renamed from: a */
        Double f26751a;

        /* renamed from: b */
        Long f26752b;

        /* renamed from: c */
        Currency f26753c;

        /* renamed from: d */
        Integer f26754d;

        /* renamed from: e */
        String f26755e;

        /* renamed from: f */
        String f26756f;

        /* renamed from: g */
        Receipt f26757g;

        Builder(double d, Currency currency) {
            ((C2103Hn) f26750h).mo15517a(currency);
            this.f26751a = Double.valueOf(d);
            this.f26753c = currency;
        }

        public Revenue build() {
            return new Revenue(this);
        }

        public Builder withPayload(String str) {
            this.f26756f = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f26755e = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f26754d = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f26757g = receipt;
            return this;
        }

        Builder(long j, Currency currency) {
            ((C2103Hn) f26750h).mo15517a(currency);
            this.f26752b = Long.valueOf(j);
            this.f26753c = currency;
        }
    }
}
