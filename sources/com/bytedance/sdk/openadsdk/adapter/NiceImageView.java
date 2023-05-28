package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class NiceImageView extends ImageView {

    /* renamed from: a */
    private Context f382a;

    /* renamed from: b */
    private boolean f383b;

    /* renamed from: c */
    private boolean f384c;

    /* renamed from: d */
    private int f385d;

    /* renamed from: e */
    private int f386e;

    /* renamed from: f */
    private int f387f;

    /* renamed from: g */
    private int f388g;

    /* renamed from: h */
    private int f389h;

    /* renamed from: i */
    private int f390i;

    /* renamed from: j */
    private int f391j;

    /* renamed from: k */
    private int f392k;

    /* renamed from: l */
    private int f393l;

    /* renamed from: m */
    private int f394m;

    /* renamed from: n */
    private Xfermode f395n;

    /* renamed from: o */
    private int f396o;

    /* renamed from: p */
    private int f397p;

    /* renamed from: q */
    private float f398q;

    /* renamed from: r */
    private float[] f399r;

    /* renamed from: s */
    private float[] f400s;

    /* renamed from: t */
    private RectF f401t;

    /* renamed from: u */
    private RectF f402u;

    /* renamed from: v */
    private Paint f403v;

    /* renamed from: w */
    private Path f404w;

    /* renamed from: x */
    private Path f405x;

    public NiceImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f386e = -1;
        this.f388g = -1;
        this.f382a = context;
        this.f389h = C1002v.m4749e(context, 10.0f);
        this.f399r = new float[8];
        this.f400s = new float[8];
        this.f402u = new RectF();
        this.f401t = new RectF();
        this.f403v = new Paint();
        this.f404w = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f395n = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f395n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f405x = new Path();
        }
        m422c();
        m423d();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f396o = i;
        this.f397p = i2;
        m415a();
        m421b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f401t, (Paint) null, 31);
        if (!this.f384c) {
            int i = this.f396o;
            int i2 = this.f385d;
            int i3 = this.f387f;
            int i4 = this.f397p;
            canvas.scale((((float) ((i - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i), (((float) ((i4 - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i4), ((float) i) / 2.0f, ((float) i4) / 2.0f);
        }
        super.onDraw(canvas);
        this.f403v.reset();
        this.f404w.reset();
        if (this.f383b) {
            this.f404w.addCircle(((float) this.f396o) / 2.0f, ((float) this.f397p) / 2.0f, this.f398q, Path.Direction.CCW);
        } else {
            this.f404w.addRoundRect(this.f401t, this.f400s, Path.Direction.CCW);
        }
        this.f403v.setAntiAlias(true);
        this.f403v.setStyle(Paint.Style.FILL);
        this.f403v.setXfermode(this.f395n);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f404w, this.f403v);
        } else {
            this.f405x.addRect(this.f401t, Path.Direction.CCW);
            this.f405x.op(this.f404w, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f405x, this.f403v);
        }
        this.f403v.setXfermode((Xfermode) null);
        int i5 = this.f394m;
        if (i5 != 0) {
            this.f403v.setColor(i5);
            canvas.drawPath(this.f404w, this.f403v);
        }
        canvas.restore();
        m417a(canvas);
    }

    /* renamed from: a */
    private void m417a(Canvas canvas) {
        if (this.f383b) {
            int i = this.f385d;
            if (i > 0) {
                m418a(canvas, i, this.f386e, this.f398q - (((float) i) / 2.0f));
            }
            int i2 = this.f387f;
            if (i2 > 0) {
                m418a(canvas, i2, this.f388g, (this.f398q - ((float) this.f385d)) - (((float) i2) / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.f385d;
        if (i3 > 0) {
            m419a(canvas, i3, this.f386e, this.f402u, this.f399r);
        }
    }

    /* renamed from: a */
    private void m418a(Canvas canvas, int i, int i2, float f) {
        m416a(i, i2);
        this.f404w.addCircle(((float) this.f396o) / 2.0f, ((float) this.f397p) / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.f404w, this.f403v);
    }

    /* renamed from: a */
    private void m419a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        m416a(i, i2);
        this.f404w.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f404w, this.f403v);
    }

    /* renamed from: a */
    private void m416a(int i, int i2) {
        this.f404w.reset();
        this.f403v.setStrokeWidth((float) i);
        this.f403v.setColor(i2);
        this.f403v.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private void m415a() {
        if (!this.f383b) {
            RectF rectF = this.f402u;
            int i = this.f385d;
            rectF.set(((float) i) / 2.0f, ((float) i) / 2.0f, ((float) this.f396o) - (((float) i) / 2.0f), ((float) this.f397p) - (((float) i) / 2.0f));
        }
    }

    /* renamed from: b */
    private void m421b() {
        if (this.f383b) {
            float min = ((float) Math.min(this.f396o, this.f397p)) / 2.0f;
            this.f398q = min;
            RectF rectF = this.f401t;
            int i = this.f396o;
            int i2 = this.f397p;
            rectF.set((((float) i) / 2.0f) - min, (((float) i2) / 2.0f) - min, (((float) i) / 2.0f) + min, (((float) i2) / 2.0f) + min);
            return;
        }
        this.f401t.set(0.0f, 0.0f, (float) this.f396o, (float) this.f397p);
        if (this.f384c) {
            this.f401t = this.f402u;
        }
    }

    /* renamed from: c */
    private void m422c() {
        if (!this.f383b) {
            int i = 0;
            if (this.f389h > 0) {
                while (true) {
                    float[] fArr = this.f399r;
                    if (i < fArr.length) {
                        int i2 = this.f389h;
                        fArr[i] = (float) i2;
                        this.f400s[i] = ((float) i2) - (((float) this.f385d) / 2.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                float[] fArr2 = this.f399r;
                int i3 = this.f390i;
                float f = (float) i3;
                fArr2[1] = f;
                fArr2[0] = f;
                int i4 = this.f391j;
                float f2 = (float) i4;
                fArr2[3] = f2;
                fArr2[2] = f2;
                int i5 = this.f393l;
                float f3 = (float) i5;
                fArr2[5] = f3;
                fArr2[4] = f3;
                int i6 = this.f392k;
                float f4 = (float) i6;
                fArr2[7] = f4;
                fArr2[6] = f4;
                float[] fArr3 = this.f400s;
                int i7 = this.f385d;
                float f5 = ((float) i3) - (((float) i7) / 2.0f);
                fArr3[1] = f5;
                fArr3[0] = f5;
                float f6 = ((float) i4) - (((float) i7) / 2.0f);
                fArr3[3] = f6;
                fArr3[2] = f6;
                float f7 = ((float) i5) - (((float) i7) / 2.0f);
                fArr3[5] = f7;
                fArr3[4] = f7;
                float f8 = ((float) i6) - (((float) i7) / 2.0f);
                fArr3[7] = f8;
                fArr3[6] = f8;
            }
        }
    }

    /* renamed from: a */
    private void m420a(boolean z) {
        if (z) {
            this.f389h = 0;
        }
        m422c();
        m415a();
        invalidate();
    }

    /* renamed from: d */
    private void m423d() {
        if (!this.f383b) {
            this.f387f = 0;
        }
    }

    public void isCoverSrc(boolean z) {
        this.f384c = z;
        m421b();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.f383b = z;
        m423d();
        m421b();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f385d = C1002v.m4749e(this.f382a, (float) i);
        m420a(false);
    }

    public void setBorderColor(int i) {
        this.f386e = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.f387f = C1002v.m4749e(this.f382a, (float) i);
        m423d();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.f388g = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f389h = C1002v.m4749e(this.f382a, (float) i);
        m420a(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.f390i = C1002v.m4749e(this.f382a, (float) i);
        m420a(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.f391j = C1002v.m4749e(this.f382a, (float) i);
        m420a(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.f392k = C1002v.m4749e(this.f382a, (float) i);
        m420a(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.f393l = C1002v.m4749e(this.f382a, (float) i);
        m420a(true);
    }

    public void setMaskColor(int i) {
        this.f394m = i;
        invalidate();
    }
}
