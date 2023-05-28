package com.applovin.exoplayer2.p224ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.exoplayer2.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final C7837b f18684a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7836a f18685b;

    /* renamed from: c */
    private float f18686c;

    /* renamed from: d */
    private int f18687d;

    /* renamed from: com.applovin.exoplayer2.ui.AspectRatioFrameLayout$a */
    public interface C7836a {
        /* renamed from: a */
        void mo55278a(float f, float f2, boolean z);
    }

    /* renamed from: com.applovin.exoplayer2.ui.AspectRatioFrameLayout$b */
    private final class C7837b implements Runnable {

        /* renamed from: b */
        private float f18689b;

        /* renamed from: c */
        private float f18690c;

        /* renamed from: d */
        private boolean f18691d;

        /* renamed from: e */
        private boolean f18692e;

        private C7837b() {
        }

        /* renamed from: a */
        public void mo55279a(float f, float f2, boolean z) {
            this.f18689b = f;
            this.f18690c = f2;
            this.f18691d = z;
            if (!this.f18692e) {
                this.f18692e = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f18692e = false;
            if (AspectRatioFrameLayout.this.f18685b != null) {
                AspectRatioFrameLayout.this.f18685b.mo55278a(this.f18689b, this.f18690c, this.f18691d);
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18687d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C8656R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f18687d = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f18684a = new C7837b();
    }

    public int getResizeMode() {
        return this.f18687d;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 > 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4 > 0.0f) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f18686c
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f18686c
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            com.applovin.exoplayer2.ui.AspectRatioFrameLayout$b r9 = r8.f18684a
            float r10 = r8.f18686c
            r0 = 0
            r9.mo55279a(r10, r3, r0)
            return
        L_0x0031:
            int r5 = r8.f18687d
            r6 = 1
            if (r5 == 0) goto L_0x004e
            if (r5 == r6) goto L_0x0049
            r7 = 2
            if (r5 == r7) goto L_0x0043
            r7 = 4
            if (r5 == r7) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0049
        L_0x0043:
            float r9 = r8.f18686c
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L_0x0053
        L_0x0049:
            float r10 = r8.f18686c
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x0053
        L_0x004e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0043
            goto L_0x0049
        L_0x0053:
            com.applovin.exoplayer2.ui.AspectRatioFrameLayout$b r10 = r8.f18684a
            float r1 = r8.f18686c
            r10.mo55279a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f18686c != f) {
            this.f18686c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C7836a aVar) {
        this.f18685b = aVar;
    }

    public void setResizeMode(int i) {
        if (this.f18687d != i) {
            this.f18687d = i;
            requestLayout();
        }
    }
}
