package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

public class AnimationButton extends TextView implements C10341b {

    /* renamed from: a */
    C10340a f25547a = new C10340a();

    /* renamed from: b */
    private float f25548b;

    /* renamed from: c */
    private float f25549c;

    /* renamed from: d */
    private float f25550d;

    public float getShineValue() {
        return this.f25549c;
    }

    public void setShineValue(float f) {
        this.f25549c = f;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f25548b;
    }

    public void setRippleValue(float f) {
        this.f25548b = f;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f25550d;
    }

    public void setMarqueeValue(float f) {
        this.f25550d = f;
        postInvalidate();
    }

    public AnimationButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25547a.mo63311a(canvas, (C10341b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f25547a.mo63312a((View) this, i, i2);
    }
}
