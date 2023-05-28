package com.applovin.impl.sdk.p256e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.p233b.C8036d;
import com.applovin.impl.p233b.C8041i;
import com.applovin.impl.p233b.C8050o;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.e.e */
class C8411e extends C8407c {

    /* renamed from: e */
    private final C8029a f21140e;

    public C8411e(C8029a aVar, C8490n nVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, nVar, appLovinAdLoadListener);
        this.f21140e = aVar;
    }

    /* renamed from: j */
    private void m25357j() {
        String str;
        String str2;
        C8626v vVar;
        C8626v vVar2;
        String str3;
        String str4;
        C8626v vVar3;
        String str5;
        String str6;
        if (!mo57185b()) {
            if (this.f21140e.mo55837aU()) {
                C8036d aO = this.f21140e.mo55831aO();
                if (aO != null) {
                    C8041i b = aO.mo55888b();
                    if (b != null) {
                        Uri b2 = b.mo55918b();
                        String uri = b2 != null ? b2.toString() : "";
                        String c = b.mo55919c();
                        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(c)) {
                            if (b.mo55915a() == C8041i.C8042a.STATIC) {
                                C8626v vVar4 = this.f21120d;
                                if (C8626v.m26252a()) {
                                    this.f21120d.mo57818b(this.f21119c, "Caching static companion ad at " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                Uri c2 = mo57186c(uri, Collections.emptyList(), false);
                                if (c2 != null) {
                                    b.mo55916a(c2);
                                } else {
                                    C8626v vVar5 = this.f21120d;
                                    if (C8626v.m26252a()) {
                                        vVar2 = this.f21120d;
                                        str3 = this.f21119c;
                                        str4 = "Failed to cache static companion ad";
                                    } else {
                                        return;
                                    }
                                }
                            } else if (b.mo55915a() == C8041i.C8042a.HTML) {
                                if (StringUtils.isValidString(uri)) {
                                    C8626v vVar6 = this.f21120d;
                                    if (C8626v.m26252a()) {
                                        this.f21120d.mo57818b(this.f21119c, "Begin caching HTML companion ad. Fetching from " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                    }
                                    c = mo57184b(uri);
                                    if (StringUtils.isValidString(c)) {
                                        C8626v vVar7 = this.f21120d;
                                        if (C8626v.m26252a()) {
                                            vVar3 = this.f21120d;
                                            str5 = this.f21119c;
                                            str6 = "HTML fetched. Caching HTML now...";
                                        }
                                        b.mo55917a(mo57180a(c, (List<String>) Collections.emptyList(), (C8350e) this.f21140e));
                                    } else {
                                        C8626v vVar8 = this.f21120d;
                                        if (C8626v.m26252a()) {
                                            this.f21120d.mo57822e(this.f21119c, "Unable to load companion ad resources from " + uri);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    C8626v vVar9 = this.f21120d;
                                    if (C8626v.m26252a()) {
                                        vVar3 = this.f21120d;
                                        str5 = this.f21119c;
                                        str6 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c;
                                    }
                                    b.mo55917a(mo57180a(c, (List<String>) Collections.emptyList(), (C8350e) this.f21140e));
                                }
                                vVar3.mo57818b(str5, str6);
                                b.mo55917a(mo57180a(c, (List<String>) Collections.emptyList(), (C8350e) this.f21140e));
                            } else if (b.mo55915a() == C8041i.C8042a.IFRAME) {
                                C8626v vVar10 = this.f21120d;
                                if (C8626v.m26252a()) {
                                    vVar = this.f21120d;
                                    str2 = this.f21119c;
                                    str = "Skip caching of iFrame resource...";
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f21140e.mo56973a(true);
                            return;
                        }
                        C8626v vVar11 = this.f21120d;
                        if (C8626v.m26252a()) {
                            this.f21120d.mo57821d(this.f21119c, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    C8626v vVar12 = this.f21120d;
                    if (C8626v.m26252a()) {
                        vVar2 = this.f21120d;
                        str3 = this.f21119c;
                        str4 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                    } else {
                        return;
                    }
                    vVar2.mo57822e(str3, str4);
                    return;
                }
                C8626v vVar13 = this.f21120d;
                if (C8626v.m26252a()) {
                    vVar = this.f21120d;
                    str2 = this.f21119c;
                    str = "No companion ad provided. Skipping...";
                } else {
                    return;
                }
            } else {
                C8626v vVar14 = this.f21120d;
                if (C8626v.m26252a()) {
                    vVar = this.f21120d;
                    str2 = this.f21119c;
                    str = "Companion ad caching disabled. Skipping...";
                } else {
                    return;
                }
            }
            vVar.mo57818b(str2, str);
        }
    }

    /* renamed from: k */
    private void m25358k() {
        C8050o aN;
        Uri b;
        if (!mo57185b()) {
            if (!this.f21140e.mo55838aV()) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57818b(this.f21119c, "Video caching disabled. Skipping...");
                }
            } else if (this.f21140e.mo55829aM() != null && (aN = this.f21140e.mo55830aN()) != null && (b = aN.mo55946b()) != null) {
                Uri a = mo57179a(b.toString(), (List<String>) Collections.emptyList(), false);
                if (a != null) {
                    C8626v vVar2 = this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar3 = this.f21120d;
                        String str = this.f21119c;
                        vVar3.mo57818b(str, "Video file successfully cached into: " + a);
                    }
                    aN.mo55945a(a);
                    return;
                }
                C8626v vVar4 = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar5 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar5.mo57822e(str2, "Failed to cache video file: " + aN);
                }
            }
        }
    }

    /* renamed from: l */
    private void m25359l() {
        String str;
        String str2;
        String str3;
        C8626v vVar;
        if (!mo57185b()) {
            if (this.f21140e.mo55836aT() != null) {
                C8626v vVar2 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57818b(this.f21119c, "Begin caching HTML template. Fetching from " + this.f21140e.mo55836aT() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                str = mo57189e(this.f21140e.mo55836aT().toString(), this.f21140e.mo56951I(), this.f21140e.shouldUrlEncodeResourcePath());
            } else {
                str = this.f21140e.mo55835aS();
            }
            if (StringUtils.isValidString(str)) {
                String a = mo57180a(str, this.f21140e.mo56951I(), this.f21126a);
                if (this.f21140e.mo57018q() && this.f21140e.isOpenMeasurementEnabled()) {
                    a = this.f21118b.mo57374ao().mo56869a(a);
                }
                this.f21140e.mo55828a(a);
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    vVar = this.f21120d;
                    str3 = this.f21119c;
                    str2 = "Finish caching HTML template " + this.f21140e.mo55835aS() + " for ad #" + this.f21140e.getAdIdNumber();
                } else {
                    return;
                }
            } else {
                C8626v vVar4 = this.f21120d;
                if (C8626v.m26252a()) {
                    vVar = this.f21120d;
                    str3 = this.f21119c;
                    str2 = "Unable to load HTML template";
                } else {
                    return;
                }
            }
            vVar.mo57818b(str3, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo57191h() {
        this.f21140e.mo55860o().mo56856e();
        super.mo57191h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo57192i() {
        this.f21140e.mo55860o().mo56854c();
        super.mo57192i();
    }

    public void run() {
        super.run();
        if (this.f21140e.mo55846f()) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Begin caching for VAST streaming ad #" + this.f21126a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo57187c();
            if (this.f21140e.mo55858m()) {
                mo57192i();
            }
            if (this.f21140e.mo55857l() == C8029a.C8032b.COMPANION_AD) {
                m25357j();
                m25359l();
            } else {
                m25358k();
            }
            if (!this.f21140e.mo55858m()) {
                mo57192i();
            }
            if (this.f21140e.mo55857l() == C8029a.C8032b.COMPANION_AD) {
                m25358k();
            } else {
                m25357j();
                m25359l();
            }
        } else {
            C8626v vVar3 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.f21120d;
                String str2 = this.f21119c;
                vVar4.mo57818b(str2, "Begin caching for VAST ad #" + this.f21126a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo57187c();
            m25357j();
            m25358k();
            m25359l();
            mo57192i();
        }
        C8626v vVar5 = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar6 = this.f21120d;
            String str3 = this.f21119c;
            vVar6.mo57818b(str3, "Finished caching VAST ad #" + this.f21140e.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f21140e.getCreatedAtMillis();
        C8392d.m25254a(this.f21140e, this.f21118b);
        C8392d.m25253a(currentTimeMillis, (AppLovinAdBase) this.f21140e, this.f21118b);
        mo57182a((AppLovinAdBase) this.f21140e);
        this.f21140e.mo55841b();
        mo57181a();
    }
}
