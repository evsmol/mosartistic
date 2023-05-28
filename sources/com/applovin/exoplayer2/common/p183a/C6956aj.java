package com.applovin.exoplayer2.common.p183a;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.common.a.aj */
final class C6956aj {
    /* renamed from: a */
    static <K, V> Map<K, V> m18549a() {
        return C7014l.m18725a();
    }

    /* renamed from: a */
    static <K, V> Map<K, V> m18550a(int i) {
        return C7014l.m18726a(i);
    }

    /* renamed from: a */
    static <T> T[] m18551a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: a */
    static <T> T[] m18552a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
