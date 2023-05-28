package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: h */
    private static final int f2765h = ((int) C1002v.m4739c(C0558m.m2663a(), 1.0f));

    /* renamed from: i */
    private static final int f2766i = ((int) C1002v.m4739c(C0558m.m2663a(), 0.0f));

    /* renamed from: j */
    private static final int f2767j = ((int) C1002v.m4739c(C0558m.m2663a(), 1.0f));

    /* renamed from: k */
    private static final int f2768k = ((int) C1002v.m4739c(C0558m.m2663a(), 3.0f));

    /* renamed from: a */
    LinearLayout f2769a = new LinearLayout(getContext());

    /* renamed from: b */
    LinearLayout f2770b = new LinearLayout(getContext());

    /* renamed from: c */
    private float f2771c;

    /* renamed from: d */
    private float f2772d;

    /* renamed from: e */
    private Drawable f2773e;

    /* renamed from: f */
    private Drawable f2774f;

    /* renamed from: g */
    private double f2775g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2769a.setOrientation(0);
        this.f2769a.setGravity(8388611);
        this.f2770b.setOrientation(0);
        this.f2770b.setGravity(8388611);
        this.f2773e = C10647t.m31281c(context, "tt_star_thick");
        this.f2774f = C10647t.m31281c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f2773e;
    }

    public Drawable getStarFillDrawable() {
        return this.f2774f;
    }

    /* renamed from: a */
    public void mo2445a(double d, int i, int i2) {
        float f = (float) i2;
        this.f2771c = (float) ((int) C1002v.m4739c(C0558m.m2663a(), f));
        this.f2772d = (float) ((int) C1002v.m4739c(C0558m.m2663a(), f));
        this.f2775g = d;
        this.f2769a.removeAllViews();
        this.f2770b.removeAllViews();
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f2770b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f2769a.addView(starImageView2);
        }
        addView(this.f2769a);
        addView(this.f2770b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f2771c, (int) this.f2772d));
        imageView.setPadding(f2765h, f2766i, f2767j, f2768k);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2769a.measure(i, i2);
        double d = this.f2775g;
        float f = this.f2771c;
        int i3 = f2765h;
        this.f2770b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d)) * f) + ((float) i3))) + (((double) (f - ((float) (i3 + f2767j)))) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f2769a.getMeasuredHeight(), 1073741824));
    }
}
