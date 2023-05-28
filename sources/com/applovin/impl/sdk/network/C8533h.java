package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.h */
public class C8533h {

    /* renamed from: a */
    private String f21533a;

    /* renamed from: b */
    private String f21534b;

    /* renamed from: c */
    private String f21535c;

    /* renamed from: d */
    private String f21536d;

    /* renamed from: e */
    private Map<String, String> f21537e;

    /* renamed from: f */
    private Map<String, String> f21538f;

    /* renamed from: g */
    private Map<String, Object> f21539g;

    /* renamed from: h */
    private boolean f21540h;

    /* renamed from: i */
    private boolean f21541i;

    /* renamed from: j */
    private boolean f21542j;

    /* renamed from: k */
    private String f21543k;

    /* renamed from: l */
    private int f21544l;

    /* renamed from: com.applovin.impl.sdk.network.h$a */
    public static class C8535a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f21545a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f21546b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f21547c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f21548d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Map<String, String> f21549e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Map<String, String> f21550f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Map<String, Object> f21551g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f21552h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f21553i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f21554j;

        /* renamed from: a */
        public C8535a mo57595a(String str) {
            this.f21545a = str;
            return this;
        }

        /* renamed from: a */
        public C8535a mo57596a(Map<String, String> map) {
            this.f21549e = map;
            return this;
        }

        /* renamed from: a */
        public C8535a mo57597a(boolean z) {
            this.f21552h = z;
            return this;
        }

        /* renamed from: a */
        public C8533h mo57598a() {
            return new C8533h(this);
        }

        /* renamed from: b */
        public C8535a mo57599b(String str) {
            this.f21546b = str;
            return this;
        }

        /* renamed from: b */
        public C8535a mo57600b(Map<String, String> map) {
            this.f21550f = map;
            return this;
        }

        /* renamed from: b */
        public C8535a mo57601b(boolean z) {
            this.f21553i = z;
            return this;
        }

        /* renamed from: c */
        public C8535a mo57602c(String str) {
            this.f21547c = str;
            return this;
        }

        /* renamed from: c */
        public C8535a mo57603c(Map<String, Object> map) {
            this.f21551g = map;
            return this;
        }

        /* renamed from: c */
        public C8535a mo57604c(boolean z) {
            this.f21554j = z;
            return this;
        }

        /* renamed from: d */
        public C8535a mo57605d(String str) {
            this.f21548d = str;
            return this;
        }
    }

    private C8533h(C8535a aVar) {
        this.f21533a = UUID.randomUUID().toString();
        this.f21534b = aVar.f21546b;
        this.f21535c = aVar.f21547c;
        this.f21536d = aVar.f21548d;
        this.f21537e = aVar.f21549e;
        this.f21538f = aVar.f21550f;
        this.f21539g = aVar.f21551g;
        this.f21540h = aVar.f21552h;
        this.f21541i = aVar.f21553i;
        this.f21542j = aVar.f21554j;
        this.f21543k = aVar.f21545a;
        this.f21544l = 0;
    }

    C8533h(JSONObject jSONObject, C8490n nVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : CollectionUtils.map();
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : CollectionUtils.map();
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : CollectionUtils.map();
        this.f21533a = string;
        this.f21543k = string2;
        this.f21535c = string3;
        this.f21536d = string4;
        this.f21537e = synchronizedMap;
        this.f21538f = synchronizedMap2;
        this.f21539g = synchronizedMap3;
        this.f21540h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f21541i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f21542j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f21544l = i;
    }

    /* renamed from: o */
    public static C8535a m25871o() {
        return new C8535a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo57578a() {
        return this.f21534b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo57579b() {
        return this.f21535c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo57580c() {
        return this.f21536d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> mo57581d() {
        return this.f21537e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> mo57582e() {
        return this.f21538f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f21533a.equals(((C8533h) obj).f21533a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, Object> mo57584f() {
        return this.f21539g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo57585g() {
        return this.f21540h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo57586h() {
        return this.f21541i;
    }

    public int hashCode() {
        return this.f21533a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo57588i() {
        return this.f21542j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo57589j() {
        return this.f21543k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo57590k() {
        return this.f21544l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo57591l() {
        this.f21544l++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo57592m() {
        Map<String, String> map = CollectionUtils.map(this.f21537e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f21537e = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public JSONObject mo57593n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f21533a);
        jSONObject.put("communicatorRequestId", this.f21543k);
        jSONObject.put("httpMethod", this.f21534b);
        jSONObject.put("targetUrl", this.f21535c);
        jSONObject.put("backupUrl", this.f21536d);
        jSONObject.put("isEncodingEnabled", this.f21540h);
        jSONObject.put("gzipBodyEncoding", this.f21541i);
        jSONObject.put("attemptNumber", this.f21544l);
        if (this.f21537e != null) {
            jSONObject.put("parameters", new JSONObject(this.f21537e));
        }
        if (this.f21538f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f21538f));
        }
        if (this.f21539g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f21539g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f21533a + '\'' + ", communicatorRequestId='" + this.f21543k + '\'' + ", httpMethod='" + this.f21534b + '\'' + ", targetUrl='" + this.f21535c + '\'' + ", backupUrl='" + this.f21536d + '\'' + ", attemptNumber=" + this.f21544l + ", isEncodingEnabled=" + this.f21540h + ", isGzipBodyEncoding=" + this.f21541i + '}';
    }
}
