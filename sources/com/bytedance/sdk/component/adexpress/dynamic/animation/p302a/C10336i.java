package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.i */
/* compiled from: ShineAnimation */
public class C10336i extends C10325d {
    public C10336i(View view, C10343a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo63282a() {
        this.f25532c.setTag(C10647t.m31283e(this.f25532c.getContext(), "tt_id_shine_width"), Integer.valueOf(this.f25531b.mo63323c()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25532c, "shineValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo63286a(duration));
        return arrayList;
    }
}
