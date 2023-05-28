package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10376b;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.p328f.C10615e;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.h */
/* compiled from: DynamicNativeParser */
public class C10368h implements C10370i {

    /* renamed from: a */
    private C10376b f25730a;

    /* renamed from: a */
    public void mo63597a(C10376b bVar) {
        this.f25730a = bVar;
    }

    /* renamed from: a */
    public void mo63596a(final C10296l lVar) {
        if (lVar.mo63187m() == 1) {
            m30188b(lVar);
        } else {
            C10615e.m31156a().execute(new Runnable() {
                public void run() {
                    C10368h.this.m30188b(lVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30188b(C10296l lVar) {
        try {
            JSONObject a = lVar.mo63175a();
            JSONObject jSONObject = new JSONObject(a.optString("template_Plugin"));
            JSONObject optJSONObject = a.optJSONObject("creative");
            C10351h a2 = new C10366g(jSONObject, optJSONObject, a.optJSONObject("AdSize"), new JSONObject(a.optString("diff_template_Plugin"))).mo63603a();
            a2.mo63545a(new JSONObject(optJSONObject.optString("dynamic_creative")).optString("color"));
            this.f25730a.mo63277a(a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
