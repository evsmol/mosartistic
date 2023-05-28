package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabElement;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;

public class LinearCountdownView extends View implements IabElement {

    /* renamed from: a */
    public final Paint f4659a = new Paint(1);

    /* renamed from: b */
    public float f4660b = 0.0f;

    /* renamed from: c */
    public float f4661c = 15.0f;

    /* renamed from: d */
    public int f4662d = Assets.mainAssetsColor;

    /* renamed from: e */
    public int f4663e = 0;

    public LinearCountdownView(Context context) {
        super(context);
        mo4557a();
    }

    /* renamed from: a */
    public final void mo4557a() {
        this.f4661c = (float) Utils.dpToPx(getContext(), 4.0f);
    }

    public void changePercentage(float f) {
        this.f4660b = f;
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (((float) getMeasuredHeight()) / 2.0f) + ((float) getPaddingTop());
        this.f4659a.setStrokeWidth(this.f4661c);
        this.f4659a.setColor(this.f4663e);
        float f = measuredHeight;
        float f2 = measuredHeight;
        canvas.drawLine((float) getPaddingLeft(), f, (float) (getPaddingLeft() + width), f2, this.f4659a);
        this.f4659a.setColor(this.f4662d);
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) getPaddingLeft(), f, ((float) getPaddingLeft()) + ((((float) width) * this.f4660b) / 100.0f), f2, this.f4659a);
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        this.f4662d = iabElementStyle.getStrokeColor().intValue();
        this.f4663e = iabElementStyle.getFillColor().intValue();
        this.f4661c = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setAlpha(iabElementStyle.getOpacity().floatValue());
        postInvalidate();
    }
}
