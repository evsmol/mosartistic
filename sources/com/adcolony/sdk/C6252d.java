package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.adcolony.sdk.C6288e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.d */
class C6252d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ConcurrentHashMap<String, Runnable> f13434a;

    /* renamed from: b */
    private HashMap<String, C6223c> f13435b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ConcurrentHashMap<String, AdColonyInterstitial> f13436c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f13437d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f13438e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<String, AdColonyAdView> f13439f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f13440g = new Object();

    /* renamed from: com.adcolony.sdk.d$a */
    class C6253a implements C6327j0 {
        C6253a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6252d.this.mo50620e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    class C6254b implements C6327j0 {

        /* renamed from: com.adcolony.sdk.d$b$a */
        class C6255a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13443a;

            C6255a(C6312h0 h0Var) {
                this.f13443a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C6252d.this.f13436c.get(C6235c0.m15087h(this.f13443a.mo50732a(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        C6254b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6509z0.m15953b((Runnable) new C6255a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    class C6256c implements C6327j0 {

        /* renamed from: com.adcolony.sdk.d$c$a */
        class C6257a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13446a;

            C6257a(C6312h0 h0Var) {
                this.f13446a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C6252d.this.f13436c.get(C6235c0.m15087h(this.f13446a.mo50732a(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        C6256c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6509z0.m15953b((Runnable) new C6257a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    class C6258d implements C6327j0 {
        C6258d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6252d.this.mo50625i(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$e */
    class C6259e implements C6327j0 {
        C6259e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6252d.this.mo50624h(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$f */
    class C6260f implements C6327j0 {
        C6260f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6252d.this.m15144g(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$g */
    class C6261g implements C6327j0 {
        C6261g(C6252d dVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.d$h */
    class C6262h implements C6327j0 {

        /* renamed from: com.adcolony.sdk.d$h$a */
        class C6263a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13451a;

            C6263a(C6262h hVar, C6312h0 h0Var) {
                this.f13451a = h0Var;
            }

            public void run() {
                C6312h0 h0Var = this.f13451a;
                h0Var.mo50733a(h0Var.mo50732a()).mo50736c();
            }
        }

        C6262h(C6252d dVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6509z0.m15953b((Runnable) new C6263a(this, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$i */
    class C6264i implements C6327j0 {
        C6264i(C6252d dVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6396o0.m15589c().mo50887a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$j */
    class C6265j implements Runnable {
        C6265j(C6252d dVar) {
        }

        public void run() {
            C6415r o = C6185a.m14887b().mo50804o();
            if (o.mo50976a() != null) {
                o.mo50976a().dismiss();
                o.mo50977a((AlertDialog) null);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$k */
    class C6266k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13452a;

        /* renamed from: b */
        final /* synthetic */ C6312h0 f13453b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f13454c;

        /* renamed from: d */
        final /* synthetic */ String f13455d;

        C6266k(Context context, C6312h0 h0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f13452a = context;
            this.f13453b = h0Var;
            this.f13454c = adColonyAdViewListener;
            this.f13455d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView;
            try {
                adColonyAdView = new AdColonyAdView(this.f13452a, this.f13453b, this.f13454c);
            } catch (RuntimeException e) {
                new C6288e0.C6289a().mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
                adColonyAdView = null;
            }
            synchronized (C6252d.this.f13440g) {
                if (C6252d.this.f13438e.remove(this.f13455d) != null) {
                    if (adColonyAdView == null) {
                        C6252d.this.m15128a(this.f13454c);
                        return;
                    }
                    C6252d.this.f13439f.put(this.f13455d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f13454c.mo50279b());
                    adColonyAdView.mo50242e();
                    this.f13454c.mo50277a((C6401p0) null);
                    this.f13454c.onRequestFilled(adColonyAdView);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$l */
    class C6267l implements C6327j0 {

        /* renamed from: com.adcolony.sdk.d$l$a */
        class C6268a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13458a;

            C6268a(C6312h0 h0Var) {
                this.f13458a = h0Var;
            }

            public void run() {
                C6252d.this.mo50617c(this.f13458a);
            }
        }

        C6267l() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6509z0.m15953b((Runnable) new C6268a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$m */
    class C6269m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6312h0 f13460a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f13461b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f13462c;

        C6269m(C6252d dVar, C6312h0 h0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f13460a = h0Var;
            this.f13461b = adColonyInterstitial;
            this.f13462c = adColonyInterstitialListener;
        }

        public void run() {
            C6294f1 a = this.f13460a.mo50732a();
            if (this.f13461b.mo50353e() == null) {
                this.f13461b.mo50340a(C6235c0.m15085f(a, "iab"));
            }
            this.f13461b.mo50341a(C6235c0.m15087h(a, "ad_id"));
            this.f13461b.mo50348c(C6235c0.m15087h(a, "creative_id"));
            this.f13461b.setViewNetworkPassFilter(C6235c0.m15087h(a, "view_network_pass_filter"));
            C6401p0 e = this.f13461b.mo50353e();
            if (!(e == null || e.mo50904d() == 2)) {
                try {
                    e.mo50897a();
                } catch (IllegalArgumentException unused) {
                    new C6288e0.C6289a().mo50644a("IllegalArgumentException when creating omid session").mo50645a(C6288e0.f13498i);
                }
            }
            this.f13462c.onRequestFilled(this.f13461b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$n */
    class C6270n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f13463a;

        C6270n(C6252d dVar, AdColonyAdViewListener adColonyAdViewListener) {
            this.f13463a = adColonyAdViewListener;
        }

        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f13463a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.m14776a(adColonyAdViewListener.mo50280c()));
            if (!C6185a.m14889c()) {
                new C6288e0.C6289a().mo50644a("RequestNotFilled called for AdView due to a missing context. ").mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$o */
    class C6271o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13464a;

        /* renamed from: b */
        final /* synthetic */ String f13465b;

        /* renamed from: c */
        final /* synthetic */ long f13466c;

        C6271o(String str, String str2, long j) {
            this.f13464a = str;
            this.f13465b = str2;
            this.f13466c = j;
        }

        public void run() {
            C6252d.this.f13434a.remove(this.f13464a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) C6252d.this.f13437d.remove(this.f13464a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.m14776a(this.f13465b));
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15070a(b, "id", this.f13464a);
                C6235c0.m15070a(b, "zone_id", this.f13465b);
                C6235c0.m15077b(b, "type", 1);
                C6235c0.m15077b(b, "request_fail_reason", 26);
                new C6312h0("AdSession.on_request_failure", 1, b).mo50736c();
                C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("RequestNotFilled called due to a native timeout. ");
                C6288e0.C6289a a2 = a.mo50644a("Timeout set to: " + C6185a.m14887b().mo50789d() + " ms. ");
                C6288e0.C6289a a3 = a2.mo50644a("AdView request time allowed: " + this.f13466c + " ms. ");
                a3.mo50644a("AdView with adSessionId(" + this.f13464a + ") - request failed.").mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$p */
    class C6272p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13468a;

        /* renamed from: b */
        final /* synthetic */ String f13469b;

        /* renamed from: c */
        final /* synthetic */ long f13470c;

        C6272p(String str, String str2, long j) {
            this.f13468a = str;
            this.f13469b = str2;
            this.f13470c = j;
        }

        public void run() {
            AdColonyInterstitialListener adColonyInterstitialListener;
            C6252d.this.f13434a.remove(this.f13468a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C6252d.this.f13436c.remove(this.f13468a);
            if (adColonyInterstitial == null) {
                adColonyInterstitialListener = null;
            } else {
                adColonyInterstitialListener = adColonyInterstitial.getListener();
            }
            if (adColonyInterstitialListener != null) {
                adColonyInterstitialListener.onRequestNotFilled(AdColony.m14776a(this.f13469b));
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15070a(b, "id", this.f13468a);
                C6235c0.m15070a(b, "zone_id", this.f13469b);
                C6235c0.m15077b(b, "type", 0);
                C6235c0.m15077b(b, "request_fail_reason", 26);
                new C6312h0("AdSession.on_request_failure", 1, b).mo50736c();
                C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("RequestNotFilled called due to a native timeout. ");
                C6288e0.C6289a a2 = a.mo50644a("Timeout set to: " + C6185a.m14887b().mo50789d() + " ms. ");
                C6288e0.C6289a a3 = a2.mo50644a("Interstitial request time allowed: " + this.f13470c + " ms. ");
                a3.mo50644a("Interstitial with adSessionId(" + this.f13468a + ") - request failed.").mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$q */
    class C6273q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f13472a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f13473b;

        C6273q(C6252d dVar, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f13472a = adColonyInterstitialListener;
            this.f13473b = adColonyInterstitial;
        }

        public void run() {
            C6185a.m14887b().mo50793e(false);
            this.f13472a.onClosed(this.f13473b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$r */
    class C6274r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13474a;

        /* renamed from: b */
        final /* synthetic */ C6204b1 f13475b;

        /* renamed from: c */
        final /* synthetic */ C6223c f13476c;

        C6274r(String str, C6204b1 b1Var, C6223c cVar) {
            this.f13474a = str;
            this.f13475b = b1Var;
            this.f13476c = cVar;
        }

        public void run() {
            C6401p0 p0Var;
            int i;
            try {
                AdColonyInterstitial adColonyInterstitial = C6252d.this.mo50621f().get(this.f13474a);
                AdColonyAdView adColonyAdView = C6252d.this.mo50618d().get(this.f13474a);
                if (adColonyInterstitial == null) {
                    p0Var = null;
                } else {
                    p0Var = adColonyInterstitial.mo50353e();
                }
                if (p0Var == null && adColonyAdView != null) {
                    p0Var = adColonyAdView.getOmidManager();
                }
                if (p0Var == null) {
                    i = -1;
                } else {
                    i = p0Var.mo50904d();
                }
                if (p0Var != null && i == 2) {
                    p0Var.mo50898a((WebView) this.f13475b);
                    p0Var.mo50899a(this.f13476c);
                }
            } catch (IllegalArgumentException unused) {
                new C6288e0.C6289a().mo50644a("IllegalArgumentException when creating omid session").mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$s */
    class C6275s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6223c f13478a;

        C6275s(C6252d dVar, C6223c cVar) {
            this.f13478a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f13478a.mo50547i().size(); i++) {
                C6185a.m14888b(this.f13478a.mo50549j().get(i), this.f13478a.mo50547i().get(i));
            }
            this.f13478a.mo50549j().clear();
            this.f13478a.mo50547i().clear();
            this.f13478a.removeAllViews();
            C6223c cVar = this.f13478a;
            cVar.f13394z = null;
            cVar.f13393y = null;
            for (C6204b1 next : cVar.mo50554n().values()) {
                if (!(next instanceof C6286e)) {
                    if (next instanceof C6236c1) {
                        C6185a.m14887b().mo50784a((C6360k0) (C6236c1) next);
                    } else {
                        next.mo50497l();
                    }
                }
            }
            for (C6190a1 next2 : this.f13478a.mo50553m().values()) {
                next2.mo50439j();
                next2.mo50440k();
            }
            this.f13478a.mo50553m().clear();
            this.f13478a.mo50552l().clear();
            this.f13478a.mo50554n().clear();
            this.f13478a.mo50545h().clear();
            this.f13478a.mo50538e().clear();
            this.f13478a.mo50541f().clear();
            this.f13478a.mo50543g().clear();
            this.f13478a.f13381m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.d$t */
    class C6276t implements C6327j0 {

        /* renamed from: com.adcolony.sdk.d$t$a */
        class C6277a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13480a;

            C6277a(C6312h0 h0Var) {
                this.f13480a = h0Var;
            }

            public void run() {
                boolean unused = C6252d.this.m15138d(this.f13480a);
            }
        }

        C6276t() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6509z0.m15953b((Runnable) new C6277a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$u */
    class C6278u implements C6327j0 {
        C6278u() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6252d.this.m15146k(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$v */
    class C6279v implements C6327j0 {
        C6279v() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6252d.this.m15145j(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$w */
    class C6280w implements C6327j0 {
        C6280w() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6252d.this.m15143f(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$x */
    class C6281x implements C6327j0 {
        C6281x() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6252d.this.m15147l(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$y */
    class C6282y implements C6327j0 {
        C6282y() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6252d.this.mo50615b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$z */
    class C6283z implements C6327j0 {
        C6283z() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6252d.this.mo50613a(h0Var);
        }
    }

    C6252d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m15144g(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "id");
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "id", h);
        Context a = C6185a.m14880a();
        if (a == null) {
            C6235c0.m15079b(b, "has_audio", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        }
        boolean b2 = C6509z0.m15952b(C6509z0.m15926a(a));
        double a2 = C6509z0.m15921a(C6509z0.m15926a(a));
        C6235c0.m15079b(b, "has_audio", b2);
        C6235c0.m15067a(b, "volume", a2);
        h0Var.mo50733a(b).mo50736c();
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m15145j(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String b = h0Var.mo50734b();
        String h = C6235c0.m15087h(a, "ad_session_id");
        int d = C6235c0.m15083d(a, "view_id");
        C6223c cVar = this.f13435b.get(h);
        if (cVar == null) {
            mo50612a(b, h);
            return false;
        }
        View view = cVar.mo50538e().get(Integer.valueOf(d));
        if (view == null) {
            mo50612a(b, "" + d);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m15146k(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String b = h0Var.mo50734b();
        String h = C6235c0.m15087h(a, "ad_session_id");
        int d = C6235c0.m15083d(a, "view_id");
        C6223c cVar = this.f13435b.get(h);
        if (cVar == null) {
            mo50612a(b, h);
            return false;
        }
        View view = cVar.mo50538e().get(Integer.valueOf(d));
        if (view == null) {
            mo50612a(b, "" + d);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m15147l(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "id");
        AdColonyInterstitial adColonyInterstitial = this.f13436c.get(h);
        AdColonyAdView adColonyAdView = this.f13439f.get(h);
        int a2 = C6235c0.m15057a(a, "orientation", -1);
        boolean z = adColonyAdView != null;
        if (adColonyInterstitial != null || z) {
            C6235c0.m15070a(C6235c0.m15073b(), "id", h);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.mo50336a(a2);
                adColonyInterstitial.mo50366n();
            }
            return true;
        }
        mo50612a(h0Var.mo50734b(), h);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo50623h() {
        this.f13434a = new ConcurrentHashMap<>();
        this.f13435b = new HashMap<>();
        this.f13436c = new ConcurrentHashMap<>();
        this.f13437d = new ConcurrentHashMap<>();
        this.f13438e = new ConcurrentHashMap<>();
        this.f13439f = Collections.synchronizedMap(new HashMap());
        C6185a.m14886a("AdContainer.create", (C6327j0) new C6267l());
        C6185a.m14886a("AdContainer.destroy", (C6327j0) new C6276t());
        C6185a.m14886a("AdContainer.move_view_to_index", (C6327j0) new C6278u());
        C6185a.m14886a("AdContainer.move_view_to_front", (C6327j0) new C6279v());
        C6185a.m14886a("AdSession.finish_fullscreen_ad", (C6327j0) new C6280w());
        C6185a.m14886a("AdSession.start_fullscreen_ad", (C6327j0) new C6281x());
        C6185a.m14886a("AdSession.ad_view_available", (C6327j0) new C6282y());
        C6185a.m14886a("AdSession.ad_view_unavailable", (C6327j0) new C6283z());
        C6185a.m14886a("AdSession.expiring", (C6327j0) new C6253a());
        C6185a.m14886a("AdSession.audio_stopped", (C6327j0) new C6254b());
        C6185a.m14886a("AdSession.audio_started", (C6327j0) new C6256c());
        C6185a.m14886a("AdSession.interstitial_available", (C6327j0) new C6258d());
        C6185a.m14886a("AdSession.interstitial_unavailable", (C6327j0) new C6259e());
        C6185a.m14886a("AdSession.has_audio", (C6327j0) new C6260f());
        C6185a.m14886a("WebView.prepare", (C6327j0) new C6261g(this));
        C6185a.m14886a("AdSession.expanded", (C6327j0) new C6262h(this));
        C6185a.m14886a("AdColony.odt_event", (C6327j0) new C6264i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo50625i(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "id");
        AdColonyInterstitial adColonyInterstitial = this.f13436c.get(h);
        if (adColonyInterstitial == null || adColonyInterstitial.mo50363j()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            mo50612a(h0Var.mo50734b(), h);
            return false;
        }
        C6509z0.m15957c(this.f13434a.remove(h));
        if (!C6185a.m14889c()) {
            m15129a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.mo50375t();
        adColonyInterstitial.mo50341a(C6235c0.m15087h(a, "ad_id"));
        adColonyInterstitial.mo50348c(C6235c0.m15087h(a, "creative_id"));
        adColonyInterstitial.mo50351d(C6235c0.m15087h(a, "ad_request_id"));
        C6509z0.m15953b((Runnable) new C6269m(this, h0Var, adColonyInterstitial, listener));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m15138d(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "ad_session_id");
        C6223c cVar = this.f13435b.get(h);
        if (cVar == null) {
            mo50612a(h0Var.mo50734b(), h);
            return false;
        }
        mo50609a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m15143f(C6312h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        C6294f1 a = h0Var.mo50732a();
        int d = C6235c0.m15083d(a, "status");
        if (d == 5 || d == 1 || d == 0 || d == 6) {
            return false;
        }
        String h = C6235c0.m15087h(a, "id");
        AdColonyInterstitial remove = this.f13436c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo50612a(h0Var.mo50734b(), h);
            return false;
        }
        C6509z0.m15953b((Runnable) new C6273q(this, adColonyInterstitialListener, remove));
        remove.mo50367o();
        remove.mo50339a((C6223c) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50615b(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "id");
        AdColonyAdViewListener remove = this.f13437d.remove(h);
        if (remove == null) {
            mo50612a(h0Var.mo50734b(), h);
            return false;
        }
        this.f13438e.put(h, remove);
        C6509z0.m15957c(this.f13434a.remove(h));
        Context a = C6185a.m14880a();
        if (a == null) {
            m15128a(remove);
            return false;
        }
        C6509z0.m15953b((Runnable) new C6266k(a, h0Var, remove, h));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo50617c(C6312h0 h0Var) {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        C6294f1 a2 = h0Var.mo50732a();
        String h = C6235c0.m15087h(a2, "ad_session_id");
        C6223c cVar = new C6223c(a.getApplicationContext(), h);
        cVar.mo50550j(h0Var);
        this.f13435b.put(h, cVar);
        if (C6235c0.m15083d(a2, IabUtils.KEY_WIDTH) == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f13436c.get(h);
            if (adColonyInterstitial == null) {
                mo50612a(h0Var.mo50734b(), h);
                return false;
            }
            adColonyInterstitial.mo50339a(cVar);
        } else {
            cVar.mo50534c(false);
        }
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15079b(b, "success", true);
        h0Var.mo50733a(b).mo50736c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo50620e(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "id");
        if (C6235c0.m15083d(a, "type") != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f13436c.remove(h);
        if (!C6185a.m14889c() || remove == null || !remove.mo50368p()) {
            mo50612a(h0Var.mo50734b(), h);
            return true;
        }
        C6509z0.m15953b((Runnable) new C6265j(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50613a(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "id");
        AdColonyAdViewListener remove = this.f13437d.remove(h);
        if (remove == null) {
            mo50612a(h0Var.mo50734b(), h);
            return false;
        }
        C6509z0.m15957c(this.f13434a.remove(h));
        m15128a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, AdColonyAdView> mo50618d() {
        return this.f13439f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50606a() {
        for (AdColonyInterstitial next : this.f13436c.values()) {
            if (next != null && next.mo50365m()) {
                next.mo50354e("Controller was reloaded and current ad was closed");
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15128a(AdColonyAdViewListener adColonyAdViewListener) {
        C6509z0.m15953b((Runnable) new C6270n(this, adColonyAdViewListener));
    }

    /* renamed from: a */
    private void m15129a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.mo50369q();
        if (!C6185a.m14889c()) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("RequestNotFilled called due to a missing context. ");
            a.mo50644a("Interstitial with adSessionId(" + adColonyInterstitial.mo50344b() + ").").mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<AdColonyInterstitial> mo50622g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial next : mo50621f().values()) {
            if (!next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50614b() {
        HashSet<AdColonyAdViewListener> hashSet = new HashSet<>();
        synchronized (this.f13440g) {
            for (String remove : this.f13438e.keySet()) {
                AdColonyAdViewListener remove2 = this.f13438e.remove(remove);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
            for (String remove3 : this.f13437d.keySet()) {
                AdColonyAdViewListener remove4 = this.f13437d.remove(remove3);
                if (remove4 != null) {
                    hashSet.add(remove4);
                }
            }
        }
        for (AdColonyAdViewListener a : hashSet) {
            m15128a(a);
        }
        for (String next : this.f13436c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f13436c.get(next);
            if (adColonyInterstitial != null && adColonyInterstitial.mo50364l()) {
                this.f13436c.remove(next);
                m15129a(adColonyInterstitial);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> mo50619e() {
        return this.f13437d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50610a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j) {
        C6294f1 f1Var;
        String a = C6509z0.m15929a();
        float s = C6185a.m14887b().mo50803n().mo50956s();
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "zone_id", str);
        C6235c0.m15077b(b, "type", 1);
        C6235c0.m15077b(b, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * s));
        C6235c0.m15077b(b, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * s));
        C6235c0.m15077b(b, IabUtils.KEY_WIDTH, adColonyAdSize.getWidth());
        C6235c0.m15077b(b, IabUtils.KEY_HEIGHT, adColonyAdSize.getHeight());
        C6235c0.m15070a(b, "id", a);
        if (!(adColonyAdOptions == null || (f1Var = adColonyAdOptions.f13150d) == null)) {
            C6235c0.m15069a(b, "options", f1Var);
        }
        adColonyAdViewListener.mo50278a(str);
        adColonyAdViewListener.mo50276a(adColonyAdSize);
        this.f13437d.put(a, adColonyAdViewListener);
        this.f13434a.put(a, new C6271o(a, str, j));
        new C6312h0("AdSession.on_request", 1, b).mo50736c();
        C6509z0.m15938a(this.f13434a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<String, C6223c> mo50616c() {
        return this.f13435b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ConcurrentHashMap<String, AdColonyInterstitial> mo50621f() {
        return this.f13436c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50611a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j) {
        String a = C6509z0.m15929a();
        C6328k b = C6185a.m14887b();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a, adColonyInterstitialListener, str);
        C6294f1 b2 = C6235c0.m15073b();
        C6235c0.m15070a(b2, "zone_id", str);
        C6235c0.m15079b(b2, "fullscreen", true);
        Rect w = b.mo50803n().mo50960w();
        C6235c0.m15077b(b2, IabUtils.KEY_WIDTH, w.width());
        C6235c0.m15077b(b2, IabUtils.KEY_HEIGHT, w.height());
        C6235c0.m15077b(b2, "type", 0);
        C6235c0.m15070a(b2, "id", a);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f13150d == null)) {
            adColonyInterstitial.mo50337a(adColonyAdOptions);
            C6235c0.m15069a(b2, "options", adColonyAdOptions.f13150d);
        }
        this.f13436c.put(a, adColonyInterstitial);
        this.f13434a.put(a, new C6272p(a, str, j));
        new C6312h0("AdSession.on_request", 1, b2).mo50736c();
        C6509z0.m15938a(this.f13434a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50607a(Context context, C6294f1 f1Var, String str) {
        C6312h0 h0Var = new C6312h0("AdSession.finish_fullscreen_ad", 0);
        C6235c0.m15077b(f1Var, "status", 1);
        h0Var.mo50735b(f1Var);
        new C6288e0.C6289a().mo50644a(str).mo50645a(C6288e0.f13497h);
        ((C6201b) context).mo50384a(h0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50608a(C6204b1 b1Var, String str, C6223c cVar) {
        C6509z0.m15953b((Runnable) new C6274r(str, b1Var, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50609a(C6223c cVar) {
        C6509z0.m15953b((Runnable) new C6275s(this, cVar));
        AdColonyAdView adColonyAdView = this.f13439f.get(cVar.mo50523a());
        if (adColonyAdView == null || adColonyAdView.mo50240d()) {
            this.f13435b.remove(cVar.mo50523a());
            cVar.f13393y = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo50624h(C6312h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String h = C6235c0.m15087h(h0Var.mo50732a(), "id");
        AdColonyInterstitial remove = this.f13436c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo50612a(h0Var.mo50734b(), h);
            return false;
        }
        C6509z0.m15957c(this.f13434a.remove(h));
        m15129a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50612a(String str, String str2) {
        new C6288e0.C6289a().mo50644a("Message '").mo50644a(str).mo50644a("' sent with invalid id: ").mo50644a(str2).mo50645a(C6288e0.f13497h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdView mo50605a(String str) {
        AdColonyAdView remove;
        synchronized (this.f13440g) {
            remove = this.f13439f.remove(str);
        }
        return remove;
    }
}
