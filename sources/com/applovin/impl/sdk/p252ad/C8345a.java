package com.applovin.impl.sdk.p252ad;

import android.net.Uri;
import com.applovin.impl.adview.C7993i;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p251a.C8323c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.impl.sdk.ad.a */
public final class C8345a extends C8350e {

    /* renamed from: a */
    private final String f20544a = mo55841b();

    /* renamed from: b */
    private final String f20545b = mo56923i();

    /* renamed from: c */
    private final String f20546c = m24990aM();

    /* renamed from: d */
    private final C8323c f20547d = new C8323c(this);

    public C8345a(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, C8490n nVar) {
        super(jSONObject, jSONObject2, bVar, nVar);
    }

    /* renamed from: aM */
    private String m24990aM() {
        return getStringFromAdObject("stream_url", "");
    }

    /* renamed from: a */
    public void mo55827a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f20544a);
            JsonUtils.putString(this.adObject, "stream_url", this.f20546c);
        }
    }

    /* renamed from: a */
    public void mo56919a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    /* renamed from: a */
    public void mo56920a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    /* renamed from: b */
    public String mo55841b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", "");
        }
        return string;
    }

    /* renamed from: c */
    public C8323c mo55860o() {
        return this.f20547d;
    }

    /* renamed from: d */
    public String mo55843d() {
        return this.f20545b;
    }

    /* renamed from: e */
    public String mo56921e() {
        return this.f20546c;
    }

    /* renamed from: f */
    public boolean mo55846f() {
        return this.adObject.has("stream_url");
    }

    /* renamed from: g */
    public void mo56922g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f20544a);
            JsonUtils.putString(jSONObject, "video", this.f20545b);
            JsonUtils.putString(jSONObject, "stream_url", this.f20546c);
        }
        return deepCopy;
    }

    /* renamed from: h */
    public Uri mo55850h() {
        String aM = m24990aM();
        if (StringUtils.isValidString(aM)) {
            return Uri.parse(aM);
        }
        String i = mo56923i();
        if (StringUtils.isValidString(i)) {
            return Uri.parse(i);
        }
        return null;
    }

    public boolean hasVideoUrl() {
        return mo55850h() != null;
    }

    /* renamed from: i */
    public String mo56923i() {
        return getStringFromAdObject("video", "");
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(IabUtils.KEY_OM_SDK_ENABLED, false);
    }

    /* renamed from: j */
    public Uri mo55855j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo55856k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : mo55855j();
    }

    /* renamed from: l */
    public float mo56924l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* renamed from: m */
    public boolean mo56925m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    /* renamed from: n */
    public C7993i.C7994a mo56926n() {
        return mo56969a(getIntFromAdObject("expandable_style", C7993i.C7994a.INVISIBLE.mo55742a()));
    }
}
