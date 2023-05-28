package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.e.v */
public interface C7353v {

    /* renamed from: com.applovin.exoplayer2.e.v$a */
    public static final class C7354a {

        /* renamed from: a */
        public final C7356w f16775a;

        /* renamed from: b */
        public final C7356w f16776b;

        public C7354a(C7356w wVar) {
            this(wVar, wVar);
        }

        public C7354a(C7356w wVar, C7356w wVar2) {
            this.f16775a = (C7356w) C7717a.m22120b(wVar);
            this.f16776b = (C7356w) C7717a.m22120b(wVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7354a aVar = (C7354a) obj;
            return this.f16775a.equals(aVar.f16775a) && this.f16776b.equals(aVar.f16776b);
        }

        public int hashCode() {
            return (this.f16775a.hashCode() * 31) + this.f16776b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f16775a);
            if (this.f16775a.equals(this.f16776b)) {
                str = "";
            } else {
                str = ", " + this.f16776b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.v$b */
    public static class C7355b implements C7353v {

        /* renamed from: a */
        private final long f16777a;

        /* renamed from: b */
        private final C7354a f16778b;

        public C7355b(long j) {
            this(j, 0);
        }

        public C7355b(long j, long j2) {
            this.f16777a = j;
            this.f16778b = new C7354a(j2 == 0 ? C7356w.f16779a : new C7356w(0, j2));
        }

        /* renamed from: a */
        public C7354a mo53869a(long j) {
            return this.f16778b;
        }

        /* renamed from: a */
        public boolean mo53870a() {
            return false;
        }

        /* renamed from: b */
        public long mo53871b() {
            return this.f16777a;
        }
    }

    /* renamed from: a */
    C7354a mo53869a(long j);

    /* renamed from: a */
    boolean mo53870a();

    /* renamed from: b */
    long mo53871b();
}
