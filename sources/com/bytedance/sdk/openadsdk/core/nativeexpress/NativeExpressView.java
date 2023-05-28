package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.C10353c;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10363f;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10368h;
import com.bytedance.sdk.component.adexpress.p298b.C10283b;
import com.bytedance.sdk.component.adexpress.p298b.C10285c;
import com.bytedance.sdk.component.adexpress.p298b.C10286d;
import com.bytedance.sdk.component.adexpress.p298b.C10287e;
import com.bytedance.sdk.component.adexpress.p298b.C10290g;
import com.bytedance.sdk.component.adexpress.p298b.C10291h;
import com.bytedance.sdk.component.adexpress.p298b.C10292i;
import com.bytedance.sdk.component.adexpress.p298b.C10295k;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p298b.C10299n;
import com.bytedance.sdk.component.adexpress.p298b.C10300o;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C0492g;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.C0746x;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C0424a;
import com.bytedance.sdk.openadsdk.core.nativeexpress.p031a.C0574a;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p017c.C0435a;
import com.bytedance.sdk.openadsdk.core.p017c.p019b.C0438a;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.C0164u;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public class NativeExpressView extends FrameLayout implements C10290g, C10299n, C10353c, C0597j {

    /* renamed from: p */
    public static int f2121p = 500;

    /* renamed from: A */
    private C0164u f2122A;

    /* renamed from: B */
    private String f2123B;

    /* renamed from: C */
    private C0424a.C0431a f2124C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public AtomicBoolean f2125D = new AtomicBoolean(false);

    /* renamed from: E */
    private C0575b f2126E;

    /* renamed from: F */
    private final ViewTreeObserver.OnScrollChangedListener f2127F = new ViewTreeObserver.OnScrollChangedListener() {
        public void onScrollChanged() {
            NativeExpressView.this.m2743s();
            NativeExpressView nativeExpressView = NativeExpressView.this;
            nativeExpressView.removeCallbacks(nativeExpressView.f2128G);
            NativeExpressView nativeExpressView2 = NativeExpressView.this;
            nativeExpressView2.postDelayed(nativeExpressView2.f2128G, 500);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Runnable f2128G = new Runnable() {
        public void run() {
            if (C0746x.m3803a(NativeExpressView.this, 0, 5)) {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                nativeExpressView.mo1882d(nativeExpressView.getVisibility());
                return;
            }
            NativeExpressView.this.mo1882d(8);
        }
    };

    /* renamed from: H */
    private final Runnable f2129H = new Runnable() {
        public void run() {
            NativeExpressView.this.mo1882d(0);
        }
    };

    /* renamed from: I */
    private final Runnable f2130I = new Runnable() {
        public void run() {
            NativeExpressView.this.mo1882d(8);
        }
    };

    /* renamed from: J */
    private ThemeStatusBroadcastReceiver f2131J;

    /* renamed from: K */
    private C0604o f2132K;

    /* renamed from: L */
    private C10292i.C10293a f2133L;

    /* renamed from: M */
    private List<C10292i> f2134M;

    /* renamed from: N */
    private C10300o f2135N;

    /* renamed from: O */
    private C10287e f2136O;

    /* renamed from: P */
    private C10291h f2137P;

    /* renamed from: Q */
    private C10296l f2138Q;

    /* renamed from: R */
    private SparseArray<C0408c.C0409a> f2139R = new SparseArray<>();

    /* renamed from: S */
    private float f2140S = -1.0f;

    /* renamed from: T */
    private float f2141T = -1.0f;

    /* renamed from: U */
    private float f2142U = -1.0f;

    /* renamed from: V */
    private float f2143V = -1.0f;

    /* renamed from: W */
    private long f2144W = 0;

    /* renamed from: a */
    private boolean f2145a = true;

    /* renamed from: b */
    private int f2146b = 0;

    /* renamed from: c */
    private C0759b f2147c;

    /* renamed from: d */
    private TTDislikeDialogAbstract f2148d;

    /* renamed from: e */
    private TTNativeExpressAd.ExpressAdInteractionListener f2149e;

    /* renamed from: f */
    protected final Context f2150f;

    /* renamed from: g */
    protected String f2151g = "embeded_ad";

    /* renamed from: h */
    protected AdSlot f2152h;
    /* access modifiers changed from: protected */

    /* renamed from: i */
    public C0477n f2153i;

    /* renamed from: j */
    protected TTNativeExpressAd.ExpressVideoAdListener f2154j;

    /* renamed from: k */
    protected FrameLayout f2155k;

    /* renamed from: l */
    protected boolean f2156l;

    /* renamed from: m */
    protected boolean f2157m = false;

    /* renamed from: n */
    protected C10285c f2158n;

    /* renamed from: o */
    protected boolean f2159o = false;

    /* renamed from: q */
    public boolean f2160q = false;

    /* renamed from: r */
    public C0146j f2161r = new C0146j();

    /* renamed from: s */
    protected C10283b f2162s;

    /* renamed from: t */
    public C10286d<? extends View> f2163t;

    /* renamed from: u */
    private C0590e f2164u;

    /* renamed from: v */
    private C0591f f2165v;

    /* renamed from: w */
    private final AtomicBoolean f2166w = new AtomicBoolean(false);

    /* renamed from: x */
    private String f2167x = null;

    /* renamed from: y */
    private float f2168y;

    /* renamed from: z */
    private float f2169z;

    /* renamed from: a */
    public void mo128a() {
    }

    /* renamed from: a */
    public void mo129a(int i) {
    }

    /* renamed from: a */
    public void mo130a(boolean z) {
    }

    /* renamed from: b */
    public void mo131b() {
    }

    /* renamed from: b */
    public void mo132b(int i) {
    }

    /* renamed from: c */
    public long mo133c() {
        return 0;
    }

    /* renamed from: d */
    public int mo134d() {
        return 0;
    }

    /* renamed from: e */
    public void mo135e() {
    }

    /* renamed from: f */
    public void mo1884f() {
    }

    public void setTimeUpdate(int i) {
    }

    public C0146j getAdShowTime() {
        return this.f2161r;
    }

    public void setClosedListenerKey(String str) {
        this.f2123B = str;
        C0575b bVar = this.f2126E;
        if (bVar != null) {
            bVar.mo1927a(str);
        }
    }

    public String getClosedListenerKey() {
        return this.f2123B;
    }

    public void setBannerClickClosedListener(C0424a.C0431a aVar) {
        this.f2124C = aVar;
    }

    public NativeExpressView(Context context, C0477n nVar, AdSlot adSlot, String str) {
        super(context);
        this.f2151g = str;
        this.f2150f = context;
        this.f2153i = nVar;
        this.f2152h = adSlot;
        this.f2160q = false;
        mo967g();
    }

    public NativeExpressView(Context context, C0477n nVar, AdSlot adSlot, String str, boolean z) {
        super(context);
        this.f2151g = str;
        this.f2150f = context;
        this.f2153i = nVar;
        this.f2152h = adSlot;
        this.f2160q = z;
        mo967g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo967g() {
        this.f2131J = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f2152h;
        if (adSlot != null) {
            this.f2168y = adSlot.getExpressViewAcceptedWidth();
            this.f2169z = this.f2152h.getExpressViewAcceptedHeight();
            this.f2167x = this.f2152h.getCodeId();
        }
        setBackgroundColor(0);
        if (this.f2153i.mo1404ay()) {
            this.f2126E = new C0575b(this.f2150f, this, this.f2153i);
            return;
        }
        mo1876h();
        this.f2134M = new ArrayList();
        m2739o();
        C10300o oVar = this.f2135N;
        if (oVar != null) {
            this.f2132K = (C0604o) oVar.mo63234d();
        }
    }

    public SSWebView getWebView() {
        C0604o oVar = this.f2132K;
        if (oVar == null) {
            return null;
        }
        return oVar.mo1993a();
    }

    /* renamed from: h */
    private void mo1876h() {
        long j;
        JSONObject a = C0574a.m2772a(this.f2168y, this.f2169z, this.f2157m, this.f2153i);
        boolean z = true;
        C0164u uVar = new C0164u(1, this.f2151g, this.f2153i);
        this.f2122A = uVar;
        this.f2137P = new C0594i(uVar, this.f2151g, this.f2153i, this.f2167x);
        boolean z2 = false;
        try {
            j = new JSONObject(this.f2153i.mo1327G().mo1495g()).optLong("render_delay_time");
            try {
                if (C0477n.m2012c(this.f2153i) || C0558m.m2673h().mo1702j(this.f2167x) != 1) {
                    z = false;
                }
                z2 = z;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        this.f2138Q = new C10296l.C10297a().mo63196a(this.f2151g).mo63202b(this.f2153i.mo1345Y()).mo63205c(C0996u.m4673i(this.f2153i)).mo63206d(this.f2153i.mo1382ac()).mo63198a(a).mo63195a(this.f2137P).mo63193a(C0558m.m2673h().mo1708m()).mo63199a(this.f2153i.mo1395ap()).mo63201b(this.f2153i.mo1469t()).mo63194a(Math.min(Math.max(j, 0), 10000)).mo63204c(this.f2153i.mo1332L()).mo63197a(C0574a.m2776b(this.f2153i)).mo63203b(z2).mo63200a();
    }

    /* renamed from: o */
    private void m2739o() {
        if (m2747w()) {
            m2740p();
            return;
        }
        try {
            m2741q();
            C0604o oVar = new C0604o(this.f2150f, this.f2138Q, this.f2131J, this.f2122A, this.f2153i);
            this.f2132K = oVar;
            C10300o oVar2 = new C10300o(this.f2150f, this.f2138Q, oVar, this);
            this.f2135N = oVar2;
            this.f2134M.add(oVar2);
        } catch (Exception e) {
            C10638l.m31239c("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        C10287e eVar = new C10287e(this.f2150f, this.f2138Q, new C0599l(this, this.f2131J, this.f2138Q));
        this.f2136O = eVar;
        this.f2134M.add(eVar);
        this.f2133L = new C10295k(this.f2134M, this.f2137P);
    }

    /* renamed from: p */
    private void m2740p() {
        this.f2146b = this.f2153i.mo1462q();
        try {
            m2741q();
            m2742r();
        } catch (Exception e) {
            C10638l.m31239c("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = true;
        if (this.f2153i.mo1465r() != 1) {
            z = false;
        }
        this.f2145a = z;
        if (z) {
            C10287e eVar = new C10287e(this.f2150f, this.f2138Q, new C0599l(this, this.f2131J, this.f2138Q));
            this.f2136O = eVar;
            this.f2134M.add(eVar);
        }
        this.f2133L = new C10295k(this.f2134M, this.f2137P);
    }

    /* renamed from: q */
    private void m2741q() {
        if (!TTAdSdk.isInitSuccess()) {
            C0547k.m2619b();
        }
    }

    /* renamed from: r */
    private void m2742r() {
        C0438a aVar = new C0438a();
        int i = this.f2146b;
        if (i == 1) {
            C10283b bVar = new C10283b(this.f2150f, this.f2138Q, this.f2131J, this.f2160q, new C10363f(this.f2150f, C0435a.m1788a(this.f2138Q, this.f2153i)), this, aVar);
            this.f2162s = bVar;
            this.f2134M.add(bVar);
        } else if (i == 2) {
            C10363f fVar = new C10363f(this.f2150f, C0435a.m1788a(this.f2138Q, this.f2153i));
            C0604o oVar = new C0604o(this.f2150f, this.f2138Q, this.f2131J, this.f2122A, this.f2153i);
            this.f2132K = oVar;
            this.f2135N = new C10300o(this.f2150f, this.f2138Q, oVar, this);
            this.f2162s = new C10283b(this.f2150f, this.f2138Q, this.f2131J, this.f2160q, fVar, this, aVar);
            this.f2134M.add(this.f2135N);
            this.f2134M.add(this.f2162s);
        } else if (i != 3) {
            C0604o oVar2 = new C0604o(this.f2150f, this.f2138Q, this.f2131J, this.f2122A, this.f2153i);
            this.f2132K = oVar2;
            C10300o oVar3 = new C10300o(this.f2150f, this.f2138Q, oVar2, this);
            this.f2135N = oVar3;
            this.f2134M.add(oVar3);
        } else {
            C10283b bVar2 = new C10283b(this.f2150f, this.f2138Q, this.f2131J, this.f2160q, new C10368h(), this, aVar);
            this.f2162s = bVar2;
            this.f2134M.add(bVar2);
        }
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f2154j = expressVideoAdListener;
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        C10286d<? extends View> dVar = this.f2163t;
        if (!(dVar == null || !(dVar instanceof C0599l) || (backupView = (BackupView) dVar.mo1946e()) == null)) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        C0575b bVar = this.f2126E;
        if (bVar != null) {
            bVar.mo1926a(tTDislikeDialogAbstract);
        }
        this.f2148d = tTDislikeDialogAbstract;
    }

    public void setDislike(C0759b bVar) {
        BackupView backupView;
        C10286d<? extends View> dVar = this.f2163t;
        if (!(dVar == null || !(dVar instanceof C0599l) || (backupView = (BackupView) dVar.mo1946e()) == null)) {
            backupView.setDislikeInner(bVar);
        }
        C0575b bVar2 = this.f2126E;
        if (bVar2 != null) {
            bVar2.mo1925a((TTAdDislike) bVar);
        }
        this.f2147c = bVar;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f2149e = expressAdInteractionListener;
    }

    public void setClickCreativeListener(C0590e eVar) {
        this.f2164u = eVar;
    }

    public C0590e getClickCreativeListener() {
        return this.f2164u;
    }

    public C0591f getClickListener() {
        return this.f2165v;
    }

    public void setClickListener(C0591f fVar) {
        this.f2165v = fVar;
    }

    public void setBackupListener(C10285c cVar) {
        this.f2158n = cVar;
        C10287e eVar = this.f2136O;
        if (eVar != null) {
            eVar.mo63165a(cVar);
        }
    }

    /* renamed from: i */
    public void mo1894i() {
        C10286d<? extends View> dVar = this.f2163t;
        if ((dVar instanceof C0604o) && dVar != null) {
            ((C0604o) dVar).mo1999j();
        }
    }

    /* renamed from: d */
    public void mo1882d(int i) {
        C10286d<? extends View> dVar = this.f2163t;
        if (dVar != null && (dVar instanceof C0604o)) {
            ((C0604o) dVar).mo1994a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        removeCallbacks(this.f2130I);
        removeCallbacks(this.f2129H);
        if (i == 0) {
            postDelayed(this.f2129H, 50);
        } else {
            postDelayed(this.f2130I, 50);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        m2743s();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m2743s() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                if (NativeExpressView.this.f2125D.get()) {
                    NativeExpressView.this.f2161r.mo421a(System.currentTimeMillis(), C0746x.m3801a(NativeExpressView.this));
                }
            }
        });
    }

    /* renamed from: j */
    public void mo1895j() {
        if (this.f2153i.mo1404ay()) {
            C0575b bVar = this.f2126E;
            if (bVar == null) {
                mo1880a_(106);
                return;
            }
            bVar.mo1924a((C10299n) this);
            this.f2126E.mo1923a();
            return;
        }
        this.f2122A.mo460a();
        C10292i.C10293a aVar = this.f2133L;
        if (aVar != null) {
            aVar.mo63168a((C10299n) this);
        }
        this.f2133L.mo63166a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        C0590e eVar = this.f2164u;
        if (eVar != null) {
            eVar.mo1111b(motionEvent.getDeviceId());
            this.f2164u.mo1098a(motionEvent.getSource());
            this.f2164u.mo1113c(motionEvent.getToolType(0));
        }
        C0591f fVar = this.f2165v;
        if (fVar != null) {
            fVar.mo1111b(motionEvent.getDeviceId());
            this.f2165v.mo1098a(motionEvent.getSource());
            this.f2165v.mo1113c(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2140S = motionEvent.getRawX();
            this.f2141T = motionEvent.getRawY();
            this.f2144W = System.currentTimeMillis();
            i = 0;
        } else if (actionMasked == 1) {
            i = 3;
        } else if (actionMasked != 2) {
            i = actionMasked != 3 ? -1 : 4;
        } else {
            this.f2142U += Math.abs(motionEvent.getX() - this.f2140S);
            this.f2143V += Math.abs(motionEvent.getY() - this.f2141T);
            this.f2140S = motionEvent.getX();
            this.f2141T = motionEvent.getY();
            i = (System.currentTimeMillis() - this.f2144W <= 200 || (this.f2142U <= 8.0f && this.f2143V <= 8.0f)) ? 2 : 1;
        }
        SparseArray<C0408c.C0409a> sparseArray = this.f2139R;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new C0408c.C0409a(i, (double) motionEvent.getSize(), (double) motionEvent.getPressure(), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo965a(android.view.View r24, int r25, com.bytedance.sdk.component.adexpress.C10281b r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = -1
            if (r2 == r3) goto L_0x01d2
            if (r26 != 0) goto L_0x000d
            goto L_0x01d2
        L_0x000d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.e.n r4 = r0.f2153i
            boolean r4 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2198i(r4)
            java.lang.String r5 = "click_scence"
            r6 = 1
            if (r4 == 0) goto L_0x0026
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r4)
            goto L_0x002d
        L_0x0026:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r4)
        L_0x002d:
            r4 = r26
            com.bytedance.sdk.openadsdk.core.e.j r4 = (com.bytedance.sdk.openadsdk.core.p021e.C0460j) r4
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.f2164u
            if (r5 == 0) goto L_0x0041
            int r7 = r23.getDynamicShowType()
            r5.mo1115d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.f2164u
            r5.mo1108a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0041:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.f2165v
            if (r5 == 0) goto L_0x0051
            int r7 = r23.getDynamicShowType()
            r5.mo1115d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.f2165v
            r5.mo1108a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0051:
            float r9 = r4.f1551a
            float r10 = r4.f1552b
            float r11 = r4.f1553c
            float r12 = r4.f1554d
            boolean r14 = r4.f1565o
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r4.f1564n
            if (r3 == 0) goto L_0x0065
            int r5 = r3.size()
            if (r5 != 0) goto L_0x0067
        L_0x0065:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r0.f2139R
        L_0x0067:
            r13 = r3
            java.lang.String r3 = r4.f1561k
            r5 = 0
            if (r1 != 0) goto L_0x006f
            r8 = r0
            goto L_0x0076
        L_0x006f:
            if (r1 == r0) goto L_0x0075
            org.json.JSONObject r5 = m2734a((android.view.View) r24)
        L_0x0075:
            r8 = r1
        L_0x0076:
            if (r4 == 0) goto L_0x0082
            r4.f1562l = r2
            if (r5 == 0) goto L_0x0082
            org.json.JSONObject r1 = r4.f1563m
            if (r1 != 0) goto L_0x0082
            r4.f1563m = r5
        L_0x0082:
            switch(r2) {
                case 1: goto L_0x0190;
                case 2: goto L_0x0166;
                case 3: goto L_0x014c;
                case 4: goto L_0x009f;
                case 5: goto L_0x0097;
                case 6: goto L_0x0092;
                case 7: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x01d2
        L_0x0087:
            android.content.Context r1 = r0.f2150f
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f2153i
            java.lang.String r3 = r0.f2151g
            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.m414a(r1, r2, r3)
            goto L_0x01d2
        L_0x0092:
            r23.mo128a()
            goto L_0x01d2
        L_0x0097:
            boolean r1 = r0.f2160q
            r1 = r1 ^ r6
            r0.mo130a((boolean) r1)
            goto L_0x01d2
        L_0x009f:
            android.widget.FrameLayout r1 = r0.f2155k
            if (r1 == 0) goto L_0x00b6
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x00b6:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f2153i
            if (r1 == 0) goto L_0x00c3
            int r1 = r1.mo1434h()
            if (r1 != r6) goto L_0x00c3
            if (r14 != 0) goto L_0x00c3
            return
        L_0x00c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Creativity....mAdType="
            r1.append(r2)
            java.lang.String r2 = r0.f2151g
            r1.append(r2)
            java.lang.String r2 = ",!mVideoPause="
            r1.append(r2)
            boolean r2 = r0.f2156l
            r2 = r2 ^ r6
            r1.append(r2)
            java.lang.String r2 = "，isAutoPlay="
            r1.append(r2)
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f2153i
            boolean r2 = com.bytedance.sdk.openadsdk.utils.C0996u.m4677j((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ClickCreativeListener"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r2, (java.lang.String) r1)
            java.lang.String r1 = r0.f2151g
            java.lang.String r5 = "embeded_ad"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0127
            boolean r1 = r23.m2744t()
            if (r1 == 0) goto L_0x0127
            boolean r1 = r0.f2156l
            if (r1 != 0) goto L_0x0127
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f2153i
            boolean r1 = com.bytedance.sdk.openadsdk.utils.C0996u.m4677j((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r1)
            if (r1 == 0) goto L_0x0127
            java.lang.String r1 = "Creative...."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f2164u
            if (r1 == 0) goto L_0x013d
            r1.mo1959a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f2164u
            r1.mo1107a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.f2164u
            r7.mo106a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x013d
        L_0x0127:
            java.lang.String r1 = "normal...."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f2165v
            if (r1 == 0) goto L_0x013d
            r1.mo1960a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f2165v
            r1.mo1107a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.f2165v
            r7.mo106a(r8, r9, r10, r11, r12, r13, r14)
        L_0x013d:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f2149e
            if (r1 == 0) goto L_0x01d2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f2153i
            int r2 = r2.mo1332L()
            r1.onAdClicked(r0, r2)
            goto L_0x01d2
        L_0x014c:
            com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract r1 = r0.f2148d
            if (r1 == 0) goto L_0x0155
            r1.show()
            goto L_0x01d2
        L_0x0155:
            com.bytedance.sdk.openadsdk.dislike.b r1 = r0.f2147c
            if (r1 == 0) goto L_0x015e
            r1.showDislikeDialog()
            goto L_0x01d2
        L_0x015e:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f2153i
            java.lang.String r2 = r0.f2123B
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.m183a((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r1, (java.lang.String) r2)
            goto L_0x01d2
        L_0x0166:
            int r1 = r4.f1566p
            if (r1 <= 0) goto L_0x016d
            com.bytedance.sdk.openadsdk.core.C0747y.m3810a(r6)
        L_0x016d:
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f2164u
            if (r1 == 0) goto L_0x017e
            r1.mo1959a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f2164u
            r1.mo1107a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.f2164u
            r7.mo106a(r8, r9, r10, r11, r12, r13, r14)
        L_0x017e:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f2149e
            if (r1 == 0) goto L_0x018b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f2153i
            int r2 = r2.mo1332L()
            r1.onAdClicked(r0, r2)
        L_0x018b:
            r1 = 0
            com.bytedance.sdk.openadsdk.core.C0747y.m3810a(r1)
            goto L_0x01d2
        L_0x0190:
            android.widget.FrameLayout r1 = r0.f2155k
            if (r1 == 0) goto L_0x01a7
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x01a7:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f2153i
            if (r1 == 0) goto L_0x01b4
            int r1 = r1.mo1434h()
            if (r1 != r6) goto L_0x01b4
            if (r14 != 0) goto L_0x01b4
            return
        L_0x01b4:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f2165v
            if (r1 == 0) goto L_0x01c5
            r1.mo1960a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f2165v
            r1.mo1107a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.f2165v
            r7.mo106a(r8, r9, r10, r11, r12, r13, r14)
        L_0x01c5:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f2149e
            if (r1 == 0) goto L_0x01d2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f2153i
            int r2 = r2.mo1332L()
            r1.onAdClicked(r0, r2)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.mo965a(android.view.View, int, com.bytedance.sdk.component.adexpress.b):void");
    }

    /* renamed from: a */
    public static JSONObject m2734a(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IabUtils.KEY_WIDTH, view.getWidth());
            jSONObject.put(IabUtils.KEY_HEIGHT, view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: t */
    private boolean m2744t() {
        return C0477n.m2012c(this.f2153i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getAdSlotType() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f2151g
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1695837674: goto L_0x004a;
                case -1364000502: goto L_0x0040;
                case -1263194568: goto L_0x0036;
                case -764631662: goto L_0x002c;
                case -712491894: goto L_0x0022;
                case 1844104722: goto L_0x0018;
                case 1912999166: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0054
        L_0x000e:
            java.lang.String r1 = "draw_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0018:
            java.lang.String r1 = "interaction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 5
            goto L_0x0055
        L_0x0022:
            java.lang.String r1 = "embeded_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0055
        L_0x002c:
            java.lang.String r1 = "fullscreen_interstitial_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 3
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "open_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 6
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "rewarded_video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 2
            goto L_0x0055
        L_0x004a:
            java.lang.String r1 = "banner_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 4
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            switch(r0) {
                case 1: goto L_0x0061;
                case 2: goto L_0x005f;
                case 3: goto L_0x005c;
                case 4: goto L_0x005b;
                case 5: goto L_0x005a;
                case 6: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r2
        L_0x0059:
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            return r5
        L_0x005c:
            r0 = 8
            return r0
        L_0x005f:
            r0 = 7
            return r0
        L_0x0061:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.getAdSlotType():int");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2743s();
        m2745u();
        C10638l.m31242e("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.f2127F);
        C0503h.m2281d().mo1584a(this.f2123B, this.f2124C);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m2743s();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C10638l.m31242e("webviewpool", "onFinishTemporaryDetach+++");
    }

    /* renamed from: u */
    private void m2745u() {
        List<C10292i> list = this.f2134M;
        if (list != null) {
            for (C10292i next : list) {
                if (next != null) {
                    next.mo63162b();
                }
            }
        }
    }

    /* renamed from: v */
    private void m2746v() {
        List<C10292i> list = this.f2134M;
        if (list != null) {
            for (C10292i next : list) {
                if (next != null) {
                    next.mo63163c();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo1896k() {
        C0604o oVar = this.f2132K;
        if (oVar != null && oVar.mo1946e() != null) {
            this.f2132K.mo1997f();
        }
    }

    /* renamed from: l */
    public void mo1897l() {
        try {
            if (this.f2126E != null) {
                this.f2126E.mo1928b();
            }
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            if (this.f2134M != null) {
                for (C10292i a : this.f2134M) {
                    a.mo63160a();
                }
            }
            this.f2147c = null;
            this.f2148d = null;
            this.f2152h = null;
            this.f2153i = null;
            this.f2149e = null;
            this.f2164u = null;
            this.f2158n = null;
            this.f2165v = null;
            this.f2154j = null;
        } catch (Throwable th) {
            C10638l.m31239c("NativeExpressView", "detach error", th);
        }
    }

    /* renamed from: m */
    public void mo1898m() {
        try {
            if (this.f2155k != null && this.f2155k.getParent() != null) {
                removeView(this.f2155k);
            }
        } catch (Throwable th) {
            C10638l.m31230a("NativeExpressView", "backupDestroy remove video container error", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f2127F);
        C0503h.m2281d().mo1605f(this.f2123B);
        m2746v();
        C10638l.m31242e("webviewpool", "onDetachedFromWindow===");
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C10638l.m31242e("webviewpool", "onStartTemporaryDetach===");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.d<? extends android.view.View>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo966a(com.bytedance.sdk.component.adexpress.p298b.C10286d<? extends android.view.View> r5, com.bytedance.sdk.component.adexpress.p298b.C10298m r6) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f2125D
            r1 = 1
            r0.set(r1)
            r4.f2163t = r5
            int r0 = r5.mo1943c()
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f2153i
            int r0 = r0.mo1428f()
            if (r0 != r1) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f2153i
            r0.mo1408b((int) r3)
        L_0x001d:
            int r0 = r5.mo1943c()
            r1 = 2
            if (r0 == r1) goto L_0x0030
            int r0 = r5.mo1943c()
            if (r0 == 0) goto L_0x0030
            int r0 = r5.mo1943c()
            if (r0 != r2) goto L_0x007a
        L_0x0030:
            android.view.View r0 = r5.mo1946e()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0043
            android.view.ViewParent r1 = r0.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L_0x0043:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0049:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L_0x0059
            android.view.View r2 = r4.getChildAt(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0059:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0073
            java.lang.Object r1 = r0.get(r3)
            boolean r1 = r1 instanceof com.bytedance.sdk.component.widget.SSWebView
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.get(r3)
            android.view.View r1 = (android.view.View) r1
            r4.removeView(r1)
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0073:
            android.view.View r5 = r5.mo1946e()
            r4.addView(r5)
        L_0x007a:
            com.bytedance.sdk.component.adexpress.b.h r5 = r4.f2137P
            if (r5 == 0) goto L_0x0083
            com.bytedance.sdk.openadsdk.core.nativeexpress.i r5 = (com.bytedance.sdk.openadsdk.core.nativeexpress.C0594i) r5
            r5.mo1978i()
        L_0x0083:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r5 = r4.f2149e
            if (r5 == 0) goto L_0x0094
            double r0 = r6.mo63213b()
            float r0 = (float) r0
            double r1 = r6.mo63218c()
            float r6 = (float) r1
            r5.onRenderSuccess(r4, r0, r6)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.mo966a(com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.m):void");
    }

    /* renamed from: a_ */
    public void mo1880a_(int i) {
        C10291h hVar = this.f2137P;
        if (hVar != null) {
            if (!this.f2145a) {
                hVar.mo1973f();
            }
            this.f2137P.mo1975g();
            ((C0594i) this.f2137P).mo1978i();
        }
        TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f2149e;
        if (expressAdInteractionListener != null) {
            expressAdInteractionListener.onRenderFail(this, C0492g.m2254a(i), i);
        }
    }

    /* renamed from: n */
    public boolean mo1899n() {
        C10286d<? extends View> dVar = this.f2163t;
        return dVar != null && dVar.mo1943c() == 1;
    }

    public int getDynamicShowType() {
        C10286d<? extends View> dVar = this.f2163t;
        if (dVar != null) {
            return dVar.mo1943c();
        }
        return 0;
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.f2168y).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.f2169z).intValue();
    }

    public C0709w getJsObject() {
        C0604o oVar = this.f2132K;
        if (oVar != null) {
            return oVar.mo2005p();
        }
        return null;
    }

    /* renamed from: w */
    private boolean m2747w() {
        return TextUtils.equals(this.f2151g, "fullscreen_interstitial_ad") || TextUtils.equals(this.f2151g, "rewarded_video") || C0604o.m2910b(this.f2151g);
    }

    /* renamed from: a */
    public void mo1879a(CharSequence charSequence, int i, int i2) {
        mo1881b(Integer.parseInt(String.valueOf(charSequence)), i);
    }

    public void setSoundMute(boolean z) {
        this.f2160q = z;
        C10283b bVar = this.f2162s;
        if (bVar != null && bVar.mo63164d() != null) {
            this.f2162s.mo63164d().setSoundMute(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1881b(int i, int i2) {
        int i3;
        if (TextUtils.equals(this.f2151g, "fullscreen_interstitial_ad")) {
            i3 = C0558m.m2673h().mo1686e(Integer.valueOf(this.f2167x).intValue());
        } else if (TextUtils.equals(this.f2151g, "rewarded_video")) {
            i3 = C0558m.m2673h().mo1690f(this.f2167x);
        } else {
            return;
        }
        if (i3 < 0) {
            i3 = 5;
        }
        int i4 = 0;
        int i5 = (i2 >= i3 || mo134d() == 5) ? 1 : 0;
        if (i2 <= i3) {
            i4 = i3 - i2;
        }
        C10283b bVar = this.f2162s;
        if (bVar != null && bVar.mo63164d() != null) {
            this.f2162s.mo63164d().mo1879a(String.valueOf(i), i5, i4);
        }
    }
}
