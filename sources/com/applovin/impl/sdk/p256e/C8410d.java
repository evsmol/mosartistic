package com.applovin.impl.sdk.p256e;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.d */
public class C8410d extends C8407c {

    /* renamed from: e */
    private final C8345a f21137e;

    /* renamed from: f */
    private boolean f21138f;

    /* renamed from: g */
    private boolean f21139g;

    public C8410d(C8345a aVar, C8490n nVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, nVar, appLovinAdLoadListener);
        this.f21137e = aVar;
    }

    /* renamed from: j */
    private void m25353j() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "Caching HTML resources...");
        }
        String a = mo57180a(this.f21137e.mo55841b(), this.f21137e.mo56951I(), (C8350e) this.f21137e);
        if (this.f21137e.mo57018q() && this.f21137e.isOpenMeasurementEnabled()) {
            a = this.f21118b.mo57374ao().mo56869a(a);
        }
        this.f21137e.mo56920a(a);
        this.f21137e.mo56973a(true);
        C8626v vVar2 = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar3 = this.f21120d;
            String str = this.f21119c;
            vVar3.mo57818b(str, "Finish caching non-video resources for ad #" + this.f21137e.getAdIdNumber());
        }
        C8626v vVar4 = this.f21120d;
        String str2 = this.f21119c;
        vVar4.mo57816a(str2, "Ad updated with cachedHTML = " + this.f21137e.mo55841b());
    }

    /* renamed from: k */
    private void m25354k() {
        Uri a;
        if (!mo57185b() && (a = mo57178a(this.f21137e.mo56923i())) != null) {
            if (this.f21137e.mo56984aK()) {
                this.f21137e.mo56920a(this.f21137e.mo55841b().replaceFirst(this.f21137e.mo56921e(), a.toString()));
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57818b(this.f21119c, "Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f21137e.mo56922g();
            this.f21137e.mo56919a(a);
        }
    }

    /* renamed from: a */
    public void mo57197a(boolean z) {
        this.f21138f = z;
    }

    /* renamed from: b */
    public void mo57198b(boolean z) {
        this.f21139g = z;
    }

    public void run() {
        super.run();
        boolean f = this.f21137e.mo55846f();
        boolean z = this.f21139g;
        if (f || z) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Begin caching for streaming ad #" + this.f21137e.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo57187c();
            if (f) {
                if (this.f21138f) {
                    mo57192i();
                }
                m25353j();
                if (!this.f21138f) {
                    mo57192i();
                }
                m25354k();
            } else {
                mo57192i();
                m25353j();
            }
        } else {
            C8626v vVar3 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.f21120d;
                String str2 = this.f21119c;
                vVar4.mo57818b(str2, "Begin processing for non-streaming ad #" + this.f21137e.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo57187c();
            m25353j();
            m25354k();
            mo57192i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f21137e.getCreatedAtMillis();
        C8392d.m25254a(this.f21137e, this.f21118b);
        C8392d.m25253a(currentTimeMillis, (AppLovinAdBase) this.f21137e, this.f21118b);
        mo57182a((AppLovinAdBase) this.f21137e);
        mo57181a();
    }
}
