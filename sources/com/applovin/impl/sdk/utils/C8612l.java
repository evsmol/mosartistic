package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.appodeal.ads.modules.common.internal.LogConstants;

/* renamed from: com.applovin.impl.sdk.utils.l */
public class C8612l {

    /* renamed from: a */
    private final StringBuilder f21746a = new StringBuilder();

    /* renamed from: a */
    public C8612l mo57741a() {
        this.f21746a.append("\n========================================");
        return this;
    }

    /* renamed from: a */
    public C8612l mo57742a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            mo57748a(str, bundle.get(str));
        }
        return this;
    }

    /* renamed from: a */
    public C8612l mo57743a(AppLovinAdView appLovinAdView) {
        return mo57748a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).mo57748a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).mo57748a("Visibility", C8619r.m26227b(appLovinAdView.getVisibility()));
    }

    /* renamed from: a */
    public C8612l mo57744a(C8070a aVar) {
        String str = "None";
        C8612l a = mo57748a(LogConstants.KEY_NETWORK, aVar.mo56152S()).mo57748a("Adapter Version", aVar.mo56088h()).mo57748a("Format", aVar.getFormat() != null ? aVar.getFormat().getLabel() : LogConstants.KEY_UNKNOWN).mo57748a("Ad Unit ID", aVar.getAdUnitId()).mo57748a("Placement", aVar.getPlacement()).mo57748a("Network Placement", aVar.mo56096p()).mo57748a("Serve ID", aVar.mo56071f()).mo57748a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : str).mo57748a("Ad Review Creative ID", StringUtils.isValidString(aVar.getAdReviewCreativeId()) ? aVar.getAdReviewCreativeId() : str).mo57748a("DSP Name", StringUtils.isValidString(aVar.getDspName()) ? aVar.getDspName() : str);
        if (StringUtils.isValidString(aVar.getDspId())) {
            str = aVar.getDspId();
        }
        return a.mo57748a("DSP ID", str).mo57748a("Server Parameters", aVar.mo56169ab());
    }

    /* renamed from: a */
    public C8612l mo57745a(C8350e eVar) {
        boolean z = eVar instanceof C8029a;
        mo57748a("Format", eVar.getAdZone().mo56937b() != null ? eVar.getAdZone().mo56937b().getLabel() : null).mo57748a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).mo57748a("Zone ID", eVar.getAdZone().mo56936a()).mo57748a("Source", eVar.getSource()).mo57748a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            mo57748a("DSP Name", dspName);
        }
        if (z) {
            mo57748a("VAST DSP", ((C8029a) eVar).mo55859n());
        }
        return this;
    }

    /* renamed from: a */
    public C8612l mo57746a(C8490n nVar) {
        return mo57748a("Muted", Boolean.valueOf(nVar.mo57400q().isMuted()));
    }

    /* renamed from: a */
    public C8612l mo57747a(String str) {
        StringBuilder sb = this.f21746a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* renamed from: a */
    public C8612l mo57748a(String str, Object obj) {
        return mo57749a(str, obj, "");
    }

    /* renamed from: a */
    public C8612l mo57749a(String str, Object obj, String str2) {
        StringBuilder sb = this.f21746a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    /* renamed from: b */
    public C8612l mo57750b(C8350e eVar) {
        mo57748a("Target", eVar.mo57017p()).mo57748a("close_style", eVar.mo57023v()).mo57749a("close_delay_graphic", Long.valueOf(eVar.mo57021t()), "s");
        if (eVar instanceof C8345a) {
            C8345a aVar = (C8345a) eVar;
            mo57748a("HTML", aVar.mo55841b().substring(0, Math.min(aVar.mo55841b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            mo57749a("close_delay", Long.valueOf(eVar.mo57019r()), "s").mo57748a("skip_style", eVar.mo57025x()).mo57748a("Streaming", Boolean.valueOf(eVar.mo55846f())).mo57748a("Video Location", eVar.mo55843d()).mo57748a("video_button_properties", eVar.mo56947D());
        }
        return this;
    }

    /* renamed from: b */
    public C8612l mo57751b(String str) {
        this.f21746a.append(str);
        return this;
    }

    public String toString() {
        return this.f21746a.toString();
    }
}
