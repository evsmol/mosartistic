package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Xi */
public class C2722Xi {

    /* renamed from: a */
    private C2862ca f7200a;

    /* renamed from: b */
    private final C2777Zi f7201b;

    public C2722Xi() {
        this(new C2862ca(), new C2777Zi());
    }

    /* renamed from: a */
    public C3040hl mo17066a(JSONObject jSONObject, String str, C2121If.C2152v vVar) {
        C2862ca caVar = this.f7200a;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            vVar.f5728a = optJSONObject.optBoolean("text_size_collecting", vVar.f5728a);
            vVar.f5729b = optJSONObject.optBoolean("relative_text_size_collecting", vVar.f5729b);
            vVar.f5730c = optJSONObject.optBoolean("text_visibility_collecting", vVar.f5730c);
            vVar.f5731d = optJSONObject.optBoolean("text_style_collecting", vVar.f5731d);
            vVar.f5736i = optJSONObject.optBoolean("info_collecting", vVar.f5736i);
            vVar.f5737j = optJSONObject.optBoolean("non_content_view_collecting", vVar.f5737j);
            vVar.f5738k = optJSONObject.optBoolean("text_length_collecting", vVar.f5738k);
            vVar.f5739l = optJSONObject.optBoolean("view_hierarchical", vVar.f5739l);
            vVar.f5741n = optJSONObject.optBoolean("ignore_filtered", vVar.f5741n);
            vVar.f5742o = optJSONObject.optBoolean("web_view_urls_collecting", vVar.f5742o);
            vVar.f5732e = optJSONObject.optInt("too_long_text_bound", vVar.f5732e);
            vVar.f5733f = optJSONObject.optInt("truncated_text_bound", vVar.f5733f);
            vVar.f5734g = optJSONObject.optInt("max_entities_count", vVar.f5734g);
            vVar.f5735h = optJSONObject.optInt("max_full_content_length", vVar.f5735h);
            vVar.f5743p = optJSONObject.optInt("web_view_url_limit", vVar.f5743p);
            vVar.f5740m = this.f7201b.mo17122a(optJSONObject.optJSONArray("filters"));
        }
        return caVar.toModel(vVar);
    }

    C2722Xi(C2862ca caVar, C2777Zi zi) {
        this.f7200a = caVar;
        this.f7201b = zi;
    }
}
