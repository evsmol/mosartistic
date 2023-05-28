package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8449u;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.a */
public class C8509a extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f21433a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C8516c<JSONObject> f21434e;

    public C8509a(String str, C8516c<JSONObject> cVar, C8490n nVar) {
        super("CommunicatorRequestTask:" + str, nVar);
        this.f21433a = str;
        this.f21434e = cVar;
    }

    public void run() {
        this.f21118b.mo57337V().mo57227a((C8401a) new C8449u<JSONObject>(this.f21434e, this.f21118b, mo57170g()) {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                this.f21118b.mo57369aj().mo57293a(C8509a.this.f21433a, C8509a.this.f21434e.mo57505a(), i, jSONObject, str, false);
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                this.f21118b.mo57369aj().mo57293a(C8509a.this.f21433a, C8509a.this.f21434e.mo57505a(), i, jSONObject, (String) null, true);
            }
        });
    }
}
