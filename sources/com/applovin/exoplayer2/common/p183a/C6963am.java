package com.applovin.exoplayer2.common.p183a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.am */
final class C6963am<E> extends C7047w<E> {

    /* renamed from: a */
    static final C6963am<Object> f15395a = new C6963am(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: b */
    final transient Object[] f15396b;

    /* renamed from: c */
    final transient Object[] f15397c;

    /* renamed from: d */
    private final transient int f15398d;

    /* renamed from: e */
    private final transient int f15399e;

    /* renamed from: f */
    private final transient int f15400f;

    C6963am(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f15396b = objArr;
        this.f15397c = objArr2;
        this.f15398d = i2;
        this.f15399e = i;
        this.f15400f = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53231a(Object[] objArr, int i) {
        System.arraycopy(this.f15396b, 0, objArr, i, this.f15400f);
        return i + this.f15400f;
    }

    /* renamed from: a */
    public C6980ax<E> iterator() {
        return mo53252e().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object[] mo53232b() {
        return this.f15396b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo53233c() {
        return 0;
    }

    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f15397c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C7028p.m18782a(obj);
        while (true) {
            int i = a & this.f15398d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo53234d() {
        return this.f15400f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo53235f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo53256h() {
        return true;
    }

    public int hashCode() {
        return this.f15399e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7033s<E> mo53246i() {
        return C7033s.m18801b(this.f15396b, this.f15400f);
    }

    public int size() {
        return this.f15400f;
    }
}
