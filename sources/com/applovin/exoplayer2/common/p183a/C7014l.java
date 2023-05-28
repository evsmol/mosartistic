package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.l */
class C7014l<K, V> extends AbstractMap<K, V> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: a */
    transient long[] f15467a;
    @MonotonicNonNullDecl

    /* renamed from: b */
    transient Object[] f15468b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    transient Object[] f15469c;

    /* renamed from: d */
    transient float f15470d;

    /* renamed from: e */
    transient int f15471e;
    @MonotonicNonNullDecl

    /* renamed from: f */
    private transient int[] f15472f;

    /* renamed from: g */
    private transient int f15473g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public transient int f15474h;
    @MonotonicNonNullDecl

    /* renamed from: i */
    private transient Set<K> f15475i;
    @MonotonicNonNullDecl

    /* renamed from: j */
    private transient Set<Map.Entry<K, V>> f15476j;
    @MonotonicNonNullDecl

    /* renamed from: k */
    private transient Collection<V> f15477k;

    /* renamed from: com.applovin.exoplayer2.common.a.l$a */
    class C7018a extends AbstractSet<Map.Entry<K, V>> {
        C7018a() {
        }

        public void clear() {
            C7014l.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C7014l.this.m18723a(entry.getKey());
            return a != -1 && Objects.equal(C7014l.this.f15469c[a], entry.getValue());
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C7014l.this.mo53469f();
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C7014l.this.m18723a(entry.getKey());
            if (a == -1 || !Objects.equal(C7014l.this.f15469c[a], entry.getValue())) {
                return false;
            }
            Object unused = C7014l.this.m18735j(a);
            return true;
        }

        public int size() {
            return C7014l.this.f15474h;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.l$b */
    private abstract class C7019b<T> implements Iterator<T> {

        /* renamed from: b */
        int f15482b;

        /* renamed from: c */
        int f15483c;

        /* renamed from: d */
        int f15484d;

        private C7019b() {
            this.f15482b = C7014l.this.f15471e;
            this.f15483c = C7014l.this.mo53457b();
            this.f15484d = -1;
        }

        /* renamed from: a */
        private void m18754a() {
            if (C7014l.this.f15471e != this.f15482b) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo53479a(int i);

        public boolean hasNext() {
            return this.f15483c >= 0;
        }

        public T next() {
            m18754a();
            if (hasNext()) {
                int i = this.f15483c;
                this.f15484d = i;
                T a = mo53479a(i);
                this.f15483c = C7014l.this.mo53466e(this.f15483c);
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m18754a();
            C7012j.m18717a(this.f15484d >= 0);
            this.f15482b++;
            Object unused = C7014l.this.m18735j(this.f15484d);
            this.f15483c = C7014l.this.mo53454a(this.f15483c, this.f15484d);
            this.f15484d = -1;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.l$c */
    class C7020c extends AbstractSet<K> {
        C7020c() {
        }

        public void clear() {
            C7014l.this.clear();
        }

        public boolean contains(Object obj) {
            return C7014l.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return C7014l.this.mo53464d();
        }

        public boolean remove(@NullableDecl Object obj) {
            int a = C7014l.this.m18723a(obj);
            if (a == -1) {
                return false;
            }
            Object unused = C7014l.this.m18735j(a);
            return true;
        }

        public int size() {
            return C7014l.this.f15474h;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.l$d */
    final class C7021d extends C7004e<K, V> {
        @NullableDecl

        /* renamed from: b */
        private final K f15488b;

        /* renamed from: c */
        private int f15489c;

        C7021d(int i) {
            this.f15488b = C7014l.this.f15468b[i];
            this.f15489c = i;
        }

        /* renamed from: a */
        private void m18756a() {
            int i = this.f15489c;
            if (i == -1 || i >= C7014l.this.size() || !Objects.equal(this.f15488b, C7014l.this.f15468b[this.f15489c])) {
                this.f15489c = C7014l.this.m18723a((Object) this.f15488b);
            }
        }

        public K getKey() {
            return this.f15488b;
        }

        public V getValue() {
            m18756a();
            if (this.f15489c == -1) {
                return null;
            }
            return C7014l.this.f15469c[this.f15489c];
        }

        public V setValue(V v) {
            m18756a();
            if (this.f15489c == -1) {
                C7014l.this.put(this.f15488b, v);
                return null;
            }
            V v2 = C7014l.this.f15469c[this.f15489c];
            C7014l.this.f15469c[this.f15489c] = v;
            return v2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.l$e */
    class C7022e extends AbstractCollection<V> {
        C7022e() {
        }

        public void clear() {
            C7014l.this.clear();
        }

        public Iterator<V> iterator() {
            return C7014l.this.mo53472h();
        }

        public int size() {
            return C7014l.this.f15474h;
        }
    }

    C7014l() {
        mo53455a(3, 1.0f);
    }

    C7014l(int i) {
        this(i, 1.0f);
    }

    C7014l(int i, float f) {
        mo53455a(i, f);
    }

    /* renamed from: a */
    private static int m18720a(long j) {
        return (int) (j >>> 32);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m18723a(@NullableDecl Object obj) {
        int a = C7028p.m18782a(obj);
        int i = this.f15472f[m18733i() & a];
        while (i != -1) {
            long j = this.f15467a[i];
            if (m18720a(j) == a && Objects.equal(obj, this.f15468b[i])) {
                return i;
            }
            i = m18729b(j);
        }
        return -1;
    }

    /* renamed from: a */
    private static long m18724a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: a */
    public static <K, V> C7014l<K, V> m18725a() {
        return new C7014l<>();
    }

    /* renamed from: a */
    public static <K, V> C7014l<K, V> m18726a(int i) {
        return new C7014l<>(i);
    }

    @NullableDecl
    /* renamed from: a */
    private V m18728a(@NullableDecl Object obj, int i) {
        int i2 = m18733i() & i;
        int i3 = this.f15472f[i2];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (m18720a(this.f15467a[i3]) != i || !Objects.equal(obj, this.f15468b[i3])) {
                int b = m18729b(this.f15467a[i3]);
                if (b == -1) {
                    return null;
                }
                int i5 = b;
                i4 = i3;
                i3 = i5;
            } else {
                V v = this.f15469c[i3];
                if (i4 == -1) {
                    this.f15472f[i2] = m18729b(this.f15467a[i3]);
                } else {
                    long[] jArr = this.f15467a;
                    jArr[i4] = m18724a(jArr[i4], m18729b(jArr[i3]));
                }
                mo53465d(i3);
                this.f15474h--;
                this.f15471e++;
                return v;
            }
        }
    }

    /* renamed from: b */
    private static int m18729b(long j) {
        return (int) j;
    }

    /* renamed from: f */
    private static int[] m18730f(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: g */
    private static long[] m18731g(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: h */
    private void m18732h(int i) {
        int length = this.f15467a.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo53460c(max);
            }
        }
    }

    /* renamed from: i */
    private int m18733i() {
        return this.f15472f.length - 1;
    }

    /* renamed from: i */
    private void m18734i(int i) {
        if (this.f15472f.length >= 1073741824) {
            this.f15473g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f15470d)) + 1;
        int[] f = m18730f(i);
        long[] jArr = this.f15467a;
        int length = f.length - 1;
        for (int i3 = 0; i3 < this.f15474h; i3++) {
            int a = m18720a(jArr[i3]);
            int i4 = a & length;
            int i5 = f[i4];
            f[i4] = i3;
            jArr[i3] = (((long) a) << 32) | (((long) i5) & 4294967295L);
        }
        this.f15473g = i2;
        this.f15472f = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public V m18735j(int i) {
        return m18728a(this.f15468b[i], m18720a(this.f15467a[i]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53454a(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo53455a(int i, float f) {
        boolean z = false;
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Illegal load factor");
        int a = C7028p.m18781a(i, (double) f);
        this.f15472f = m18730f(a);
        this.f15470d = f;
        this.f15468b = new Object[i];
        this.f15469c = new Object[i];
        this.f15467a = m18731g(i);
        this.f15473g = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo53456a(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.f15467a[i] = (((long) i2) << 32) | 4294967295L;
        this.f15468b[i] = k;
        this.f15469c[i] = v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo53457b() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo53458b(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo53459c() {
        return new C7020c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo53460c(int i) {
        this.f15468b = Arrays.copyOf(this.f15468b, i);
        this.f15469c = Arrays.copyOf(this.f15469c, i);
        long[] jArr = this.f15467a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f15467a = copyOf;
    }

    public void clear() {
        this.f15471e++;
        Arrays.fill(this.f15468b, 0, this.f15474h, (Object) null);
        Arrays.fill(this.f15469c, 0, this.f15474h, (Object) null);
        Arrays.fill(this.f15472f, -1);
        Arrays.fill(this.f15467a, -1);
        this.f15474h = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return m18723a(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f15474h; i++) {
            if (Objects.equal(obj, this.f15469c[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Iterator<K> mo53464d() {
        return new C7014l<K, V>.b<K>() {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public K mo53479a(int i) {
                return C7014l.this.f15468b[i];
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53465d(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f15468b;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f15469c;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f15467a;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int a = m18720a(j) & m18733i();
            int[] iArr = this.f15472f;
            int i2 = iArr[a];
            if (i2 == size) {
                iArr[a] = i;
                return;
            }
            while (true) {
                long j2 = this.f15467a[i2];
                int b = m18729b(j2);
                if (b == size) {
                    this.f15467a[i2] = m18724a(j2, i);
                    return;
                }
                i2 = b;
            }
        } else {
            this.f15468b[i] = null;
            this.f15469c[i] = null;
            this.f15467a[i] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo53466e(int i) {
        int i2 = i + 1;
        if (i2 < this.f15474h) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Set<Map.Entry<K, V>> mo53467e() {
        return new C7018a();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15476j;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> e = mo53467e();
        this.f15476j = e;
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Iterator<Map.Entry<K, V>> mo53469f() {
        return new C7014l<K, V>.b<Map.Entry<K, V>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map.Entry<K, V> mo53479a(int i) {
                return new C7021d(i);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Collection<V> mo53470g() {
        return new C7022e();
    }

    public V get(@NullableDecl Object obj) {
        int a = m18723a(obj);
        mo53458b(a);
        if (a == -1) {
            return null;
        }
        return this.f15469c[a];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<V> mo53472h() {
        return new C7014l<K, V>.b<V>() {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public V mo53479a(int i) {
                return C7014l.this.f15469c[i];
            }
        };
    }

    public boolean isEmpty() {
        return this.f15474h == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f15475i;
        if (set != null) {
            return set;
        }
        Set<K> c = mo53459c();
        this.f15475i = c;
        return c;
    }

    @NullableDecl
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f15467a;
        Object[] objArr = this.f15468b;
        V[] vArr = this.f15469c;
        int a = C7028p.m18782a((Object) k);
        int i = m18733i() & a;
        int i2 = this.f15474h;
        int[] iArr = this.f15472f;
        int i3 = iArr[i];
        if (i3 == -1) {
            iArr[i] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m18720a(j) != a || !Objects.equal(k, objArr[i3])) {
                    int b = m18729b(j);
                    if (b == -1) {
                        jArr[i3] = m18724a(j, i2);
                        break;
                    }
                    i3 = b;
                } else {
                    V v2 = vArr[i3];
                    vArr[i3] = v;
                    mo53458b(i3);
                    return v2;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i4 = i2 + 1;
            m18732h(i4);
            mo53456a(i2, k, v, a);
            this.f15474h = i4;
            if (i2 >= this.f15473g) {
                m18734i(this.f15472f.length * 2);
            }
            this.f15471e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return m18728a(obj, C7028p.m18782a(obj));
    }

    public int size() {
        return this.f15474h;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f15477k;
        if (collection != null) {
            return collection;
        }
        Collection<V> g = mo53470g();
        this.f15477k = g;
        return g;
    }
}
