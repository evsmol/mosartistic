package com.applovin.exoplayer2.p209i.p211b;

import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.b.a */
public final class C7556a extends C7572d {

    /* renamed from: a */
    private final C7557b f17532a;

    public C7556a(List<byte[]> list) {
        super("DvbDecoder");
        C7772y yVar = new C7772y(list.get(0));
        this.f17532a = new C7557b(yVar.mo55085i(), yVar.mo55085i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f17532a.mo54701a();
        }
        return new C7566c(this.f17532a.mo54700a(bArr, i));
    }
}
