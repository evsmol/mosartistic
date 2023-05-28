package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p221l.C7731c;
import com.applovin.exoplayer2.p221l.C7744m;
import com.applovin.exoplayer2.p222m.C7816o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.an */
public interface C6814an {

    /* renamed from: com.applovin.exoplayer2.an$a */
    public static final class C6816a implements C7397g {

        /* renamed from: a */
        public static final C6816a f14835a = new C6817a().mo52799a();

        /* renamed from: b */
        public static final C7397g.C7398a<C6816a> f14836b = $$Lambda$an$a$OfLfeSHfSoDCSrP0eAdygVutcA.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C7744m f14837c;

        /* renamed from: com.applovin.exoplayer2.an$a$a */
        public static final class C6817a {

            /* renamed from: a */
            private static final int[] f14838a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: b */
            private final C7744m.C7746a f14839b = new C7744m.C7746a();

            /* renamed from: a */
            public C6817a mo52795a(int i) {
                this.f14839b.mo55015a(i);
                return this;
            }

            /* renamed from: a */
            public C6817a mo52796a(int i, boolean z) {
                this.f14839b.mo55016a(i, z);
                return this;
            }

            /* renamed from: a */
            public C6817a mo52797a(C6816a aVar) {
                this.f14839b.mo55017a(aVar.f14837c);
                return this;
            }

            /* renamed from: a */
            public C6817a mo52798a(int... iArr) {
                this.f14839b.mo55018a(iArr);
                return this;
            }

            /* renamed from: a */
            public C6816a mo52799a() {
                return new C6816a(this.f14839b.mo55019a());
            }
        }

        private C6816a(C7744m mVar) {
            this.f14837c = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C6816a m17610a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(m17612b(0));
            if (integerArrayList == null) {
                return f14835a;
            }
            C6817a aVar = new C6817a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.mo52795a(integerArrayList.get(i).intValue());
            }
            return aVar.mo52799a();
        }

        /* renamed from: b */
        private static String m17612b(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public boolean mo52792a(int i) {
            return this.f14837c.mo55010a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6816a)) {
                return false;
            }
            return this.f14837c.equals(((C6816a) obj).f14837c);
        }

        public int hashCode() {
            return this.f14837c.hashCode();
        }
    }

    @Deprecated
    /* renamed from: com.applovin.exoplayer2.an$b */
    public interface C6818b {

        /* renamed from: com.applovin.exoplayer2.an$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C6818b bVar, C6787ab abVar, int i) {
            }

            public static void $default$a(C6818b bVar, C6797ac acVar) {
            }

            public static void $default$a(C6818b bVar, C6811ak akVar) {
            }

            public static void $default$a(C6818b bVar, C6813am amVar) {
            }

            public static void $default$a(C6818b bVar, C6816a aVar) {
            }

            public static void $default$a(C6818b bVar, C6821e eVar, C6821e eVar2, int i) {
            }

            public static void $default$a(C6818b bVar, C6814an anVar, C6819c cVar) {
            }

            public static void $default$a(C6818b bVar, C6904ba baVar, int i) {
            }

            public static void $default$a(C6818b bVar, C7483ad adVar, C7644h hVar) {
            }

            @Deprecated
            public static void $default$a(C6818b bVar, boolean z, int i) {
            }

            @Deprecated
            public static void $default$b(C6818b bVar) {
            }

            public static void $default$b(C6818b bVar, int i) {
            }

            public static void $default$b(C6818b bVar, C6811ak akVar) {
            }

            public static void $default$b(C6818b bVar, boolean z, int i) {
            }

            public static void $default$b_(C6818b bVar, boolean z) {
            }

            public static void $default$c(C6818b bVar, int i) {
            }

            @Deprecated
            public static void $default$c(C6818b bVar, boolean z) {
            }

            public static void $default$d(C6818b bVar, int i) {
            }

            public static void $default$d(C6818b bVar, boolean z) {
            }

            @Deprecated
            public static void $default$e(C6818b bVar, int i) {
            }

            public static void $default$e(C6818b bVar, boolean z) {
            }
        }

        /* renamed from: a */
        void mo52471a(C6787ab abVar, int i);

        /* renamed from: a */
        void mo52472a(C6797ac acVar);

        /* renamed from: a */
        void mo52473a(C6811ak akVar);

        /* renamed from: a */
        void mo52474a(C6813am amVar);

        /* renamed from: a */
        void mo52475a(C6816a aVar);

        /* renamed from: a */
        void mo52476a(C6821e eVar, C6821e eVar2, int i);

        /* renamed from: a */
        void mo52478a(C6814an anVar, C6819c cVar);

        /* renamed from: a */
        void mo52479a(C6904ba baVar, int i);

        /* renamed from: a */
        void mo52482a(C7483ad adVar, C7644h hVar);

        @Deprecated
        /* renamed from: a */
        void mo52493a(boolean z, int i);

        @Deprecated
        /* renamed from: b */
        void mo52496b();

        /* renamed from: b */
        void mo52497b(int i);

        /* renamed from: b */
        void mo52501b(C6811ak akVar);

        /* renamed from: b */
        void mo52507b(boolean z, int i);

        /* renamed from: b_ */
        void mo52508b_(boolean z);

        /* renamed from: c */
        void mo52510c(int i);

        @Deprecated
        /* renamed from: c */
        void mo52515c(boolean z);

        /* renamed from: d */
        void mo52517d(int i);

        /* renamed from: d */
        void mo52520d(boolean z);

        @Deprecated
        /* renamed from: e */
        void mo52522e(int i);

        /* renamed from: e */
        void mo52524e(boolean z);
    }

    /* renamed from: com.applovin.exoplayer2.an$c */
    public static final class C6819c {

        /* renamed from: a */
        private final C7744m f14840a;

        public C6819c(C7744m mVar) {
            this.f14840a = mVar;
        }

        /* renamed from: a */
        public boolean mo52800a(int i) {
            return this.f14840a.mo55010a(i);
        }

        /* renamed from: a */
        public boolean mo52801a(int... iArr) {
            return this.f14840a.mo55011a(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6819c)) {
                return false;
            }
            return this.f14840a.equals(((C6819c) obj).f14840a);
        }

        public int hashCode() {
            return this.f14840a.hashCode();
        }
    }

    /* renamed from: com.applovin.exoplayer2.an$d */
    public interface C6820d extends C6818b {

        /* renamed from: com.applovin.exoplayer2.an$d$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C6820d dVar) {
            }

            public static void $default$a(C6820d dVar, float f) {
            }

            public static void $default$a(C6820d dVar, int i, int i2) {
            }

            public static void $default$a(C6820d dVar, int i, boolean z) {
            }

            public static void $default$a(C6820d dVar, C6787ab abVar, int i) {
            }

            public static void $default$a(C6820d dVar, C6797ac acVar) {
            }

            public static void $default$a(C6820d dVar, C6811ak akVar) {
            }

            public static void $default$a(C6820d dVar, C6813am amVar) {
            }

            public static void $default$a(C6820d dVar, C6816a aVar) {
            }

            public static void $default$a(C6820d dVar, C6821e eVar, C6821e eVar2, int i) {
            }

            public static void $default$a(C6820d dVar, C6814an anVar, C6819c cVar) {
            }

            public static void $default$a(C6820d dVar, C6904ba baVar, int i) {
            }

            public static void $default$a(C6820d dVar, C7399a aVar) {
            }

            public static void $default$a(C6820d dVar, C7483ad adVar, C7644h hVar) {
            }

            public static void $default$a(C6820d dVar, C7816o oVar) {
            }

            public static void $default$a(C6820d dVar, C7818o oVar) {
            }

            public static void $default$a(C6820d dVar, List list) {
            }

            public static void $default$a_(C6820d dVar, boolean z) {
            }

            public static void $default$b(C6820d dVar, int i) {
            }

            public static void $default$b(C6820d dVar, C6811ak akVar) {
            }

            public static void $default$b(C6820d dVar, boolean z, int i) {
            }

            public static void $default$b_(C6820d dVar, boolean z) {
            }

            public static void $default$c(C6820d dVar, int i) {
            }

            public static void $default$d(C6820d dVar, int i) {
            }

            public static void $default$d(C6820d dVar, boolean z) {
            }

            public static void $default$e(C6820d dVar, boolean z) {
            }
        }

        /* renamed from: a */
        void mo52456a();

        /* renamed from: a */
        void mo52457a(float f);

        /* renamed from: a */
        void mo52458a(int i, int i2);

        /* renamed from: a */
        void mo52467a(int i, boolean z);

        /* renamed from: a */
        void mo52471a(C6787ab abVar, int i);

        /* renamed from: a */
        void mo52472a(C6797ac acVar);

        /* renamed from: a */
        void mo52473a(C6811ak akVar);

        /* renamed from: a */
        void mo52474a(C6813am amVar);

        /* renamed from: a */
        void mo52475a(C6816a aVar);

        /* renamed from: a */
        void mo52476a(C6821e eVar, C6821e eVar2, int i);

        /* renamed from: a */
        void mo52478a(C6814an anVar, C6819c cVar);

        /* renamed from: a */
        void mo52479a(C6904ba baVar, int i);

        /* renamed from: a */
        void mo52481a(C7399a aVar);

        /* renamed from: a */
        void mo52482a(C7483ad adVar, C7644h hVar);

        /* renamed from: a */
        void mo52483a(C7816o oVar);

        /* renamed from: a */
        void mo52484a(C7818o oVar);

        /* renamed from: a */
        void mo52491a(List<C7540a> list);

        /* renamed from: a_ */
        void mo52495a_(boolean z);

        /* renamed from: b */
        void mo52497b(int i);

        /* renamed from: b */
        void mo52501b(C6811ak akVar);

        /* renamed from: b */
        void mo52507b(boolean z, int i);

        /* renamed from: b_ */
        void mo52508b_(boolean z);

        /* renamed from: c */
        void mo52510c(int i);

        /* renamed from: d */
        void mo52517d(int i);

        /* renamed from: d */
        void mo52520d(boolean z);

        /* renamed from: e */
        void mo52524e(boolean z);
    }

    /* renamed from: com.applovin.exoplayer2.an$e */
    public static final class C6821e implements C7397g {

        /* renamed from: j */
        public static final C7397g.C7398a<C6821e> f14841j = $$Lambda$an$e$0Gu71CpUse6ty3YCMnk1QoxtJRE.INSTANCE;

        /* renamed from: a */
        public final Object f14842a;

        /* renamed from: b */
        public final int f14843b;

        /* renamed from: c */
        public final C6787ab f14844c;

        /* renamed from: d */
        public final Object f14845d;

        /* renamed from: e */
        public final int f14846e;

        /* renamed from: f */
        public final long f14847f;

        /* renamed from: g */
        public final long f14848g;

        /* renamed from: h */
        public final int f14849h;

        /* renamed from: i */
        public final int f14850i;

        public C6821e(Object obj, int i, C6787ab abVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f14842a = obj;
            this.f14843b = i;
            this.f14844c = abVar;
            this.f14845d = obj2;
            this.f14846e = i2;
            this.f14847f = j;
            this.f14848g = j2;
            this.f14849h = i3;
            this.f14850i = i4;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C6821e m17668a(Bundle bundle) {
            return new C6821e((Object) null, bundle.getInt(m17669a(0), -1), (C6787ab) C7731c.m22274a(C6787ab.f14612g, bundle.getBundle(m17669a(1))), (Object) null, bundle.getInt(m17669a(2), -1), bundle.getLong(m17669a(3), -9223372036854775807L), bundle.getLong(m17669a(4), -9223372036854775807L), bundle.getInt(m17669a(5), -1), bundle.getInt(m17669a(6), -1));
        }

        /* renamed from: a */
        private static String m17669a(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6821e eVar = (C6821e) obj;
            return this.f14843b == eVar.f14843b && this.f14846e == eVar.f14846e && this.f14847f == eVar.f14847f && this.f14848g == eVar.f14848g && this.f14849h == eVar.f14849h && this.f14850i == eVar.f14850i && Objects.equal(this.f14842a, eVar.f14842a) && Objects.equal(this.f14845d, eVar.f14845d) && Objects.equal(this.f14844c, eVar.f14844c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f14842a, Integer.valueOf(this.f14843b), this.f14844c, this.f14845d, Integer.valueOf(this.f14846e), Integer.valueOf(this.f14843b), Long.valueOf(this.f14847f), Long.valueOf(this.f14848g), Integer.valueOf(this.f14849h), Integer.valueOf(this.f14850i));
        }
    }

    /* renamed from: A */
    long mo52745A();

    /* renamed from: B */
    long mo52746B();

    /* renamed from: C */
    long mo52747C();

    /* renamed from: D */
    C6813am mo52748D();

    /* renamed from: F */
    int mo52749F();

    /* renamed from: G */
    int mo52750G();

    /* renamed from: H */
    long mo52751H();

    /* renamed from: I */
    long mo52752I();

    /* renamed from: J */
    long mo52753J();

    /* renamed from: K */
    boolean mo52754K();

    /* renamed from: L */
    int mo52755L();

    /* renamed from: M */
    int mo52756M();

    /* renamed from: N */
    long mo52757N();

    /* renamed from: O */
    long mo52758O();

    /* renamed from: P */
    C7483ad mo52759P();

    /* renamed from: Q */
    C7644h mo52760Q();

    /* renamed from: R */
    C6797ac mo52761R();

    /* renamed from: S */
    C6904ba mo52762S();

    /* renamed from: T */
    C7816o mo52763T();

    /* renamed from: V */
    List<C7540a> mo52764V();

    /* renamed from: a */
    void mo52765a(int i, long j);

    /* renamed from: a */
    void mo52766a(long j);

    /* renamed from: a */
    void mo52767a(SurfaceView surfaceView);

    /* renamed from: a */
    void mo52768a(TextureView textureView);

    /* renamed from: a */
    void mo52769a(C6820d dVar);

    /* renamed from: a */
    void mo52770a(boolean z);

    /* renamed from: a */
    boolean mo52771a();

    /* renamed from: a */
    boolean mo52772a(int i);

    /* renamed from: b */
    void mo52773b(SurfaceView surfaceView);

    /* renamed from: b */
    void mo52774b(TextureView textureView);

    /* renamed from: b */
    void mo52775b(C6820d dVar);

    /* renamed from: b */
    void mo52776b(boolean z);

    /* renamed from: c */
    void mo52777c();

    /* renamed from: c */
    void mo52778c(int i);

    /* renamed from: d */
    void mo52779d();

    /* renamed from: e */
    C6811ak mo52780e();

    /* renamed from: g */
    void mo52781g();

    /* renamed from: j */
    void mo52782j();

    /* renamed from: o */
    boolean mo52783o();

    /* renamed from: r */
    Looper mo52784r();

    /* renamed from: s */
    C6816a mo52785s();

    /* renamed from: t */
    int mo52786t();

    /* renamed from: u */
    int mo52787u();

    /* renamed from: w */
    void mo52788w();

    /* renamed from: x */
    boolean mo52789x();

    /* renamed from: y */
    int mo52790y();

    /* renamed from: z */
    boolean mo52791z();
}
