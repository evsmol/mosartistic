package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0590e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0591f;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;

/* renamed from: com.bytedance.sdk.openadsdk.core.i */
/* compiled from: H5AdInteractionManager */
public class C0508i {

    /* renamed from: a */
    private final Context f1831a;

    /* renamed from: b */
    private final C0477n f1832b;

    /* renamed from: c */
    private C1008c f1833c;

    /* renamed from: d */
    private C0591f f1834d;

    /* renamed from: e */
    private C0590e f1835e;

    /* renamed from: f */
    private View f1836f;

    /* renamed from: g */
    private String f1837g = "rewarded_video";

    public C0508i(Context context, C0477n nVar, View view) {
        this.f1832b = nVar;
        this.f1831a = context;
        this.f1836f = view;
        this.f1837g = C0996u.m4632b(C0996u.m4653e(nVar));
        if (this.f1832b.mo1332L() == 4) {
            this.f1833c = C1009d.m4776a(this.f1831a, this.f1832b, this.f1837g);
        }
        String str = this.f1837g;
        C0591f fVar = new C0591f(context, nVar, str, C0996u.m4610a(str));
        this.f1834d = fVar;
        fVar.mo1100a(this.f1836f);
        this.f1834d.mo1106a(this.f1833c);
        String str2 = this.f1837g;
        C0590e eVar = new C0590e(context, nVar, str2, C0996u.m4610a(str2));
        this.f1835e = eVar;
        eVar.mo1100a(this.f1836f);
        this.f1835e.mo1106a(this.f1833c);
    }

    /* renamed from: a */
    public void mo1629a(int i, C0460j jVar) {
        C0590e eVar;
        if (i != -1 && jVar != null) {
            float f = jVar.f1551a;
            float f2 = jVar.f1552b;
            float f3 = jVar.f1553c;
            float f4 = jVar.f1554d;
            SparseArray<C0408c.C0409a> sparseArray = jVar.f1564n;
            if (i == 1) {
                C0591f fVar = this.f1834d;
                if (fVar != null) {
                    fVar.mo1960a(jVar);
                    this.f1834d.mo106a(this.f1836f, f, f2, f3, f4, sparseArray, true);
                }
            } else if (i == 2 && (eVar = this.f1835e) != null) {
                eVar.mo1959a(jVar);
                this.f1835e.mo106a(this.f1836f, f, f2, f3, f4, sparseArray, true);
            }
        }
    }
}
