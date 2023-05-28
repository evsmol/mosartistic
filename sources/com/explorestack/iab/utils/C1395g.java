package com.explorestack.iab.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* renamed from: com.explorestack.iab.utils.g */
public abstract class C1395g<T extends View> {

    /* renamed from: a */
    public final View.OnClickListener f4315a;

    /* renamed from: b */
    public T f4316b;

    /* renamed from: c */
    public IabElementStyle f4317c;

    /* renamed from: d */
    public boolean f4318d = false;

    /* renamed from: e */
    public final Runnable f4319e = new C1396a();

    /* renamed from: f */
    public final Animator.AnimatorListener f4320f = new C1397b();

    /* renamed from: com.explorestack.iab.utils.g$a */
    public class C1396a implements Runnable {
        public C1396a() {
        }

        public void run() {
            boolean unused = C1395g.this.f4318d = false;
            C1395g gVar = C1395g.this;
            T t = gVar.f4316b;
            if (t != null && gVar.f4317c != null) {
                ViewPropertyAnimator listener = t.animate().alpha(0.0f).setDuration(400).setListener(C1395g.this.f4320f);
                if (Build.VERSION.SDK_INT >= 16) {
                    listener.withLayer();
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.utils.g$b */
    public class C1397b extends AnimatorListenerAdapter {
        public C1397b() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            T t = C1395g.this.f4316b;
            if (t != null) {
                t.setClickable(t.getAlpha() != 0.0f);
            }
        }
    }

    public C1395g(View.OnClickListener onClickListener) {
        this.f4315a = onClickListener;
    }

    /* renamed from: a */
    public ViewGroup.MarginLayoutParams mo4110a(Context context, IabElementStyle iabElementStyle) {
        return new ViewGroup.MarginLayoutParams(iabElementStyle.getWidth(context).intValue(), iabElementStyle.getHeight(context).intValue());
    }

    /* renamed from: a */
    public void mo4111a() {
        T t = this.f4316b;
        if (t != null) {
            t.bringToFront();
        }
    }

    /* renamed from: a */
    public void mo4112a(int i) {
        T t = this.f4316b;
        if (t != null) {
            t.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo4102a(Context context, T t, IabElementStyle iabElementStyle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.widget.FrameLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4113a(android.content.Context r4, android.view.ViewGroup r5, com.explorestack.iab.utils.IabElementStyle r6) {
        /*
            r3 = this;
            com.explorestack.iab.utils.IabElementStyle r0 = r3.mo4105c(r4, r6)
            com.explorestack.iab.utils.IabElementStyle r6 = r0.copyWith(r6)
            java.lang.Boolean r0 = r6.isVisible()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0016
            r3.mo4117c()
            return
        L_0x0016:
            boolean r0 = r5 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0027
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r1 = r3.mo4110a((android.content.Context) r4, (com.explorestack.iab.utils.IabElementStyle) r6)
            r0.<init>(r1)
            r6.applyAlignment(r0)
            goto L_0x0037
        L_0x0027:
            boolean r0 = r5 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x0084
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r1 = r3.mo4110a((android.content.Context) r4, (com.explorestack.iab.utils.IabElementStyle) r6)
            r0.<init>(r1)
            r6.applyRelativeAlignment(r0)
        L_0x0037:
            r6.applyMargin(r4, r0)
            T r1 = r3.f4316b
            if (r1 == 0) goto L_0x0055
            com.explorestack.iab.utils.IabElementStyle r2 = r3.f4317c
            if (r2 == 0) goto L_0x0055
            boolean r1 = r3.mo4115a(r1, (com.explorestack.iab.utils.IabElementStyle) r2, (com.explorestack.iab.utils.IabElementStyle) r6)
            if (r1 == 0) goto L_0x0049
            goto L_0x0055
        L_0x0049:
            T r5 = r3.f4316b
            r5.setLayoutParams(r0)
            T r5 = r3.f4316b
            r0 = 0
            r5.setVisibility(r0)
            goto L_0x005e
        L_0x0055:
            android.view.View r1 = r3.mo4104b(r4, r6)
            r3.f4316b = r1
            r5.addView(r1, r0)
        L_0x005e:
            T r5 = r3.f4316b
            java.lang.Float r0 = r6.getOpacity()
            float r0 = r0.floatValue()
            r5.setAlpha(r0)
            T r5 = r3.f4316b
            r6.applyPadding(r4, r5)
            T r5 = r3.f4316b
            android.view.View$OnClickListener r0 = r3.f4315a
            r5.setOnClickListener(r0)
            r3.f4317c = r6
            T r5 = r3.f4316b
            r3.mo4114a(r5, (com.explorestack.iab.utils.IabElementStyle) r6)
            T r5 = r3.f4316b
            r3.mo4102a((android.content.Context) r4, r5, (com.explorestack.iab.utils.IabElementStyle) r6)
            return
        L_0x0084:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Parent should be instance of FrameLayout or RelativeLayout"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.C1395g.mo4113a(android.content.Context, android.view.ViewGroup, com.explorestack.iab.utils.IabElementStyle):void");
    }

    /* renamed from: a */
    public void mo4114a(T t, IabElementStyle iabElementStyle) {
        if (t instanceof IabElement) {
            ((IabElement) t).setStyle(iabElementStyle);
        }
    }

    /* renamed from: a */
    public boolean mo4115a(T t, IabElementStyle iabElementStyle, IabElementStyle iabElementStyle2) {
        return !TextUtils.equals(iabElementStyle.getStyle(), iabElementStyle2.getStyle());
    }

    /* renamed from: b */
    public abstract T mo4104b(Context context, IabElementStyle iabElementStyle);

    /* renamed from: b */
    public void mo4116b() {
        this.f4318d = false;
        T t = this.f4316b;
        if (t != null && this.f4317c != null) {
            t.animate().cancel();
            this.f4316b.removeCallbacks(this.f4319e);
            this.f4316b.setClickable(true);
            this.f4316b.setAlpha(this.f4317c.getOpacity().floatValue());
        }
    }

    /* renamed from: c */
    public abstract IabElementStyle mo4105c(Context context, IabElementStyle iabElementStyle);

    /* renamed from: c */
    public void mo4117c() {
        if (this.f4316b != null) {
            mo4116b();
            Utils.removeFromParent(this.f4316b);
            this.f4316b = null;
            this.f4317c = null;
        }
    }

    /* renamed from: d */
    public void mo4118d() {
        if (mo4119e()) {
            mo4102a(this.f4316b.getContext(), this.f4316b, this.f4317c);
        }
    }

    /* renamed from: e */
    public boolean mo4119e() {
        return this.f4316b != null;
    }

    /* renamed from: f */
    public void mo4120f() {
        IabElementStyle iabElementStyle;
        Float hideAfter;
        if (!this.f4318d && this.f4316b != null && (iabElementStyle = this.f4317c) != null && (hideAfter = iabElementStyle.getHideAfter()) != null && hideAfter.floatValue() != 0.0f) {
            this.f4318d = true;
            this.f4316b.postDelayed(this.f4319e, (long) (hideAfter.floatValue() * 1000.0f));
        }
    }

    /* renamed from: g */
    public void mo4121g() {
        if (this.f4316b != null && this.f4317c != null) {
            mo4116b();
            mo4120f();
        }
    }
}
