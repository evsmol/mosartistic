package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.c */
/* compiled from: TTCustomShadowBackground */
public class C0737c extends Drawable {

    /* renamed from: a */
    private int f2836a;

    /* renamed from: b */
    private int f2837b;

    /* renamed from: c */
    private int[] f2838c;

    /* renamed from: d */
    private float[] f2839d;

    /* renamed from: e */
    private LinearGradient f2840e;

    /* renamed from: f */
    private int f2841f;

    /* renamed from: g */
    private int f2842g;

    /* renamed from: h */
    private int f2843h;

    /* renamed from: i */
    private int f2844i;

    /* renamed from: j */
    private RectF f2845j;

    /* renamed from: k */
    private Paint f2846k;

    public int getOpacity() {
        return -3;
    }

    public C0737c(int i, int[] iArr, float[] fArr, int i2, LinearGradient linearGradient, int i3, int i4, int i5, int i6) {
        this.f2836a = i;
        this.f2838c = iArr;
        this.f2839d = fArr;
        this.f2837b = i2;
        this.f2840e = linearGradient;
        this.f2841f = i3;
        this.f2842g = i4;
        this.f2843h = i5;
        this.f2844i = i6;
    }

    public void draw(Canvas canvas) {
        if (this.f2845j == null) {
            Rect bounds = getBounds();
            this.f2845j = new RectF((float) ((bounds.left + this.f2842g) - this.f2843h), (float) ((bounds.top + this.f2842g) - this.f2844i), (float) ((bounds.right - this.f2842g) - this.f2843h), (float) ((bounds.bottom - this.f2842g) - this.f2844i));
        }
        if (this.f2846k == null) {
            m3753a();
        }
        RectF rectF = this.f2845j;
        int i = this.f2841f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f2846k);
    }

    public void setAlpha(int i) {
        Paint paint = this.f2846k;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f2846k;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    /* renamed from: a */
    private void m3753a() {
        int[] iArr;
        Paint paint = new Paint();
        this.f2846k = paint;
        boolean z = true;
        paint.setAntiAlias(true);
        this.f2846k.setShadowLayer((float) this.f2842g, (float) this.f2843h, (float) this.f2844i, this.f2837b);
        if (this.f2845j == null || (iArr = this.f2838c) == null || iArr.length <= 1) {
            this.f2846k.setColor(this.f2836a);
            return;
        }
        float[] fArr = this.f2839d;
        if (fArr == null || fArr.length <= 0 || fArr.length != iArr.length) {
            z = false;
        }
        Paint paint2 = this.f2846k;
        LinearGradient linearGradient = this.f2840e;
        if (linearGradient == null) {
            linearGradient = new LinearGradient(this.f2845j.left, 0.0f, this.f2845j.right, 0.0f, this.f2838c, z ? this.f2839d : null, Shader.TileMode.CLAMP);
        }
        paint2.setShader(linearGradient);
    }

    /* renamed from: a */
    public static void m3754a(View view, C0738a aVar) {
        if (view != null && aVar != null) {
            view.setLayerType(1, (Paint) null);
            ViewCompat.setBackground(view, aVar.mo2492a());
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.c$a */
    /* compiled from: TTCustomShadowBackground */
    public static class C0738a {

        /* renamed from: a */
        private int f2847a;

        /* renamed from: b */
        private int f2848b;

        /* renamed from: c */
        private int[] f2849c;

        /* renamed from: d */
        private float[] f2850d;

        /* renamed from: e */
        private LinearGradient f2851e;

        /* renamed from: f */
        private int f2852f;

        /* renamed from: g */
        private int f2853g;

        /* renamed from: h */
        private int f2854h;

        /* renamed from: i */
        private int f2855i;

        public C0738a() {
            this.f2854h = 0;
            this.f2855i = 0;
            this.f2847a = C10647t.m31289k(C0558m.m2663a(), "tt_ssxinmian8");
            this.f2848b = C10647t.m31289k(C0558m.m2663a(), "tt_ssxinxian3");
            this.f2852f = 10;
            this.f2853g = 16;
            this.f2854h = 0;
            this.f2855i = 0;
        }

        /* renamed from: a */
        public C0738a mo2490a(int i) {
            this.f2847a = i;
            return this;
        }

        /* renamed from: b */
        public C0738a mo2493b(int i) {
            this.f2848b = i;
            return this;
        }

        /* renamed from: a */
        public C0738a mo2491a(int[] iArr) {
            this.f2849c = iArr;
            return this;
        }

        /* renamed from: c */
        public C0738a mo2494c(int i) {
            this.f2852f = i;
            return this;
        }

        /* renamed from: d */
        public C0738a mo2495d(int i) {
            this.f2854h = i;
            return this;
        }

        /* renamed from: e */
        public C0738a mo2496e(int i) {
            this.f2855i = i;
            return this;
        }

        /* renamed from: a */
        public C0737c mo2492a() {
            return new C0737c(this.f2847a, this.f2849c, this.f2850d, this.f2848b, this.f2851e, this.f2852f, this.f2853g, this.f2854h, this.f2855i);
        }
    }
}
