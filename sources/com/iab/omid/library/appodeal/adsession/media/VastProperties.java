package com.iab.omid.library.appodeal.adsession.media;

import com.iab.omid.library.appodeal.p107d.C4278c;
import com.iab.omid.library.appodeal.p107d.C4280e;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10166a;

    /* renamed from: b */
    private final Float f10167b;

    /* renamed from: c */
    private final boolean f10168c;

    /* renamed from: d */
    private final Position f10169d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10166a = z;
        this.f10167b = f;
        this.f10168c = z2;
        this.f10169d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4280e.m12081a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4280e.m12081a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo32734a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10166a);
            if (this.f10166a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f10167b);
            }
            jSONObject.put("autoPlay", this.f10168c);
            jSONObject.put("position", this.f10169d);
        } catch (JSONException e) {
            C4278c.m12076a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f10169d;
    }

    public Float getSkipOffset() {
        return this.f10167b;
    }

    public boolean isAutoPlay() {
        return this.f10168c;
    }

    public boolean isSkippable() {
        return this.f10166a;
    }
}
