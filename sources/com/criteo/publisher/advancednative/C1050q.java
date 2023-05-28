package com.criteo.publisher.advancednative;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.criteo.publisher.advancednative.q */
/* compiled from: VisibilityTracker */
public class C1050q {

    /* renamed from: a */
    private final C1048o f3449a;

    /* renamed from: b */
    private final Map<View, C1051a> f3450b = new WeakHashMap();

    /* renamed from: c */
    private final Object f3451c = new Object();

    public C1050q(C1048o oVar) {
        this.f3449a = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3064a(View view, C1049p pVar) {
        C1051a aVar;
        synchronized (this.f3451c) {
            aVar = this.f3450b.get(view);
            if (aVar == null) {
                aVar = m4917a(view);
                this.f3450b.put(view, aVar);
            }
        }
        aVar.mo3065a(pVar);
    }

    /* renamed from: a */
    private C1051a m4917a(View view) {
        return new C1051a(new WeakReference(view), this.f3449a);
    }

    /* renamed from: com.criteo.publisher.advancednative.q$a */
    /* compiled from: VisibilityTracker */
    static class C1051a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        private final Reference<View> f3452a;

        /* renamed from: b */
        private final C1048o f3453b;

        /* renamed from: c */
        private volatile C1049p f3454c = null;

        C1051a(Reference<View> reference, C1048o oVar) {
            this.f3452a = reference;
            this.f3453b = oVar;
            m4919a();
        }

        /* renamed from: a */
        private void m4919a() {
            View view = this.f3452a.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3065a(C1049p pVar) {
            this.f3454c = pVar;
        }

        public boolean onPreDraw() {
            if (!m4920b()) {
                return true;
            }
            m4921c();
            return true;
        }

        /* renamed from: b */
        private boolean m4920b() {
            View view = this.f3452a.get();
            if (view == null) {
                return false;
            }
            return this.f3453b.mo3063a(view);
        }

        /* renamed from: c */
        private void m4921c() {
            C1049p pVar = this.f3454c;
            if (pVar != null) {
                pVar.mo3061a();
            }
        }
    }
}
