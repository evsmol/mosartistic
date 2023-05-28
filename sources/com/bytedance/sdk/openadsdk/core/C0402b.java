package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.appnext.base.p264b.C8849c;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0451c;
import com.bytedance.sdk.openadsdk.core.p021e.C0452d;
import com.bytedance.sdk.openadsdk.core.p021e.C0454f;
import com.bytedance.sdk.openadsdk.core.p021e.C0458h;
import com.bytedance.sdk.openadsdk.core.p021e.C0459i;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0476m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0525b;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0794a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.bytedance.sdk.openadsdk.core.b */
/* compiled from: AdInfoFactory */
public class C0402b {
    /* renamed from: a */
    private static int m1630a(C10187b bVar, boolean z) {
        if (bVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(bVar.mo62923i())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(bVar.mo62921h())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    /* renamed from: a */
    private static int m1631a(C0451c cVar) {
        if (cVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(cVar.mo1213a())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        return 200;
    }

    /* renamed from: a */
    private static int m1632a(C0458h hVar) {
        if (hVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(hVar.mo1256a())) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(hVar.mo1259b())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (hVar.mo1261c() == 1 || hVar.mo1261c() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r0 != 50) goto L_0x00b1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m1633a(com.bytedance.sdk.openadsdk.core.p021e.C0477n r6) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r6.mo1345Y()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = r6.mo1345Y()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L_0x001e
            goto L_0x00b2
        L_0x001e:
            com.bytedance.sdk.openadsdk.core.e.h r1 = r6.mo1381ab()
            int r1 = m1632a((com.bytedance.sdk.openadsdk.core.p021e.C0458h) r1)
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x002b
            return r1
        L_0x002b:
            boolean r3 = r6.mo1404ay()
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r6.mo1405az()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x004a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
            r2 = 0
            java.lang.String r3 = "banner_ad"
            java.lang.String r4 = "load_html_fail"
            com.bytedance.sdk.openadsdk.p000b.C0136e.m622b((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r6, (java.lang.String) r3, (java.lang.String) r4, (org.json.JSONObject) r2)
            return r0
        L_0x004a:
            int r0 = r6.mo1332L()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x0063
            if (r0 == r3) goto L_0x0058
            goto L_0x0078
        L_0x0058:
            com.bytedance.sdk.openadsdk.core.e.c r0 = r6.mo1380aa()
            int r1 = m1631a((com.bytedance.sdk.openadsdk.core.p021e.C0451c) r0)
            if (r1 == r2) goto L_0x0078
            return r1
        L_0x0063:
            boolean r0 = m1643b((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r6)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r6.mo1335O()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0078
            r6 = 406(0x196, float:5.69E-43)
            return r6
        L_0x0078:
            boolean r0 = r6.mo1402aw()
            if (r0 != 0) goto L_0x00b1
            int r0 = r6.mo1383ad()
            if (r0 == r5) goto L_0x00a7
            if (r0 == r4) goto L_0x00a7
            if (r0 == r3) goto L_0x00a7
            r3 = 5
            if (r0 == r3) goto L_0x0098
            r3 = 15
            if (r0 == r3) goto L_0x0098
            r3 = 16
            if (r0 == r3) goto L_0x00a7
            r3 = 50
            if (r0 == r3) goto L_0x0098
            goto L_0x00b1
        L_0x0098:
            com.bykv.vk.openvk.component.video.api.c.b r0 = r6.mo1330J()
            boolean r6 = r6.mo1402aw()
            int r1 = m1630a((com.bykv.p271vk.openvk.component.video.api.p288c.C10187b) r0, (boolean) r6)
            if (r1 == r2) goto L_0x00b1
            return r1
        L_0x00a7:
            java.util.List r6 = r6.mo1336P()
            int r1 = m1634a((java.util.List<com.bytedance.sdk.openadsdk.core.p021e.C0463k>) r6)
            if (r1 == r2) goto L_0x00b1
        L_0x00b1:
            return r1
        L_0x00b2:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0402b.m1633a(com.bytedance.sdk.openadsdk.core.e.n):int");
    }

    /* renamed from: a */
    private static int m1634a(List<C0463k> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (C0463k next : list) {
            if (next == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(next.mo1281a())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    /* renamed from: a */
    public static Pair<C0448a, ArrayList<Integer>> m1635a(JSONObject jSONObject, AdSlot adSlot, C0479o oVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C0448a aVar = new C0448a();
            aVar.mo1198a(jSONObject.optString("request_id"));
            aVar.mo1195a(jSONObject.optInt("ret"));
            aVar.mo1200b(jSONObject.optString("message"));
            String optString = jSONObject.optString("auction_price");
            if (aVar.mo1194a() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0477n b = m1642b(optJSONArray.optJSONObject(i), adSlot, oVar);
                    int a = m1633a(b);
                    if (a != 200) {
                        arrayList.add(Integer.valueOf(a));
                    } else {
                        b.mo1417c(optString);
                        aVar.mo1197a(b);
                    }
                }
            }
            return new Pair<>(aVar, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C0477n m1636a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return m1642b(jSONObject, (AdSlot) null, (C0479o) null);
    }

    /* renamed from: a */
    private static C0518a m1637a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c = C1002v.m4740c(C0558m.m2663a());
        int d = C1002v.m4744d(C0558m.m2663a());
        if (i == 2) {
            int i2 = d;
            d = c;
            c = i2;
        }
        return new C0523d(C0558m.m2663a(), c, d).mo1748b(str, (List<C0532c>) new ArrayList());
    }

    /* renamed from: a */
    private static void m1638a(C0477n nVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            C0136e.m622b(C0558m.m2663a(), nVar, str, "load_vast_fail", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m1639a(C0477n nVar, String str, C0518a aVar, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "load_vast_fail";
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.mo1744i()) && !TextUtils.isEmpty(aVar.mo1740f())) {
                    if (aVar.mo1743h() > 0.0d) {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, System.currentTimeMillis() - j);
                        str2 = "load_vast_success";
                    }
                }
                jSONObject.put("reason_code", -3);
            } else {
                jSONObject.put("reason_code", -2);
                jSONObject.put("error_code", C0525b.f1977e);
            }
            C0136e.m622b(C0558m.m2663a(), nVar, str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m1640a(C0518a aVar, C0477n nVar) {
        aVar.mo1728a(nVar);
        int L = nVar.mo1332L();
        if (!(L == 2 || L == 3)) {
            nVar.mo1466r(2);
        }
        nVar.mo1421d(1);
        nVar.mo1419c(true);
        nVar.mo1365a(aVar);
        if (!TextUtils.isEmpty(aVar.mo1736d())) {
            nVar.mo1436h(aVar.mo1736d());
        }
        if (!TextUtils.isEmpty(aVar.mo1738e())) {
            nVar.mo1440i(aVar.mo1738e());
        }
        nVar.mo1430f(aVar.mo1740f());
        C0463k kVar = null;
        nVar.mo1356a((C0451c) null);
        C10187b J = nVar.mo1330J();
        if (J == null) {
            J = new C10187b();
        }
        J.mo62909c(aVar.mo1742g());
        J.mo62900a(aVar.mo1743h());
        J.mo62906b((String) null);
        J.mo62912d((String) null);
        nVar.mo1353a(J);
        if (aVar.mo1732b() != null) {
            kVar = new C0463k();
            kVar.mo1283a(aVar.mo1732b().mo1778e());
            kVar.mo1282a(aVar.mo1732b().mo1774b());
            kVar.mo1286b(aVar.mo1732b().mo1776c());
        }
        nVar.mo1361a(kVar);
    }

    /* renamed from: b */
    private static C0452d m1641b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        C0452d dVar = new C0452d();
        dVar.mo1227a(optInt);
        dVar.mo1229b(optInt2);
        return dVar;
    }

    /* renamed from: b */
    public static C0477n m1642b(JSONObject jSONObject, AdSlot adSlot, C0479o oVar) {
        C0518a aVar;
        if (jSONObject == null) {
            return null;
        }
        C0477n nVar = new C0477n();
        nVar.mo1466r(jSONObject.optInt("interaction_type"));
        nVar.mo1430f(jSONObject.optString("target_url"));
        nVar.mo1446k(jSONObject.optString("ad_id"));
        nVar.mo1449l(jSONObject.optString("app_log_url"));
        nVar.mo1426e(jSONObject.optString("source"));
        nVar.mo1474v(jSONObject.optInt("dislike_control", 0));
        nVar.mo1451m(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        nVar.mo1455n(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("set_click_type");
            nVar.mo1407b(optJSONObject.optDouble(IabUtils.KEY_CTA, 2.0d));
            nVar.mo1348a(optJSONObject.optDouble("other", 1.0d));
        }
        nVar.mo1418c(jSONObject.optJSONObject("extension"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("icon");
        nVar.mo1413b(jSONObject.optBoolean("screenshot", false));
        nVar.mo1445k(jSONObject.optInt("play_bar_style", 0));
        nVar.mo1457o(jSONObject.optString("market_url", ""));
        nVar.mo1439i(jSONObject.optInt("video_adaptation", 0));
        nVar.mo1429f(jSONObject.optInt("feed_video_opentype", 0));
        nVar.mo1368a(jSONObject.optJSONObject("session_params"));
        nVar.mo1417c(jSONObject.optString("auction_price", ""));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("render");
        if (optJSONObject3 != null) {
            nVar.mo1432g(optJSONObject3.optInt("render_sequence", 0));
            nVar.mo1435h(optJSONObject3.optInt("backup_render_control", 1));
        }
        nVar.mo1421d(jSONObject.optInt("render_control", oVar != null ? oVar.f1731f : 1));
        if (optJSONObject2 != null) {
            C0463k kVar = new C0463k();
            kVar.mo1283a(optJSONObject2.optString("url"));
            kVar.mo1286b(optJSONObject2.optInt(IabUtils.KEY_HEIGHT));
            kVar.mo1282a(optJSONObject2.optInt(IabUtils.KEY_WIDTH));
            nVar.mo1361a(kVar);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject4 != null) {
            nVar.mo1415c(optJSONObject4.optInt("reward_amount", 0));
            nVar.mo1366a(optJSONObject4.optString("reward_name", ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject5 != null) {
            C0463k kVar2 = new C0463k();
            kVar2.mo1283a(optJSONObject5.optString("url"));
            kVar2.mo1286b(optJSONObject5.optInt(IabUtils.KEY_HEIGHT));
            kVar2.mo1282a(optJSONObject5.optInt(IabUtils.KEY_WIDTH));
            nVar.mo1410b(kVar2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C0463k kVar3 = new C0463k();
                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
                kVar3.mo1283a(optJSONObject6.optString("url"));
                kVar3.mo1286b(optJSONObject6.optInt(IabUtils.KEY_HEIGHT));
                kVar3.mo1282a(optJSONObject6.optInt(IabUtils.KEY_WIDTH));
                kVar3.mo1284a(optJSONObject6.optBoolean("image_preview"));
                kVar3.mo1287b(optJSONObject6.optString("image_key"));
                nVar.mo1416c(kVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                nVar.mo1338R().add(optJSONArray2.optString(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                nVar.mo1339S().add(optJSONArray3.optString(i3));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                nVar.mo1340T().add(optJSONArray4.optString(i4));
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("click_area");
        if (optJSONObject7 != null) {
            C0454f fVar = new C0454f();
            fVar.f1502a = optJSONObject7.optBoolean("click_upper_content_area", true);
            fVar.f1503b = optJSONObject7.optBoolean("click_upper_non_content_area", true);
            fVar.f1504c = optJSONObject7.optBoolean("click_lower_content_area", true);
            fVar.f1505d = optJSONObject7.optBoolean("click_lower_non_content_area", true);
            fVar.f1506e = optJSONObject7.optBoolean("click_button_area", true);
            fVar.f1507f = optJSONObject7.optBoolean("click_video_area", true);
            nVar.mo1358a(fVar);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("adslot");
        if (optJSONObject8 != null) {
            adSlot = m1644c(optJSONObject8);
        }
        nVar.mo1354a(adSlot);
        nVar.mo1448l(jSONObject.optInt("intercept_flag", 0));
        nVar.mo1433g(jSONObject.optString("phone_num"));
        nVar.mo1436h(jSONObject.optString("title"));
        nVar.mo1440i(jSONObject.optString("description"));
        nVar.mo1443j(jSONObject.optString("button_text"));
        nVar.mo1442j(jSONObject.optInt("ad_logo", 1));
        nVar.mo1452m(jSONObject.optString("ext"));
        nVar.mo1460p(jSONObject.optInt("cover_click_area", 0));
        nVar.mo1468s(jSONObject.optInt("image_mode"));
        nVar.mo1472u(jSONObject.optInt("orientation", 1));
        nVar.mo1349a((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        nVar.mo1460p(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject9 = jSONObject.optJSONObject("app");
        JSONObject optJSONObject10 = jSONObject.optJSONObject("deep_link");
        nVar.mo1356a(m1646e(optJSONObject9));
        nVar.mo1362a(m1647f(jSONObject.optJSONObject("interaction_method_params")));
        nVar.mo1359a(m1649h(optJSONObject10));
        nVar.mo1364a(new C0480p(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                FilterWord d = m1645d(optJSONArray5.optJSONObject(i5));
                if (d != null && d.isValid()) {
                    nVar.mo1355a(d);
                }
            }
        }
        nVar.mo1470t(jSONObject.optInt("count_down"));
        nVar.mo1352a(jSONObject.optLong("expiration_time"));
        nVar.mo1321B(jSONObject.optInt("video_encode_type", 0));
        nVar.mo1319A(jSONObject.optInt("player_type", 0));
        JSONObject optJSONObject11 = jSONObject.optJSONObject("video");
        if (optJSONObject11 != null) {
            nVar.mo1353a(m1650i(optJSONObject11));
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject12 != null) {
            nVar.mo1409b(m1650i(optJSONObject12));
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject13 != null) {
            nVar.mo1360a(m1648g(optJSONObject13));
        }
        nVar.mo1367a(m1651j(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject14 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject14 != null) {
            C0477n.C0478a aVar2 = new C0477n.C0478a();
            aVar2.mo1486b(optJSONObject14.optString("id"));
            aVar2.mo1488c(optJSONObject14.optString("md5"));
            aVar2.mo1490d(optJSONObject14.optString("url"));
            aVar2.mo1492e(optJSONObject14.optString(C8849c.DATA));
            aVar2.mo1494f(optJSONObject14.optString("diff_data"));
            aVar2.mo1496g(optJSONObject14.optString("dynamic_creative"));
            aVar2.mo1484a(optJSONObject14.optString("version"));
            nVar.mo1363a(aVar2);
        }
        nVar.mo1422d(jSONObject.optString("creative_extra"));
        nVar.mo1425e(jSONObject.optInt("if_block_lp", 0));
        nVar.mo1454n(jSONObject.optInt("cache_sort", 1));
        nVar.mo1456o(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject15 != null) {
            nVar.mo1357a(m1641b(optJSONObject15));
        }
        nVar.mo1476w(jSONObject.optInt("is_package_open", 1));
        nVar.mo1411b(jSONObject.optString("ad_info", (String) null));
        nVar.mo1463q(jSONObject.optInt("ua_policy", 2));
        nVar.mo1478x(jSONObject.optInt("playable_duration_time", 20));
        nVar.mo1480y(jSONObject.optInt("playable_endcard_close_time", -1));
        nVar.mo1482z(jSONObject.optInt("endcard_close_time", -1));
        nVar.mo1350a(jSONObject.optInt("interaction_method"));
        nVar.mo1423d(jSONObject.optBoolean("is_html"));
        nVar.mo1461p(jSONObject.optString("dsp_html"));
        if (jSONObject.optBoolean("is_vast", false)) {
            if (jSONObject.has("vast_json")) {
                aVar = C0518a.m2481a(jSONObject.optJSONObject("vast_json"));
            } else {
                String b = C0996u.m4632b(C0996u.m4653e(nVar));
                String optString = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString)) {
                    m1638a(nVar, b);
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                aVar = m1637a(optString, nVar.mo1392am());
                m1639a(nVar, b, aVar, currentTimeMillis);
                if (aVar != null) {
                    aVar.mo1741f(b);
                }
            }
            if (aVar == null) {
                return null;
            }
            m1640a(aVar, nVar);
        }
        return nVar;
    }

    /* renamed from: b */
    private static boolean m1643b(C0477n nVar) {
        return !nVar.mo1402aw() && !nVar.mo1404ay();
    }

    /* renamed from: c */
    private static AdSlot m1644c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("mCodeId", "");
        int optInt = jSONObject2.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject2.optInt("mImgAcceptedHeight", 0);
        int optInt3 = jSONObject2.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject2.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject2.optString("mRewardName", "");
        int optInt4 = jSONObject2.optInt("mRewardAmount", 0);
        String optString3 = jSONObject2.optString("mMediaExtra", "");
        String optString4 = jSONObject2.optString("mUserID", "");
        jSONObject2.optInt("mOrientation", 2);
        int optInt5 = jSONObject2.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject2.optBoolean("mIsExpressAd", false);
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize((float) jSONObject2.optDouble("mExpressViewAcceptedWidth", 0.0d), (float) jSONObject2.optDouble("mExpressViewAcceptedHeight", 0.0d)).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(jSONObject2.optBoolean("mIsAutoPlay", false)).isExpressAd(optBoolean2).withBid(jSONObject2.optString("mBidAdm", "")).build();
    }

    /* renamed from: d */
    private static FilterWord m1645d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord d = m1645d(optJSONArray.optJSONObject(i));
                    if (d != null && d.isValid()) {
                        filterWord.addOption(d);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static C0451c m1646e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0451c cVar = new C0451c();
        cVar.mo1219b(jSONObject.optString("app_name"));
        cVar.mo1221c(jSONObject.optString("package_name"));
        cVar.mo1216a(jSONObject.optString("download_url"));
        cVar.mo1214a(jSONObject.optDouble("score", -1.0d));
        cVar.mo1215a(jSONObject.optInt("comment_num", -1));
        cVar.mo1218b(jSONObject.optInt("app_size", 0));
        return cVar;
    }

    /* renamed from: f */
    private static C0476m m1647f(JSONObject jSONObject) {
        C0476m mVar = new C0476m();
        if (jSONObject == null) {
            mVar.mo1313a(10);
            mVar.mo1316b(20);
            mVar.mo1314a("");
            return mVar;
        }
        mVar.mo1313a(jSONObject.optLong("onlylp_loading_maxtime", 10));
        mVar.mo1316b(jSONObject.optLong("straight_lp_showtime", 20));
        mVar.mo1314a(jSONObject.optString("loading_text", ""));
        return mVar;
    }

    /* renamed from: g */
    private static C0459i m1648g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0459i iVar = new C0459i();
        iVar.mo1263a(jSONObject.optInt("if_send_click", 0));
        return iVar;
    }

    /* renamed from: h */
    private static C0458h m1649h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0458h hVar = new C0458h();
        hVar.mo1258a(jSONObject.optString("deeplink_url"));
        hVar.mo1260b(jSONObject.optString("fallback_url"));
        hVar.mo1257a(jSONObject.optInt("fallback_type"));
        return hVar;
    }

    /* renamed from: i */
    private static C10187b m1650i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C10187b bVar = new C10187b();
        bVar.mo62905b(jSONObject.optInt("cover_height"));
        bVar.mo62908c(jSONObject.optInt("cover_width"));
        bVar.mo62903a(jSONObject.optString("resolution"));
        bVar.mo62902a(jSONObject.optLong("size"));
        bVar.mo62900a(jSONObject.optDouble("video_duration", 0.0d));
        bVar.mo62906b(jSONObject.optString("cover_url"));
        bVar.mo62909c(jSONObject.optString("video_url"));
        bVar.mo62912d(jSONObject.optString("endcard"));
        bVar.mo62915e(jSONObject.optString("playable_download_url"));
        bVar.mo62918f(jSONObject.optString("file_hash"));
        int i = 0;
        bVar.mo62922h(jSONObject.optInt("if_playable_loading_show", 0));
        bVar.mo62924i(jSONObject.optInt("remove_loading_page_type", 0));
        bVar.mo62901a(jSONObject.optInt("fallback_endcard_judge", 0));
        bVar.mo62914e(jSONObject.optInt("video_preload_size", 307200));
        bVar.mo62917f(jSONObject.optInt("reward_video_cached_type", 0));
        bVar.mo62920g(jSONObject.optInt("execute_cached_type", 0));
        if (jSONObject.optDouble("endcard_render", 0.0d) == 1.0d) {
            i = 1;
        }
        bVar.mo62911d(i);
        return bVar;
    }

    /* renamed from: j */
    private static Map<String, Object> m1651j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.b$a */
    /* compiled from: AdInfoFactory */
    static class C0403a {
        C0403a() {
        }

        /* renamed from: a */
        public static C0403a m1652a() {
            return new C0403a();
        }

        /* renamed from: a */
        public C0403a mo1085a(boolean z) {
            if (z) {
                m1653a((int) C5643c.COLLECT_MODE_FINANCE);
            }
            return this;
        }

        /* renamed from: b */
        public C0403a mo1086b(boolean z) {
            if (z) {
                m1653a(301);
            }
            return this;
        }

        /* renamed from: c */
        public C0403a mo1087c(boolean z) {
            if (z) {
                m1653a((int) IronSourceConstants.OFFERWALL_AVAILABLE);
            }
            return this;
        }

        /* renamed from: d */
        public C0403a mo1088d(boolean z) {
            if (z) {
                m1653a(303);
            }
            return this;
        }

        /* renamed from: e */
        public C0403a mo1089e(boolean z) {
            if (z) {
                m1653a(304);
            }
            return this;
        }

        /* renamed from: f */
        public C0403a mo1090f(boolean z) {
            if (z) {
                m1653a((int) IronSourceConstants.OFFERWALL_OPENED);
            }
            return this;
        }

        /* renamed from: a */
        private void m1653a(final int i) {
            C0558m.m2674i().mo2622a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return C0795b.m3955b().mo2579a("creative_error").mo2580b(i).mo2581b(C0492g.m2255b(i));
                }
            });
        }

        /* renamed from: a */
        public static void m1654a(C0448a aVar) {
            if (aVar != null && aVar.mo1199b() != null && !aVar.mo1199b().isEmpty()) {
                for (C0477n next : aVar.mo1199b()) {
                    boolean z = false;
                    C0403a d = m1652a().mo1085a(TextUtils.isEmpty(next.mo1341U())).mo1086b(TextUtils.isEmpty(next.mo1342V())).mo1087c(TextUtils.isEmpty(next.mo1344X())).mo1090f(next.mo1333M() == null || TextUtils.isEmpty(next.mo1333M().mo1281a())).mo1088d(next.mo1380aa() == null || next.mo1380aa().mo1222d() == -1.0d || m1655a(next));
                    if (next.mo1380aa() == null || next.mo1380aa().mo1223e() == -1 || m1656b(next)) {
                        z = true;
                    }
                    d.mo1089e(z);
                }
            }
        }

        /* renamed from: a */
        public static boolean m1655a(C0477n nVar) {
            try {
                double optDouble = new JSONObject(nVar.mo1327G().mo1495g()).optDouble("score_exact_i18n", -1.0d);
                return optDouble < 0.0d || optDouble > 5.0d;
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        public static boolean m1656b(C0477n nVar) {
            try {
                return new JSONObject(nVar.mo1327G().mo1495g()).optInt("comment_num_i18n", -1) < 0;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
