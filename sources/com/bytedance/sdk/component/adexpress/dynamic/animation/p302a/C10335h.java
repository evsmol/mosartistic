package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.h */
/* compiled from: ScaleAnimation */
public class C10335h extends C10325d {
    public C10335h(View view, C10343a aVar) {
        super(view, aVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof DynamicBaseWidget)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof DynamicBaseWidget)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo63282a() {
        this.f25532c.setTag(C10647t.m31283e(this.f25532c.getContext(), "tt_id_direction"), this.f25531b.mo63314a());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25532c, "scaleX", new float[]{1.0f, (float) this.f25531b.mo63342j()}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f25532c, "scaleY", new float[]{1.0f, (float) this.f25531b.mo63343k()}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo63286a(duration));
        arrayList.add(mo63286a(duration2));
        return arrayList;
    }
}
