package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.a */
/* compiled from: AlphaAnimation */
public class C10322a extends C10325d {
    public C10322a(View view, C10343a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo63282a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25532c, "alpha", new float[]{((float) this.f25531b.mo63349q()) / 100.0f, ((float) this.f25531b.mo63350r()) / 100.0f}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo63286a(duration));
        return arrayList;
    }
}
