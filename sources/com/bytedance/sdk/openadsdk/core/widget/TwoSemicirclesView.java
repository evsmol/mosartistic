package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.KotlinVersion;

public class TwoSemicirclesView extends View {

    /* renamed from: a */
    private final RectF f2780a;

    /* renamed from: b */
    private int f2781b;

    /* renamed from: c */
    private int f2782c;

    /* renamed from: d */
    private Paint f2783d;

    /* renamed from: e */
    private Paint f2784e;

    /* renamed from: f */
    private float f2785f = -90.0f;

    /* renamed from: g */
    private float f2786g = 220.0f;

    /* renamed from: h */
    private int f2787h = Color.parseColor("#FFFFFF");

    /* renamed from: i */
    private int f2788i = Color.parseColor("#C4C4C4");

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3722a();
        float f = this.f2786g;
        this.f2780a = new RectF(-f, -f, f, f);
    }

    /* renamed from: a */
    private void m3722a() {
        Paint paint = new Paint();
        this.f2783d = paint;
        paint.setColor(this.f2787h);
        this.f2783d.setStyle(Paint.Style.STROKE);
        this.f2783d.setStrokeWidth(4.0f);
        this.f2783d.setAlpha(20);
        Paint paint2 = new Paint(this.f2783d);
        this.f2784e = paint2;
        paint2.setColor(this.f2788i);
        this.f2784e.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2781b = i;
        this.f2782c = i2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f2780a;
        float f = this.f2786g;
        rectF.set(-f, -f, f, f);
        canvas.translate((float) (this.f2781b / 2), (float) (this.f2782c / 2));
        canvas.drawArc(this.f2780a, this.f2785f, 180.0f, false, this.f2783d);
        canvas.drawArc(this.f2780a, this.f2785f + 180.0f, 180.0f, false, this.f2784e);
    }

    public void setCurrentStartAngle(float f) {
        this.f2785f = f;
        postInvalidate();
    }

    public void setRadius(float f) {
        this.f2786g = f;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.f2783d = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.f2783d;
    }

    public void setPaintTwo(Paint paint) {
        this.f2784e = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.f2784e;
    }
}
