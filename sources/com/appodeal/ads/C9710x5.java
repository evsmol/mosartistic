package com.appodeal.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.C9391p;
import com.appodeal.ads.C9430r5;
import com.appodeal.ads.C9737z5;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.utils.C9609c;
import com.appodeal.ads.utils.C9618d0;
import com.appodeal.ads.utils.C9640o;
import com.appodeal.ads.utils.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.x5 */
public abstract class C9710x5<AdRequestType extends C9737z5<AdObjectType>, AdObjectType extends C9430r5<AdRequestType, ?, ?, ?>> extends C9391p<AdRequestType, AdObjectType, C9726y5> {

    /* renamed from: m */
    public static final Handler f24582m = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final String f24583a = getClass().getSimpleName();

    /* renamed from: b */
    public Integer f24584b;

    /* renamed from: c */
    public View f24585c;

    /* renamed from: d */
    public View f24586d;

    /* renamed from: e */
    public int f24587e = -1;

    /* renamed from: f */
    public C8998a f24588f;

    /* renamed from: g */
    public C8998a f24589g;

    /* renamed from: h */
    public WeakReference<Animator> f24590h;

    /* renamed from: i */
    public C9710x5<AdRequestType, AdObjectType>.c f24591i;

    /* renamed from: j */
    public boolean f24592j = true;

    /* renamed from: k */
    public final C9714d f24593k = new C9714d(0);

    /* renamed from: l */
    public final ConcurrentHashMap f24594l = new ConcurrentHashMap();

    /* renamed from: com.appodeal.ads.x5$a */
    public static class C9711a {
        public C9711a() {
        }

        public /* synthetic */ C9711a(int i) {
            this();
        }
    }

    /* renamed from: com.appodeal.ads.x5$b */
    public static class C9712b extends C9715e {

        /* renamed from: c */
        public final boolean f24595c;

        public C9712b(Activity activity, boolean z) {
            super(activity);
            this.f24595c = z;
        }

        /* renamed from: a */
        public final boolean mo61235a() {
            return !this.f24595c;
        }

        public final void onMeasure(int i, int i2) {
            int i3;
            int childCount = getChildCount();
            if (childCount == 0) {
                super.onMeasure(i, i2);
                return;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size, 0), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (this.f24595c) {
                    if (childAt.getMeasuredWidth() > size2) {
                        measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size2, RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(size, 0));
                    }
                    i4 = Math.max(i4, childAt.getMeasuredHeight());
                    i3 = childAt.getMeasuredWidth();
                } else {
                    i4 = Math.max(i4, childAt.getMeasuredWidth());
                    i3 = childAt.getMeasuredHeight();
                }
                i5 = Math.max(i5, i3);
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i4, getPaddingBottom() + getPaddingTop() + i5);
        }
    }

    /* renamed from: com.appodeal.ads.x5$c */
    public final class C9713c implements Runnable {

        /* renamed from: a */
        public final C9711a f24596a = new C9711a(0);

        /* renamed from: b */
        public final C9577u<AdObjectType, AdRequestType, ?> f24597b;

        public C9713c(C9577u<AdObjectType, AdRequestType, ?> uVar) {
            this.f24597b = uVar;
        }

        public final void run() {
            Activity activity;
            C9710x5 x5Var;
            View view;
            this.f24596a.getClass();
            if (!C9422r0.f23923l || (activity = C9326n5.m27544b()) == null) {
                activity = C9148b.f22956b.f22957a.getActivity();
            }
            if (activity == null) {
                Log.debug(C9710x5.this.f24583a, "Refresh", "skip: no running activities fund");
                C9710x5 x5Var2 = C9710x5.this;
                if (this == x5Var2.f24591i) {
                    x5Var2.f24591i = null;
                    return;
                }
                return;
            }
            C9714d a = C9710x5.this.mo61224a(activity);
            C9737z5 z5Var = (C9737z5) this.f24597b.mo60846f();
            boolean z = true;
            if (z5Var == null || (view = C9710x5.this.f24585c) == null || !view.isShown() || a.f24600b != C9181f0.VISIBLE) {
                C9710x5 x5Var3 = C9710x5.this;
                Log.debug(x5Var3.f24583a, "Refresh", String.format("skip: %s / %s / %s", new Object[]{a.f24600b, z5Var, x5Var3.f24585c}));
                x5Var = C9710x5.this;
                if (this != x5Var.f24591i) {
                    return;
                }
            } else {
                this.f24596a.getClass();
                if (C9609c.m28357a(C9326n5.m27544b())) {
                    Log.debug(C9710x5.this.f24583a, "Refresh", "postponed: ads activity is visible");
                    C9710x5.f24582m.postDelayed(this, 1000);
                    return;
                }
                String str = this.f24597b.mo60845e().f24090b;
                if (!z5Var.f23906u && !z5Var.f23907v && !z5Var.f23902q.containsKey(str)) {
                    z = false;
                }
                if (!z) {
                    Log.debug(C9710x5.this.f24583a, "Refresh", "skip: current ad request hasn't any loaded ad");
                    x5Var = C9710x5.this;
                    if (this != x5Var.f24591i) {
                        return;
                    }
                } else {
                    Log.debug(C9710x5.this.f24583a, "Refresh", "requesting render");
                    C9710x5 x5Var4 = C9710x5.this;
                    if (this == x5Var4.f24591i) {
                        x5Var4.f24591i = null;
                    }
                    C9710x5.this.mo61231a(activity, new C9726y5(this.f24597b.mo60845e(), C9710x5.this.mo61234b(activity), false, z5Var.f23893h), this.f24597b);
                    return;
                }
            }
            x5Var.f24591i = null;
        }
    }

    /* renamed from: com.appodeal.ads.x5$d */
    public static class C9714d {

        /* renamed from: a */
        public C8998a f24599a;

        /* renamed from: b */
        public C9181f0 f24600b;

        public C9714d() {
            this.f24600b = C9181f0.NEVER_SHOWN;
        }

        public /* synthetic */ C9714d(int i) {
            this();
        }
    }

    /* renamed from: com.appodeal.ads.x5$e */
    public static class C9715e extends FrameLayout {

        /* renamed from: b */
        public static final Rect f24601b = new Rect();

        /* renamed from: a */
        public final Rect f24602a = new Rect();

        public C9715e(Context context) {
            super(context);
            setFitsSystemWindows(true);
        }

        /* renamed from: a */
        public boolean mo61235a() {
            return true;
        }

        public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
            Rect rect;
            DisplayCutout displayCutout;
            C9422r0 r0Var = C9422r0.f23912a;
            if (!C9422r0.f23924m) {
                return windowInsets;
            }
            if (windowInsets.getSystemWindowInsetLeft() == 0 && windowInsets.getSystemWindowInsetTop() == 0 && windowInsets.getSystemWindowInsetRight() == 0 && windowInsets.getSystemWindowInsetBottom() == 0) {
                rect = f24601b;
            } else {
                Rect rect2 = this.f24602a;
                rect2.setEmpty();
                if (Build.VERSION.SDK_INT >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
                    rect2.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                rect = this.f24602a;
                if (mo61235a()) {
                    Rect rect3 = this.f24602a;
                    int max = Math.max(rect3.left, rect3.right);
                    rect3.right = max;
                    rect3.left = max;
                }
            }
            fitSystemWindows(rect);
            return windowInsets;
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z) {
                requestApplyInsets();
            }
        }
    }

    /* renamed from: com.appodeal.ads.x5$f */
    public class C9716f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final AdRequestType f24603a;

        /* renamed from: b */
        public final AdObjectType f24604b;

        /* renamed from: c */
        public final C9577u<AdObjectType, AdRequestType, ?> f24605c;

        /* renamed from: d */
        public final View f24606d;

        /* renamed from: e */
        public final View f24607e;

        /* renamed from: f */
        public final boolean f24608f;

        /* renamed from: g */
        public final boolean f24609g;

        public C9716f(AdRequestType adrequesttype, AdObjectType adobjecttype, C9577u<AdObjectType, AdRequestType, ?> uVar, View view, View view2, boolean z, boolean z2) {
            this.f24603a = adrequesttype;
            this.f24604b = adobjecttype;
            this.f24605c = uVar;
            this.f24606d = view;
            this.f24607e = view2;
            this.f24608f = z;
            this.f24609g = z2;
        }

        public final void onAnimationCancel(Animator animator) {
            animator.removeAllListeners();
            View view = this.f24606d;
            if (view != null) {
                if (view.getAnimation() != null) {
                    this.f24606d.getAnimation().setAnimationListener((Animation.AnimationListener) null);
                }
                this.f24606d.clearAnimation();
                this.f24606d.animate().setListener((Animator.AnimatorListener) null);
            }
            C9710x5 x5Var = C9710x5.this;
            x5Var.f24590h = null;
            try {
                View view2 = this.f24606d;
                boolean z = this.f24608f;
                boolean z2 = this.f24609g;
                x5Var.getClass();
                C9710x5.m28527a(view2, z, z2);
            } catch (Exception e) {
                Log.log(e);
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void onAnimationEnd(android.animation.Animator r8) {
            /*
                r7 = this;
                r8.removeAllListeners()
                android.view.View r8 = r7.f24606d
                r0 = 0
                if (r8 == 0) goto L_0x0025
                android.view.animation.Animation r8 = r8.getAnimation()
                if (r8 == 0) goto L_0x0017
                android.view.View r8 = r7.f24606d
                android.view.animation.Animation r8 = r8.getAnimation()
                r8.setAnimationListener(r0)
            L_0x0017:
                android.view.View r8 = r7.f24606d
                r8.clearAnimation()
                android.view.View r8 = r7.f24606d
                android.view.ViewPropertyAnimator r8 = r8.animate()
                r8.setListener(r0)
            L_0x0025:
                com.appodeal.ads.x5 r8 = com.appodeal.ads.C9710x5.this
                r8.f24590h = r0
                AdRequestType r0 = r7.f24603a
                AdObjectType r1 = r7.f24604b
                com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r7.f24605c
                android.view.View r3 = r7.f24607e
                r8.getClass()
                com.appodeal.ads.u5 r4 = new com.appodeal.ads.u5
                r4.<init>(r8, r2, r0, r1)
                int r8 = r2.f24299q
                long r5 = (long) r8
                java.util.HashMap r8 = com.appodeal.ads.utils.C9618d0.f24378a
                monitor-enter(r8)
                monitor-enter(r8)     // Catch:{ all -> 0x007c }
                java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x0079 }
                com.appodeal.ads.utils.d0$a r0 = (com.appodeal.ads.utils.C9618d0.C9619a) r0     // Catch:{ all -> 0x0079 }
                if (r0 == 0) goto L_0x004e
                r0.mo61078b()     // Catch:{ all -> 0x0079 }
                r8.remove(r1)     // Catch:{ all -> 0x0079 }
            L_0x004e:
                monitor-exit(r8)     // Catch:{ all -> 0x0079 }
                com.appodeal.ads.utils.d0$a r0 = new com.appodeal.ads.utils.d0$a     // Catch:{ all -> 0x007c }
                r0.<init>(r3, r5, r4)     // Catch:{ all -> 0x007c }
                r8.put(r1, r0)     // Catch:{ all -> 0x007c }
                r0.mo61079c()     // Catch:{ all -> 0x007c }
                monitor-exit(r8)     // Catch:{ all -> 0x007c }
                android.view.View r8 = r7.f24607e
                android.view.View r0 = r7.f24606d
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x0078
                com.appodeal.ads.x5 r8 = com.appodeal.ads.C9710x5.this     // Catch:{ Exception -> 0x0074 }
                android.view.View r0 = r7.f24606d     // Catch:{ Exception -> 0x0074 }
                boolean r1 = r7.f24608f     // Catch:{ Exception -> 0x0074 }
                boolean r2 = r7.f24609g     // Catch:{ Exception -> 0x0074 }
                r8.getClass()     // Catch:{ Exception -> 0x0074 }
                com.appodeal.ads.C9710x5.m28527a((android.view.View) r0, (boolean) r1, (boolean) r2)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0078
            L_0x0074:
                r8 = move-exception
                com.appodeal.ads.utils.Log.log(r8)
            L_0x0078:
                return
            L_0x0079:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0079 }
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x007c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9710x5.C9716f.onAnimationEnd(android.animation.Animator):void");
        }

        public final void onAnimationStart(Animator animator) {
            C9710x5.this.f24590h = new WeakReference<>(animator);
        }
    }

    public C9710x5(C8998a aVar) {
        this.f24588f = aVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static void m28528a(com.appodeal.ads.C9710x5 r18, android.app.Activity r19, com.appodeal.ads.C9737z5 r20, com.appodeal.ads.C9430r5 r21, com.appodeal.ads.C8998a r22, com.appodeal.ads.C8998a r23, com.appodeal.ads.C9577u r24, boolean r25) {
        /*
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r0 = r22
            r1 = r23
            r14 = r24
            java.lang.String r2 = r10.f24583a
            java.lang.String r3 = "Display Ads"
            java.lang.String r4 = "start"
            com.appodeal.ads.utils.Log.debug(r2, r3, r4)
            android.view.View r6 = r10.f24585c
            if (r6 != 0) goto L_0x0035
            if (r25 == 0) goto L_0x0035
            com.appodeal.ads.networking.LoadingError r0 = com.appodeal.ads.networking.LoadingError.ShowFailed
            com.appodeal.ads.utils.ExchangeAd r1 = r13.f23275i
            if (r1 == 0) goto L_0x002c
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.TimeoutError
            if (r0 != r2) goto L_0x002c
            r2 = 1005(0x3ed, float:1.408E-42)
            r1.trackError(r2)
        L_0x002c:
            UnifiedAdType r1 = r13.f23272f
            if (r1 == 0) goto L_0x029e
            r1.onError(r0)
            goto L_0x029e
        L_0x0035:
            if (r6 == 0) goto L_0x003b
            if (r25 == 0) goto L_0x003b
            r7 = r6
            goto L_0x003e
        L_0x003b:
            android.view.View r2 = r13.f23945s
            r7 = r2
        L_0x003e:
            if (r7 != 0) goto L_0x0049
            com.appodeal.ads.b0<AdObjectType, AdRequestType, ?> r0 = r14.f24286d
            com.appodeal.ads.networking.LoadingError r1 = com.appodeal.ads.networking.LoadingError.NoFill
            r0.mo59854j(r12, r13)
            goto L_0x029e
        L_0x0049:
            r15 = 1
            r9 = 0
            if (r0 != r1) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            r3 = 0
            if (r6 == 0) goto L_0x006e
            android.view.ViewParent r4 = r6.getParent()
            boolean r4 = r4 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L_0x006e
            android.view.ViewParent r4 = r6.getParent()
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            java.lang.Object r5 = r4.getTag()
            java.lang.String r8 = "Appodeal"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x006e
            r3 = r4
        L_0x006e:
            com.appodeal.ads.a r4 = com.appodeal.ads.C8998a.VIEW
            r5 = 360(0x168, float:5.04E-43)
            if (r0 == r4) goto L_0x00c2
            if (r2 == 0) goto L_0x009b
            if (r3 == 0) goto L_0x009b
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x009b
            android.view.ViewParent r2 = r3.getParent()
            if (r2 != 0) goto L_0x0086
            r2 = 0
            goto L_0x0099
        L_0x0086:
            boolean r8 = r2 instanceof android.view.View
            if (r8 == 0) goto L_0x0091
            android.view.View r2 = (android.view.View) r2
            android.content.Context r2 = r2.getContext()
            goto L_0x0095
        L_0x0091:
            android.content.Context r2 = r3.getContext()
        L_0x0095:
            boolean r2 = r11.equals(r2)
        L_0x0099:
            if (r2 != 0) goto L_0x00e1
        L_0x009b:
            int r2 = r22.mo59372a()
            if (r2 == 0) goto L_0x00a5
            if (r2 == r5) goto L_0x00a5
            r2 = 1
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            com.appodeal.ads.x5$b r3 = new com.appodeal.ads.x5$b
            r3.<init>(r11, r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r8 = r13.mo60070a(r11)
            r5 = -1
            r2.<init>(r5, r8)
            r3.setBackgroundColor(r9)
            r3.setLayoutParams(r2)
            java.lang.String r2 = "Appodeal"
            r3.setTag(r2)
            r8 = 1
            goto L_0x00e2
        L_0x00c2:
            int r2 = r10.f24587e
            android.view.View r2 = r11.findViewById(r2)
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            android.view.View r2 = r10.f24586d
        L_0x00cd:
            if (r2 == 0) goto L_0x00de
            boolean r3 = r10.mo59973a((android.view.View) r2)
            if (r3 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW"
            r0.<init>(r1)
            throw r0
        L_0x00de:
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            if (r3 != 0) goto L_0x00f6
            java.lang.String r0 = "Show Failed"
            java.lang.String r1 = "view not found"
            r14.mo60837a((java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r0 = r10.f24583a
            java.lang.String r1 = "Display Ads"
            java.lang.String r2 = "View container not found"
            com.appodeal.ads.utils.Log.debug(r0, r1, r2)
            goto L_0x029e
        L_0x00f6:
            android.view.View r2 = r10.f24585c
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0112
            android.view.ViewParent r2 = r7.getParent()
            if (r2 == 0) goto L_0x0112
            android.view.ViewParent r2 = r7.getParent()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0112
            if (r8 != 0) goto L_0x0112
            r2 = 1
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            if (r2 == 0) goto L_0x015d
            r7.setVisibility(r9)
            r3.setVisibility(r9)
            com.appodeal.ads.x5<AdRequestType, AdObjectType>$c r0 = r10.f24591i
            if (r0 == 0) goto L_0x0135
            com.appodeal.ads.q4 r1 = com.appodeal.ads.C9409q4.f23839a
            boolean r1 = com.appodeal.ads.C9422r0.f23923l
            if (r1 != 0) goto L_0x0135
            com.appodeal.ads.x5$a r0 = r0.f24596a
            r0.getClass()
            com.appodeal.ads.context.b r0 = com.appodeal.ads.context.C9148b.f22956b
            com.appodeal.ads.context.f r0 = r0.f22957a
            android.app.Activity r0 = r0.getActivity()
            if (r0 == r11) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r15 = 0
        L_0x0136:
            if (r15 != 0) goto L_0x0142
            boolean r0 = r24.mo60582k()
            if (r0 == 0) goto L_0x0145
            boolean r0 = r12.f23879C
            if (r0 == 0) goto L_0x0145
        L_0x0142:
            r10.mo61226a((android.app.Activity) r11, r14, r12)
        L_0x0145:
            java.lang.String r0 = r10.f24583a
            java.lang.String r1 = "Skip actual showing because view already on screen: "
            java.lang.StringBuilder r1 = com.appodeal.ads.C9203h0.m27334a(r1)
            com.appodeal.ads.x5<AdRequestType, AdObjectType>$c r2 = r10.f24591i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Display Ads"
            com.appodeal.ads.utils.Log.debug(r0, r2, r1)
            goto L_0x029e
        L_0x015d:
            m28527a((android.view.View) r7, (boolean) r15, (boolean) r15)
            UnifiedAdType r2 = r13.f23272f
            if (r2 == 0) goto L_0x0173
            UnifiedAdParamsType r5 = r13.f23273g
            if (r5 == 0) goto L_0x016c
            r2.onPrepareToShow(r11, r5)
            goto L_0x0173
        L_0x016c:
            UnifiedAdCallbackType r2 = r13.f23274h
            if (r2 == 0) goto L_0x0173
            r2.onAdShowFailed()
        L_0x0173:
            int r2 = r13.mo60073b(r11)
            int r5 = r13.mo60070a(r11)
            android.view.ViewParent r16 = r3.getParent()
            if (r16 != 0) goto L_0x01a7
            if (r0 == r4) goto L_0x01a7
            int r15 = r22.mo59372a()
            if (r15 == 0) goto L_0x018f
            r9 = 360(0x168, float:5.04E-43)
            if (r15 == r9) goto L_0x018f
            r9 = 1
            goto L_0x0190
        L_0x018f:
            r9 = 0
        L_0x0190:
            if (r9 == 0) goto L_0x019a
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r15 = r0.f22777c
            r9.<init>(r5, r2, r15)
            goto L_0x01a1
        L_0x019a:
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r15 = r0.f22777c
            r9.<init>(r2, r5, r15)
        L_0x01a1:
            r11.addContentView(r3, r9)
            r3.bringToFront()
        L_0x01a7:
            r22.getClass()
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r15 = r0.f22776b
            r9.<init>(r2, r5, r15)
            int r2 = r22.mo59372a()
            float r2 = (float) r2
            r7.setRotation(r2)
            r3.addView(r7, r9)
            r9 = 0
            r7.setVisibility(r9)
            r3.setVisibility(r9)
            r10.f24585c = r7
            r10.f24588f = r0
            r14.f24307y = r12
            if (r0 != r1) goto L_0x0210
            if (r6 == 0) goto L_0x0210
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x0210
            boolean r1 = r10.f24592j
            if (r1 == 0) goto L_0x0210
            r6.bringToFront()
            android.view.ViewPropertyAnimator r1 = r6.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
            r2 = 800(0x320, double:3.953E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.ViewPropertyAnimator r15 = r1.withLayer()
            com.appodeal.ads.x5$f r5 = new com.appodeal.ads.x5$f
            if (r0 == r4) goto L_0x01f3
            r0 = 1
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            r1 = r5
            r2 = r18
            r3 = r20
            r4 = r21
            r11 = r5
            r5 = r24
            r23 = r8
            r8 = r0
            r17 = 0
            r9 = r23
            r1.<init>(r3, r4, r5, r6, r7, r8, r9)
            android.view.ViewPropertyAnimator r0 = r15.setListener(r11)
            r0.start()
            goto L_0x0251
        L_0x0210:
            r23 = r8
            r17 = 0
            com.appodeal.ads.u5 r1 = new com.appodeal.ads.u5
            r1.<init>(r10, r14, r12, r13)
            int r2 = r14.f24299q
            long r2 = (long) r2
            java.util.HashMap r5 = com.appodeal.ads.utils.C9618d0.f24378a
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x02a2 }
            java.lang.Object r8 = r5.get(r13)     // Catch:{ all -> 0x029f }
            com.appodeal.ads.utils.d0$a r8 = (com.appodeal.ads.utils.C9618d0.C9619a) r8     // Catch:{ all -> 0x029f }
            if (r8 == 0) goto L_0x022e
            r8.mo61078b()     // Catch:{ all -> 0x029f }
            r5.remove(r13)     // Catch:{ all -> 0x029f }
        L_0x022e:
            monitor-exit(r5)     // Catch:{ all -> 0x029f }
            com.appodeal.ads.utils.d0$a r8 = new com.appodeal.ads.utils.d0$a     // Catch:{ all -> 0x02a2 }
            r8.<init>(r7, r2, r1)     // Catch:{ all -> 0x02a2 }
            r5.put(r13, r8)     // Catch:{ all -> 0x02a2 }
            r8.mo61079c()     // Catch:{ all -> 0x02a2 }
            monitor-exit(r5)     // Catch:{ all -> 0x02a2 }
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x0251
            r15 = r23
            if (r0 == r4) goto L_0x0247
            r9 = 1
            goto L_0x0248
        L_0x0247:
            r9 = 0
        L_0x0248:
            m28527a((android.view.View) r6, (boolean) r9, (boolean) r15)     // Catch:{ Exception -> 0x024c }
            goto L_0x0251
        L_0x024c:
            r0 = move-exception
            r1 = r0
            com.appodeal.ads.utils.Log.log(r1)
        L_0x0251:
            com.appodeal.ads.x5<AdRequestType, AdObjectType>$c r0 = r10.f24591i
            if (r0 == 0) goto L_0x026e
            com.appodeal.ads.q4 r1 = com.appodeal.ads.C9409q4.f23839a
            boolean r1 = com.appodeal.ads.C9422r0.f23923l
            if (r1 != 0) goto L_0x026e
            com.appodeal.ads.x5$a r0 = r0.f24596a
            r0.getClass()
            com.appodeal.ads.context.b r0 = com.appodeal.ads.context.C9148b.f22956b
            com.appodeal.ads.context.f r0 = r0.f22957a
            android.app.Activity r0 = r0.getActivity()
            r1 = r19
            if (r0 == r1) goto L_0x0270
            r15 = 1
            goto L_0x0271
        L_0x026e:
            r1 = r19
        L_0x0270:
            r15 = 0
        L_0x0271:
            if (r15 != 0) goto L_0x027d
            boolean r0 = r24.mo60582k()
            if (r0 == 0) goto L_0x0280
            boolean r0 = r12.f23879C
            if (r0 == 0) goto L_0x0280
        L_0x027d:
            r10.mo61226a((android.app.Activity) r1, r14, r12)
        L_0x0280:
            UnifiedAdType r0 = r13.f23272f
            if (r0 == 0) goto L_0x0287
            r0.onShow()
        L_0x0287:
            long r0 = r13.f23280n
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0295
            long r0 = java.lang.System.currentTimeMillis()
            r13.f23280n = r0
        L_0x0295:
            java.lang.String r0 = r10.f24583a
            java.lang.String r1 = "Display Ads"
            java.lang.String r2 = "success"
            com.appodeal.ads.utils.Log.debug(r0, r1, r2)
        L_0x029e:
            return
        L_0x029f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9710x5.m28528a(com.appodeal.ads.x5, android.app.Activity, com.appodeal.ads.z5, com.appodeal.ads.r5, com.appodeal.ads.a, com.appodeal.ads.a, com.appodeal.ads.u, boolean):void");
    }

    /* renamed from: a */
    public final void mo61225a(int i) {
        this.f24587e = i;
    }

    /* renamed from: a */
    public final void mo61227a(FrameLayout frameLayout) {
        this.f24586d = frameLayout;
    }

    /* renamed from: a */
    public final void mo61228a(boolean z) {
        this.f24592j = z;
    }

    /* renamed from: a */
    public final boolean mo61229a() {
        return this.f24592j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo60089a(Activity activity, C9401q qVar, C9577u uVar) {
        return mo61232a((C9726y5) qVar, uVar);
    }

    /* renamed from: a */
    public abstract boolean mo59973a(View view);

    /* renamed from: b */
    public final C8998a mo61233b() {
        return this.f24588f;
    }

    /* renamed from: b */
    public final C8998a mo61234b(Activity activity) {
        C8998a aVar = mo61224a(activity).f24599a;
        if (aVar != null) {
            return aVar;
        }
        C8998a aVar2 = this.f24589g;
        return aVar2 != null ? aVar2 : this.f24588f;
    }

    /* renamed from: c */
    public abstract void mo59974c(Activity activity);

    /* renamed from: a */
    public static void m28529a(C9737z5 z5Var, C9128b0 b0Var) {
        if (z5Var != null && !z5Var.f23882F) {
            AdObjectType adobjecttype = z5Var.f23904s;
            if (adobjecttype != null) {
                C9640o.m28398b(adobjecttype);
                ((C9430r5) z5Var.f23904s).mo60107k();
            }
            for (Map.Entry value : z5Var.f23902q.entrySet()) {
                C9258l lVar = (C9258l) value.getValue();
                if (lVar != null) {
                    C9640o.m28398b(lVar);
                    lVar.mo60107k();
                }
            }
            b0Var.getClass();
            z5Var.mo60605a(false, true);
            b0Var.mo59859o(z5Var, null);
            z5Var.f23882F = true;
            z5Var.mo60634y();
        }
    }

    /* renamed from: a */
    public final long mo61223a(C9577u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype) {
        AdObjectType adobjecttype;
        Integer num;
        int i;
        if (adrequesttype == null || (adobjecttype = adrequesttype.f23904s) == null) {
            return 0;
        }
        int impressionInterval = ((C9430r5) adobjecttype).f23269c.getImpressionInterval();
        if (impressionInterval > 0) {
            num = Integer.valueOf(impressionInterval);
        } else {
            JSONObject optJSONObject = uVar.mo60845e().f24091c.optJSONObject("impression_interval");
            int i2 = -1;
            if (optJSONObject != null) {
                i2 = optJSONObject.optInt("banner", -1) * 1000;
            }
            if (i2 > 0) {
                i = Integer.valueOf(i2);
            } else {
                if (this.f24584b == null) {
                    i = 15000;
                }
                num = this.f24584b;
            }
            this.f24584b = i;
            num = this.f24584b;
        }
        return Math.max(0, (adrequesttype.f23898m + ((long) num.intValue())) - System.currentTimeMillis());
    }

    /* renamed from: a */
    public final C9714d mo61224a(Activity activity) {
        C9409q4 q4Var = C9409q4.f23839a;
        if (C9422r0.f23923l || activity == null) {
            return this.f24593k;
        }
        C9714d dVar = null;
        Iterator it = this.f24594l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((WeakReference) entry.getKey()).get() == activity) {
                dVar = (C9714d) entry.getValue();
                break;
            }
        }
        if (dVar != null) {
            return dVar;
        }
        C9714d dVar2 = new C9714d();
        this.f24594l.put(new WeakReference(activity), dVar2);
        return dVar2;
    }

    /* renamed from: a */
    public final void mo60586a(Activity activity, C9401q qVar, C9577u uVar, C9391p.C9392a aVar) {
        C9726y5 y5Var = (C9726y5) qVar;
        uVar.mo60837a(LogConstants.EVENT_SHOW_FAILED, aVar.f23816a);
        if (aVar == C9391p.C9392a.f23813d || aVar == C9391p.C9392a.f23812c) {
            mo61224a(activity).f24599a = y5Var.f24646c;
        }
    }

    /* renamed from: a */
    public final boolean mo61232a(C9726y5 y5Var, C9577u uVar) {
        Activity activity;
        C9726y5 y5Var2 = y5Var;
        C9577u uVar2 = uVar;
        Log.debug(this.f24583a, "onRenderRequested", "start");
        if (!C9422r0.f23923l || (activity = C9326n5.m27544b()) == null) {
            activity = C9148b.f22956b.f22957a.getActivity();
        }
        Activity activity2 = activity;
        if (activity2 == null) {
            Log.debug(this.f24583a, "onRenderRequested", "Target activity can't be resolved");
            return false;
        }
        C8998a aVar = this.f24588f;
        C8998a aVar2 = y5Var2.f24646c;
        C9714d a = mo61224a(activity2);
        C9490g gVar = y5Var2.f23823a;
        boolean z = y5Var2.f23824b;
        C9737z5 z5Var = (C9737z5) uVar.mo60846f();
        if (z5Var == null) {
            Log.debug(this.f24583a, "onRenderRequested", "No previous loaded ads");
            Boolean bool = Boolean.FALSE;
            uVar2.mo60837a(LogConstants.EVENT_SHOW, String.format("isDebug: %s, isLoaded: %s, isLoading: %s, placement: '%s'", new Object[]{Boolean.valueOf(y5Var2.f23824b), bool, bool, gVar.f24090b}));
            if (!gVar.mo60739a(activity2, uVar2.f24288f, 0.0d)) {
                String str = this.f24583a;
                StringBuilder a2 = C9203h0.m27334a("Can't show for placement: ");
                a2.append(gVar.f24089a);
                Log.debug(str, "onRenderRequested", a2.toString());
                return false;
            } else if (z || !uVar.mo60582k()) {
                Log.debug(this.f24583a, "onRenderRequested", "Skipping cache because it's debug or not auto-cache");
                return false;
            } else {
                Log.debug(this.f24583a, "onRenderRequested", "Requesting cache");
                mo59974c(activity2);
                a.f24600b = C9181f0.VISIBLE;
                return true;
            }
        } else {
            String str2 = "Requesting cache";
            uVar2.mo60837a(LogConstants.EVENT_SHOW, String.format("isDebug: %s, isLoaded: %s, isLoading: %s, placement: '%s'", new Object[]{Boolean.valueOf(y5Var2.f23824b), Boolean.valueOf(z5Var.f23906u), Boolean.valueOf(z5Var.mo60630u()), gVar.f24090b}));
            if (!gVar.mo60739a(activity2, uVar2.f24288f, z5Var.f23905t)) {
                String str3 = this.f24583a;
                StringBuilder a3 = C9203h0.m27334a("Can't show for placement: ");
                a3.append(gVar.f24089a);
                Log.debug(str3, "onRenderRequested", a3.toString());
                return false;
            }
            C9737z5 z5Var2 = (C9737z5) uVar2.f24307y;
            if (!z && !y5Var2.f24647d) {
                C9714d a4 = mo61224a(activity2);
                C9181f0 f0Var = a4.f24600b;
                C9181f0 f0Var2 = C9181f0.VISIBLE;
                if ((f0Var == f0Var2 || a4.f24599a != null) && !z5Var.f23893h && uVar.mo60582k()) {
                    if (!(mo61223a(uVar2, z5Var2) <= 0)) {
                        Log.debug(this.f24583a, "onRenderRequested", "Showing previous ads");
                        boolean a5 = mo61230a(activity2, uVar2, aVar2, aVar);
                        if (a5) {
                            a.f24600b = f0Var2;
                        }
                        return a5;
                    }
                }
            }
            if (z5Var.f23906u || z5Var.f23907v || z5Var.f23902q.containsKey(gVar.f24090b)) {
                AdObjectType a6 = z5Var.mo60593a(gVar.f24090b);
                z5Var.f23904s = a6;
                C9430r5 r5Var = (C9430r5) a6;
                if (r5Var == null) {
                    return false;
                }
                View findViewById = activity2.findViewById(this.f24587e);
                if (findViewById == null) {
                    findViewById = this.f24586d;
                }
                if (findViewById != null && !mo59973a(findViewById)) {
                    throw new IllegalArgumentException("Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW");
                } else if (((ViewGroup) findViewById) == null && aVar2 == C8998a.VIEW) {
                    uVar2.mo60837a(LogConstants.EVENT_SHOW_FAILED, LogConstants.MSG_VIEW_NOT_FOUND);
                    Log.debug(this.f24583a, "onRenderRequested", "View container not found");
                    return false;
                } else {
                    Log.debug(this.f24583a, "onRenderRequested", "Showing new ads");
                    activity2.runOnUiThread(new C9483s5(this, activity2, z5Var, r5Var, aVar2, aVar, uVar));
                    a.f24600b = C9181f0.VISIBLE;
                    return true;
                }
            } else if (z5Var.mo60630u() || (z5Var.f23879C && !uVar.mo60582k())) {
                Log.debug(this.f24583a, "onRenderRequested", "Trying to show previous ads");
                if (!mo61230a(activity2, uVar2, aVar2, aVar) && (z || !uVar.mo60582k())) {
                    return false;
                }
                a.f24600b = C9181f0.VISIBLE;
                return true;
            } else {
                Log.debug(this.f24583a, "onRenderRequested", "Trying to show previous ads");
                mo61230a(activity2, uVar2, aVar2, aVar);
                if (z || !uVar.mo60582k()) {
                    return false;
                }
                Log.debug(this.f24583a, "onRenderRequested", str2);
                mo59974c(activity2);
                a.f24600b = C9181f0.VISIBLE;
                return true;
            }
        }
    }

    /* renamed from: a */
    public static void m28527a(View view, boolean z, boolean z2) {
        if (view != null) {
            HashMap hashMap = C9618d0.f24378a;
            synchronized (hashMap) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C9618d0.C9619a) entry.getValue()).f24381b == view) {
                        ((C9618d0.C9619a) entry.getValue()).mo61078b();
                        C9618d0.f24378a.remove(entry.getKey());
                        break;
                    }
                }
            }
            ViewGroup viewGroup = null;
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view.getParent();
            }
            if (viewGroup != null) {
                if ((viewGroup instanceof BannerView) && z) {
                    viewGroup.setVisibility(8);
                }
                if ((viewGroup instanceof MrecView) && z) {
                    viewGroup.setVisibility(8);
                }
                viewGroup.removeView(view);
            }
            if (viewGroup != null && viewGroup.getTag() != null && viewGroup.getTag().equals("Appodeal") && z2) {
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo61231a(Activity activity, C9726y5 y5Var, C9577u<AdObjectType, AdRequestType, ?> uVar) {
        C9714d a = mo61224a(activity);
        if (!uVar.f24291i) {
            if (uVar.mo60582k()) {
                a.f24599a = y5Var.f24646c;
                uVar.f24294l = y5Var.f23823a;
                Log.debug(this.f24583a, "render", "Appodeal is initializing, ads will be displayed right after it's will be loaded");
                return true;
            }
            Log.debug(this.f24583a, "render", "Appodeal hasn't been initialized yet, ads won't show");
            return false;
        } else if (y5Var.f24647d && a.f24599a == null && a.f24600b == C9181f0.HIDDEN) {
            return false;
        } else {
            if (!C9609c.m28357a(C9326n5.m27544b())) {
                a.f24599a = null;
                this.f24589g = y5Var.f24646c;
                return mo60090b(activity, y5Var, uVar);
            } else if (uVar.mo60582k()) {
                a.f24599a = y5Var.f24646c;
                uVar.f24294l = y5Var.f23823a;
                Log.debug(this.f24583a, "render", "Fullscreen ads is showing, ads will be displayed right after it's will be closed");
                return true;
            } else {
                Log.debug(this.f24583a, "render", "Fullscreen ads is showing, ads won't show");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo61230a(Activity activity, C9577u uVar, C8998a aVar, C8998a aVar2) {
        Log.debug(this.f24583a, "performShowPreviousAds", "start");
        C9737z5 z5Var = (C9737z5) uVar.f24307y;
        if (z5Var != null && z5Var.f23879C && !z5Var.f23881E) {
            if (aVar == C8998a.VIEW) {
                View findViewById = activity.findViewById(this.f24587e);
                if (findViewById == null) {
                    findViewById = this.f24586d;
                }
                if (findViewById != null && !mo59973a(findViewById)) {
                    throw new IllegalArgumentException("Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW");
                } else if (((ViewGroup) findViewById) == null) {
                    uVar.mo60837a(LogConstants.EVENT_SHOW_FAILED, LogConstants.MSG_VIEW_NOT_FOUND);
                    Log.debug(this.f24583a, "performShowPreviousAds", "View container not found");
                    return false;
                }
            }
            C9430r5 r5Var = (C9430r5) z5Var.f23904s;
            if (r5Var != null) {
                Log.debug(this.f24583a, "performShowPreviousAds", "Perform showing previous ads");
                activity.runOnUiThread(new C9576t5(this, activity, z5Var, r5Var, aVar, aVar2, uVar));
                return true;
            }
            Log.debug(this.f24583a, "performShowPreviousAds", "Previous ads hasn't loaded object");
        }
        Log.debug(this.f24583a, "performShowPreviousAds", "Can't show previous ads, because current displaying ads is: null, wasn't shown or cleared");
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo61226a(Activity activity, C9577u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype) {
        Log.debug(this.f24583a, "Toggle refresh", "start");
        C9710x5<AdRequestType, AdObjectType>.c cVar = this.f24591i;
        if (cVar != null) {
            C9409q4 q4Var = C9409q4.f23839a;
            if (!C9422r0.f23923l) {
                cVar.f24596a.getClass();
                if (C9148b.f22956b.f22957a.getActivity() != activity) {
                    f24582m.removeCallbacks(this.f24591i);
                    Log.debug(this.f24583a, "Toggle refresh", "remove previous refresh runnable");
                }
            }
            Log.debug(this.f24583a, "Toggle refresh", "skip: already pending");
            return;
        }
        Log.debug(this.f24583a, "Toggle refresh", "create new refresh runnable");
        this.f24591i = new C9713c(uVar);
        long a = mo61223a(uVar, adrequesttype);
        String str = this.f24583a;
        Log.debug(str, "Toggle refresh", "expect in " + a + "ms");
        f24582m.postDelayed(this.f24591i, a);
    }
}
