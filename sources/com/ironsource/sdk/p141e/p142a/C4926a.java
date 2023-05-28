package com.ironsource.sdk.p141e.p142a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.p144g.C4943f;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.e.a.a */
public final class C4926a {

    /* renamed from: a */
    public static final String f12585a = Omid.getVersion();

    /* renamed from: b */
    public final Partner f12586b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: c */
    public final HashMap<String, AdSession> f12587c = new HashMap<>();

    /* renamed from: d */
    public boolean f12588d = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a */
    public static class C4927a {

        /* renamed from: a */
        public boolean f12589a;

        /* renamed from: b */
        public Owner f12590b;

        /* renamed from: c */
        public Owner f12591c;

        /* renamed from: d */
        public String f12592d;

        /* renamed from: e */
        public ImpressionType f12593e;

        /* renamed from: f */
        public CreativeType f12594f;

        /* renamed from: g */
        public String f12595g;

        /* renamed from: h */
        private Owner f12596h;

        /* renamed from: a */
        public static C4927a m14358a(JSONObject jSONObject) {
            C4927a aVar = new C4927a();
            aVar.f12589a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f12590b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f12591c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f12592d = jSONObject.optString("customReferenceData", "");
                            aVar.f12594f = m14360c(jSONObject);
                            aVar.f12593e = m14359b(jSONObject);
                            String optString3 = jSONObject.optString("adViewId", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                aVar.f12595g = optString3;
                                aVar.f12596h = m14361d(jSONObject);
                                return aVar;
                            }
                            throw new IllegalArgumentException("Missing adview id in OMID params" + optString3);
                        } catch (IllegalArgumentException unused) {
                            throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                        }
                    } else {
                        throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
                }
            } else {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
        }

        /* renamed from: b */
        private static ImpressionType m14359b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        /* renamed from: c */
        private static CreativeType m14360c(JSONObject jSONObject) {
            String optString = jSONObject.optString("creativeType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        /* renamed from: d */
        private static Owner m14361d(JSONObject jSONObject) {
            try {
                return Owner.valueOf(jSONObject.optString("videoEventsOwner", "").toUpperCase());
            } catch (IllegalArgumentException unused) {
                return Owner.NONE;
            }
        }
    }

    /* renamed from: a */
    public final C4943f mo34647a() {
        C4943f fVar = new C4943f();
        fVar.mo34680a("omidVersion", SDKUtils.encodeString(f12585a));
        fVar.mo34680a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.mo34680a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.mo34680a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f12587c.keySet().toArray())));
        return fVar;
    }

    /* renamed from: a */
    public void mo34648a(JSONObject jSONObject) {
        if (!this.f12588d) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
