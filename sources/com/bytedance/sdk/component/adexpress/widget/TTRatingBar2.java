package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: a */
    LinearLayout f26003a = new LinearLayout(getContext());

    /* renamed from: b */
    LinearLayout f26004b = new LinearLayout(getContext());

    /* renamed from: c */
    private float f26005c;

    /* renamed from: d */
    private float f26006d;

    /* renamed from: e */
    private Drawable f26007e;

    /* renamed from: f */
    private Drawable f26008f;

    /* renamed from: g */
    private double f26009g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26003a.setOrientation(0);
        this.f26003a.setGravity(8388611);
        this.f26004b.setOrientation(0);
        this.f26004b.setGravity(8388611);
        this.f26007e = C10647t.m31281c(context, "tt_star_thick");
        this.f26008f = C10647t.m31281c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f26007e;
    }

    public Drawable getStarFillDrawable() {
        return this.f26008f;
    }

    /* renamed from: a */
    public void mo63831a(double d, int i, int i2) {
        float f = (float) i2;
        this.f26005c = C10305b.m29752c(getContext(), f);
        this.f26006d = C10305b.m29752c(getContext(), f);
        this.f26009g = d;
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f26004b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f26003a.addView(starImageView2);
        }
        addView(this.f26003a);
        addView(this.f26004b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f26005c, (int) this.f26006d));
        imageView.setPadding(1, 4, 1, 0);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26003a.measure(i, i2);
        double d = this.f26009g;
        float f = this.f26005c;
        this.f26004b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d)) * f) + 1.0f)) + (((double) (f - 2.0f)) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26003a.getMeasuredHeight(), 1073741824));
    }
}
