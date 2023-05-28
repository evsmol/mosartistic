package com.yandex.metrica.impl.p082ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.yandex.metrica.impl.ob.Nl */
public final class C2350Nl {

    /* renamed from: c */
    public static final C2351a f6285c = new C2351a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final long f6286a;

    /* renamed from: b */
    private final int f6287b;

    /* renamed from: com.yandex.metrica.impl.ob.Nl$a */
    public static final class C2351a {
        private C2351a() {
        }

        public /* synthetic */ C2351a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2350Nl(long j, int i) {
        this.f6286a = j;
        this.f6287b = i;
    }

    /* renamed from: a */
    public final int mo16369a() {
        return this.f6287b;
    }

    /* renamed from: b */
    public final long mo16370b() {
        return this.f6286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2350Nl)) {
            return false;
        }
        C2350Nl nl = (C2350Nl) obj;
        return this.f6286a == nl.f6286a && this.f6287b == nl.f6287b;
    }

    public int hashCode() {
        long j = this.f6286a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f6287b;
    }

    public String toString() {
        return "DecimalProtoModel(mantissa=" + this.f6286a + ", exponent=" + this.f6287b + ")";
    }
}
