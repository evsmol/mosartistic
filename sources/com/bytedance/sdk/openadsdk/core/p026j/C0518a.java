package com.bytedance.sdk.openadsdk.core.p026j;

import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a */
/* compiled from: VastAdConfig */
public class C0518a {

    /* renamed from: a */
    C0546d f1950a = new C0546d(this);

    /* renamed from: b */
    C0526b f1951b;

    /* renamed from: c */
    C0536c f1952c;

    /* renamed from: d */
    private String f1953d;

    /* renamed from: e */
    private String f1954e;

    /* renamed from: f */
    private String f1955f;

    /* renamed from: g */
    private String f1956g;

    /* renamed from: h */
    private double f1957h;

    /* renamed from: i */
    private String f1958i;

    /* renamed from: j */
    private String f1959j;

    /* renamed from: a */
    public C0546d mo1726a() {
        return this.f1950a;
    }

    /* renamed from: b */
    public C0526b mo1732b() {
        return this.f1951b;
    }

    /* renamed from: c */
    public C0536c mo1734c() {
        return this.f1952c;
    }

    /* renamed from: d */
    public String mo1736d() {
        return this.f1953d;
    }

    /* renamed from: e */
    public String mo1738e() {
        return this.f1954e;
    }

    /* renamed from: f */
    public String mo1740f() {
        return this.f1955f;
    }

    /* renamed from: g */
    public String mo1742g() {
        return this.f1956g;
    }

    /* renamed from: a */
    public void mo1729a(C0526b bVar) {
        if (bVar != null) {
            bVar.mo1773a(this.f1956g);
        }
        this.f1951b = bVar;
    }

    /* renamed from: a */
    public void mo1730a(C0536c cVar) {
        if (cVar != null) {
            cVar.mo1773a(this.f1956g);
        }
        this.f1952c = cVar;
    }

    /* renamed from: a */
    public void mo1731a(String str) {
        this.f1953d = str;
    }

    /* renamed from: b */
    public void mo1733b(String str) {
        this.f1954e = str;
    }

    /* renamed from: c */
    public void mo1735c(String str) {
        this.f1955f = str;
    }

    /* renamed from: d */
    public void mo1737d(String str) {
        this.f1956g = str;
    }

    /* renamed from: h */
    public double mo1743h() {
        return this.f1957h;
    }

    /* renamed from: a */
    public void mo1727a(double d) {
        this.f1957h = d;
    }

    /* renamed from: i */
    public String mo1744i() {
        String str = this.f1959j;
        if (str == null) {
            return this.f1955f;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -360520052) {
            if (hashCode == 519982247 && str.equals("VAST_END_CARD")) {
                c = 1;
            }
        } else if (str.equals("VAST_ICON")) {
            c = 0;
        }
        if (c == 0) {
            C0526b bVar = this.f1951b;
            return bVar != null ? bVar.f2011h : this.f1955f;
        } else if (c != 1) {
            return this.f1955f;
        } else {
            C0536c cVar = this.f1952c;
            return cVar != null ? cVar.f2011h : this.f1955f;
        }
    }

    /* renamed from: e */
    public void mo1739e(String str) {
        this.f1959j = str;
    }

    /* renamed from: j */
    public JSONObject mo1745j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.f1950a.mo1784a());
        C0526b bVar = this.f1951b;
        if (bVar != null) {
            jSONObject.put("vastIcon", bVar.mo1755a());
        }
        C0536c cVar = this.f1952c;
        if (cVar != null) {
            jSONObject.put("endCard", cVar.mo1755a());
        }
        jSONObject.put("title", this.f1953d);
        jSONObject.put("description", this.f1954e);
        jSONObject.put("clickThroughUrl", this.f1955f);
        jSONObject.put(IabUtils.KEY_VIDEO_URL, this.f1956g);
        jSONObject.put("videDuration", this.f1957h);
        jSONObject.put("tag", this.f1958i);
        return jSONObject;
    }

    /* renamed from: a */
    public static C0518a m2481a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0518a aVar = new C0518a();
        aVar.f1950a.mo1794a(jSONObject.optJSONObject("videoTrackers"));
        aVar.f1951b = C0526b.m2531a(jSONObject.optJSONObject("vastIcon"));
        aVar.f1952c = C0536c.m2561b(jSONObject.optJSONObject("endCard"));
        aVar.f1953d = jSONObject.optString("title");
        aVar.f1954e = jSONObject.optString("description");
        aVar.f1955f = jSONObject.optString("clickThroughUrl");
        aVar.f1956g = jSONObject.optString(IabUtils.KEY_VIDEO_URL);
        aVar.f1957h = jSONObject.optDouble("videDuration");
        aVar.f1958i = jSONObject.optString("tag");
        return aVar;
    }

    /* renamed from: a */
    public void mo1728a(C0477n nVar) {
        this.f1950a.mo1787a(nVar);
    }

    /* renamed from: k */
    public String mo1746k() {
        return this.f1958i;
    }

    /* renamed from: f */
    public void mo1741f(String str) {
        this.f1958i = str;
        this.f1950a.mo1790a(str);
    }
}
