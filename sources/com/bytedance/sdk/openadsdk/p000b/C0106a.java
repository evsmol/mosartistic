package com.bytedance.sdk.openadsdk.p000b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.p001a.C0109a;
import com.bytedance.sdk.openadsdk.p000b.p001a.C0110b;
import com.bytedance.sdk.openadsdk.p000b.p001a.C0111c;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0995t;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.plus.PlusShare;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.a */
/* compiled from: AdEvent */
public class C0106a implements C0147k {

    /* renamed from: a */
    public final String f423a;

    /* renamed from: b */
    protected final JSONObject f424b;

    /* renamed from: c */
    private AtomicBoolean f425c = new AtomicBoolean(false);

    /* renamed from: d */
    private JSONObject f426d = new JSONObject();

    /* renamed from: e */
    private String f427e;

    /* renamed from: f */
    private String f428f;

    /* renamed from: g */
    private String f429g;

    /* renamed from: h */
    private String f430h;

    /* renamed from: i */
    private String f431i;

    /* renamed from: j */
    private C0109a f432j;

    /* renamed from: k */
    private String f433k;

    /* renamed from: l */
    private String f434l;

    /* renamed from: m */
    private String f435m;

    /* renamed from: n */
    private String f436n;

    C0106a(C0107a aVar) {
        this.f423a = TextUtils.isEmpty(aVar.f437a) ? C0984l.m4553a() : aVar.f437a;
        this.f432j = aVar.f449m;
        this.f434l = aVar.f441e;
        this.f427e = aVar.f438b;
        this.f428f = aVar.f439c;
        this.f429g = TextUtils.isEmpty(aVar.f440d) ? "app_union" : aVar.f440d;
        this.f433k = aVar.f445i;
        this.f430h = aVar.f442f;
        this.f431i = aVar.f443g;
        this.f435m = aVar.f446j;
        this.f436n = aVar.f447k;
        this.f426d = aVar.f444h = aVar.f444h != null ? aVar.f444h : new JSONObject();
        this.f424b = new JSONObject();
        if (!TextUtils.isEmpty(aVar.f447k)) {
            try {
                this.f424b.put("app_log_url", aVar.f447k);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    C0106a(String str, JSONObject jSONObject) {
        this.f423a = str;
        this.f424b = jSONObject;
    }

    /* renamed from: a */
    public static C0106a m433a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("localId", (String) null);
            JSONObject optJSONObject = jSONObject.optJSONObject("event");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                return new C0106a(optString, optJSONObject);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: f */
    private void m434f() throws JSONException {
        this.f424b.putOpt("app_log_url", this.f436n);
        this.f424b.putOpt("tag", this.f427e);
        this.f424b.putOpt(PlusShare.KEY_CALL_TO_ACTION_LABEL, this.f428f);
        this.f424b.putOpt("category", this.f429g);
        if (!TextUtils.isEmpty(this.f430h)) {
            try {
                this.f424b.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.f430h)));
            } catch (NumberFormatException unused) {
                this.f424b.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.f431i)) {
            try {
                this.f424b.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f431i)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f434l)) {
            this.f424b.putOpt("log_extra", this.f434l);
        }
        if (!TextUtils.isEmpty(this.f433k)) {
            try {
                this.f424b.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.f433k)));
            } catch (NumberFormatException unused3) {
            }
        }
        this.f424b.putOpt("is_ad_event", "1");
        try {
            this.f424b.putOpt("nt", this.f435m);
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f426d.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f424b.putOpt(next, this.f426d.opt(next));
        }
    }

    /* renamed from: a */
    public String mo305a() {
        if (TextUtils.isEmpty(this.f423a) || this.f424b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.f423a);
            jSONObject.put("event", mo306b());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public JSONObject mo306b() {
        if (this.f425c.get()) {
            return this.f424b;
        }
        try {
            m434f();
            if (this.f432j != null) {
                this.f432j.mo320a(this.f424b);
            }
            this.f425c.set(true);
        } catch (Throwable th) {
            C10638l.m31237b("AdEvent", th);
        }
        return this.f424b;
    }

    /* renamed from: c */
    public JSONObject mo307c() {
        JSONObject b = mo306b();
        try {
            JSONObject jSONObject = new JSONObject(b.toString());
            jSONObject.remove("app_log_url");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return b;
        }
    }

    /* renamed from: d */
    public String mo308d() {
        return this.f423a;
    }

    /* renamed from: e */
    public boolean mo309e() {
        JSONObject jSONObject = this.f424b;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(PlusShare.KEY_CALL_TO_ACTION_LABEL);
        if (!TextUtils.isEmpty(optString)) {
            return C0112b.f453a.contains(optString);
        }
        if (TextUtils.isEmpty(this.f428f)) {
            return false;
        }
        return C0112b.f453a.contains(this.f428f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.a$a */
    /* compiled from: AdEvent */
    public static final class C0107a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f437a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f438b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f439c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f440d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f441e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f442f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f443g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public JSONObject f444h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f445i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final String f446j = String.valueOf(NetworkTools.m4450a(C0558m.m2663a()));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f447k;

        /* renamed from: l */
        private C0110b f448l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C0109a f449m;

        /* renamed from: a */
        public C0107a mo310a(String str) {
            this.f447k = str;
            return this;
        }

        /* renamed from: b */
        public C0107a mo313b(String str) {
            this.f438b = str;
            return this;
        }

        /* renamed from: c */
        public C0107a mo314c(String str) {
            this.f439c = str;
            return this;
        }

        /* renamed from: d */
        public C0107a mo315d(String str) {
            this.f440d = str;
            return this;
        }

        /* renamed from: e */
        public C0107a mo316e(String str) {
            this.f441e = str;
            return this;
        }

        /* renamed from: f */
        public C0107a mo317f(String str) {
            this.f442f = str;
            return this;
        }

        /* renamed from: g */
        public C0107a mo318g(String str) {
            this.f443g = str;
            return this;
        }

        /* renamed from: a */
        public C0107a mo311a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f444h = jSONObject;
            return this;
        }

        /* renamed from: a */
        public void mo312a(C0109a aVar) {
            this.f449m = aVar;
            final C0106a aVar2 = new C0106a(this);
            try {
                if (this.f448l != null) {
                    this.f448l.mo321a(aVar2.f424b);
                } else {
                    new C0111c().mo321a(aVar2.f424b);
                }
            } catch (Throwable th) {
                C10638l.m31237b("AdEvent", th);
            }
            if (C0934b.m4334c()) {
                C0995t.m4609b(new C10618g("dispatchEvent") {
                    public void run() {
                        C0558m.m2668c().mo394a(aVar2);
                    }
                });
            } else {
                C0558m.m2668c().mo394a(aVar2);
            }
        }
    }
}
