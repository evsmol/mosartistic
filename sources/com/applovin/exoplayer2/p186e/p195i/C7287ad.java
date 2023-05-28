package com.applovin.exoplayer2.p186e.p195i;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.ad */
public interface C7287ad {

    /* renamed from: com.applovin.exoplayer2.e.i.ad$a */
    public static final class C7288a {

        /* renamed from: a */
        public final String f16385a;

        /* renamed from: b */
        public final int f16386b;

        /* renamed from: c */
        public final byte[] f16387c;

        public C7288a(String str, int i, byte[] bArr) {
            this.f16385a = str;
            this.f16386b = i;
            this.f16387c = bArr;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.i.ad$b */
    public static final class C7289b {

        /* renamed from: a */
        public final int f16388a;

        /* renamed from: b */
        public final String f16389b;

        /* renamed from: c */
        public final List<C7288a> f16390c;

        /* renamed from: d */
        public final byte[] f16391d;

        public C7289b(int i, String str, List<C7288a> list, byte[] bArr) {
            this.f16388a = i;
            this.f16389b = str;
            this.f16390c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f16391d = bArr;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.i.ad$c */
    public interface C7290c {
        /* renamed from: a */
        SparseArray<C7287ad> mo54022a();

        /* renamed from: a */
        C7287ad mo54023a(int i, C7289b bVar);
    }

    /* renamed from: com.applovin.exoplayer2.e.i.ad$d */
    public static final class C7291d {

        /* renamed from: a */
        private final String f16392a;

        /* renamed from: b */
        private final int f16393b;

        /* renamed from: c */
        private final int f16394c;

        /* renamed from: d */
        private int f16395d;

        /* renamed from: e */
        private String f16396e;

        public C7291d(int i, int i2) {
            this(RecyclerView.UNDEFINED_DURATION, i, i2);
        }

        public C7291d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f16392a = str;
            this.f16393b = i2;
            this.f16394c = i3;
            this.f16395d = RecyclerView.UNDEFINED_DURATION;
            this.f16396e = "";
        }

        /* renamed from: d */
        private void m19950d() {
            if (this.f16395d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void mo54024a() {
            int i = this.f16395d;
            this.f16395d = i == Integer.MIN_VALUE ? this.f16393b : i + this.f16394c;
            this.f16396e = this.f16392a + this.f16395d;
        }

        /* renamed from: b */
        public int mo54025b() {
            m19950d();
            return this.f16395d;
        }

        /* renamed from: c */
        public String mo54026c() {
            m19950d();
            return this.f16396e;
        }
    }

    /* renamed from: a */
    void mo54019a();

    /* renamed from: a */
    void mo54020a(C7726ag agVar, C7329j jVar, C7291d dVar);

    /* renamed from: a */
    void mo54021a(C7772y yVar, int i) throws C6809ai;
}
