package com.applovin.exoplayer2.p221l;

import android.text.TextUtils;

/* renamed from: com.applovin.exoplayer2.l.a */
public final class C7717a {
    /* renamed from: a */
    public static int m22114a(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public static <T> T m22115a(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static <T> T m22116a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m22117a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static void m22118a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m22119a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static <T> T m22120b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m22121b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m22122b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
