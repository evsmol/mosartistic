package com.applovin.impl.mediation.p234a;

import android.os.SystemClock;
import com.applovin.impl.mediation.C8241g;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.p254c.C8379a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.c */
public class C8072c extends C8070a {

    /* renamed from: c */
    private final AtomicReference<C8377c> f19608c;

    /* renamed from: d */
    private final AtomicBoolean f19609d;

    /* renamed from: e */
    private final AtomicBoolean f19610e;

    /* renamed from: f */
    private boolean f19611f;

    private C8072c(C8072c cVar, C8241g gVar) {
        super(cVar.mo56168aa(), cVar.mo56150Q(), cVar.mo56149P(), gVar, cVar.f19617b);
        this.f19610e = new AtomicBoolean();
        this.f19608c = cVar.f19608c;
        this.f19609d = cVar.f19609d;
    }

    public C8072c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
        super(map, jSONObject, jSONObject2, (C8241g) null, nVar);
        this.f19610e = new AtomicBoolean();
        this.f19608c = new AtomicReference<>();
        this.f19609d = new AtomicBoolean();
    }

    /* renamed from: A */
    public long mo56114A() {
        long b = mo56176b("ad_hidden_timeout_ms", -1);
        return b >= 0 ? b : mo56162a("ad_hidden_timeout_ms", ((Long) this.f19617b.mo57342a(C8379a.f20653H)).longValue());
    }

    /* renamed from: B */
    public boolean mo56115B() {
        if (mo56177b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false).booleanValue()) {
            return true;
        }
        return mo56163a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f19617b.mo57342a(C8379a.f20654I)).booleanValue();
    }

    /* renamed from: C */
    public long mo56116C() {
        long b = mo56176b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1);
        return b >= 0 ? b : mo56162a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f19617b.mo57342a(C8379a.f20655J)).longValue());
    }

    /* renamed from: D */
    public long mo56117D() {
        if (mo56102u() > 0) {
            return SystemClock.elapsedRealtime() - mo56102u();
        }
        return -1;
    }

    /* renamed from: E */
    public long mo56118E() {
        long b = mo56176b("fullscreen_display_delay_ms", -1);
        return b >= 0 ? b : ((Long) this.f19617b.mo57342a(C8379a.f20691u)).longValue();
    }

    /* renamed from: F */
    public long mo56119F() {
        return mo56176b("ahdm", ((Long) this.f19617b.mo57342a(C8379a.f20693w)).longValue());
    }

    /* renamed from: G */
    public boolean mo56120G() {
        return mo56177b("susaode", (Boolean) this.f19617b.mo57342a(C8379a.f20692v)).booleanValue();
    }

    /* renamed from: H */
    public String mo56121H() {
        return mo56178b("bcode", "");
    }

    /* renamed from: I */
    public String mo56122I() {
        return mo56164a("mcode", "");
    }

    /* renamed from: J */
    public boolean mo56123J() {
        return this.f19609d.get();
    }

    /* renamed from: K */
    public void mo56124K() {
        this.f19609d.set(true);
    }

    /* renamed from: L */
    public C8377c mo56125L() {
        return this.f19608c.getAndSet((Object) null);
    }

    /* renamed from: M */
    public AtomicBoolean mo56126M() {
        return this.f19610e;
    }

    /* renamed from: N */
    public boolean mo56127N() {
        return this.f19611f;
    }

    /* renamed from: a */
    public C8070a mo56059a(C8241g gVar) {
        return new C8072c(this, gVar);
    }

    /* renamed from: a */
    public void mo56128a(C8377c cVar) {
        this.f19608c.set(cVar);
    }

    /* renamed from: a */
    public void mo56129a(boolean z) {
        this.f19611f = z;
    }

    /* renamed from: z */
    public long mo56113z() {
        long b = mo56176b("ad_expiration_ms", -1);
        return b >= 0 ? b : mo56162a("ad_expiration_ms", ((Long) this.f19617b.mo57342a(C8379a.f20648C)).longValue());
    }
}
