package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.g.a */
abstract class C7233a {

    /* renamed from: a */
    public final int f16099a;

    /* renamed from: com.applovin.exoplayer2.e.g.a$a */
    static final class C7234a extends C7233a {

        /* renamed from: b */
        public final long f16100b;

        /* renamed from: c */
        public final List<C7235b> f16101c = new ArrayList();

        /* renamed from: d */
        public final List<C7234a> f16102d = new ArrayList();

        public C7234a(int i, long j) {
            super(i);
            this.f16100b = j;
        }

        /* renamed from: a */
        public void mo53955a(C7234a aVar) {
            this.f16102d.add(aVar);
        }

        /* renamed from: a */
        public void mo53956a(C7235b bVar) {
            this.f16101c.add(bVar);
        }

        /* renamed from: d */
        public C7235b mo53957d(int i) {
            int size = this.f16101c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7235b bVar = this.f16101c.get(i2);
                if (bVar.f16099a == i) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: e */
        public C7234a mo53958e(int i) {
            int size = this.f16102d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7234a aVar = this.f16102d.get(i2);
                if (aVar.f16099a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            return m19620c(this.f16099a) + " leaves: " + Arrays.toString(this.f16101c.toArray()) + " containers: " + Arrays.toString(this.f16102d.toArray());
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.a$b */
    static final class C7235b extends C7233a {

        /* renamed from: b */
        public final C7772y f16103b;

        public C7235b(int i, C7772y yVar) {
            super(i);
            this.f16103b = yVar;
        }
    }

    public C7233a(int i) {
        this.f16099a = i;
    }

    /* renamed from: a */
    public static int m19618a(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: b */
    public static int m19619b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static String m19620c(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public String toString() {
        return m19620c(this.f16099a);
    }
}
