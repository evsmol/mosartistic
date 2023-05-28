package com.yandex.metrica.impl.p082ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.F2 */
public class C2010F2 {

    /* renamed from: a */
    public final String f5384a;

    /* renamed from: b */
    public final String f5385b;

    /* renamed from: c */
    public final boolean f5386c;

    /* renamed from: d */
    public final int f5387d;

    /* renamed from: e */
    public final Long f5388e;

    public C2010F2(String str, String str2, boolean z, int i, Long l) {
        this.f5384a = str;
        this.f5385b = str2;
        this.f5386c = z;
        this.f5387d = i;
        this.f5388e = l;
    }

    /* renamed from: a */
    public static JSONArray m7185a(Collection<C2010F2> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C2010F2 next : collection) {
                next.getClass();
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject().put("mac", next.f5384a).put("ssid", next.f5385b).put("signal_strength", next.f5387d).put("is_connected", next.f5386c).put("last_visible_offset_seconds", next.f5388e);
                } catch (Throwable unused) {
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }
}
