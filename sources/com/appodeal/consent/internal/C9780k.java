package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.consent.internal.k */
public final class C9780k {

    /* renamed from: com.appodeal.consent.internal.k$a */
    public static final class C9781a {

        /* renamed from: a */
        public final Consent f24804a;

        /* renamed from: b */
        public final String f24805b;

        /* renamed from: c */
        public final Boolean f24806c;

        public C9781a(Consent consent, String str, Boolean bool) {
            this.f24804a = consent;
            this.f24805b = str;
            this.f24806c = bool;
        }

        /* renamed from: a */
        public final Consent mo61340a() {
            return this.f24804a;
        }

        /* renamed from: b */
        public final String mo61341b() {
            return this.f24805b;
        }

        /* renamed from: c */
        public final Boolean mo61342c() {
            return this.f24806c;
        }
    }

    /* renamed from: a */
    public static C9781a m28609a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        JSONObject optJSONObject = jSONObject.optJSONObject("consent");
        Boolean bool = null;
        Consent consent = optJSONObject == null ? null : new Consent(optJSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("form");
        String optString = optJSONObject2 == null ? null : optJSONObject2.optString("url");
        if (optJSONObject2 != null) {
            bool = Boolean.valueOf(optJSONObject2.optBoolean(Constants.SHOW));
        }
        return new C9781a(consent, optString, bool);
    }
}
