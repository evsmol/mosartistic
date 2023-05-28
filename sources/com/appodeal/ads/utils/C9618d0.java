package com.appodeal.ads.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.C9618d0;
import com.appodeal.ads.utils.Log;
import java.util.HashMap;

/* renamed from: com.appodeal.ads.utils.d0 */
public final class C9618d0 {

    /* renamed from: a */
    public static final HashMap f24378a = new HashMap();

    /* renamed from: b */
    public static final Handler f24379b = new Handler(Looper.getMainLooper());

    /* renamed from: com.appodeal.ads.utils.d0$b */
    public interface C9621b {
        /* renamed from: a */
        void mo60131a();

        /* renamed from: b */
        void mo60132b();
    }

    /* renamed from: a */
    public static void m28372a(Object obj) {
        HashMap hashMap = f24378a;
        synchronized (hashMap) {
            C9619a aVar = (C9619a) hashMap.get(obj);
            if (aVar != null) {
                aVar.mo61078b();
                hashMap.remove(obj);
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.d0$a */
    public static class C9619a {

        /* renamed from: a */
        public final Rect f24380a = new Rect();

        /* renamed from: b */
        public final View f24381b;

        /* renamed from: c */
        public final long f24382c;

        /* renamed from: d */
        public final float f24383d;

        /* renamed from: e */
        public final C9621b f24384e;

        /* renamed from: f */
        public ViewTreeObserver.OnPreDrawListener f24385f;

        /* renamed from: g */
        public C9620a f24386g;

        /* renamed from: h */
        public long f24387h;

        /* renamed from: i */
        public boolean f24388i;

        /* renamed from: j */
        public boolean f24389j;

        /* renamed from: k */
        public boolean f24390k;

        /* renamed from: l */
        public boolean f24391l = true;

        /* renamed from: m */
        public boolean f24392m = false;

        /* renamed from: n */
        public final Runnable f24393n = new Runnable() {
            public final void run() {
                C9618d0.C9619a.this.mo61078b();
            }
        };

        /* renamed from: com.appodeal.ads.utils.d0$a$a */
        public class C9620a implements View.OnAttachStateChangeListener {
            public C9620a() {
            }

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
                C9619a.this.mo61078b();
            }
        }

        public C9619a(View view, long j, C9621b bVar) {
            this.f24381b = view;
            this.f24382c = j;
            this.f24383d = 0.8f;
            this.f24384e = bVar;
        }

        /* renamed from: a */
        public static float m28373a(Rect rect, Rect rect2) {
            int height = rect.height() * rect.width();
            if (height == 0) {
                return 0.0f;
            }
            return ((float) (height - (Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left))))) / ((float) height);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ boolean m28374a() {
            this.f24391l = false;
            mo61076a(this.f24381b, this.f24383d);
            return true;
        }

        /* renamed from: a */
        public final void mo61076a(View view, float f) {
            try {
                ViewGroup viewGroup = view;
                if (!viewGroup.getGlobalVisibleRect(this.f24380a)) {
                    mo61077a("Show wasn't tracked: ad not visible globally");
                } else if (!view.isShown()) {
                    mo61077a("Show wasn't tracked: ad not shown on view");
                } else if (C9326n5.m27549b(view)) {
                    mo61077a("Show wasn't tracked: ad is transparent ");
                } else if (!view.hasWindowFocus()) {
                    mo61077a("Show wasn't tracked: ad hasn't window focus");
                } else {
                    Activity activity = C9148b.f22956b.f22957a.getActivity();
                    View findViewById = activity != null ? activity.findViewById(16908290) : null;
                    if (findViewById == null) {
                        mo61077a("Activity content layout not found, is your activity running?");
                        return;
                    }
                    Rect rect = new Rect();
                    findViewById.getGlobalVisibleRect(rect);
                    if (!Rect.intersects(this.f24380a, rect)) {
                        mo61077a("Ad View is out of current window, show wasn't tracked");
                        return;
                    }
                    float width = (float) (view.getWidth() * view.getHeight());
                    if (width == 0.0f) {
                        mo61077a("Ad View width or height is zero, show wasn't tracked");
                        return;
                    }
                    float width2 = ((float) (this.f24380a.width() * this.f24380a.height())) / width;
                    if (width2 < f) {
                        mo61077a("Ad View is not completely visible (" + width2 + "), show wasn't tracked");
                        return;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view.getRootView();
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    int i = 0;
                    while (viewGroup3 != null) {
                        for (int indexOfChild = viewGroup3.indexOfChild(viewGroup) + 1; indexOfChild < viewGroup3.getChildCount(); indexOfChild++) {
                            View childAt = viewGroup3.getChildAt(indexOfChild);
                            if (childAt.getVisibility() == 0) {
                                childAt.getLocationInWindow(new int[2]);
                                Rect a = C9326n5.m27527a(childAt);
                                if (Rect.intersects(this.f24380a, a)) {
                                    float a2 = m28373a(this.f24380a, a);
                                    String valueOf = String.valueOf(childAt.getId());
                                    try {
                                        valueOf = viewGroup.getContext().getResources().getResourceEntryName(childAt.getId());
                                    } catch (Exception unused) {
                                    }
                                    Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_VIEWABILITY, String.format("Ad view is overlapped by another visible view (type: %s, id: %s), visible percent: %s", new Object[]{childAt.getClass().getSimpleName(), valueOf, Float.valueOf(a2)}), Log.LogLevel.verbose);
                                    if (a2 < f) {
                                        mo61077a("Ad View is covered by another view, show wasn't tracked");
                                        return;
                                    }
                                    i++;
                                    if (i >= 3) {
                                        mo61077a("Ad View is covered by too many views, show wasn't tracked");
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (viewGroup3 != viewGroup2) {
                            ViewGroup viewGroup4 = viewGroup3;
                            viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            viewGroup = viewGroup4;
                        } else {
                            viewGroup3 = null;
                        }
                    }
                    if (!this.f24388i) {
                        this.f24384e.mo60131a();
                        this.f24388i = true;
                    }
                    if (!this.f24390k && !this.f24389j) {
                        C9618d0.f24379b.postDelayed(this.f24393n, this.f24382c);
                        this.f24387h = System.currentTimeMillis();
                        this.f24390k = true;
                    }
                }
            } catch (Exception e) {
                Log.log(e);
            }
        }

        /* renamed from: b */
        public final void mo61078b() {
            if (this.f24388i && !this.f24389j && this.f24382c > -1 && this.f24387h > 0 && System.currentTimeMillis() - this.f24387h >= this.f24382c) {
                this.f24389j = true;
                this.f24384e.mo60132b();
            }
            this.f24381b.removeOnAttachStateChangeListener(this.f24386g);
            this.f24381b.getViewTreeObserver().removeOnPreDrawListener(this.f24385f);
            C9618d0.f24379b.removeCallbacks(this.f24393n);
            HashMap hashMap = C9618d0.f24378a;
            synchronized (hashMap) {
                hashMap.remove(this);
            }
        }

        /* renamed from: c */
        public final void mo61079c() {
            if (this.f24385f == null) {
                this.f24385f = new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        return C9618d0.C9619a.this.m28374a();
                    }
                };
            }
            if (this.f24386g == null) {
                this.f24386g = new C9620a();
            }
            this.f24381b.addOnAttachStateChangeListener(this.f24386g);
            this.f24381b.getViewTreeObserver().addOnPreDrawListener(this.f24385f);
            mo61076a(this.f24381b, this.f24383d);
        }

        /* renamed from: a */
        public final void mo61077a(String str) {
            if (this.f24391l) {
                this.f24391l = false;
            } else if (!this.f24392m) {
                this.f24392m = true;
                Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_VIEWABILITY, str, Log.LogLevel.verbose);
            }
            if (!this.f24389j) {
                C9618d0.f24379b.removeCallbacks(this.f24393n);
                this.f24390k = false;
                this.f24387h = 0;
            }
        }
    }
}
