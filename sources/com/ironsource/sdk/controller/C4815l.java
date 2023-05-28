package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p145h.C4945b;
import com.ironsource.sdk.p145h.C4948c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
final class C4815l {

    /* renamed from: a */
    String f12275a;

    /* renamed from: b */
    C4945b f12276b;

    C4815l(String str, C4945b bVar) {
        this.f12275a = str;
        this.f12276b = bVar;
    }

    /* renamed from: a */
    static C4948c m14070a(JSONObject jSONObject, String str) {
        if (!jSONObject.has("filePath") || !jSONObject.has("fileName")) {
            throw new Exception("Missing params for file");
        }
        String string = jSONObject.getString("filePath");
        return new C4948c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    /* renamed from: a */
    static JSONObject m14071a(C4818n nVar, long j) {
        try {
            return nVar.mo34397a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m14072a(C4818n nVar, String str) {
        try {
            return nVar.mo34397a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m14073a(C4818n nVar, JSONObject jSONObject) {
        try {
            return nVar.mo34397a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    static C4948c m14074b(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new C4948c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
