package com.bytedance.sdk.component.p313d.p316c.p317a.p319b;

import com.bytedance.sdk.component.p313d.C10568q;
import com.bytedance.sdk.component.p313d.p316c.p317a.C10520c;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.c */
/* compiled from: LruCountRawCache */
public class C10516c implements C10568q {

    /* renamed from: a */
    private int f26219a;

    /* renamed from: b */
    private int f26220b;

    /* renamed from: c */
    private int f26221c;

    /* renamed from: d */
    private C10520c<String, byte[]> f26222d;

    public C10516c(int i, int i2) {
        this.f26221c = i;
        this.f26219a = i2;
        this.f26222d = new C10520c<String, byte[]>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo64054b(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    /* renamed from: a */
    public boolean mo63992a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f26222d.mo64063a(str, bArr);
        return true;
    }

    /* renamed from: a */
    public byte[] mo63991a(String str) {
        return this.f26222d.mo64062a(str);
    }

    /* renamed from: b */
    public boolean mo63993b(String str) {
        return this.f26222d.mo64062a(str) != null;
    }
}
