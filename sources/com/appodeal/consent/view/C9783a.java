package com.appodeal.consent.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.appodeal.consent.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.consent.view.a */
public final class C9783a extends View {

    /* renamed from: a */
    public float f24812a = 54.0f;

    /* renamed from: b */
    public int f24813b;

    /* renamed from: c */
    public int f24814c;

    /* renamed from: d */
    public int f24815d;

    /* renamed from: e */
    public int f24816e;

    /* renamed from: f */
    public Bitmap f24817f;

    /* renamed from: g */
    public Bitmap f24818g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9783a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(1, (Paint) null);
        this.f24813b = context.getResources().getColor(R.color.stack_consent_form_close_btn_main_color);
        this.f24814c = context.getResources().getColor(R.color.stack_consent_form_close_btn_background_color);
    }

    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f24817f != null) {
            float f = (float) this.f24816e;
            float f2 = (this.f24812a * 2.0f) - f;
            RectF rectF = new RectF(f, f, f2, f2);
            Paint paint = new Paint(7);
            paint.setColor(this.f24814c);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF2 = rectF;
            Paint paint2 = paint;
            canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint2);
            paint.setColor(this.f24813b);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5.0f);
            canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint2);
            Paint paint3 = new Paint(7);
            paint3.setStyle(Paint.Style.FILL);
            paint3.setAntiAlias(true);
            Bitmap bitmap = this.f24817f;
            Intrinsics.checkNotNull(bitmap);
            float f3 = (float) ((int) (this.f24812a - ((float) (this.f24815d / 2))));
            canvas.drawBitmap(bitmap, f3, f3, paint3);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f24812a = ((float) i) / 2.0f;
        int max = Math.max(i, i2) / 4;
        this.f24816e = max;
        int sqrt = (int) (Math.sqrt(2.0d) * ((double) (this.f24812a - ((float) max))));
        this.f24815d = sqrt;
        Bitmap bitmap = this.f24818g;
        if (bitmap != null && sqrt > 0) {
            Intrinsics.checkNotNull(bitmap);
            int i5 = this.f24815d;
            this.f24817f = Bitmap.createScaledBitmap(bitmap, i5, i5, true);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(this.f24813b, 0));
            Bitmap bitmap2 = this.f24817f;
            Intrinsics.checkNotNull(bitmap2);
            Canvas canvas = new Canvas(bitmap2);
            Bitmap bitmap3 = this.f24817f;
            Intrinsics.checkNotNull(bitmap3);
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
        }
    }

    public final void setImage(Bitmap bitmap) {
        int i;
        if (bitmap == null || (i = this.f24815d) <= 0) {
            this.f24818g = bitmap;
            this.f24817f = bitmap;
        } else {
            this.f24818g = bitmap;
            this.f24817f = Bitmap.createScaledBitmap(bitmap, i, i, true);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(this.f24813b, 0));
            Bitmap bitmap2 = this.f24817f;
            Intrinsics.checkNotNull(bitmap2);
            Canvas canvas = new Canvas(bitmap2);
            Bitmap bitmap3 = this.f24817f;
            Intrinsics.checkNotNull(bitmap3);
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
        }
        postInvalidate();
    }
}
