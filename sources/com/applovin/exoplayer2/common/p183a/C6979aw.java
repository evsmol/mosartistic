package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: com.applovin.exoplayer2.common.a.aw */
abstract class C6979aw<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f15414a;

    C6979aw(Iterator<? extends F> it) {
        this.f15414a = (Iterator) Preconditions.checkNotNull(it);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo53165a(F f);

    public final boolean hasNext() {
        return this.f15414a.hasNext();
    }

    public final T next() {
        return mo53165a(this.f15414a.next());
    }

    public final void remove() {
        this.f15414a.remove();
    }
}
