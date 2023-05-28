package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.C8502a;
import com.applovin.impl.sdk.network.C8536i;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8442r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.base.p264b.C8849c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.e */
public class C8507e extends C8401a implements C8502a.C8503a, AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f21410a;

    /* renamed from: e */
    private final JSONObject f21411e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AppLovinNativeAdLoadListener f21412f;

    /* renamed from: g */
    private String f21413g = "";

    /* renamed from: h */
    private String f21414h = "";

    /* renamed from: i */
    private String f21415i = "";

    /* renamed from: j */
    private String f21416j = "";

    /* renamed from: k */
    private Uri f21417k = null;

    /* renamed from: l */
    private Uri f21418l = null;

    /* renamed from: m */
    private C8029a f21419m;

    /* renamed from: n */
    private Uri f21420n = null;

    /* renamed from: o */
    private Uri f21421o = null;

    /* renamed from: p */
    private Uri f21422p = null;

    /* renamed from: q */
    private Uri f21423q = null;

    /* renamed from: r */
    private final List<String> f21424r = new ArrayList();

    /* renamed from: s */
    private String f21425s;

    /* renamed from: t */
    private final List<C8536i> f21426t = new ArrayList();

    /* renamed from: u */
    private final List<C8536i> f21427u = new ArrayList();

    /* renamed from: v */
    private final List<C8536i> f21428v = new ArrayList();

    /* renamed from: w */
    private final List<C8536i> f21429w = new ArrayList();

    public C8507e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C8490n nVar) {
        super("TaskRenderNativeAd", nVar);
        this.f21410a = jSONObject;
        this.f21411e = jSONObject2;
        this.f21412f = appLovinNativeAdLoadListener;
    }

    /* renamed from: a */
    private void m25717a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f21410a), JsonUtils.shallowCopy(this.f21411e), this.f21118b).setTitle(this.f21413g).setAdvertiser(this.f21414h).setBody(this.f21415i).setCallToAction(this.f21416j).setIconUri(this.f21417k).setMainImageUri(this.f21418l).setPrivacyIconUri(this.f21420n).setVastAd(this.f21419m).setPrivacyDestinationUri(this.f21421o).setClickDestinationUri(this.f21422p).setClickDestinationBackupUri(this.f21423q).setClickTrackingUrls(this.f21424r).setJsTracker(this.f21425s).setImpressionRequests(this.f21426t).setViewableMRC50Requests(this.f21427u).setViewableMRC100Requests(this.f21428v).setViewableVideo50Requests(this.f21429w).build();
        build.getAdEventTracker().mo56852b();
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Starting cache task for type: " + build.getType() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f21118b.mo57337V().mo57228a((C8401a) new C8502a(build, this.f21118b, this), C8432o.C8434a.MAIN);
    }

    /* renamed from: a */
    private void m25718a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String string = JsonUtils.getString(jSONObject, "url", (String) null);
            if (StringUtils.isValidString(string)) {
                this.f21422p = Uri.parse(string);
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str = this.f21119c;
                    vVar2.mo57818b(str, "Processed click destination URL: " + this.f21422p);
                }
            }
            String string2 = JsonUtils.getString(jSONObject, "fallback", (String) null);
            if (StringUtils.isValidString(string2)) {
                this.f21423q = Uri.parse(string2);
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar4 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar4.mo57818b(str2, "Processed click destination backup URL: " + this.f21423q);
                }
            }
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", (JSONArray) null);
            if (jSONArray != null) {
                try {
                    this.f21424r.addAll(JsonUtils.toList(jSONArray));
                    C8626v vVar5 = this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar6 = this.f21120d;
                        String str3 = this.f21119c;
                        vVar6.mo57818b(str3, "Processed click tracking URLs: " + this.f21424r);
                    }
                } catch (Throwable th) {
                    C8626v vVar7 = this.f21120d;
                    if (C8626v.m26252a()) {
                        this.f21120d.mo57819b(this.f21119c, "Failed to render click tracking URLs", th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25720b() {
        this.f21412f.onNativeAdLoadFailed(-6);
    }

    /* renamed from: b */
    private void m25721b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C8626v unused = C8507e.this.f21120d;
                if (C8626v.m26252a()) {
                    C8507e.this.f21120d.mo57818b(C8507e.this.f21119c, "Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    C8626v unused2 = C8507e.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8507e.this.f21120d.mo57818b(C8507e.this.f21119c, "Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().mo56854c();
                    C8507e.this.f21412f.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    C8626v unused3 = C8507e.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8507e.this.f21120d.mo57819b(C8507e.this.f21119c, "Failed to prepare native ad view components", th);
                    }
                    C8507e.this.m25720b();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo57490a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "Successfully cached and loaded ad");
        }
        m25721b(appLovinNativeAdImpl);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "VAST ad rendered successfully");
        }
        this.f21419m = (C8029a) appLovinAd;
        m25717a();
    }

    public void failedToReceiveAd(int i) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57822e(this.f21119c, "VAST ad failed to render");
        }
        m25717a();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v5, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v12, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v32 */
    public void run() {
        C8626v vVar;
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        StringBuilder sb2;
        String str4;
        C8626v vVar2;
        C8626v vVar3;
        String str5;
        StringBuilder sb3;
        C8626v vVar4;
        String str6;
        StringBuilder sb4;
        String str7;
        String sb5;
        String str8;
        Uri uri;
        ? r2 = 0;
        String string = JsonUtils.getString(this.f21410a, "privacy_icon_url", (String) null);
        if (URLUtil.isValidUrl(string)) {
            this.f21420n = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f21410a, "privacy_url", (String) null);
        if (URLUtil.isValidUrl(string2)) {
            this.f21421o = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f21410a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            C8626v vVar5 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar6 = this.f21120d;
                String str9 = this.f21119c;
                vVar6.mo57822e(str9, "No oRtb response provided: " + this.f21410a);
            }
            m25720b();
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", (String) null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
        C8626v vVar7 = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar8 = this.f21120d;
            String str10 = this.f21119c;
            vVar8.mo57818b(str10, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        m25718a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", (JSONArray) null);
        if (jSONArray == null || jSONArray.length() == 0) {
            C8626v vVar9 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar10 = this.f21120d;
                String str11 = this.f21119c;
                vVar10.mo57822e(str11, "Unable to retrieve assets - failing ad load: " + this.f21410a);
            }
            m25720b();
            return;
        }
        String str12 = "";
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) r2);
            if (jSONObject4.has("title")) {
                this.f21413g = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r2), "text", r2);
                C8626v vVar11 = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar12 = this.f21120d;
                    String str13 = this.f21119c;
                    vVar12.mo57818b(str13, "Processed title: " + this.f21413g);
                }
            } else if (jSONObject4.has("link")) {
                m25718a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r2));
            } else {
                if (jSONObject4.has("img")) {
                    int i2 = JsonUtils.getInt(jSONObject4, "id", -1);
                    JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r2);
                    int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                    String string4 = JsonUtils.getString(jSONObject5, "url", r2);
                    if (i3 == 1 || 3 == i2) {
                        this.f21417k = Uri.parse(string4);
                        C8626v vVar13 = this.f21120d;
                        if (C8626v.m26252a()) {
                            vVar2 = this.f21120d;
                            str4 = this.f21119c;
                            sb2 = new StringBuilder();
                            sb2.append("Processed icon URL: ");
                            uri = this.f21417k;
                        }
                    } else if (i3 == 3 || 2 == i2) {
                        this.f21418l = Uri.parse(string4);
                        C8626v vVar14 = this.f21120d;
                        if (C8626v.m26252a()) {
                            vVar2 = this.f21120d;
                            str4 = this.f21119c;
                            sb2 = new StringBuilder();
                            sb2.append("Processed main image URL: ");
                            uri = this.f21418l;
                        }
                    } else {
                        C8626v vVar15 = this.f21120d;
                        if (C8626v.m26252a()) {
                            C8626v vVar16 = this.f21120d;
                            String str14 = this.f21119c;
                            vVar16.mo57821d(str14, "Unrecognized image: " + jSONObject4);
                        }
                        int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                        int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                        if (i4 <= 0 || i5 <= 0) {
                            C8626v vVar17 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar4 = this.f21120d;
                                str6 = this.f21119c;
                                sb5 = "Skipping...";
                            }
                        } else {
                            int i6 = (((double) (((float) i4) / ((float) i5))) > 1.0d ? 1 : (((double) (((float) i4) / ((float) i5))) == 1.0d ? 0 : -1));
                            C8626v vVar18 = this.f21120d;
                            boolean a = C8626v.m26252a();
                            if (i6 > 0) {
                                if (a) {
                                    C8626v vVar19 = this.f21120d;
                                    String str15 = this.f21119c;
                                    vVar19.mo57818b(str15, "Inferring main image from " + i4 + "x" + i5 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.f21418l = Uri.parse(string4);
                            } else {
                                if (a) {
                                    C8626v vVar20 = this.f21120d;
                                    String str16 = this.f21119c;
                                    vVar20.mo57818b(str16, "Inferring icon image from " + i4 + "x" + i5 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.f21417k = Uri.parse(string4);
                            }
                        }
                    }
                    sb2.append(uri);
                    str8 = sb2.toString();
                    vVar2.mo57818b(str4, str8);
                } else {
                    if (jSONObject4.has("video")) {
                        str12 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", (String) null);
                        if (StringUtils.isValidString(str12)) {
                            C8626v vVar21 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar2 = this.f21120d;
                                str4 = this.f21119c;
                                str8 = "Processed VAST video";
                                vVar2.mo57818b(str4, str8);
                            }
                        } else {
                            C8626v vVar22 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar4 = this.f21120d;
                                str6 = this.f21119c;
                                sb4 = new StringBuilder();
                                str7 = "Ignoring invalid \"vasttag\" for video: ";
                            }
                        }
                    } else if (jSONObject4.has(C8849c.DATA)) {
                        int i7 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, C8849c.DATA, (JSONObject) null);
                        int i8 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string5 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null);
                        if (i8 == 1 || i7 == 8) {
                            this.f21414h = string5;
                            C8626v vVar23 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar3 = this.f21120d;
                                str5 = this.f21119c;
                                sb3 = new StringBuilder();
                                sb3.append("Processed advertiser: ");
                                str3 = this.f21414h;
                            }
                        } else if (i8 == 2 || i7 == 4) {
                            this.f21415i = string5;
                            C8626v vVar24 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar3 = this.f21120d;
                                str5 = this.f21119c;
                                sb3 = new StringBuilder();
                                sb3.append("Processed body: ");
                                str3 = this.f21415i;
                            }
                        } else if (i8 == 12 || i7 == 5) {
                            this.f21416j = string5;
                            C8626v vVar25 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar3 = this.f21120d;
                                str5 = this.f21119c;
                                sb3 = new StringBuilder();
                                sb3.append("Processed cta: ");
                                str3 = this.f21416j;
                            }
                        } else {
                            C8626v vVar26 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar4 = this.f21120d;
                                str6 = this.f21119c;
                                sb4 = new StringBuilder();
                                str7 = "Skipping unsupported data: ";
                            }
                        }
                        sb2.append(str3);
                        str8 = sb2.toString();
                        vVar2.mo57818b(str4, str8);
                    } else {
                        C8626v vVar27 = this.f21120d;
                        if (C8626v.m26252a()) {
                            C8626v vVar28 = this.f21120d;
                            String str17 = this.f21119c;
                            vVar28.mo57822e(str17, "Unsupported asset object: " + jSONObject4);
                        }
                    }
                    sb4.append(str7);
                    sb4.append(jSONObject4);
                    sb5 = sb4.toString();
                }
                vVar4.mo57821d(str6, sb5);
            }
            i++;
            r2 = 0;
        }
        String string6 = JsonUtils.getString(jSONObject3, "jstracker", (String) null);
        if (StringUtils.isValidString(string6)) {
            this.f21425s = string6;
            C8626v vVar29 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar30 = this.f21120d;
                String str18 = this.f21119c;
                vVar30.mo57818b(str18, "Processed jstracker: " + string6);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", (JSONArray) null);
        if (jSONArray2 != null) {
            int i9 = 0;
            while (i9 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i9, obj);
                if (objectAtIndex instanceof String) {
                    String str19 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str19)) {
                        this.f21426t.add(new C8536i.C8537a(this.f21118b).mo57528a(str19).mo57540d(false).mo57539c(false).mo57532a());
                        C8626v vVar31 = this.f21120d;
                        if (C8626v.m26252a()) {
                            C8626v vVar32 = this.f21120d;
                            String str20 = this.f21119c;
                            vVar32.mo57818b(str20, "Processed imptracker URL: " + str19);
                        }
                    }
                }
                i9++;
                obj = null;
            }
        }
        ? r22 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", (JSONArray) null);
        if (jSONArray3 != null) {
            int i10 = 0;
            while (i10 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i10, (JSONObject) r22);
                int i11 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i12 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string7 = JsonUtils.getString(jSONObject7, "url", r22);
                if (!TextUtils.isEmpty(string7)) {
                    if (i12 == 1 || i12 == 2) {
                        C8536i b = new C8536i.C8537a(this.f21118b).mo57528a(string7).mo57540d(false).mo57539c(false).mo57623g(i12 == 2).mo57532a();
                        if (i11 == 1) {
                            this.f21426t.add(b);
                            C8626v vVar33 = this.f21120d;
                            if (C8626v.m26252a()) {
                                C8626v vVar34 = this.f21120d;
                                String str21 = this.f21119c;
                                vVar34.mo57818b(str21, "Processed impression URL: " + string7);
                            }
                        } else {
                            if (i11 == 2) {
                                this.f21427u.add(b);
                                C8626v vVar35 = this.f21120d;
                                if (C8626v.m26252a()) {
                                    vVar = this.f21120d;
                                    str = this.f21119c;
                                    sb = new StringBuilder();
                                    str2 = "Processed viewable MRC50 URL: ";
                                }
                            } else if (i11 == 3) {
                                this.f21428v.add(b);
                                C8626v vVar36 = this.f21120d;
                                if (C8626v.m26252a()) {
                                    vVar = this.f21120d;
                                    str = this.f21119c;
                                    sb = new StringBuilder();
                                    str2 = "Processed viewable MRC100 URL: ";
                                }
                            } else {
                                if (i11 == 4) {
                                    this.f21429w.add(b);
                                    C8626v vVar37 = this.f21120d;
                                    if (C8626v.m26252a()) {
                                        C8626v vVar38 = this.f21120d;
                                        String str22 = this.f21119c;
                                        vVar38.mo57818b(str22, "Processed viewable video 50 URL: " + string7);
                                    }
                                } else if (i11 == 555) {
                                    C8626v vVar39 = this.f21120d;
                                    if (C8626v.m26252a()) {
                                        C8626v vVar40 = this.f21120d;
                                        String str23 = this.f21119c;
                                        vVar40.mo57818b(str23, "Ignoring processing of OMID URL: " + string7);
                                    }
                                } else {
                                    C8626v vVar41 = this.f21120d;
                                    if (C8626v.m26252a()) {
                                        C8626v vVar42 = this.f21120d;
                                        String str24 = this.f21119c;
                                        vVar42.mo57822e(str24, "Unsupported event tracker: " + jSONObject7);
                                    }
                                }
                                i10++;
                                r22 = 0;
                            }
                            sb.append(str2);
                            sb.append(string7);
                            vVar.mo57818b(str, sb.toString());
                        }
                        i10++;
                        r22 = 0;
                    } else {
                        C8626v vVar43 = this.f21120d;
                        if (C8626v.m26252a()) {
                            C8626v vVar44 = this.f21120d;
                            String str25 = this.f21119c;
                            vVar44.mo57822e(str25, "Unsupported method for event tracker: " + jSONObject7);
                        }
                    }
                }
                i10++;
                r22 = 0;
            }
        }
        if (StringUtils.isValidString(str12)) {
            C8626v vVar45 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Processing VAST video...");
            }
            this.f21118b.mo57337V().mo57227a((C8401a) C8442r.m25442a(str12, JsonUtils.shallowCopy(this.f21410a), JsonUtils.shallowCopy(this.f21411e), C8346b.UNKNOWN, this, this.f21118b));
            return;
        }
        m25717a();
    }
}
