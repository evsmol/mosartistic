package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ImpressionData {

    /* renamed from: A */
    private String f11470A = null;

    /* renamed from: B */
    private DecimalFormat f11471B;

    /* renamed from: a */
    private final String f11472a = IronSourceConstants.EVENTS_AUCTION_ID;

    /* renamed from: b */
    private final String f11473b = "adUnit";

    /* renamed from: c */
    private final String f11474c = "country";

    /* renamed from: d */
    private final String f11475d = "ab";

    /* renamed from: e */
    private final String f11476e = "segmentName";

    /* renamed from: f */
    private final String f11477f = IronSourceConstants.EVENTS_PLACEMENT_NAME;

    /* renamed from: g */
    private final String f11478g = "adNetwork";

    /* renamed from: h */
    private final String f11479h = "instanceName";

    /* renamed from: i */
    private final String f11480i = "instanceId";

    /* renamed from: j */
    private final String f11481j = "revenue";

    /* renamed from: k */
    private final String f11482k = "precision";

    /* renamed from: l */
    private final String f11483l = "lifetimeRevenue";

    /* renamed from: m */
    private final String f11484m = "encryptedCPM";

    /* renamed from: n */
    private JSONObject f11485n;

    /* renamed from: o */
    private String f11486o = null;

    /* renamed from: p */
    private String f11487p = null;

    /* renamed from: q */
    private String f11488q = null;

    /* renamed from: r */
    private String f11489r = null;

    /* renamed from: s */
    private String f11490s = null;

    /* renamed from: t */
    private String f11491t = null;

    /* renamed from: u */
    private String f11492u = null;

    /* renamed from: v */
    private String f11493v = null;

    /* renamed from: w */
    private String f11494w = null;

    /* renamed from: x */
    private Double f11495x = null;

    /* renamed from: y */
    private String f11496y = null;

    /* renamed from: z */
    private Double f11497z = null;

    public ImpressionData(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "revenue";
        this.f11471B = new DecimalFormat("#.#####");
        if (jSONObject2 != null) {
            try {
                this.f11485n = jSONObject2;
                this.f11486o = jSONObject2.optString(IronSourceConstants.EVENTS_AUCTION_ID, (String) null);
                this.f11487p = jSONObject2.optString("adUnit", (String) null);
                this.f11488q = jSONObject2.optString("country", (String) null);
                this.f11489r = jSONObject2.optString("ab", (String) null);
                this.f11490s = jSONObject2.optString("segmentName", (String) null);
                this.f11491t = jSONObject2.optString(IronSourceConstants.EVENTS_PLACEMENT_NAME, (String) null);
                this.f11492u = jSONObject2.optString("adNetwork", (String) null);
                this.f11493v = jSONObject2.optString("instanceName", (String) null);
                this.f11494w = jSONObject2.optString("instanceId", (String) null);
                this.f11496y = jSONObject2.optString("precision", (String) null);
                this.f11470A = jSONObject2.optString("encryptedCPM", (String) null);
                double optDouble = jSONObject2.optDouble("lifetimeRevenue");
                this.f11497z = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject2.optDouble(str);
                this.f11495x = Double.isNaN(optDouble2) ? null : Double.valueOf(optDouble2);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f11489r;
    }

    public String getAdNetwork() {
        return this.f11492u;
    }

    public String getAdUnit() {
        return this.f11487p;
    }

    public JSONObject getAllData() {
        return this.f11485n;
    }

    public String getAuctionId() {
        return this.f11486o;
    }

    public String getCountry() {
        return this.f11488q;
    }

    public String getEncryptedCPM() {
        return this.f11470A;
    }

    public String getInstanceId() {
        return this.f11494w;
    }

    public String getInstanceName() {
        return this.f11493v;
    }

    public Double getLifetimeRevenue() {
        return this.f11497z;
    }

    public String getPlacement() {
        return this.f11491t;
    }

    public String getPrecision() {
        return this.f11496y;
    }

    public Double getRevenue() {
        return this.f11495x;
    }

    public String getSegmentName() {
        return this.f11490s;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f11491t;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f11491t = replace;
            JSONObject jSONObject = this.f11485n;
            if (jSONObject != null) {
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, replace);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImpressionData{auctionId='");
        sb.append(this.f11486o);
        sb.append('\'');
        sb.append(", adUnit='");
        sb.append(this.f11487p);
        sb.append('\'');
        sb.append(", country='");
        sb.append(this.f11488q);
        sb.append('\'');
        sb.append(", ab='");
        sb.append(this.f11489r);
        sb.append('\'');
        sb.append(", segmentName='");
        sb.append(this.f11490s);
        sb.append('\'');
        sb.append(", placement='");
        sb.append(this.f11491t);
        sb.append('\'');
        sb.append(", adNetwork='");
        sb.append(this.f11492u);
        sb.append('\'');
        sb.append(", instanceName='");
        sb.append(this.f11493v);
        sb.append('\'');
        sb.append(", instanceId='");
        sb.append(this.f11494w);
        sb.append('\'');
        sb.append(", revenue=");
        Double d = this.f11495x;
        String str = null;
        sb.append(d == null ? null : this.f11471B.format(d));
        sb.append(", precision='");
        sb.append(this.f11496y);
        sb.append('\'');
        sb.append(", lifetimeRevenue=");
        Double d2 = this.f11497z;
        if (d2 != null) {
            str = this.f11471B.format(d2);
        }
        sb.append(str);
        sb.append(", encryptedCPM='");
        sb.append(this.f11470A);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
