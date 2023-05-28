package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.p101d.C4171c;
import com.iab.omid.library.amazon.p101d.C4173e;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f9925a;

    /* renamed from: b */
    private final Float f9926b;

    /* renamed from: c */
    private final boolean f9927c;

    /* renamed from: d */
    private final Position f9928d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f9925a = z;
        this.f9926b = f;
        this.f9927c = z2;
        this.f9928d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4173e.m11602a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4173e.m11602a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo32327a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f9925a);
            if (this.f9925a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f9926b);
            }
            jSONObject.put("autoPlay", this.f9927c);
            jSONObject.put("position", this.f9928d);
        } catch (JSONException e) {
            C4171c.m11597a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f9928d;
    }

    public Float getSkipOffset() {
        return this.f9926b;
    }

    public boolean isAutoPlay() {
        return this.f9927c;
    }

    public boolean isSkippable() {
        return this.f9925a;
    }
}
