package com.applovin.exoplayer2.common.p183a;

/* renamed from: com.applovin.exoplayer2.common.a.ah */
public final class C6954ah {
    /* renamed from: a */
    static Object m18539a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: a */
    static Object[] m18540a(Object... objArr) {
        return m18542b(objArr, objArr.length);
    }

    /* renamed from: a */
    public static <T> T[] m18541a(T[] tArr, int i) {
        return C6956aj.m18551a(tArr, i);
    }

    /* renamed from: b */
    static Object[] m18542b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m18539a(objArr[i2], i2);
        }
        return objArr;
    }
}
