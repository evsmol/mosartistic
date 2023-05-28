package com.applovin.exoplayer2.p185d;

import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.exoplayer2.d.a */
final class C7130a {
    /* renamed from: a */
    private static String m19012a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: a */
    public static byte[] m19013a(byte[] bArr) {
        return C7728ai.f18249a >= 27 ? bArr : C7728ai.m22250c(m19012a(C7728ai.m22203a(bArr)));
    }

    /* renamed from: b */
    private static String m19014b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    /* renamed from: b */
    public static byte[] m19015b(byte[] bArr) {
        if (C7728ai.f18249a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C7728ai.m22203a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m19014b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m19014b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return C7728ai.m22250c(sb.toString());
        } catch (JSONException e) {
            C7755q.m22362c("ClearKeyUtil", "Failed to adjust response data: " + C7728ai.m22203a(bArr), e);
            return bArr;
        }
    }
}
