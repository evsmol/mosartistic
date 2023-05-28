package com.applovin.impl.mediation.p234a;

import com.applovin.impl.mediation.C8241g;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.e */
public abstract class C8075e extends C8070a {
    protected C8075e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8241g gVar, C8490n nVar) {
        super(map, jSONObject, jSONObject2, gVar, nVar);
    }

    /* renamed from: H */
    public int mo56141H() {
        MaxAdFormat format = getFormat();
        C8380b bVar = format == MaxAdFormat.BANNER ? C8380b.f20769bR : format == MaxAdFormat.MREC ? C8380b.f20771bT : format == MaxAdFormat.LEADER ? C8380b.f20773bV : format == MaxAdFormat.NATIVE ? C8380b.f20775bX : null;
        if (bVar != null) {
            return mo56175b("viewability_min_width", ((Integer) this.f19617b.mo57342a(bVar)).intValue());
        }
        return 0;
    }

    /* renamed from: I */
    public int mo56142I() {
        MaxAdFormat format = getFormat();
        C8380b bVar = format == MaxAdFormat.BANNER ? C8380b.f20770bS : format == MaxAdFormat.MREC ? C8380b.f20772bU : format == MaxAdFormat.LEADER ? C8380b.f20774bW : format == MaxAdFormat.NATIVE ? C8380b.f20776bY : null;
        if (bVar != null) {
            return mo56175b("viewability_min_height", ((Integer) this.f19617b.mo57342a(bVar)).intValue());
        }
        return 0;
    }

    /* renamed from: J */
    public float mo56143J() {
        return mo56160a("viewability_min_alpha", ((Float) this.f19617b.mo57342a(C8379a.f20777bZ)).floatValue() / 100.0f);
    }

    /* renamed from: K */
    public int mo56144K() {
        return mo56175b("viewability_min_pixels", -1);
    }

    /* renamed from: L */
    public float mo56145L() {
        return mo56160a("viewability_min_percentage_dp", -1.0f);
    }

    /* renamed from: M */
    public float mo56146M() {
        return mo56160a("viewability_min_percentage_pixels", -1.0f);
    }

    /* renamed from: N */
    public boolean mo56147N() {
        return mo56144K() >= 0 || mo56145L() >= 0.0f || mo56146M() >= 0.0f;
    }

    /* renamed from: O */
    public long mo56148O() {
        return mo56176b("viewability_timer_min_visible_ms", ((Long) this.f19617b.mo57342a(C8379a.f20830ca)).longValue());
    }
}
