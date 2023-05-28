package com.applovin.impl.mediation.p234a;

import com.applovin.impl.mediation.C8241g;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.b */
public class C8071b extends C8075e {
    private C8071b(C8071b bVar, C8241g gVar) {
        super(bVar.mo56168aa(), bVar.mo56150Q(), bVar.mo56149P(), gVar, bVar.f19617b);
    }

    public C8071b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
        super(map, jSONObject, jSONObject2, (C8241g) null, nVar);
    }

    /* renamed from: A */
    public int mo56107A() {
        int b = mo56175b("ad_view_height", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: B */
    public long mo56108B() {
        return mo56176b("viewability_imp_delay_ms", ((Long) this.f19617b.mo57342a(C8380b.f20768bQ)).longValue());
    }

    /* renamed from: C */
    public boolean mo56109C() {
        return mo56110D() >= 0;
    }

    /* renamed from: D */
    public long mo56110D() {
        long b = mo56176b("ad_refresh_ms", -1);
        return b >= 0 ? b : mo56162a("ad_refresh_ms", ((Long) this.f19617b.mo57342a(C8379a.f20682l)).longValue());
    }

    /* renamed from: E */
    public boolean mo56111E() {
        return mo56177b("proe", (Boolean) this.f19617b.mo57342a(C8379a.f20656K)).booleanValue();
    }

    /* renamed from: F */
    public long mo56112F() {
        return Utils.parseColor(mo56178b("bg_color", (String) null));
    }

    /* renamed from: a */
    public C8070a mo56059a(C8241g gVar) {
        return new C8071b(this, gVar);
    }

    /* renamed from: z */
    public int mo56113z() {
        int b = mo56175b("ad_view_width", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }
}
