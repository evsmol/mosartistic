package com.applovin.exoplayer2.p220k;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p220k.C7691t;
import com.applovin.exoplayer2.p220k.C7699v;
import com.applovin.exoplayer2.p220k.C7701w;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.k.r */
public class C7687r implements C7699v {

    /* renamed from: a */
    private final int f18154a;

    public C7687r() {
        this(-1);
    }

    public C7687r(int i) {
        this.f18154a = i;
    }

    /* renamed from: a */
    public int mo54929a(int i) {
        int i2 = this.f18154a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    /* renamed from: a */
    public long mo54930a(C7699v.C7700a aVar) {
        IOException iOException = aVar.f18173c;
        if ((iOException instanceof C6809ai) || (iOException instanceof FileNotFoundException) || (iOException instanceof C7691t.C7692a) || (iOException instanceof C7701w.C7709g) || C7672j.m21956a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f18174d - 1) * 1000, 5000);
    }

    /* renamed from: a */
    public /* synthetic */ void mo54931a(long j) {
        C7699v.CC.$default$a(this, j);
    }
}
