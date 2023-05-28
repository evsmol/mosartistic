package com.criteo.publisher.p066h0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p074n0.C1288a;
import com.criteo.publisher.p074n0.C1311o;
import com.criteo.publisher.p074n0.C1312p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.criteo.publisher.h0.e */
/* compiled from: MoPubHeaderBidding */
public class C1144e implements C1143d {

    /* renamed from: b */
    private static final List<String> f3643b = Arrays.asList(new String[]{"crt_cpm", "crt_displayUrl", "crt_size", "crt_format"});

    /* renamed from: a */
    public final C1195g f3644a = C1197h.m5407b(getClass());

    /* renamed from: b */
    public boolean mo3237b(Object obj) {
        return C1312p.m5784b(obj, "com.mopub.mobileads.MoPubView") || C1312p.m5784b(obj, "com.mopub.mobileads.MoPubInterstitial") || C1312p.m5784b(obj, "com.mopub.mobileads.MoPubRewardedAdManager$RequestParameters");
    }

    /* renamed from: a */
    public C1147a mo3232a() {
        return C1147a.MOPUB_APP_BIDDING;
    }

    /* renamed from: a */
    public void mo3234a(Object obj) {
        String c;
        if (mo3237b(obj) && (c = m5258c(obj)) != null) {
            m5255a(obj, m5257b(c));
        }
    }

    /* renamed from: b */
    private String m5257b(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (!m5256a(str2)) {
                sb.append(str2);
                sb.append(",");
            }
        }
        return sb.toString().replaceAll(",$", "");
    }

    /* renamed from: a */
    private boolean m5256a(String str) {
        for (String str2 : f3643b) {
            if (str.startsWith(str2 + ":")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo3235a(Object obj, C1288a aVar, C1272s sVar) {
        String str;
        if (mo3237b(obj)) {
            String d = sVar.mo3572d();
            if (sVar.mo3586p()) {
                d = mo3241c(d);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("crt_cpm");
            sb.append(":");
            sb.append(sVar.mo3566a());
            sb.append(",");
            sb.append("crt_displayUrl");
            sb.append(":");
            sb.append(d);
            if (aVar == C1288a.CRITEO_BANNER) {
                sb.append(",");
                sb.append("crt_size");
                sb.append(":");
                sb.append(sVar.mo3581k());
                sb.append("x");
                sb.append(sVar.mo3573e());
            }
            if (sVar.mo3586p()) {
                sb.append(",");
                sb.append("crt_format");
                sb.append(":");
                sb.append("video");
            }
            String c = m5258c(obj);
            if (c != null) {
                str = c + "," + sb;
            } else {
                str = sb.toString();
            }
            m5255a(obj, str);
            this.f3644a.mo3337a(C1136a.m5229a(mo3232a(), sb.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo3241c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, Charset.forName("UTF-8").name());
        } catch (UnsupportedEncodingException e) {
            C1311o.m5779a((Throwable) e);
            return null;
        }
    }

    /* renamed from: c */
    private String m5258c(Object obj) {
        if (C1312p.m5784b(obj, "com.mopub.mobileads.MoPubView") || C1312p.m5784b(obj, "com.mopub.mobileads.MoPubInterstitial")) {
            return (String) C1312p.m5782a(obj, "getKeywords", new Object[0]);
        }
        if (C1312p.m5784b(obj, "com.mopub.mobileads.MoPubRewardedAdManager$RequestParameters")) {
            return (String) C1312p.m5781a(obj, "mKeywords");
        }
        throw new UnsupportedOperationException("Unsupported object " + obj);
    }

    /* renamed from: a */
    private void m5255a(Object obj, String str) {
        if (C1312p.m5784b(obj, "com.mopub.mobileads.MoPubView") || C1312p.m5784b(obj, "com.mopub.mobileads.MoPubInterstitial")) {
            C1312p.m5782a(obj, "setKeywords", str);
        } else if (C1312p.m5784b(obj, "com.mopub.mobileads.MoPubRewardedAdManager$RequestParameters")) {
            C1312p.m5783a(obj, "mKeywords", (Object) str);
        } else {
            throw new UnsupportedOperationException("Unsupported object " + obj);
        }
    }
}
