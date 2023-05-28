package com.applovin.exoplayer2.p219j;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.j.h */
public final class C7644h {

    /* renamed from: a */
    public final int f17931a;

    /* renamed from: b */
    private final C7643g[] f17932b;

    /* renamed from: c */
    private int f17933c;

    public C7644h(C7643g... gVarArr) {
        this.f17932b = gVarArr;
        this.f17931a = gVarArr.length;
    }

    /* renamed from: a */
    public C7643g mo54863a(int i) {
        return this.f17932b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f17932b, ((C7644h) obj).f17932b);
    }

    public int hashCode() {
        if (this.f17933c == 0) {
            this.f17933c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f17932b);
        }
        return this.f17933c;
    }
}
