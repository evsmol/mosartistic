package com.applovin.exoplayer2.common.p184b;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.b.c */
public final class C7056c {

    /* renamed from: com.applovin.exoplayer2.common.b.c$a */
    private static class C7057a extends AbstractList<Integer> implements Serializable, RandomAccess {

        /* renamed from: a */
        final int[] f15538a;

        /* renamed from: b */
        final int f15539b;

        /* renamed from: c */
        final int f15540c;

        C7057a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        C7057a(int[] iArr, int i, int i2) {
            this.f15538a = iArr;
            this.f15539b = i;
            this.f15540c = i2;
        }

        /* renamed from: a */
        public Integer get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(this.f15538a[this.f15539b + i]);
        }

        /* renamed from: a */
        public Integer set(int i, Integer num) {
            Preconditions.checkElementIndex(i, size());
            int[] iArr = this.f15538a;
            int i2 = this.f15539b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo53590a() {
            return Arrays.copyOfRange(this.f15538a, this.f15539b, this.f15540c);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C7056c.m18931c(this.f15538a, ((Integer) obj).intValue(), this.f15539b, this.f15540c) != -1;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7057a)) {
                return super.equals(obj);
            }
            C7057a aVar = (C7057a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f15538a[this.f15539b + i] != aVar.f15538a[aVar.f15539b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f15539b; i2 < this.f15540c; i2++) {
                i = (i * 31) + C7056c.m18924a(this.f15538a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Integer) || (a = C7056c.m18931c(this.f15538a, ((Integer) obj).intValue(), this.f15539b, this.f15540c)) < 0) {
                return -1;
            }
            return a - this.f15539b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Integer) || (b = C7056c.m18932d(this.f15538a, ((Integer) obj).intValue(), this.f15539b, this.f15540c)) < 0) {
                return -1;
            }
            return b - this.f15539b;
        }

        public int size() {
            return this.f15540c - this.f15539b;
        }

        public List<Integer> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f15538a;
            int i3 = this.f15539b;
            return new C7057a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f15538a[this.f15539b]);
            int i = this.f15539b;
            while (true) {
                i++;
                if (i < this.f15540c) {
                    sb.append(", ");
                    sb.append(this.f15538a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m18924a(int i) {
        return i;
    }

    /* renamed from: a */
    public static int m18925a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m18926a(long j) {
        int i = (int) j;
        Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: a */
    public static List<Integer> m18928a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new C7057a(iArr);
    }

    /* renamed from: a */
    public static int[] m18929a(Collection<? extends Number> collection) {
        if (collection instanceof C7057a) {
            return ((C7057a) collection).mo53590a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m18931c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m18932d(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }
}
