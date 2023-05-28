package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ProgressBar;

public final class CircularProgressBar extends ProgressBar implements IabElement {

    /* renamed from: a */
    public C1386b f4240a;

    /* renamed from: b */
    public final Paint f4241b;

    public CircularProgressBar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f4241b = paint;
        paint.setColor(0);
        mo3972a(context);
    }

    /* renamed from: a */
    public void mo3972a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int dpToPx = Utils.dpToPx(context, 8.0f);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        C1386b bVar = new C1386b(context);
        this.f4240a = bVar;
        bVar.mo4063c(f * 4.0f);
        this.f4240a.mo4059a(-65536);
        this.f4240a.mo4058a(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f4240a);
        setIndeterminate(true);
    }

    public synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) Math.min(getWidth(), getHeight())) / 2.0f, this.f4241b);
        super.onDraw(canvas);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4240a.mo4055a((((float) Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom())) / 2.0f) - this.f4240a.mo4053a());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f4240a.mo4059a(iArr);
    }

    public void setProgressBackgroundColor(int i) {
        this.f4241b.setColor(i);
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        this.f4240a.mo4063c(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        this.f4240a.mo4059a(iabElementStyle.getStrokeColor().intValue());
        this.f4241b.setColor(iabElementStyle.getFillColor().intValue());
        postInvalidate();
    }
}
