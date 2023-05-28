package com.applovin.impl.sdk.p252ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.c */
public class C8347c {

    /* renamed from: a */
    private final C8490n f20556a;

    /* renamed from: b */
    private final String f20557b;

    /* renamed from: com.applovin.impl.sdk.ad.c$a */
    public enum C8348a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d */
        private final String f20562d;

        private C8348a(String str) {
            this.f20562d = str;
        }

        public String toString() {
            return this.f20562d;
        }
    }

    public C8347c(String str, C8490n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        } else if (nVar != null) {
            this.f20557b = str;
            this.f20556a = nVar;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private String m25010a(C8380b<String> bVar) {
        for (String next : this.f20556a.mo57380b(bVar)) {
            if (this.f20557b.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo56928a() {
        return this.f20557b;
    }

    /* renamed from: b */
    public C8348a mo56929b() {
        return m25010a(C8380b.f20787bj) != null ? C8348a.REGULAR : m25010a(C8380b.f20788bk) != null ? C8348a.AD_RESPONSE_JSON : C8348a.UNSPECIFIED;
    }

    /* renamed from: c */
    public String mo56930c() {
        String a = m25010a(C8380b.f20787bj);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = m25010a(C8380b.f20788bk);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return null;
    }

    /* renamed from: d */
    public JSONObject mo56931d() {
        if (mo56929b() != C8348a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f20557b.substring(mo56930c().length()), 0), "UTF-8"));
                this.f20556a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = this.f20556a.mo57320D();
                    D.mo57818b("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                this.f20556a.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                C8626v D2 = this.f20556a.mo57320D();
                D2.mo57819b("AdToken", "Unable to decode token '" + this.f20557b + "' into JSON", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f20556a.mo57320D();
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v D3 = this.f20556a.mo57320D();
            D3.mo57819b("AdToken", "Unable to process ad response from token '" + this.f20557b + "'", e2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8347c)) {
            return false;
        }
        String str = this.f20557b;
        String str2 = ((C8347c) obj).f20557b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f20557b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f20557b);
        return "AdToken{id=" + prefixToIndex + ", type=" + mo56929b() + '}';
    }
}
