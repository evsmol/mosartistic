package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.exoplayer2.common.a.a */
abstract class C6929a<E> extends C6981ay<E> {

    /* renamed from: a */
    private final int f15361a;

    /* renamed from: b */
    private int f15362b;

    protected C6929a(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.f15361a = i;
        this.f15362b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo53158a(int i);

    public final boolean hasNext() {
        return this.f15362b < this.f15361a;
    }

    public final boolean hasPrevious() {
        return this.f15362b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f15362b;
            this.f15362b = i + 1;
            return mo53158a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f15362b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f15362b - 1;
            this.f15362b = i;
            return mo53158a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f15362b - 1;
    }
}
