package com.applovin.exoplayer2.common.p183a;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.r */
class C7032r<K, V> extends C7004e<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: a */
    final K f15501a;
    @NullableDecl

    /* renamed from: b */
    final V f15502b;

    C7032r(@NullableDecl K k, @NullableDecl V v) {
        this.f15501a = k;
        this.f15502b = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f15501a;
    }

    @NullableDecl
    public final V getValue() {
        return this.f15502b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
