package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C10388c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.b */
/* compiled from: AnimationSets */
public class C10323b implements C10388c {

    /* renamed from: a */
    List<C10325d> f25528a = new ArrayList();

    public C10323b(View view, List<C10343a> list) {
        for (C10343a a : list) {
            C10325d a2 = C10324c.m29828a().mo63285a(view, a);
            if (a2 != null) {
                this.f25528a.add(a2);
            }
        }
    }

    /* renamed from: a */
    public void mo63283a() {
        for (C10325d c : this.f25528a) {
            try {
                c.mo63287c();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo63284b() {
        for (C10325d b : this.f25528a) {
            try {
                b.mo63284b();
            } catch (Exception unused) {
            }
        }
    }
}
