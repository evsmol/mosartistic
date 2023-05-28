package com.adcolony.sdk;

import android.util.Log;
import android.webkit.WebView;
import com.adcolony.sdk.C6288e0;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p150io.bidmachine.BidMachineFetcher;

/* renamed from: com.adcolony.sdk.p0 */
class C6401p0 {

    /* renamed from: a */
    private AdSession f13730a;

    /* renamed from: b */
    private AdEvents f13731b;

    /* renamed from: c */
    private MediaEvents f13732c;

    /* renamed from: d */
    private List<VerificationScriptResource> f13733d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f13734e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f13735f = "";

    /* renamed from: g */
    private boolean f13736g;

    /* renamed from: h */
    private boolean f13737h;

    /* renamed from: i */
    private boolean f13738i;

    /* renamed from: j */
    private boolean f13739j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f13740k;

    /* renamed from: l */
    private int f13741l;

    /* renamed from: m */
    private int f13742m;

    /* renamed from: n */
    private String f13743n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f13744o = "";

    /* renamed from: com.adcolony.sdk.p0$a */
    class C6402a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13745a;

        C6402a(String str) {
            this.f13745a = str;
        }

        public void run() {
            C6294f1 b = C6235c0.m15073b();
            C6294f1 b2 = C6235c0.m15073b();
            C6235c0.m15077b(b2, "session_type", C6401p0.this.f13734e);
            C6235c0.m15070a(b2, "session_id", C6401p0.this.f13735f);
            C6235c0.m15070a(b2, "event", this.f13745a);
            C6235c0.m15070a(b, "type", "iab_hook");
            C6235c0.m15070a(b, "message", b2.toString());
            new C6312h0("CustomMessage.controller_send", 0, b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.p0$b */
    class C6403b implements AdColonyCustomMessageListener {

        /* renamed from: com.adcolony.sdk.p0$b$a */
        class C6404a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f13748a;

            /* renamed from: b */
            final /* synthetic */ String f13749b;

            /* renamed from: c */
            final /* synthetic */ float f13750c;

            C6404a(String str, String str2, float f) {
                this.f13748a = str;
                this.f13749b = str2;
                this.f13750c = f;
            }

            public void run() {
                if (this.f13748a.equals(C6401p0.this.f13744o)) {
                    C6401p0.this.mo50901a(this.f13749b, this.f13750c);
                    return;
                }
                AdColonyAdView adColonyAdView = C6185a.m14887b().mo50787c().mo50618d().get(this.f13748a);
                C6401p0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.mo50901a(this.f13749b, this.f13750c);
                }
            }
        }

        C6403b() {
        }

        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            C6294f1 b = C6235c0.m15074b(adColonyCustomMessage.getMessage());
            String h = C6235c0.m15087h(b, "event_type");
            float floatValue = BigDecimal.valueOf(C6235c0.m15081c(b, IronSourceConstants.EVENTS_DURATION)).floatValue();
            boolean b2 = C6235c0.m15076b(b, "replay");
            boolean equals = C6235c0.m15087h(b, "skip_type").equals("dec");
            String h2 = C6235c0.m15087h(b, "asi");
            if (h.equals("skip") && equals) {
                boolean unused = C6401p0.this.f13740k = true;
            } else if (!b2 || (!h.equals("start") && !h.equals("first_quartile") && !h.equals("midpoint") && !h.equals("third_quartile") && !h.equals("complete"))) {
                C6509z0.m15953b((Runnable) new C6404a(h2, h, floatValue));
            }
        }
    }

    C6401p0(C6294f1 f1Var, String str) {
        VerificationScriptResource verificationScriptResource;
        this.f13734e = m15605a(f1Var);
        this.f13739j = C6235c0.m15076b(f1Var, "skippable");
        this.f13741l = C6235c0.m15083d(f1Var, "skip_offset");
        this.f13742m = C6235c0.m15083d(f1Var, "video_duration");
        C6290e1 a = C6235c0.m15060a(f1Var, "js_resources");
        C6290e1 a2 = C6235c0.m15060a(f1Var, "verification_params");
        C6290e1 a3 = C6235c0.m15060a(f1Var, "vendor_keys");
        this.f13744o = str;
        for (int i = 0; i < a.mo50650b(); i++) {
            try {
                String b = C6235c0.m15075b(a2, i);
                String b2 = C6235c0.m15075b(a3, i);
                URL url = new URL(C6235c0.m15075b(a, i));
                if (b.equals("") || b2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                } else {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(b2, url, b);
                }
                this.f13733d.add(verificationScriptResource);
            } catch (MalformedURLException unused) {
                new C6288e0.C6289a().mo50644a("Invalid js resource url passed to Omid").mo50645a(C6288e0.f13498i);
            }
        }
        try {
            this.f13743n = C6185a.m14887b().mo50805p().mo51060a(C6235c0.m15087h(f1Var, "filepath"), true).toString();
        } catch (IOException unused2) {
            new C6288e0.C6289a().mo50644a("Error loading IAB JS Client").mo50645a(C6288e0.f13498i);
        }
    }

    /* renamed from: e */
    private void m15612e() {
        AdColony.addCustomMessageListener(new C6403b(), "viewability_ad_event");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo50904d() {
        return this.f13734e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo50905f() {
        this.f13737h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50902b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f13730a.finish();
        m15610b("end_session");
        this.f13730a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AdSession mo50903c() {
        return this.f13730a;
    }

    /* renamed from: a */
    private int m15605a(C6294f1 f1Var) {
        if (this.f13734e == -1) {
            int d = C6235c0.m15083d(f1Var, "ad_unit_type");
            String h = C6235c0.m15087h(f1Var, "ad_type");
            if (d == 0) {
                return 0;
            }
            if (d == 1) {
                if (h.equals("video")) {
                    return 0;
                }
                if (h.equals(BidMachineFetcher.AD_TYPE_DISPLAY)) {
                    return 1;
                }
                if (h.equals("banner_display") || h.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f13734e;
    }

    /* renamed from: b */
    private void m15610b(String str) {
        if (!C6509z0.m15937a((Runnable) new C6402a(str))) {
            new C6288e0.C6289a().mo50644a("Executing ADCOmidManager.sendIabCustomMessage failed").mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50899a(C6223c cVar) {
        MediaEvents mediaEvents;
        VastProperties vastProperties;
        if (!this.f13738i && this.f13734e >= 0 && this.f13730a != null) {
            m15609b(cVar);
            m15612e();
            if (this.f13734e != 0) {
                mediaEvents = null;
            } else {
                mediaEvents = MediaEvents.createMediaEvents(this.f13730a);
            }
            this.f13732c = mediaEvents;
            try {
                this.f13730a.start();
                this.f13731b = AdEvents.createAdEvents(this.f13730a);
                m15610b("start_session");
                if (this.f13732c != null) {
                    Position position = Position.PREROLL;
                    if (this.f13739j) {
                        vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) this.f13741l, true, position);
                    } else {
                        vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                    }
                    this.f13731b.loaded(vastProperties);
                } else {
                    this.f13731b.loaded();
                }
                this.f13738i = true;
            } catch (NullPointerException e) {
                AdSession adSession = this.f13730a;
                ErrorType errorType = ErrorType.GENERIC;
                adSession.error(errorType, "Exception occurred on AdSession.start: " + Log.getStackTraceString(e));
                mo50902b();
                C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("Exception in ADCOmidManager on AdSession.start: ").mo50644a(Log.getStackTraceString(e));
                a.mo50644a(" Ad with adSessionId: " + this.f13744o + ".").mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* renamed from: b */
    private void m15609b(C6223c cVar) {
        m15610b("register_ad_view");
        C6204b1 b1Var = C6185a.m14887b().mo50762B().get(Integer.valueOf(cVar.mo50551k()));
        if (b1Var == null && !cVar.mo50554n().isEmpty()) {
            b1Var = (C6204b1) cVar.mo50554n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f13730a;
        if (adSession != null && b1Var != null) {
            adSession.registerAdView(b1Var);
            if (b1Var instanceof C6369l0) {
                ((C6369l0) b1Var).mo50839p();
            }
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.mo50527a(this.f13730a);
            m15610b("register_obstructions");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50897a() throws IllegalArgumentException {
        mo50898a((WebView) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50898a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f13734e >= 0 && (str = this.f13743n) != null && !str.equals("") && (list = this.f13733d) != null) {
            if (!list.isEmpty() || mo50904d() == 2) {
                C6328k b = C6185a.m14887b();
                Owner owner = Owner.NATIVE;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                int d = mo50904d();
                if (d == 0) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(b.mo50809t(), this.f13743n, this.f13733d, (String) null, (String) null));
                    this.f13730a = createAdSession;
                    this.f13735f = createAdSession.getAdSessionId();
                    m15610b("inject_javascript");
                } else if (d == 1) {
                    CreativeType creativeType2 = CreativeType.NATIVE_DISPLAY;
                    AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType2, impressionType, owner, (Owner) null, false), AdSessionContext.createNativeAdSessionContext(b.mo50809t(), this.f13743n, this.f13733d, (String) null, (String) null));
                    this.f13730a = createAdSession2;
                    this.f13735f = createAdSession2.getAdSessionId();
                    m15610b("inject_javascript");
                } else if (d == 2) {
                    CreativeType creativeType3 = CreativeType.HTML_DISPLAY;
                    AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType3, impressionType, owner, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(b.mo50809t(), webView, "", (String) null));
                    this.f13730a = createAdSession3;
                    this.f13735f = createAdSession3.getAdSessionId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50900a(String str) {
        mo50901a(str, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50901a(String str, float f) {
        if (C6185a.m14889c() && this.f13730a != null) {
            if (this.f13732c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals("first_quartile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals("resume")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals("third_quartile")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c = 13;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f13731b.impressionOccurred();
                            MediaEvents mediaEvents = this.f13732c;
                            if (mediaEvents != null) {
                                if (f <= 0.0f) {
                                    f = (float) this.f13742m;
                                }
                                mediaEvents.start(f, 1.0f);
                            }
                            m15610b(str);
                            return;
                        case 1:
                            this.f13732c.firstQuartile();
                            m15610b(str);
                            return;
                        case 2:
                            this.f13732c.midpoint();
                            m15610b(str);
                            return;
                        case 3:
                            this.f13732c.thirdQuartile();
                            m15610b(str);
                            return;
                        case 4:
                            this.f13740k = true;
                            this.f13732c.complete();
                            m15610b(str);
                            return;
                        case 5:
                            m15610b(str);
                            mo50902b();
                            return;
                        case 6:
                        case 7:
                            MediaEvents mediaEvents2 = this.f13732c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.skipped();
                            }
                            m15610b(str);
                            mo50902b();
                            return;
                        case 8:
                            this.f13732c.volumeChange(0.0f);
                            m15610b(str);
                            return;
                        case 9:
                            this.f13732c.volumeChange(1.0f);
                            m15610b(str);
                            return;
                        case 10:
                            if (!this.f13736g && !this.f13737h && !this.f13740k) {
                                this.f13732c.pause();
                                m15610b(str);
                                this.f13736g = true;
                                this.f13737h = false;
                                return;
                            }
                            return;
                        case 11:
                            if (this.f13736g && !this.f13740k) {
                                this.f13732c.resume();
                                m15610b(str);
                                this.f13736g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f13732c.bufferStart();
                            m15610b(str);
                            return;
                        case 13:
                            this.f13732c.bufferFinish();
                            m15610b(str);
                            return;
                        case 14:
                        case 15:
                            this.f13732c.adUserInteraction(InteractionType.CLICK);
                            m15610b(str);
                            if (this.f13737h && !this.f13736g && !this.f13740k) {
                                this.f13732c.pause();
                                m15610b("pause");
                                this.f13736g = true;
                                this.f13737h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("Recording IAB event for ").mo50644a(str);
                    a.mo50644a(" caused " + e.getClass()).mo50645a(C6288e0.f13496g);
                }
            }
        }
    }
}
