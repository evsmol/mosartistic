package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C6288e0;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
import p150io.bidmachine.utils.IabUtils;

public class AdColonyAdView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6223c f13153a;

    /* renamed from: b */
    private AdColonyAdViewListener f13154b;

    /* renamed from: c */
    private AdColonyAdSize f13155c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f13156d;

    /* renamed from: e */
    private String f13157e;

    /* renamed from: f */
    private String f13158f;

    /* renamed from: g */
    private String f13159g;

    /* renamed from: h */
    private ImageView f13160h;

    /* renamed from: i */
    private C6401p0 f13161i;

    /* renamed from: j */
    private C6312h0 f13162j;

    /* renamed from: k */
    private boolean f13163k;

    /* renamed from: l */
    private boolean f13164l;

    /* renamed from: m */
    private boolean f13165m;

    /* renamed from: n */
    private boolean f13166n;

    /* renamed from: o */
    private boolean f13167o;

    /* renamed from: p */
    private boolean f13168p = true;

    /* renamed from: q */
    private int f13169q;

    /* renamed from: r */
    private int f13170r;

    /* renamed from: s */
    private int f13171s;

    /* renamed from: t */
    private int f13172t;

    /* renamed from: u */
    private int f13173u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C6176c f13174v;

    /* renamed from: com.adcolony.sdk.AdColonyAdView$a */
    class C6174a implements Runnable {
        C6174a() {
        }

        public void run() {
            Context a = C6185a.m14880a();
            if (a instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) a).mo50266b();
            }
            C6252d c = C6185a.m14887b().mo50787c();
            c.mo50605a(AdColonyAdView.this.f13156d);
            c.mo50609a(AdColonyAdView.this.f13153a);
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "id", AdColonyAdView.this.f13156d);
            new C6312h0("AdSession.on_ad_view_destroyed", 1, b).mo50736c();
            if (AdColonyAdView.this.f13174v != null) {
                AdColonyAdView.this.f13174v.mo50265a();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$b */
    class C6175b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f13176a;

        C6175b(AdColonyAdView adColonyAdView, Context context) {
            this.f13176a = context;
        }

        public void onClick(View view) {
            Context context = this.f13176a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).mo50266b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$c */
    interface C6176c {
        /* renamed from: a */
        void mo50265a();
    }

    AdColonyAdView(Context context, C6312h0 h0Var, AdColonyAdViewListener adColonyAdViewListener) throws RuntimeException {
        super(context);
        this.f13154b = adColonyAdViewListener;
        this.f13157e = adColonyAdViewListener.mo50280c();
        C6294f1 a = h0Var.mo50732a();
        this.f13156d = C6235c0.m15087h(a, "id");
        this.f13158f = C6235c0.m15087h(a, "close_button_filepath");
        this.f13163k = C6235c0.m15076b(a, "trusted_demand_source");
        this.f13167o = C6235c0.m15076b(a, "close_button_snap_to_webview");
        this.f13172t = C6235c0.m15083d(a, "close_button_width");
        this.f13173u = C6235c0.m15083d(a, "close_button_height");
        C6223c cVar = C6185a.m14887b().mo50787c().mo50616c().get(this.f13156d);
        this.f13153a = cVar;
        if (cVar != null) {
            this.f13155c = adColonyAdViewListener.mo50275a();
            setLayoutParams(new FrameLayout.LayoutParams(this.f13153a.mo50535d(), this.f13153a.mo50529b()));
            setBackgroundColor(0);
            addView(this.f13153a);
            return;
        }
        throw new RuntimeException("AdColonyAdView container cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo50240d() {
        return this.f13164l;
    }

    public boolean destroy() {
        if (this.f13164l) {
            new C6288e0.C6289a().mo50644a("Ignoring duplicate call to destroy().").mo50645a(C6288e0.f13495f);
            return false;
        }
        this.f13164l = true;
        C6401p0 p0Var = this.f13161i;
        if (!(p0Var == null || p0Var.mo50903c() == null)) {
            this.f13161i.mo50902b();
        }
        C6509z0.m15953b((Runnable) new C6174a());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50242e() {
        C6204b1 webView = getWebView();
        if (this.f13161i != null && webView != null) {
            webView.mo50468f();
        }
    }

    public AdColonyAdSize getAdSize() {
        return this.f13155c;
    }

    /* access modifiers changed from: package-private */
    public String getClickOverride() {
        return this.f13159g;
    }

    /* access modifiers changed from: package-private */
    public C6223c getContainer() {
        return this.f13153a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f13154b;
    }

    /* access modifiers changed from: package-private */
    public C6401p0 getOmidManager() {
        return this.f13161i;
    }

    /* access modifiers changed from: package-private */
    public int getOrientation() {
        return this.f13169q;
    }

    /* access modifiers changed from: package-private */
    public boolean getTrustedDemandSource() {
        return this.f13163k;
    }

    /* access modifiers changed from: package-private */
    public C6204b1 getWebView() {
        C6223c cVar = this.f13153a;
        if (cVar == null) {
            return null;
        }
        return cVar.mo50554n().get(2);
    }

    public String getZoneId() {
        return this.f13157e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13168p && !this.f13164l) {
            this.f13168p = false;
            AdColonyAdViewListener adColonyAdViewListener = this.f13154b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onShow(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setClickOverride(String str) {
        this.f13159g = str;
    }

    /* access modifiers changed from: package-private */
    public void setExpandMessage(C6312h0 h0Var) {
        this.f13162j = h0Var;
    }

    /* access modifiers changed from: package-private */
    public void setExpandedHeight(int i) {
        this.f13171s = (int) (((float) i) * C6185a.m14887b().mo50803n().mo50956s());
    }

    /* access modifiers changed from: package-private */
    public void setExpandedWidth(int i) {
        this.f13170r = (int) (((float) i) * C6185a.m14887b().mo50803n().mo50956s());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f13154b = adColonyAdViewListener;
    }

    /* access modifiers changed from: package-private */
    public void setNoCloseButton(boolean z) {
        this.f13165m = this.f13163k && z;
    }

    /* access modifiers changed from: package-private */
    public void setOmidManager(C6401p0 p0Var) {
        this.f13161i = p0Var;
    }

    /* access modifiers changed from: package-private */
    public void setOnDestroyListenerOrCall(C6176c cVar) {
        if (this.f13164l) {
            cVar.mo50265a();
        } else {
            this.f13174v = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void setOrientation(int i) {
        this.f13169q = i;
    }

    /* access modifiers changed from: package-private */
    public void setUserInteraction(boolean z) {
        this.f13166n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50237a() {
        if (this.f13163k || this.f13166n) {
            float s = C6185a.m14887b().mo50803n().mo50956s();
            this.f13153a.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) this.f13155c.getWidth()) * s), (int) (((float) this.f13155c.getHeight()) * s)));
            C6204b1 webView = getWebView();
            if (webView != null) {
                C6312h0 h0Var = new C6312h0("WebView.set_bounds", 0);
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15077b(b, "x", webView.getInitialX());
                C6235c0.m15077b(b, "y", webView.getInitialY());
                C6235c0.m15077b(b, IabUtils.KEY_WIDTH, webView.getInitialWidth());
                C6235c0.m15077b(b, IabUtils.KEY_HEIGHT, webView.getInitialHeight());
                h0Var.mo50735b(b);
                webView.mo50462a(h0Var);
                C6294f1 b2 = C6235c0.m15073b();
                C6235c0.m15070a(b2, "ad_session_id", this.f13156d);
                new C6312h0("MRAID.on_close", this.f13153a.mo50551k(), b2).mo50736c();
            }
            ImageView imageView = this.f13160h;
            if (imageView != null) {
                this.f13153a.removeView(imageView);
                this.f13153a.mo50525a((View) this.f13160h);
            }
            addView(this.f13153a);
            AdColonyAdViewListener adColonyAdViewListener = this.f13154b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50238b() {
        int i;
        if (this.f13163k || this.f13166n) {
            C6405q n = C6185a.m14887b().mo50803n();
            Rect w = n.mo50960w();
            int i2 = this.f13170r;
            if (i2 <= 0) {
                i2 = w.width();
            }
            int i3 = this.f13171s;
            if (i3 <= 0) {
                i3 = w.height();
            }
            int width = (w.width() - i2) / 2;
            int height = (w.height() - i3) / 2;
            this.f13153a.setLayoutParams(new FrameLayout.LayoutParams(w.width(), w.height()));
            C6204b1 webView = getWebView();
            if (webView != null) {
                C6312h0 h0Var = new C6312h0("WebView.set_bounds", 0);
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15077b(b, "x", width);
                C6235c0.m15077b(b, "y", height);
                C6235c0.m15077b(b, IabUtils.KEY_WIDTH, i2);
                C6235c0.m15077b(b, IabUtils.KEY_HEIGHT, i3);
                h0Var.mo50735b(b);
                webView.mo50462a(h0Var);
                float s = n.mo50956s();
                C6294f1 b2 = C6235c0.m15073b();
                C6235c0.m15077b(b2, "app_orientation", C6509z0.m15960d(C6509z0.m15967f()));
                C6235c0.m15077b(b2, IabUtils.KEY_WIDTH, (int) (((float) i2) / s));
                C6235c0.m15077b(b2, IabUtils.KEY_HEIGHT, (int) (((float) i3) / s));
                C6235c0.m15077b(b2, "x", C6509z0.m15924a((View) webView));
                C6235c0.m15077b(b2, "y", C6509z0.m15943b((View) webView));
                C6235c0.m15070a(b2, "ad_session_id", this.f13156d);
                new C6312h0("MRAID.on_size_change", this.f13153a.mo50551k(), b2).mo50736c();
            }
            ImageView imageView = this.f13160h;
            if (imageView != null) {
                this.f13153a.removeView(imageView);
            }
            Context a = C6185a.m14880a();
            if (!(a == null || this.f13165m || webView == null)) {
                float s2 = C6185a.m14887b().mo50803n().mo50956s();
                int i4 = (int) (((float) this.f13172t) * s2);
                int i5 = (int) (((float) this.f13173u) * s2);
                if (this.f13167o) {
                    i = webView.getCurrentX() + webView.getCurrentWidth();
                } else {
                    i = w.width();
                }
                int currentY = this.f13167o ? webView.getCurrentY() : 0;
                ImageView imageView2 = new ImageView(a.getApplicationContext());
                this.f13160h = imageView2;
                imageView2.setImageURI(Uri.fromFile(new File(this.f13158f)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
                layoutParams.setMargins(i - i4, currentY, 0, 0);
                this.f13160h.setOnClickListener(new C6175b(this, a));
                this.f13153a.addView(this.f13160h, layoutParams);
                this.f13153a.mo50526a((View) this.f13160h, FriendlyObstructionPurpose.CLOSE_AD);
            }
            if (this.f13162j != null) {
                C6294f1 b3 = C6235c0.m15073b();
                C6235c0.m15079b(b3, "success", true);
                this.f13162j.mo50733a(b3).mo50736c();
                this.f13162j = null;
            }
            return true;
        }
        if (this.f13162j != null) {
            C6294f1 b4 = C6235c0.m15073b();
            C6235c0.m15079b(b4, "success", false);
            this.f13162j.mo50733a(b4).mo50736c();
            this.f13162j = null;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo50239c() {
        return this.f13166n;
    }
}
