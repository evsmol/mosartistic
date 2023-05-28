package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.k */
/* compiled from: TranslateAnimation */
public class C10338k extends C10325d {
    public C10338k(View view, C10343a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo63282a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25532c, "translationX", new float[]{C10305b.m29747a(C10303c.m29743a(), (float) this.f25531b.mo63331e()), 0.0f}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f25532c, "translationY", new float[]{C10305b.m29747a(C10303c.m29743a(), (float) this.f25531b.mo63335f()), 0.0f}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo63286a(duration));
        arrayList.add(mo63286a(duration2));
        return arrayList;
    }
}
