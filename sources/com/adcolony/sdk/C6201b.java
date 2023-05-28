package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.Map;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.b */
class C6201b extends Activity {

    /* renamed from: a */
    C6223c f13315a;

    /* renamed from: b */
    int f13316b = -1;

    /* renamed from: c */
    int f13317c;

    /* renamed from: d */
    boolean f13318d;

    /* renamed from: e */
    boolean f13319e;

    /* renamed from: f */
    boolean f13320f;

    /* renamed from: g */
    boolean f13321g;

    /* renamed from: h */
    boolean f13322h;

    /* renamed from: i */
    boolean f13323i;

    /* renamed from: com.adcolony.sdk.b$a */
    class C6202a implements C6327j0 {
        C6202a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6201b.this.mo50384a(h0Var);
        }
    }

    C6201b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50457a(boolean z) {
        Iterator<Map.Entry<Integer, C6190a1>> it = this.f13315a.mo50553m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            C6190a1 a1Var = (C6190a1) it.next().getValue();
            if (!a1Var.mo50436f() && a1Var.mo50432b().isPlaying()) {
                a1Var.mo50437h();
            }
        }
        AdColonyInterstitial j = C6185a.m14887b().mo50799j();
        if (j != null && j.mo50361i() && j.mo50353e().mo50903c() != null && z && this.f13322h) {
            j.mo50353e().mo50900a("pause");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50458b(boolean z) {
        for (Map.Entry<Integer, C6190a1> value : this.f13315a.mo50553m().entrySet()) {
            C6190a1 a1Var = (C6190a1) value.getValue();
            if (!a1Var.mo50436f() && !a1Var.mo50432b().isPlaying() && !C6185a.m14887b().mo50804o().mo50978b()) {
                a1Var.mo50438i();
            }
        }
        AdColonyInterstitial j = C6185a.m14887b().mo50799j();
        if (j != null && j.mo50361i() && j.mo50353e().mo50903c() != null) {
            if ((!z || !this.f13322h) && this.f13323i) {
                j.mo50353e().mo50900a("resume");
            }
        }
    }

    public void onBackPressed() {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "id", this.f13315a.mo50523a());
        new C6312h0("AdSession.on_back_button", this.f13315a.mo50551k(), b).mo50736c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            mo50455a();
        } else {
            ((AdColonyAdViewActivity) this).mo50267c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C6185a.m14890d() || C6185a.m14887b().mo50801l() == null) {
            finish();
            return;
        }
        C6328k b = C6185a.m14887b();
        this.f13320f = false;
        C6223c l = b.mo50801l();
        this.f13315a = l;
        l.mo50537d(false);
        if (C6509z0.m15969g()) {
            this.f13315a.mo50537d(true);
        }
        this.f13315a.mo50523a();
        this.f13317c = this.f13315a.mo50551k();
        boolean multiWindowEnabled = b.mo50810u().getMultiWindowEnabled();
        this.f13321g = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        if (b.mo50810u().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f13315a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f13315a);
        }
        setContentView(this.f13315a);
        this.f13315a.mo50547i().add(C6185a.m14881a("AdSession.finish_fullscreen_ad", (C6327j0) new C6202a(), true));
        this.f13315a.mo50549j().add("AdSession.finish_fullscreen_ad");
        mo50456a(this.f13316b);
        if (!this.f13315a.mo50555o()) {
            C6294f1 b2 = C6235c0.m15073b();
            C6235c0.m15070a(b2, "id", this.f13315a.mo50523a());
            C6235c0.m15077b(b2, "screen_width", this.f13315a.mo50535d());
            C6235c0.m15077b(b2, "screen_height", this.f13315a.mo50529b());
            new C6312h0("AdSession.on_fullscreen_ad_started", this.f13315a.mo50551k(), b2).mo50736c();
            this.f13315a.mo50539e(true);
            return;
        }
        mo50455a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (C6185a.m14890d() && this.f13315a != null && !this.f13318d) {
            if ((Build.VERSION.SDK_INT < 24 || !C6509z0.m15969g()) && !this.f13315a.mo50559q()) {
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15070a(b, "id", this.f13315a.mo50523a());
                new C6312h0("AdSession.on_error", this.f13315a.mo50551k(), b).mo50736c();
                this.f13320f = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo50457a(this.f13319e);
        this.f13319e = false;
    }

    public void onResume() {
        super.onResume();
        mo50455a();
        mo50458b(this.f13319e);
        this.f13319e = true;
        this.f13323i = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f13319e) {
            C6185a.m14887b().mo50813x().mo51009b(true);
            mo50458b(this.f13319e);
            this.f13322h = true;
        } else if (!z && this.f13319e) {
            C6185a.m14887b().mo50813x().mo51007a(true);
            mo50457a(this.f13319e);
            this.f13322h = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50455a() {
        Rect rect;
        C6328k b = C6185a.m14887b();
        if (this.f13315a == null) {
            this.f13315a = b.mo50801l();
        }
        C6223c cVar = this.f13315a;
        if (cVar != null) {
            cVar.mo50537d(false);
            if (C6509z0.m15969g()) {
                this.f13315a.mo50537d(true);
            }
            if (this.f13321g) {
                rect = b.mo50803n().mo50961x();
            } else {
                rect = b.mo50803n().mo50960w();
            }
            if (rect.width() > 0 && rect.height() > 0) {
                C6294f1 b2 = C6235c0.m15073b();
                C6294f1 b3 = C6235c0.m15073b();
                float s = b.mo50803n().mo50956s();
                C6235c0.m15077b(b3, IabUtils.KEY_WIDTH, (int) (((float) rect.width()) / s));
                C6235c0.m15077b(b3, IabUtils.KEY_HEIGHT, (int) (((float) rect.height()) / s));
                C6235c0.m15077b(b3, "app_orientation", C6509z0.m15960d(C6509z0.m15967f()));
                C6235c0.m15077b(b3, "x", 0);
                C6235c0.m15077b(b3, "y", 0);
                C6235c0.m15070a(b3, "ad_session_id", this.f13315a.mo50523a());
                C6235c0.m15077b(b2, "screen_width", rect.width());
                C6235c0.m15077b(b2, "screen_height", rect.height());
                C6235c0.m15070a(b2, "ad_session_id", this.f13315a.mo50523a());
                C6235c0.m15077b(b2, "id", this.f13315a.mo50532c());
                this.f13315a.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), rect.height()));
                this.f13315a.mo50531b(rect.width());
                this.f13315a.mo50524a(rect.height());
                new C6312h0("MRAID.on_size_change", this.f13315a.mo50551k(), b3).mo50736c();
                new C6312h0("AdContainer.on_orientation_change", this.f13315a.mo50551k(), b2).mo50736c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50384a(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "status");
        if ((d == 5 || d == 0 || d == 6 || d == 1) && !this.f13318d) {
            C6328k b = C6185a.m14887b();
            C6415r o = b.mo50804o();
            b.mo50790d(h0Var);
            if (o.mo50976a() != null) {
                o.mo50976a().dismiss();
                o.mo50977a((AlertDialog) null);
            }
            if (!this.f13320f) {
                finish();
            }
            this.f13318d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            b.mo50793e(false);
            C6294f1 b2 = C6235c0.m15073b();
            C6235c0.m15070a(b2, "id", this.f13315a.mo50523a());
            new C6312h0("AdSession.on_close", this.f13315a.mo50551k(), b2).mo50736c();
            b.mo50782a((C6223c) null);
            b.mo50780a((AdColonyInterstitial) null);
            b.mo50777a((AdColonyAdView) null);
            C6185a.m14887b().mo50787c().mo50621f().remove(this.f13315a.mo50523a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50456a(int i) {
        if (i == 0) {
            setRequestedOrientation(7);
        } else if (i != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f13316b = i;
    }
}
