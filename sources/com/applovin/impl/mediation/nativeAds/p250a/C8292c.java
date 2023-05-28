package com.applovin.impl.mediation.nativeAds.p250a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.mediation.nativeAds.a.c */
public class C8292c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakHashMap<View, Integer> f20383a = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f20384b = new Object();

    /* renamed from: c */
    private final Handler f20385c = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f20386d = false;

    /* renamed from: e */
    private final WeakReference<View> f20387e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f20388f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8295a f20389g;

    /* renamed from: com.applovin.impl.mediation.nativeAds.a.c$a */
    public interface C8295a {
        /* renamed from: a */
        void mo56714a(int i, int i2);
    }

    public C8292c(View view) {
        this.f20387e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            C82931 r0 = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    C8292c.this.m24876b();
                    return true;
                }
            };
            this.f20388f = r0;
            viewTreeObserver.addOnPreDrawListener(r0);
            return;
        }
        this.f20388f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24876b() {
        if (!this.f20386d) {
            this.f20386d = true;
            this.f20385c.postDelayed(new Runnable() {
                public void run() {
                    synchronized (C8292c.this.f20384b) {
                        boolean unused = C8292c.this.f20386d = false;
                        int i = -1;
                        int i2 = -1;
                        for (Map.Entry entry : C8292c.this.f20383a.entrySet()) {
                            if (C8292c.this.m24877b((View) entry.getKey())) {
                                Integer num = (Integer) entry.getValue();
                                if (i == -1 && i2 == -1) {
                                    i = num.intValue();
                                    i2 = num.intValue();
                                } else {
                                    i = Math.min(i, ((Integer) entry.getValue()).intValue());
                                    i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                                }
                            }
                        }
                        if (C8292c.this.f20389g != null) {
                            C8292c.this.f20389g.mo56714a(i, i2);
                        }
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m24877b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* renamed from: a */
    public void mo56708a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f20389g = null;
        View view = (View) this.f20387e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f20388f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f20387e.clear();
        }
    }

    /* renamed from: a */
    public void mo56709a(View view) {
        synchronized (this.f20384b) {
            this.f20383a.remove(view);
        }
    }

    /* renamed from: a */
    public void mo56710a(View view, int i) {
        synchronized (this.f20384b) {
            this.f20383a.put(view, Integer.valueOf(i));
            m24876b();
        }
    }

    /* renamed from: a */
    public void mo56711a(C8295a aVar) {
        this.f20389g = aVar;
    }
}
