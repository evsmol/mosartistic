package com.bytedance.sdk.openadsdk.core.p017c.p019b;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10375a;
import com.bytedance.sdk.component.adexpress.p298b.C10294j;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.b.a */
/* compiled from: DynamicClickListener */
public class C0438a extends C0408c implements C10375a {

    /* renamed from: a */
    protected WeakReference<View> f1461a;

    /* renamed from: b */
    protected WeakReference<View> f1462b;

    /* renamed from: c */
    private C10294j f1463c;

    /* renamed from: a */
    public void mo1185a(C10294j jVar) {
        this.f1463c = jVar;
    }

    /* renamed from: a */
    public void mo1184a(View view) {
        this.f1461a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public void mo1186b(View view) {
        this.f1462b = new WeakReference<>(view);
    }

    /* renamed from: a */
    public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
        m1794a(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    /* renamed from: a */
    private void m1794a(View view, int i, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray) {
        if (this.f1463c != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f1462b;
            if (weakReference != null) {
                int[] a = C1002v.m4730a((View) weakReference.get());
                if (a != null) {
                    iArr = a;
                }
                int[] c = C1002v.m4743c((View) this.f1462b.get());
                if (c != null) {
                    iArr2 = c;
                }
            }
            String str = "";
            try {
                if (view.getTag(C10647t.m31283e(view.getContext(), "tt_id_click_area_type")) != null) {
                    str = String.valueOf(view.getTag(C10647t.m31283e(view.getContext(), "tt_id_click_area_type")));
                }
            } catch (Exception unused) {
            }
            this.f1463c.mo63173a(view, i, new C0460j.C0462a().mo1277d(f).mo1275c(f2).mo1272b(f3).mo1264a(f4).mo1274b(this.f1365w).mo1266a(this.f1366x).mo1276c(iArr[0]).mo1278d(iArr[1]).mo1279e(iArr2[0]).mo1280f(iArr2[1]).mo1267a(sparseArray).mo1270a(this.f1356C).mo1268a(str).mo1271a());
        }
    }
}
