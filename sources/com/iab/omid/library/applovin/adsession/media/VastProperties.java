package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.C4229d;
import com.iab.omid.library.applovin.utils.C4233g;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10037a;

    /* renamed from: b */
    private final Float f10038b;

    /* renamed from: c */
    private final boolean f10039c;

    /* renamed from: d */
    private final Position f10040d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10037a = z;
        this.f10038b = f;
        this.f10039c = z2;
        this.f10040d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4233g.m11883a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4233g.m11883a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo32521a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10037a);
            if (this.f10037a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f10038b);
            }
            jSONObject.put("autoPlay", this.f10039c);
            jSONObject.put("position", this.f10040d);
        } catch (JSONException e) {
            C4229d.m11874a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f10040d;
    }

    public Float getSkipOffset() {
        return this.f10038b;
    }

    public boolean isAutoPlay() {
        return this.f10039c;
    }

    public boolean isSkippable() {
        return this.f10037a;
    }
}
