package com.bytedance.sdk.component.p313d.p322d;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.p316c.C10523c;
import com.bytedance.sdk.component.p313d.p316c.C10537f;

/* renamed from: com.bytedance.sdk.component.d.d.e */
/* compiled from: DecoderVisitor */
public class C10546e extends C10541a {

    /* renamed from: a */
    private byte[] f26333a;

    /* renamed from: b */
    private C10557f f26334b;

    /* renamed from: a */
    public String mo64146a() {
        return "decode";
    }

    public C10546e(byte[] bArr, C10557f fVar) {
        this.f26333a = bArr;
        this.f26334b = fVar;
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        C10537f p = cVar.mo64094p();
        try {
            Bitmap a = p.mo64133a(cVar).mo64071a(this.f26333a);
            if (a != null) {
                cVar.mo64078a((C10550i) new C10555m(a, this.f26334b, false));
                p.mo64135a(cVar.mo64095q()).mo63992a(cVar.mo64083e(), a);
                return;
            }
            m30913a(1002, "decode failed bitmap null", (Throwable) null, cVar);
        } catch (Throwable th) {
            m30913a(1002, "decode failed:" + th.getMessage(), th, cVar);
        }
    }

    /* renamed from: a */
    private void m30913a(int i, String str, Throwable th, C10523c cVar) {
        if (this.f26334b == null) {
            cVar.mo64078a((C10550i) new C10552k());
        } else {
            cVar.mo64078a((C10550i) new C10549h(i, str, th));
        }
    }
}
