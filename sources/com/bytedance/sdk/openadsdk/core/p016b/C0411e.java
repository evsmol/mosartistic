package com.bytedance.sdk.openadsdk.core.p016b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.e */
/* compiled from: RewardBarClickListener */
public abstract class C0411e extends C0405a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo115a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3, boolean z);

    public C0411e(Context context, C0477n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
        View view2 = view;
        if (mo1110a(view, z)) {
            mo115a(view, f, f2, f3, f4, sparseArray, this.f1355A, this.f1367y, this.f1368z, z);
        }
        super.mo106a(view, f, f2, f3, f4, sparseArray, z);
    }
}
