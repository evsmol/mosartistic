package com.applovin.impl.mediation.p236c;

import com.applovin.impl.mediation.p235b.C8114b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.core.p267a.C8894b;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.b */
public class C8133b extends C8572i {

    /* renamed from: a */
    private static final String[] f19811a = {"ads", C8894b.f22527hW, "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b */
    private static final String[] f19812b = {"ads", C8894b.f22527hW, "signal_providers"};

    /* renamed from: a */
    public static String m24348a(C8490n nVar) {
        return C8572i.m26096a((String) nVar.mo57342a(C8379a.f20673c), "1.0/mediate", nVar);
    }

    /* renamed from: a */
    public static void m24349a(JSONObject jSONObject, C8490n nVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f19811a);
            nVar.mo57349a(C8382d.f21016x, shallowCopy.toString());
            if (((Boolean) nVar.mo57342a(C8380b.f20965ff)).booleanValue()) {
                C8114b.m24274a(shallowCopy);
            }
        }
    }

    /* renamed from: b */
    public static String m24350b(C8490n nVar) {
        return C8572i.m26096a((String) nVar.mo57342a(C8379a.f20674d), "1.0/mediate", nVar);
    }

    /* renamed from: b */
    public static void m24351b(JSONObject jSONObject, C8490n nVar) {
        if (jSONObject.length() != 0) {
            if (JsonUtils.valueExists(jSONObject, "auto_init_adapters") || JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
                JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
                JsonUtils.removeObjectsForKeys(shallowCopy, f19812b);
                nVar.mo57349a(C8382d.f21017y, shallowCopy.toString());
                return;
            }
            nVar.mo57382b(C8382d.f21017y);
        }
    }

    /* renamed from: c */
    public static String m24352c(C8490n nVar) {
        return C8572i.m26096a((String) nVar.mo57342a(C8379a.f20673c), "1.0/mediate_debug", nVar);
    }

    /* renamed from: d */
    public static String m24353d(C8490n nVar) {
        return C8572i.m26096a((String) nVar.mo57342a(C8379a.f20674d), "1.0/mediate_debug", nVar);
    }
}
