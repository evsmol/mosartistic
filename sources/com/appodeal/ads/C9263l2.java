package com.appodeal.ads;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.segments.C9492h;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.utils.C9618d0;
import com.appodeal.ads.utils.C9640o;
import com.appodeal.ads.utils.C9643p;
import com.appodeal.ads.utils.C9646q;
import com.appodeal.ads.utils.C9650s;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.C9623a;
import com.explorestack.iab.vast.VastRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

/* renamed from: com.appodeal.ads.l2 */
public final class C9263l2 implements View.OnClickListener, NativeAd {

    /* renamed from: a */
    public final C9478s2 f23286a;

    /* renamed from: b */
    public final UnifiedNativeAd f23287b;

    /* renamed from: c */
    public final UnifiedNativeCallback f23288c;

    /* renamed from: d */
    public final String f23289d;

    /* renamed from: e */
    public final String f23290e;

    /* renamed from: f */
    public final String f23291f;

    /* renamed from: g */
    public final String f23292g;

    /* renamed from: h */
    public final String f23293h;

    /* renamed from: i */
    public final String f23294i;

    /* renamed from: j */
    public String f23295j;

    /* renamed from: k */
    public Bitmap f23296k;

    /* renamed from: l */
    public String f23297l;

    /* renamed from: m */
    public Bitmap f23298m;

    /* renamed from: n */
    public NativeAdView f23299n;

    /* renamed from: o */
    public C9195g2 f23300o;

    /* renamed from: p */
    public ProgressDialog f23301p;

    /* renamed from: q */
    public Uri f23302q;

    /* renamed from: r */
    public VastRequest f23303r;

    /* renamed from: s */
    public Handler f23304s;

    /* renamed from: t */
    public Runnable f23305t;

    /* renamed from: u */
    public C9490g f23306u;

    /* renamed from: v */
    public final double f23307v;

    /* renamed from: w */
    public boolean f23308w;

    /* renamed from: x */
    public final C9646q f23309x = new C9646q();

    /* renamed from: com.appodeal.ads.l2$a */
    public class C9264a implements C9646q.C9648b {
        public C9264a() {
        }

        public final void onHandleError() {
            C9263l2.this.mo60121f();
        }

        public final void onHandled() {
            C9263l2.this.mo60121f();
        }

        public final void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            C9263l2 l2Var = C9263l2.this;
            l2Var.f23288c.onAdClicked(l2Var.f23287b, unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: com.appodeal.ads.l2$b */
    public class C9265b implements C9643p.C9645b {
    }

    /* renamed from: com.appodeal.ads.l2$c */
    public class C9266c implements View.OnAttachStateChangeListener {
        public C9266c() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C9263l2.this.mo60121f();
        }
    }

    public C9263l2(C9478s2 s2Var, UnifiedNativeAd unifiedNativeAd, UnifiedNativeCallback unifiedNativeCallback) {
        this.f23286a = s2Var;
        this.f23287b = unifiedNativeAd;
        this.f23288c = unifiedNativeCallback;
        this.f23289d = m27436a(25, unifiedNativeAd.getTitle());
        this.f23290e = m27436a(100, unifiedNativeAd.getDescription());
        this.f23291f = m27436a(25, unifiedNativeAd.getCallToAction());
        this.f23297l = unifiedNativeAd.getImageUrl();
        this.f23295j = unifiedNativeAd.getIconUrl();
        this.f23292g = unifiedNativeAd.getClickUrl();
        this.f23293h = unifiedNativeAd.getVideoUrl();
        this.f23294i = unifiedNativeAd.getVastVideoTag();
        this.f23307v = s2Var.getEcpm();
    }

    /* renamed from: a */
    public static String m27436a(int i, String str) {
        if (str == null || str.length() <= i) {
            return str;
        }
        String substring = str.substring(0, i);
        if (str.charAt(i) != ' ' && substring.lastIndexOf(" ") > 0) {
            substring = substring.substring(0, substring.lastIndexOf(" "));
        }
        return substring + "…";
    }

    /* renamed from: a */
    public static void m27438a(ImageView imageView, String str, Bitmap bitmap) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        C9265b bVar = new C9265b();
        if (TextUtils.isEmpty(str) || imageView == null) {
            Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "Target ImageView or ImagePath is invalid");
            return;
        }
        C9650s sVar = C9650s.f24449e;
        sVar.f24450a.execute(new C9643p.C9644a(imageView.getContext(), str, imageView, bVar));
    }

    /* renamed from: a */
    public final int mo60110a() {
        UnifiedNativeAd unifiedNativeAd = this.f23287b;
        return unifiedNativeAd != null ? unifiedNativeAd.getAdId() : hashCode();
    }

    /* renamed from: a */
    public final void mo60112a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C9195g2)) {
                if (childAt instanceof Button) {
                    ((Button) childAt).setOnClickListener(this);
                }
                if (childAt instanceof ViewGroup) {
                    mo60112a((ViewGroup) childAt);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60115a(NativeMediaView nativeMediaView) {
        if (!this.f23287b.onConfigureMediaView(nativeMediaView)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            C9195g2 g2Var = new C9195g2(nativeMediaView.getContext());
            this.f23300o = g2Var;
            if (Native.f22733c != Native.MediaAssetType.ICON) {
                g2Var.setNativeAd(this);
            }
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.f23300o, layoutParams);
        }
    }

    /* renamed from: b */
    public final Uri mo60117b() {
        return this.f23302q;
    }

    /* renamed from: c */
    public final VastRequest mo60118c() {
        return this.f23303r;
    }

    public final boolean canShow(Context context, String str) {
        if (str != null) {
            return C9492h.m28084a(str).mo60739a(context, AdType.Native, this.f23307v);
        }
        Log.log(new C9623a("Unable to check: placement = null"));
        return false;
    }

    public final boolean containsVideo() {
        return this.f23287b.containsVideo() || !TextUtils.isEmpty(this.f23293h) || !TextUtils.isEmpty(this.f23294i);
    }

    /* renamed from: d */
    public final String mo60119d() {
        return this.f23294i;
    }

    public final void destroy() {
        Timer timer;
        C9640o.m28398b(this.f23286a);
        UnifiedNativeAd unifiedNativeAd = this.f23287b;
        if (unifiedNativeAd != null) {
            unifiedNativeAd.onDestroy();
        }
        NativeAdView nativeAdView = this.f23299n;
        if (nativeAdView != null) {
            nativeAdView.setOnClickListener((View.OnClickListener) null);
            for (View next : nativeAdView.getClickableViews()) {
                if (!(next instanceof C9195g2)) {
                    next.setOnClickListener((View.OnClickListener) null);
                }
            }
        }
        HashMap hashMap = C9618d0.f24378a;
        synchronized (hashMap) {
            C9618d0.C9619a aVar = (C9618d0.C9619a) hashMap.get(this);
            if (aVar != null) {
                aVar.mo61078b();
                hashMap.remove(this);
            }
        }
        C9195g2 g2Var = this.f23300o;
        if (!(g2Var == null || (timer = g2Var.f23107i) == null)) {
            timer.cancel();
            g2Var.f23107i = null;
        }
        UnifiedNativeAd unifiedNativeAd2 = this.f23287b;
        if (unifiedNativeAd2 != null) {
            unifiedNativeAd2.onUnregisterForInteraction();
        }
        Bitmap bitmap = this.f23296k;
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (Exception e) {
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS, "bitmap recycling error");
                Log.log(e);
            }
        }
        this.f23296k = null;
        Bitmap bitmap2 = this.f23298m;
        if (bitmap2 != null) {
            try {
                bitmap2.recycle();
            } catch (Exception e2) {
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS, "bitmap recycling error");
                Log.log(e2);
            }
        }
        this.f23298m = null;
        Uri uri = this.f23302q;
        if (uri != null && uri.getPath() != null) {
            File file = new File(this.f23302q.getPath());
            if (file.exists()) {
                file.delete();
            }
            this.f23302q = null;
        }
    }

    /* renamed from: e */
    public final String mo60120e() {
        return this.f23293h;
    }

    /* renamed from: f */
    public final void mo60121f() {
        Handler handler;
        ProgressDialog progressDialog = this.f23301p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f23301p.dismiss();
            this.f23301p = null;
        }
        Runnable runnable = this.f23305t;
        if (runnable != null && (handler = this.f23304s) != null) {
            handler.removeCallbacks(runnable);
            this.f23304s = null;
            this.f23305t = null;
        }
    }

    /* renamed from: g */
    public final void mo60122g() {
        UnifiedNativeAd unifiedNativeAd = this.f23287b;
        if (unifiedNativeAd != null) {
            unifiedNativeAd.onAdVideoFinish();
        }
    }

    public final String getAdProvider() {
        return this.f23286a.f23270d;
    }

    public final String getAgeRestrictions() {
        return this.f23287b.getAgeRestriction();
    }

    public final String getCallToAction() {
        return !TextUtils.isEmpty(this.f23291f) ? this.f23291f : "Install";
    }

    public final String getDescription() {
        return this.f23290e;
    }

    public final double getPredictedEcpm() {
        return this.f23307v;
    }

    public final View getProviderView(Context context) {
        return this.f23287b.obtainProviderView(context);
    }

    public final float getRating() {
        Float rating = this.f23287b.getRating();
        if (rating == null) {
            return 5.0f;
        }
        return rating.floatValue();
    }

    public final String getTitle() {
        return this.f23289d;
    }

    public final boolean isPrecache() {
        return this.f23286a.f23269c.isPrecache();
    }

    public final void onClick(View view) {
        this.f23287b.onAdClick(view);
        mo60116a(this.f23287b.getClickNotifyUrls());
        Context context = view.getContext();
        mo60111a(context);
        this.f23309x.mo61099a(context, this.f23292g, this.f23287b.getTrackingPackageName(), this.f23287b.getTrackingPackageExpiry(), new C9264a());
    }

    /* renamed from: a */
    public static Map m27437a(Rect rect, View view, HashMap hashMap) {
        int i = 0;
        if (hashMap.containsKey(view)) {
            if (view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0) {
                i = 1;
            }
            if (i != 0 && view.isShown() && !C9326n5.m27549b(view) && rect.contains(C9326n5.m27527a(view))) {
                hashMap.remove(view);
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i < viewGroup.getChildCount()) {
                m27437a(rect, viewGroup.getChildAt(i), hashMap);
                i++;
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo60116a(List<String> list) {
        Long x = ((C9573t2) this.f23286a.f23267a).mo60633x();
        C9490g gVar = this.f23306u;
        String a = gVar == null ? null : C9490g.m28075a(gVar);
        if (list != null) {
            for (String next : list) {
                if (next != null) {
                    if (next.contains("${APPODEALX_SEGMENT_ID}")) {
                        next = next.replace("${APPODEALX_SEGMENT_ID}", x.toString());
                    }
                    if (a != null && next.contains("${APPODEALX_PLACEMENT_ID}")) {
                        next = next.replace("${APPODEALX_PLACEMENT_ID}", a);
                    }
                    C9326n5.m27538a(next, C9650s.f24449e);
                }
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final void mo60113a(com.appodeal.ads.NativeAdView r8, java.lang.String r9) {
        /*
            r7 = this;
            com.appodeal.ads.segments.g r9 = com.appodeal.ads.segments.C9492h.m28084a((java.lang.String) r9)
            r7.f23306u = r9
            com.appodeal.ads.Native$a r9 = com.appodeal.ads.Native.m27078a()
            com.appodeal.ads.segments.g r0 = r7.f23306u
            r9.f24294l = r0
            r8.deconfigureContainer()
            com.appodeal.ads.unified.UnifiedNativeAd r9 = r7.f23287b
            r9.onConfigure(r8)
            com.appodeal.ads.NativeAdView r9 = r7.f23299n
            if (r9 != 0) goto L_0x001b
            goto L_0x003b
        L_0x001b:
            r0 = 0
            r9.setOnClickListener(r0)
            java.util.List r9 = r9.getClickableViews()
            java.util.Iterator r9 = r9.iterator()
        L_0x0027:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r9.next()
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof com.appodeal.ads.C9195g2
            if (r2 != 0) goto L_0x0027
            r1.setOnClickListener(r0)
            goto L_0x0027
        L_0x003b:
            r8.setOnClickListener(r7)
            java.util.List r9 = r8.getClickableViews()
            java.util.Iterator r9 = r9.iterator()
        L_0x0046:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r9.next()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r0 instanceof com.appodeal.ads.C9195g2
            if (r1 != 0) goto L_0x0046
            r0.setOnClickListener(r7)
            goto L_0x0046
        L_0x005a:
            r7.mo60112a((android.view.ViewGroup) r8)
            r7.f23299n = r8
            boolean r9 = r7.f23308w
            if (r9 != 0) goto L_0x0095
            com.appodeal.ads.Native$a r9 = com.appodeal.ads.Native.m27078a()
            int r9 = r9.f24299q
            long r0 = (long) r9
            com.appodeal.ads.m2 r9 = new com.appodeal.ads.m2
            r9.<init>(r7)
            java.util.HashMap r2 = com.appodeal.ads.utils.C9618d0.f24378a
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = r2.get(r7)     // Catch:{ all -> 0x008f }
            com.appodeal.ads.utils.d0$a r3 = (com.appodeal.ads.utils.C9618d0.C9619a) r3     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0081
            r3.mo61078b()     // Catch:{ all -> 0x008f }
            r2.remove(r7)     // Catch:{ all -> 0x008f }
        L_0x0081:
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            com.appodeal.ads.utils.d0$a r3 = new com.appodeal.ads.utils.d0$a     // Catch:{ all -> 0x0092 }
            r3.<init>(r8, r0, r9)     // Catch:{ all -> 0x0092 }
            r2.put(r7, r3)     // Catch:{ all -> 0x0092 }
            r3.mo61079c()     // Catch:{ all -> 0x0092 }
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            goto L_0x0095
        L_0x008f:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            throw r8
        L_0x0095:
            com.appodeal.ads.g2 r9 = r7.f23300o
            if (r9 == 0) goto L_0x00e3
            java.lang.String r0 = com.appodeal.ads.C9195g2.f23097x
            java.lang.String r1 = "State"
            java.lang.String r2 = "onViewAppearOnScreen"
            com.appodeal.ads.utils.Log.log((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2)
            r0 = 1
            r9.f23113o = r0
            com.appodeal.ads.Native$NativeAdType r0 = com.appodeal.ads.Native.f22732b
            com.appodeal.ads.Native$NativeAdType r1 = com.appodeal.ads.Native.NativeAdType.Video
            if (r0 != r1) goto L_0x00be
            boolean r0 = r9.f23114p
            if (r0 == 0) goto L_0x00b3
            r9.mo59957f()
            goto L_0x00be
        L_0x00b3:
            int r0 = r9.f23121w
            r1 = 3
            if (r0 == r1) goto L_0x00be
            r0 = 4
            r9.f23121w = r0
            r9.mo59959h()
        L_0x00be:
            boolean r9 = com.appodeal.ads.Native.f22735e
            if (r9 == 0) goto L_0x00e3
            com.appodeal.ads.Native$NativeAdType r9 = com.appodeal.ads.Native.f22732b
            com.appodeal.ads.Native$NativeAdType r0 = com.appodeal.ads.Native.NativeAdType.NoVideo
            if (r9 == r0) goto L_0x00e3
            com.appodeal.ads.g2 r9 = r7.f23300o
            boolean r0 = r9.f23115q
            if (r0 != 0) goto L_0x00cf
            goto L_0x00e3
        L_0x00cf:
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r9.f23107i = r1
            com.appodeal.ads.f2 r2 = new com.appodeal.ads.f2
            r2.<init>(r9)
            r9 = 500(0x1f4, float:7.0E-43)
            long r5 = (long) r9
            r3 = 0
            r1.schedule(r2, r3, r5)
        L_0x00e3:
            com.appodeal.ads.unified.UnifiedNativeAd r9 = r7.f23287b
            r9.onRegisterForInteraction(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9263l2.mo60113a(com.appodeal.ads.NativeAdView, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo60114a(NativeIconView nativeIconView) {
        Context context = nativeIconView.getContext();
        View obtainIconView = this.f23287b.obtainIconView(context);
        ImageView imageView = obtainIconView;
        if (obtainIconView == null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView = imageView2;
            if (Native.f22733c != Native.MediaAssetType.IMAGE) {
                m27438a(imageView2, this.f23295j, this.f23296k);
                imageView = imageView2;
            }
        }
        if (imageView.getParent() != null && (imageView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) imageView.getParent()).removeView(imageView);
        }
        nativeIconView.removeAllViews();
        nativeIconView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo60111a(Context context) {
        if (this.f23299n != null && (context instanceof Activity)) {
            ProgressDialog progressDialog = this.f23301p;
            if (progressDialog == null || !progressDialog.isShowing()) {
                Activity activity = (Activity) context;
                if ((activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true) {
                    Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_SHOW_PROGRESS);
                    this.f23299n.addOnAttachStateChangeListener(new C9266c());
                    ProgressDialog show = ProgressDialog.show(activity, "", "Loading...");
                    this.f23301p = show;
                    show.setProgressStyle(0);
                    this.f23301p.setCancelable(false);
                    this.f23305t = new Runnable() {
                        public final void run() {
                            C9263l2.this.mo60121f();
                        }
                    };
                    Handler handler = new Handler(Looper.getMainLooper());
                    this.f23304s = handler;
                    handler.postDelayed(this.f23305t, 5000);
                }
            }
        }
    }
}
