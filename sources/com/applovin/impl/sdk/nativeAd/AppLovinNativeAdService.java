package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8347c;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C8626v logger;
    private final C8490n sdk;

    public AppLovinNativeAdService(C8490n nVar) {
        this.sdk = nVar;
        this.logger = nVar.mo57320D();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        StringBuilder sb;
        String str2;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            C8626v.m26258i(TAG, "Invalid ad token specified");
            C8575k.m26125a(appLovinNativeAdLoadListener, -8);
            return;
        }
        C8347c cVar = new C8347c(trim, this.sdk);
        if (cVar.mo56929b() == C8347c.C8348a.REGULAR) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.logger;
                vVar.mo57818b(TAG, "Loading next ad for token: " + cVar);
            }
            this.sdk.mo57337V().mo57228a((C8401a) new C8504b(cVar, appLovinNativeAdLoadListener, this.sdk), C8432o.C8434a.MAIN);
            return;
        }
        if (cVar.mo56929b() == C8347c.C8348a.AD_RESPONSE_JSON) {
            JSONObject d = cVar.mo56931d();
            if (d != null) {
                C8572i.m26111f(d, this.sdk);
                C8572i.m26107d(d, this.sdk);
                C8572i.m26106c(d, this.sdk);
                C8572i.m26109e(d, this.sdk);
                if (JsonUtils.getJSONArray(d, "ads", new JSONArray()).length() > 0) {
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = this.logger;
                        vVar2.mo57818b(TAG, "Rendering ad for token: " + cVar);
                    }
                    this.sdk.mo57337V().mo57228a((C8401a) new C8506d(d, appLovinNativeAdLoadListener, this.sdk), C8432o.C8434a.MAIN);
                    return;
                }
                if (C8626v.m26252a()) {
                    C8626v vVar3 = this.logger;
                    vVar3.mo57822e(TAG, "No ad returned from the server for token: " + cVar);
                }
                C8575k.m26125a(appLovinNativeAdLoadListener, 204);
                return;
            }
            sb = new StringBuilder();
            str2 = "Unable to retrieve ad response JSON from token: ";
        } else {
            sb = new StringBuilder();
            str2 = "Invalid ad token specified: ";
        }
        sb.append(str2);
        sb.append(cVar);
        C8626v.m26258i(TAG, sb.toString());
        C8575k.m26125a(appLovinNativeAdLoadListener, -8);
    }
}
