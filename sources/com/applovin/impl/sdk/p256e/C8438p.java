package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.p */
public class C8438p extends C8401a implements AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f21202a;

    /* renamed from: e */
    private final C8349d f21203e;

    /* renamed from: f */
    private final C8346b f21204f;

    /* renamed from: g */
    private final AppLovinAdLoadListener f21205g;

    public C8438p(JSONObject jSONObject, C8349d dVar, C8346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super("TaskProcessAdResponse", nVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (dVar != null) {
            this.f21202a = jSONObject;
            this.f21203e = dVar;
            this.f21204f = bVar;
            this.f21205g = appLovinAdLoadListener;
        } else {
            throw new IllegalArgumentException("No zone specified");
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.applovin.impl.sdk.e.a] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.applovin.impl.sdk.e.q] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.applovin.impl.sdk.e.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25432a(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "undefined"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r10, r0, r1)
            java.lang.String r1 = "applovin"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x003a
            com.applovin.impl.sdk.v r0 = r9.f21120d
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0021
            com.applovin.impl.sdk.v r0 = r9.f21120d
            java.lang.String r1 = r9.f21119c
            java.lang.String r2 = "Starting task for AppLovin ad..."
            r0.mo57818b(r1, r2)
        L_0x0021:
            com.applovin.impl.sdk.e.s r0 = new com.applovin.impl.sdk.e.s
            org.json.JSONObject r5 = r9.f21202a
            com.applovin.impl.sdk.ad.b r6 = r9.f21204f
            com.applovin.impl.sdk.n r8 = r9.f21118b
            r3 = r0
            r4 = r10
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x002f:
            com.applovin.impl.sdk.n r10 = r9.f21118b
            com.applovin.impl.sdk.e.o r10 = r10.mo57337V()
            r10.mo57227a((com.applovin.impl.sdk.p256e.C8401a) r0)
            goto L_0x00b4
        L_0x003a:
            java.lang.String r1 = "vast"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0067
            com.applovin.impl.sdk.v r0 = r9.f21120d
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0053
            com.applovin.impl.sdk.v r0 = r9.f21120d
            java.lang.String r1 = r9.f21119c
            java.lang.String r2 = "Starting task for VAST ad..."
            r0.mo57818b(r1, r2)
        L_0x0053:
            org.json.JSONObject r0 = r9.f21202a
            com.applovin.impl.sdk.ad.b r1 = r9.f21204f
            com.applovin.impl.sdk.n r2 = r9.f21118b
            com.applovin.impl.sdk.e.r r10 = com.applovin.impl.sdk.p256e.C8442r.m25443a(r10, r0, r1, r9, r2)
            com.applovin.impl.sdk.n r0 = r9.f21118b
            com.applovin.impl.sdk.e.o r0 = r0.mo57337V()
            r0.mo57227a((com.applovin.impl.sdk.p256e.C8401a) r10)
            goto L_0x00b4
        L_0x0067:
            java.lang.String r1 = "js_tag"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x008f
            com.applovin.impl.sdk.v r0 = r9.f21120d
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0080
            com.applovin.impl.sdk.v r0 = r9.f21120d
            java.lang.String r1 = r9.f21119c
            java.lang.String r2 = "Starting task for JS tag ad..."
            r0.mo57818b(r1, r2)
        L_0x0080:
            com.applovin.impl.sdk.e.q r0 = new com.applovin.impl.sdk.e.q
            org.json.JSONObject r5 = r9.f21202a
            com.applovin.impl.sdk.ad.b r6 = r9.f21204f
            com.applovin.impl.sdk.n r8 = r9.f21118b
            r3 = r0
            r4 = r10
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x002f
        L_0x008f:
            com.applovin.impl.sdk.v r10 = r9.f21120d
            boolean r10 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r10 == 0) goto L_0x00af
            com.applovin.impl.sdk.v r10 = r9.f21120d
            java.lang.String r1 = r9.f21119c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to process ad of unknown type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r10.mo57821d(r1, r0)
        L_0x00af:
            r10 = -800(0xfffffffffffffce0, float:NaN)
            r9.failedToReceiveAd(r10)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p256e.C8438p.m25432a(org.json.JSONObject):void");
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21205g;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    public void failedToReceiveAd(int i) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21205g;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f21202a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Processing ad...");
            }
            m25432a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        C8626v vVar2 = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57821d(this.f21119c, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f21203e.mo56936a(), this.f21203e.mo56937b(), this.f21202a, this.f21118b);
        failedToReceiveAd(204);
    }
}
