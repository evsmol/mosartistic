package com.explorestack.iab.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.explorestack.iab.utils.C1392d;
import com.explorestack.iab.utils.C1393e;
import com.explorestack.iab.utils.IabElementStyle;

/* renamed from: com.explorestack.iab.view.a */
public class C1475a extends FrameLayout {

    /* renamed from: a */
    public final C1478c f4667a = new C1478c((C1476a) null);

    /* renamed from: b */
    public C1392d f4668b;

    /* renamed from: c */
    public C1393e f4669c;

    /* renamed from: d */
    public C1477b f4670d;

    /* renamed from: e */
    public C1479d f4671e;

    /* renamed from: f */
    public IabElementStyle f4672f;

    /* renamed from: g */
    public IabElementStyle f4673g;

    /* renamed from: com.explorestack.iab.view.a$a */
    public class C1476a implements View.OnClickListener {
        public C1476a() {
        }

        public void onClick(View view) {
            if (C1475a.this.f4671e != null) {
                C1475a.this.f4671e.onCloseClick();
            }
        }
    }

    /* renamed from: com.explorestack.iab.view.a$b */
    public class C1477b implements Runnable {
        private C1477b() {
        }

        public /* synthetic */ C1477b(C1475a aVar, C1476a aVar2) {
            this();
        }

        public void run() {
            if (C1475a.this.f4669c != null) {
                long c = C1475a.this.f4667a.f4679d;
                if (C1475a.this.isShown()) {
                    c += 50;
                    C1475a.this.f4667a.mo4577a(c);
                    C1475a.this.f4669c.mo4107a((int) ((100 * c) / C1475a.this.f4667a.f4678c), (int) Math.ceil(((double) (C1475a.this.f4667a.f4678c - c)) / 1000.0d));
                }
                int i = (c > C1475a.this.f4667a.f4678c ? 1 : (c == C1475a.this.f4667a.f4678c ? 0 : -1));
                C1475a aVar = C1475a.this;
                if (i >= 0) {
                    aVar.mo4567c();
                    if (C1475a.this.f4667a.f4677b > 0.0f && C1475a.this.f4671e != null) {
                        C1475a.this.f4671e.onCountDownFinish();
                        return;
                    }
                    return;
                }
                aVar.postDelayed(this, 50);
            }
        }
    }

    /* renamed from: com.explorestack.iab.view.a$c */
    public static class C1478c {

        /* renamed from: a */
        public boolean f4676a;

        /* renamed from: b */
        public float f4677b;

        /* renamed from: c */
        public long f4678c;

        /* renamed from: d */
        public long f4679d;

        /* renamed from: e */
        public long f4680e;

        /* renamed from: f */
        public long f4681f;

        private C1478c() {
            this.f4676a = false;
            this.f4677b = 0.0f;
            this.f4678c = 0;
            this.f4679d = 0;
            this.f4680e = 0;
            this.f4681f = 0;
        }

        public /* synthetic */ C1478c(C1476a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo4577a(long j) {
            this.f4679d = j;
        }

        /* renamed from: a */
        public final void mo4578a(boolean z) {
            if (this.f4680e > 0) {
                this.f4681f += System.currentTimeMillis() - this.f4680e;
            }
            if (z) {
                this.f4680e = System.currentTimeMillis();
            } else {
                this.f4680e = 0;
            }
        }

        /* renamed from: a */
        public void mo4579a(boolean z, float f) {
            this.f4676a = z;
            this.f4677b = f;
            this.f4678c = (long) (f * 1000.0f);
            this.f4679d = 0;
        }

        /* renamed from: a */
        public boolean mo4580a() {
            long j = this.f4678c;
            return j == 0 || this.f4679d >= j;
        }

        /* renamed from: b */
        public long mo4581b() {
            return this.f4680e > 0 ? System.currentTimeMillis() - this.f4680e : this.f4681f;
        }

        /* renamed from: c */
        public boolean mo4582c() {
            long j = this.f4678c;
            return j != 0 && this.f4679d < j;
        }

        /* renamed from: d */
        public boolean mo4583d() {
            return this.f4676a;
        }
    }

    /* renamed from: com.explorestack.iab.view.a$d */
    public interface C1479d {
        void onCloseClick();

        void onCountDownFinish();
    }

    public C1475a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo4564a() {
        if (isShown()) {
            mo4566b();
            C1477b bVar = new C1477b(this, (C1476a) null);
            this.f4670d = bVar;
            postDelayed(bVar, 50);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C1392d dVar = this.f4668b;
        if (dVar != null) {
            dVar.mo4111a();
        }
        C1393e eVar = this.f4669c;
        if (eVar != null) {
            eVar.mo4111a();
        }
    }

    /* renamed from: b */
    public final void mo4566b() {
        C1477b bVar = this.f4670d;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f4670d = null;
        }
    }

    /* renamed from: c */
    public final void mo4567c() {
        if (this.f4667a.mo4582c()) {
            C1392d dVar = this.f4668b;
            if (dVar != null) {
                dVar.mo4117c();
            }
            if (this.f4669c == null) {
                this.f4669c = new C1393e((View.OnClickListener) null);
            }
            this.f4669c.mo4113a(getContext(), (ViewGroup) this, this.f4673g);
            mo4564a();
            return;
        }
        mo4566b();
        if (this.f4668b == null) {
            this.f4668b = new C1392d(new C1476a());
        }
        this.f4668b.mo4113a(getContext(), (ViewGroup) this, this.f4672f);
        C1393e eVar = this.f4669c;
        if (eVar != null) {
            eVar.mo4117c();
        }
    }

    public boolean canBeClosed() {
        return this.f4667a.mo4580a();
    }

    public long getOnScreenTimeMs() {
        return this.f4667a.mo4581b();
    }

    public boolean isVisible() {
        return this.f4667a.mo4583d();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo4566b();
        } else if (this.f4667a.mo4582c() && this.f4667a.mo4583d()) {
            mo4564a();
        }
        this.f4667a.mo4578a(i == 0);
    }

    public void setCloseClickListener(C1479d dVar) {
        this.f4671e = dVar;
    }

    public void setCloseStyle(IabElementStyle iabElementStyle) {
        this.f4672f = iabElementStyle;
        C1392d dVar = this.f4668b;
        if (dVar != null && dVar.mo4119e()) {
            this.f4668b.mo4113a(getContext(), (ViewGroup) this, iabElementStyle);
        }
    }

    public void setCloseVisibility(boolean z, float f) {
        if (this.f4667a.f4676a != z || this.f4667a.f4677b != f) {
            this.f4667a.mo4579a(z, f);
            if (!z) {
                C1392d dVar = this.f4668b;
                if (dVar != null) {
                    dVar.mo4117c();
                }
                C1393e eVar = this.f4669c;
                if (eVar != null) {
                    eVar.mo4117c();
                }
                mo4566b();
                return;
            }
            mo4567c();
        }
    }

    public void setCountDownStyle(IabElementStyle iabElementStyle) {
        this.f4673g = iabElementStyle;
        C1393e eVar = this.f4669c;
        if (eVar != null && eVar.mo4119e()) {
            this.f4669c.mo4113a(getContext(), (ViewGroup) this, iabElementStyle);
        }
    }
}
