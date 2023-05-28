package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.p095d.C4121c;
import com.iab.omid.library.adcolony.p095d.C4123e;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f9808a;

    /* renamed from: b */
    private final Float f9809b;

    /* renamed from: c */
    private final boolean f9810c;

    /* renamed from: d */
    private final Position f9811d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f9808a = z;
        this.f9809b = f;
        this.f9810c = z2;
        this.f9811d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4123e.m11372a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4123e.m11372a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo32128a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f9808a);
            if (this.f9808a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f9809b);
            }
            jSONObject.put("autoPlay", this.f9810c);
            jSONObject.put("position", this.f9811d);
        } catch (JSONException e) {
            C4121c.m11367a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f9811d;
    }

    public Float getSkipOffset() {
        return this.f9809b;
    }

    public boolean isAutoPlay() {
        return this.f9810c;
    }

    public boolean isSkippable() {
        return this.f9808a;
    }
}
