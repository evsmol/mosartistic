package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.controller.C4845x;
import com.ironsource.sdk.p139c.C4766d;
import com.ironsource.sdk.p139c.C4768e;
import com.ironsource.sdk.p141e.p142a.C4926a;
import com.ironsource.sdk.p144g.C4943f;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.q */
public class C4833q {

    /* renamed from: a */
    private static final String f12319a = C4833q.class.getSimpleName();

    /* renamed from: b */
    private final Context f12320b;

    /* renamed from: c */
    private final C4926a f12321c = new C4926a();

    /* renamed from: com.ironsource.sdk.controller.q$a */
    static class C4834a {

        /* renamed from: a */
        String f12322a;

        /* renamed from: b */
        JSONObject f12323b;

        /* renamed from: c */
        String f12324c;

        /* renamed from: d */
        String f12325d;

        private C4834a() {
        }

        /* synthetic */ C4834a(byte b) {
            this();
        }
    }

    public C4833q(Context context) {
        this.f12320b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34412a(String str, C4845x.C4868d.C4898a aVar) {
        C4926a aVar2;
        JSONObject jSONObject = new JSONObject(str);
        C4834a aVar3 = new C4834a((byte) 0);
        aVar3.f12322a = jSONObject.optString("omidFunction");
        aVar3.f12323b = jSONObject.optJSONObject("omidParams");
        aVar3.f12324c = jSONObject.optString("success");
        aVar3.f12325d = jSONObject.optString("fail");
        C4943f fVar = new C4943f();
        if (aVar3.f12323b != null) {
            String optString = aVar3.f12323b.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                fVar.mo34680a("adViewId", optString);
            }
        }
        try {
            String str2 = aVar3.f12322a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals("getOmidData")) {
                        c = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals("finishSession")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals("impressionOccurred")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals("startSession")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    C4926a aVar4 = this.f12321c;
                    C4926a.C4927a a = C4926a.C4927a.m14358a(aVar3.f12323b);
                    if (!aVar4.f12588d) {
                        throw new IllegalStateException("OMID has not been activated");
                    } else if (!TextUtils.isEmpty(a.f12595g)) {
                        String str3 = a.f12595g;
                        if (!aVar4.f12587c.containsKey(str3)) {
                            C4768e a2 = C4766d.m13973a().mo34275a(str3);
                            if (a2 != null) {
                                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a.f12594f, a.f12593e, a.f12590b, a.f12591c, a.f12589a), AdSessionContext.createHtmlAdSessionContext(aVar4.f12586b, a2.mo34261b(), (String) null, a.f12592d));
                                createAdSession.registerAdView(a2.mo34261b());
                                createAdSession.start();
                                aVar4.f12587c.put(str3, createAdSession);
                            } else {
                                throw new IllegalStateException("No adview found with the provided adViewId");
                            }
                        } else {
                            throw new IllegalStateException("OMID Session has already started");
                        }
                    } else {
                        throw new IllegalStateException("Missing adview id in OMID params");
                    }
                } else if (c == 2) {
                    C4926a aVar5 = this.f12321c;
                    JSONObject jSONObject2 = aVar3.f12323b;
                    aVar5.mo34648a(jSONObject2);
                    String optString2 = jSONObject2.optString("adViewId");
                    AdSession adSession = aVar5.f12587c.get(optString2);
                    if (adSession != null) {
                        adSession.finish();
                        aVar5.f12587c.remove(optString2);
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c == 3) {
                    C4926a aVar6 = this.f12321c;
                    JSONObject jSONObject3 = aVar3.f12323b;
                    aVar6.mo34648a(jSONObject3);
                    AdSession adSession2 = aVar6.f12587c.get(jSONObject3.optString("adViewId"));
                    if (adSession2 != null) {
                        AdEvents createAdEvents = AdEvents.createAdEvents(adSession2);
                        if (jSONObject3.optBoolean("signalLoaded")) {
                            createAdEvents.loaded();
                        }
                        createAdEvents.impressionOccurred();
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c == 4) {
                    aVar2 = this.f12321c;
                } else {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{aVar3.f12322a}));
                }
                aVar.mo34576a(true, aVar3.f12324c, fVar);
            }
            C4926a aVar7 = this.f12321c;
            Context context = this.f12320b;
            if (!aVar7.f12588d) {
                Omid.activate(context);
                aVar7.f12588d = true;
            }
            aVar2 = this.f12321c;
            fVar = aVar2.mo34647a();
            aVar.mo34576a(true, aVar3.f12324c, fVar);
        } catch (Exception e) {
            fVar.mo34680a("errMsg", e.getMessage());
            String str4 = f12319a;
            Logger.m14507i(str4, "OMIDJSAdapter " + aVar3.f12322a + " Exception: " + e.getMessage());
            aVar.mo34576a(false, aVar3.f12325d, fVar);
        }
    }
}
