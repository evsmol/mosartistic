package com.bytedance.sdk.component.p313d.p316c.p317a.p319b;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p313d.C10567p;
import com.bytedance.sdk.component.p313d.p316c.p317a.C10512b;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.d */
/* compiled from: MemoryCacheWrapper */
public class C10518d implements C10567p {

    /* renamed from: a */
    private final C10567p f26224a;

    /* renamed from: b */
    private final C10512b f26225b;

    public C10518d(C10567p pVar) {
        this(pVar, (C10512b) null);
    }

    public C10518d(C10567p pVar, C10512b bVar) {
        this.f26224a = pVar;
        this.f26225b = bVar;
    }

    /* renamed from: a */
    public boolean mo63992a(String str, Bitmap bitmap) {
        boolean a = this.f26224a.mo63992a(str, bitmap);
        C10512b bVar = this.f26225b;
        if (bVar != null) {
            bVar.mo64048a(str, Boolean.valueOf(a));
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo63991a(String str) {
        Bitmap bitmap = (Bitmap) this.f26224a.mo63991a(str);
        C10512b bVar = this.f26225b;
        if (bVar != null) {
            bVar.mo64049b(str, bitmap);
        }
        return bitmap;
    }

    /* renamed from: b */
    public boolean mo63993b(String str) {
        return this.f26224a.mo63993b(str);
    }
}
