package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

public class CircleRippleView extends View {

    /* renamed from: a */
    private int f25894a;

    /* renamed from: b */
    private int f25895b;

    /* renamed from: c */
    private float f25896c;

    /* renamed from: d */
    private int f25897d;

    /* renamed from: e */
    private float f25898e;

    /* renamed from: f */
    private int f25899f;

    /* renamed from: g */
    private boolean f25900g;

    /* renamed from: h */
    private List<Integer> f25901h;

    /* renamed from: i */
    private List<Integer> f25902i;

    /* renamed from: j */
    private Paint f25903j;

    /* renamed from: k */
    private Paint f25904k;

    /* renamed from: l */
    private float f25905l;

    /* renamed from: m */
    private float f25906m;

    /* renamed from: n */
    private int f25907n;

    public CircleRippleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25894a = -1;
        this.f25895b = -65536;
        this.f25896c = 18.0f;
        this.f25897d = 3;
        this.f25898e = 50.0f;
        this.f25899f = 2;
        this.f25900g = false;
        this.f25901h = new ArrayList();
        this.f25902i = new ArrayList();
        this.f25907n = 24;
        m30366c();
    }

    /* renamed from: c */
    private void m30366c() {
        Paint paint = new Paint();
        this.f25903j = paint;
        paint.setAntiAlias(true);
        this.f25903j.setStrokeWidth((float) this.f25907n);
        this.f25901h.add(Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
        this.f25902i.add(0);
        Paint paint2 = new Paint();
        this.f25904k = paint2;
        paint2.setAntiAlias(true);
        this.f25904k.setColor(Color.parseColor("#0FFFFFFF"));
        this.f25904k.setStyle(Paint.Style.FILL);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) i) / 2.0f;
        this.f25905l = f;
        this.f25906m = ((float) i2) / 2.0f;
        float f2 = f - (((float) this.f25907n) / 2.0f);
        this.f25898e = f2;
        this.f25896c = f2 / 4.0f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    public void onDraw(Canvas canvas) {
        this.f25903j.setShader(new LinearGradient(this.f25905l, 0.0f, this.f25906m, (float) getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= this.f25901h.size()) {
                break;
            }
            Integer num = this.f25901h.get(i);
            this.f25903j.setAlpha(num.intValue());
            Integer num2 = this.f25902i.get(i);
            if (this.f25896c + ((float) num2.intValue()) < this.f25898e) {
                canvas.drawCircle(this.f25905l, this.f25906m, this.f25896c + ((float) num2.intValue()), this.f25903j);
            }
            if (num.intValue() > 0 && ((float) num2.intValue()) < this.f25898e) {
                List<Integer> list = this.f25901h;
                if (num.intValue() - this.f25899f > 0) {
                    i2 = num.intValue() - (this.f25899f * 3);
                }
                list.set(i, Integer.valueOf(i2));
                this.f25902i.set(i, Integer.valueOf(num2.intValue() + this.f25899f));
            }
            i++;
        }
        List<Integer> list2 = this.f25902i;
        if (((float) list2.get(list2.size() - 1).intValue()) >= this.f25898e / ((float) this.f25897d)) {
            this.f25901h.add(Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
            this.f25902i.add(0);
        }
        if (this.f25902i.size() >= 3) {
            this.f25902i.remove(0);
            this.f25901h.remove(0);
        }
        this.f25903j.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        this.f25903j.setColor(this.f25895b);
        canvas.drawCircle(this.f25905l, this.f25906m, this.f25896c, this.f25904k);
        if (this.f25900g) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo63729a() {
        this.f25900g = true;
        invalidate();
    }

    /* renamed from: b */
    public void mo63730b() {
        this.f25900g = false;
        this.f25902i.clear();
        this.f25901h.clear();
        this.f25901h.add(Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
        this.f25902i.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.f25894a = i;
    }

    public void setCoreColor(int i) {
        this.f25895b = i;
    }

    public void setCoreRadius(int i) {
        this.f25896c = (float) i;
    }

    public void setDiffuseWidth(int i) {
        this.f25897d = i;
    }

    public void setMaxWidth(int i) {
        this.f25898e = (float) i;
    }

    public void setDiffuseSpeed(int i) {
        this.f25899f = i;
    }
}
