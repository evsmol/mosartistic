package com.applovin.exoplayer2.p224ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p224ui.C7859k;
import com.applovin.sdk.C8656R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.applovin.exoplayer2.ui.d */
public class C7842d extends View implements C7859k {

    /* renamed from: A */
    private int f18719A;

    /* renamed from: B */
    private long f18720B;

    /* renamed from: C */
    private int f18721C;

    /* renamed from: D */
    private Rect f18722D;

    /* renamed from: E */
    private ValueAnimator f18723E;

    /* renamed from: F */
    private float f18724F;

    /* renamed from: G */
    private boolean f18725G;

    /* renamed from: H */
    private boolean f18726H;

    /* renamed from: I */
    private long f18727I;

    /* renamed from: J */
    private long f18728J;

    /* renamed from: K */
    private long f18729K;

    /* renamed from: L */
    private long f18730L;

    /* renamed from: M */
    private int f18731M;

    /* renamed from: N */
    private long[] f18732N;

    /* renamed from: O */
    private boolean[] f18733O;

    /* renamed from: a */
    private final Rect f18734a;

    /* renamed from: b */
    private final Rect f18735b;

    /* renamed from: c */
    private final Rect f18736c;

    /* renamed from: d */
    private final Rect f18737d;

    /* renamed from: e */
    private final Paint f18738e;

    /* renamed from: f */
    private final Paint f18739f;

    /* renamed from: g */
    private final Paint f18740g;

    /* renamed from: h */
    private final Paint f18741h;

    /* renamed from: i */
    private final Paint f18742i;

    /* renamed from: j */
    private final Paint f18743j;

    /* renamed from: k */
    private final Drawable f18744k;

    /* renamed from: l */
    private final int f18745l;

    /* renamed from: m */
    private final int f18746m;

    /* renamed from: n */
    private final int f18747n;

    /* renamed from: o */
    private final int f18748o;

    /* renamed from: p */
    private final int f18749p;

    /* renamed from: q */
    private final int f18750q;

    /* renamed from: r */
    private final int f18751r;

    /* renamed from: s */
    private final int f18752s;

    /* renamed from: t */
    private final int f18753t;

    /* renamed from: u */
    private final StringBuilder f18754u;

    /* renamed from: v */
    private final Formatter f18755v;

    /* renamed from: w */
    private final Runnable f18756w;

    /* renamed from: x */
    private final CopyOnWriteArraySet<C7859k.C7860a> f18757x;

    /* renamed from: y */
    private final Point f18758y;

    /* renamed from: z */
    private final float f18759z;

    public C7842d(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7842d(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        int i3;
        int i4;
        AttributeSet attributeSet3 = attributeSet2;
        this.f18734a = new Rect();
        this.f18735b = new Rect();
        this.f18736c = new Rect();
        this.f18737d = new Rect();
        this.f18738e = new Paint();
        this.f18739f = new Paint();
        this.f18740g = new Paint();
        this.f18741h = new Paint();
        this.f18742i = new Paint();
        Paint paint = new Paint();
        this.f18743j = paint;
        paint.setAntiAlias(true);
        this.f18757x = new CopyOnWriteArraySet<>();
        this.f18758y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f18759z = f;
        this.f18753t = m23009a(f, -50);
        int a = m23009a(this.f18759z, 4);
        int a2 = m23009a(this.f18759z, 26);
        int a3 = m23009a(this.f18759z, 4);
        int a4 = m23009a(this.f18759z, 12);
        int a5 = m23009a(this.f18759z, 0);
        int a6 = m23009a(this.f18759z, 16);
        if (attributeSet3 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, C8656R.styleable.AppLovinDefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C8656R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f18744k = drawable;
                if (drawable != null) {
                    m23019a(drawable);
                    a2 = Math.max(this.f18744k.getMinimumHeight(), a2);
                }
                this.f18745l = obtainStyledAttributes.getDimensionPixelSize(C8656R.styleable.AppLovinDefaultTimeBar_al_bar_height, a);
                this.f18746m = obtainStyledAttributes.getDimensionPixelSize(C8656R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a2);
                this.f18747n = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f18748o = obtainStyledAttributes.getDimensionPixelSize(C8656R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a3);
                this.f18749p = obtainStyledAttributes.getDimensionPixelSize(C8656R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a4);
                this.f18750q = obtainStyledAttributes.getDimensionPixelSize(C8656R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a5);
                this.f18751r = obtainStyledAttributes.getDimensionPixelSize(C8656R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a6);
                int i5 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i6 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i7 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i8 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i9 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i10 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                this.f18738e.setColor(i5);
                this.f18743j.setColor(i6);
                this.f18739f.setColor(i7);
                this.f18740g.setColor(i8);
                this.f18741h.setColor(i9);
                this.f18742i.setColor(i10);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f18745l = a;
            this.f18746m = a2;
            this.f18747n = 0;
            this.f18748o = a3;
            this.f18749p = a4;
            this.f18750q = a5;
            this.f18751r = a6;
            this.f18738e.setColor(-1);
            this.f18743j.setColor(-1);
            this.f18739f.setColor(-855638017);
            this.f18740g.setColor(872415231);
            this.f18741h.setColor(-1291845888);
            this.f18742i.setColor(872414976);
            this.f18744k = null;
        }
        this.f18754u = new StringBuilder();
        this.f18755v = new Formatter(this.f18754u, Locale.getDefault());
        this.f18756w = new Runnable() {
            public final void run() {
                C7842d.this.m23025c();
            }
        };
        Drawable drawable2 = this.f18744k;
        if (drawable2 != null) {
            i4 = drawable2.getMinimumWidth();
            i3 = 1;
        } else {
            i3 = 1;
            i4 = Math.max(this.f18750q, Math.max(this.f18749p, this.f18751r));
        }
        this.f18752s = (i4 + i3) / 2;
        this.f18724F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f18723E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7842d.this.m23015a(valueAnimator);
            }
        });
        this.f18728J = -9223372036854775807L;
        this.f18720B = -9223372036854775807L;
        this.f18719A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    private static int m23009a(float f, int i) {
        return (int) ((((float) i) * f) + 0.5f);
    }

    /* renamed from: a */
    private Point m23010a(MotionEvent motionEvent) {
        this.f18758y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f18758y;
    }

    /* renamed from: a */
    private void m23011a() {
        this.f18736c.set(this.f18735b);
        this.f18737d.set(this.f18735b);
        long j = this.f18726H ? this.f18727I : this.f18729K;
        if (this.f18728J > 0) {
            this.f18736c.right = Math.min(this.f18735b.left + ((int) ((((long) this.f18735b.width()) * this.f18730L) / this.f18728J)), this.f18735b.right);
            this.f18737d.right = Math.min(this.f18735b.left + ((int) ((((long) this.f18735b.width()) * j) / this.f18728J)), this.f18735b.right);
        } else {
            this.f18736c.right = this.f18735b.left;
            this.f18737d.right = this.f18735b.left;
        }
        invalidate(this.f18734a);
    }

    /* renamed from: a */
    private void m23012a(float f) {
        this.f18737d.right = C7728ai.m22180a((int) f, this.f18735b.left, this.f18735b.right);
    }

    /* renamed from: a */
    private void m23013a(int i, int i2) {
        Rect rect = this.f18722D;
        if (rect == null || rect.width() != i || this.f18722D.height() != i2) {
            Rect rect2 = new Rect(0, 0, i, i2);
            this.f18722D = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    /* renamed from: a */
    private void m23014a(long j) {
        this.f18727I = j;
        this.f18726H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<C7859k.C7860a> it = this.f18757x.iterator();
        while (it.hasNext()) {
            it.next().mo55349a(this, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23015a(ValueAnimator valueAnimator) {
        this.f18724F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f18734a);
    }

    /* renamed from: a */
    private void m23016a(Canvas canvas) {
        int height = this.f18735b.height();
        int centerY = this.f18735b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f18728J <= 0) {
            canvas.drawRect((float) this.f18735b.left, (float) centerY, (float) this.f18735b.right, (float) i, this.f18740g);
            return;
        }
        int i2 = this.f18736c.left;
        int i3 = this.f18736c.right;
        int max = Math.max(Math.max(this.f18735b.left, i3), this.f18737d.right);
        if (max < this.f18735b.right) {
            canvas.drawRect((float) max, (float) centerY, (float) this.f18735b.right, (float) i, this.f18740g);
        }
        int max2 = Math.max(i2, this.f18737d.right);
        if (i3 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i3, (float) i, this.f18739f);
        }
        if (this.f18737d.width() > 0) {
            canvas.drawRect((float) this.f18737d.left, (float) centerY, (float) this.f18737d.right, (float) i, this.f18738e);
        }
        if (this.f18731M != 0) {
            long[] jArr = (long[]) C7717a.m22120b(this.f18732N);
            boolean[] zArr = (boolean[]) C7717a.m22120b(this.f18733O);
            int i4 = this.f18748o / 2;
            for (int i5 = 0; i5 < this.f18731M; i5++) {
                int min = this.f18735b.left + Math.min(this.f18735b.width() - this.f18748o, Math.max(0, ((int) ((((long) this.f18735b.width()) * C7728ai.m22192a(jArr[i5], 0, this.f18728J)) / this.f18728J)) - i4));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f18748o), (float) i, zArr[i5] ? this.f18742i : this.f18741h);
            }
        }
    }

    /* renamed from: a */
    private void m23017a(boolean z) {
        removeCallbacks(this.f18756w);
        this.f18726H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<C7859k.C7860a> it = this.f18757x.iterator();
        while (it.hasNext()) {
            it.next().mo55350a(this, this.f18727I, z);
        }
    }

    /* renamed from: a */
    private boolean m23018a(float f, float f2) {
        return this.f18734a.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private boolean m23019a(Drawable drawable) {
        return C7728ai.f18249a >= 23 && m23020a(drawable, getLayoutDirection());
    }

    /* renamed from: a */
    private static boolean m23020a(Drawable drawable, int i) {
        return C7728ai.f18249a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: b */
    private static int m23021b(float f, int i) {
        return (int) (((float) i) / f);
    }

    /* renamed from: b */
    private void m23022b() {
        Drawable drawable = this.f18744k;
        if (drawable != null && drawable.isStateful() && this.f18744k.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: b */
    private void m23023b(long j) {
        if (this.f18727I != j) {
            this.f18727I = j;
            Iterator<C7859k.C7860a> it = this.f18757x.iterator();
            while (it.hasNext()) {
                it.next().mo55351b(this, j);
            }
        }
    }

    /* renamed from: b */
    private void m23024b(Canvas canvas) {
        if (this.f18728J > 0) {
            int a = C7728ai.m22180a(this.f18737d.right, this.f18737d.left, this.f18735b.right);
            int centerY = this.f18737d.centerY();
            Drawable drawable = this.f18744k;
            if (drawable == null) {
                canvas.drawCircle((float) a, (float) centerY, (float) ((int) ((((float) ((this.f18726H || isFocused()) ? this.f18751r : isEnabled() ? this.f18749p : this.f18750q)) * this.f18724F) / 2.0f)), this.f18743j);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f18724F)) / 2;
            int intrinsicHeight = ((int) (((float) this.f18744k.getIntrinsicHeight()) * this.f18724F)) / 2;
            this.f18744k.setBounds(a - intrinsicWidth, centerY - intrinsicHeight, a + intrinsicWidth, centerY + intrinsicHeight);
            this.f18744k.draw(canvas);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m23025c() {
        m23017a(false);
    }

    /* renamed from: c */
    private boolean m23026c(long j) {
        if (this.f18728J <= 0) {
            return false;
        }
        long j2 = this.f18726H ? this.f18727I : this.f18729K;
        long a = C7728ai.m22192a(j2 + j, 0, this.f18728J);
        if (a == j2) {
            return false;
        }
        if (!this.f18726H) {
            m23014a(a);
        } else {
            m23023b(a);
        }
        m23011a();
        return true;
    }

    private long getPositionIncrement() {
        long j = this.f18720B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f18728J;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f18719A);
    }

    private String getProgressText() {
        return C7728ai.m22201a(this.f18754u, this.f18755v, this.f18729K);
    }

    private long getScrubberPosition() {
        if (this.f18735b.width() <= 0 || this.f18728J == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f18737d.width()) * this.f18728J) / ((long) this.f18735b.width());
    }

    /* renamed from: a */
    public void mo55293a(C7859k.C7860a aVar) {
        C7717a.m22120b(aVar);
        this.f18757x.add(aVar);
    }

    /* renamed from: a */
    public void mo55294a(long[] jArr, boolean[] zArr, int i) {
        C7717a.m22118a(i == 0 || !(jArr == null || zArr == null));
        this.f18731M = i;
        this.f18732N = jArr;
        this.f18733O = zArr;
        m23011a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m23022b();
    }

    public long getPreferredUpdateDelay() {
        int b = m23021b(this.f18759z, this.f18735b.width());
        if (b != 0) {
            long j = this.f18728J;
            if (!(j == 0 || j == -9223372036854775807L)) {
                return j / ((long) b);
            }
        }
        return Long.MAX_VALUE;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18744k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        m23016a(canvas);
        m23024b(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f18726H && !z) {
            m23017a(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f18728J > 0) {
            if (C7728ai.f18249a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (m23026c(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f18756w);
        postDelayed(r4.f18756w, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m23026c(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f18756w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f18756w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f18726H
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.m23017a((boolean) r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7842d.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.f18725G ? 0 : this.f18752s;
        if (this.f18747n == 1) {
            i6 = (i8 - getPaddingBottom()) - this.f18746m;
            int i10 = this.f18745l;
            i5 = ((i8 - getPaddingBottom()) - i10) - Math.max(i9 - (i10 / 2), 0);
        } else {
            i6 = (i8 - this.f18746m) / 2;
            i5 = (i8 - this.f18745l) / 2;
        }
        this.f18734a.set(paddingLeft, i6, paddingRight, this.f18746m + i6);
        this.f18735b.set(this.f18734a.left + i9, i5, this.f18734a.right - i9, this.f18745l + i5);
        if (C7728ai.f18249a >= 29) {
            m23013a(i7, i8);
        }
        m23011a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f18746m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f18746m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m23022b();
    }

    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f18744k;
        if (drawable != null && m23020a(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x006d
            long r2 = r7.f18728J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x006d
        L_0x0010:
            android.graphics.Point r0 = r7.m23010a((android.view.MotionEvent) r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005a
            r5 = 3
            if (r3 == r4) goto L_0x004b
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004b
            goto L_0x006d
        L_0x0028:
            boolean r8 = r7.f18726H
            if (r8 == 0) goto L_0x006d
            int r8 = r7.f18753t
            if (r0 >= r8) goto L_0x0037
            int r8 = r7.f18721C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L_0x003a
        L_0x0037:
            r7.f18721C = r2
            float r8 = (float) r2
        L_0x003a:
            r7.m23012a((float) r8)
            long r0 = r7.getScrubberPosition()
            r7.m23023b((long) r0)
        L_0x0044:
            r7.m23011a()
            r7.invalidate()
            return r4
        L_0x004b:
            boolean r0 = r7.f18726H
            if (r0 == 0) goto L_0x006d
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0056
            r1 = 1
        L_0x0056:
            r7.m23017a((boolean) r1)
            return r4
        L_0x005a:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m23018a((float) r8, (float) r0)
            if (r0 == 0) goto L_0x006d
            r7.m23012a((float) r8)
            long r0 = r7.getScrubberPosition()
            r7.m23014a((long) r0)
            goto L_0x0044
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7842d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (m23026c(getPositionIncrement()) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (m23026c(-getPositionIncrement()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L_0x0008
            return r0
        L_0x0008:
            long r1 = r6.f18728J
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0012
            return r8
        L_0x0012:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r1) goto L_0x0025
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.m23026c(r1)
            if (r7 == 0) goto L_0x0034
        L_0x0021:
            r6.m23017a((boolean) r8)
            goto L_0x0034
        L_0x0025:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L_0x0039
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.m23026c(r1)
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L_0x0039:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7842d.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(int i) {
        this.f18741h.setColor(i);
        invalidate(this.f18734a);
    }

    public void setBufferedColor(int i) {
        this.f18739f.setColor(i);
        invalidate(this.f18734a);
    }

    public void setBufferedPosition(long j) {
        if (this.f18730L != j) {
            this.f18730L = j;
            m23011a();
        }
    }

    public void setDuration(long j) {
        if (this.f18728J != j) {
            this.f18728J = j;
            if (this.f18726H && j == -9223372036854775807L) {
                m23017a(true);
            }
            m23011a();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f18726H && !z) {
            m23017a(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        C7717a.m22118a(i > 0);
        this.f18719A = i;
        this.f18720B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C7717a.m22118a(j > 0);
        this.f18719A = -1;
        this.f18720B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f18742i.setColor(i);
        invalidate(this.f18734a);
    }

    public void setPlayedColor(int i) {
        this.f18738e.setColor(i);
        invalidate(this.f18734a);
    }

    public void setPosition(long j) {
        if (this.f18729K != j) {
            this.f18729K = j;
            setContentDescription(getProgressText());
            m23011a();
        }
    }

    public void setScrubberColor(int i) {
        this.f18743j.setColor(i);
        invalidate(this.f18734a);
    }

    public void setUnplayedColor(int i) {
        this.f18740g.setColor(i);
        invalidate(this.f18734a);
    }
}
