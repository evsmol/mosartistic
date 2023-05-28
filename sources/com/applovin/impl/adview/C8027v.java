package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.appnext.base.p264b.C8850d;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.v */
public final class C8027v {

    /* renamed from: a */
    private JSONObject f19385a;

    public C8027v(JSONObject jSONObject) {
        this.f19385a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo55804a() {
        int i;
        String string = JsonUtils.getString(this.f19385a, "mixed_content_mode", (String) null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public WebSettings.PluginState mo55805b() {
        String string = JsonUtils.getString(this.f19385a, "plugin_state", (String) null);
        if (StringUtils.isValidString(string)) {
            if (C8850d.f22425fe.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if (C8850d.f22426ff.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean mo55806c() {
        return JsonUtils.getBoolean(this.f19385a, "allow_file_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Boolean mo55807d() {
        return JsonUtils.getBoolean(this.f19385a, "load_with_overview_mode", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Boolean mo55808e() {
        return JsonUtils.getBoolean(this.f19385a, "use_wide_view_port", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Boolean mo55809f() {
        return JsonUtils.getBoolean(this.f19385a, "allow_content_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo55810g() {
        return JsonUtils.getBoolean(this.f19385a, "use_built_in_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Boolean mo55811h() {
        return JsonUtils.getBoolean(this.f19385a, "display_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean mo55812i() {
        return JsonUtils.getBoolean(this.f19385a, "save_form_data", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Boolean mo55813j() {
        return JsonUtils.getBoolean(this.f19385a, "geolocation_enabled", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean mo55814k() {
        return JsonUtils.getBoolean(this.f19385a, "need_initial_focus", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Boolean mo55815l() {
        return JsonUtils.getBoolean(this.f19385a, "allow_file_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Boolean mo55816m() {
        return JsonUtils.getBoolean(this.f19385a, "allow_universal_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Boolean mo55817n() {
        return JsonUtils.getBoolean(this.f19385a, "offscreen_pre_raster", (Boolean) null);
    }
}
