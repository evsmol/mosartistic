package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.mediation.p234a.C8071b;
import com.applovin.impl.mediation.p234a.C8073d;
import com.applovin.impl.mediation.p234a.C8075e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.z */
public class C8631z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8626v f21797a;

    /* renamed from: b */
    private final Object f21798b = new Object();

    /* renamed from: c */
    private final Rect f21799c = new Rect();

    /* renamed from: d */
    private final Handler f21800d;

    /* renamed from: e */
    private final Runnable f21801e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f21802f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<View> f21803g;

    /* renamed from: h */
    private final long f21804h;

    /* renamed from: i */
    private WeakReference<ViewTreeObserver> f21805i = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public WeakReference<View> f21806j = new WeakReference<>((Object) null);

    /* renamed from: k */
    private int f21807k;

    /* renamed from: l */
    private float f21808l;

    /* renamed from: m */
    private float f21809m;

    /* renamed from: n */
    private long f21810n;

    /* renamed from: o */
    private long f21811o = Long.MIN_VALUE;

    /* renamed from: com.applovin.impl.sdk.z$a */
    public interface C8634a {
        void onLogVisibilityImpression();
    }

    public C8631z(final View view, C8490n nVar, C8634a aVar) {
        this.f21797a = nVar.mo57320D();
        this.f21804h = ((Long) nVar.mo57342a(C8380b.f20831cb)).longValue();
        this.f21800d = new Handler(Looper.getMainLooper());
        this.f21803g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f21801e = new Runnable() {
            public void run() {
                View view = (View) C8631z.this.f21803g.get();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                View view2 = (View) C8631z.this.f21806j.get();
                if (viewGroup != null && view2 != null) {
                    if (C8631z.this.m26284b(viewGroup, view2)) {
                        C8626v unused = C8631z.this.f21797a;
                        if (C8626v.m26252a()) {
                            C8631z.this.f21797a.mo57818b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                        }
                        C8631z.this.mo57832a();
                        C8634a aVar = (C8634a) weakReference.get();
                        if (aVar != null) {
                            aVar.onLogVisibilityImpression();
                            return;
                        }
                        return;
                    }
                    C8631z.this.m26282b();
                }
            }
        };
        this.f21802f = new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                C8631z.this.m26282b();
                C8631z.this.m26283b(view);
                return true;
            }
        };
    }

    /* renamed from: a */
    private void m26277a(View view) {
        View rootView = Utils.getRootView((View) this.f21803g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView != null) {
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f21805i = new WeakReference<>(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f21802f);
            } else if (C8626v.m26252a()) {
                this.f21797a.mo57821d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else if (C8626v.m26252a()) {
            this.f21797a.mo57818b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
        }
    }

    /* renamed from: a */
    private boolean m26279a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f21799c)) {
            return false;
        }
        long pxToDp = (long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f21799c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f21799c.height()));
        if (pxToDp < ((long) this.f21807k)) {
            return false;
        }
        if ((((float) pxToDp) / ((float) ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))))) * 100.0f < this.f21808l) {
            return false;
        }
        return (((float) ((long) (this.f21799c.width() * this.f21799c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f21809m;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26282b() {
        this.f21800d.postDelayed(this.f21801e, this.f21804h);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26283b(View view) {
        C8626v vVar;
        String str;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f21805i.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            if (view != null) {
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(this.f21802f);
                } else if (C8626v.m26252a()) {
                    vVar = this.f21797a;
                    str = "Could not remove on pre-draw listener. View tree observer is not alive.";
                }
            } else if (C8626v.m26252a()) {
                vVar = this.f21797a;
                str = "Could not remove on pre-draw listener. Root view is null.";
            }
            vVar.mo57818b("VisibilityTracker", str);
        } else {
            viewTreeObserver.removeOnPreDrawListener(this.f21802f);
        }
        this.f21805i.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m26284b(View view, View view2) {
        if (!m26279a(view, view2)) {
            return false;
        }
        if (this.f21811o == Long.MIN_VALUE) {
            this.f21811o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f21811o >= this.f21810n;
    }

    /* renamed from: a */
    public void mo57832a() {
        synchronized (this.f21798b) {
            this.f21800d.removeMessages(0);
            m26283b((View) this.f21803g.get());
            this.f21811o = Long.MIN_VALUE;
            this.f21806j.clear();
        }
    }

    /* renamed from: a */
    public void mo57833a(C8075e eVar) {
        WeakReference<View> weakReference;
        synchronized (this.f21798b) {
            if (C8626v.m26252a()) {
                this.f21797a.mo57818b("VisibilityTracker", "Tracking Visibility...");
            }
            mo57832a();
            if (eVar instanceof C8071b) {
                weakReference = new WeakReference<>(((C8071b) eVar).mo56095o());
            } else if (eVar instanceof C8073d) {
                weakReference = new WeakReference<>(((C8073d) eVar).mo56113z());
            } else {
                return;
            }
            this.f21806j = weakReference;
            this.f21807k = eVar.mo56144K();
            this.f21808l = eVar.mo56145L();
            this.f21809m = eVar.mo56146M();
            this.f21810n = eVar.mo56148O();
            m26277a((View) this.f21806j.get());
        }
    }
}
