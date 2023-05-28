package com.applovin.exoplayer2.p181b;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.b.d */
public final class C6856d implements C7397g {

    /* renamed from: a */
    public static final C6856d f14999a = new C6858a().mo52918a();

    /* renamed from: f */
    public static final C7397g.C7398a<C6856d> f15000f = $$Lambda$d$TEejaa8RuGAX8vn1CuR5m7FJjJg.INSTANCE;

    /* renamed from: b */
    public final int f15001b;

    /* renamed from: c */
    public final int f15002c;

    /* renamed from: d */
    public final int f15003d;

    /* renamed from: e */
    public final int f15004e;

    /* renamed from: g */
    private AudioAttributes f15005g;

    /* renamed from: com.applovin.exoplayer2.b.d$a */
    public static final class C6858a {

        /* renamed from: a */
        private int f15006a = 0;

        /* renamed from: b */
        private int f15007b = 0;

        /* renamed from: c */
        private int f15008c = 1;

        /* renamed from: d */
        private int f15009d = 1;

        /* renamed from: a */
        public C6858a mo52917a(int i) {
            this.f15006a = i;
            return this;
        }

        /* renamed from: a */
        public C6856d mo52918a() {
            return new C6856d(this.f15006a, this.f15007b, this.f15008c, this.f15009d);
        }

        /* renamed from: b */
        public C6858a mo52919b(int i) {
            this.f15007b = i;
            return this;
        }

        /* renamed from: c */
        public C6858a mo52920c(int i) {
            this.f15008c = i;
            return this;
        }

        /* renamed from: d */
        public C6858a mo52921d(int i) {
            this.f15009d = i;
            return this;
        }
    }

    private C6856d(int i, int i2, int i3, int i4) {
        this.f15001b = i;
        this.f15002c = i2;
        this.f15003d = i3;
        this.f15004e = i4;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C6856d m17948a(Bundle bundle) {
        C6858a aVar = new C6858a();
        if (bundle.containsKey(m17949a(0))) {
            aVar.mo52917a(bundle.getInt(m17949a(0)));
        }
        if (bundle.containsKey(m17949a(1))) {
            aVar.mo52919b(bundle.getInt(m17949a(1)));
        }
        if (bundle.containsKey(m17949a(2))) {
            aVar.mo52920c(bundle.getInt(m17949a(2)));
        }
        if (bundle.containsKey(m17949a(3))) {
            aVar.mo52921d(bundle.getInt(m17949a(3)));
        }
        return aVar.mo52918a();
    }

    /* renamed from: a */
    private static String m17949a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public AudioAttributes mo52914a() {
        if (this.f15005g == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f15001b).setFlags(this.f15002c).setUsage(this.f15003d);
            if (C7728ai.f18249a >= 29) {
                usage.setAllowedCapturePolicy(this.f15004e);
            }
            this.f15005g = usage.build();
        }
        return this.f15005g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6856d dVar = (C6856d) obj;
        return this.f15001b == dVar.f15001b && this.f15002c == dVar.f15002c && this.f15003d == dVar.f15003d && this.f15004e == dVar.f15004e;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15001b) * 31) + this.f15002c) * 31) + this.f15003d) * 31) + this.f15004e;
    }
}
