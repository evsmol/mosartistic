package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4233g;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType2;
        this.impressionType = impressionType2;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        C4233g.m11883a((Object) creativeType2, "CreativeType is null");
        C4233g.m11883a((Object) impressionType2, "ImpressionType is null");
        C4233g.m11883a((Object) owner, "Impression owner is null");
        C4233g.m11881a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C4226c.m11860a(jSONObject, "impressionOwner", this.impressionOwner);
        C4226c.m11860a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C4226c.m11860a(jSONObject, "creativeType", this.creativeType);
        C4226c.m11860a(jSONObject, "impressionType", this.impressionType);
        C4226c.m11860a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
