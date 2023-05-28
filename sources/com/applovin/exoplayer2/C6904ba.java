package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p206h.p207a.C7478a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7730b;

/* renamed from: com.applovin.exoplayer2.ba */
public abstract class C6904ba implements C7397g {

    /* renamed from: a */
    public static final C6904ba f15253a = new C6904ba() {
        /* renamed from: a */
        public C6906a mo52440a(int i, C6906a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public C6908c mo52442a(int i, C6908c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public Object mo52443a(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo52823b() {
            return 0;
        }

        /* renamed from: c */
        public int mo52824c() {
            return 0;
        }

        /* renamed from: c */
        public int mo52448c(Object obj) {
            return -1;
        }
    };

    /* renamed from: b */
    public static final C7397g.C7398a<C6904ba> f15254b = $$Lambda$ba$ucFTv0SKlgJD9tnULZjHTNQuYFw.INSTANCE;

    /* renamed from: com.applovin.exoplayer2.ba$a */
    public static final class C6906a implements C7397g {

        /* renamed from: g */
        public static final C7397g.C7398a<C6906a> f15255g = $$Lambda$ba$a$QWUO7JvC0zLWqO8DCCWahJGhV4.INSTANCE;

        /* renamed from: a */
        public Object f15256a;

        /* renamed from: b */
        public Object f15257b;

        /* renamed from: c */
        public int f15258c;

        /* renamed from: d */
        public long f15259d;

        /* renamed from: e */
        public long f15260e;

        /* renamed from: f */
        public boolean f15261f;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C7478a f15262h = C7478a.f17133a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C6906a m18362a(Bundle bundle) {
            int i = bundle.getInt(m18364g(0), 0);
            long j = bundle.getLong(m18364g(1), -9223372036854775807L);
            long j2 = bundle.getLong(m18364g(2), 0);
            boolean z = bundle.getBoolean(m18364g(3));
            Bundle bundle2 = bundle.getBundle(m18364g(4));
            C7478a fromBundle = bundle2 != null ? C7478a.f17134g.fromBundle(bundle2) : C7478a.f17133a;
            C6906a aVar = new C6906a();
            aVar.mo53089a((Object) null, (Object) null, i, j, j2, fromBundle, z);
            return aVar;
        }

        /* renamed from: g */
        private static String m18364g(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public int mo53084a(int i, int i2) {
            return this.f15262h.mo54459a(i).mo54465a(i2);
        }

        /* renamed from: a */
        public int mo53085a(long j) {
            return this.f15262h.mo54458a(j, this.f15259d);
        }

        /* renamed from: a */
        public long mo53086a() {
            return this.f15259d;
        }

        /* renamed from: a */
        public long mo53087a(int i) {
            return this.f15262h.mo54459a(i).f17143a;
        }

        /* renamed from: a */
        public C6906a mo53088a(Object obj, Object obj2, int i, long j, long j2) {
            return mo53089a(obj, obj2, i, j, j2, C7478a.f17133a, false);
        }

        /* renamed from: a */
        public C6906a mo53089a(Object obj, Object obj2, int i, long j, long j2, C7478a aVar, boolean z) {
            this.f15256a = obj;
            this.f15257b = obj2;
            this.f15258c = i;
            this.f15259d = j;
            this.f15260e = j2;
            this.f15262h = aVar;
            this.f15261f = z;
            return this;
        }

        /* renamed from: b */
        public int mo53090b(int i) {
            return this.f15262h.mo54459a(i).mo54464a();
        }

        /* renamed from: b */
        public int mo53091b(long j) {
            return this.f15262h.mo54460b(j, this.f15259d);
        }

        /* renamed from: b */
        public long mo53092b() {
            return C7476h.m20797a(this.f15260e);
        }

        /* renamed from: b */
        public long mo53093b(int i, int i2) {
            C7478a.C7479a a = this.f15262h.mo54459a(i);
            if (a.f17144b != -1) {
                return a.f17147e[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public long mo53094c() {
            return this.f15260e;
        }

        /* renamed from: c */
        public boolean mo53095c(int i) {
            return !this.f15262h.mo54459a(i).mo54468c();
        }

        /* renamed from: d */
        public int mo53096d() {
            return this.f15262h.f17137c;
        }

        /* renamed from: d */
        public int mo53097d(int i) {
            return this.f15262h.mo54459a(i).f17144b;
        }

        /* renamed from: e */
        public int mo53098e() {
            return this.f15262h.f17140f;
        }

        /* renamed from: e */
        public boolean mo53099e(int i) {
            return this.f15262h.mo54459a(i).f17149g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C6906a aVar = (C6906a) obj;
            return C7728ai.m22218a(this.f15256a, aVar.f15256a) && C7728ai.m22218a(this.f15257b, aVar.f15257b) && this.f15258c == aVar.f15258c && this.f15259d == aVar.f15259d && this.f15260e == aVar.f15260e && this.f15261f == aVar.f15261f && C7728ai.m22218a((Object) this.f15262h, (Object) aVar.f15262h);
        }

        /* renamed from: f */
        public long mo53101f() {
            return this.f15262h.f17138d;
        }

        /* renamed from: f */
        public long mo53102f(int i) {
            return this.f15262h.mo54459a(i).f17148f;
        }

        public int hashCode() {
            Object obj = this.f15256a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f15257b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f15259d;
            long j2 = this.f15260e;
            return ((((((((((hashCode + i) * 31) + this.f15258c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f15261f ? 1 : 0)) * 31) + this.f15262h.hashCode();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ba$b */
    public static final class C6907b extends C6904ba {

        /* renamed from: c */
        private final C7033s<C6908c> f15263c;

        /* renamed from: d */
        private final C7033s<C6906a> f15264d;

        /* renamed from: e */
        private final int[] f15265e;

        /* renamed from: f */
        private final int[] f15266f;

        public C6907b(C7033s<C6908c> sVar, C7033s<C6906a> sVar2, int[] iArr) {
            C7717a.m22118a(sVar.size() == iArr.length);
            this.f15263c = sVar;
            this.f15264d = sVar2;
            this.f15265e = iArr;
            this.f15266f = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f15266f[iArr[i]] = i;
            }
        }

        /* renamed from: a */
        public int mo52438a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo52439a(z)) {
                return z ? this.f15265e[this.f15266f[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return mo52446b(z);
            }
            return -1;
        }

        /* renamed from: a */
        public int mo52439a(boolean z) {
            if (mo53081d()) {
                return -1;
            }
            return z ? this.f15265e[mo52823b() - 1] : mo52823b() - 1;
        }

        /* renamed from: a */
        public C6906a mo52440a(int i, C6906a aVar, boolean z) {
            C6906a aVar2 = (C6906a) this.f15264d.get(i);
            aVar.mo53089a(aVar2.f15256a, aVar2.f15257b, aVar2.f15258c, aVar2.f15259d, aVar2.f15260e, aVar2.f15262h, aVar2.f15261f);
            return aVar;
        }

        /* renamed from: a */
        public C6908c mo52442a(int i, C6908c cVar, long j) {
            C6908c cVar2 = cVar;
            C6908c cVar3 = (C6908c) this.f15263c.get(i);
            Object obj = cVar3.f15271b;
            C6787ab abVar = cVar3.f15273d;
            C6787ab abVar2 = abVar;
            C6908c cVar4 = cVar3;
            C6908c cVar5 = cVar;
            cVar5.mo53105a(obj, abVar2, cVar3.f15274e, cVar3.f15275f, cVar3.f15276g, cVar3.f15277h, cVar3.f15278i, cVar3.f15279j, cVar3.f15281l, cVar3.f15283n, cVar4.f15284o, cVar4.f15285p, cVar4.f15286q, cVar4.f15287r);
            C6908c cVar6 = cVar;
            cVar6.f15282m = cVar4.f15282m;
            return cVar6;
        }

        /* renamed from: a */
        public Object mo52443a(int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public int mo52823b() {
            return this.f15263c.size();
        }

        /* renamed from: b */
        public int mo52445b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo52446b(z)) {
                return z ? this.f15265e[this.f15266f[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return mo52439a(z);
            }
            return -1;
        }

        /* renamed from: b */
        public int mo52446b(boolean z) {
            if (mo53081d()) {
                return -1;
            }
            if (z) {
                return this.f15265e[0];
            }
            return 0;
        }

        /* renamed from: c */
        public int mo52824c() {
            return this.f15264d.size();
        }

        /* renamed from: c */
        public int mo52448c(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ba$c */
    public static final class C6908c implements C7397g {

        /* renamed from: a */
        public static final Object f15267a = new Object();

        /* renamed from: s */
        public static final C7397g.C7398a<C6908c> f15268s = $$Lambda$ba$c$q6ecxdJ5c_7U1bIsVzirqaZfKH8.INSTANCE;

        /* renamed from: t */
        private static final Object f15269t = new Object();

        /* renamed from: u */
        private static final C6787ab f15270u = new C6787ab.C6790b().mo52618a("com.applovin.exoplayer2.Timeline").mo52616a(Uri.EMPTY).mo52619a();

        /* renamed from: b */
        public Object f15271b = f15267a;
        @Deprecated

        /* renamed from: c */
        public Object f15272c;

        /* renamed from: d */
        public C6787ab f15273d = f15270u;

        /* renamed from: e */
        public Object f15274e;

        /* renamed from: f */
        public long f15275f;

        /* renamed from: g */
        public long f15276g;

        /* renamed from: h */
        public long f15277h;

        /* renamed from: i */
        public boolean f15278i;

        /* renamed from: j */
        public boolean f15279j;
        @Deprecated

        /* renamed from: k */
        public boolean f15280k;

        /* renamed from: l */
        public C6787ab.C6794e f15281l;

        /* renamed from: m */
        public boolean f15282m;

        /* renamed from: n */
        public long f15283n;

        /* renamed from: o */
        public long f15284o;

        /* renamed from: p */
        public int f15285p;

        /* renamed from: q */
        public int f15286q;

        /* renamed from: r */
        public long f15287r;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C6908c m18393a(Bundle bundle) {
            Bundle bundle2 = bundle;
            Bundle bundle3 = bundle2.getBundle(m18394a(1));
            C6787ab.C6794e eVar = null;
            C6787ab fromBundle = bundle3 != null ? C6787ab.f14612g.fromBundle(bundle3) : null;
            long j = bundle2.getLong(m18394a(2), -9223372036854775807L);
            long j2 = bundle2.getLong(m18394a(3), -9223372036854775807L);
            long j3 = bundle2.getLong(m18394a(4), -9223372036854775807L);
            boolean z = bundle2.getBoolean(m18394a(5), false);
            boolean z2 = bundle2.getBoolean(m18394a(6), false);
            Bundle bundle4 = bundle2.getBundle(m18394a(7));
            if (bundle4 != null) {
                eVar = C6787ab.C6794e.f14659g.fromBundle(bundle4);
            }
            boolean z3 = bundle2.getBoolean(m18394a(8), false);
            long j4 = bundle2.getLong(m18394a(9), 0);
            long j5 = bundle2.getLong(m18394a(10), -9223372036854775807L);
            int i = bundle2.getInt(m18394a(11), 0);
            int i2 = bundle2.getInt(m18394a(12), 0);
            long j6 = bundle2.getLong(m18394a(13), 0);
            C6908c cVar = r0;
            C6908c cVar2 = new C6908c();
            cVar.mo53105a(f15269t, fromBundle, (Object) null, j, j2, j3, z, z2, eVar, j4, j5, i, i2, j6);
            cVar2.f15282m = z3;
            return cVar2;
        }

        /* renamed from: a */
        private static String m18394a(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public long mo53104a() {
            return C7476h.m20797a(this.f15283n);
        }

        /* renamed from: a */
        public C6908c mo53105a(Object obj, C6787ab abVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C6787ab.C6794e eVar, long j4, long j5, int i, int i2, long j6) {
            C6787ab abVar2 = abVar;
            C6787ab.C6794e eVar2 = eVar;
            this.f15271b = obj;
            this.f15273d = abVar2 != null ? abVar2 : f15270u;
            this.f15272c = (abVar2 == null || abVar2.f14614c == null) ? null : abVar2.f14614c.f14677h;
            this.f15274e = obj2;
            this.f15275f = j;
            this.f15276g = j2;
            this.f15277h = j3;
            this.f15278i = z;
            this.f15279j = z2;
            this.f15280k = eVar2 != null;
            this.f15281l = eVar2;
            this.f15283n = j4;
            this.f15284o = j5;
            this.f15285p = i;
            this.f15286q = i2;
            this.f15287r = j6;
            this.f15282m = false;
            return this;
        }

        /* renamed from: b */
        public long mo53106b() {
            return this.f15283n;
        }

        /* renamed from: c */
        public long mo53107c() {
            return C7476h.m20797a(this.f15284o);
        }

        /* renamed from: d */
        public long mo53108d() {
            return C7728ai.m22245c(this.f15277h);
        }

        /* renamed from: e */
        public boolean mo53109e() {
            C7717a.m22121b(this.f15280k == (this.f15281l != null));
            return this.f15281l != null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C6908c cVar = (C6908c) obj;
            return C7728ai.m22218a(this.f15271b, cVar.f15271b) && C7728ai.m22218a((Object) this.f15273d, (Object) cVar.f15273d) && C7728ai.m22218a(this.f15274e, cVar.f15274e) && C7728ai.m22218a((Object) this.f15281l, (Object) cVar.f15281l) && this.f15275f == cVar.f15275f && this.f15276g == cVar.f15276g && this.f15277h == cVar.f15277h && this.f15278i == cVar.f15278i && this.f15279j == cVar.f15279j && this.f15282m == cVar.f15282m && this.f15283n == cVar.f15283n && this.f15284o == cVar.f15284o && this.f15285p == cVar.f15285p && this.f15286q == cVar.f15286q && this.f15287r == cVar.f15287r;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f15271b.hashCode()) * 31) + this.f15273d.hashCode()) * 31;
            Object obj = this.f15274e;
            int i = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C6787ab.C6794e eVar = this.f15281l;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            long j = this.f15275f;
            long j2 = this.f15276g;
            long j3 = this.f15277h;
            long j4 = this.f15283n;
            long j5 = this.f15284o;
            long j6 = this.f15287r;
            return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f15278i ? 1 : 0)) * 31) + (this.f15279j ? 1 : 0)) * 31) + (this.f15282m ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f15285p) * 31) + this.f15286q) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    protected C6904ba() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C6904ba m18334a(Bundle bundle) {
        C7033s<C6908c> a = m18335a(C6908c.f15268s, C7730b.m22270a(bundle, mo52444b(0)));
        C7033s<C6906a> a2 = m18335a(C6906a.f15255g, C7730b.m22270a(bundle, mo52444b(1)));
        int[] intArray = bundle.getIntArray(mo52444b(2));
        if (intArray == null) {
            intArray = mo52447c(a.size());
        }
        return new C6907b(a, a2, intArray);
    }

    /* renamed from: a */
    private static <T extends C7397g> C7033s<T> m18335a(C7397g.C7398a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return C7033s.m18803g();
        }
        C7033s.C7034a aVar2 = new C7033s.C7034a();
        C7033s<Bundle> a = C7365f.m20313a(iBinder);
        for (int i = 0; i < a.size(); i++) {
            aVar2.mo53515a(aVar.fromBundle(a.get(i)));
        }
        return aVar2.mo53531a();
    }

    /* renamed from: b */
    private static String mo52444b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: c */
    private static int[] mo52447c(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    /* renamed from: a */
    public int mo52438a(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo52439a(z) ? mo52446b(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo52439a(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: a */
    public final int mo53075a(int i, C6906a aVar, C6908c cVar, int i2, boolean z) {
        int i3 = mo53078a(i, aVar).f15258c;
        if (mo53079a(i3, cVar).f15286q != i) {
            return i + 1;
        }
        int a = mo52438a(i3, i2, z);
        if (a == -1) {
            return -1;
        }
        return mo53079a(a, cVar).f15285p;
    }

    /* renamed from: a */
    public int mo52439a(boolean z) {
        if (mo53081d()) {
            return -1;
        }
        return mo52823b() - 1;
    }

    /* renamed from: a */
    public final Pair<Object, Long> mo53076a(C6908c cVar, C6906a aVar, int i, long j) {
        return (Pair) C7717a.m22120b(mo53077a(cVar, aVar, i, j, 0));
    }

    /* renamed from: a */
    public final Pair<Object, Long> mo53077a(C6908c cVar, C6906a aVar, int i, long j, long j2) {
        C7717a.m22114a(i, 0, mo52823b());
        mo52442a(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.mo53106b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f15285p;
        mo53078a(i2, aVar);
        while (i2 < cVar.f15286q && aVar.f15260e != j) {
            int i3 = i2 + 1;
            if (mo53078a(i3, aVar).f15260e > j) {
                break;
            }
            i2 = i3;
        }
        mo52440a(i2, aVar, true);
        long j3 = j - aVar.f15260e;
        if (aVar.f15259d != -9223372036854775807L) {
            j3 = Math.min(j3, aVar.f15259d - 1);
        }
        return Pair.create(C7717a.m22120b(aVar.f15257b), Long.valueOf(Math.max(0, j3)));
    }

    /* renamed from: a */
    public final C6906a mo53078a(int i, C6906a aVar) {
        return mo52440a(i, aVar, false);
    }

    /* renamed from: a */
    public abstract C6906a mo52440a(int i, C6906a aVar, boolean z);

    /* renamed from: a */
    public C6906a mo52441a(Object obj, C6906a aVar) {
        return mo52440a(mo52448c(obj), aVar, true);
    }

    /* renamed from: a */
    public final C6908c mo53079a(int i, C6908c cVar) {
        return mo52442a(i, cVar, 0);
    }

    /* renamed from: a */
    public abstract C6908c mo52442a(int i, C6908c cVar, long j);

    /* renamed from: a */
    public abstract Object mo52443a(int i);

    /* renamed from: b */
    public abstract int mo52823b();

    /* renamed from: b */
    public int mo52445b(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo52446b(z) ? mo52439a(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == mo52446b(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: b */
    public int mo52446b(boolean z) {
        return mo53081d() ? -1 : 0;
    }

    /* renamed from: b */
    public final boolean mo53080b(int i, C6906a aVar, C6908c cVar, int i2, boolean z) {
        return mo53075a(i, aVar, cVar, i2, z) == -1;
    }

    /* renamed from: c */
    public abstract int mo52824c();

    /* renamed from: c */
    public abstract int mo52448c(Object obj);

    /* renamed from: d */
    public final boolean mo53081d() {
        return mo52823b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6904ba)) {
            return false;
        }
        C6904ba baVar = (C6904ba) obj;
        if (baVar.mo52823b() != mo52823b() || baVar.mo52824c() != mo52824c()) {
            return false;
        }
        C6908c cVar = new C6908c();
        C6906a aVar = new C6906a();
        C6908c cVar2 = new C6908c();
        C6906a aVar2 = new C6906a();
        for (int i = 0; i < mo52823b(); i++) {
            if (!mo53079a(i, cVar).equals(baVar.mo53079a(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo52824c(); i2++) {
            if (!mo52440a(i2, aVar, true).equals(baVar.mo52440a(i2, aVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        C6908c cVar = new C6908c();
        C6906a aVar = new C6906a();
        int b = 217 + mo52823b();
        int i2 = 0;
        while (true) {
            i = b * 31;
            if (i2 >= mo52823b()) {
                break;
            }
            b = i + mo53079a(i2, cVar).hashCode();
            i2++;
        }
        int c = i + mo52824c();
        for (int i3 = 0; i3 < mo52824c(); i3++) {
            c = (c * 31) + mo52440a(i3, aVar, true).hashCode();
        }
        return c;
    }
}
