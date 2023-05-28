package com.applovin.exoplayer2.p209i.p218i;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.i.a */
public final class C7605a extends C7572d {

    /* renamed from: a */
    private final C7772y f17742a = new C7772y();

    public C7605a() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: a */
    private static C7540a m21596a(C7772y yVar, int i) throws C7600h {
        CharSequence charSequence = null;
        C7540a.C7542a aVar = null;
        while (i > 0) {
            if (i >= 8) {
                int q = yVar.mo55093q();
                int q2 = yVar.mo55093q();
                int i2 = q - 8;
                String a = C7728ai.m22204a(yVar.mo55077d(), yVar.mo55074c(), i2);
                yVar.mo55079e(i2);
                i = (i - 8) - i2;
                if (q2 == 1937011815) {
                    aVar = C7610f.m21648a(a);
                } else if (q2 == 1885436268) {
                    charSequence = C7610f.m21647a((String) null, a.trim(), (List<C7608d>) Collections.emptyList());
                }
            } else {
                throw new C7600h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return aVar != null ? aVar.mo54643a(charSequence).mo54656e() : C7610f.m21649a(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) throws C7600h {
        this.f17742a.mo55070a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f17742a.mo55064a() > 0) {
            if (this.f17742a.mo55064a() >= 8) {
                int q = this.f17742a.mo55093q();
                if (this.f17742a.mo55093q() == 1987343459) {
                    arrayList.add(m21596a(this.f17742a, q - 8));
                } else {
                    this.f17742a.mo55079e(q - 8);
                }
            } else {
                throw new C7600h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C7606b(arrayList);
    }
}
