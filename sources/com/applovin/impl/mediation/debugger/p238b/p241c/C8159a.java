package com.applovin.impl.mediation.debugger.p238b.p241c;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.c.a */
public class C8159a {

    /* renamed from: a */
    private final String f19912a;

    /* renamed from: b */
    private final String f19913b;

    /* renamed from: c */
    private final boolean f19914c;

    C8159a(JSONObject jSONObject, C8490n nVar) {
        this.f19912a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f19913b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", (List) null);
        this.f19914c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    /* renamed from: a */
    public static boolean m24455a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }

    /* renamed from: a */
    public String mo56357a() {
        return this.f19912a;
    }

    /* renamed from: b */
    public String mo56358b() {
        return this.f19913b;
    }

    /* renamed from: c */
    public boolean mo56359c() {
        return this.f19914c;
    }
}
