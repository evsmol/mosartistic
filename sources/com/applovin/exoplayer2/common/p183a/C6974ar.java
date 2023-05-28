package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

/* renamed from: com.applovin.exoplayer2.common.a.ar */
final class C6974ar<E> extends C7047w<E> {

    /* renamed from: a */
    final transient E f15412a;
    @LazyInit

    /* renamed from: b */
    private transient int f15413b;

    C6974ar(E e) {
        this.f15412a = Preconditions.checkNotNull(e);
    }

    C6974ar(E e, int i) {
        this.f15412a = e;
        this.f15413b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53231a(Object[] objArr, int i) {
        objArr[i] = this.f15412a;
        return i + 1;
    }

    /* renamed from: a */
    public C6980ax<E> iterator() {
        return C7049y.m18908a(this.f15412a);
    }

    public boolean contains(Object obj) {
        return this.f15412a.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo53235f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo53256h() {
        return this.f15413b != 0;
    }

    public final int hashCode() {
        int i = this.f15413b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f15412a.hashCode();
        this.f15413b = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7033s<E> mo53246i() {
        return C7033s.m18793a(this.f15412a);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f15412a.toString() + ']';
    }
}
