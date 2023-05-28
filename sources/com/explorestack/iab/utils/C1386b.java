package com.explorestack.iab.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;

/* renamed from: com.explorestack.iab.utils.b */
public class C1386b extends Drawable implements Animatable {

    /* renamed from: g */
    public static final Interpolator f4282g = new LinearInterpolator();

    /* renamed from: h */
    public static final Interpolator f4283h = new C1387a();

    /* renamed from: i */
    public static final int[] f4284i = {-16777216};

    /* renamed from: a */
    public final C1390d f4285a;

    /* renamed from: b */
    public float f4286b;

    /* renamed from: c */
    public Resources f4287c;

    /* renamed from: d */
    public Animator f4288d;

    /* renamed from: e */
    public float f4289e;

    /* renamed from: f */
    public boolean f4290f;

    /* renamed from: com.explorestack.iab.utils.b$a */
    public class C1387a implements Interpolator {

        /* renamed from: a */
        public final float[] f4291a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* renamed from: b */
        public final float f4292b = (1.0f / ((float) 200));

        public float getInterpolation(float f) {
            if (f >= 1.0f) {
                return 1.0f;
            }
            if (f <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f4291a;
            int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
            float f2 = this.f4292b;
            float f3 = (f - (((float) min) * f2)) / f2;
            float[] fArr2 = this.f4291a;
            return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
        }
    }

    /* renamed from: com.explorestack.iab.utils.b$b */
    public class C1388b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C1390d f4293a;

        public C1388b(C1390d dVar) {
            this.f4293a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1386b.this.mo4062b(floatValue, this.f4293a);
            C1386b.this.mo4057a(floatValue, this.f4293a, false);
            C1386b.this.invalidateSelf();
        }
    }

    /* renamed from: com.explorestack.iab.utils.b$c */
    public class C1389c implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C1390d f4295a;

        public C1389c(C1390d dVar) {
            this.f4295a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1386b.this.mo4057a(1.0f, this.f4295a, true);
            this.f4295a.mo4101l();
            this.f4295a.mo4099j();
            if (C1386b.this.f4290f) {
                boolean unused = C1386b.this.f4290f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                return;
            }
            C1386b bVar = C1386b.this;
            float unused2 = bVar.f4289e = bVar.f4289e + 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            float unused = C1386b.this.f4289e = 0.0f;
        }
    }

    /* renamed from: com.explorestack.iab.utils.b$d */
    public static class C1390d {

        /* renamed from: a */
        public final RectF f4297a = new RectF();

        /* renamed from: b */
        public final Paint f4298b;

        /* renamed from: c */
        public final Paint f4299c;

        /* renamed from: d */
        public final Paint f4300d;

        /* renamed from: e */
        public final Paint f4301e;

        /* renamed from: f */
        public float f4302f;

        /* renamed from: g */
        public float f4303g;

        /* renamed from: h */
        public float f4304h;

        /* renamed from: i */
        public float f4305i;

        /* renamed from: j */
        public int[] f4306j;

        /* renamed from: k */
        public int f4307k;

        /* renamed from: l */
        public float f4308l;

        /* renamed from: m */
        public float f4309m;

        /* renamed from: n */
        public float f4310n;

        /* renamed from: o */
        public float f4311o;

        /* renamed from: p */
        public int f4312p;

        /* renamed from: q */
        public int f4313q;

        public C1390d() {
            Paint paint = new Paint();
            this.f4298b = paint;
            Paint paint2 = new Paint();
            this.f4299c = paint2;
            Paint paint3 = new Paint();
            this.f4300d = paint3;
            Paint paint4 = new Paint();
            this.f4301e = paint4;
            this.f4302f = 0.0f;
            this.f4303g = 0.0f;
            this.f4304h = 0.0f;
            this.f4305i = 5.0f;
            this.f4312p = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
            paint4.setColor(0);
        }

        /* renamed from: a */
        public int mo4078a() {
            return this.f4312p;
        }

        /* renamed from: a */
        public void mo4079a(float f) {
            this.f4311o = f;
        }

        /* renamed from: a */
        public void mo4080a(int i) {
            this.f4312p = i;
        }

        /* renamed from: a */
        public void mo4081a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4297a;
            float f = this.f4311o;
            float f2 = (this.f4305i / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - (this.f4305i / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f4302f;
            float f4 = this.f4304h;
            float f5 = (f3 + f4) * 360.0f;
            this.f4298b.setColor(this.f4313q);
            this.f4298b.setAlpha(this.f4312p);
            float f6 = this.f4305i / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4300d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f5, ((this.f4303g + f4) * 360.0f) - f5, false, this.f4298b);
        }

        /* renamed from: a */
        public void mo4082a(ColorFilter colorFilter) {
            this.f4298b.setColorFilter(colorFilter);
        }

        /* renamed from: a */
        public void mo4083a(Paint.Cap cap) {
            this.f4298b.setStrokeCap(cap);
        }

        /* renamed from: a */
        public void mo4084a(int[] iArr) {
            this.f4306j = iArr;
            mo4090c(0);
        }

        /* renamed from: b */
        public float mo4085b() {
            return this.f4303g;
        }

        /* renamed from: b */
        public void mo4086b(float f) {
            this.f4303g = f;
        }

        /* renamed from: b */
        public void mo4087b(int i) {
            this.f4313q = i;
        }

        /* renamed from: c */
        public int mo4088c() {
            return this.f4306j[mo4091d()];
        }

        /* renamed from: c */
        public void mo4089c(float f) {
            this.f4304h = f;
        }

        /* renamed from: c */
        public void mo4090c(int i) {
            this.f4307k = i;
            this.f4313q = this.f4306j[i];
        }

        /* renamed from: d */
        public int mo4091d() {
            return (this.f4307k + 1) % this.f4306j.length;
        }

        /* renamed from: d */
        public void mo4092d(float f) {
            this.f4302f = f;
        }

        /* renamed from: e */
        public float mo4093e() {
            return this.f4302f;
        }

        /* renamed from: e */
        public void mo4094e(float f) {
            this.f4305i = f;
            this.f4298b.setStrokeWidth(f);
        }

        /* renamed from: f */
        public int mo4095f() {
            return this.f4306j[this.f4307k];
        }

        /* renamed from: g */
        public float mo4096g() {
            return this.f4309m;
        }

        /* renamed from: h */
        public float mo4097h() {
            return this.f4310n;
        }

        /* renamed from: i */
        public float mo4098i() {
            return this.f4308l;
        }

        /* renamed from: j */
        public void mo4099j() {
            mo4090c(mo4091d());
        }

        /* renamed from: k */
        public void mo4100k() {
            this.f4308l = 0.0f;
            this.f4309m = 0.0f;
            this.f4310n = 0.0f;
            mo4092d(0.0f);
            mo4086b(0.0f);
            mo4089c(0.0f);
        }

        /* renamed from: l */
        public void mo4101l() {
            this.f4308l = this.f4302f;
            this.f4309m = this.f4303g;
            this.f4310n = this.f4304h;
        }
    }

    public C1386b(Context context) {
        this.f4287c = context.getResources();
        C1390d dVar = new C1390d();
        this.f4285a = dVar;
        dVar.mo4084a(f4284i);
        mo4063c(2.5f);
        mo4060b();
    }

    /* renamed from: a */
    public float mo4053a() {
        return this.f4285a.f4305i;
    }

    /* renamed from: a */
    public final int mo4054a(float f, int i, int i2) {
        int i3 = (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i4 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        return ((i3 + ((int) (((float) (((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) - i6)))));
    }

    /* renamed from: a */
    public void mo4055a(float f) {
        this.f4285a.mo4079a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo4056a(float f, C1390d dVar) {
        mo4062b(f, dVar);
        dVar.mo4092d(dVar.mo4098i() + (((dVar.mo4096g() - 0.01f) - dVar.mo4098i()) * f));
        dVar.mo4086b(dVar.mo4096g());
        dVar.mo4089c(dVar.mo4097h() + ((((float) (Math.floor((double) (dVar.mo4097h() / 0.8f)) + 1.0d)) - dVar.mo4097h()) * f));
    }

    /* renamed from: a */
    public final void mo4057a(float f, C1390d dVar, boolean z) {
        float f2;
        float f3;
        if (this.f4290f) {
            mo4056a(f, dVar);
        } else if (f != 1.0f || z) {
            float h = dVar.mo4097h();
            if (f < 0.5f) {
                f2 = dVar.mo4098i();
                f3 = (f4283h.getInterpolation(f / 0.5f) * 0.79f) + f2 + 0.01f;
            } else {
                float i = dVar.mo4098i() + 0.79f;
                float f4 = i;
                f2 = i - (((1.0f - f4283h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            dVar.mo4092d(f2);
            dVar.mo4086b(f3);
            dVar.mo4089c(h + (0.20999998f * f));
            mo4061b((f + this.f4289e) * 216.0f);
        }
    }

    /* renamed from: a */
    public void mo4058a(Paint.Cap cap) {
        this.f4285a.mo4083a(cap);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo4059a(int... iArr) {
        this.f4285a.mo4084a(iArr);
        this.f4285a.mo4090c(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo4060b() {
        C1390d dVar = this.f4285a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1388b(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4282g);
        ofFloat.addListener(new C1389c(dVar));
        this.f4288d = ofFloat;
    }

    /* renamed from: b */
    public final void mo4061b(float f) {
        this.f4286b = f;
    }

    /* renamed from: b */
    public final void mo4062b(float f, C1390d dVar) {
        dVar.mo4087b(f > 0.75f ? mo4054a((f - 0.75f) / 0.25f, dVar.mo4095f(), dVar.mo4088c()) : dVar.mo4095f());
    }

    /* renamed from: c */
    public void mo4063c(float f) {
        this.f4285a.mo4094e(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4286b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4285a.mo4081a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f4285a.mo4078a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f4288d.isRunning();
    }

    public void setAlpha(int i) {
        this.f4285a.mo4080a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4285a.mo4082a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f4288d.cancel();
        this.f4285a.mo4101l();
        if (this.f4285a.mo4085b() != this.f4285a.mo4093e()) {
            this.f4290f = true;
            animator = this.f4288d;
            j = 666;
        } else {
            this.f4285a.mo4090c(0);
            this.f4285a.mo4100k();
            animator = this.f4288d;
            j = 1332;
        }
        animator.setDuration(j);
        this.f4288d.start();
    }

    public void stop() {
        this.f4288d.cancel();
        mo4061b(0.0f);
        this.f4285a.mo4090c(0);
        this.f4285a.mo4100k();
        invalidateSelf();
    }
}
