package com.applovin.exoplayer2.p209i.p218i;

import android.text.TextUtils;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.i.g */
public final class C7616g extends C7572d {

    /* renamed from: a */
    private final C7772y f17792a = new C7772y();

    /* renamed from: b */
    private final C7607c f17793b = new C7607c();

    public C7616g() {
        super("WebvttDecoder");
    }

    /* renamed from: a */
    private static int m21681a(C7772y yVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = yVar.mo55074c();
            String C = yVar.mo55062C();
            i = C == null ? 0 : "STYLE".equals(C) ? 2 : C.startsWith("NOTE") ? 1 : 3;
        }
        yVar.mo55076d(i2);
        return i;
    }

    /* renamed from: b */
    private static void m21682b(C7772y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.mo55062C()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) throws C7600h {
        C7609e a;
        this.f17792a.mo55070a(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            C7617h.m21685a(this.f17792a);
            do {
            } while (!TextUtils.isEmpty(this.f17792a.mo55062C()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a2 = m21681a(this.f17792a);
                if (a2 == 0) {
                    return new C7618i(arrayList2);
                }
                if (a2 == 1) {
                    m21682b(this.f17792a);
                } else if (a2 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f17792a.mo55062C();
                        arrayList.addAll(this.f17793b.mo54760a(this.f17792a));
                    } else {
                        throw new C7600h("A style block was found after the first cue.");
                    }
                } else if (a2 == 3 && (a = C7610f.m21650a(this.f17792a, (List<C7608d>) arrayList)) != null) {
                    arrayList2.add(a);
                }
            }
        } catch (C6809ai e) {
            throw new C7600h((Throwable) e);
        }
    }
}
