package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TTRoundRectImageView extends ImageView {

    /* renamed from: a */
    private Paint f26010a;

    /* renamed from: b */
    private int f26011b;

    /* renamed from: c */
    private int f26012c;

    /* renamed from: d */
    private Matrix f26013d;

    public TTRoundRectImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26011b = 25;
        this.f26012c = 25;
        Paint paint = new Paint();
        this.f26010a = paint;
        paint.setAntiAlias(true);
        this.f26010a.setFilterBitmap(true);
        this.f26013d = new Matrix();
    }

    public void setXRound(int i) {
        this.f26011b = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.f26012c = i;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap a = m30428a(drawable);
            if (a != null) {
                BitmapShader bitmapShader = new BitmapShader(a, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                float f = 1.0f;
                if (!(a.getWidth() == getWidth() && a.getHeight() == getHeight())) {
                    f = Math.max((((float) getWidth()) * 1.0f) / ((float) a.getWidth()), (((float) getHeight()) * 1.0f) / ((float) a.getHeight()));
                }
                this.f26013d.setScale(f, f);
                bitmapShader.setLocalMatrix(this.f26013d);
                this.f26010a.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), (float) this.f26011b, (float) this.f26012c, this.f26010a);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Bitmap m30428a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }
}
