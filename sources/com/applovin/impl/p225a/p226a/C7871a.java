package com.applovin.impl.p225a.p226a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.p225a.p226a.p227a.C7878a;
import com.applovin.impl.p225a.p226a.p228b.p229a.C7883b;
import com.applovin.impl.sdk.C8397e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.C8573j;
import com.applovin.impl.sdk.utils.C8612l;
import com.applovin.impl.sdk.utils.C8616p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.a.a.a */
public class C7871a implements C8573j.C8574a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static WeakReference<MaxCreativeDebuggerActivity> f18974f;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicBoolean f18975l = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f18976a;

    /* renamed from: b */
    private final Context f18977b;

    /* renamed from: c */
    private final List<C7878a> f18978c = new ArrayList(10);

    /* renamed from: d */
    private final Object f18979d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7883b f18980e;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WeakReference<View> f18981g = new WeakReference<>((Object) null);

    /* renamed from: h */
    private C8573j f18982h;

    /* renamed from: i */
    private C8616p f18983i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f18984j;

    /* renamed from: k */
    private boolean f18985k;

    public C7871a(C8490n nVar) {
        this.f18976a = nVar;
        this.f18977b = nVar.mo57332P();
        this.f18980e = new C7883b(this.f18977b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.widget.Button} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m23308a(android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 40
            int r0 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r0)
            int r1 = r0 / 10
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r0, r0, r3)
            r2.setMargins(r1, r1, r1, r1)
            android.widget.ImageButton r0 = new android.widget.ImageButton     // Catch:{ all -> 0x0030 }
            r0.<init>(r6)     // Catch:{ all -> 0x0030 }
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ all -> 0x0030 }
            int r4 = com.applovin.sdk.C8656R.C8659drawable.applovin_ic_white_small     // Catch:{ all -> 0x0030 }
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)     // Catch:{ all -> 0x0030 }
            r0.setImageDrawable(r3)     // Catch:{ all -> 0x0030 }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0030 }
            r0.setScaleType(r3)     // Catch:{ all -> 0x0030 }
            int r3 = r1 * 2
            r0.setPadding(r1, r1, r1, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x004b
        L_0x0030:
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r6)
            java.lang.String r1 = "ⓘ"
            r0.setText(r1)
            r1 = -1
            r0.setTextColor(r1)
            r1 = 0
            r0.setAllCaps(r1)
            r3 = 1101004800(0x41a00000, float:20.0)
            r4 = 2
            r0.setTextSize(r4, r3)
            r0.setPadding(r1, r1, r1, r1)
        L_0x004b:
            r0.setLayoutParams(r2)
            android.graphics.drawable.Drawable r1 = r5.m23323k()
            r0.setBackground(r1)
            com.applovin.impl.a.a.a$6 r1 = new com.applovin.impl.a.a.a$6
            r1.<init>()
            r0.setOnClickListener(r1)
            boolean r1 = com.applovin.impl.sdk.utils.C8571h.m26086d()
            if (r1 == 0) goto L_0x006c
            r1 = 5
            int r6 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r1)
            float r6 = (float) r6
            r0.setElevation(r6)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p225a.p226a.C7871a.m23308a(android.app.Activity):android.view.View");
    }

    /* renamed from: c */
    private boolean m23314c(Object obj) {
        MaxAdFormat b = obj instanceof C8350e ? ((C8350e) obj).getAdZone().mo56937b() : obj instanceof C8070a ? ((C8070a) obj).getFormat() : null;
        return b != null && b.isFullscreenAd();
    }

    /* renamed from: d */
    private Bundle m23315d(Object obj) {
        Bundle a = this.f18976a.mo57321E().mo57161a(Utils.getAdServeId(obj));
        if (a == null) {
            return null;
        }
        for (String str : a.keySet()) {
            Object obj2 = a.get(str);
            a.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m23320h() {
        WeakReference<MaxCreativeDebuggerActivity> weakReference = f18974f;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: i */
    private void m23321i() {
        this.f18976a.mo57368ai().mo56832a(new C8561a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    C8626v.m26255f("AppLovinSdk", "Started Creative Debugger");
                    if (!C7871a.this.m23320h() || C7871a.f18974f.get() != activity) {
                        MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                        WeakReference unused = C7871a.f18974f = new WeakReference(maxCreativeDebuggerActivity);
                        maxCreativeDebuggerActivity.mo55470a(C7871a.this.f18980e, C7871a.this.f18976a.mo57368ai());
                    }
                    C7871a.f18975l.set(false);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    C8626v.m26255f("AppLovinSdk", "Creative Debugger destroyed");
                    WeakReference unused = C7871a.f18974f = null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m23322j() {
        if (this.f18981g.get() == null && !m23320h()) {
            Activity a = this.f18976a.mo57368ai().mo56831a();
            if (a == null) {
                this.f18976a.mo57320D();
                if (C8626v.m26252a()) {
                    this.f18976a.mo57320D().mo57822e("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = a.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = m23308a(a);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                a2.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                final C78754 r8 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (a2.getParent() == null && C7871a.this.f18981g.get() != null) {
                            frameLayout.addView(a2);
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r8);
                final View view = a2;
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        frameLayout.removeView(view);
                        WeakReference unused = C7871a.this.f18981g = new WeakReference((Object) null);
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(r8);
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(5));
                this.f18981g = new WeakReference<>(a2);
            }
        }
    }

    /* renamed from: k */
    private Drawable m23323k() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* renamed from: a */
    public String mo55450a(C7878a aVar) {
        Object c = aVar.mo55468c();
        C8612l lVar = new C8612l();
        lVar.mo57751b("Ad Info:\n");
        if (c instanceof C8350e) {
            C8350e eVar = (C8350e) c;
            lVar.mo57748a(LogConstants.KEY_NETWORK, "APPLOVIN").mo57745a(eVar).mo57750b(eVar);
        } else if (c instanceof C8070a) {
            lVar.mo57744a((C8070a) c);
        }
        lVar.mo57746a(this.f18976a);
        lVar.mo57748a("Epoch Timestamp (ms)", Long.valueOf(aVar.mo55469d()));
        lVar.mo57747a("\nDebug Info:\n").mo57748a("Platform", "fireos".equals(this.f18976a.mo57340Y().mo57631f()) ? "Fire OS" : APSAnalytics.OS_NAME).mo57748a("AppLovin SDK Version", AppLovinSdk.VERSION).mo57748a("Plugin Version", this.f18976a.mo57342a(C8380b.f20864dI)).mo57748a("App Package Name", this.f18977b.getPackageName()).mo57748a("Device", String.format("%s %s (%s)", new Object[]{Build.BRAND, Build.MODEL, Build.DEVICE})).mo57748a("OS Version", Build.VERSION.RELEASE).mo57748a("AppLovin Random Token", this.f18976a.mo57399p()).mo57748a("Ad Review Version", C8397e.m25291a()).mo57742a(m23315d(c));
        return lVar.toString();
    }

    /* renamed from: a */
    public void mo55451a() {
        if (mo55456c() && this.f18982h == null) {
            C8573j jVar = new C8573j(this.f18976a, this);
            this.f18982h = jVar;
            jVar.mo57702a();
        }
    }

    /* renamed from: a */
    public void mo55452a(C7878a aVar, Context context, boolean z) {
        Object c = aVar.mo55468c();
        String a = mo55450a(aVar);
        C8612l lVar = new C8612l();
        if (z) {
            lVar.mo57751b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lVar.mo57751b(a);
        String b = this.f18976a.mo57373an().mo55454b(c);
        if (b != null) {
            lVar.mo57747a("\nBid Response:\n");
            lVar.mo57747a(b);
        }
        String str = "AppLovin Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", c instanceof C8350e ? str : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage((String) null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(c instanceof C8350e)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        context.startActivity(createChooser);
    }

    /* renamed from: a */
    public void mo55453a(Object obj) {
        if (!mo55456c() || obj == null) {
            return;
        }
        if (C8134c.m24358a(obj) && !m23314c(obj)) {
            return;
        }
        if (!C8134c.m24361b(obj) || !m23314c(obj)) {
            synchronized (this.f18979d) {
                this.f18978c.add(0, new C7878a(obj, System.currentTimeMillis()));
                if (this.f18978c.size() > 10) {
                    this.f18978c.remove(this.f18978c.size() - 1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r3 = new com.applovin.impl.sdk.p252ad.C8347c(r0, r2.f18976a).mo56931d();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo55454b(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.applovin.impl.sdk.p252ad.C8350e
            if (r0 == 0) goto L_0x000f
            com.applovin.impl.sdk.ad.e r3 = (com.applovin.impl.sdk.p252ad.C8350e) r3
            org.json.JSONObject r3 = r3.getOriginalFullResponse()
            java.lang.String r3 = r3.toString()
            return r3
        L_0x000f:
            boolean r0 = r3 instanceof com.applovin.impl.mediation.p234a.C8070a
            if (r0 == 0) goto L_0x0033
            r0 = r3
            com.applovin.impl.mediation.a.a r0 = (com.applovin.impl.mediation.p234a.C8070a) r0
            java.lang.String r0 = r0.mo56090j()
            boolean r3 = com.applovin.impl.mediation.p236c.C8134c.m24361b((java.lang.Object) r3)
            if (r3 == 0) goto L_0x0032
            com.applovin.impl.sdk.ad.c r3 = new com.applovin.impl.sdk.ad.c
            com.applovin.impl.sdk.n r1 = r2.f18976a
            r3.<init>(r0, r1)
            org.json.JSONObject r3 = r3.mo56931d()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.toString()
            return r3
        L_0x0032:
            return r0
        L_0x0033:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p225a.p226a.C7871a.mo55454b(java.lang.Object):java.lang.String");
    }

    /* renamed from: b */
    public void mo55455b() {
        ArrayList arrayList;
        if (m23320h() || !f18975l.compareAndSet(false, true)) {
            C8626v.m26258i("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        synchronized (this.f18979d) {
            arrayList = new ArrayList(this.f18978c);
        }
        this.f18980e.mo55482a(arrayList, this.f18976a);
        if (!this.f18985k) {
            m23321i();
            this.f18985k = true;
        }
        Intent intent = new Intent(this.f18977b, MaxCreativeDebuggerActivity.class);
        intent.setFlags(268435456);
        C8626v.m26255f("AppLovinSdk", "Starting Creative Debugger...");
        this.f18977b.startActivity(intent);
    }

    /* renamed from: c */
    public boolean mo55456c() {
        return ((Boolean) this.f18976a.mo57342a(C8380b.f20767bP)).booleanValue() && this.f18976a.mo57400q().isCreativeDebuggerEnabled();
    }

    /* renamed from: d */
    public void mo55457d() {
        if (this.f18984j == 0) {
            this.f18983i = C8616p.m26205a(TimeUnit.SECONDS.toMillis(3), this.f18976a, new Runnable() {
                public void run() {
                    int unused = C7871a.this.f18984j = 0;
                }
            });
        }
        int i = this.f18984j;
        if (i % 2 == 0) {
            this.f18984j = i + 1;
        }
    }

    /* renamed from: e */
    public void mo55458e() {
        int i = this.f18984j;
        if (i % 2 == 1) {
            this.f18984j = i + 1;
        }
        if (this.f18984j / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C7871a.this.m23322j();
                }
            });
            this.f18984j = 0;
            this.f18983i.mo57782d();
        }
    }
}
