package com.explorestack.iab.mraid;

import android.view.View;
import android.view.ViewTreeObserver;
import com.explorestack.iab.utils.Utils;

/* renamed from: com.explorestack.iab.mraid.k */
public class C1374k {

    /* renamed from: a */
    public C1375a f4220a;

    /* renamed from: com.explorestack.iab.mraid.k$a */
    public static class C1375a {

        /* renamed from: a */
        public final View[] f4221a;

        /* renamed from: b */
        public Runnable f4222b;

        /* renamed from: c */
        public int f4223c;

        /* renamed from: d */
        public final Runnable f4224d = new C1376a();

        /* renamed from: com.explorestack.iab.mraid.k$a$a */
        public class C1376a implements Runnable {

            /* renamed from: com.explorestack.iab.mraid.k$a$a$a */
            public class C1377a implements ViewTreeObserver.OnPreDrawListener {

                /* renamed from: a */
                public final /* synthetic */ View f4226a;

                public C1377a(View view) {
                    this.f4226a = view;
                }

                public boolean onPreDraw() {
                    this.f4226a.getViewTreeObserver().removeOnPreDrawListener(this);
                    C1375a.this.mo3963b();
                    return true;
                }
            }

            public C1376a() {
            }

            public void run() {
                for (View view : C1375a.this.f4221a) {
                    if (view.getHeight() > 0 || view.getWidth() > 0) {
                        C1375a.this.mo3963b();
                    } else {
                        view.getViewTreeObserver().addOnPreDrawListener(new C1377a(view));
                    }
                }
            }
        }

        public C1375a(View[] viewArr) {
            this.f4221a = viewArr;
        }

        /* renamed from: a */
        public void mo3961a() {
            Utils.cancelOnUiThread(this.f4224d);
            this.f4222b = null;
        }

        /* renamed from: a */
        public void mo3962a(Runnable runnable) {
            this.f4222b = runnable;
            this.f4223c = this.f4221a.length;
            Utils.postOnUiThread(this.f4224d);
        }

        /* renamed from: b */
        public void mo3963b() {
            Runnable runnable;
            int i = this.f4223c - 1;
            this.f4223c = i;
            if (i == 0 && (runnable = this.f4222b) != null) {
                runnable.run();
                this.f4222b = null;
            }
        }
    }

    /* renamed from: a */
    public C1375a mo3959a(View... viewArr) {
        mo3960a();
        C1375a aVar = new C1375a(viewArr);
        this.f4220a = aVar;
        return aVar;
    }

    /* renamed from: a */
    public void mo3960a() {
        C1375a aVar = this.f4220a;
        if (aVar != null) {
            aVar.mo3961a();
            this.f4220a = null;
        }
    }
}
