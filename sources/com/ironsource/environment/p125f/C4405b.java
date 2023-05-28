package com.ironsource.environment.p125f;

import com.ironsource.environment.p122c.C4390b;
import com.ironsource.environment.p125f.C4403a;
import com.ironsource.mediationsdk.C4643m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0007J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, mo38199d2 = {"Lcom/ironsource/environment/token/TokenProvider;", "", "()V", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "mTokenKeyList", "", "", "[Ljava/lang/String;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getToken", "context", "Landroid/content/Context;", "environment_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.f.b */
public final class C4405b {

    /* renamed from: a */
    public final String[] f10501a = C4403a.f10500b;

    /* renamed from: b */
    private final C4643m f10502b = new C4643m();

    public C4405b() {
        C4403a.C4404a aVar = C4403a.f10499a;
    }

    /* renamed from: a */
    public static JSONObject m12527a(JSONObject jSONObject) {
        JSONObject a = C4390b.m12496a(jSONObject.optJSONObject("md"));
        if (a != null) {
            jSONObject.put("md", a);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo33214a() {
        JSONObject a = C4643m.m13619a(this.f10501a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return m12527a(a);
    }
}
