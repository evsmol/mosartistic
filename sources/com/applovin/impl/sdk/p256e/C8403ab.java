package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.p254c.C8380b;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.ab */
public abstract class C8403ab extends C8456y {
    protected C8403ab(String str, C8490n nVar) {
        super(str, nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25308b(JSONObject jSONObject) {
        C8377c c = m25309c(jSONObject);
        if (c != null) {
            mo56290a(c);
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Pending reward handled: " + c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r4 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.sdk.p253b.C8377c m25309c(org.json.JSONObject r4) {
        /*
            r3 = this;
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.C8572i.m26097a((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.n r1 = r3.f21118b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C8572i.m26107d(r0, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.n r1 = r3.f21118b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C8572i.m26106c(r4, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.n r1 = r3.f21118b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C8572i.m26109e(r4, r1)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r4 = "params"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0020 }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ all -> 0x0020 }
            java.util.Map r4 = com.applovin.impl.sdk.utils.JsonUtils.toStringMap(r4)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0032 }
        L_0x0024:
            java.lang.String r1 = "result"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = "network_timeout"
        L_0x002d:
            com.applovin.impl.sdk.b.c r4 = com.applovin.impl.sdk.p253b.C8377c.m25185a(r0, r4)     // Catch:{ JSONException -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            com.applovin.impl.sdk.v r0 = r3.f21120d
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0044
            com.applovin.impl.sdk.v r0 = r3.f21120d
            java.lang.String r1 = r3.f21119c
            java.lang.String r2 = "Unable to parse API response"
            r0.mo57819b(r1, r2, r4)
        L_0x0044:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p256e.C8403ab.m25309c(org.json.JSONObject):com.applovin.impl.sdk.b.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56290a(C8377c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo56291b();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo57171h() {
        return ((Integer) this.f21118b.mo57342a(C8380b.f20753bB)).intValue();
    }

    public void run() {
        mo57263a(mo57264i(), new C8511b.C8515c<JSONObject>() {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                if (C8403ab.this.mo56291b()) {
                    C8626v vVar = C8403ab.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = C8403ab.this.f21120d;
                        String str2 = C8403ab.this.f21119c;
                        vVar2.mo57822e(str2, "Reward validation failed with error code " + i + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                C8626v vVar3 = C8403ab.this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar4 = C8403ab.this.f21120d;
                    String str3 = C8403ab.this.f21119c;
                    vVar4.mo57822e(str3, "Reward validation failed with code " + i + " and error: " + str);
                }
                C8403ab.this.mo56285a(i);
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                if (C8403ab.this.mo56291b()) {
                    C8626v vVar = C8403ab.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = C8403ab.this.f21120d;
                        String str = C8403ab.this.f21119c;
                        vVar2.mo57822e(str, "Reward validation succeeded with code " + i + " but task was cancelled already");
                    }
                    C8626v vVar3 = C8403ab.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar4 = C8403ab.this.f21120d;
                        String str2 = C8403ab.this.f21119c;
                        vVar4.mo57822e(str2, "Response: " + jSONObject);
                        return;
                    }
                    return;
                }
                C8626v vVar5 = C8403ab.this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar6 = C8403ab.this.f21120d;
                    String str3 = C8403ab.this.f21119c;
                    vVar6.mo57818b(str3, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
                }
                C8403ab.this.m25308b(jSONObject);
            }
        });
    }
}
