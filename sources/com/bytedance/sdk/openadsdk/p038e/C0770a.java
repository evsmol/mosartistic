package com.bytedance.sdk.openadsdk.p038e;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.p264b.C8849c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0666b;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.e.a */
/* compiled from: JsAppAdDownloadManager */
public class C0770a implements C0772c {

    /* renamed from: a */
    private final C0477n f2941a;

    /* renamed from: b */
    private final C0771b f2942b;

    /* renamed from: c */
    private final Map<String, C1008c> f2943c = new HashMap();

    /* renamed from: a */
    public void mo2545a() {
    }

    /* renamed from: b */
    public void mo2549b() {
    }

    /* renamed from: b */
    public void mo2550b(JSONObject jSONObject) {
    }

    private C0770a(C0771b bVar, C0477n nVar) {
        this.f2942b = bVar;
        this.f2941a = nVar;
    }

    /* renamed from: a */
    public static C0770a m3882a(C0771b bVar, C0477n nVar) {
        return new C0770a(bVar, nVar);
    }

    /* renamed from: c */
    public void mo2551c() {
        this.f2943c.clear();
    }

    /* renamed from: a */
    private C0477n m3881a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (jSONObject == null) {
            return null;
        }
        C0477n nVar = new C0477n();
        nVar.mo1412b(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nVar.mo1452m(str);
        }
        if (this.f2941a == null) {
            return nVar;
        }
        if (nVar.mo1380aa() != null) {
            str2 = nVar.mo1380aa().mo1213a();
        }
        if (TextUtils.isEmpty(str2)) {
            return this.f2941a;
        }
        return (this.f2941a.mo1380aa() == null || !str2.equals(this.f2941a.mo1380aa().mo1213a())) ? nVar : this.f2941a;
    }

    /* renamed from: a */
    public void mo2547a(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject(C8849c.DATA)) != null) {
            m3885a(context, m3881a(optJSONObject, str), optJSONObject, i, z);
        }
    }

    /* renamed from: a */
    private void m3885a(Context context, C0477n nVar, JSONObject jSONObject, int i, boolean z) {
        if (context != null && nVar != null && nVar.mo1380aa() != null && jSONObject != null && this.f2942b != null && this.f2943c.get(nVar.mo1380aa().mo1213a()) == null) {
            String a = C0996u.m4615a(i);
            if (!TextUtils.isEmpty(a)) {
                this.f2943c.put(nVar.mo1380aa().mo1213a(), m3883a(context, nVar, jSONObject, a, z));
            }
        }
    }

    /* renamed from: a */
    public void mo2546a(Context context, JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject(C8849c.DATA)) != null) {
            m3884a(context, m3881a(optJSONObject, (String) null), str);
        }
    }

    /* renamed from: a */
    private void m3884a(Context context, C0477n nVar, String str) {
        if (context != null && nVar != null) {
            if (nVar.mo1380aa() == null) {
                C1009d.m4776a(context, nVar, str).mo2930d();
            } else {
                C1008c cVar = this.f2943c.get(nVar.mo1380aa().mo1213a());
                if (cVar != null) {
                    cVar.mo2930d();
                }
            }
            if (context instanceof C0666b) {
                ((C0666b) context).mo158L();
            }
        }
    }

    /* renamed from: a */
    public void mo2548a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject(C8849c.DATA)) != null) {
            m3886a(m3881a(optJSONObject, (String) null), optJSONObject);
        }
    }

    /* renamed from: a */
    private void m3886a(C0477n nVar, JSONObject jSONObject) {
        if (this.f2942b != null && nVar != null && nVar.mo1380aa() != null) {
            String a = nVar.mo1380aa().mo1213a();
            if (this.f2943c.containsKey(a)) {
                this.f2943c.remove(a);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", "success");
                    jSONObject2.put("status", "unsubscribed");
                    jSONObject2.put("appad", jSONObject);
                    this.f2942b.mo2359a("app_ad_event", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private C1008c m3883a(Context context, C0477n nVar, JSONObject jSONObject, String str, boolean z) {
        C1008c a = C1009d.m4776a(context, nVar, str);
        a.mo2927a(true);
        return a;
    }
}
