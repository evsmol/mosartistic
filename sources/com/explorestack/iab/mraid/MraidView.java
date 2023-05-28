package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.bridge.JsBridgeHandler;
import com.explorestack.iab.measurer.MraidAdMeasurer;
import com.explorestack.iab.mraid.C1370j;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.C1398h;
import com.explorestack.iab.utils.C1400j;
import com.explorestack.iab.utils.C1402l;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.view.C1475a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;

public class MraidView extends C1475a implements IabClickCallback, C1475a.C1479d {

    /* renamed from: A */
    public final String f4089A;

    /* renamed from: B */
    public final float f4090B;

    /* renamed from: C */
    public final float f4091C;

    /* renamed from: D */
    public final float f4092D;

    /* renamed from: E */
    public final boolean f4093E;

    /* renamed from: F */
    public final boolean f4094F;

    /* renamed from: G */
    public final boolean f4095G;

    /* renamed from: H */
    public final boolean f4096H;

    /* renamed from: I */
    public final AtomicBoolean f4097I;

    /* renamed from: J */
    public final AtomicBoolean f4098J;

    /* renamed from: K */
    public final AtomicBoolean f4099K;

    /* renamed from: L */
    public boolean f4100L;

    /* renamed from: M */
    public boolean f4101M;

    /* renamed from: N */
    public boolean f4102N;

    /* renamed from: O */
    public final C1475a.C1479d f4103O;

    /* renamed from: P */
    public final IabElementStyle f4104P;

    /* renamed from: Q */
    public final IabElementStyle f4105Q;

    /* renamed from: R */
    public final IabElementStyle f4106R;

    /* renamed from: S */
    public final IabElementStyle f4107S;

    /* renamed from: T */
    public C1402l f4108T;

    /* renamed from: U */
    public C1400j f4109U;

    /* renamed from: V */
    public Runnable f4110V;

    /* renamed from: W */
    public Integer f4111W;

    /* renamed from: h */
    public final MutableContextWrapper f4112h;

    /* renamed from: i */
    public C1363h f4113i;

    /* renamed from: j */
    public final C1370j f4114j;

    /* renamed from: k */
    public C1370j f4115k;

    /* renamed from: l */
    public C1475a f4116l;

    /* renamed from: m */
    public C1475a f4117m;

    /* renamed from: n */
    public C1398h f4118n;

    /* renamed from: o */
    public WeakReference<Activity> f4119o;

    /* renamed from: p */
    public final GestureDetector f4120p;

    /* renamed from: q */
    public final C1356b f4121q;

    /* renamed from: r */
    public final C1360f f4122r;

    /* renamed from: s */
    public final C1374k f4123s;

    /* renamed from: t */
    public String f4124t;

    /* renamed from: u */
    public MraidViewListener f4125u;

    /* renamed from: v */
    public final MraidAdMeasurer f4126v;

    /* renamed from: w */
    public final C1358d f4127w;

    /* renamed from: x */
    public final CacheControl f4128x;

    /* renamed from: y */
    public final String f4129y;

    /* renamed from: z */
    public final String f4130z;

    public static class Builder {

        /* renamed from: a */
        public final C1358d f4131a;

        /* renamed from: b */
        public CacheControl f4132b;

        /* renamed from: c */
        public String f4133c;

        /* renamed from: d */
        public String f4134d;

        /* renamed from: e */
        public String f4135e;

        /* renamed from: f */
        public String[] f4136f;

        /* renamed from: g */
        public IabElementStyle f4137g;

        /* renamed from: h */
        public IabElementStyle f4138h;

        /* renamed from: i */
        public IabElementStyle f4139i;

        /* renamed from: j */
        public IabElementStyle f4140j;

        /* renamed from: k */
        public float f4141k;

        /* renamed from: l */
        public float f4142l;
        public MraidViewListener listener;

        /* renamed from: m */
        public float f4143m;
        public MraidAdMeasurer mraidAdMeasurer;

        /* renamed from: n */
        public boolean f4144n;

        /* renamed from: o */
        public boolean f4145o;

        /* renamed from: p */
        public boolean f4146p;

        /* renamed from: q */
        public boolean f4147q;

        public Builder() {
            this(C1358d.INLINE);
        }

        public Builder(C1358d dVar) {
            this.f4136f = null;
            this.f4141k = 3.0f;
            this.f4142l = 0.0f;
            this.f4143m = 0.0f;
            this.f4131a = dVar;
            this.f4132b = CacheControl.FullLoad;
            this.f4133c = "https://localhost";
        }

        public MraidView build(Context context) {
            return new MraidView(context, this, (C1343c) null);
        }

        public Builder forceUseNativeCloseButton(boolean z) {
            this.f4145o = z;
            return this;
        }

        public Builder setAdMeasurer(MraidAdMeasurer mraidAdMeasurer2) {
            this.mraidAdMeasurer = mraidAdMeasurer2;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f4133c = str;
            return this;
        }

        public Builder setCacheControl(CacheControl cacheControl) {
            this.f4132b = cacheControl;
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.f4137g = iabElementStyle;
            return this;
        }

        public Builder setCloseTimeSec(float f) {
            this.f4142l = f;
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.f4138h = iabElementStyle;
            return this;
        }

        public Builder setDurationSec(float f) {
            this.f4143m = f;
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.f4144n = z;
            return this;
        }

        public Builder setListener(MraidViewListener mraidViewListener) {
            this.listener = mraidViewListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.f4139i = iabElementStyle;
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f4135e = str;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f) {
            this.f4141k = f;
            return this;
        }

        public Builder setProductLink(String str) {
            this.f4134d = str;
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.f4140j = iabElementStyle;
            return this;
        }

        public Builder setR1(boolean z) {
            this.f4146p = z;
            return this;
        }

        public Builder setR2(boolean z) {
            this.f4147q = z;
            return this;
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$a */
    public class C1341a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f4148a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f4149b;

        public C1341a(View view, Runnable runnable) {
            this.f4148a = view;
            this.f4149b = runnable;
        }

        public void run() {
            MraidView.this.mo3813b(this.f4148a);
            Runnable runnable = this.f4149b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$b */
    public static /* synthetic */ class C1342b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4151a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.iab.CacheControl[] r0 = com.explorestack.iab.CacheControl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4151a = r0
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.FullLoad     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4151a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.Stream     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4151a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.PartialLoad     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidView.C1342b.<clinit>():void");
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$c */
    public class C1343c extends GestureDetector.SimpleOnGestureListener {
        public C1343c() {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$d */
    public class C1344d extends C1354l {
        public C1344d() {
            super(MraidView.this, (C1343c) null);
        }

        /* renamed from: a */
        public void mo3864a(boolean z) {
            if (z) {
                MraidView.this.mo3832m();
                if (!MraidView.this.f4100L) {
                    boolean unused = MraidView.this.f4100L = true;
                    if (MraidView.this.f4125u != null) {
                        MraidView.this.f4125u.onShown(MraidView.this);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo3865b(boolean z) {
            if (!MraidView.this.f4094F) {
                if (z && !MraidView.this.f4102N) {
                    boolean unused = MraidView.this.f4102N = true;
                }
                MraidView mraidView = MraidView.this;
                mraidView.mo3807a(mraidView.f4114j);
            }
        }

        /* renamed from: d */
        public void mo3866d(String str) {
            MraidView.this.mo3815c(str);
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$e */
    public class C1345e implements C1402l.C1405c {
        public C1345e() {
        }

        /* renamed from: a */
        public void mo3867a() {
            MraidView.this.f4109U.mo4117c();
            if (!MraidView.this.f4101M && MraidView.this.f4096H && MraidView.this.f4092D > 0.0f) {
                MraidView.this.mo3827i();
            }
        }

        /* renamed from: a */
        public void mo3868a(float f, long j, long j2) {
            int i = (int) (j / 1000);
            MraidView.this.f4109U.mo4129a(f, i, (int) (j2 / 1000));
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$f */
    public class C1346f implements C1475a.C1479d {
        public C1346f() {
        }

        public void onCloseClick() {
            MraidView.this.mo3800a(2);
        }

        public void onCountDownFinish() {
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$g */
    public class C1347g implements Runnable {
        public C1347g() {
        }

        public void run() {
            if (MraidView.this.f4113i == C1363h.RESIZED) {
                MraidView.this.mo3823e();
            } else if (MraidView.this.f4113i == C1363h.EXPANDED) {
                MraidView.this.mo3820d();
            } else if (MraidView.this.mo3828j()) {
                MraidView.this.setViewState(C1363h.HIDDEN);
                if (MraidView.this.f4125u != null) {
                    MraidView.this.f4125u.onClose(MraidView.this);
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$h */
    public class C1348h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1370j f4157a;

        /* renamed from: com.explorestack.iab.mraid.MraidView$h$a */
        public class C1349a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Point f4159a;

            /* renamed from: com.explorestack.iab.mraid.MraidView$h$a$a */
            public class C1350a implements Runnable {
                public C1350a() {
                }

                public void run() {
                    MraidView.this.mo3825g();
                }
            }

            public C1349a(Point point) {
                this.f4159a = point;
            }

            public void run() {
                C1350a aVar = new C1350a();
                C1348h hVar = C1348h.this;
                MraidView mraidView = MraidView.this;
                Point point = this.f4159a;
                mraidView.mo3811b(point.x, point.y, hVar.f4157a, aVar);
            }
        }

        public C1348h(C1370j jVar) {
            this.f4157a = jVar;
        }

        public void run() {
            IabElementStyle resolveDefCloseStyle = Assets.resolveDefCloseStyle(MraidView.this.getContext(), MraidView.this.f4104P);
            Point clickPoint = Utils.getClickPoint(MraidView.this.f4122r.mo3903e(), resolveDefCloseStyle.getHorizontalPosition().intValue(), resolveDefCloseStyle.getVerticalPosition().intValue());
            MraidView.this.mo3801a(clickPoint.x, clickPoint.y, this.f4157a, new C1349a(clickPoint));
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$i */
    public class C1351i extends C1354l {
        public C1351i() {
            super(MraidView.this, (C1343c) null);
        }

        /* renamed from: a */
        public void mo3864a(boolean z) {
        }

        /* renamed from: b */
        public void mo3865b(boolean z) {
            if (MraidView.this.f4115k != null) {
                MraidView mraidView = MraidView.this;
                mraidView.mo3807a(mraidView.f4115k);
            }
        }

        /* renamed from: d */
        public void mo3866d(String str) {
            MraidView.this.mo3826h();
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$j */
    public class C1352j implements Runnable {
        public C1352j() {
        }

        public void run() {
            MraidView.this.mo3809a((Runnable) null);
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$k */
    public class C1353k implements Runnable {
        public C1353k() {
        }

        public void run() {
            MraidView.this.f4115k.mo3932a(MraidView.this.f4121q);
            MraidView.this.f4115k.mo3933a(MraidView.this.f4127w);
            MraidView.this.f4115k.mo3940a(MraidView.this.f4115k.mo3949f());
            MraidView.this.f4115k.mo3935a(MraidView.this.f4113i);
            MraidView.this.f4115k.mo3942b(MraidView.this.f4089A);
            MraidView.this.f4115k.mo3951h();
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$l */
    public abstract class C1354l implements C1370j.C1372b {
        private C1354l() {
        }

        public /* synthetic */ C1354l(MraidView mraidView, C1343c cVar) {
            this();
        }

        /* renamed from: a */
        public void mo3875a() {
            MraidLog.m5985d("MRAIDView", "Callback: onLoaded");
            MraidView.this.mo3830l();
        }

        /* renamed from: a */
        public void mo3876a(int i) {
            MraidLog.m5985d("MRAIDView", "Callback: onError (" + i + ")");
            MraidView.this.mo3800a(i);
        }

        /* renamed from: a */
        public void mo3877a(C1357c cVar) {
            MraidLog.m5985d("MRAIDView", "Callback: onOrientation " + cVar);
            if (MraidView.this.mo3828j() || MraidView.this.f4113i == C1363h.EXPANDED) {
                MraidView.this.mo3804a(cVar);
            }
        }

        /* renamed from: a */
        public void mo3878a(C1359e eVar) {
            MraidLog.m5985d("MRAIDView", "Callback: onResize (" + eVar + ")");
            MraidView.this.mo3805a(eVar);
        }

        /* renamed from: a */
        public void mo3879a(String str) {
            MraidLog.m5985d("MRAIDView", "Callback: onOpen (" + str + ")");
            MraidView.this.mo3814b(str);
        }

        /* renamed from: b */
        public void mo3880b() {
            MraidLog.m5985d("MRAIDView", "Callback: onClose");
            MraidView.this.mo3824f();
        }

        /* renamed from: b */
        public void mo3881b(String str) {
            MraidLog.m5985d("MRAIDView", "Callback: onExpand " + str);
            if (!MraidView.this.mo3828j()) {
                MraidView.this.mo3810a(str);
            }
        }

        /* renamed from: c */
        public void mo3882c(String str) {
            MraidLog.m5985d("MRAIDView", "Callback: playVideo " + str);
            try {
                String decode = URLDecoder.decode(str, "UTF-8");
                if (MraidView.this.f4125u != null) {
                    MraidView.this.f4125u.onPlayVideo(MraidView.this, decode);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    private MraidView(Context context, Builder builder) {
        super(context);
        this.f4113i = C1363h.LOADING;
        this.f4097I = new AtomicBoolean(false);
        this.f4098J = new AtomicBoolean(false);
        this.f4099K = new AtomicBoolean(false);
        this.f4100L = false;
        this.f4101M = false;
        this.f4102N = false;
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context);
        this.f4112h = mutableContextWrapper;
        this.f4125u = builder.listener;
        this.f4127w = builder.f4131a;
        this.f4128x = builder.f4132b;
        this.f4129y = builder.f4133c;
        this.f4130z = builder.f4134d;
        this.f4089A = builder.f4135e;
        this.f4090B = builder.f4141k;
        this.f4091C = builder.f4142l;
        float o = builder.f4143m;
        this.f4092D = o;
        this.f4093E = builder.f4144n;
        this.f4094F = builder.f4145o;
        this.f4095G = builder.f4146p;
        this.f4096H = builder.f4147q;
        MraidAdMeasurer mraidAdMeasurer = builder.mraidAdMeasurer;
        this.f4126v = mraidAdMeasurer;
        this.f4104P = builder.f4137g;
        this.f4105Q = builder.f4138h;
        this.f4106R = builder.f4139i;
        IabElementStyle h = builder.f4140j;
        this.f4107S = h;
        this.f4121q = new C1356b(builder.f4136f);
        this.f4122r = new C1360f(context);
        this.f4123s = new C1374k();
        this.f4120p = new GestureDetector(context, new C1343c());
        C1370j jVar = new C1370j(mutableContextWrapper, new C1344d());
        this.f4114j = jVar;
        addView(jVar.mo3943c(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (o > 0.0f) {
            C1400j jVar2 = new C1400j((View.OnClickListener) null);
            this.f4109U = jVar2;
            jVar2.mo4113a(context, (ViewGroup) this, h);
            C1402l lVar = new C1402l(this, new C1345e());
            this.f4108T = lVar;
            lVar.mo4133a(o);
        }
        this.f4103O = new C1346f();
        setCloseClickListener(this);
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.registerAdContainer(this);
            mraidAdMeasurer.registerAdView(jVar.mo3943c());
        }
    }

    public /* synthetic */ MraidView(Context context, Builder builder, C1343c cVar) {
        this(context, builder);
    }

    private void setResizedViewSizeAndPosition(C1359e eVar) {
        MraidLog.m5985d("MRAIDView", "setResizedViewSizeAndPosition: " + eVar);
        if (this.f4116l != null) {
            int dpToPx = Utils.dpToPx(getContext(), (float) eVar.f4172a);
            int dpToPx2 = Utils.dpToPx(getContext(), (float) eVar.f4173b);
            int dpToPx3 = Utils.dpToPx(getContext(), (float) eVar.f4174c);
            int dpToPx4 = Utils.dpToPx(getContext(), (float) eVar.f4175d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx2);
            Rect b = this.f4122r.mo3898b();
            layoutParams.leftMargin = b.left + dpToPx3;
            layoutParams.topMargin = b.top + dpToPx4;
            this.f4116l.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final MotionEvent mo3799a(int i, int i2, int i3) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i, (float) i2, (float) i3, 0);
    }

    /* renamed from: a */
    public final void mo3800a(int i) {
        if (this.f4125u == null) {
            return;
        }
        if (this.f4128x != CacheControl.PartialLoad || !this.f4097I.get() || this.f4099K.get() || i != 0) {
            this.f4125u.onError(this, i);
        } else {
            this.f4125u.onError(this, 3);
        }
    }

    /* renamed from: a */
    public final void mo3801a(int i, int i2, C1370j jVar, Runnable runnable) {
        if (!this.f4101M) {
            mo3806a(jVar.mo3943c(), i, i2);
            this.f4110V = runnable;
            postDelayed(runnable, 150);
        }
    }

    /* renamed from: a */
    public final void mo3802a(Activity activity) {
        Integer num = this.f4111W;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.f4111W = null;
        }
    }

    /* renamed from: a */
    public final void mo3803a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
            Utils.removeFromParent(view);
        }
    }

    /* renamed from: a */
    public final void mo3804a(C1357c cVar) {
        if (cVar != null) {
            Activity peekActivity = peekActivity();
            MraidLog.m5985d("MRAIDView", "applyOrientation: " + cVar);
            if (peekActivity == null) {
                MraidLog.m5985d("MRAIDView", "no any interacted activities");
                return;
            }
            mo3812b(peekActivity);
            peekActivity.setRequestedOrientation(cVar.mo3888a((Context) peekActivity));
        }
    }

    /* renamed from: a */
    public final void mo3805a(C1359e eVar) {
        C1363h hVar = this.f4113i;
        if (hVar == C1363h.LOADING || hVar == C1363h.HIDDEN || hVar == C1363h.EXPANDED || this.f4127w == C1358d.INTERSTITIAL) {
            MraidLog.m5985d("MRAIDView", "Callback: onResize (invalidate state: " + this.f4113i + ")");
            return;
        }
        C1475a aVar = this.f4116l;
        if (aVar == null || aVar.getParent() == null) {
            View a = C1361g.m6109a(mo3833n(), (View) this);
            if (!(a instanceof ViewGroup)) {
                MraidLog.m5982a("MRAIDView", "Can't add resized view because can't find required parent");
                return;
            }
            C1475a aVar2 = new C1475a(getContext());
            this.f4116l = aVar2;
            aVar2.setCloseClickListener(this);
            ((ViewGroup) a).addView(this.f4116l);
        }
        C1364i c = this.f4114j.mo3943c();
        Utils.removeFromParent(c);
        this.f4116l.addView(c);
        IabElementStyle resolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.f4104P);
        resolveDefCloseStyle.setHorizontalPosition(Integer.valueOf(eVar.f4176e.mo3966a() & 7));
        resolveDefCloseStyle.setVerticalPosition(Integer.valueOf(eVar.f4176e.mo3966a() & 112));
        this.f4116l.setCloseStyle(resolveDefCloseStyle);
        this.f4116l.setCloseVisibility(false, this.f4091C);
        setResizedViewSizeAndPosition(eVar);
        setViewState(C1363h.RESIZED);
    }

    /* renamed from: a */
    public final void mo3806a(C1364i iVar, int i, int i2) {
        iVar.dispatchTouchEvent(mo3799a(0, i, i2));
        iVar.dispatchTouchEvent(mo3799a(1, i, i2));
    }

    /* renamed from: a */
    public final void mo3807a(C1370j jVar) {
        boolean z = !jVar.mo3948e() || this.f4094F;
        C1475a aVar = this.f4116l;
        if (aVar != null || (aVar = this.f4117m) != null) {
            aVar.setCloseVisibility(z, this.f4091C);
        } else if (mo3828j()) {
            setCloseVisibility(z, this.f4102N ? 0.0f : this.f4091C);
        }
    }

    /* renamed from: a */
    public final void mo3808a(C1475a aVar, C1370j jVar) {
        setCloseClickListener(this);
        aVar.setCloseStyle(this.f4104P);
        aVar.setCountDownStyle(this.f4105Q);
        mo3807a(jVar);
    }

    /* renamed from: a */
    public final void mo3809a(Runnable runnable) {
        C1370j jVar = this.f4115k;
        if (jVar == null) {
            jVar = this.f4114j;
        }
        C1364i c = jVar.mo3943c();
        this.f4123s.mo3959a(this, c).mo3962a((Runnable) new C1341a(c, runnable));
    }

    /* renamed from: a */
    public final void mo3810a(String str) {
        C1370j jVar;
        if (!mo3828j()) {
            C1363h hVar = this.f4113i;
            if (hVar == C1363h.DEFAULT || hVar == C1363h.RESIZED) {
                if (str == null) {
                    jVar = this.f4114j;
                } else {
                    try {
                        String decode = URLDecoder.decode(str, "UTF-8");
                        if (!decode.startsWith("http://") && !decode.startsWith("https://")) {
                            decode = this.f4129y + decode;
                        }
                        C1370j jVar2 = new C1370j(this.f4112h, new C1351i());
                        this.f4115k = jVar2;
                        jVar2.mo3944c(decode);
                        jVar = jVar2;
                    } catch (UnsupportedEncodingException unused) {
                        return;
                    }
                }
                C1475a aVar = this.f4117m;
                if (aVar == null || aVar.getParent() == null) {
                    View a = C1361g.m6109a(mo3833n(), (View) this);
                    if (!(a instanceof ViewGroup)) {
                        MraidLog.m5982a("MRAIDView", "Can't add resized view because can't find required parent");
                        return;
                    }
                    C1475a aVar2 = new C1475a(getContext());
                    this.f4117m = aVar2;
                    aVar2.setCloseClickListener(this);
                    ((ViewGroup) a).addView(this.f4117m);
                }
                C1364i c = jVar.mo3943c();
                Utils.removeFromParent(c);
                this.f4117m.addView(c);
                mo3808a(this.f4117m, jVar);
                mo3804a(jVar.mo3941b());
                setViewState(C1363h.EXPANDED);
                MraidViewListener mraidViewListener = this.f4125u;
                if (mraidViewListener != null) {
                    mraidViewListener.onExpand(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo3811b(int i, int i2, C1370j jVar, Runnable runnable) {
        if (!this.f4101M) {
            jVar.mo3931a(i, i2);
            this.f4110V = runnable;
            postDelayed(runnable, 150);
        }
    }

    /* renamed from: b */
    public final void mo3812b(Activity activity) {
        this.f4111W = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* renamed from: b */
    public final void mo3813b(View view) {
        Context n = mo3833n();
        DisplayMetrics displayMetrics = n.getResources().getDisplayMetrics();
        this.f4122r.mo3895a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        View b = C1361g.m6118b(n, (View) this);
        b.getLocationOnScreen(iArr);
        this.f4122r.mo3901c(iArr[0], iArr[1], b.getWidth(), b.getHeight());
        getLocationOnScreen(iArr);
        this.f4122r.mo3899b(iArr[0], iArr[1], getWidth(), getHeight());
        view.getLocationOnScreen(iArr);
        this.f4122r.mo3896a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        this.f4114j.mo3934a(this.f4122r);
        C1370j jVar = this.f4115k;
        if (jVar != null) {
            jVar.mo3934a(this.f4122r);
        }
    }

    /* renamed from: b */
    public void mo3814b(String str) {
        this.f4101M = true;
        removeCallbacks(this.f4110V);
        if (this.f4125u != null && !str.startsWith("tel") && !str.startsWith("sms")) {
            setLoadingVisible(true);
            this.f4125u.onOpenBrowser(this, str, this);
        }
    }

    /* renamed from: c */
    public final void mo3815c(String str) {
        if (this.f4113i == C1363h.LOADING) {
            this.f4114j.mo3932a(this.f4121q);
            this.f4114j.mo3933a(this.f4127w);
            C1370j jVar = this.f4114j;
            jVar.mo3940a(jVar.mo3949f());
            this.f4114j.mo3942b(this.f4089A);
            mo3813b((View) this.f4114j.mo3943c());
            setViewState(C1363h.DEFAULT);
            mo3832m();
            setLoadingVisible(false);
            if (mo3828j()) {
                mo3808a((C1475a) this, this.f4114j);
            }
            MraidAdMeasurer mraidAdMeasurer = this.f4126v;
            if (mraidAdMeasurer != null) {
                mraidAdMeasurer.onAdViewReady(this.f4114j.mo3943c());
            }
            if (this.f4128x == CacheControl.FullLoad && !this.f4093E && !str.equals("data:text/html,<html></html>")) {
                mo3830l();
            }
        }
    }

    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > C1361g.f4187a || this.f4114j.mo3946d()) {
            return true;
        }
        if (this.f4094F || !this.f4114j.mo3948e()) {
            return super.canBeClosed();
        }
        return false;
    }

    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    public void clickHandleError() {
        setLoadingVisible(false);
    }

    public void clickHandled() {
        setLoadingVisible(false);
    }

    /* renamed from: d */
    public final void mo3820d() {
        mo3803a((View) this.f4117m);
        this.f4117m = null;
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            mo3802a(peekActivity);
        }
        C1370j jVar = this.f4115k;
        if (jVar != null) {
            jVar.mo3930a();
            this.f4115k = null;
        } else {
            addView(this.f4114j.mo3943c());
        }
        setViewState(C1363h.DEFAULT);
    }

    /* renamed from: d */
    public final void mo3821d(String str) {
        if (str == null && this.f4129y == null) {
            mo3800a(0);
            return;
        }
        this.f4114j.mo3938a(this.f4129y, String.format("<script type='application/javascript'>%s</script>%s%s", new Object[]{C1361g.m6119b(), JsBridgeHandler.m5941a(), C1361g.m6124d(str)}), "text/html", "UTF-8");
        this.f4114j.mo3936a(MraidLog.m5980a());
    }

    public void destroy() {
        this.f4125u = null;
        this.f4119o = null;
        this.f4123s.mo3960a();
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            mo3802a(peekActivity);
        }
        mo3803a((View) this.f4116l);
        mo3803a((View) this.f4117m);
        this.f4114j.mo3930a();
        C1370j jVar = this.f4115k;
        if (jVar != null) {
            jVar.mo3930a();
        }
        C1402l lVar = this.f4108T;
        if (lVar != null) {
            lVar.mo4132a();
        }
    }

    /* renamed from: e */
    public final void mo3823e() {
        mo3803a((View) this.f4116l);
        this.f4116l = null;
        addView(this.f4114j.mo3943c());
        setViewState(C1363h.DEFAULT);
    }

    /* renamed from: f */
    public void mo3824f() {
        if (this.f4101M || !this.f4095G) {
            Utils.onUiThread(new C1347g());
        } else {
            mo3827i();
        }
    }

    /* renamed from: g */
    public final void mo3825g() {
        if (!this.f4101M && !TextUtils.isEmpty(this.f4130z)) {
            mo3814b(this.f4130z);
        }
    }

    /* renamed from: h */
    public final void mo3826h() {
        if (this.f4115k != null) {
            mo3809a((Runnable) new C1353k());
        }
    }

    /* renamed from: i */
    public final void mo3827i() {
        C1370j jVar = this.f4115k;
        if (jVar == null) {
            jVar = this.f4114j;
        }
        C1348h hVar = new C1348h(jVar);
        Point defaultClickPoint = Utils.getDefaultClickPoint(this.f4122r.mo3903e());
        mo3801a(defaultClickPoint.x, defaultClickPoint.y, jVar, hVar);
    }

    /* renamed from: j */
    public boolean mo3828j() {
        return this.f4127w == C1358d.INTERSTITIAL;
    }

    /* renamed from: k */
    public final boolean mo3829k() {
        return this.f4113i != C1363h.LOADING;
    }

    /* renamed from: l */
    public final void mo3830l() {
        MraidViewListener mraidViewListener;
        if (!this.f4097I.getAndSet(true) && (mraidViewListener = this.f4125u) != null) {
            mraidViewListener.onLoaded(this);
        }
    }

    public void load(String str) {
        int i = C1342b.f4151a[this.f4128x.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f4124t = str;
                mo3830l();
                return;
            } else if (i == 3) {
                mo3830l();
            } else {
                return;
            }
        }
        mo3821d(str);
    }

    /* renamed from: m */
    public final void mo3832m() {
        if (!this.f4098J.getAndSet(true)) {
            this.f4114j.mo3951h();
        }
    }

    /* renamed from: n */
    public final Context mo3833n() {
        Activity peekActivity = peekActivity();
        return peekActivity == null ? getContext() : peekActivity;
    }

    /* renamed from: o */
    public final void mo3834o() {
        setCloseClickListener(this.f4103O);
        setCloseVisibility(true, this.f4090B);
    }

    public void onCloseClick() {
        mo3824f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MraidLog.m5985d("MRAIDView", "onConfigurationChanged: " + Utils.orientationToString(configuration.orientation));
        Utils.onUiThread(new C1352j());
    }

    public void onCountDownFinish() {
        if (!this.f4101M && this.f4096H && this.f4092D == 0.0f) {
            mo3827i();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4120p.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public Activity peekActivity() {
        WeakReference<Activity> weakReference = this.f4119o;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void setLastInteractedActivity(Activity activity) {
        if (activity != null) {
            this.f4119o = new WeakReference<>(activity);
            this.f4112h.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z) {
        if (z) {
            if (this.f4118n == null) {
                C1398h hVar = new C1398h((View.OnClickListener) null);
                this.f4118n = hVar;
                hVar.mo4113a(getContext(), (ViewGroup) this, this.f4106R);
            }
            this.f4118n.mo4112a(0);
            this.f4118n.mo4111a();
            return;
        }
        C1398h hVar2 = this.f4118n;
        if (hVar2 != null) {
            hVar2.mo4112a(8);
        }
    }

    public void setViewState(C1363h hVar) {
        this.f4113i = hVar;
        this.f4114j.mo3935a(hVar);
        C1370j jVar = this.f4115k;
        if (jVar != null) {
            jVar.mo3935a(hVar);
        }
        if (hVar != C1363h.HIDDEN) {
            mo3809a((Runnable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (mo3828j() != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (mo3828j() != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show(android.app.Activity r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f4099K
            r1 = 1
            r0.set(r1)
            int[] r0 = com.explorestack.iab.mraid.MraidView.C1342b.f4151a
            com.explorestack.iab.CacheControl r2 = r3.f4128x
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r1) goto L_0x0042
            r1 = 2
            if (r0 == r1) goto L_0x0030
            r1 = 3
            if (r0 == r1) goto L_0x0019
            goto L_0x0050
        L_0x0019:
            boolean r0 = r3.mo3829k()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.mo3828j()
            if (r0 == 0) goto L_0x004d
            goto L_0x0048
        L_0x0026:
            boolean r0 = r3.mo3828j()
            if (r0 == 0) goto L_0x0050
            r3.mo3834o()
            goto L_0x0050
        L_0x0030:
            boolean r0 = r3.mo3828j()
            if (r0 == 0) goto L_0x0039
            r3.mo3834o()
        L_0x0039:
            java.lang.String r0 = r3.f4124t
            r3.mo3821d((java.lang.String) r0)
            r0 = 0
            r3.f4124t = r0
            goto L_0x0050
        L_0x0042:
            boolean r0 = r3.mo3828j()
            if (r0 == 0) goto L_0x004d
        L_0x0048:
            com.explorestack.iab.mraid.j r0 = r3.f4114j
            r3.mo3808a((com.explorestack.iab.view.C1475a) r3, (com.explorestack.iab.mraid.C1370j) r0)
        L_0x004d:
            r3.mo3832m()
        L_0x0050:
            r3.setLastInteractedActivity(r4)
            com.explorestack.iab.mraid.j r4 = r3.f4114j
            com.explorestack.iab.mraid.c r4 = r4.mo3941b()
            r3.mo3804a((com.explorestack.iab.mraid.C1357c) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidView.show(android.app.Activity):void");
    }
}
