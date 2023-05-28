package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* renamed from: com.applovin.exoplayer2.common.a.ag */
final class C6953ag extends C6955ai<Comparable> implements Serializable {

    /* renamed from: a */
    static final C6953ag f15377a = new C6953ag();

    private C6953ag() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public <S extends Comparable> C6955ai<S> mo53225a() {
        return C6964an.f15401a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
