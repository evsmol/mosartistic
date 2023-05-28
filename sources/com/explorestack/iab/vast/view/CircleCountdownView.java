package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabElement;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;

public class CircleCountdownView extends View implements IabElement {

    /* renamed from: a */
    public Bitmap f4635a;

    /* renamed from: b */
    public int f4636b;

    /* renamed from: c */
    public int f4637c = Assets.mainAssetsColor;

    /* renamed from: d */
    public int f4638d = Assets.backgroundColor;

    /* renamed from: e */
    public boolean f4639e = false;

    /* renamed from: f */
    public float f4640f = 0.0f;

    /* renamed from: g */
    public float f4641g = 0.071428575f;

    /* renamed from: h */
    public final RectF f4642h = new RectF();

    /* renamed from: i */
    public final RectF f4643i = new RectF();

    /* renamed from: j */
    public float f4644j = 54.0f;

    /* renamed from: k */
    public float f4645k = 54.0f;

    /* renamed from: l */
    public float f4646l = 5.0f;

    /* renamed from: m */
    public Paint f4647m;

    /* renamed from: n */
    public Paint f4648n;

    /* renamed from: o */
    public Rect f4649o;

    /* renamed from: p */
    public RectF f4650p;

    /* renamed from: q */
    public Paint f4651q;

    /* renamed from: r */
    public Paint f4652r;

    /* renamed from: s */
    public float f4653s = 100.0f;

    /* renamed from: t */
    public int f4654t;

    public CircleCountdownView(Context context) {
        super(context);
        mo4543a(context);
    }

    /* renamed from: a */
    public final float mo4541a(float f, boolean z) {
        float width = this.f4642h.width();
        if (z) {
            width -= this.f4646l * 2.0f;
        }
        float sqrt = (float) (((double) (width / 2.0f)) * Math.sqrt(2.0d));
        return sqrt - ((f * sqrt) * 2.0f);
    }

    /* renamed from: a */
    public final void mo4542a() {
        float min = (float) Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f = min / 2.0f;
        float width = (((float) getWidth()) / 2.0f) - f;
        float height = (((float) getHeight()) / 2.0f) - f;
        this.f4642h.set(width, height, width + min, min + height);
        this.f4644j = this.f4642h.centerX();
        this.f4645k = this.f4642h.centerY();
        RectF rectF = this.f4643i;
        RectF rectF2 = this.f4642h;
        float f2 = rectF2.left;
        float f3 = this.f4646l / 2.0f;
        rectF.set(f2 + f3, rectF2.top + f3, rectF2.right - f3, rectF2.bottom - f3);
    }

    /* renamed from: a */
    public final void mo4543a(Context context) {
        setLayerType(1, (Paint) null);
        this.f4646l = (float) Utils.dpToPx(context, 3.0f);
    }

    /* renamed from: a */
    public final void mo4544a(Canvas canvas) {
        if (this.f4651q == null) {
            Paint paint = new Paint(7);
            this.f4651q = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f4651q.setAntiAlias(true);
        }
        if (this.f4649o == null) {
            this.f4649o = new Rect();
        }
        if (this.f4650p == null) {
            this.f4650p = new RectF();
        }
        float a = mo4541a(this.f4640f, this.f4639e);
        float f = a / 2.0f;
        float f2 = this.f4644j - f;
        float f3 = this.f4645k - f;
        this.f4649o.set(0, 0, this.f4635a.getWidth(), this.f4635a.getHeight());
        this.f4650p.set(f2, f3, f2 + a, a + f3);
        this.f4651q.setColorFilter(new PorterDuffColorFilter(this.f4637c, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f4635a, this.f4649o, this.f4650p, this.f4651q);
        if (this.f4639e) {
            if (this.f4652r == null) {
                Paint paint2 = new Paint(1);
                this.f4652r = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f4652r.setStrokeWidth(this.f4646l);
            this.f4652r.setColor(this.f4637c);
            canvas.drawArc(this.f4643i, 0.0f, 360.0f, false, this.f4652r);
        }
    }

    /* renamed from: b */
    public final void mo4545b(Canvas canvas) {
        if (this.f4647m == null) {
            this.f4647m = new Paint(1);
        }
        float f = 360.0f - ((this.f4653s * 360.0f) * 0.01f);
        this.f4647m.setColor(this.f4638d);
        this.f4647m.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f4642h, 0.0f, 360.0f, false, this.f4647m);
        this.f4647m.setColor(this.f4637c);
        this.f4647m.setStyle(Paint.Style.STROKE);
        this.f4647m.setStrokeWidth(this.f4646l);
        canvas.drawArc(this.f4643i, 270.0f, f, false, this.f4647m);
    }

    /* renamed from: c */
    public final void mo4546c(Canvas canvas) {
        if (this.f4648n == null) {
            Paint paint = new Paint(1);
            this.f4648n = paint;
            paint.setAntiAlias(true);
            this.f4648n.setStyle(Paint.Style.FILL);
            this.f4648n.setTextAlign(Paint.Align.CENTER);
        }
        String valueOf = String.valueOf(this.f4654t);
        this.f4648n.setColor(this.f4637c);
        this.f4648n.setTypeface(Typeface.create(Typeface.DEFAULT, this.f4636b));
        this.f4648n.setTextSize(mo4541a(this.f4641g, true));
        canvas.drawText(valueOf, this.f4644j, this.f4645k - ((this.f4648n.descent() + this.f4648n.ascent()) / 2.0f), this.f4648n);
    }

    public void changePercentage(float f, int i) {
        if (this.f4635a == null || f == 100.0f) {
            this.f4653s = f;
            this.f4654t = i;
            postInvalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.f4654t != 0 || this.f4635a != null) {
                mo4545b(canvas);
                if (this.f4635a != null) {
                    mo4544a(canvas);
                } else {
                    mo4546c(canvas);
                }
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo4542a();
    }

    public void setColors(int i, int i2) {
        this.f4637c = i;
        this.f4638d = i2;
        mo4542a();
    }

    public void setImage(Bitmap bitmap) {
        this.f4635a = bitmap;
        if (bitmap != null) {
            this.f4653s = 100.0f;
        }
        postInvalidate();
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        this.f4636b = iabElementStyle.getFontStyle().intValue();
        this.f4637c = iabElementStyle.getStrokeColor().intValue();
        this.f4638d = iabElementStyle.getFillColor().intValue();
        this.f4639e = iabElementStyle.isOutlined().booleanValue();
        this.f4646l = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
        setAlpha(iabElementStyle.getOpacity().floatValue());
        mo4542a();
        postInvalidate();
    }
}
