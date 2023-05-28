package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabElement;
import com.explorestack.iab.utils.IabElementStyle;

public class IabTextView extends TextView implements IabElement {

    /* renamed from: a */
    public final RectF f4655a = new RectF();

    /* renamed from: b */
    public GradientDrawable f4656b;

    /* renamed from: c */
    public Paint f4657c;

    /* renamed from: d */
    public boolean f4658d = false;

    public IabTextView(Context context) {
        super(context);
        mo4552a(context);
    }

    /* renamed from: a */
    public void mo4552a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f4656b = gradientDrawable;
        gradientDrawable.setColor(Assets.backgroundColor);
        this.f4656b.setShape(0);
        setBackgroundDrawable(this.f4656b);
        setGravity(17);
        setMaxLines(1);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4658d && this.f4657c != null) {
            float height = ((float) getHeight()) / 2.0f;
            canvas.drawRoundRect(this.f4655a, height, height, this.f4657c);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            float size = (float) ((View.MeasureSpec.getSize(i2) - getCompoundPaddingTop()) - getCompoundPaddingRight());
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float measureText = getPaint().measureText(getText(), 0, getText().length());
            float f = (float) size2;
            if (f < measureText) {
                float textSize = (float) ((int) (getTextSize() * (f / measureText)));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        super.onSizeChanged(i, i2, i3, i4);
        GradientDrawable gradientDrawable = this.f4656b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(((float) i2) / 2.0f);
        }
        if (this.f4658d && (paint = this.f4657c) != null) {
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float f = 0.0f + strokeWidth;
            this.f4655a.set(f, f, ((float) i) - strokeWidth, ((float) i2) - strokeWidth);
        }
    }

    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = this.f4656b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        boolean booleanValue = iabElementStyle.isOutlined().booleanValue();
        this.f4658d = booleanValue;
        if (booleanValue) {
            Paint paint = new Paint(1);
            this.f4657c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f4657c.setColor(iabElementStyle.getStrokeColor().intValue());
            this.f4657c.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        }
        setTextColor(iabElementStyle.getStrokeColor().intValue());
        setBackgroundColor(iabElementStyle.getFillColor().intValue());
        setTextSize(0, iabElementStyle.getFontSize(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, iabElementStyle.getFontStyle().intValue()));
        setAlpha(iabElementStyle.getOpacity().floatValue());
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
    }
}
