package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.p313d.p316c.C10523c;
import com.bytedance.sdk.component.p313d.p316c.p321c.C10530a;

/* renamed from: com.bytedance.sdk.component.d.d.b */
/* compiled from: BytesVisitor */
public class C10542b implements C10550i {

    /* renamed from: a */
    private byte[] f26330a;

    /* renamed from: b */
    private C10557f f26331b;

    /* renamed from: a */
    public String mo64146a() {
        return "image_type";
    }

    public C10542b(byte[] bArr, C10557f fVar) {
        this.f26330a = bArr;
        this.f26331b = fVar;
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        C10550i iVar;
        C10571t i = cVar.mo64087i();
        cVar.mo64073a(this.f26330a.length);
        int i2 = C105431.f26332a[i.ordinal()];
        if (i2 == 1) {
            byte[] bArr = this.f26330a;
            iVar = new C10555m(bArr, this.f26331b, C10530a.m30851b(bArr));
        } else if (i2 != 3) {
            if (C10530a.m30850a(this.f26330a)) {
                iVar = new C10546e(this.f26330a, this.f26331b);
            } else {
                byte[] bArr2 = this.f26330a;
                iVar = new C10555m(bArr2, this.f26331b, C10530a.m30851b(bArr2));
            }
        } else if (C10530a.m30850a(this.f26330a)) {
            iVar = new C10546e(this.f26330a, this.f26331b);
        } else if (this.f26331b == null) {
            iVar = new C10552k();
        } else {
            iVar = new C10549h(1001, "not image format", (Throwable) null);
        }
        cVar.mo64078a(iVar);
    }

    /* renamed from: com.bytedance.sdk.component.d.d.b$1 */
    /* compiled from: BytesVisitor */
    static /* synthetic */ class C105431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26332a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.component.d.t[] r0 = com.bytedance.sdk.component.p313d.C10571t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26332a = r0
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p313d.C10571t.RAW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26332a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p313d.C10571t.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26332a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p313d.C10571t.BITMAP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p322d.C10542b.C105431.<clinit>():void");
        }
    }
}
