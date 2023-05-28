package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.a */
/* compiled from: AnimationWrapper */
public class C10340a {

    /* renamed from: a */
    Paint f25551a;

    /* renamed from: b */
    Path f25552b = new Path();

    /* renamed from: c */
    private int f25553c;

    /* renamed from: d */
    private int f25554d;

    public C10340a() {
        Paint paint = new Paint();
        this.f25551a = paint;
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public void mo63311a(Canvas canvas, C10341b bVar, View view) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        if (bVar.getRippleValue() != 0.0f) {
            if (C10262a.m29464a().mo63095c() != null) {
                float[] fArr = null;
                try {
                    fArr = C10350g.m30043b((String) view2.getTag(C10647t.m31283e(C10262a.m29464a().mo63095c().mo1819b(), "tt_id_ripple_bg")));
                } catch (Exception unused) {
                }
                if (fArr != null) {
                    this.f25551a.setColor(C10305b.m29748a(fArr[3] * (1.0f - bVar.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i3 = this.f25553c;
            int i4 = this.f25554d;
            canvas2.drawCircle((float) i3, (float) i4, ((float) (Math.min(i3, i4) * 2)) * bVar.getRippleValue(), this.f25551a);
        }
        if (bVar.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f25552b.reset();
            try {
                i2 = ((Integer) view2.getTag(C10647t.m31283e(view.getContext(), "tt_id_shine_width"))).intValue();
            } catch (Exception unused2) {
                i2 = 0;
            }
            if (i2 >= 0) {
                int a = (int) C10305b.m29747a(view.getContext(), (float) i2);
                Path path = this.f25552b;
                float shineValue = ((float) ((this.f25553c * 2) + a + (this.f25554d * 2))) * bVar.getShineValue();
                int i5 = this.f25554d;
                path.moveTo((shineValue - ((float) ((i5 * 2) + a))) + ((float) (i5 * 2)), 0.0f);
                Path path2 = this.f25552b;
                float shineValue2 = ((float) ((this.f25553c * 2) + a + (this.f25554d * 2))) * bVar.getShineValue();
                int i6 = this.f25554d;
                float f = (float) a;
                path2.lineTo((shineValue2 - ((float) ((i6 * 2) + a))) + f + ((float) (i6 * 2)), 0.0f);
                Path path3 = this.f25552b;
                float shineValue3 = ((float) ((this.f25553c * 2) + a + (this.f25554d * 2))) * bVar.getShineValue();
                int i7 = this.f25554d;
                path3.lineTo((shineValue3 - ((float) ((i7 * 2) + a))) + f, (float) (i7 * 2));
                Path path4 = this.f25552b;
                float shineValue4 = ((float) ((this.f25553c * 2) + a + (this.f25554d * 2))) * bVar.getShineValue();
                int i8 = this.f25554d;
                path4.lineTo(shineValue4 - ((float) ((i8 * 2) + a)), (float) (i8 * 2));
                this.f25552b.close();
                float shineValue5 = ((float) ((this.f25553c * 2) + a + (this.f25554d * 2))) * bVar.getShineValue();
                int i9 = this.f25554d;
                float f2 = ((float) i9) + (shineValue5 - ((float) ((i9 * 2) + a)));
                float shineValue6 = ((float) ((this.f25553c * 2) + a + (i9 * 2))) * bVar.getShineValue();
                int i10 = this.f25554d;
                this.f25551a.setShader(new LinearGradient(f2, 0.0f, ((float) (a / 2)) + (shineValue6 - ((float) ((i10 * 2) + a))) + ((float) i10), (float) i10, Color.parseColor("#10ffffff"), Color.parseColor("#50ffffff"), Shader.TileMode.MIRROR));
                canvas2.drawPath(this.f25552b, this.f25551a);
            }
        }
        if (bVar.getMarqueeValue() != 0.0f) {
            try {
                i = ((Integer) view2.getTag(C10647t.m31283e(view.getContext(), "tt_id_width"))).intValue();
            } catch (Exception unused3) {
                i = 0;
            }
            if (i >= 0) {
                this.f25552b.reset();
                this.f25552b.moveTo(0.0f, 0.0f);
                this.f25552b.lineTo((float) (this.f25553c * 2), 0.0f);
                this.f25552b.lineTo((float) (this.f25553c * 2), (float) (this.f25554d * 2));
                this.f25552b.lineTo(0.0f, (float) (this.f25554d * 2));
                this.f25552b.lineTo(0.0f, 0.0f);
                this.f25551a.setShader(new LinearGradient(0.0f, 0.0f, (float) (this.f25553c * 2), (float) (this.f25554d * 2), new int[]{(int) (bVar.getMarqueeValue() * -65536.0f), (int) ((1.0f - bVar.getMarqueeValue()) * -65536.0f)}, (float[]) null, Shader.TileMode.CLAMP));
                this.f25551a.setColor(-65536);
                this.f25551a.setStyle(Paint.Style.STROKE);
                this.f25551a.setStrokeWidth((float) i);
                canvas2.drawPath(this.f25552b, this.f25551a);
            }
        }
    }

    /* renamed from: a */
    public void mo63312a(View view, int i, int i2) {
        String str;
        this.f25553c = i / 2;
        this.f25554d = i2 / 2;
        try {
            str = (String) view.getTag(C10647t.m31283e(view.getContext(), "tt_id_direction"));
        } catch (Exception unused) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX((float) (this.f25553c * 2));
            view.setPivotY((float) this.f25554d);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY((float) this.f25554d);
        } else {
            view.setPivotX((float) this.f25553c);
            view.setPivotY((float) this.f25554d);
        }
    }
}
