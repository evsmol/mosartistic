package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.p113d.C4328c;
import com.iab.omid.library.ironsrc.p113d.C4330e;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10279a;

    /* renamed from: b */
    private final Float f10280b;

    /* renamed from: c */
    private final boolean f10281c;

    /* renamed from: d */
    private final Position f10282d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10279a = z;
        this.f10280b = f;
        this.f10281c = z2;
        this.f10282d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4330e.m12302a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4330e.m12302a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo32928a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10279a);
            if (this.f10279a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f10280b);
            }
            jSONObject.put("autoPlay", this.f10281c);
            jSONObject.put("position", this.f10282d);
        } catch (JSONException e) {
            C4328c.m12297a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f10282d;
    }

    public final Float getSkipOffset() {
        return this.f10280b;
    }

    public final boolean isAutoPlay() {
        return this.f10281c;
    }

    public final boolean isSkippable() {
        return this.f10279a;
    }
}
