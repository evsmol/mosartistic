package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* renamed from: com.applovin.exoplayer2.common.a.j */
final class C7012j {
    /* renamed from: a */
    static int m18715a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: a */
    static void m18716a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    /* renamed from: a */
    static void m18717a(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
