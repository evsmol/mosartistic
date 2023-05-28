package com.applovin.mediation.hybridAds;

import android.graphics.Color;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.mediation.hybridAds.c */
public class C8641c {

    /* renamed from: a */
    private final JSONObject f21840a;

    public C8641c(JSONObject jSONObject) {
        this.f21840a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public int mo58011a() {
        String string = JsonUtils.getString(this.f21840a, "background_color", (String) null);
        if (string != null) {
            return Color.parseColor(string);
        }
        return -16777216;
    }

    /* renamed from: b */
    public int mo58012b() {
        return JsonUtils.getInt(this.f21840a, "close_button_top_margin", 20);
    }

    /* renamed from: c */
    public int mo58013c() {
        return JsonUtils.getInt(this.f21840a, "close_button_h_margin", 5);
    }

    /* renamed from: d */
    public int mo58014d() {
        return JsonUtils.getInt(this.f21840a, "close_button_size", 30);
    }

    /* renamed from: e */
    public int mo58015e() {
        return JsonUtils.getInt(this.f21840a, "close_button_extended_touch_area_size", 10);
    }

    /* renamed from: f */
    public long mo58016f() {
        return JsonUtils.getLong(this.f21840a, "close_button_delay_ms", 3000);
    }
}
