package com.applovin.exoplayer2.p186e;

/* renamed from: com.applovin.exoplayer2.e.w */
public final class C7356w {

    /* renamed from: a */
    public static final C7356w f16779a = new C7356w(0, 0);

    /* renamed from: b */
    public final long f16780b;

    /* renamed from: c */
    public final long f16781c;

    public C7356w(long j, long j2) {
        this.f16780b = j;
        this.f16781c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7356w wVar = (C7356w) obj;
        return this.f16780b == wVar.f16780b && this.f16781c == wVar.f16781c;
    }

    public int hashCode() {
        return (((int) this.f16780b) * 31) + ((int) this.f16781c);
    }

    public String toString() {
        return "[timeUs=" + this.f16780b + ", position=" + this.f16781c + "]";
    }
}
