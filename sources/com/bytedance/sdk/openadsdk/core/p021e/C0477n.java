package com.bytedance.sdk.openadsdk.core.p021e;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.appnext.base.p264b.C8849c;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10280c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.p331b.C10660a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.n */
/* compiled from: MaterialMeta */
public class C0477n {

    /* renamed from: A */
    private int f1641A = 0;

    /* renamed from: B */
    private long f1642B;

    /* renamed from: C */
    private int f1643C;

    /* renamed from: D */
    private int f1644D;

    /* renamed from: E */
    private C10187b f1645E;

    /* renamed from: F */
    private C10187b f1646F;

    /* renamed from: G */
    private boolean f1647G;

    /* renamed from: H */
    private int f1648H;

    /* renamed from: I */
    private Map<String, Object> f1649I;

    /* renamed from: J */
    private C0478a f1650J;

    /* renamed from: K */
    private String f1651K;

    /* renamed from: L */
    private JSONObject f1652L;

    /* renamed from: M */
    private int f1653M = 0;

    /* renamed from: N */
    private int f1654N = 1;

    /* renamed from: O */
    private String f1655O = "";

    /* renamed from: P */
    private C0454f f1656P = new C0454f();

    /* renamed from: Q */
    private int f1657Q = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;

    /* renamed from: R */
    private int f1658R = 0;

    /* renamed from: S */
    private AdSlot f1659S;

    /* renamed from: T */
    private int f1660T;

    /* renamed from: U */
    private int f1661U = 1;

    /* renamed from: V */
    private String f1662V;

    /* renamed from: W */
    private int f1663W = 0;

    /* renamed from: X */
    private int f1664X = 0;

    /* renamed from: Y */
    private int f1665Y = 0;

    /* renamed from: Z */
    private JSONObject f1666Z;

    /* renamed from: a */
    public boolean f1667a = false;

    /* renamed from: aa */
    private int f1668aa = 1;

    /* renamed from: ab */
    private int f1669ab;

    /* renamed from: ac */
    private String f1670ac;

    /* renamed from: ad */
    private String f1671ad;

    /* renamed from: ae */
    private C0459i f1672ae;

    /* renamed from: af */
    private int f1673af = 1;

    /* renamed from: ag */
    private float f1674ag = 100.0f;

    /* renamed from: ah */
    private String f1675ah;

    /* renamed from: ai */
    private int f1676ai;

    /* renamed from: aj */
    private int f1677aj;

    /* renamed from: ak */
    private int f1678ak;

    /* renamed from: al */
    private int f1679al;

    /* renamed from: am */
    private int f1680am = 2;

    /* renamed from: an */
    private int f1681an = 1;

    /* renamed from: ao */
    private int f1682ao = 0;

    /* renamed from: ap */
    private int f1683ap;

    /* renamed from: aq */
    private C0476m f1684aq;

    /* renamed from: ar */
    private C0480p f1685ar;

    /* renamed from: as */
    private boolean f1686as;

    /* renamed from: at */
    private C0518a f1687at;

    /* renamed from: au */
    private boolean f1688au;

    /* renamed from: av */
    private String f1689av;

    /* renamed from: aw */
    private JSONObject f1690aw;

    /* renamed from: ax */
    private int f1691ax = 0;

    /* renamed from: ay */
    private String f1692ay;

    /* renamed from: az */
    private C0452d f1693az;

    /* renamed from: b */
    private int f1694b;

    /* renamed from: c */
    private int f1695c;

    /* renamed from: d */
    private int f1696d;

    /* renamed from: e */
    private C0463k f1697e;

    /* renamed from: f */
    private C0463k f1698f;

    /* renamed from: g */
    private String f1699g;

    /* renamed from: h */
    private List<C0463k> f1700h = new ArrayList();

    /* renamed from: i */
    private String f1701i;

    /* renamed from: j */
    private List<String> f1702j = new ArrayList();

    /* renamed from: k */
    private List<String> f1703k = new ArrayList();

    /* renamed from: l */
    private List<String> f1704l = new ArrayList();

    /* renamed from: m */
    private String f1705m;

    /* renamed from: n */
    private String f1706n;

    /* renamed from: o */
    private String f1707o;

    /* renamed from: p */
    private String f1708p = BuildConfig.ADAPTER_VERSION;

    /* renamed from: q */
    private C0451c f1709q;

    /* renamed from: r */
    private C0458h f1710r;

    /* renamed from: s */
    private int f1711s;

    /* renamed from: t */
    private String f1712t;

    /* renamed from: u */
    private String f1713u;

    /* renamed from: v */
    private String f1714v;

    /* renamed from: w */
    private String f1715w = "";

    /* renamed from: x */
    private int f1716x = 0;

    /* renamed from: y */
    private int f1717y = 2;

    /* renamed from: z */
    private List<FilterWord> f1718z = new ArrayList();

    /* renamed from: a */
    public static C10188c m2007a(String str, C0477n nVar) {
        C0996u.m4617a(nVar);
        nVar.mo1319A(0);
        nVar.mo1321B(0);
        return new C10188c(str, nVar.mo1330J(), nVar.mo1375aF(), nVar.mo1373aD(), nVar.mo1374aE());
    }

    /* renamed from: a */
    public static boolean m2008a(C0477n nVar) {
        return (nVar == null || nVar.mo1330J() == null || nVar.mo1330J().mo62910d() == 0) ? false : true;
    }

    /* renamed from: a */
    public static boolean m2009a(C0477n nVar, boolean z, boolean z2, boolean z3) {
        C10187b bVar;
        C10187b bVar2;
        if (m2008a(nVar) || z3 || nVar == null || (bVar = nVar.f1645E) == null || TextUtils.isEmpty(bVar.mo62925j())) {
            return false;
        }
        if (nVar == null || (bVar2 = nVar.f1645E) == null || bVar2.mo62899a() != 1) {
            C10638l.m31235b("MaterialMeta", "can show end card follow js WebViewClient");
            return z;
        }
        C10638l.m31235b("MaterialMeta", "can show end card follow js");
        return z2;
    }

    /* renamed from: b */
    private JSONObject m2010b(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord b : filterWord.getOptions()) {
                        jSONArray.put(m2010b(b));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r2.f1645E;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2011b(com.bytedance.sdk.openadsdk.core.p021e.C0477n r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0010
            com.bykv.vk.openvk.component.video.api.c.b r2 = r2.f1645E
            if (r2 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            int r2 = r2.mo62899a()
            r1 = 1
            if (r2 != r1) goto L_0x0010
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p021e.C0477n.m2011b(com.bytedance.sdk.openadsdk.core.e.n):boolean");
    }

    /* renamed from: c */
    public static boolean m2012c(C0477n nVar) {
        if (nVar == null) {
            return false;
        }
        return nVar.mo1402aw() || nVar.mo1383ad() == 5 || nVar.mo1383ad() == 15 || nVar.mo1383ad() == 50;
    }

    /* renamed from: A */
    public int mo1318A() {
        return this.f1668aa;
    }

    /* renamed from: A */
    public void mo1319A(int i) {
        this.f1682ao = i;
    }

    /* renamed from: B */
    public int mo1320B() {
        return this.f1669ab;
    }

    /* renamed from: B */
    public void mo1321B(int i) {
        this.f1683ap = i;
    }

    /* renamed from: C */
    public int mo1322C() {
        return this.f1644D;
    }

    /* renamed from: C */
    public void mo1323C(int i) {
        this.f1691ax = i;
    }

    /* renamed from: D */
    public String mo1324D() {
        return this.f1651K;
    }

    /* renamed from: E */
    public boolean mo1325E() {
        return mo1322C() == 100;
    }

    /* renamed from: F */
    public int mo1326F() {
        return this.f1648H;
    }

    /* renamed from: G */
    public C0478a mo1327G() {
        return this.f1650J;
    }

    /* renamed from: H */
    public C10280c mo1328H() {
        if (mo1327G() == null) {
            return null;
        }
        String b = mo1327G().mo1485b();
        String d = mo1327G().mo1489d();
        String c = mo1327G().mo1487c();
        String e = mo1327G().mo1491e();
        String a = mo1327G().mo1483a();
        int f = C0996u.m4657f(this);
        C10280c e2 = C10280c.m29580a().mo63154a(b).mo63155b(c).mo63156c(d).mo63157d(e).mo63158e(a);
        return e2.mo63159f(f + "");
    }

    /* renamed from: I */
    public int mo1329I() {
        C0459i iVar = this.f1672ae;
        if (iVar == null) {
            return 0;
        }
        return iVar.mo1262a();
    }

    /* renamed from: J */
    public C10187b mo1330J() {
        return this.f1645E;
    }

    /* renamed from: K */
    public String mo1331K() {
        return this.f1712t;
    }

    /* renamed from: L */
    public int mo1332L() {
        return this.f1694b;
    }

    /* renamed from: M */
    public C0463k mo1333M() {
        return this.f1697e;
    }

    /* renamed from: N */
    public C0463k mo1334N() {
        return this.f1698f;
    }

    /* renamed from: O */
    public String mo1335O() {
        return this.f1699g;
    }

    /* renamed from: P */
    public List<C0463k> mo1336P() {
        return this.f1700h;
    }

    /* renamed from: Q */
    public String mo1337Q() {
        return this.f1701i;
    }

    /* renamed from: R */
    public List<String> mo1338R() {
        return this.f1702j;
    }

    /* renamed from: S */
    public List<String> mo1339S() {
        return this.f1703k;
    }

    /* renamed from: T */
    public List<String> mo1340T() {
        return this.f1704l;
    }

    /* renamed from: U */
    public String mo1341U() {
        return this.f1705m;
    }

    /* renamed from: V */
    public String mo1342V() {
        return this.f1706n;
    }

    /* renamed from: W */
    public String mo1343W() {
        String str;
        if (!TextUtils.isEmpty(this.f1707o)) {
            return this.f1707o;
        }
        Context a = C0558m.m2663a();
        int L = mo1332L();
        if (L == 2 || L == 3) {
            if (a == null) {
                return this.f1707o;
            }
            str = "tt_video_mobile_go_detail";
        } else if (L != 4) {
            return this.f1707o;
        } else {
            if (a == null) {
                return this.f1707o;
            }
            str = "tt_video_download_apk";
        }
        return C10647t.m31276a(a, str);
    }

    /* renamed from: X */
    public String mo1344X() {
        return this.f1707o;
    }

    /* renamed from: Y */
    public String mo1345Y() {
        return this.f1708p;
    }

    /* renamed from: Z */
    public String mo1346Z() {
        return this.f1713u;
    }

    /* renamed from: a */
    public C0476m mo1347a() {
        return this.f1684aq;
    }

    /* renamed from: a */
    public void mo1348a(double d) {
        this.f1681an = (d == 2.0d || d == 1.0d) ? (int) d : 1;
    }

    /* renamed from: a */
    public void mo1349a(float f) {
        this.f1674ag = f;
    }

    /* renamed from: a */
    public void mo1350a(int i) {
        mo1351a(i, -1);
    }

    /* renamed from: a */
    public void mo1351a(int i, int i2) {
        int i3;
        this.f1696d = i;
        this.f1695c = i;
        if (this.f1659S == null) {
            this.f1695c = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = C0996u.m4653e(this);
        }
        if (this.f1659S.getNativeAdType() == 3 || this.f1659S.getDurationSlotType() == 3 || i2 == 3) {
            i3 = 14;
        } else if (this.f1659S.getNativeAdType() == 7 || this.f1659S.getNativeAdType() == 8 || this.f1659S.getDurationSlotType() == 7 || this.f1659S.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (C0480p.m2198i(this)) {
                i3 = 12;
            } else if (C0480p.m2190a(this)) {
                i3 = 9;
            } else {
                if (this.f1696d == 5 && !C0464l.m1969c(this)) {
                    this.f1695c = 7;
                }
                if (this.f1696d == 6 && !C0464l.m1967b(this)) {
                    this.f1695c = 7;
                }
                if (this.f1696d == 8 && mo1322C() != 100) {
                    this.f1695c = 7;
                }
                if (i < 5) {
                    this.f1695c = 7;
                    return;
                }
                return;
            }
        } else if (C0480p.m2190a(this)) {
            this.f1695c = 4;
            return;
        } else {
            if (this.f1696d == 4 && !C0480p.m2190a(this)) {
                this.f1695c = 0;
            }
            if (i >= 5) {
                this.f1695c = 0;
                return;
            } else if (this.f1696d == 2 && mo1332L() != 3) {
                this.f1695c = 0;
                return;
            } else if (i == 0 || (i == 1 && mo1332L() != 3)) {
                this.f1695c = 0;
                return;
            } else {
                return;
            }
        }
        this.f1695c = i3;
    }

    /* renamed from: a */
    public void mo1352a(long j) {
        this.f1642B = j;
    }

    /* renamed from: a */
    public void mo1353a(C10187b bVar) {
        this.f1645E = bVar;
    }

    /* renamed from: a */
    public void mo1354a(AdSlot adSlot) {
        this.f1659S = adSlot;
    }

    /* renamed from: a */
    public void mo1355a(FilterWord filterWord) {
        this.f1718z.add(filterWord);
    }

    /* renamed from: a */
    public void mo1356a(C0451c cVar) {
        this.f1709q = cVar;
    }

    /* renamed from: a */
    public void mo1357a(C0452d dVar) {
        this.f1693az = dVar;
    }

    /* renamed from: a */
    public void mo1358a(C0454f fVar) {
        this.f1656P = fVar;
    }

    /* renamed from: a */
    public void mo1359a(C0458h hVar) {
        this.f1710r = hVar;
    }

    /* renamed from: a */
    public void mo1360a(C0459i iVar) {
        this.f1672ae = iVar;
    }

    /* renamed from: a */
    public void mo1361a(C0463k kVar) {
        this.f1697e = kVar;
    }

    /* renamed from: a */
    public void mo1362a(C0476m mVar) {
        this.f1684aq = mVar;
    }

    /* renamed from: a */
    public void mo1363a(C0478a aVar) {
        this.f1650J = aVar;
        C10280c H = mo1328H();
        if (H != null) {
            C10266a.m29493a(H);
        }
    }

    /* renamed from: a */
    public void mo1364a(C0480p pVar) {
        this.f1685ar = pVar;
    }

    /* renamed from: a */
    public void mo1365a(C0518a aVar) {
        this.f1687at = aVar;
    }

    /* renamed from: a */
    public void mo1366a(String str) {
        this.f1715w = str;
    }

    /* renamed from: a */
    public void mo1367a(Map<String, Object> map) {
        this.f1649I = map;
    }

    /* renamed from: a */
    public void mo1368a(JSONObject jSONObject) {
        this.f1666Z = jSONObject;
    }

    /* renamed from: a */
    public void mo1369a(boolean z) {
        this.f1667a = z;
    }

    /* renamed from: aA */
    public int mo1370aA() {
        JSONObject jSONObject = this.f1690aw;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    /* renamed from: aB */
    public JSONObject mo1371aB() {
        return this.f1690aw;
    }

    /* renamed from: aC */
    public C10660a mo1372aC() {
        C10660a aVar = new C10660a();
        aVar.mo64370a(this.f1648H);
        aVar.mo64373b(this.f1708p);
        aVar.mo64371a(mo1382ac());
        return aVar;
    }

    /* renamed from: aD */
    public int mo1373aD() {
        return this.f1682ao;
    }

    /* renamed from: aE */
    public int mo1374aE() {
        return this.f1683ap;
    }

    /* renamed from: aF */
    public C10187b mo1375aF() {
        return this.f1646F;
    }

    /* renamed from: aG */
    public boolean mo1376aG() {
        C10187b bVar = this.f1645E;
        return bVar == null || bVar.mo62932q() != 1;
    }

    /* renamed from: aH */
    public JSONObject mo1377aH() {
        if (this.f1652L == null) {
            try {
                if (!TextUtils.isEmpty(this.f1714v)) {
                    this.f1652L = new JSONObject(this.f1714v);
                }
            } catch (JSONException unused) {
            }
        }
        return this.f1652L;
    }

    /* renamed from: aI */
    public int mo1378aI() {
        return this.f1691ax;
    }

    /* renamed from: aJ */
    public String mo1379aJ() {
        return this.f1692ay;
    }

    /* renamed from: aa */
    public C0451c mo1380aa() {
        return this.f1709q;
    }

    /* renamed from: ab */
    public C0458h mo1381ab() {
        return this.f1710r;
    }

    /* renamed from: ac */
    public String mo1382ac() {
        return this.f1714v;
    }

    /* renamed from: ad */
    public int mo1383ad() {
        return this.f1711s;
    }

    /* renamed from: ae */
    public List<FilterWord> mo1384ae() {
        return this.f1718z;
    }

    /* renamed from: af */
    public String mo1385af() {
        return this.f1671ad;
    }

    /* renamed from: ag */
    public long mo1386ag() {
        return this.f1642B;
    }

    /* renamed from: ah */
    public int mo1387ah() {
        return this.f1643C;
    }

    /* renamed from: ai */
    public boolean mo1388ai() {
        return this.f1647G;
    }

    /* renamed from: aj */
    public Map<String, Object> mo1389aj() {
        return this.f1649I;
    }

    /* renamed from: ak */
    public JSONObject mo1390ak() {
        return this.f1666Z;
    }

    /* renamed from: al */
    public String mo1391al() {
        return this.f1662V;
    }

    /* renamed from: am */
    public int mo1392am() {
        if (this.f1673af != 2) {
            this.f1673af = 1;
        }
        return this.f1673af;
    }

    /* renamed from: an */
    public float mo1393an() {
        if (this.f1674ag <= 0.0f) {
            this.f1674ag = 100.0f;
        }
        return (this.f1674ag * 1000.0f) / 1000.0f;
    }

    /* renamed from: ao */
    public boolean mo1394ao() {
        if (this.f1700h.isEmpty()) {
            return false;
        }
        if (this.f1711s == 4 && this.f1700h.size() < 3) {
            return false;
        }
        for (C0463k e : this.f1700h) {
            if (!e.mo1290e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ap */
    public boolean mo1395ap() {
        return !this.f1686as && mo1396aq() == 1;
    }

    /* renamed from: aq */
    public int mo1396aq() {
        return this.f1641A;
    }

    /* renamed from: ar */
    public JSONObject mo1397ar() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", mo1332L());
            jSONObject.put("interaction_method", mo1431g());
            jSONObject.put("target_url", mo1335O());
            jSONObject.put("app_log_url", mo1346Z());
            jSONObject.put("gecko_id", mo1385af());
            jSONObject.put("extension", mo1371aB());
            jSONObject.put("ad_id", mo1345Y());
            jSONObject.put("source", mo1331K());
            jSONObject.put("screenshot", mo1388ai());
            jSONObject.put("dislike_control", mo1396aq());
            jSONObject.put("play_bar_show_time", mo1481z());
            jSONObject.put("play_bar_style", mo1473v());
            jSONObject.put("if_block_lp", mo1450m());
            jSONObject.put("cache_sort", mo1318A());
            jSONObject.put("if_sp_cache", mo1320B());
            jSONObject.put("render_control", mo1447l());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IabUtils.KEY_CTA, mo1438i());
            jSONObject2.put("other", mo1434h());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reward_name", mo1441j());
            jSONObject3.put("reward_amount", mo1444k());
            jSONObject.put("reward_data", jSONObject3);
            C0463k M = mo1333M();
            if (M != null) {
                if (!TextUtils.isEmpty(M.mo1281a())) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("url", M.mo1281a());
                    jSONObject4.put(IabUtils.KEY_HEIGHT, M.mo1288c());
                    jSONObject4.put(IabUtils.KEY_WIDTH, M.mo1285b());
                    jSONObject.put("icon", jSONObject4);
                }
            }
            C0463k N = mo1334N();
            if (N != null && !TextUtils.isEmpty(N.mo1281a())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", N.mo1281a());
                jSONObject5.put(IabUtils.KEY_HEIGHT, N.mo1288c());
                jSONObject5.put(IabUtils.KEY_WIDTH, N.mo1285b());
                jSONObject.put("cover_image", jSONObject5);
            }
            JSONObject ak = mo1390ak();
            if (ak != null) {
                jSONObject.put("session_params", ak);
            }
            C0454f w = mo1475w();
            if (w != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("click_upper_content_area", w.f1502a);
                jSONObject6.put("click_upper_non_content_area", w.f1503b);
                jSONObject6.put("click_lower_content_area", w.f1504c);
                jSONObject6.put("click_lower_non_content_area", w.f1505d);
                jSONObject6.put("click_button_area", w.f1506e);
                jSONObject6.put("click_video_area", w.f1507f);
                jSONObject.put("click_area", jSONObject6);
            }
            AdSlot x = mo1477x();
            if (x != null) {
                jSONObject.put("adslot", x.toJsonObj());
            }
            List<C0463k> P = mo1336P();
            if (P != null) {
                JSONArray jSONArray = new JSONArray();
                for (C0463k next : P) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("url", next.mo1281a());
                    jSONObject7.put(IabUtils.KEY_HEIGHT, next.mo1288c());
                    jSONObject7.put(IabUtils.KEY_WIDTH, next.mo1285b());
                    jSONObject7.put("image_preview", next.mo1291f());
                    jSONObject7.put("image_key", next.mo1292g());
                    jSONArray.put(jSONObject7);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> R = mo1338R();
            if (R != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String put : R) {
                    jSONArray2.put(put);
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> S = mo1339S();
            if (S != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String put2 : S) {
                    jSONArray3.put(put2);
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> T = mo1340T();
            if (T != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String put3 : T) {
                    jSONArray4.put(put3);
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", mo1337Q());
            jSONObject.put("title", mo1341U());
            jSONObject.put("description", mo1342V());
            jSONObject.put("ext", mo1382ac());
            jSONObject.put("image_mode", mo1383ad());
            jSONObject.put("cover_click_area", mo1322C());
            jSONObject.put("intercept_flag", mo1479y());
            jSONObject.put("button_text", mo1343W());
            jSONObject.put("ad_logo", mo1471u());
            jSONObject.put("video_adaptation", mo1469t());
            jSONObject.put("feed_video_opentype", mo1459p());
            jSONObject.put("orientation", mo1392am());
            jSONObject.put("aspect_ratio", (double) mo1393an());
            C0451c aa = mo1380aa();
            if (aa != null) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("app_name", aa.mo1217b());
                jSONObject8.put("package_name", aa.mo1220c());
                jSONObject8.put("download_url", aa.mo1213a());
                jSONObject8.put("score", aa.mo1222d());
                jSONObject8.put("comment_num", aa.mo1223e());
                jSONObject8.put("app_size", aa.mo1224f());
                jSONObject.put("app", jSONObject8);
            }
            C0458h ab = mo1381ab();
            if (ab != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("deeplink_url", ab.mo1256a());
                jSONObject9.put("fallback_url", ab.mo1259b());
                jSONObject9.put("fallback_type", ab.mo1261c());
                jSONObject.put("deep_link", jSONObject9);
            }
            List<FilterWord> ae = mo1384ae();
            if (ae != null) {
                JSONArray jSONArray5 = new JSONArray();
                for (FilterWord b : ae) {
                    JSONObject b2 = m2010b(b);
                    if (b2 != null) {
                        jSONArray5.put(b2);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            mo1424e().mo1497a(jSONObject);
            jSONObject.put("count_down", mo1387ah());
            jSONObject.put("expiration_time", mo1386ag());
            C10187b J = mo1330J();
            if (J != null) {
                jSONObject.put("video", J.mo62931p());
            }
            C10187b aF = mo1375aF();
            if (aF != null) {
                jSONObject.put("h265_video", aF.mo62931p());
            }
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("if_send_click", mo1329I());
            jSONObject.put("download_conf", jSONObject10);
            if (mo1389aj() != null) {
                JSONObject jSONObject11 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = mo1389aj().entrySet();
                if (entrySet != null && !entrySet.isEmpty()) {
                    for (Map.Entry next2 : entrySet) {
                        jSONObject11.put((String) next2.getKey(), next2.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject11);
            }
            C0478a G = mo1327G();
            if (G != null) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("id", G.mo1485b());
                jSONObject12.put("md5", G.mo1487c());
                jSONObject12.put("url", G.mo1489d());
                jSONObject12.put(C8849c.DATA, G.mo1491e());
                jSONObject12.put("diff_data", G.mo1493f());
                jSONObject12.put("version", G.mo1483a());
                jSONObject12.put("dynamic_creative", G.mo1495g());
                jSONObject.put("tpl_info", jSONObject12);
            }
            jSONObject.put("creative_extra", mo1324D());
            jSONObject.put("market_url", mo1391al());
            jSONObject.put("auction_price", mo1467s());
            jSONObject.put("ad_info", mo1453n());
            jSONObject.put("is_package_open", mo1398as());
            jSONObject.put("playable_duration_time", mo1399at());
            jSONObject.put("playable_endcard_close_time", mo1400au());
            jSONObject.put("endcard_close_time", mo1401av());
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("render_sequence", mo1462q());
            jSONObject13.put("backup_render_control", mo1465r());
            jSONObject.put("render", jSONObject13);
            if (this.f1684aq == null) {
                C0476m mVar = new C0476m();
                this.f1684aq = mVar;
                mVar.mo1314a("");
                this.f1684aq.mo1313a(10);
                this.f1684aq.mo1316b(20);
            }
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("onlylp_loading_maxtime", this.f1684aq.mo1312a());
            jSONObject14.put("straight_lp_showtime", this.f1684aq.mo1315b());
            jSONObject14.put("loading_text", this.f1684aq.mo1317c());
            jSONObject.put("interaction_method_params", jSONObject14);
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("splash_clickarea", mo1414c());
            jSONObject15.put("splash_layout_id", mo1420d());
            jSONObject.put("splash_control", jSONObject15);
            if (this.f1688au) {
                jSONObject.put("is_html", true);
                jSONObject.put("dsp_html", this.f1689av);
            }
            if (this.f1686as) {
                jSONObject.put("is_vast", true);
                jSONObject.put("vast_json", this.f1687at.mo1745j());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: as */
    public int mo1398as() {
        return this.f1676ai;
    }

    /* renamed from: at */
    public int mo1399at() {
        int i = this.f1677aj;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    /* renamed from: au */
    public int mo1400au() {
        return this.f1678ak;
    }

    /* renamed from: av */
    public int mo1401av() {
        return this.f1679al;
    }

    /* renamed from: aw */
    public boolean mo1402aw() {
        return this.f1686as;
    }

    /* renamed from: ax */
    public C0518a mo1403ax() {
        if (this.f1686as) {
            return this.f1687at;
        }
        return null;
    }

    /* renamed from: ay */
    public boolean mo1404ay() {
        return this.f1688au;
    }

    /* renamed from: az */
    public String mo1405az() {
        return this.f1689av;
    }

    /* renamed from: b */
    public C0452d mo1406b() {
        return this.f1693az;
    }

    /* renamed from: b */
    public void mo1407b(double d) {
        this.f1680am = (d == 2.0d || d == 1.0d) ? (int) d : 2;
    }

    /* renamed from: b */
    public void mo1408b(int i) {
        this.f1695c = i;
    }

    /* renamed from: b */
    public void mo1409b(C10187b bVar) {
        this.f1646F = bVar;
    }

    /* renamed from: b */
    public void mo1410b(C0463k kVar) {
        this.f1698f = kVar;
    }

    /* renamed from: b */
    public void mo1411b(String str) {
        this.f1675ah = str;
    }

    /* renamed from: b */
    public void mo1412b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1694b = 4;
            this.f1708p = jSONObject.optString("id");
            this.f1712t = jSONObject.optString("source");
            C0451c cVar = new C0451c();
            this.f1709q = cVar;
            cVar.mo1221c(jSONObject.optString("pkg_name"));
            this.f1709q.mo1219b(jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME));
            this.f1709q.mo1216a(jSONObject.optString("download_url"));
        }
    }

    /* renamed from: b */
    public void mo1413b(boolean z) {
        this.f1647G = z;
    }

    /* renamed from: c */
    public int mo1414c() {
        C0452d dVar = this.f1693az;
        if (dVar == null) {
            return 2;
        }
        return dVar.mo1226a();
    }

    /* renamed from: c */
    public void mo1415c(int i) {
        this.f1716x = i;
    }

    /* renamed from: c */
    public void mo1416c(C0463k kVar) {
        this.f1700h.add(kVar);
    }

    /* renamed from: c */
    public void mo1417c(String str) {
        this.f1670ac = str;
    }

    /* renamed from: c */
    public void mo1418c(JSONObject jSONObject) {
        this.f1690aw = jSONObject;
    }

    /* renamed from: c */
    public void mo1419c(boolean z) {
        this.f1686as = z;
    }

    /* renamed from: d */
    public int mo1420d() {
        C0452d dVar = this.f1693az;
        if (dVar == null) {
            return 1;
        }
        return dVar.mo1228b();
    }

    /* renamed from: d */
    public void mo1421d(int i) {
        this.f1717y = i;
    }

    /* renamed from: d */
    public void mo1422d(String str) {
        this.f1651K = str;
    }

    /* renamed from: d */
    public void mo1423d(boolean z) {
        this.f1688au = z;
    }

    /* renamed from: e */
    public C0480p mo1424e() {
        return this.f1685ar;
    }

    /* renamed from: e */
    public void mo1425e(int i) {
        this.f1663W = i;
    }

    /* renamed from: e */
    public void mo1426e(String str) {
        this.f1712t = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0477n nVar = (C0477n) obj;
        return this.f1708p.equals(nVar.f1708p) && this.f1714v.equals(nVar.f1714v);
    }

    /* renamed from: f */
    public int mo1428f() {
        return this.f1695c;
    }

    /* renamed from: f */
    public void mo1429f(int i) {
        this.f1665Y = i;
    }

    /* renamed from: f */
    public void mo1430f(String str) {
        this.f1699g = str;
    }

    /* renamed from: g */
    public int mo1431g() {
        return this.f1696d;
    }

    /* renamed from: g */
    public void mo1432g(int i) {
        this.f1653M = i;
    }

    /* renamed from: g */
    public void mo1433g(String str) {
        this.f1701i = str;
    }

    /* renamed from: h */
    public int mo1434h() {
        return this.f1681an;
    }

    /* renamed from: h */
    public void mo1435h(int i) {
        this.f1654N = i;
    }

    /* renamed from: h */
    public void mo1436h(String str) {
        this.f1705m = str;
    }

    public int hashCode() {
        return (this.f1708p.hashCode() * 31) + this.f1714v.hashCode();
    }

    /* renamed from: i */
    public int mo1438i() {
        return this.f1680am;
    }

    /* renamed from: i */
    public void mo1439i(int i) {
        this.f1664X = i;
    }

    /* renamed from: i */
    public void mo1440i(String str) {
        this.f1706n = str;
    }

    /* renamed from: j */
    public String mo1441j() {
        return this.f1715w;
    }

    /* renamed from: j */
    public void mo1442j(int i) {
        this.f1661U = i;
    }

    /* renamed from: j */
    public void mo1443j(String str) {
        this.f1707o = str;
    }

    /* renamed from: k */
    public int mo1444k() {
        return this.f1716x;
    }

    /* renamed from: k */
    public void mo1445k(int i) {
        this.f1658R = i;
    }

    /* renamed from: k */
    public void mo1446k(String str) {
        this.f1708p = str;
    }

    /* renamed from: l */
    public int mo1447l() {
        int i = this.f1695c;
        if (i == 5 || i == 6) {
            return 1;
        }
        return this.f1717y;
    }

    /* renamed from: l */
    public void mo1448l(int i) {
        this.f1660T = i;
    }

    /* renamed from: l */
    public void mo1449l(String str) {
        this.f1713u = str;
    }

    /* renamed from: m */
    public int mo1450m() {
        return this.f1663W;
    }

    /* renamed from: m */
    public void mo1451m(int i) {
        this.f1657Q = i;
    }

    /* renamed from: m */
    public void mo1452m(String str) {
        this.f1714v = str;
    }

    /* renamed from: n */
    public String mo1453n() {
        return this.f1675ah;
    }

    /* renamed from: n */
    public void mo1454n(int i) {
        this.f1668aa = i;
    }

    /* renamed from: n */
    public void mo1455n(String str) {
        this.f1671ad = str;
    }

    /* renamed from: o */
    public void mo1456o(int i) {
        this.f1669ab = i;
    }

    /* renamed from: o */
    public void mo1457o(String str) {
        this.f1662V = str;
    }

    /* renamed from: o */
    public boolean mo1458o() {
        return this.f1663W == 1;
    }

    /* renamed from: p */
    public int mo1459p() {
        return this.f1665Y;
    }

    /* renamed from: p */
    public void mo1460p(int i) {
        this.f1644D = i;
    }

    /* renamed from: p */
    public void mo1461p(String str) {
        this.f1689av = str;
    }

    /* renamed from: q */
    public int mo1462q() {
        return this.f1653M;
    }

    /* renamed from: q */
    public void mo1463q(int i) {
        this.f1648H = i;
    }

    /* renamed from: q */
    public void mo1464q(String str) {
        this.f1692ay = str;
    }

    /* renamed from: r */
    public int mo1465r() {
        return this.f1654N;
    }

    /* renamed from: r */
    public void mo1466r(int i) {
        this.f1694b = i;
    }

    /* renamed from: s */
    public String mo1467s() {
        return this.f1670ac;
    }

    /* renamed from: s */
    public void mo1468s(int i) {
        this.f1711s = i;
    }

    /* renamed from: t */
    public int mo1469t() {
        return this.f1664X;
    }

    /* renamed from: t */
    public void mo1470t(int i) {
        this.f1643C = i;
    }

    /* renamed from: u */
    public int mo1471u() {
        return this.f1661U;
    }

    /* renamed from: u */
    public void mo1472u(int i) {
        this.f1673af = i;
    }

    /* renamed from: v */
    public int mo1473v() {
        if (mo1402aw()) {
            return 5;
        }
        if (mo1393an() != 100.0f || mo1447l() == 2) {
            return 0;
        }
        return this.f1658R;
    }

    /* renamed from: v */
    public void mo1474v(int i) {
        this.f1641A = i;
    }

    /* renamed from: w */
    public C0454f mo1475w() {
        return this.f1656P;
    }

    /* renamed from: w */
    public void mo1476w(int i) {
        this.f1676ai = i;
    }

    /* renamed from: x */
    public AdSlot mo1477x() {
        return this.f1659S;
    }

    /* renamed from: x */
    public void mo1478x(int i) {
        this.f1677aj = i;
    }

    /* renamed from: y */
    public int mo1479y() {
        return this.f1660T;
    }

    /* renamed from: y */
    public void mo1480y(int i) {
        this.f1678ak = i;
    }

    /* renamed from: z */
    public int mo1481z() {
        return this.f1657Q;
    }

    /* renamed from: z */
    public void mo1482z(int i) {
        this.f1679al = i;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.e.n$a */
    /* compiled from: MaterialMeta */
    public static class C0478a {

        /* renamed from: a */
        private String f1719a;

        /* renamed from: b */
        private String f1720b;

        /* renamed from: c */
        private String f1721c;

        /* renamed from: d */
        private String f1722d;

        /* renamed from: e */
        private String f1723e;

        /* renamed from: f */
        private String f1724f;

        /* renamed from: g */
        private String f1725g;

        /* renamed from: a */
        public String mo1483a() {
            return this.f1724f;
        }

        /* renamed from: a */
        public void mo1484a(String str) {
            this.f1724f = str;
        }

        /* renamed from: b */
        public String mo1485b() {
            return this.f1719a;
        }

        /* renamed from: b */
        public void mo1486b(String str) {
            this.f1719a = str;
        }

        /* renamed from: c */
        public String mo1487c() {
            return this.f1720b;
        }

        /* renamed from: c */
        public void mo1488c(String str) {
            this.f1720b = str;
        }

        /* renamed from: d */
        public String mo1489d() {
            return this.f1721c;
        }

        /* renamed from: d */
        public void mo1490d(String str) {
            this.f1721c = str;
        }

        /* renamed from: e */
        public String mo1491e() {
            return this.f1722d;
        }

        /* renamed from: e */
        public void mo1492e(String str) {
            this.f1722d = str;
        }

        /* renamed from: f */
        public String mo1493f() {
            return this.f1723e;
        }

        /* renamed from: f */
        public void mo1494f(String str) {
            this.f1723e = str;
        }

        /* renamed from: g */
        public String mo1495g() {
            return this.f1725g;
        }

        /* renamed from: g */
        public void mo1496g(String str) {
            this.f1725g = str;
        }
    }
}
