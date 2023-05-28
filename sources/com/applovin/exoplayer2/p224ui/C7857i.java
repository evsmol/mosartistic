package com.applovin.exoplayer2.p224ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.ui.i */
final class C7857i {

    /* renamed from: A */
    private int f18857A;

    /* renamed from: B */
    private int f18858B;

    /* renamed from: C */
    private int f18859C;

    /* renamed from: D */
    private int f18860D;

    /* renamed from: E */
    private StaticLayout f18861E;

    /* renamed from: F */
    private StaticLayout f18862F;

    /* renamed from: G */
    private int f18863G;

    /* renamed from: H */
    private int f18864H;

    /* renamed from: I */
    private int f18865I;

    /* renamed from: J */
    private Rect f18866J;

    /* renamed from: a */
    private final float f18867a;

    /* renamed from: b */
    private final float f18868b;

    /* renamed from: c */
    private final float f18869c;

    /* renamed from: d */
    private final float f18870d;

    /* renamed from: e */
    private final float f18871e;

    /* renamed from: f */
    private final TextPaint f18872f;

    /* renamed from: g */
    private final Paint f18873g;

    /* renamed from: h */
    private final Paint f18874h;

    /* renamed from: i */
    private CharSequence f18875i;

    /* renamed from: j */
    private Layout.Alignment f18876j;

    /* renamed from: k */
    private Bitmap f18877k;

    /* renamed from: l */
    private float f18878l;

    /* renamed from: m */
    private int f18879m;

    /* renamed from: n */
    private int f18880n;

    /* renamed from: o */
    private float f18881o;

    /* renamed from: p */
    private int f18882p;

    /* renamed from: q */
    private float f18883q;

    /* renamed from: r */
    private float f18884r;

    /* renamed from: s */
    private int f18885s;

    /* renamed from: t */
    private int f18886t;

    /* renamed from: u */
    private int f18887u;

    /* renamed from: v */
    private int f18888v;

    /* renamed from: w */
    private int f18889w;

    /* renamed from: x */
    private float f18890x;

    /* renamed from: y */
    private float f18891y;

    /* renamed from: z */
    private float f18892z;

    public C7857i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f18871e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f18870d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f18867a = round;
        this.f18868b = round;
        this.f18869c = round;
        TextPaint textPaint = new TextPaint();
        this.f18872f = textPaint;
        textPaint.setAntiAlias(true);
        this.f18872f.setSubpixelText(true);
        Paint paint = new Paint();
        this.f18873g = paint;
        paint.setAntiAlias(true);
        this.f18873g.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f18874h = paint2;
        paint2.setAntiAlias(true);
        this.f18874h.setFilterBitmap(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23202a() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.f18875i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.f18875i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.f18859C
            int r3 = r0.f18857A
            int r2 = r2 - r3
            int r3 = r0.f18860D
            int r4 = r0.f18858B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f18872f
            float r4 = r0.f18890x
            r3.setTextSize(r4)
            float r3 = r0.f18890x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.f18883q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003f:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x004a
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r10, r1)
            return
        L_0x004a:
            float r3 = r0.f18891y
            r16 = 0
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0064
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.f18891y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0064:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.f18889w
            r7 = 1
            if (r3 != r7) goto L_0x0087
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = 0
        L_0x007c:
            if (r6 >= r5) goto L_0x0087
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007c
        L_0x0087:
            int r3 = r0.f18886t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b4
            int r3 = r0.f18889w
            if (r3 == 0) goto L_0x00a6
            if (r3 != r7) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f18886t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b4
        L_0x00a6:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f18886t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b4:
            android.text.Layout$Alignment r3 = r0.f18876j
            if (r3 != 0) goto L_0x00ba
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00ba:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f18872f
            float r4 = r0.f18870d
            float r3 = r0.f18871e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = 0
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f18861E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.f18861E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00ed:
            if (r9 >= r4) goto L_0x0102
            android.text.StaticLayout r6 = r0.f18861E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00ed
        L_0x0102:
            float r4 = r0.f18883q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010e
            if (r5 >= r15) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r15 = r5
        L_0x010f:
            int r15 = r15 + r13
            float r4 = r0.f18881o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x013d
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.f18857A
            int r2 = r2 + r4
            int r4 = r0.f18882p
            r5 = 1
            r6 = 2
            if (r4 == r5) goto L_0x012b
            if (r4 == r6) goto L_0x0129
            goto L_0x012f
        L_0x0129:
            int r2 = r2 - r15
            goto L_0x012f
        L_0x012b:
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r6
        L_0x012f:
            int r4 = r0.f18857A
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.f18859C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0146
        L_0x013d:
            r5 = 1
            r6 = 2
            int r2 = r2 - r15
            int r2 = r2 / r6
            int r4 = r0.f18857A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0146:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x0150
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r12, r1)
            return
        L_0x0150:
            float r4 = r0.f18878l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x01af
            int r7 = r0.f18879m
            if (r7 != 0) goto L_0x0173
            float r7 = (float) r11
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            int r7 = r0.f18858B
            int r4 = r4 + r7
            int r7 = r0.f18880n
            if (r7 != r6) goto L_0x016c
            goto L_0x019f
        L_0x016c:
            if (r7 != r5) goto L_0x01a0
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r6
            goto L_0x01a0
        L_0x0173:
            android.text.StaticLayout r4 = r0.f18861E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.f18861E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.f18878l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x0192
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f18858B
            int r4 = r4 + r5
            goto L_0x01a0
        L_0x0192:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f18860D
            int r4 = r4 + r5
        L_0x019f:
            int r4 = r4 - r3
        L_0x01a0:
            int r5 = r4 + r3
            int r6 = r0.f18860D
            if (r5 <= r6) goto L_0x01a9
            int r4 = r6 - r3
            goto L_0x01b9
        L_0x01a9:
            int r3 = r0.f18858B
            if (r4 >= r3) goto L_0x01b9
            r11 = r3
            goto L_0x01ba
        L_0x01af:
            int r4 = r0.f18860D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.f18892z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
        L_0x01b9:
            r11 = r4
        L_0x01ba:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f18872f
            float r8 = r0.f18870d
            float r9 = r0.f18871e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f18861E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f18872f
            float r4 = r0.f18870d
            float r5 = r0.f18871e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f18862F = r1
            r0.f18863G = r2
            r0.f18864H = r11
            r1 = r25
            r0.f18865I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7857i.m23202a():void");
    }

    /* renamed from: a */
    private void m23203a(Canvas canvas) {
        StaticLayout staticLayout = this.f18861E;
        StaticLayout staticLayout2 = this.f18862F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.f18863G, (float) this.f18864H);
            if (Color.alpha(this.f18887u) > 0) {
                this.f18873g.setColor(this.f18887u);
                canvas.drawRect((float) (-this.f18865I), 0.0f, (float) (staticLayout.getWidth() + this.f18865I), (float) staticLayout.getHeight(), this.f18873g);
            }
            int i = this.f18889w;
            boolean z = true;
            if (i == 1) {
                this.f18872f.setStrokeJoin(Paint.Join.ROUND);
                this.f18872f.setStrokeWidth(this.f18867a);
                this.f18872f.setColor(this.f18888v);
                this.f18872f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i == 2) {
                TextPaint textPaint = this.f18872f;
                float f = this.f18868b;
                float f2 = this.f18869c;
                textPaint.setShadowLayer(f, f2, f2, this.f18888v);
            } else if (i == 3 || i == 4) {
                if (this.f18889w != 3) {
                    z = false;
                }
                int i2 = -1;
                int i3 = z ? -1 : this.f18888v;
                if (z) {
                    i2 = this.f18888v;
                }
                float f3 = this.f18868b / 2.0f;
                this.f18872f.setColor(this.f18885s);
                this.f18872f.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                this.f18872f.setShadowLayer(this.f18868b, f4, f4, i3);
                staticLayout2.draw(canvas);
                this.f18872f.setShadowLayer(this.f18868b, f3, f3, i2);
            }
            this.f18872f.setColor(this.f18885s);
            this.f18872f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f18872f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: a */
    private void m23204a(Canvas canvas, boolean z) {
        if (z) {
            m23203a(canvas);
            return;
        }
        C7717a.m22120b(this.f18866J);
        C7717a.m22120b(this.f18877k);
        m23207b(canvas);
    }

    /* renamed from: a */
    private static boolean m23205a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23206b() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f18877k
            int r1 = r7.f18859C
            int r2 = r7.f18857A
            int r1 = r1 - r2
            int r3 = r7.f18860D
            int r4 = r7.f18858B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f18881o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f18878l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f18883q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f18884r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
        L_0x0038:
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            int r3 = r7.f18882p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0047
            float r3 = (float) r1
        L_0x0045:
            float r2 = r2 - r3
            goto L_0x004d
        L_0x0047:
            if (r3 != r5) goto L_0x004d
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0045
        L_0x004d:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f18880n
            if (r3 != r6) goto L_0x0058
            float r3 = (float) r0
        L_0x0056:
            float r4 = r4 - r3
            goto L_0x005e
        L_0x0058:
            if (r3 != r5) goto L_0x005e
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0056
        L_0x005e:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f18866J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7857i.m23206b():void");
    }

    /* renamed from: b */
    private void m23207b(Canvas canvas) {
        canvas.drawBitmap(this.f18877k, (Rect) null, this.f18866J, this.f18874h);
    }

    /* renamed from: a */
    public void mo55403a(C7540a aVar, C7841c cVar, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z = aVar.f17404e == null;
        int i5 = -16777216;
        if (z) {
            if (!TextUtils.isEmpty(aVar.f17401b)) {
                i5 = aVar.f17412m ? aVar.f17413n : cVar.f18715d;
            } else {
                return;
            }
        }
        if (m23205a(this.f18875i, aVar.f17401b) && C7728ai.m22218a((Object) this.f18876j, (Object) aVar.f17402c) && this.f18877k == aVar.f17404e && this.f18878l == aVar.f17405f && this.f18879m == aVar.f17406g && C7728ai.m22218a((Object) Integer.valueOf(this.f18880n), (Object) Integer.valueOf(aVar.f17407h)) && this.f18881o == aVar.f17408i && C7728ai.m22218a((Object) Integer.valueOf(this.f18882p), (Object) Integer.valueOf(aVar.f17409j)) && this.f18883q == aVar.f17410k && this.f18884r == aVar.f17411l && this.f18885s == cVar.f18713b && this.f18886t == cVar.f18714c && this.f18887u == i5 && this.f18889w == cVar.f18716e && this.f18888v == cVar.f18717f && C7728ai.m22218a((Object) this.f18872f.getTypeface(), (Object) cVar.f18718g) && this.f18890x == f && this.f18891y == f2 && this.f18892z == f3 && this.f18857A == i && this.f18858B == i2 && this.f18859C == i3 && this.f18860D == i4) {
            m23204a(canvas, z);
            return;
        }
        this.f18875i = aVar.f17401b;
        this.f18876j = aVar.f17402c;
        this.f18877k = aVar.f17404e;
        this.f18878l = aVar.f17405f;
        this.f18879m = aVar.f17406g;
        this.f18880n = aVar.f17407h;
        this.f18881o = aVar.f17408i;
        this.f18882p = aVar.f17409j;
        this.f18883q = aVar.f17410k;
        this.f18884r = aVar.f17411l;
        this.f18885s = cVar.f18713b;
        this.f18886t = cVar.f18714c;
        this.f18887u = i5;
        this.f18889w = cVar.f18716e;
        this.f18888v = cVar.f18717f;
        this.f18872f.setTypeface(cVar.f18718g);
        this.f18890x = f;
        this.f18891y = f2;
        this.f18892z = f3;
        this.f18857A = i;
        this.f18858B = i2;
        this.f18859C = i3;
        this.f18860D = i4;
        if (z) {
            C7717a.m22120b(this.f18875i);
            m23202a();
        } else {
            C7717a.m22120b(this.f18877k);
            m23206b();
        }
        m23204a(canvas, z);
    }
}
