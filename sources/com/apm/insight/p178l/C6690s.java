package com.apm.insight.p178l;

import android.text.TextUtils;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.s */
public final class C6690s {
    /* renamed from: a */
    public static void m16639a(C6594a aVar, Header header, CrashType crashType) {
        if (aVar != null) {
            m16640a(aVar.mo52066h(), header, crashType);
        }
    }

    /* renamed from: a */
    public static void m16640a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            String a = C6617h.m16309c().mo52322a();
            if (optLong > 0 && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    String str = "android__" + a + "_" + optLong + "_" + crashType;
                    if (header != null) {
                        jSONObject = header.mo52042f();
                        if (jSONObject == null) {
                            return;
                        }
                    }
                    jSONObject.put("unique_key", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
