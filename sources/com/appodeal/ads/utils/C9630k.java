package com.appodeal.ads.utils;

import java.util.Objects;

/* renamed from: com.appodeal.ads.utils.k */
public final class C9630k {

    /* renamed from: a */
    public final int f24402a;

    /* renamed from: b */
    public final String f24403b;

    /* renamed from: c */
    public final String f24404c;

    /* renamed from: d */
    public final int f24405d;

    /* renamed from: e */
    public final double f24406e;

    /* renamed from: f */
    public final boolean f24407f;

    /* renamed from: g */
    public final int f24408g;

    public C9630k(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.f24402a = i;
        this.f24408g = i2;
        this.f24403b = str;
        this.f24404c = str2;
        this.f24405d = Integer.parseInt(str3);
        this.f24406e = Double.parseDouble(str4);
        this.f24407f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9630k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f24404c, ((C9630k) obj).f24404c);
    }

    public final int hashCode() {
        String str = this.f24404c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
