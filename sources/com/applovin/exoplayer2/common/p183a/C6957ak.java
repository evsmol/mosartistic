package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* renamed from: com.applovin.exoplayer2.common.a.ak */
class C6957ak<E> extends C7033s<E> {

    /* renamed from: a */
    static final C7033s<Object> f15378a = new C6957ak(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f15379b;

    /* renamed from: c */
    private final transient int f15380c;

    C6957ak(Object[] objArr, int i) {
        this.f15379b = objArr;
        this.f15380c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53231a(Object[] objArr, int i) {
        System.arraycopy(this.f15379b, 0, objArr, i, this.f15380c);
        return i + this.f15380c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object[] mo53232b() {
        return this.f15379b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo53233c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo53234d() {
        return this.f15380c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo53235f() {
        return false;
    }

    public E get(int i) {
        Preconditions.checkElementIndex(i, this.f15380c);
        return this.f15379b[i];
    }

    public int size() {
        return this.f15380c;
    }
}
