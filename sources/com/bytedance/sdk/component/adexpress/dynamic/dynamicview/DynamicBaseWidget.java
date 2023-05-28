package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.p302a.C10323b;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C10340a;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C10341b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10348e;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10375a;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.List;

public abstract class DynamicBaseWidget extends FrameLayout implements C10341b, C10387b, C10388c {

    /* renamed from: a */
    private float f25745a;

    /* renamed from: b */
    private float f25746b;

    /* renamed from: c */
    protected float f25747c;

    /* renamed from: d */
    protected float f25748d;

    /* renamed from: e */
    protected float f25749e;

    /* renamed from: f */
    protected float f25750f;

    /* renamed from: g */
    protected int f25751g = ((int) C10305b.m29747a(this.f25755k, this.f25749e));

    /* renamed from: h */
    protected int f25752h = ((int) C10305b.m29747a(this.f25755k, this.f25750f));

    /* renamed from: i */
    protected int f25753i = ((int) C10305b.m29747a(this.f25755k, this.f25747c));

    /* renamed from: j */
    protected int f25754j = ((int) C10305b.m29747a(this.f25755k, this.f25748d));

    /* renamed from: k */
    protected Context f25755k;

    /* renamed from: l */
    protected C10350g f25756l;

    /* renamed from: m */
    protected C10351h f25757m;

    /* renamed from: n */
    protected DynamicRootView f25758n;

    /* renamed from: o */
    protected View f25759o;

    /* renamed from: p */
    protected boolean f25760p;

    /* renamed from: q */
    protected C10323b f25761q;

    /* renamed from: r */
    C10340a f25762r;

    /* renamed from: s */
    private float f25763s;

    public float getShineValue() {
        return this.f25746b;
    }

    public void setShineValue(float f) {
        this.f25746b = f;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f25745a;
    }

    public void setRippleValue(float f) {
        this.f25745a = f;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f25763s;
    }

    public void setMarqueeValue(float f) {
        this.f25763s = f;
        postInvalidate();
    }

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context);
        this.f25755k = context;
        this.f25758n = dynamicRootView;
        this.f25757m = hVar;
        this.f25747c = hVar.mo63556e();
        this.f25748d = hVar.mo63558f();
        this.f25749e = hVar.mo63560g();
        this.f25750f = hVar.mo63562h();
        C10350g gVar = new C10350g(hVar.mo63563i());
        this.f25756l = gVar;
        if (gVar.mo63532r() > 0) {
            this.f25751g += this.f25756l.mo63532r() * 2;
            this.f25752h += this.f25756l.mo63532r() * 2;
            this.f25753i -= this.f25756l.mo63532r();
            this.f25754j -= this.f25756l.mo63532r();
            List<C10351h> j = hVar.mo63564j();
            if (j != null) {
                for (C10351h next : j) {
                    next.mo63553c(next.mo63556e() + ((float) C10305b.m29751b(this.f25755k, (float) this.f25756l.mo63532r())));
                    next.mo63555d(next.mo63558f() + ((float) C10305b.m29751b(this.f25755k, (float) this.f25756l.mo63532r())));
                    next.mo63542a((float) C10305b.m29751b(this.f25755k, (float) this.f25756l.mo63532r()));
                    next.mo63548b((float) C10305b.m29751b(this.f25755k, (float) this.f25756l.mo63532r()));
                }
            }
        }
        this.f25760p = this.f25756l.mo63528n() > 0.0d;
        this.f25762r = new C10340a();
    }

    public void setShouldInvisible(boolean z) {
        this.f25760p = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f25760p;
    }

    /* renamed from: c */
    public boolean mo63624c() {
        mo63645h();
        mo63627f();
        mo63625d();
        return true;
    }

    /* renamed from: a */
    public void mo63622a(int i) {
        C10350g gVar = this.f25756l;
        if (gVar != null && gVar.mo63515a(i)) {
            mo63645h();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).mo63622a(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo63625d() {
        if (!mo63626e()) {
            return true;
        }
        View view = this.f25759o;
        if (view == null) {
            view = this;
        }
        view.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        view.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        view.setTag(C10647t.m31283e(getContext(), "tt_id_click_tag"), this.f25756l.mo63540z());
        view.setTag(C10647t.m31283e(getContext(), "tt_id_click_area_type"), this.f25757m.mo63563i().mo63357b());
        mo63623a(view);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63623a(View view) {
        C10349f e;
        C10351h hVar = this.f25757m;
        if (hVar != null && (e = hVar.mo63563i().mo63363e()) != null) {
            view.setTag(C10647t.m31283e(getContext(), "tt_id_open_landing_page"), Boolean.valueOf(e.mo63410ak()));
        }
    }

    /* renamed from: e */
    public boolean mo63626e() {
        C10350g gVar = this.f25756l;
        return (gVar == null || gVar.mo63536v() == 0) ? false : true;
    }

    /* renamed from: f */
    public void mo63627f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
        layoutParams.topMargin = this.f25754j;
        layoutParams.leftMargin = this.f25753i;
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.f25756l.mo63536v();
    }

    public C10375a getDynamicClickListener() {
        return this.f25758n.getDynamicClickListener();
    }

    /* access modifiers changed from: protected */
    public Drawable getBackgroundDrawable() {
        return mo63619a(false, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo63619a(boolean z, String str) {
        int i;
        if (!TextUtils.isEmpty(this.f25756l.mo63539y())) {
            try {
                String y = this.f25756l.mo63539y();
                String[] split = y.substring(y.indexOf("(") + 1, y.length() - 1).split(", ");
                GradientDrawable a = mo63621a(mo63620a(split[0]), new int[]{C10350g.m30042a(split[1].substring(0, 7)), C10350g.m30042a(split[2].substring(0, 7))});
                a.setShape(0);
                a.setCornerRadius(C10305b.m29747a(this.f25755k, this.f25756l.mo63529o()));
                return a;
            } catch (Exception unused) {
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        drawable.setCornerRadius(C10305b.m29747a(this.f25755k, this.f25756l.mo63529o()));
        if (z) {
            i = Color.parseColor(str);
        } else {
            i = this.f25756l.mo63537w();
        }
        drawable.setColor(i);
        if (this.f25756l.mo63531q() > 0.0f) {
            drawable.setStroke((int) C10305b.m29747a(this.f25755k, this.f25756l.mo63531q()), this.f25756l.mo63530p());
        } else if (this.f25756l.mo63532r() > 0) {
            drawable.setStroke(this.f25756l.mo63532r(), this.f25756l.mo63530p());
            drawable.setAlpha(50);
        }
        return drawable;
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable mo63621a(GradientDrawable.Orientation orientation, int[] iArr) {
        return new GradientDrawable(orientation, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable.Orientation mo63620a(String str) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, str.length() - 3));
            if (parseInt <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25762r.mo63311a(canvas, (C10341b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C10340a aVar = this.f25762r;
        View view = this.f25759o;
        if (view == null) {
            view = this;
        }
        aVar.mo63312a(view, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo63628g();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo63284b();
        super.onDetachedFromWindow();
    }

    /* renamed from: g */
    public void mo63628g() {
        if (!mo63607a()) {
            View view = this.f25759o;
            if (view == null) {
                view = this;
            }
            C10323b bVar = new C10323b(view, this.f25757m.mo63563i().mo63363e().mo63402ac());
            this.f25761q = bVar;
            bVar.mo63283a();
        }
    }

    /* renamed from: b */
    public void mo63284b() {
        C10323b bVar = this.f25761q;
        if (bVar != null) {
            bVar.mo63284b();
        }
    }

    /* renamed from: a */
    private boolean mo63607a() {
        C10351h hVar = this.f25757m;
        return hVar == null || hVar.mo63563i() == null || this.f25757m.mo63563i().mo63363e() == null || this.f25757m.mo63563i().mo63363e().mo63402ac() == null;
    }

    public int getDynamicWidth() {
        return this.f25751g;
    }

    public int getDynamicHeight() {
        return this.f25752h;
    }

    public C10349f getDynamicLayoutBrickValue() {
        C10348e i;
        C10351h hVar = this.f25757m;
        if (hVar == null || (i = hVar.mo63563i()) == null) {
            return null;
        }
        return i.mo63363e();
    }
}
