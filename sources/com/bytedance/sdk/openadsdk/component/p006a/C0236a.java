package com.bytedance.sdk.openadsdk.component.p006a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.component.a.a */
/* compiled from: TTAppOpenAdClickListener */
public class C0236a extends C0405a {
    public C0236a(Context context, C0477n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
        if (view.getId() == C10647t.m31283e(C0558m.m2663a(), "tt_open_ad_click_button")) {
            mo1107a("click_bar");
        } else {
            mo1107a("click_material");
        }
        super.mo106a(view, f, f2, f3, f4, sparseArray, z);
    }
}
