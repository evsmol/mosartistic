package com.applovin.impl.sdk.p251a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a.b */
public abstract class C8315b {

    /* renamed from: a */
    protected final AppLovinAdBase f20483a;

    /* renamed from: b */
    protected final C8490n f20484b;

    /* renamed from: c */
    protected final C8626v f20485c;

    /* renamed from: d */
    protected final String f20486d;

    /* renamed from: e */
    protected boolean f20487e;

    /* renamed from: f */
    protected AdSession f20488f;

    /* renamed from: g */
    protected AdEvents f20489g;

    public C8315b(AppLovinAdBase appLovinAdBase) {
        this.f20483a = appLovinAdBase;
        this.f20484b = appLovinAdBase.getSdk();
        this.f20485c = appLovinAdBase.getSdk().mo57320D();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f20486d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AdSessionConfiguration mo56845a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AdSessionContext mo56846a(WebView webView);

    /* renamed from: a */
    public void mo56847a(View view) {
        mo56848a(view, (List<C8324d>) Collections.emptyList());
    }

    /* renamed from: a */
    public void mo56848a(final View view, final List<C8324d> list) {
        mo56851a("update main view: " + view, (Runnable) new Runnable() {
            public void run() {
                C8315b.this.f20488f.registerAdView(view);
                C8315b.this.f20488f.removeAllFriendlyObstructions();
                for (C8324d dVar : list) {
                    if (dVar.mo56864a() != null) {
                        try {
                            C8315b.this.f20488f.addFriendlyObstruction(dVar.mo56864a(), dVar.mo56865b(), dVar.mo56866c());
                        } catch (Throwable th) {
                            C8626v vVar = C8315b.this.f20485c;
                            if (C8626v.m26252a()) {
                                C8626v vVar2 = C8315b.this.f20485c;
                                String str = C8315b.this.f20486d;
                                vVar2.mo57819b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56849a(AdSession adSession) {
    }

    /* renamed from: a */
    public void mo56850a(final String str) {
        mo56851a("track error", (Runnable) new Runnable() {
            public void run() {
                C8315b.this.f20488f.error(ErrorType.VIDEO, str);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56851a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (!C8315b.this.f20487e) {
                        C8626v vVar = C8315b.this.f20485c;
                        if (C8626v.m26252a()) {
                            C8626v vVar2 = C8315b.this.f20485c;
                            String str = C8315b.this.f20486d;
                            vVar2.mo57822e(str, "Failed to run operation: " + str);
                            return;
                        }
                        return;
                    }
                    C8626v vVar3 = C8315b.this.f20485c;
                    if (C8626v.m26252a()) {
                        C8626v vVar4 = C8315b.this.f20485c;
                        String str2 = C8315b.this.f20486d;
                        vVar4.mo57818b(str2, "Running operation: " + str);
                    }
                    runnable.run();
                } catch (Throwable th) {
                    C8626v vVar5 = C8315b.this.f20485c;
                    if (C8626v.m26252a()) {
                        C8626v vVar6 = C8315b.this.f20485c;
                        String str3 = C8315b.this.f20486d;
                        vVar6.mo57819b(str3, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo56852b() {
        mo56853b((WebView) null);
    }

    /* renamed from: b */
    public void mo56853b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                AdSessionContext a;
                if (!C8315b.this.f20483a.isOpenMeasurementEnabled()) {
                    C8626v vVar = C8315b.this.f20485c;
                    if (C8626v.m26252a()) {
                        C8315b.this.f20485c.mo57820c(C8315b.this.f20486d, "Skip starting session - Open Measurement disabled");
                    }
                } else if (C8315b.this.f20488f != null) {
                    C8626v vVar2 = C8315b.this.f20485c;
                    if (C8626v.m26252a()) {
                        C8626v vVar3 = C8315b.this.f20485c;
                        String str = C8315b.this.f20486d;
                        vVar3.mo57821d(str, "Attempting to start session again for ad: " + C8315b.this.f20483a);
                    }
                } else {
                    C8626v vVar4 = C8315b.this.f20485c;
                    if (C8626v.m26252a()) {
                        C8315b.this.f20485c.mo57818b(C8315b.this.f20486d, "Starting session");
                    }
                    AdSessionConfiguration a2 = C8315b.this.mo56845a();
                    if (a2 != null && (a = C8315b.this.mo56846a(webView)) != null) {
                        try {
                            C8315b.this.f20488f = AdSession.createAdSession(a2, a);
                            try {
                                C8315b.this.f20489g = AdEvents.createAdEvents(C8315b.this.f20488f);
                                C8315b bVar = C8315b.this;
                                bVar.mo56849a(bVar.f20488f);
                                C8315b.this.f20488f.start();
                                C8315b.this.f20487e = true;
                                C8626v vVar5 = C8315b.this.f20485c;
                                if (C8626v.m26252a()) {
                                    C8315b.this.f20485c.mo57818b(C8315b.this.f20486d, "Session started");
                                }
                            } catch (Throwable th) {
                                C8626v vVar6 = C8315b.this.f20485c;
                                if (C8626v.m26252a()) {
                                    C8315b.this.f20485c.mo57819b(C8315b.this.f20486d, "Failed to create ad events", th);
                                }
                            }
                        } catch (Throwable th2) {
                            C8626v vVar7 = C8315b.this.f20485c;
                            if (C8626v.m26252a()) {
                                C8315b.this.f20485c.mo57819b(C8315b.this.f20486d, "Failed to create session", th2);
                            }
                        }
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public void mo56854c() {
        mo56851a("track loaded", (Runnable) new Runnable() {
            public void run() {
                C8315b.this.f20489g.loaded();
            }
        });
    }

    /* renamed from: d */
    public void mo56855d() {
        mo56851a("track impression event", (Runnable) new Runnable() {
            public void run() {
                C8315b.this.f20489g.impressionOccurred();
            }
        });
    }

    /* renamed from: e */
    public void mo56856e() {
        mo56851a("stop session", (Runnable) new Runnable() {
            public void run() {
                C8315b.this.f20487e = false;
                C8315b.this.f20488f.finish();
                C8315b.this.f20488f = null;
                C8315b.this.f20489g = null;
            }
        });
    }
}
