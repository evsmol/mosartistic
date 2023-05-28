package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.w */
public abstract class C7047w<E> extends C7029q<E> implements Set<E> {
    @NullableDecl
    @LazyInit

    /* renamed from: a */
    private transient C7033s<E> f15530a;

    C7047w() {
    }

    /* renamed from: a */
    static int m18888a(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.checkArgument(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: a */
    private static <E> C7047w<E> m18889a(int i, Object... objArr) {
        if (i == 0) {
            return m18896g();
        }
        if (i == 1) {
            return m18890a(objArr[0]);
        }
        int a = m18888a(i);
        Object[] objArr2 = new Object[a];
        int i2 = a - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a2 = C6954ah.m18539a(objArr[i5], i5);
            int hashCode = a2.hashCode();
            int a3 = C7028p.m18780a(hashCode);
            while (true) {
                int i6 = a3 & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = a2;
                    objArr2[i6] = a2;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj.equals(a2)) {
                    break;
                } else {
                    a3++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new C6974ar(objArr[0], i3);
        }
        if (m18888a(i4) < a / 2) {
            return m18889a(i4, objArr);
        }
        if (m18895a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C6963am(objArr, i3, objArr2, i2, i4);
    }

    /* renamed from: a */
    public static <E> C7047w<E> m18890a(E e) {
        return new C6974ar(e);
    }

    /* renamed from: a */
    public static <E> C7047w<E> m18891a(E e, E e2) {
        return m18889a(2, e, e2);
    }

    /* renamed from: a */
    public static <E> C7047w<E> m18892a(E e, E e2, E e3) {
        return m18889a(3, e, e2, e3);
    }

    /* renamed from: a */
    public static <E> C7047w<E> m18893a(Collection<? extends E> collection) {
        if ((collection instanceof C7047w) && !(collection instanceof SortedSet)) {
            C7047w<E> wVar = (C7047w) collection;
            if (!wVar.mo53235f()) {
                return wVar;
            }
        }
        Object[] array = collection.toArray();
        return m18889a(array.length, array);
    }

    /* renamed from: a */
    public static <E> C7047w<E> m18894a(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? m18889a(eArr.length, (Object[]) eArr.clone()) : m18890a(eArr[0]) : m18896g();
    }

    /* renamed from: a */
    private static boolean m18895a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: g */
    public static <E> C7047w<E> m18896g() {
        return C6963am.f15395a;
    }

    /* renamed from: a */
    public abstract C6980ax<E> iterator();

    /* renamed from: e */
    public C7033s<E> mo53252e() {
        C7033s<E> sVar = this.f15530a;
        if (sVar != null) {
            return sVar;
        }
        C7033s<E> i = mo53246i();
        this.f15530a = i;
        return i;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7047w) || !mo53256h() || !((C7047w) obj).mo53256h() || hashCode() == obj.hashCode()) {
            return C6967aq.m18596a((Set<?>) this, obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo53256h() {
        return false;
    }

    public int hashCode() {
        return C6967aq.m18592a((Set<?>) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7033s<E> mo53246i() {
        return C7033s.m18800b(toArray());
    }
}
