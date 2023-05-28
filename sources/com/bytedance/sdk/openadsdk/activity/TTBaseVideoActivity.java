package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.sdk.component.adexpress.dynamic.C10353c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.common.C0206c;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0264a;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0266b;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0269c;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0278e;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0301a;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0303b;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0308c;
import com.bytedance.sdk.openadsdk.component.reward.view.C0363a;
import com.bytedance.sdk.openadsdk.component.reward.view.C0366b;
import com.bytedance.sdk.openadsdk.component.reward.view.C0367c;
import com.bytedance.sdk.openadsdk.component.reward.view.C0368d;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0749z;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0590e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0591f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0597j;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p016b.C0411e;
import com.bytedance.sdk.openadsdk.core.p021e.C0455g;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0519a;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0666b;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0667c;
import com.bytedance.sdk.openadsdk.core.widget.C0723a;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0903a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p041g.C0785b;
import com.bytedance.sdk.openadsdk.p041g.C0787d;
import com.bytedance.sdk.openadsdk.p041g.C0788e;
import com.bytedance.sdk.openadsdk.p041g.C0789f;
import com.bytedance.sdk.openadsdk.p041g.C0790g;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.utils.C0985m;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;
import p152ms.p153bd.p154o.Pgl.C5643c;

public abstract class TTBaseVideoActivity extends Activity implements C10652x.C10653a, C0666b, C0667c, C0789f {

    /* renamed from: A */
    protected final AtomicBoolean f45A;

    /* renamed from: B */
    protected C0723a f46B;

    /* renamed from: C */
    protected IListenerManager f47C;

    /* renamed from: D */
    protected String f48D;

    /* renamed from: E */
    protected C0790g f49E;

    /* renamed from: F */
    boolean f50F;

    /* renamed from: G */
    boolean f51G;

    /* renamed from: H */
    protected boolean f52H;

    /* renamed from: I */
    ProgressBar f53I;

    /* renamed from: J */
    protected int f54J;

    /* renamed from: K */
    String f55K;

    /* renamed from: L */
    protected C0301a f56L;

    /* renamed from: M */
    protected boolean f57M;

    /* renamed from: N */
    public AtomicBoolean f58N;

    /* renamed from: O */
    public int f59O;

    /* renamed from: P */
    protected C0788e f60P;

    /* renamed from: Q */
    protected C0787d f61Q;

    /* renamed from: R */
    private C0411e f62R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Double f63S;

    /* renamed from: T */
    private long f64T;

    /* renamed from: U */
    private AtomicBoolean f65U;

    /* renamed from: V */
    private boolean f66V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f67W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public float f68X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f69Y;

    /* renamed from: Z */
    private int f70Z;

    /* renamed from: a */
    protected final String f71a;

    /* renamed from: aa */
    private int f72aa;

    /* renamed from: ab */
    private boolean f73ab;

    /* renamed from: ac */
    private AtomicBoolean f74ac;

    /* renamed from: ad */
    private AtomicBoolean f75ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C0206c f76ae;

    /* renamed from: af */
    private LinearLayout f77af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f78ag;

    /* renamed from: ah */
    private int f79ah;

    /* renamed from: b */
    Context f80b;

    /* renamed from: c */
    C0477n f81c;

    /* renamed from: d */
    String f82d;

    /* renamed from: e */
    TTAdDislikeDialog f83e;

    /* renamed from: f */
    TTAdDislikeToast f84f;

    /* renamed from: g */
    public AtomicBoolean f85g;

    /* renamed from: h */
    public AtomicBoolean f86h;

    /* renamed from: i */
    C0368d f87i;

    /* renamed from: j */
    C0363a f88j;

    /* renamed from: k */
    C0269c f89k;

    /* renamed from: l */
    C0366b f90l;

    /* renamed from: m */
    C0278e f91m;

    /* renamed from: n */
    C0264a f92n;

    /* renamed from: o */
    C0279f f93o;

    /* renamed from: p */
    C0266b f94p;

    /* renamed from: q */
    final C10652x f95q;

    /* renamed from: r */
    boolean f96r;

    /* renamed from: s */
    int f97s;

    /* renamed from: t */
    int f98t;

    /* renamed from: u */
    protected int f99u;

    /* renamed from: v */
    final AtomicBoolean f100v;

    /* renamed from: w */
    final AtomicBoolean f101w;

    /* renamed from: x */
    final AtomicBoolean f102x;

    /* renamed from: y */
    final AtomicBoolean f103y;

    /* renamed from: z */
    final AtomicBoolean f104z;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo43A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract void mo50H();

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract boolean mo51I();

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo52J() {
        return false;
    }

    /* renamed from: e */
    public void mo70e() {
    }

    public TTBaseVideoActivity() {
        this.f71a = mo51I() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f63S = null;
        this.f64T = 0;
        this.f65U = new AtomicBoolean(false);
        this.f85g = new AtomicBoolean(false);
        this.f86h = new AtomicBoolean(false);
        this.f87i = mo52J() ? new C0368d(this) : new C0367c(this);
        this.f88j = new C0363a(this);
        this.f89k = new C0269c(this);
        this.f90l = new C0366b(this);
        this.f91m = new C0278e(this);
        this.f92n = new C0264a(this);
        this.f93o = new C0279f(this);
        this.f94p = new C0266b(this);
        this.f95q = new C10652x(Looper.getMainLooper(), this);
        this.f96r = true;
        this.f99u = 0;
        this.f100v = new AtomicBoolean(false);
        this.f101w = new AtomicBoolean(false);
        this.f102x = new AtomicBoolean(false);
        this.f103y = new AtomicBoolean(false);
        this.f104z = new AtomicBoolean(false);
        this.f45A = new AtomicBoolean(false);
        this.f66V = false;
        this.f52H = false;
        this.f54J = -1;
        this.f55K = "video_player";
        this.f67W = false;
        this.f69Y = 1;
        this.f73ab = true;
        this.f58N = new AtomicBoolean(false);
        this.f74ac = new AtomicBoolean(false);
        this.f75ad = new AtomicBoolean(false);
        this.f79ah = 0;
        this.f60P = new C0788e() {
            /* renamed from: a */
            public void mo123a() {
                TTBaseVideoActivity.this.mo43A();
            }
        };
        this.f61Q = new C0787d() {
            /* renamed from: a */
            public void mo125a(int i) {
            }

            /* renamed from: b */
            public void mo126b() {
            }

            /* renamed from: a */
            public void mo124a() {
                if (!TTBaseVideoActivity.this.isFinishing()) {
                    if ((TTBaseVideoActivity.this.f81c == null || TTBaseVideoActivity.this.f81c.mo1376aG()) && TTBaseVideoActivity.this.f81c != null && !C0480p.m2196g(TTBaseVideoActivity.this.f81c)) {
                        TTBaseVideoActivity.this.f95q.removeMessages(800);
                        TTBaseVideoActivity.this.f95q.sendMessage(TTBaseVideoActivity.this.mo160e(1));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        mo55a(getIntent());
        mo56a(bundle);
        try {
            C0558m.m2665a(this);
            this.f99u = C1002v.m4745d(this, C1002v.m4756j(this));
            requestWindowFeature(1);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        if (bundle != null && bundle.getLong("video_current") > 0) {
            this.f91m.mo742b(bundle.getLong("video_current", 0));
        }
        this.f80b = this;
        C0790g gVar = new C0790g(getApplicationContext());
        this.f49E = gVar;
        gVar.mo2564a((C0789f) this);
        this.f54J = this.f49E.mo2573g();
        getWindow().addFlags(128);
        C10638l.m31235b("onVolumeChanged", "onCreate >>>>>> mVolume = " + this.f54J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54a() {
        mo74h();
        this.f89k.mo706b(this.f96r);
        mo62b();
        if (!this.f81c.mo1402aw()) {
            this.f93o.mo794h();
            String str = mo51I() ? "reward_endcard" : "fullscreen_endcard";
            mo64b(str);
            mo57a(str);
        }
        mo76j();
        if (C0480p.m2198i(this.f81c)) {
            this.f94p.mo688e();
        }
        if (C0464l.m1969c(this.f81c)) {
            this.f95q.sendEmptyMessageDelayed(500, 100);
        }
        this.f97s = (int) this.f91m.mo726C();
        this.f87i.mo1013a(mo73g(), this.f68X == 100.0f);
        this.f88j.mo982c();
        mo92p();
        mo50H();
        mo159M();
        mo81o();
        C0477n nVar = this.f81c;
        if (nVar != null && nVar.mo1403ax() != null && this.f81c.mo1403ax().mo1726a() != null) {
            this.f81c.mo1403ax().mo1726a().mo1785a(0);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.f65U.get()) {
            this.f64T = System.currentTimeMillis();
            return;
        }
        C0136e.m616a((System.currentTimeMillis() - this.f64T) + "", this.f81c, this.f71a, this.f91m.mo729a());
        this.f64T = 0;
    }

    /* renamed from: M */
    private void mo159M() {
        if (!mo51I()) {
            if (C0308c.m1325a(this.f81c)) {
                C0308c cVar = new C0308c(this, this.f81c, this.f70Z, this.f72aa);
                this.f56L = cVar;
                cVar.mo846a(this.f89k, this.f87i);
                this.f56L.mo848a(this.f91m.mo769z());
                this.f56L.mo844a(this.f69Y);
                this.f56L.mo843a(this.f68X);
                this.f56L.mo847a(this.f62R);
            } else if (C0303b.m1303c(this.f81c)) {
                C0303b bVar = new C0303b(this, this.f81c, this.f70Z, this.f72aa);
                this.f56L = bVar;
                bVar.mo846a(this.f89k, this.f87i);
                this.f56L.mo844a(this.f69Y);
                this.f56L.mo843a(this.f68X);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62b() {
        if (C0480p.m2190a(this.f81c) && this.f54J == 0) {
            this.f96r = true;
            this.f89k.mo706b(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo66c() {
        if (C0480p.m2199j(this.f81c) && this.f96r) {
            this.f89k.mo706b(true);
            this.f49E.mo2565a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo68d() {
        this.f89k.mo697a();
        this.f89k.mo703a(mo51I(), this.f81c);
        if (this.f81c.mo1402aw()) {
            this.f89k.mo702a(false);
        } else {
            this.f89k.mo702a(this.f81c.mo1395ap());
        }
        if (C0480p.m2190a(this.f81c)) {
            this.f93o.mo787c().setBackgroundColor(-16777216);
            this.f93o.mo789d().setBackgroundColor(-16777216);
            this.f89k.mo709c(true);
            if (C0480p.m2198i(this.f81c)) {
                this.f87i.mo1015b();
                C1002v.m4716a((View) this.f93o.mo787c(), 4);
                C1002v.m4716a((View) this.f93o.mo789d(), 0);
            }
        }
        if (!C0464l.m1969c(this.f81c) && !C0464l.m1967b(this.f81c)) {
            this.f87i.mo1003a(C1002v.m4749e(this.f80b, (float) this.f70Z), C1002v.m4749e(this.f80b, (float) this.f72aa));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public boolean mo219N() {
        return this.f81c.mo1402aw() || this.f81c.mo1383ad() == 15 || this.f81c.mo1383ad() == 5 || this.f81c.mo1383ad() == 50;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57a(String str) {
        this.f93o.mo780a(str, (C0279f.C0291a) new C0279f.C0291a() {
            /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:9)|10|11|(1:20)(2:15|17)) */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x0072 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo104a(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f81c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2198i(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.isFinishing()     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f81c     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.mo1376aG()     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f81c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2196g(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.component.utils.x r4 = r4.f95q     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    r0 = 0
                    android.os.Message r5 = r5.mo160e((int) r0)     // Catch:{ all -> 0x0036 }
                    r0 = 1000(0x3e8, double:4.94E-321)
                    r4.sendMessageDelayed(r5, r0)     // Catch:{ all -> 0x0036 }
                L_0x0036:
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f93o     // Catch:{ all -> 0x0072 }
                    boolean r4 = r4.mo796j()     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f81c     // Catch:{ all -> 0x0072 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2198i(r4)     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.b r4 = r4.f94p     // Catch:{ all -> 0x0072 }
                    r4.mo682b()     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f93o     // Catch:{ all -> 0x0072 }
                    r5 = 1
                    r4.mo786b((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f93o     // Catch:{ all -> 0x0072 }
                    r4.mo788c((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    android.content.Context r4 = r4.f80b     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f81c     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    java.lang.String r0 = r0.f71a     // Catch:{ all -> 0x0072 }
                    java.lang.String r1 = "py_loading_success"
                    r2 = 0
                    com.bytedance.sdk.openadsdk.p000b.C0136e.m626c((android.content.Context) r4, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r5, (java.lang.String) r0, (java.lang.String) r1, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0072 }
                L_0x0072:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.C00111.mo104a(android.webkit.WebView, java.lang.String):void");
            }

            /* renamed from: a */
            public void mo105a(WebView webView, String str, Bitmap bitmap) {
                if (!TTBaseVideoActivity.this.f67W && C0480p.m2198i(TTBaseVideoActivity.this.f81c)) {
                    boolean unused = TTBaseVideoActivity.this.f67W = true;
                    TTBaseVideoActivity.this.f94p.mo672a(TTBaseVideoActivity.this.f98t, TTBaseVideoActivity.this.f81c, TTBaseVideoActivity.this.mo51I());
                    TTBaseVideoActivity.this.f95q.sendEmptyMessageDelayed(600, (long) (TTBaseVideoActivity.this.f94p.mo693j() * 1000));
                    Message obtain = Message.obtain();
                    obtain.what = 900;
                    obtain.arg1 = TTBaseVideoActivity.this.f94p.mo693j();
                    TTBaseVideoActivity.this.f95q.sendMessage(obtain);
                    TTBaseVideoActivity.this.f94p.mo689f();
                    TTBaseVideoActivity.this.mo71f();
                    TTBaseVideoActivity.this.f94p.mo691h();
                }
            }

            /* renamed from: a */
            public void mo103a(WebView webView, int i) {
                try {
                    if (C0480p.m2198i(TTBaseVideoActivity.this.f81c) && TTBaseVideoActivity.this.f81c.mo1376aG() && !TTBaseVideoActivity.this.isFinishing()) {
                        TTBaseVideoActivity.this.f94p.mo671a(i);
                    } else if (TTBaseVideoActivity.this.f78ag && TTBaseVideoActivity.this.f76ae != null) {
                        TTBaseVideoActivity.this.f76ae.mo534a(webView, i);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        if (C0480p.m2198i(this.f81c)) {
            C0279f fVar = this.f93o;
            fVar.mo775a(fVar.mo789d());
            this.f94p.mo674a((DownloadListener) new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    TTBaseVideoActivity.this.f92n.mo669b();
                    TTBaseVideoActivity.this.mo158L();
                }
            });
        }
        this.f94p.mo679a(this.f50F);
        this.f93o.mo774a((DownloadListener) new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                TTBaseVideoActivity.this.f92n.mo669b();
                TTBaseVideoActivity.this.mo158L();
            }
        });
    }

    /* renamed from: f */
    public void mo71f() {
        if (!this.f86h.getAndSet(true) || C0480p.m2198i(this.f81c)) {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(this.f48D)) {
                hashMap = new HashMap();
                hashMap.put("rit_scene", this.f48D);
                View findViewById = findViewById(16908290);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                    jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                    jSONObject.put("alpha", (double) findViewById.getAlpha());
                } catch (Throwable unused) {
                }
                hashMap.put("root_view", jSONObject.toString());
            }
            if (!this.f65U.get() || !C0464l.m1969c(this.f81c)) {
                this.f65U.set(true);
                C0136e.m602a(this.f80b, this.f81c, this.f71a, (Map<String, Object>) hashMap, this.f63S);
                mo157K();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo73g() {
        String a = C10647t.m31276a(this, "tt_video_download_apk");
        C0477n nVar = this.f81c;
        if (nVar == null) {
            return a;
        }
        if (!TextUtils.isEmpty(nVar.mo1343W())) {
            return this.f81c.mo1343W();
        }
        if (this.f81c.mo1332L() != 4) {
            return C10647t.m31276a(this, "tt_video_mobile_go_detail");
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo74h() {
        if (this.f94p.mo680a() && C0480p.m2198i(this.f81c) && C0480p.m2196g(this.f81c)) {
            this.f95q.sendMessageDelayed(mo160e(2), 10000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo75i() {
        return C0558m.m2673h().mo1702j(String.valueOf(this.f98t)) != 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Message mo160e(int i) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i;
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo76j() {
        this.f88j.mo977a(this.f81c);
        this.f88j.mo979a(mo73g());
    }

    /* renamed from: O */
    private void m67O() {
        C0477n nVar = this.f81c;
        if (nVar != null) {
            C0795b e = C0795b.m3955b().mo2577a(mo51I() ? 7 : 8).mo2582c(String.valueOf(C0996u.m4657f(nVar))).mo2586e(C0996u.m4669h(this.f81c));
            e.mo2580b(this.f93o.mo800n()).mo2588f(this.f93o.mo801o());
            e.mo2590g(this.f81c.mo1382ac()).mo2584d(this.f81c.mo1345Y());
            C0796b.m3985a().mo2616f(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo64b(String str) {
        this.f93o.mo779a(Boolean.valueOf(mo51I()), this.f48D, this.f96r, this.f60P, str);
        this.f93o.mo791e().mo2340a(this.f87i.mo1028k()).mo2356a(this.f50F).mo2351a(this.f60P).mo2350a(this.f61Q).mo2349a((C0785b) new C0785b() {
            /* renamed from: a */
            public void mo112a(boolean z, int i, String str) {
                C10638l.m31235b("end card load finish: ", "code=" + i + " msg=" + str + " isRenderSuc=" + z);
                StringBuilder sb = new StringBuilder();
                sb.append("loadFinish:isRenderSuc = ");
                sb.append(z);
                Log.i("TTBaseVideoActivity", sb.toString());
                if (z) {
                    TTBaseVideoActivity.this.f94p.mo684c();
                }
                if (C0477n.m2011b(TTBaseVideoActivity.this.f81c) && !C0480p.m2190a(TTBaseVideoActivity.this.f81c)) {
                    C10638l.m31235b("TTBaseVideoActivity", "TimeTrackLog report from js " + z);
                    TTBaseVideoActivity.this.f93o.mo782a(z, i, str);
                }
            }
        });
    }

    /* renamed from: P */
    private void m68P() {
        this.f95q.postDelayed(new Runnable() {
            public void run() {
                try {
                    TTBaseVideoActivity.this.getWindow().getDecorView().findViewById(16908335).setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300);
    }

    /* renamed from: k */
    public void mo77k() {
        C0368d dVar;
        if (!(!C0464l.m1967b(this.f81c) || (dVar = this.f87i) == null || dVar.f1241x == null)) {
            if (this.f87i.f1241x.mo1297c()) {
                this.f87i.mo1035r();
                this.f85g.set(true);
            } else {
                this.f75ad.set(true);
                mo60a(true, false, true);
            }
        }
        if (C0464l.m1969c(this.f81c)) {
            mo60a(true, false, true);
        }
    }

    /* renamed from: l */
    public void mo78l() {
        C0278e eVar = this.f91m;
        if (eVar != null) {
            eVar.mo727D();
        }
    }

    /* renamed from: m */
    public View mo79m() {
        C0278e eVar = this.f91m;
        if (eVar != null) {
            return eVar.mo728E();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo58a(boolean z) {
        mo59a(z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59a(boolean z, boolean z2) {
        mo60a(z, z2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo60a(boolean z, boolean z2, boolean z3) {
        C0269c cVar;
        C0368d dVar = this.f87i;
        if (dVar != null) {
            dVar.mo1030m();
        }
        if (z2) {
            this.f74ac.set(true);
        }
        if (!this.f85g.get() && (!C0464l.m1967b(this.f81c) || !this.f74ac.get() || !this.f75ad.get())) {
            if (C0464l.m1967b(this.f81c) && z3) {
                return;
            }
            if ((C0464l.m1967b(this.f81c) || C0464l.m1969c(this.f81c)) && (cVar = this.f89k) != null) {
                cVar.mo709c(false);
                mo80n();
                return;
            }
        }
        if ((Build.VERSION.SDK_INT < 17 || !isDestroyed()) && !isFinishing()) {
            this.f93o.mo805s();
            this.f55K = "endcard";
            this.f103y.set(false);
            this.f104z.set(false);
            TTAdDislikeToast tTAdDislikeToast = this.f84f;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.mo527a();
            }
            m77Y();
            if (!this.f100v.getAndSet(true)) {
                if (mo52J() && C0480p.m2190a(this.f81c) && z) {
                    this.f89k.mo711d(true);
                }
                mo66c();
                if (!C0480p.m2198i(this.f81c)) {
                    this.f102x.set(z);
                    C0723a aVar = this.f46B;
                    if (aVar != null && aVar.isShowing()) {
                        this.f46B.dismiss();
                    }
                    if (this.f81c.mo1402aw()) {
                        this.f89k.mo711d(false);
                    } else {
                        this.f89k.mo711d(C0480p.m2198i(this.f81c));
                    }
                    this.f89k.mo709c(C0480p.m2190a(this.f81c));
                    if (mo52J() && C0480p.m2190a(this.f81c) && z) {
                        this.f89k.mo711d(true);
                    }
                    this.f93o.mo806t();
                    C0368d dVar2 = this.f87i;
                    if (!(dVar2 == null || dVar2.f1241x == null)) {
                        this.f87i.f1241x.mo1298d();
                    }
                    if (C0477n.m2008a(this.f81c) || this.f93o.mo811y() || (!C0477n.m2009a(this.f81c, this.f93o.mo796j(), this.f94p.mo687d(), this.f93o.mo807u()) && !C0480p.m2190a(this.f81c))) {
                        if (!C0477n.m2011b(this.f81c)) {
                            C10638l.m31235b("TTBaseVideoActivity", "TimeTrackLog report 408 from backup page");
                            this.f93o.mo782a(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
                        }
                        this.f93o.mo808v();
                        this.f93o.mo772a(8);
                        if (this.f78ag) {
                            C1002v.m4716a((View) this.f77af, 8);
                            this.f89k.mo708c(0);
                            this.f87i.mo1021d(0);
                        }
                        this.f87i.mo1016b(8);
                        if (!this.f81c.mo1402aw()) {
                            this.f88j.mo981b();
                        } else if (!this.f88j.mo980a(this.f91m)) {
                            finish();
                        }
                        mo80n();
                        this.f89k.mo709c(false);
                        m67O();
                        if (!mo51I() && this.f91m.mo744b() && this.f102x.get()) {
                            this.f91m.mo755l();
                            return;
                        }
                        return;
                    }
                    if (!C0477n.m2011b(this.f81c) && !C0480p.m2190a(this.f81c)) {
                        C10638l.m31235b("TTBaseVideoActivity", "TimeTrackLog report Success from Android");
                        this.f93o.mo782a(true, 0, (String) null);
                    }
                    this.f93o.mo771a(0.0f);
                    this.f87i.mo1006a(0.0f);
                    this.f93o.mo772a(0);
                    if (this.f78ag) {
                        C1002v.m4716a((View) this.f77af, 0);
                        this.f89k.mo708c(8);
                        this.f87i.mo1021d(8);
                    }
                    if (C0480p.m2190a(this.f81c)) {
                        int au = this.f81c.mo1400au();
                        if (C0480p.m2198i(this.f81c)) {
                            au = (this.f81c.mo1399at() + 1) * 1000;
                        }
                        if (au == -1) {
                            mo80n();
                        } else if (au >= 0) {
                            this.f95q.sendEmptyMessageDelayed(600, (long) au);
                        }
                    } else if (!C0480p.m2190a(this.f81c)) {
                        int av = this.f81c.mo1401av();
                        if (av == -1) {
                            mo80n();
                        } else if (av >= 0) {
                            this.f95q.sendEmptyMessageDelayed(600, (long) av);
                        }
                    }
                    this.f95q.sendEmptyMessageDelayed(500, 100);
                    this.f93o.mo783a(this.f96r, true);
                    this.f93o.mo788c(true);
                    this.f87i.mo1016b(8);
                    this.f93o.mo786b(true);
                    this.f93o.mo791e().mo2359a("prerender_page_show", (JSONObject) null);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo80n() {
        if (!this.f78ag) {
            this.f89k.mo710d();
            this.f87i.mo1021d(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo81o() {
        if (C0480p.m2198i(this.f81c)) {
            mo58a(false);
            return;
        }
        C0301a aVar = this.f56L;
        if (aVar != null) {
            aVar.mo845a(this.f87i.mo1025h());
        }
        m69Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m69Q() {
        C0366b bVar;
        C0301a aVar = this.f56L;
        if (aVar != null && !aVar.mo850c()) {
            HashMap hashMap = new HashMap();
            if (mo52J() && (bVar = this.f90l) != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(bVar.mo1000i()));
            }
            if (!TextUtils.isEmpty(this.f48D)) {
                hashMap.put("rit_scene", this.f48D);
            }
            View findViewById = findViewById(16908290);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                jSONObject.put("alpha", (double) findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            hashMap.put("root_view", jSONObject.toString());
            this.f65U.set(true);
            C0136e.m602a(this.f80b, this.f81c, this.f71a, (Map<String, Object>) hashMap, this.f63S);
            mo157K();
        } else if (!mo156a(this.f91m.mo751h(), false)) {
            this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
            mo100x();
            C0278e eVar = this.f91m;
            eVar.mo730a(true ^ eVar.mo725B() ? 1 : 0, 4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo61a(long j, boolean z, final Map<String, Object> map) {
        boolean z2 = false;
        if (!this.f91m.mo767x()) {
            return false;
        }
        if (C0464l.m1969c(this.f81c)) {
            return true;
        }
        if (!z || !this.f91m.mo768y()) {
            m75W();
        }
        try {
            z2 = this.f91m.mo741a(j, this.f96r);
        } catch (Exception unused) {
        }
        if (z2 && !z) {
            this.f65U.set(true);
            final View findViewById = findViewById(16908290);
            if (findViewById == null) {
                findViewById = getWindow().getDecorView();
            }
            findViewById.post(new Runnable() {
                public void run() {
                    if (!TTBaseVideoActivity.this.f86h.getAndSet(true)) {
                        Map map = map;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                            jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                            jSONObject.put("alpha", (double) findViewById.getAlpha());
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put("root_view", jSONObject.toString());
                        } catch (Throwable unused) {
                        }
                        C0136e.m602a(TTBaseVideoActivity.this.f80b, TTBaseVideoActivity.this.f81c, TTBaseVideoActivity.this.f71a, (Map<String, Object>) map, TTBaseVideoActivity.this.f63S);
                        TTBaseVideoActivity.this.mo157K();
                    }
                }
            });
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo92p() {
        C0477n nVar = this.f81c;
        if (nVar != null) {
            C002119 r0 = new C0411e(this, nVar, this.f71a, mo51I() ? 7 : 5) {
                /* renamed from: a */
                public void mo115a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3, boolean z) {
                    View view2 = view;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ccr log, onRewardBarClick , x = ");
                    float f5 = f;
                    sb.append(f);
                    C10638l.m31235b("TTBaseVideoActivity", sb.toString());
                    if (!(TTBaseVideoActivity.this.f81c == null || !TTBaseVideoActivity.this.f81c.mo1402aw() || view2 == null || view.getTag() == null)) {
                        mo1107a(view.getTag().toString());
                    }
                    HashMap hashMap = new HashMap();
                    if (TTBaseVideoActivity.this.f100v.get()) {
                        hashMap.put("click_scence", 2);
                    } else if (C0480p.m2198i(TTBaseVideoActivity.this.f81c)) {
                        hashMap.put("click_scence", 3);
                    } else {
                        hashMap.put("click_scence", 1);
                    }
                    mo1108a((Map<String, Object>) hashMap);
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                    if (view.getId() == C10647t.m31283e(TTBaseVideoActivity.this, "tt_playable_play") && C0480p.m2198i(TTBaseVideoActivity.this.f81c)) {
                        HashMap hashMap2 = new HashMap();
                        if (TTBaseVideoActivity.this.f81c.mo1330J() != null) {
                            hashMap2.put("playable_url", TTBaseVideoActivity.this.f81c.mo1330J().mo62925j());
                        }
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        C0136e.m629e((Context) tTBaseVideoActivity, tTBaseVideoActivity.f81c, TTBaseVideoActivity.this.f71a, "click_playable_download_button_loading", (Map<String, Object>) hashMap2);
                    }
                    TTBaseVideoActivity.this.f92n.mo667a(view, f, f2, f3, f4, sparseArray, i, i2, i3, new C0264a.C0265a() {
                        /* renamed from: a */
                        public void mo117a(String str, JSONObject jSONObject) {
                            TTBaseVideoActivity.this.m84a(str, jSONObject);
                        }

                        /* renamed from: a */
                        public void mo116a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3) {
                            TTBaseVideoActivity.this.m80a(view, f, f2, f3, f4, sparseArray, i, i2, i3);
                        }
                    });
                }
            };
            this.f62R = r0;
            r0.mo1100a(findViewById(16908290));
            this.f62R.mo1112b(findViewById(C10647t.m31283e(C0558m.m2663a(), "tt_top_dislike")));
            if (!TextUtils.isEmpty(this.f48D)) {
                HashMap hashMap = new HashMap();
                hashMap.put("rit_scene", this.f48D);
                this.f62R.mo1108a((Map<String, Object>) hashMap);
            }
            if (this.f92n.mo670c() != null) {
                this.f62R.mo1106a(this.f92n.mo670c());
            }
            this.f94p.mo676a(this.f62R);
            C002420 r9 = new C0406b(this, this.f81c, this.f71a, mo51I() ? 7 : 5) {
                /* renamed from: a */
                public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
                    try {
                        TTBaseVideoActivity.this.m80a(view, f, f2, f3, f4, sparseArray, this.f1355A, this.f1367y, this.f1368z);
                    } catch (Exception e) {
                        C10638l.m31242e("TTBaseVideoActivity", "onClickReport error :" + e.getMessage());
                    }
                }
            };
            C0368d dVar = this.f87i;
            C0411e eVar = this.f62R;
            dVar.mo1010a(eVar, eVar, r9, this.f91m);
            this.f88j.mo976a(this.f62R);
            this.f88j.mo978a(this.f81c, this.f71a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m80a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3) {
        if (view != null) {
            if (view.getId() == C10647t.m31283e(this, "tt_rb_score")) {
                m84a("click_play_star_level", (JSONObject) null);
            } else if (view.getId() == C10647t.m31283e(this, "tt_comment_vertical") || view.getId() == C10647t.m31283e(this, "tt_reward_ad_description")) {
                m84a("click_play_star_nums", (JSONObject) null);
            } else if (view.getId() == C10647t.m31283e(this, "tt_reward_ad_appname")) {
                m84a("click_play_source", (JSONObject) null);
            } else if (view.getId() == C10647t.m31283e(this, "tt_reward_ad_icon")) {
                m84a("click_play_logo", (JSONObject) null);
            } else if (view.getId() == C10647t.m31283e(this, "tt_video_reward_bar") || view.getId() == C10647t.m31283e(this, "tt_click_lower_non_content_layout") || view.getId() == C10647t.m31283e(this, "tt_click_upper_non_content_layout")) {
                m84a("click_start_play_bar", mo93q());
            } else if (view.getId() == C10647t.m31283e(this, "tt_reward_ad_download")) {
                m84a("click_start_play", mo93q());
            } else if (view.getId() == C10647t.m31283e(this, "tt_video_reward_container")) {
                m84a("click_video", mo93q());
            } else if (view.getId() == C10647t.m31283e(this, "tt_reward_ad_download_backup") || view.getId() == C10647t.m31283e(this, "tt_reward_full_endcard_vast_image")) {
                m84a("fallback_endcard_click", mo93q());
            }
            m92b(view, f, f2, f3, f4, sparseArray, i, i2, i3);
        }
    }

    /* renamed from: b */
    private void m92b(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3) {
        HashMap hashMap;
        if (mo94r() && this.f81c != null && view != null) {
            if (view.getId() == C10647t.m31283e(this, "tt_rb_score") || view.getId() == C10647t.m31283e(this, "tt_comment_vertical") || view.getId() == C10647t.m31283e(this, "tt_reward_ad_appname") || view.getId() == C10647t.m31283e(this, "tt_reward_ad_icon") || view.getId() == C10647t.m31283e(this, "tt_video_reward_bar") || view.getId() == C10647t.m31283e(this, "tt_click_lower_non_content_layout") || view.getId() == C10647t.m31283e(this, "tt_click_upper_non_content_layout") || view.getId() == C10647t.m31283e(this, "tt_reward_ad_download") || view.getId() == C10647t.m31283e(this, "tt_video_reward_container") || view.getId() == C10647t.m31283e(this, "tt_reward_ad_download_backup") || view.getId() == C10647t.m31283e(this, "tt_reward_ad_description")) {
                if (!TextUtils.isEmpty(this.f48D)) {
                    hashMap = new HashMap();
                    hashMap.put("rit_scene", this.f48D);
                } else {
                    hashMap = null;
                }
                C0136e.m604a(this.f80b, "click_other", this.f81c, new C0455g.C0457a().mo1254f(f).mo1252e(f2).mo1249d(f3).mo1246c(f4).mo1244b(System.currentTimeMillis()).mo1236a(0).mo1245b(C1002v.m4730a(this.f87i.mo1029l())).mo1240a(C1002v.m4730a((View) null)).mo1248c(C1002v.m4743c(this.f87i.mo1029l())).mo1251d(C1002v.m4743c((View) null)).mo1250d(i2).mo1253e(i3).mo1255f(i).mo1237a(sparseArray).mo1243b(C0503h.m2281d().mo1591b() ? 1 : 2).mo1247c(C1002v.m4753g(C0558m.m2663a())).mo1234a(C1002v.m4748e(C0558m.m2663a())).mo1242b(C1002v.m4751f(C0558m.m2663a())).mo1241a(), this.f71a, true, (Map<String, Object>) hashMap, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public JSONObject mo93q() {
        try {
            long p = this.f91m.mo759p();
            int q = this.f91m.mo760q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, p);
                jSONObject.put("percent", q);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m84a(String str, JSONObject jSONObject) {
        Context context = this.f80b;
        C0477n nVar = this.f81c;
        String str2 = this.f71a;
        if (!mo51I()) {
            jSONObject = null;
        }
        C0136e.m600a(context, nVar, str2, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo94r() {
        C0477n nVar = this.f81c;
        if (nVar == null || nVar.mo1329I() == 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo95s() {
        HashMap hashMap = new HashMap();
        if (C0480p.m2198i(this.f81c)) {
            this.f94p.mo678a((Map<String, Object>) hashMap);
        }
        Context context = this.f80b;
        C0477n nVar = this.f81c;
        String str = this.f71a;
        if (mo51I()) {
            hashMap = null;
        }
        C0136e.m621b(context, nVar, str, "click_close", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo96t() {
        this.f98t = C0996u.m4657f(this.f81c);
        this.f96r = C0558m.m2673h().mo1678b(this.f98t);
        this.f68X = this.f81c.mo1393an();
        if (26 != Build.VERSION.SDK_INT) {
            this.f69Y = this.f81c.mo1392am();
        } else if (this.f80b.getResources().getConfiguration().orientation == 1) {
            this.f69Y = 1;
        } else {
            this.f69Y = 2;
        }
        if (this.f69Y == 2 || !C1002v.m4742c((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo97u() {
        C0477n nVar = this.f81c;
        if (nVar == null) {
            finish();
            return;
        }
        setContentView(this.f87i.mo1005a(nVar));
        this.f78ag = C0464l.m1971d(this.f81c);
        mo98v();
        this.f87i.mo1011a(this.f81c, this.f71a, this.f69Y, mo51I(), this.f89k);
        this.f88j.mo975a();
        if (!this.f81c.mo1402aw()) {
            if (this.f78ag) {
                m70R();
            }
            this.f93o.mo777a(this.f81c, this.f71a, this.f69Y, mo51I());
            this.f93o.mo785b(this.f70Z, this.f72aa);
        }
        this.f94p.mo675a(this.f93o, this.f81c, this.f71a, this.f69Y);
    }

    /* renamed from: R */
    private void m70R() {
        LinearLayout linearLayout = (LinearLayout) findViewById(C10647t.m31283e(this.f80b, "tt_lp_new_style_container"));
        this.f77af = linearLayout;
        C1002v.m4716a((View) linearLayout, 8);
        C0206c cVar = new C0206c(this, this.f81c, "landingpage_endcard");
        this.f76ae = cVar;
        cVar.mo536c().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTBaseVideoActivity.this.f87i.mo1028k().performClick();
            }
        });
        this.f77af.addView(this.f76ae.mo538e(), new LinearLayout.LayoutParams(-1, -1));
        this.f93o.mo776a(this.f76ae);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo98v() {
        float f;
        float f2;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    m71S();
                } catch (Throwable unused) {
                }
            } else {
                m71S();
            }
        }
        float V = m74V();
        float U = m73U();
        if (this.f69Y == 2) {
            f = Math.max(V, U);
            f2 = Math.min(V, U);
        } else {
            f = Math.min(V, U);
            f2 = Math.max(V, U);
        }
        Context context = this.f80b;
        int d = C1002v.m4745d(context, C1002v.m4756j(context));
        if (this.f69Y != 2) {
            if (C1002v.m4742c((Activity) this)) {
                f2 -= (float) d;
            }
        } else if (C1002v.m4742c((Activity) this)) {
            f -= (float) d;
        }
        if (mo51I()) {
            this.f70Z = (int) f;
            this.f72aa = (int) f2;
            return;
        }
        int i3 = 20;
        int i4 = 0;
        if (this.f69Y != 2) {
            float f3 = this.f68X;
            if (!(f3 == 0.0f || f3 == 100.0f)) {
                float f4 = (float) 20;
                i = (int) Math.max((f2 - (((f - f4) - f4) / f3)) / 2.0f, 0.0f);
                i4 = i;
                i2 = 20;
                float f5 = (float) i3;
                float f6 = (float) i2;
                this.f70Z = (int) ((f - f5) - f6);
                float f7 = (float) i4;
                float f8 = (float) i;
                this.f72aa = (int) ((f2 - f7) - f8);
                int e = C1002v.m4749e(this, f7);
                int e2 = C1002v.m4749e(this, f8);
                getWindow().getDecorView().setPadding(C1002v.m4749e(this, f5), e, C1002v.m4749e(this, f6), e2);
            }
        } else {
            float f9 = this.f68X;
            if (!(f9 == 0.0f || f9 == 100.0f)) {
                float f10 = (float) 20;
                i2 = (int) Math.max((f - (((f2 - f10) - f10) * f9)) / 2.0f, 0.0f);
                i3 = i2;
                i = 20;
                i4 = 20;
                float f52 = (float) i3;
                float f62 = (float) i2;
                this.f70Z = (int) ((f - f52) - f62);
                float f72 = (float) i4;
                float f82 = (float) i;
                this.f72aa = (int) ((f2 - f72) - f82);
                int e3 = C1002v.m4749e(this, f72);
                int e22 = C1002v.m4749e(this, f82);
                getWindow().getDecorView().setPadding(C1002v.m4749e(this, f52), e3, C1002v.m4749e(this, f62), e22);
            }
        }
        i2 = 0;
        i = 0;
        i3 = 0;
        float f522 = (float) i3;
        float f622 = (float) i2;
        this.f70Z = (int) ((f - f522) - f622);
        float f722 = (float) i4;
        float f822 = (float) i;
        this.f72aa = (int) ((f2 - f722) - f822);
        int e32 = C1002v.m4749e(this, f722);
        int e222 = C1002v.m4749e(this, f822);
        getWindow().getDecorView().setPadding(C1002v.m4749e(this, f522), e32, C1002v.m4749e(this, f622), e222);
    }

    /* renamed from: S */
    private void m71S() {
        if (this.f69Y != 2) {
            setRequestedOrientation(1);
        } else if (mo99w()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo99w() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: T */
    private void m72T() {
        try {
            final boolean z = true;
            final boolean z2 = this.f73ab && C0558m.m2673h().mo1720u() == 1;
            if (!this.f73ab || !C1002v.m4742c((Activity) this) || Build.VERSION.SDK_INT < 19) {
                z = false;
            }
            if (z || z2) {
                this.f95q.post(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.f69Y     // Catch:{ all -> 0x00d7 }
                            r1 = 2
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.orientation     // Catch:{ all -> 0x00d7 }
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f80b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.utils.C1002v.m4755i(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                            goto L_0x004e
                        L_0x0033:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f80b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.utils.C1002v.m4754h(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                        L_0x004e:
                            if (r0 != 0) goto L_0x00d7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r2 = r0.getPaddingLeft()     // Catch:{ all -> 0x00d7 }
                            int r3 = r0.getPaddingTop()     // Catch:{ all -> 0x00d7 }
                            int r4 = r0.getPaddingRight()     // Catch:{ all -> 0x00d7 }
                            int r5 = r0.getPaddingBottom()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.f69Y     // Catch:{ all -> 0x00d7 }
                            r7 = 1
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f80b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.C1002v.m4756j(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x0089:
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r3 = r3 + r1
                            goto L_0x00bd
                        L_0x008c:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.f69Y     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            boolean r1 = r1     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00b0
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f80b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.C1002v.m4756j(r1)     // Catch:{ all -> 0x00d7 }
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 + r1
                        L_0x00b0:
                            boolean r1 = r0     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f80b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.C1002v.m4756j(r1)     // Catch:{ all -> 0x00d7 }
                            goto L_0x0089
                        L_0x00bd:
                            boolean r1 = r0.isAttachedToWindow()     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00c6
                            r0.setPadding(r2, r3, r4, r5)     // Catch:{ all -> 0x00d7 }
                        L_0x00c6:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            float r1 = r1.f68X     // Catch:{ all -> 0x00d7 }
                            r2 = 1120403456(0x42c80000, float:100.0)
                            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                            if (r1 != 0) goto L_0x00d7
                            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x00d7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.C00232.run():void");
                    }
                });
            }
            this.f73ab = false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f93o.mo809w();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f52H = true;
        C10638l.m31235b("TTBaseVideoActivity", "onResume mIsActivityShow=" + this.f52H + " mIsMute=" + this.f96r);
        m72T();
        if (m78Z()) {
            m77Y();
        }
        if (C0480p.m2190a(this.f81c)) {
            if (this.f54J == 0) {
                this.f96r = true;
            }
            if (this.f96r) {
                this.f49E.mo2565a(true);
                this.f89k.mo706b(true);
            }
        }
        if (Build.VERSION.SDK_INT > 28 || Build.VERSION.SDK_INT < 24) {
            super.onResume();
        } else {
            try {
                super.onResume();
            } catch (IllegalArgumentException e) {
                C10638l.m31239c("TTBaseVideoActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, true);
                } catch (Exception e2) {
                    C10638l.m31239c("TTBaseVideoActivity", "onResume set mCalled fail", e2);
                }
            }
        }
        C0368d dVar = this.f87i;
        if (dVar != null) {
            dVar.mo1032o();
        }
        this.f93o.mo799m();
        C0790g gVar = this.f49E;
        if (gVar != null) {
            gVar.mo2564a((C0789f) this);
            this.f49E.mo2571e();
        }
        if (m90ac()) {
            m75W();
            this.f91m.mo740a(false, this, this.f79ah != 0);
        }
        this.f79ah++;
        if (this.f94p.mo692i() && C0480p.m2198i(this.f81c)) {
            this.f94p.mo677a("return_foreground");
            C0723a aVar = this.f46B;
            if ((aVar == null || !aVar.isShowing()) && this.f94p.mo694k() > 0) {
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = this.f94p.mo694k();
                this.f95q.sendMessage(obtain);
            }
        }
        mo44B();
        C0366b bVar = this.f90l;
        if (bVar != null) {
            bVar.mo998g();
        }
        m68P();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C0368d dVar = this.f87i;
        if (dVar != null) {
            dVar.mo1034q();
        }
        this.f52H = false;
        C10638l.m31235b("TTBaseVideoActivity", "onPause mIsActivityShow=" + this.f52H + " mIsMute=" + this.f96r);
        if (!this.f103y.get()) {
            this.f91m.mo752i();
        }
        m76X();
        if (C0480p.m2198i(this.f81c)) {
            this.f95q.removeMessages(900);
            this.f95q.removeMessages(600);
            this.f94p.mo677a("go_background");
        }
        this.f93o.mo798l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C0368d dVar = this.f87i;
        if (dVar != null) {
            dVar.mo1033p();
        }
        C10638l.m31235b("TTBaseVideoActivity", "onStop mIsMute=" + this.f96r + " mLast=" + this.f49E.mo2567b() + " mVolume=" + this.f54J);
        this.f93o.mo797k();
        if (C0480p.m2198i(this.f81c)) {
            this.f95q.removeMessages(900);
            this.f95q.removeMessages(600);
            this.f94p.mo677a("go_background");
        }
        if (this.f96r) {
            runOnUiThread(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f49E.mo2567b() > 0) {
                        TTBaseVideoActivity.this.f49E.mo2565a(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f64T > 0 && this.f65U.get()) {
            C0136e.m616a((System.currentTimeMillis() - this.f64T) + "", this.f81c, this.f71a, this.f91m.mo729a());
            this.f64T = 0;
        }
        C0366b bVar = this.f90l;
        if (bVar != null) {
            bVar.mo997f();
        }
        C0368d dVar = this.f87i;
        if (dVar != null) {
            dVar.mo1031n();
        }
        TTAdDislikeToast tTAdDislikeToast = this.f84f;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.mo529b();
        }
        this.f95q.removeCallbacksAndMessages((Object) null);
        C0279f fVar = this.f93o;
        if (!(fVar == null || fVar.mo787c() == null)) {
            C0749z.m3817a(this.f80b, this.f93o.mo787c().getWebView());
            C0749z.m3818a(this.f93o.mo787c().getWebView());
        }
        this.f91m.mo746c(mo51I());
        C0301a aVar = this.f56L;
        if (aVar != null && !aVar.mo849b() && !this.f100v.get()) {
            this.f93o.mo803q();
        }
        C0279f fVar2 = this.f93o;
        if (fVar2 != null) {
            fVar2.mo795i();
        }
        C0790g gVar = this.f49E;
        if (gVar != null) {
            gVar.mo2572f();
            this.f49E.mo2564a((C0789f) null);
        }
        this.f94p.mo673a(getApplicationContext());
        this.f87i.mo1030m();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f81c != null ? this.f81c.mo1397ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f82d);
            bundle.putString("video_cache_url", this.f91m.mo769z());
            bundle.putLong("video_current", this.f91m.mo762s());
            bundle.putBoolean("is_mute", this.f96r);
            bundle.putString("rit_scene", this.f48D);
            bundle.putBoolean("has_show_skip_btn", this.f101w.get());
            bundle.putString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, this.f63S == null ? "" : String.valueOf(this.f63S));
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onBackPressed() {
        int i;
        C0269c cVar;
        C0266b bVar;
        if (C0558m.m2673h().mo1695h(this.f98t) == 1) {
            if (mo51I()) {
                if (C0480p.m2198i(this.f81c)) {
                    i = C0558m.m2673h().mo1673a(String.valueOf(this.f98t), true);
                } else {
                    i = C0558m.m2673h().mo1689f(this.f98t);
                }
            } else if (C0480p.m2198i(this.f81c)) {
                i = C0558m.m2673h().mo1673a(String.valueOf(this.f98t), false);
            } else {
                i = C0558m.m2673h().mo1686e(this.f98t);
            }
            C0368d dVar = this.f87i;
            if (dVar != null && dVar.mo1027j()) {
                C0368d dVar2 = this.f87i;
                if (dVar2 != null) {
                    dVar2.mo1028k().performClick();
                }
            } else if ((!this.f100v.get() || C0480p.m2198i(this.f81c)) && i != -1) {
                C0278e eVar = this.f91m;
                if (((eVar != null && eVar.mo749f() >= ((long) (i * 1000))) || ((bVar = this.f94p) != null && bVar.mo693j() - this.f94p.mo694k() >= i)) && (cVar = this.f89k) != null) {
                    cVar.mo704b();
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1002v.m4711a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTBaseVideoActivity.this.isFinishing()) {
                            TTBaseVideoActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    C1002v.m4711a((Activity) TTBaseVideoActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        int i = message.what;
        if (i == 300) {
            mo100x();
            C0278e eVar = this.f91m;
            eVar.mo730a(eVar.mo725B() ^ true ? 1 : 0, this.f91m.mo725B() ^ true ? 1 : 0);
            if (this.f81c.mo1403ax() != null && this.f81c.mo1403ax().mo1726a() != null) {
                this.f81c.mo1403ax().mo1726a().mo1788a(C0519a.GENERAL_LINEAR_AD_ERROR);
            }
        } else if (i == 400) {
            this.f91m.mo756m();
            mo59a(false, true);
        } else if (i == 500) {
            if (!C0480p.m2190a(this.f81c)) {
                this.f89k.mo709c(false);
            }
            SSWebView c = this.f93o.mo787c();
            if (!(c == null || c.getWebView() == null)) {
                c.mo64321i();
                c.getWebView().resumeTimers();
            }
            if (this.f93o.mo787c() != null) {
                this.f93o.mo771a(1.0f);
                this.f87i.mo1006a(1.0f);
            }
            if (!mo51I() && this.f91m.mo744b() && this.f102x.get()) {
                this.f91m.mo755l();
            }
        } else if (i == 600) {
            mo80n();
        } else if (i == 800) {
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            if (this.f81c.mo1330J() != null) {
                hashMap.put("playable_url", this.f81c.mo1330J().mo62925j());
            }
            C0136e.m629e((Context) this, this.f81c, this.f71a, "remove_loading_page", (Map<String, Object>) hashMap);
            this.f95q.removeMessages(800);
            this.f94p.mo690g();
        } else if (i == 900 && C0480p.m2198i(this.f81c)) {
            int i2 = message.arg1;
            if (i2 > 0) {
                this.f89k.mo711d(true);
                int b = this.f94p.mo681b(i2);
                if (b == i2) {
                    this.f89k.mo701a(String.valueOf(i2), (CharSequence) null);
                } else if (b > 0) {
                    this.f89k.mo701a(String.valueOf(i2), (CharSequence) String.format(C10647t.m31276a(this.f80b, "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(b)}));
                } else {
                    this.f89k.mo701a(String.valueOf(i2), (CharSequence) C10647t.m31276a(this.f80b, "tt_txt_skip"));
                    this.f89k.mo712e(true);
                }
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = i2 - 1;
                this.f95q.sendMessageDelayed(obtain, 1000);
                this.f94p.mo685c(i2);
            } else {
                this.f89k.mo711d(false);
                this.f58N.set(true);
                mo80n();
                mo161f(mo51I() ? 10001 : 10002);
            }
            mo43A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo100x() {
        this.f91m.mo763t();
        this.f91m.mo756m();
        mo59a(false, true);
        if (mo51I()) {
            mo161f(10000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo101y() {
        C10652x xVar = this.f95q;
        if (xVar != null) {
            xVar.removeMessages(900);
            this.f95q.removeMessages(600);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo102z() {
        Message obtain = Message.obtain();
        obtain.what = 900;
        obtain.arg1 = this.f94p.mo694k();
        this.f95q.sendMessageDelayed(obtain, 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IListenerManager mo53a(int i) {
        if (this.f47C == null) {
            this.f47C = C0903a.asInterface(C0898a.m4299a(C0558m.m2663a()).mo2767a(i));
        }
        return this.f47C;
    }

    /* renamed from: b */
    public void mo63b(int i) {
        if (i > 0) {
            if (this.f54J > 0) {
                this.f54J = i;
            } else {
                C10638l.m31235b("onVolumeChanged", "onVolumeChanged >>>> 变为非静音状态通知 h5");
                this.f93o.mo790d(false);
                this.f54J = i;
                C0477n nVar = this.f81c;
                if (!(nVar == null || nVar.mo1403ax() == null || this.f81c.mo1403ax().mo1726a() == null || this.f91m == null)) {
                    this.f81c.mo1403ax().mo1726a().mo1809i(this.f91m.mo762s());
                }
            }
        } else if (this.f54J > 0) {
            C10638l.m31235b("onVolumeChanged", "onVolumeChanged >>>> 变为静音状态通知 h5");
            this.f93o.mo790d(true);
            this.f54J = i;
            C0477n nVar2 = this.f81c;
            if (!(nVar2 == null || nVar2.mo1403ax() == null || this.f81c.mo1403ax().mo1726a() == null || this.f91m == null)) {
                this.f81c.mo1403ax().mo1726a().mo1807h(this.f91m.mo762s());
            }
        } else {
            this.f54J = i;
        }
        if (C0480p.m2199j(this.f81c) && !this.f100v.get()) {
            return;
        }
        if (!C0480p.m2198i(this.f81c) && !C0480p.m2199j(this.f81c)) {
            return;
        }
        if (this.f49E.mo2569c()) {
            C10638l.m31235b("TTBaseVideoActivity", "onVolumeChanged by SDK mIsMute=" + this.f96r + " mVolume=" + this.f54J + " mLastVolume=" + this.f49E.mo2567b());
            if (this.f54J == 0) {
                this.f89k.mo706b(true);
                this.f91m.mo743b(true);
                return;
            }
            this.f89k.mo706b(false);
            this.f91m.mo743b(false);
            return;
        }
        this.f49E.mo2568b(-1);
        C10638l.m31235b("TTBaseVideoActivity", "onVolumeChanged by User mIsMute=" + this.f96r + " mVolume=" + this.f54J + " mLastVolume=" + this.f49E.mo2567b());
        if (!this.f52H) {
            return;
        }
        if (this.f54J == 0) {
            this.f96r = true;
            this.f89k.mo706b(true);
            this.f91m.mo743b(true);
            return;
        }
        this.f96r = false;
        this.f89k.mo706b(false);
        this.f91m.mo743b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float[] mo67c(int i) {
        float U = m73U();
        float V = m74V();
        if ((this.f69Y == 1) != (U > V)) {
            float f = U + V;
            V = f - V;
            U = f - V;
        }
        if (this.f69Y == 1) {
            U -= (float) i;
        } else {
            V -= (float) i;
        }
        return new float[]{V, U};
    }

    /* renamed from: U */
    private float m73U() {
        return (float) C1002v.m4745d(this.f80b, (float) C1002v.m4754h(this.f80b));
    }

    /* renamed from: V */
    private float m74V() {
        return (float) C1002v.m4745d(this.f80b, (float) C1002v.m4755i(this.f80b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo44B() {
        if (mo52J() && !this.f66V) {
            this.f66V = true;
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f81c != null) {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        tTBaseVideoActivity.m85a(tTBaseVideoActivity.mo45C());
                    }
                }
            });
        }
    }

    /* renamed from: C */
    public float[] mo45C() {
        float[] fArr = {(float) (getWindow().getDecorView().getWidth() - (getWindow().getDecorView().getPaddingLeft() * 2)), (float) (getWindow().getDecorView().getHeight() - (getWindow().getDecorView().getPaddingTop() * 2))};
        fArr[0] = (float) C1002v.m4745d(this, fArr[0]);
        fArr[1] = (float) C1002v.m4745d(this, fArr[1]);
        if (fArr[0] >= 10.0f && fArr[1] >= 10.0f) {
            return fArr;
        }
        C10638l.m31235b("TTBaseVideoActivity", "get root view size error, so run backup");
        return mo67c(this.f99u);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m85a(float[] fArr) {
        C0366b bVar;
        this.f90l.mo988a(this.f81c, new AdSlot.Builder().setCodeId(String.valueOf(C0996u.m4657f(this.f81c))).setExpressViewAcceptedSize(fArr[0], fArr[1]).build(), this.f71a, this.f96r);
        C0269c cVar = this.f89k;
        if (!(cVar == null || (bVar = this.f90l) == null)) {
            cVar.mo699a((C10353c) bVar.mo985a());
        }
        this.f90l.mo990a((C0597j) new C0597j() {
            /* renamed from: a */
            public void mo130a(boolean z) {
                if (TTBaseVideoActivity.this.f96r != z) {
                    TTBaseVideoActivity.this.f89k.mo707c();
                }
            }

            /* renamed from: a */
            public void mo128a() {
                TTBaseVideoActivity.this.f89k.mo704b();
            }

            /* renamed from: b */
            public void mo131b() {
                if (TTBaseVideoActivity.this.f87i != null && TTBaseVideoActivity.this.f87i.mo1028k() != null) {
                    TTBaseVideoActivity.this.f87i.mo1028k().performClick();
                }
            }

            /* renamed from: a */
            public void mo129a(int i) {
                boolean z = false;
                if (i != 1) {
                    if (i == 2) {
                        TTBaseVideoActivity.this.f91m.mo724A();
                        return;
                    } else if (i == 3) {
                        C0278e eVar = TTBaseVideoActivity.this.f91m;
                        if (TTBaseVideoActivity.this.f100v.get() || TTBaseVideoActivity.this.f103y.get()) {
                            z = true;
                        }
                        eVar.mo739a(z, (C0666b) TTBaseVideoActivity.this);
                        return;
                    } else if (i == 4) {
                        TTBaseVideoActivity.this.f91m.mo754k();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (!TTBaseVideoActivity.this.f91m.mo744b() && !TTBaseVideoActivity.this.f91m.mo747d()) {
                    TTBaseVideoActivity.this.mo156a(0, false);
                }
            }

            /* renamed from: c */
            public long mo133c() {
                return TTBaseVideoActivity.this.f91m.mo749f();
            }

            /* renamed from: d */
            public int mo134d() {
                if (TTBaseVideoActivity.this.f90l.mo994c()) {
                    return 4;
                }
                if (TTBaseVideoActivity.this.f90l.mo995d()) {
                    return 5;
                }
                if (TTBaseVideoActivity.this.f91m.mo748e()) {
                    return 1;
                }
                if (TTBaseVideoActivity.this.f91m.mo744b()) {
                    return 2;
                }
                if (TTBaseVideoActivity.this.f91m.mo747d()) {
                }
                return 3;
            }

            /* renamed from: e */
            public void mo135e() {
                TTBaseVideoActivity.this.mo49G();
            }

            /* renamed from: b */
            public void mo132b(int i) {
                TTBaseVideoActivity.this.f59O = i;
            }
        });
        this.f90l.mo987a((TTNativeExpressAd.ExpressAdInteractionListener) new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdClicked(View view, int i) {
            }

            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
                TTBaseVideoActivity.this.f93o.mo781a(true);
                TTBaseVideoActivity.this.f93o.mo784b();
                C10638l.m31235b("TTBaseVideoActivity", "onRenderFail、、、code:" + i);
                TTBaseVideoActivity.this.f90l.mo996e().post(new Runnable() {
                    public void run() {
                        TTBaseVideoActivity.this.mo58a(false);
                    }
                });
                TTBaseVideoActivity.this.m91ad();
            }

            public void onRenderSuccess(View view, float f, float f2) {
                if (!C0480p.m2198i(TTBaseVideoActivity.this.f81c)) {
                    if (TTBaseVideoActivity.this.f90l.mo999h()) {
                        TTBaseVideoActivity.this.mo65b(true);
                    }
                    TTBaseVideoActivity.this.mo69d(8);
                    TTBaseVideoActivity.this.f93o.mo781a(true);
                    TTBaseVideoActivity.this.f93o.mo784b();
                    if (TTBaseVideoActivity.this.f90l.mo999h()) {
                        TTBaseVideoActivity.this.f90l.mo992b().setBackgroundColor(-16777216);
                        if (TTBaseVideoActivity.this.f56L != null) {
                            TTBaseVideoActivity.this.f56L.mo845a(TTBaseVideoActivity.this.f87i.mo1025h());
                        }
                    } else if (TTBaseVideoActivity.this.f81c.mo1330J() != null && TTBaseVideoActivity.this.mo219N()) {
                        TTBaseVideoActivity.this.f57M = true;
                    }
                    TTBaseVideoActivity.this.m69Q();
                    TTBaseVideoActivity.this.m91ad();
                }
            }
        });
        Context context = this.f80b;
        C0477n nVar = this.f81c;
        String str = this.f71a;
        C001210 r5 = new C0591f(context, nVar, str, C0996u.m4610a(str)) {
            /* renamed from: a */
            public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
                super.mo106a(view, f, f2, f3, f4, sparseArray, z);
                TTBaseVideoActivity.this.onRewardBarClick(view);
            }
        };
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f48D)) {
            hashMap.put("rit_scene", this.f48D);
        }
        if (C0480p.m2198i(this.f81c)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        r5.mo1108a((Map<String, Object>) hashMap);
        Context context2 = this.f80b;
        C0477n nVar2 = this.f81c;
        String str2 = this.f71a;
        C001311 r7 = new C0590e(context2, nVar2, str2, C0996u.m4610a(str2)) {
            /* renamed from: a */
            public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
                super.mo106a(view, f, f2, f3, f4, sparseArray, z);
                if (mo1110a(view, z)) {
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                }
            }
        };
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(this.f48D)) {
            hashMap2.put("rit_scene", this.f48D);
        }
        if (C0480p.m2198i(this.f81c)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        r7.mo1108a((Map<String, Object>) hashMap2);
        this.f90l.mo989a(r5, r7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f87i.mo1025h().addView(this.f90l.mo985a(), layoutParams);
        if (!this.f90l.mo999h()) {
            mo65b(false);
        }
        this.f90l.mo1002k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65b(boolean z) {
        if (!this.f100v.get()) {
            if (!z) {
                this.f89k.mo709c(false);
                this.f89k.mo702a(false);
                this.f89k.mo711d(false);
                this.f87i.mo1021d(8);
            } else {
                this.f89k.mo702a(this.f81c.mo1395ap());
                if (C0480p.m2198i(this.f81c) || mo219N()) {
                    this.f89k.mo709c(true);
                }
                if (mo219N() || ((this.f56L instanceof C0303b) && mo52J())) {
                    this.f89k.mo711d(true);
                } else {
                    this.f89k.mo710d();
                    this.f87i.mo1021d(0);
                }
            }
            if (!z) {
                this.f87i.mo1007a(4);
                this.f87i.mo1016b(8);
            } else if (mo51I() || (this.f68X == FullRewardExpressView.f1184c && mo219N())) {
                this.f87i.mo1007a(0);
                this.f87i.mo1016b(0);
            } else {
                this.f87i.mo1007a(8);
                this.f87i.mo1016b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo46D() {
        Message message = new Message();
        message.what = 400;
        if (mo51I()) {
            mo161f(10000);
        }
        C10652x xVar = this.f95q;
        if (xVar != null) {
            xVar.sendMessageDelayed(message, 2000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo47E() {
        this.f95q.removeMessages(400);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m75W() {
        if (!this.f100v.get() && this.f52H && !C0480p.m2198i(this.f81c)) {
            if ((C0477n.m2012c(this.f81c) || C0558m.m2673h().mo1702j(String.valueOf(this.f98t)) != 1 || !this.f90l.mo995d()) && !C0464l.m1969c(this.f81c)) {
                C0301a aVar = this.f56L;
                if (aVar == null || aVar.mo850c()) {
                    this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                    Message obtain = Message.obtain();
                    obtain.what = C5643c.COLLECT_MODE_FINANCE;
                    this.f95q.sendMessageDelayed(obtain, 5000);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m76X() {
        this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo69d(int i) {
        if (this.f53I == null) {
            this.f53I = new ProgressBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.f53I.setLayoutParams(layoutParams);
            this.f53I.setIndeterminateDrawable(getResources().getDrawable(C10647t.m31282d(this, "tt_video_loading_progress_bar")));
            this.f87i.mo1025h().addView(this.f53I);
        }
        this.f53I.setVisibility(i);
    }

    /* renamed from: Y */
    private void m77Y() {
        this.f89k.mo702a(this.f81c.mo1395ap());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo48F() {
        if (this.f83e == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f81c);
            this.f83e = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C0201a() {
                /* renamed from: c */
                public void mo41c(View view) {
                }

                /* renamed from: a */
                public void mo39a(View view) {
                    TTBaseVideoActivity.this.f103y.set(true);
                    TTBaseVideoActivity.this.m76X();
                    if (TTBaseVideoActivity.this.f91m.mo744b()) {
                        TTBaseVideoActivity.this.f91m.mo758o();
                    }
                }

                /* renamed from: b */
                public void mo40b(View view) {
                    TTBaseVideoActivity.this.f103y.set(false);
                    TTBaseVideoActivity.this.m75W();
                    if (TTBaseVideoActivity.this.f91m.mo747d()) {
                        TTBaseVideoActivity.this.f91m.mo757n();
                    }
                }

                /* renamed from: a */
                public void mo38a(int i, FilterWord filterWord) {
                    if (!TTBaseVideoActivity.this.f104z.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTBaseVideoActivity.this.f104z.set(true);
                        TTBaseVideoActivity.this.m89ab();
                    }
                }
            });
            ((FrameLayout) findViewById(16908290)).addView(this.f83e);
        }
        if (this.f84f == null) {
            this.f84f = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f84f);
        }
    }

    /* renamed from: Z */
    private boolean m78Z() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f100v.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo49G() {
        if (!isFinishing()) {
            if (this.f104z.get()) {
                m88aa();
                return;
            }
            if (this.f83e == null) {
                mo48F();
            }
            this.f83e.mo520a();
        }
    }

    /* renamed from: aa */
    private void m88aa() {
        this.f84f.mo528a(C0516f.f1880d);
    }

    /* access modifiers changed from: private */
    /* renamed from: ab */
    public void m89ab() {
        this.f84f.mo528a(C0516f.f1881e);
    }

    /* renamed from: ac */
    private boolean m90ac() {
        if (C0464l.m1967b(this.f81c) && this.f58N.get()) {
            C0368d dVar = this.f87i;
            if (dVar != null) {
                dVar.mo1025h().setVisibility(4);
                this.f87i.mo1025h().setVisibility(0);
            }
            return false;
        } else if (this.f100v.get() || this.f103y.get() || C0480p.m2198i(this.f81c)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55a(Intent intent) {
        if (intent != null) {
            this.f87i.mo1017b(intent.getBooleanExtra("show_download_bar", true));
            this.f48D = intent.getStringExtra("rit_scene");
            this.f91m.mo735a(intent.getStringExtra("video_cache_url"));
            this.f82d = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f63S = Double.valueOf(Double.parseDouble(stringExtra));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56a(Bundle bundle) {
        if (bundle != null) {
            this.f82d = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
            this.f91m.mo735a(bundle.getString("video_cache_url"));
            this.f96r = bundle.getBoolean("is_mute");
            this.f48D = bundle.getString("rit_scene");
            try {
                String string = bundle.getString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(string)) {
                    this.f63S = Double.valueOf(Double.parseDouble(string));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ad */
    public void m91ad() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f80b, C10647t.m31290l(this.f80b, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        TTBaseVideoActivity.this.f87i.mo1030m();
                    }
                });
                this.f87i.mo1009a(loadAnimation);
                return;
            }
            this.f87i.mo1030m();
        } catch (Throwable unused) {
            this.f87i.mo1030m();
        }
    }

    public void finish() {
        super.finish();
        if (C0985m.m4562e()) {
            C1002v.m4734b((Activity) this);
        }
    }
}
