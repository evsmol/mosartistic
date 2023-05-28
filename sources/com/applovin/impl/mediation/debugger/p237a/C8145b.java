package com.applovin.impl.mediation.debugger.p237a;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a.b */
public class C8145b {

    /* renamed from: a */
    private final String f19861a;

    /* renamed from: b */
    private final DTBAdSize f19862b;

    /* renamed from: com.applovin.impl.mediation.debugger.a.b$a */
    private enum C8146a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C8145b(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f19861a = str;
        this.f19862b = m24398a(JsonUtils.getInt(jSONObject, "type", m24399a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    /* renamed from: a */
    private DTBAdSize m24398a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (C8146a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (C8146a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (C8146a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C8146a m24399a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? C8146a.DISPLAY : C8146a.INTERSTITIAL;
    }

    /* renamed from: a */
    public DTBAdSize mo56310a() {
        return this.f19862b;
    }
}
