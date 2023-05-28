package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.m */
final class C7023m<T> extends C6955ai<T> implements Serializable {

    /* renamed from: a */
    final Comparator<T> f15491a;

    C7023m(Comparator<T> comparator) {
        this.f15491a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    public int compare(T t, T t2) {
        return this.f15491a.compare(t, t2);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7023m) {
            return this.f15491a.equals(((C7023m) obj).f15491a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15491a.hashCode();
    }

    public String toString() {
        return this.f15491a.toString();
    }
}
