package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* renamed from: com.applovin.exoplayer2.common.a.an */
final class C6964an extends C6955ai<Comparable> implements Serializable {

    /* renamed from: a */
    static final C6964an f15401a = new C6964an();

    private C6964an() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: a */
    public <S extends Comparable> C6955ai<S> mo53225a() {
        return C6955ai.m18544b();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
