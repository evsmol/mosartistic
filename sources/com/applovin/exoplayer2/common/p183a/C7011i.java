package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.i */
final class C7011i<F, T> extends C6955ai<F> implements Serializable {

    /* renamed from: a */
    final Function<F, ? extends T> f15465a;

    /* renamed from: b */
    final C6955ai<T> f15466b;

    C7011i(Function<F, ? extends T> function, C6955ai<T> aiVar) {
        this.f15465a = (Function) Preconditions.checkNotNull(function);
        this.f15466b = (C6955ai) Preconditions.checkNotNull(aiVar);
    }

    public int compare(F f, F f2) {
        return this.f15466b.compare(this.f15465a.apply(f), this.f15465a.apply(f2));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7011i)) {
            return false;
        }
        C7011i iVar = (C7011i) obj;
        return this.f15465a.equals(iVar.f15465a) && this.f15466b.equals(iVar.f15466b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f15465a, this.f15466b);
    }

    public String toString() {
        return this.f15466b + ".onResultOf(" + this.f15465a + ")";
    }
}
