package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.explorestack.iab.mraid.C1361g;
import com.explorestack.iab.mraid.MraidLog;

/* renamed from: com.explorestack.iab.utils.m */
public class C1406m {

    /* renamed from: o */
    public static final String f4334o = "m";

    /* renamed from: a */
    public final Rect f4335a;

    /* renamed from: b */
    public final Rect f4336b;

    /* renamed from: c */
    public final Context f4337c;

    /* renamed from: d */
    public final View f4338d;

    /* renamed from: e */
    public final C1410d f4339e;

    /* renamed from: f */
    public final float f4340f;

    /* renamed from: g */
    public ViewTreeObserver.OnPreDrawListener f4341g;

    /* renamed from: h */
    public View.OnAttachStateChangeListener f4342h;

    /* renamed from: i */
    public boolean f4343i;

    /* renamed from: j */
    public boolean f4344j;

    /* renamed from: k */
    public boolean f4345k;

    /* renamed from: l */
    public boolean f4346l;

    /* renamed from: m */
    public boolean f4347m;

    /* renamed from: n */
    public final Runnable f4348n;

    /* renamed from: com.explorestack.iab.utils.m$a */
    public class C1407a implements Runnable {
        public C1407a() {
        }

        public void run() {
            C1406m.this.mo4141a();
            boolean unused = C1406m.this.f4345k = false;
        }
    }

    /* renamed from: com.explorestack.iab.utils.m$b */
    public class C1408b implements ViewTreeObserver.OnPreDrawListener {
        public C1408b() {
        }

        public boolean onPreDraw() {
            C1406m.this.mo4147d();
            return true;
        }
    }

    /* renamed from: com.explorestack.iab.utils.m$c */
    public class C1409c implements View.OnAttachStateChangeListener {
        public C1409c() {
        }

        public void onViewAttachedToWindow(View view) {
            C1406m.this.mo4141a();
        }

        public void onViewDetachedFromWindow(View view) {
            C1406m.this.mo4141a();
        }
    }

    /* renamed from: com.explorestack.iab.utils.m$d */
    public interface C1410d {
        /* renamed from: a */
        void mo3921a(boolean z);
    }

    public C1406m(Context context, View view, C1410d dVar) {
        this(context, view, dVar, 0.1f);
    }

    public C1406m(Context context, View view, C1410d dVar, float f) {
        this.f4335a = new Rect();
        this.f4336b = new Rect();
        this.f4343i = false;
        this.f4344j = false;
        this.f4345k = false;
        this.f4346l = false;
        this.f4347m = false;
        this.f4348n = new C1407a();
        this.f4337c = context;
        this.f4338d = view;
        this.f4339e = dVar;
        this.f4340f = f;
    }

    /* renamed from: a */
    public final void mo4141a() {
        try {
            if (this.f4338d.getVisibility() != 0) {
                mo4143a(this.f4338d, "Visibility != View.VISIBLE");
            } else if (this.f4338d.getParent() == null) {
                mo4143a(this.f4338d, "No parent");
            } else if (!this.f4338d.getGlobalVisibleRect(this.f4335a)) {
                mo4143a(this.f4338d, "Can't get global visible rect");
            } else if (Utils.isViewTransparent(this.f4338d)) {
                mo4143a(this.f4338d, "View is transparent (alpha = 0)");
            } else {
                float width = (float) (this.f4338d.getWidth() * this.f4338d.getHeight());
                if (width <= 0.0f) {
                    mo4143a(this.f4338d, "Ad View width or height is zero, show wasn't tracked");
                    return;
                }
                float width2 = ((float) (this.f4335a.width() * this.f4335a.height())) / width;
                if (width2 < this.f4340f) {
                    View view = this.f4338d;
                    mo4143a(view, "Ad View is not completely visible (" + width2 + "), show wasn't tracked");
                    return;
                }
                View a = C1361g.m6109a(this.f4337c, this.f4338d);
                if (a == null) {
                    mo4143a(this.f4338d, "Can't obtain root view");
                    return;
                }
                a.getGlobalVisibleRect(this.f4336b);
                if (!Rect.intersects(this.f4335a, this.f4336b)) {
                    mo4143a(this.f4338d, "Ad View is out of current window, show wasn't tracked");
                    return;
                }
                mo4142a(this.f4338d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo4142a(View view) {
        this.f4344j = false;
        mo4144a(true);
    }

    /* renamed from: a */
    public final void mo4143a(View view, String str) {
        if (!this.f4344j) {
            this.f4344j = true;
            MraidLog.m5985d(f4334o, str);
        }
        mo4144a(false);
    }

    /* renamed from: a */
    public final void mo4144a(boolean z) {
        if (this.f4343i != z) {
            this.f4343i = z;
            this.f4339e.mo3921a(z);
        }
    }

    /* renamed from: b */
    public boolean mo4145b() {
        return this.f4343i;
    }

    /* renamed from: c */
    public void mo4146c() {
        this.f4347m = true;
        this.f4346l = false;
        this.f4345k = false;
        this.f4338d.getViewTreeObserver().removeOnPreDrawListener(this.f4341g);
        this.f4338d.removeOnAttachStateChangeListener(this.f4342h);
        Utils.cancelOnUiThread(this.f4348n);
    }

    /* renamed from: d */
    public final void mo4147d() {
        if (!this.f4345k) {
            this.f4345k = true;
            Utils.onUiThread(this.f4348n, 100);
        }
    }

    /* renamed from: e */
    public void mo4148e() {
        if (!this.f4347m && !this.f4346l) {
            this.f4346l = true;
            if (this.f4341g == null) {
                this.f4341g = new C1408b();
            }
            if (this.f4342h == null) {
                this.f4342h = new C1409c();
            }
            this.f4338d.getViewTreeObserver().addOnPreDrawListener(this.f4341g);
            this.f4338d.addOnAttachStateChangeListener(this.f4342h);
            mo4141a();
        }
    }
}
