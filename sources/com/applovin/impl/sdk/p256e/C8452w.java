package com.applovin.impl.sdk.p256e;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.w */
public abstract class C8452w extends C8456y {
    protected C8452w(String str, C8490n nVar) {
        super(str, nVar);
    }

    /* renamed from: a */
    private JSONObject m25467a(C8377c cVar) {
        JSONObject i = mo57264i();
        JsonUtils.putString(i, IronSourceConstants.EVENTS_RESULT, cVar.mo57078b());
        Map<String, String> a = cVar.mo57077a();
        if (a != null) {
            JsonUtils.putJSONObject(i, "params", new JSONObject(a));
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C8377c mo56287b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo56288b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo56289c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo57171h() {
        return ((Integer) this.f21118b.mo57342a(C8380b.f20754bC)).intValue();
    }

    public void run() {
        C8377c b = mo56287b();
        if (b != null) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Reporting pending reward: " + b + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo57263a(m25467a(b), new C8511b.C8515c<JSONObject>() {
                /* renamed from: a */
                public void mo56275a(int i, String str, JSONObject jSONObject) {
                    C8452w.this.mo56285a(i);
                }

                /* renamed from: a */
                public void mo56277a(JSONObject jSONObject, int i) {
                    C8452w.this.mo56288b(jSONObject);
                }
            });
            return;
        }
        C8626v vVar3 = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57822e(this.f21119c, "Pending reward not found");
        }
        mo56289c();
    }
}
