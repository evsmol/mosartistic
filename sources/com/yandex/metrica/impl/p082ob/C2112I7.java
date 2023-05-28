package com.yandex.metrica.impl.p082ob;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.I7 */
class C2112I7 {

    /* renamed from: a */
    private String f5550a;

    /* renamed from: b */
    private String f5551b;

    C2112I7() {
    }

    /* renamed from: a */
    public void mo15887a(String str) {
        this.f5550a = str;
    }

    /* renamed from: b */
    public void mo15888b(String str) {
        this.f5551b = str;
    }

    /* renamed from: a */
    public String mo15886a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f5550a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f5551b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
