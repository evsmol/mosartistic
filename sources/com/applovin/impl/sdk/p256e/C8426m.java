package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.m */
public class C8426m extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8428a f21159a;

    /* renamed from: com.applovin.impl.sdk.e.m$a */
    public interface C8428a {
        /* renamed from: a */
        void mo56829a();
    }

    public C8426m(C8490n nVar, C8428a aVar) {
        super("TaskFetchVariables", nVar);
        this.f21159a = aVar;
    }

    /* renamed from: a */
    private Map<String, String> m25405a() {
        return Utils.stringifyObjectMap(this.f21118b.mo57340Y().mo57625a((Map<String, String>) null, false, false));
    }

    public void run() {
        C84271 r1 = new C8449u<JSONObject>(C8516c.m25763a(this.f21118b).mo57528a(C8572i.m26116k(this.f21118b)).mo57538c(C8572i.m26117l(this.f21118b)).mo57529a(m25405a()).mo57534b("GET").mo57527a(new JSONObject()).mo57533b(((Integer) this.f21118b.mo57342a(C8380b.f20891dj)).intValue()).mo57532a(), this.f21118b) {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar2.mo57822e(str2, "Unable to fetch variables: server returned " + i);
                }
                C8626v.m26258i("AppLovinVariableService", "Failed to load variables.");
                C8426m.this.f21159a.mo56829a();
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                C8572i.m26107d(jSONObject, this.f21118b);
                C8572i.m26106c(jSONObject, this.f21118b);
                C8572i.m26111f(jSONObject, this.f21118b);
                C8572i.m26109e(jSONObject, this.f21118b);
                C8426m.this.f21159a.mo56829a();
            }
        };
        r1.mo57253a(C8380b.f20784bg);
        r1.mo57255b(C8380b.f20785bh);
        this.f21118b.mo57337V().mo57227a((C8401a) r1);
    }
}
