package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class TTCornersWebView extends WebView {

    /* renamed from: a */
    private int f2735a;

    /* renamed from: b */
    private int f2736b;

    /* renamed from: c */
    private int f2737c;

    /* renamed from: d */
    private int f2738d;

    /* renamed from: e */
    private Paint f2739e;

    /* renamed from: f */
    private Paint f2740f;

    /* renamed from: g */
    private float[] f2741g = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public TTCornersWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3709a(context, attributeSet);
    }

    public TTCornersWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3709a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3709a(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f2739e = paint;
        paint.setColor(-1);
        this.f2739e.setAntiAlias(true);
        this.f2739e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f2740f = paint2;
        paint2.setXfermode((Xfermode) null);
        this.f2740f.setAntiAlias(true);
        float b = C1002v.m4731b(context, 14.0f);
        mo2431a(b, b, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo2431a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f2741g;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2735a = getMeasuredWidth();
        this.f2736b = getMeasuredHeight();
    }

    public void onDraw(Canvas canvas) {
        this.f2737c = getScrollX();
        this.f2738d = getScrollY();
        Path path = new Path();
        int i = this.f2738d;
        path.addRoundRect(new RectF(0.0f, (float) i, (float) (this.f2737c + this.f2735a), (float) (i + this.f2736b)), this.f2741g, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
