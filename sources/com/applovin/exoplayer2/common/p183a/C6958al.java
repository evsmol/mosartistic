package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.al */
final class C6958al<K, V> extends C7039u<K, V> {

    /* renamed from: b */
    static final C7039u<Object, Object> f15381b = new C6958al((int[]) null, new Object[0], 0);

    /* renamed from: c */
    final transient Object[] f15382c;

    /* renamed from: d */
    private final transient int[] f15383d;

    /* renamed from: e */
    private final transient int f15384e;

    /* renamed from: com.applovin.exoplayer2.common.a.al$a */
    static class C6959a<K, V> extends C7047w<Map.Entry<K, V>> {

        /* renamed from: a */
        private final transient C7039u<K, V> f15385a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final transient Object[] f15386b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final transient int f15387c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final transient int f15388d;

        C6959a(C7039u<K, V> uVar, Object[] objArr, int i, int i2) {
            this.f15385a = uVar;
            this.f15386b = objArr;
            this.f15387c = i;
            this.f15388d = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo53231a(Object[] objArr, int i) {
            return mo53252e().mo53231a(objArr, i);
        }

        /* renamed from: a */
        public C6980ax<Map.Entry<K, V>> iterator() {
            return mo53252e().iterator();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f15385a.get(key));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53235f() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C7033s<Map.Entry<K, V>> mo53246i() {
            return new C7033s<Map.Entry<K, V>>() {
                /* renamed from: b */
                public Map.Entry<K, V> get(int i) {
                    Preconditions.checkElementIndex(i, C6959a.this.f15388d);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(C6959a.this.f15386b[C6959a.this.f15387c + i2], C6959a.this.f15386b[i2 + (C6959a.this.f15387c ^ 1)]);
                }

                /* renamed from: f */
                public boolean mo53235f() {
                    return true;
                }

                public int size() {
                    return C6959a.this.f15388d;
                }
            };
        }

        public int size() {
            return this.f15388d;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.al$b */
    static final class C6961b<K> extends C7047w<K> {

        /* renamed from: a */
        private final transient C7039u<K, ?> f15390a;

        /* renamed from: b */
        private final transient C7033s<K> f15391b;

        C6961b(C7039u<K, ?> uVar, C7033s<K> sVar) {
            this.f15390a = uVar;
            this.f15391b = sVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo53231a(Object[] objArr, int i) {
            return mo53252e().mo53231a(objArr, i);
        }

        /* renamed from: a */
        public C6980ax<K> iterator() {
            return mo53252e().iterator();
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f15390a.get(obj) != null;
        }

        /* renamed from: e */
        public C7033s<K> mo53252e() {
            return this.f15391b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53235f() {
            return true;
        }

        public int size() {
            return this.f15390a.size();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.al$c */
    static final class C6962c extends C7033s<Object> {

        /* renamed from: a */
        private final transient Object[] f15392a;

        /* renamed from: b */
        private final transient int f15393b;

        /* renamed from: c */
        private final transient int f15394c;

        C6962c(Object[] objArr, int i, int i2) {
            this.f15392a = objArr;
            this.f15393b = i;
            this.f15394c = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53235f() {
            return true;
        }

        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.f15394c);
            return this.f15392a[(i * 2) + this.f15393b];
        }

        public int size() {
            return this.f15394c;
        }
    }

    private C6958al(int[] iArr, Object[] objArr, int i) {
        this.f15383d = iArr;
        this.f15382c = objArr;
        this.f15384e = i;
    }

    /* renamed from: a */
    static <K, V> C6958al<K, V> m18558a(int i, Object[] objArr) {
        if (i == 0) {
            return (C6958al) f15381b;
        }
        if (i == 1) {
            C7012j.m18716a(objArr[0], objArr[1]);
            return new C6958al<>((int[]) null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        return new C6958al<>(m18560a(objArr, i, C7047w.m18888a(i), 0), objArr, i);
    }

    /* renamed from: a */
    static Object m18559a(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a = C7028p.m18780a(obj.hashCode());
            while (true) {
                int i3 = a & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a = i3 + 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] m18560a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.exoplayer2.common.p183a.C7012j.m18716a((java.lang.Object) r11, (java.lang.Object) r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.exoplayer2.common.p183a.C7012j.m18716a((java.lang.Object) r6, (java.lang.Object) r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.exoplayer2.common.p183a.C7028p.m18780a((int) r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.p183a.C6958al.m18560a(java.lang.Object[], int, int, int):int[]");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C7047w<Map.Entry<K, V>> mo53238d() {
        return new C6959a(this, this.f15382c, 0, this.f15384e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7047w<K> mo53239f() {
        return new C6961b(this, new C6962c(this.f15382c, 0, this.f15384e));
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return m18559a(this.f15383d, this.f15382c, this.f15384e, 0, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C7029q<V> mo53241h() {
        return new C6962c(this.f15382c, 1, this.f15384e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo53242i() {
        return false;
    }

    public int size() {
        return this.f15384e;
    }
}
