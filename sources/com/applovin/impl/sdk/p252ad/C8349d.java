package com.applovin.impl.sdk.p252ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.d */
public final class C8349d {

    /* renamed from: a */
    private static final Map<String, C8349d> f20563a = CollectionUtils.map();

    /* renamed from: b */
    private static final Object f20564b = new Object();

    /* renamed from: c */
    private JSONObject f20565c;

    /* renamed from: d */
    private final String f20566d;

    /* renamed from: e */
    private AppLovinAdSize f20567e;

    /* renamed from: f */
    private AppLovinAdType f20568f;

    private C8349d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) || !(appLovinAdType == null || appLovinAdSize == null)) {
            this.f20567e = appLovinAdSize;
            this.f20568f = appLovinAdType;
            if (StringUtils.isValidString(str)) {
                str2 = str.trim();
            } else {
                str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
            }
            this.f20566d = str2.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new IllegalArgumentException("No zone identifier or type or size specified");
    }

    /* renamed from: a */
    public static C8349d m25015a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m25016a(appLovinAdSize, appLovinAdType, (String) null);
    }

    /* renamed from: a */
    public static C8349d m25016a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        C8349d dVar = new C8349d(appLovinAdSize, appLovinAdType, str);
        synchronized (f20564b) {
            String str2 = dVar.f20566d;
            if (f20563a.containsKey(str2)) {
                dVar = f20563a.get(str2);
            } else {
                f20563a.put(str2, dVar);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C8349d m25017a(String str) {
        return m25016a((AppLovinAdSize) null, (AppLovinAdType) null, str);
    }

    /* renamed from: a */
    public static void m25018a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f20564b) {
                C8349d dVar = f20563a.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (dVar != null) {
                    dVar.f20567e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f20568f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    /* renamed from: b */
    public static C8349d m25019b(String str) {
        return m25016a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* renamed from: f */
    public static Collection<C8349d> m25020f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, new C8349d[]{m25021g(), m25022h(), m25023i(), m25024j(), m25025k(), m25026l(), m25027m()});
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: g */
    public static C8349d m25021g() {
        return m25015a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* renamed from: h */
    public static C8349d m25022h() {
        return m25015a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* renamed from: i */
    public static C8349d m25023i() {
        return m25015a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* renamed from: j */
    public static C8349d m25024j() {
        return m25015a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* renamed from: k */
    public static C8349d m25025k() {
        return m25015a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    /* renamed from: l */
    public static C8349d m25026l() {
        return m25015a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* renamed from: m */
    public static C8349d m25027m() {
        return m25015a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* renamed from: a */
    public String mo56936a() {
        return this.f20566d;
    }

    /* renamed from: b */
    public MaxAdFormat mo56937b() {
        AppLovinAdSize c = mo56938c();
        if (c == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c == AppLovinAdSize.INTERSTITIAL) {
            if (mo56939d() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (mo56939d() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (mo56939d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (mo56939d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        } else if (c == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public AppLovinAdSize mo56938c() {
        if (this.f20567e == null && JsonUtils.valueExists(this.f20565c, "ad_size")) {
            this.f20567e = AppLovinAdSize.fromString(JsonUtils.getString(this.f20565c, "ad_size", (String) null));
        }
        return this.f20567e;
    }

    /* renamed from: d */
    public AppLovinAdType mo56939d() {
        if (this.f20568f == null && JsonUtils.valueExists(this.f20565c, "ad_type")) {
            this.f20568f = AppLovinAdType.fromString(JsonUtils.getString(this.f20565c, "ad_type", (String) null));
        }
        return this.f20568f;
    }

    /* renamed from: e */
    public boolean mo56940e() {
        return m25020f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f20566d.equalsIgnoreCase(((C8349d) obj).f20566d);
    }

    public int hashCode() {
        return this.f20566d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f20566d + ", zoneObject=" + this.f20565c + '}';
    }
}
