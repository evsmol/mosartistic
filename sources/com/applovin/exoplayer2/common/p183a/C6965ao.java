package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.ao */
final class C6965ao<T> extends C6955ai<T> implements Serializable {

    /* renamed from: a */
    final C6955ai<? super T> f15402a;

    C6965ao(C6955ai<? super T> aiVar) {
        this.f15402a = (C6955ai) Preconditions.checkNotNull(aiVar);
    }

    /* renamed from: a */
    public <S extends T> C6955ai<S> mo53225a() {
        return this.f15402a;
    }

    public int compare(T t, T t2) {
        return this.f15402a.compare(t2, t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6965ao) {
            return this.f15402a.equals(((C6965ao) obj).f15402a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f15402a.hashCode();
    }

    public String toString() {
        return this.f15402a + ".reverse()";
    }
}
