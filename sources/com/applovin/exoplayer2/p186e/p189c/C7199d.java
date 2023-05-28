package com.applovin.exoplayer2.p186e.p189c;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.c.d */
abstract class C7199d {

    /* renamed from: a */
    protected final C7357x f15867a;

    /* renamed from: com.applovin.exoplayer2.e.c.d$a */
    public static final class C7200a extends C6809ai {
        public C7200a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected C7199d(C7357x xVar) {
        this.f15867a = xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo53883a(C7772y yVar) throws C6809ai;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo53884a(C7772y yVar, long j) throws C6809ai;

    /* renamed from: b */
    public final boolean mo53888b(C7772y yVar, long j) throws C6809ai {
        return mo53883a(yVar) && mo53884a(yVar, j);
    }
}
