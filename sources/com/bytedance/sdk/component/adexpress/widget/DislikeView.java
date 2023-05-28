package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DislikeView extends View {

    /* renamed from: a */
    private int f25908a;

    /* renamed from: b */
    private int f25909b;

    /* renamed from: c */
    private RectF f25910c;

    /* renamed from: d */
    private Paint f25911d;

    /* renamed from: e */
    private Paint f25912e;

    /* renamed from: f */
    private int f25913f;

    /* renamed from: g */
    private Paint f25914g;

    /* renamed from: h */
    private int f25915h;

    public DislikeView(Context context) {
        super(context);
        m30369a();
    }

    /* renamed from: a */
    private void m30369a() {
        Paint paint = new Paint();
        this.f25911d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f25914g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f25912e = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.f25913f = i;
    }

    public void setDislikeColor(int i) {
        this.f25914g.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.f25914g.setStrokeWidth((float) i);
    }

    public void setStrokeColor(int i) {
        this.f25911d.setStyle(Paint.Style.STROKE);
        this.f25911d.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f25911d.setStrokeWidth((float) i);
        this.f25915h = i;
    }

    public void setBgColor(int i) {
        this.f25912e.setStyle(Paint.Style.FILL);
        this.f25912e.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f25910c;
        int i = this.f25913f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f25912e);
        RectF rectF2 = this.f25910c;
        int i2 = this.f25913f;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f25911d);
        int i3 = this.f25908a;
        int i4 = this.f25909b;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) * 0.3f, ((float) i4) * 0.3f, ((float) i3) * 0.7f, ((float) i4) * 0.7f, this.f25914g);
        int i5 = this.f25908a;
        int i6 = this.f25909b;
        Canvas canvas3 = canvas;
        canvas3.drawLine(((float) i5) * 0.7f, ((float) i6) * 0.3f, ((float) i5) * 0.3f, ((float) i6) * 0.7f, this.f25914g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f25908a = i;
        this.f25909b = i2;
        int i5 = this.f25915h;
        this.f25910c = new RectF((float) i5, (float) i5, (float) (this.f25908a - i5), (float) (this.f25909b - i5));
    }
}
