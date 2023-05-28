package com.bytedance.sdk.openadsdk.core.p026j;

import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b */
/* compiled from: VastIcon */
public class C0526b extends C0536c {

    /* renamed from: i */
    private long f1982i;

    /* renamed from: j */
    private long f1983j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0526b(int i, int i2, long j, long j2, C0538a.C0541a aVar, C0538a.C0542b bVar, String str, List<C0532c> list, List<C0532c> list2, String str2) {
        super(i, i2, aVar, bVar, str, list, list2, str2);
        this.f1982i = j;
        this.f1983j = j2;
    }

    /* renamed from: a */
    public JSONObject mo1755a() throws JSONException {
        JSONObject a = super.mo1755a();
        if (a != null) {
            a.put("offset", this.f1982i);
            a.put(IronSourceConstants.EVENTS_DURATION, this.f1983j);
        }
        return a;
    }

    /* renamed from: a */
    public static C0526b m2531a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C0536c b = C0536c.m2561b(jSONObject);
        if (b == null) {
            return null;
        }
        long optLong = jSONObject2.optLong("offset", -1);
        long optLong2 = jSONObject2.optLong(IronSourceConstants.EVENTS_DURATION, -1);
        return new C0526b(b.f2004a, b.f2005b, optLong, optLong2, b.f2006c, b.f2007d, b.f2008e, b.f2009f, b.f2010g, b.f2011h);
    }
}
