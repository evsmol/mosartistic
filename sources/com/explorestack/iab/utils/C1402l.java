package com.explorestack.iab.utils;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.explorestack.iab.utils.l */
public class C1402l {

    /* renamed from: a */
    public final View f4324a;

    /* renamed from: b */
    public final C1405c f4325b;

    /* renamed from: c */
    public boolean f4326c = false;

    /* renamed from: d */
    public float f4327d = 0.0f;

    /* renamed from: e */
    public long f4328e = 0;

    /* renamed from: f */
    public long f4329f = 0;

    /* renamed from: g */
    public final ViewTreeObserver.OnGlobalLayoutListener f4330g;

    /* renamed from: h */
    public final Runnable f4331h;

    /* renamed from: com.explorestack.iab.utils.l$a */
    public class C1403a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C1403a() {
        }

        public void onGlobalLayout() {
            C1402l.this.mo4136c();
        }
    }

    /* renamed from: com.explorestack.iab.utils.l$b */
    public class C1404b implements Runnable {
        public C1404b() {
        }

        public void run() {
            long b = C1402l.this.f4329f;
            if (C1402l.this.f4324a.isShown()) {
                b = Math.min(C1402l.this.f4328e, b + 16);
                C1402l.this.mo4134a(b);
                C1402l.this.f4325b.mo3868a((((float) C1402l.this.f4329f) * 100.0f) / ((float) C1402l.this.f4328e), C1402l.this.f4329f, C1402l.this.f4328e);
            }
            int i = (b > C1402l.this.f4328e ? 1 : (b == C1402l.this.f4328e ? 0 : -1));
            C1402l lVar = C1402l.this;
            if (i >= 0) {
                lVar.f4325b.mo3867a();
            } else {
                lVar.f4324a.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: com.explorestack.iab.utils.l$c */
    public interface C1405c {
        /* renamed from: a */
        void mo3867a();

        /* renamed from: a */
        void mo3868a(float f, long j, long j2);
    }

    public C1402l(View view, C1405c cVar) {
        C1403a aVar = new C1403a();
        this.f4330g = aVar;
        this.f4331h = new C1404b();
        this.f4324a = view;
        this.f4325b = cVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        mo4136c();
    }

    /* renamed from: a */
    public void mo4132a() {
        mo4138e();
        this.f4324a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f4330g);
    }

    /* renamed from: a */
    public void mo4133a(float f) {
        if (this.f4327d != f) {
            this.f4327d = f;
            this.f4328e = (long) (f * 1000.0f);
            mo4137d();
        }
    }

    /* renamed from: a */
    public final void mo4134a(long j) {
        this.f4329f = j;
    }

    /* renamed from: b */
    public boolean mo4135b() {
        long j = this.f4328e;
        return j != 0 && this.f4329f < j;
    }

    /* renamed from: c */
    public final void mo4136c() {
        boolean isShown = this.f4324a.isShown();
        if (this.f4326c != isShown) {
            this.f4326c = isShown;
            if (!isShown) {
                mo4138e();
            } else if (mo4135b()) {
                mo4137d();
            }
        }
    }

    /* renamed from: d */
    public void mo4137d() {
        if (this.f4324a.isShown() && this.f4328e != 0) {
            this.f4324a.postDelayed(this.f4331h, 16);
        }
    }

    /* renamed from: e */
    public void mo4138e() {
        this.f4324a.removeCallbacks(this.f4331h);
    }
}
