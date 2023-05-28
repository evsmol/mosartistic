package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;
import java.util.ArrayList;
import java.util.List;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g */
/* compiled from: RubInAnimation */
public class C10332g extends C10325d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10334a f25542d;

    public C10332g(View view, C10343a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo63282a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25532c, "alpha", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        this.f25542d = new C10334a(this.f25532c);
        final int i = this.f25532c.getLayoutParams().height;
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f25542d, IabUtils.KEY_HEIGHT, new int[]{0, i}).setDuration((long) ((int) (this.f25531b.mo63341i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo63286a(duration));
        arrayList.add(mo63286a(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator, boolean z) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationStart(Animator animator, boolean z) {
            }

            public void onAnimationEnd(Animator animator) {
                C10332g.this.f25542d.mo63302a(i);
            }
        });
        return arrayList;
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g$a */
    /* compiled from: RubInAnimation */
    private class C10334a {

        /* renamed from: b */
        private View f25546b;

        public C10334a(View view) {
            this.f25546b = view;
        }

        /* renamed from: a */
        public void mo63302a(int i) {
            ViewGroup.LayoutParams layoutParams = this.f25546b.getLayoutParams();
            layoutParams.height = i;
            this.f25546b.setLayoutParams(layoutParams);
            this.f25546b.requestLayout();
        }
    }
}
