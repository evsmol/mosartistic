package com.applovin.impl.mediation.debugger.p237a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.a.a */
public class C8143a implements DTBAdCallback {

    /* renamed from: a */
    private final MaxAdFormat f19858a;

    /* renamed from: b */
    private final C8144a f19859b;

    /* renamed from: c */
    private DTBAdRequest f19860c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a */
    public interface C8144a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C8143a(C8145b bVar, MaxAdFormat maxAdFormat, C8144a aVar) {
        this((List<?>) Arrays.asList(new DTBAdSize[]{bVar.mo56310a()}), maxAdFormat, aVar);
    }

    public C8143a(List<?> list, MaxAdFormat maxAdFormat, C8144a aVar) {
        this.f19858a = maxAdFormat;
        this.f19859b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f19860c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo56307a() {
        DTBAdRequest dTBAdRequest = this.f19860c;
        if (dTBAdRequest == null) {
            this.f19859b.onAdLoadFailed((AdError) null, this.f19858a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f19859b.onAdLoadFailed(adError, this.f19858a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f19859b.onAdResponseLoaded(dTBAdResponse, this.f19858a);
    }
}
