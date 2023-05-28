package com.applovin.impl.sdk.p256e;

import com.applovin.impl.p233b.C8037e;
import com.applovin.impl.p233b.C8038f;
import com.applovin.impl.p233b.C8046m;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.C8623t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.r */
public abstract class C8442r extends C8401a {

    /* renamed from: a */
    private final AppLovinAdLoadListener f21211a;

    /* renamed from: e */
    private final C8443a f21212e;

    /* renamed from: com.applovin.impl.sdk.e.r$a */
    private static final class C8443a extends C8037e {
        C8443a(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, C8490n nVar) {
            super(jSONObject, jSONObject2, bVar, nVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo57247a(C8622s sVar) {
            if (sVar != null) {
                this.f19437a.add(sVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$b */
    private static final class C8444b extends C8442r {

        /* renamed from: a */
        private final String f21213a;

        C8444b(String str, C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
            super(eVar, appLovinAdLoadListener, nVar);
            this.f21213a = str;
        }

        public void run() {
            mo57246a(mo57244a(this.f21213a));
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$c */
    private static final class C8445c extends C8442r {

        /* renamed from: a */
        private final JSONObject f21214a;

        C8445c(C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
            super(eVar, appLovinAdLoadListener, nVar);
            this.f21214a = eVar.mo55896c();
        }

        public void run() {
            C8038f fVar;
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f21214a, "xml", (String) null);
            if (!StringUtils.isValidString(string)) {
                C8626v vVar2 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57822e(this.f21119c, "No VAST response received.");
                }
                fVar = C8038f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f21118b.mo57342a(C8380b.f20950eq)).intValue()) {
                mo57246a(mo57244a(string));
                return;
            } else {
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57822e(this.f21119c, "VAST response is over max length");
                }
                fVar = C8038f.XML_PARSING;
            }
            mo57245a(fVar);
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$d */
    private static final class C8446d extends C8442r {

        /* renamed from: a */
        private final C8622s f21215a;

        C8446d(C8622s sVar, C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
            super(eVar, appLovinAdLoadListener, nVar);
            if (sVar == null) {
                throw new IllegalArgumentException("No response specified.");
            } else if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            } else if (appLovinAdLoadListener != null) {
                this.f21215a = sVar;
            } else {
                throw new IllegalArgumentException("No callback specified.");
            }
        }

        public void run() {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Processing VAST Wrapper response...");
            }
            mo57246a(this.f21215a);
        }
    }

    C8442r(C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super("TaskProcessVastResponse", nVar);
        if (eVar != null) {
            this.f21211a = appLovinAdLoadListener;
            this.f21212e = (C8443a) eVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    /* renamed from: a */
    public static C8442r m25441a(C8622s sVar, C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        return new C8446d(sVar, eVar, appLovinAdLoadListener, nVar);
    }

    /* renamed from: a */
    public static C8442r m25442a(String str, JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        return new C8444b(str, new C8443a(jSONObject, jSONObject2, bVar, nVar), appLovinAdLoadListener, nVar);
    }

    /* renamed from: a */
    public static C8442r m25443a(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        return new C8445c(new C8443a(jSONObject, jSONObject2, bVar, nVar), appLovinAdLoadListener, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8622s mo57244a(String str) {
        try {
            return C8623t.m26237a(str, this.f21118b);
        } catch (Throwable th) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Failed to process VAST response", th);
            }
            mo57245a(C8038f.XML_PARSING);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57245a(C8038f fVar) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57822e(str, "Failed to process VAST response due to VAST error code " + fVar);
        }
        C8046m.m23955a((C8037e) this.f21212e, this.f21211a, fVar, -6, this.f21118b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57246a(C8622s sVar) {
        C8038f fVar;
        C8401a aVar;
        int a = this.f21212e.mo55894a();
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Finished parsing XML at depth " + a);
        }
        this.f21212e.mo57247a(sVar);
        if (C8046m.m23961a(sVar)) {
            int intValue = ((Integer) this.f21118b.mo57342a(C8380b.f20951er)).intValue();
            if (a < intValue) {
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57818b(this.f21119c, "VAST response is wrapper. Resolving...");
                }
                aVar = new C8454x(this.f21212e, this.f21211a, this.f21118b);
            } else {
                C8626v vVar4 = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar5 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar5.mo57822e(str2, "Reached beyond max wrapper depth of " + intValue);
                }
                fVar = C8038f.WRAPPER_LIMIT_REACHED;
                mo57245a(fVar);
                return;
            }
        } else if (C8046m.m23964b(sVar)) {
            C8626v vVar6 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "VAST response is inline. Rendering ad...");
            }
            aVar = new C8448t(this.f21212e, this.f21211a, this.f21118b);
        } else {
            C8626v vVar7 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57822e(this.f21119c, "VAST response is an error");
            }
            fVar = C8038f.NO_WRAPPER_RESPONSE;
            mo57245a(fVar);
            return;
        }
        this.f21118b.mo57337V().mo57227a(aVar);
    }
}
