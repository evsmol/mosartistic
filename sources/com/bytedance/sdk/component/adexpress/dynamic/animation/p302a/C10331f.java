package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.f */
/* compiled from: RippleAnimation */
public class C10331f extends C10325d {
    public C10331f(View view, C10343a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo63282a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25532c, "rippleValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        this.f25532c.setTag(C10647t.m31283e(this.f25532c.getContext(), "tt_id_ripple_bg"), this.f25531b.mo63337g());
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo63286a(duration));
        return arrayList;
    }
}
