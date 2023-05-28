package com.applovin.impl.sdk.p255d;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.g */
public class C8395g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f21105a;

    /* renamed from: b */
    private final Map<String, Long> f21106b = CollectionUtils.map();

    public C8395g(C8490n nVar) {
        if (nVar != null) {
            this.f21105a = nVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: e */
    private void m25281e() {
        this.f21105a.mo57337V().mo57231a((Runnable) new Runnable() {
            public void run() {
                try {
                    C8395g.this.f21105a.mo57349a(C8382d.f21009q, C8395g.this.mo57157c().toString());
                } catch (Throwable th) {
                    C8395g.this.f21105a.mo57320D();
                    if (C8626v.m26252a()) {
                        C8395g.this.f21105a.mo57320D().mo57819b("GlobalStatsManager", "Unable to save stats", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public long mo57151a(C8394f fVar) {
        return mo57152a(fVar, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo57152a(C8394f fVar, long j) {
        long longValue;
        synchronized (this.f21106b) {
            Long l = this.f21106b.get(fVar.mo57150a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue() + j;
            this.f21106b.put(fVar.mo57150a(), Long.valueOf(longValue));
        }
        m25281e();
        return longValue;
    }

    /* renamed from: a */
    public void mo57153a() {
        synchronized (this.f21106b) {
            this.f21106b.clear();
        }
        m25281e();
    }

    /* renamed from: b */
    public long mo57154b(C8394f fVar) {
        long longValue;
        synchronized (this.f21106b) {
            Long l = this.f21106b.get(fVar.mo57150a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    /* renamed from: b */
    public void mo57155b() {
        synchronized (this.f21106b) {
            for (C8394f a : C8394f.m25278b()) {
                this.f21106b.remove(a.mo57150a());
            }
            m25281e();
        }
    }

    /* renamed from: b */
    public void mo57156b(C8394f fVar, long j) {
        synchronized (this.f21106b) {
            this.f21106b.put(fVar.mo57150a(), Long.valueOf(j));
        }
        m25281e();
    }

    /* renamed from: c */
    public JSONObject mo57157c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f21106b) {
            jSONObject = new JSONObject();
            for (Map.Entry next : this.f21106b.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public void mo57158c(C8394f fVar) {
        synchronized (this.f21106b) {
            this.f21106b.remove(fVar.mo57150a());
        }
        m25281e();
    }

    /* renamed from: d */
    public void mo57159d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f21105a.mo57378b(C8382d.f21009q, JsonUtils.EMPTY_JSON));
            synchronized (this.f21106b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f21106b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f21105a.mo57320D();
            if (C8626v.m26252a()) {
                this.f21105a.mo57320D().mo57819b("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }
}
