package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C7965b;
import com.applovin.impl.adview.activity.p232b.C7905a;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.p252ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p252ad.C8356f;
import com.applovin.impl.sdk.p255d.C8388a;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8423j;
import com.applovin.impl.sdk.p256e.C8424k;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class AppLovinAdServiceImpl implements AppLovinAdService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f20392a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8626v f20393b;

    /* renamed from: c */
    private final Handler f20394c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Map<C8349d, C8302b> f20395d;

    /* renamed from: e */
    private final Object f20396e = new Object();

    /* renamed from: f */
    private final Map<String, String> f20397f = CollectionUtils.map();

    /* renamed from: g */
    private final AtomicReference<JSONObject> f20398g = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$a */
    private class C8301a implements AppLovinAdLoadListener {

        /* renamed from: b */
        private final C8302b f20416b;

        private C8301a(C8302b bVar) {
            this.f20416b = bVar;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            HashSet<AppLovinAdLoadListener> hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            C8349d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof C8356f)) {
                AppLovinAdServiceImpl.this.f20392a.mo57362ac().mo57081a(appLovinAdImpl);
                appLovinAd = new C8356f(adZone, AppLovinAdServiceImpl.this.f20392a);
            }
            synchronized (this.f20416b.f20417a) {
                hashSet = new HashSet<>(this.f20416b.f20419c);
                this.f20416b.f20419c.clear();
                this.f20416b.f20418b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m24901a(appLovinAd, a);
            }
        }

        public void failedToReceiveAd(int i) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.f20416b.f20417a) {
                hashSet = new HashSet<>(this.f20416b.f20419c);
                this.f20416b.f20419c.clear();
                this.f20416b.f20418b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m24890a(i, a);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    private static class C8302b {

        /* renamed from: a */
        final Object f20417a;

        /* renamed from: b */
        boolean f20418b;

        /* renamed from: c */
        final Collection<AppLovinAdLoadListener> f20419c;

        private C8302b() {
            this.f20417a = new Object();
            this.f20419c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f20418b + ", pendingAdListeners=" + this.f20419c + '}';
        }
    }

    AppLovinAdServiceImpl(C8490n nVar) {
        this.f20392a = nVar;
        this.f20393b = nVar.mo57320D();
        Map<C8349d, C8302b> map = CollectionUtils.map(6);
        this.f20395d = map;
        map.put(C8349d.m25021g(), new C8302b());
        this.f20395d.put(C8349d.m25022h(), new C8302b());
        this.f20395d.put(C8349d.m25023i(), new C8302b());
        this.f20395d.put(C8349d.m25024j(), new C8302b());
        this.f20395d.put(C8349d.m25025k(), new C8302b());
        this.f20395d.put(C8349d.m25026l(), new C8302b());
    }

    /* renamed from: a */
    private Uri m24885a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            this.f20392a.mo57320D();
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v D = this.f20392a.mo57320D();
            D.mo57821d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private C8302b m24886a(C8349d dVar) {
        C8302b bVar;
        synchronized (this.f20396e) {
            bVar = this.f20395d.get(dVar);
            if (bVar == null) {
                bVar = new C8302b();
                this.f20395d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private String m24888a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f20393b;
                vVar.mo57819b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m24889a(String str, long j, long j2, List<Long> list, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i != C8464h.f21255a) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C8464h.m25510a(i)));
        }
        return appendQueryParameter.build().toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24890a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f20394c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                } catch (Throwable th) {
                    C8626v.m26254c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24891a(Uri uri, C8350e eVar, AppLovinAdView appLovinAdView, C7965b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f20392a)) {
            C8575k.m26159c(bVar.mo55674g(), (AppLovinAd) eVar, appLovinAdView);
        }
        bVar.mo55682o();
    }

    /* renamed from: a */
    private void m24892a(Uri uri, C8350e eVar, AppLovinAdView appLovinAdView, C7965b bVar, Context context, C8490n nVar) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
                return;
            }
            return;
        }
        Uri a = m24885a(uri, "primaryUrl");
        List<Uri> b = m24905b(uri, "primaryTrackingUrl");
        Uri a2 = m24885a(uri, "fallbackUrl");
        List<Uri> b2 = m24905b(uri, "fallbackTrackingUrl");
        if (a == null && a2 == null) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                return;
            }
            return;
        }
        if (!m24902a(a, "primary", b, eVar, appLovinAdView, bVar, context, nVar)) {
            m24902a(a2, "backup", b2, eVar, appLovinAdView, bVar, context, nVar);
        }
        if (bVar != null) {
            bVar.mo55682o();
        }
    }

    /* renamed from: a */
    private void m24893a(Uri uri, C8350e eVar, C7965b bVar, final C7905a aVar) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f20393b;
            vVar.mo57818b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f20392a.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.CLOSE_AD_ON_FORWARDING_CLICK_SCHEME);
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.f20394c.post(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C8626v unused = AppLovinAdServiceImpl.this.f20393b;
                            if (C8626v.m26252a()) {
                                AppLovinAdServiceImpl.this.f20393b.mo57818b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.mo55555h();
                        }
                    }
                });
            } else if (bVar != null && !Utils.isBML(eVar.getSize())) {
                if (C8626v.m26252a()) {
                    this.f20393b.mo57818b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.mo55679l();
            }
        }
    }

    /* renamed from: a */
    private void m24897a(C8349d dVar, C8301a aVar) {
        AppLovinAdImpl a = this.f20392a.mo57362ac().mo57080a(dVar);
        if (a != null) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f20393b;
                vVar.mo57818b("AppLovinAdService", "Using pre-loaded ad: " + a + " for " + dVar);
            }
            aVar.adReceived(a);
            return;
        }
        m24900a((C8401a) new C8424k(dVar, aVar, this.f20392a));
    }

    /* renamed from: a */
    private void m24898a(C8349d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        } else if (appLovinAdLoadListener != null) {
            this.f20392a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f20392a.mo57320D();
                D.mo57818b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
            }
            C8302b a = m24886a(dVar);
            synchronized (a.f20417a) {
                a.f20419c.add(appLovinAdLoadListener);
                if (!a.f20418b) {
                    a.f20418b = true;
                    m24897a(dVar, new C8301a(a));
                } else if (C8626v.m26252a()) {
                    this.f20393b.mo57818b("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    /* renamed from: a */
    private void m24899a(C8388a aVar) {
        if (StringUtils.isValidString(aVar.mo57120a())) {
            this.f20392a.mo57339X().mo57568a(C8533h.m25871o().mo57602c(aVar.mo57120a()).mo57605d(StringUtils.isValidString(aVar.mo57121b()) ? aVar.mo57121b() : null).mo57600b(aVar.mo57122c()).mo57597a(false).mo57604c(aVar.mo57123d()).mo57598a());
        } else if (C8626v.m26252a()) {
            this.f20393b.mo57821d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    /* renamed from: a */
    private void m24900a(C8401a aVar) {
        if (!this.f20392a.mo57387d()) {
            C8626v.m26257h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f20392a.mo57345a();
        this.f20392a.mo57337V().mo57228a(aVar, C8432o.C8434a.MAIN);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24901a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f20394c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    C8626v.m26254c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m24902a(Uri uri, String str, List<Uri> list, C8350e eVar, AppLovinAdView appLovinAdView, C7965b bVar, Context context, C8490n nVar) {
        nVar.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = nVar.mo57320D();
            D.mo57818b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean openUri = Utils.openUri(context, uri, nVar);
        nVar.mo57320D();
        boolean a = C8626v.m26252a();
        if (openUri) {
            if (a) {
                C8626v D2 = nVar.mo57320D();
                D2.mo57818b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            for (Uri uri2 : list) {
                nVar.mo57360aa().dispatchPostbackAsync(uri2.toString(), (AppLovinPostbackListener) null);
            }
            if (bVar != null) {
                C8575k.m26159c(bVar.mo55674g(), (AppLovinAd) eVar, appLovinAdView);
            }
        } else if (a) {
            nVar.mo57320D().mo57822e("AppLovinAdService", "URL failed to open");
        }
        return openUri;
    }

    /* renamed from: a */
    private boolean m24903a(String str) {
        String str2 = this.f20392a.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.FORWARDING_CLICK_SCHEME);
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    /* renamed from: b */
    private List<Uri> m24905b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String parse : queryParameters) {
            try {
                arrayList.add(Uri.parse(parse));
            } catch (Throwable unused) {
                this.f20392a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = this.f20392a.mo57320D();
                    D.mo57821d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f20397f) {
            this.f20397f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(C8349d dVar) {
        AppLovinAdImpl b = this.f20392a.mo57362ac().mo57082b(dVar);
        if (C8626v.m26252a()) {
            C8626v vVar = this.f20393b;
            vVar.mo57818b("AppLovinAdService", "Dequeued ad: " + b + " for zone: " + dVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return b;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f20398g.getAndSet((Object) null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f20397f) {
            map = CollectionUtils.map(this.f20397f);
            this.f20397f.clear();
        }
        return map;
    }

    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a = this.f20392a.mo57340Y().mo57624a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a;
    }

    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m24898a(C8349d.m25015a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f20393b;
            vVar.mo57818b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        m24898a(C8349d.m25016a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* JADX WARNING: type inference failed for: r11v25, types: [com.applovin.impl.sdk.e.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadNextAdForAdToken(java.lang.String r11, com.applovin.sdk.AppLovinAdLoadListener r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0007
            java.lang.String r11 = r11.trim()
            goto L_0x0008
        L_0x0007:
            r11 = 0
        L_0x0008:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = -8
            java.lang.String r2 = "AppLovinAdService"
            if (r0 == 0) goto L_0x001a
            java.lang.String r11 = "Invalid ad token specified"
            com.applovin.impl.sdk.C8626v.m26258i(r2, r11)
            r10.m24890a((int) r1, (com.applovin.sdk.AppLovinAdLoadListener) r12)
            return
        L_0x001a:
            com.applovin.impl.sdk.ad.c r0 = new com.applovin.impl.sdk.ad.c
            com.applovin.impl.sdk.n r3 = r10.f20392a
            r0.<init>(r11, r3)
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo56929b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p252ad.C8347c.C8348a.REGULAR
            if (r11 != r3) goto L_0x0051
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x0045
            com.applovin.impl.sdk.v r11 = r10.f20393b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Loading next ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r11.mo57818b(r2, r1)
        L_0x0045:
            com.applovin.impl.sdk.e.l r11 = new com.applovin.impl.sdk.e.l
            com.applovin.impl.sdk.n r1 = r10.f20392a
            r11.<init>(r0, r12, r1)
        L_0x004c:
            r10.m24900a((com.applovin.impl.sdk.p256e.C8401a) r11)
            goto L_0x00f8
        L_0x0051:
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo56929b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p252ad.C8347c.C8348a.AD_RESPONSE_JSON
            if (r11 != r3) goto L_0x00e1
            org.json.JSONObject r5 = r0.mo56931d()
            if (r5 == 0) goto L_0x00d9
            com.applovin.impl.sdk.n r11 = r10.f20392a
            com.applovin.impl.sdk.utils.C8572i.m26111f(r5, r11)
            com.applovin.impl.sdk.n r11 = r10.f20392a
            com.applovin.impl.sdk.utils.C8572i.m26107d(r5, r11)
            com.applovin.impl.sdk.n r11 = r10.f20392a
            com.applovin.impl.sdk.utils.C8572i.m26106c(r5, r11)
            com.applovin.impl.sdk.n r11 = r10.f20392a
            com.applovin.impl.sdk.utils.C8572i.m26109e(r5, r11)
            com.applovin.impl.sdk.n r11 = r10.f20392a
            com.applovin.impl.sdk.C8459f.m25498a((com.applovin.impl.sdk.C8490n) r11)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.lang.String r1 = "ads"
            org.json.JSONArray r11 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r5, r1, r11)
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x00b7
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x00a5
            com.applovin.impl.sdk.v r11 = r10.f20393b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Rendering ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo57818b(r2, r0)
        L_0x00a5:
            com.applovin.impl.sdk.n r11 = r10.f20392a
            com.applovin.impl.sdk.ad.d r6 = com.applovin.impl.sdk.utils.Utils.getZone(r5, r11)
            com.applovin.impl.sdk.e.p r11 = new com.applovin.impl.sdk.e.p
            com.applovin.impl.sdk.ad.b r7 = com.applovin.impl.sdk.p252ad.C8346b.DECODED_AD_TOKEN_JSON
            com.applovin.impl.sdk.n r9 = r10.f20392a
            r4 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x004c
        L_0x00b7:
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x00d3
            com.applovin.impl.sdk.v r11 = r10.f20393b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No ad returned from the server for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo57822e(r2, r0)
        L_0x00d3:
            r11 = 204(0xcc, float:2.86E-43)
            r12.failedToReceiveAd(r11)
            goto L_0x00f8
        L_0x00d9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Unable to retrieve ad response JSON from token: "
            goto L_0x00e8
        L_0x00e1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Invalid ad token specified: "
        L_0x00e8:
            r11.append(r3)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.applovin.impl.sdk.C8626v.m26258i(r2, r11)
            r12.failedToReceiveAd(r1)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinAdServiceImpl.loadNextAdForAdToken(java.lang.String, com.applovin.sdk.AppLovinAdLoadListener):void");
    }

    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f20393b;
                vVar.mo57818b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            m24898a(C8349d.m25017a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            C8626v.m26258i("AppLovinAdService", "No zones were provided");
            m24890a(-7, appLovinAdLoadListener);
            return;
        }
        if (C8626v.m26252a()) {
            C8626v vVar = this.f20393b;
            vVar.mo57818b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        }
        m24900a((C8401a) new C8423j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.f20392a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f20393b;
            vVar.mo57818b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        m24898a(C8349d.m25019b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<C8388a> list) {
        if (list != null && !list.isEmpty()) {
            for (C8388a a : list) {
                m24899a(a);
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f20398g.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f20395d + '}';
    }

    public void trackAndLaunchClick(C8350e eVar, AppLovinAdView appLovinAdView, C7965b bVar, Uri uri, PointF pointF, boolean z) {
        if (eVar != null) {
            if (C8626v.m26252a()) {
                this.f20393b.mo57818b("AppLovinAdService", "Tracking click on an ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo56971a(pointF, z));
            if (appLovinAdView == null || uri == null) {
                if (C8626v.m26252a()) {
                    this.f20393b.mo57822e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
                }
            } else if (eVar.isDirectDownloadEnabled()) {
                final C7965b bVar2 = bVar;
                final C8350e eVar2 = eVar;
                final AppLovinAdView appLovinAdView2 = appLovinAdView;
                final Uri uri2 = uri;
                this.f20392a.mo57376aq().startDirectDownloadActivity(eVar, new ArrayService.DirectDownloadListener() {
                    public void onAppDetailsDismissed() {
                        if (bVar2 != null) {
                            AppLovinAdServiceImpl.this.f20392a.mo57366ag().resumeForClick();
                            C8575k.m26153b(bVar2.mo55674g(), (AppLovinAd) eVar2, appLovinAdView2);
                        }
                    }

                    public void onAppDetailsDisplayed() {
                        AppLovinAdServiceImpl.this.f20392a.mo57366ag().pauseForClick();
                        C7965b bVar = bVar2;
                        if (bVar != null) {
                            bVar.mo55682o();
                            C8575k.m26122a(bVar2.mo55674g(), (AppLovinAd) eVar2, appLovinAdView2);
                        }
                    }

                    public void onFailure() {
                        AppLovinAdServiceImpl.this.m24891a(uri2, eVar2, appLovinAdView2, bVar2);
                    }
                });
            } else if (m24903a(uri.getScheme())) {
                m24893a(uri, eVar, bVar, (C7905a) null);
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                m24892a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f20392a);
            } else {
                m24891a(uri, eVar, appLovinAdView, bVar);
            }
        } else if (C8626v.m26252a()) {
            this.f20393b.mo57822e("AppLovinAdService", "Unable to track ad view click. No ad specified");
        }
    }

    public void trackAndLaunchVideoClick(C8350e eVar, final Uri uri, PointF pointF, C7905a aVar, final Context context) {
        if (eVar != null) {
            if (C8626v.m26252a()) {
                this.f20393b.mo57818b("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo56970a(pointF));
            if (eVar.isDirectDownloadEnabled()) {
                this.f20392a.mo57376aq().startDirectDownloadActivity(eVar, new ArrayService.DirectDownloadListener() {
                    public void onAppDetailsDismissed() {
                        AppLovinAdServiceImpl.this.f20392a.mo57366ag().resumeForClick();
                    }

                    public void onAppDetailsDisplayed() {
                        AppLovinAdServiceImpl.this.f20392a.mo57366ag().pauseForClick();
                    }

                    public void onFailure() {
                        Utils.openUri(context, uri, AppLovinAdServiceImpl.this.f20392a);
                    }
                });
            } else if (m24903a(uri.getScheme())) {
                m24893a(uri, eVar, (C7965b) null, aVar);
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                m24892a(uri, eVar, (AppLovinAdView) null, (C7965b) null, context, this.f20392a);
            } else {
                Utils.openUri(context, uri, this.f20392a);
            }
        } else if (C8626v.m26252a()) {
            this.f20393b.mo57822e("AppLovinAdService", "Unable to track video click. No ad specified");
        }
    }

    public void trackAppKilled(C8350e eVar) {
        if (eVar != null) {
            if (C8626v.m26252a()) {
                this.f20393b.mo57818b("AppLovinAdService", "Tracking app killed during ad...");
            }
            List<C8388a> as = eVar.mo57004as();
            if (as != null && !as.isEmpty()) {
                for (C8388a next : as) {
                    m24899a(new C8388a(next.mo57120a(), next.mo57121b()));
                }
            } else if (C8626v.m26252a()) {
                C8626v vVar = this.f20393b;
                vVar.mo57821d("AppLovinAdService", "Unable to track app killed during AD #" + eVar.getAdIdNumber() + ". Missing app killed tracking URL.");
            }
        } else if (C8626v.m26252a()) {
            this.f20393b.mo57822e("AppLovinAdService", "Unable to track app killed. No ad specified");
        }
    }

    public void trackFullScreenAdClosed(C8350e eVar, long j, List<Long> list, long j2, boolean z, int i) {
        boolean a = C8626v.m26252a();
        if (eVar != null) {
            if (a) {
                this.f20393b.mo57818b("AppLovinAdService", "Tracking ad closed...");
            }
            List<C8388a> ar = eVar.mo57003ar();
            if (ar != null && !ar.isEmpty()) {
                for (C8388a next : ar) {
                    long j3 = j;
                    long j4 = j2;
                    List<Long> list2 = list;
                    boolean z2 = z;
                    int i2 = i;
                    String a2 = m24889a(next.mo57120a(), j3, j4, list2, z2, i2);
                    String a3 = m24889a(next.mo57121b(), j3, j4, list2, z2, i2);
                    if (StringUtils.isValidString(a2)) {
                        m24899a(new C8388a(a2, a3));
                    } else if (C8626v.m26252a()) {
                        C8626v vVar = this.f20393b;
                        vVar.mo57822e("AppLovinAdService", "Failed to parse url: " + next.mo57120a());
                    }
                }
            } else if (C8626v.m26252a()) {
                C8626v vVar2 = this.f20393b;
                vVar2.mo57821d("AppLovinAdService", "Unable to track ad closed for AD #" + eVar.getAdIdNumber() + ". Missing ad close tracking URL." + eVar.getAdIdNumber());
            }
        } else if (a) {
            this.f20393b.mo57822e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
        }
    }

    public void trackImpression(C8350e eVar) {
        if (eVar != null) {
            if (C8626v.m26252a()) {
                this.f20393b.mo57818b("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo55840at());
        } else if (C8626v.m26252a()) {
            this.f20393b.mo57822e("AppLovinAdService", "Unable to track impression click. No ad specified");
        }
    }

    public void trackVideoEnd(C8350e eVar, long j, int i, boolean z) {
        boolean a = C8626v.m26252a();
        if (eVar != null) {
            if (a) {
                this.f20393b.mo57818b("AppLovinAdService", "Tracking video end on ad...");
            }
            List<C8388a> aq = eVar.mo57002aq();
            if (aq != null && !aq.isEmpty()) {
                String l = Long.toString(System.currentTimeMillis());
                for (C8388a next : aq) {
                    if (StringUtils.isValidString(next.mo57120a())) {
                        long j2 = j;
                        int i2 = i;
                        String str = l;
                        boolean z2 = z;
                        String a2 = m24888a(next.mo57120a(), j2, i2, str, z2);
                        String a3 = m24888a(next.mo57121b(), j2, i2, str, z2);
                        if (a2 != null) {
                            m24899a(new C8388a(a2, a3));
                        } else if (C8626v.m26252a()) {
                            C8626v vVar = this.f20393b;
                            vVar.mo57822e("AppLovinAdService", "Failed to parse url: " + next.mo57120a());
                        }
                    } else if (C8626v.m26252a()) {
                        this.f20393b.mo57821d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                    }
                }
            } else if (C8626v.m26252a()) {
                C8626v vVar2 = this.f20393b;
                vVar2.mo57821d("AppLovinAdService", "Unable to submit persistent postback for AD #" + eVar.getAdIdNumber() + ". Missing video end tracking URL.");
            }
        } else if (a) {
            this.f20393b.mo57822e("AppLovinAdService", "Unable to track video end. No ad specified");
        }
    }
}
