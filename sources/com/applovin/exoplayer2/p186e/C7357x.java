package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.x */
public interface C7357x {

    /* renamed from: com.applovin.exoplayer2.e.x$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$a(C7357x xVar, C7668g gVar, int i, boolean z) throws IOException {
            return xVar.mo53949a(gVar, i, z, 0);
        }

        public static void $default$a(C7357x xVar, C7772y yVar, int i) {
            xVar.mo53952a(yVar, i, 0);
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.x$a */
    public static final class C7358a {

        /* renamed from: a */
        public final int f16782a;

        /* renamed from: b */
        public final byte[] f16783b;

        /* renamed from: c */
        public final int f16784c;

        /* renamed from: d */
        public final int f16785d;

        public C7358a(int i, byte[] bArr, int i2, int i3) {
            this.f16782a = i;
            this.f16783b = bArr;
            this.f16784c = i2;
            this.f16785d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7358a aVar = (C7358a) obj;
            return this.f16782a == aVar.f16782a && this.f16784c == aVar.f16784c && this.f16785d == aVar.f16785d && Arrays.equals(this.f16783b, aVar.f16783b);
        }

        public int hashCode() {
            return (((((this.f16782a * 31) + Arrays.hashCode(this.f16783b)) * 31) + this.f16784c) * 31) + this.f16785d;
        }
    }

    /* renamed from: a */
    int mo53948a(C7668g gVar, int i, boolean z) throws IOException;

    /* renamed from: a */
    int mo53949a(C7668g gVar, int i, boolean z, int i2) throws IOException;

    /* renamed from: a */
    void mo53950a(long j, int i, int i2, int i3, C7358a aVar);

    /* renamed from: a */
    void mo53951a(C7772y yVar, int i);

    /* renamed from: a */
    void mo53952a(C7772y yVar, int i, int i2);

    /* renamed from: a */
    void mo53953a(C7864v vVar);
}
