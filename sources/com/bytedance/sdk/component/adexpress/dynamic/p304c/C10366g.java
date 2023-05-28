package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import android.text.TextUtils;
import com.appnext.base.p264b.C8849c;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10345c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10346d;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10348e;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10361e;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.g */
/* compiled from: DynamicLayoutInflater */
public class C10366g {

    /* renamed from: g */
    private static HashMap<String, String> f25720g;

    /* renamed from: a */
    private JSONObject f25721a;

    /* renamed from: b */
    private JSONObject f25722b;

    /* renamed from: c */
    private C10345c f25723c;

    /* renamed from: d */
    private C10367a f25724d;

    /* renamed from: e */
    private C10358b f25725e;

    /* renamed from: f */
    private C10346d f25726f;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f25720g = hashMap;
        hashMap.put("subtitle", "description");
        f25720g.put("source", "source|app.app_name");
        f25720g.put("screenshot", "dynamic_creative.screenshot");
    }

    public C10366g(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f25721a = jSONObject;
        this.f25722b = jSONObject2;
        this.f25723c = new C10345c(jSONObject2);
        this.f25724d = C10367a.m30186a(jSONObject3);
        this.f25726f = C10346d.m29889a(jSONObject4);
    }

    /* renamed from: a */
    public C10351h mo63603a() {
        JSONObject jSONObject;
        this.f25723c.mo63352a();
        try {
            jSONObject = new JSONObject(this.f25726f.f25587b);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C10351h a = mo63605a(C10360d.m30151a(this.f25721a, jSONObject), (C10351h) null);
        m30181a(a);
        C10361e eVar = new C10361e();
        C10361e.C10362a aVar = new C10361e.C10362a();
        aVar.f25709a = this.f25724d.f25727a;
        aVar.f25710b = this.f25724d.f25728b;
        aVar.f25711c = 0.0f;
        eVar.mo63594a(aVar);
        eVar.mo63593a(a, 0.0f, 0.0f);
        eVar.mo63591a();
        if (eVar.f25705a.f25577d == 65536.0f) {
            return null;
        }
        return eVar.f25705a.f25579f;
    }

    /* renamed from: a */
    private void m30181a(C10351h hVar) {
        float f;
        if (hVar != null) {
            int b = C10305b.m29751b(C10303c.m29743a(), (float) C10305b.m29749a(C10303c.m29743a()));
            if (this.f25724d.f25729c) {
                f = this.f25724d.f25727a;
            } else {
                f = Math.min(this.f25724d.f25727a, (float) b);
            }
            if (this.f25724d.f25728b == 0.0f) {
                hVar.mo63557e(f);
                hVar.mo63563i().mo63363e().mo63454i("auto");
                hVar.mo63559f(0.0f);
                return;
            }
            hVar.mo63557e(f);
            hVar.mo63559f(this.f25724d.f25729c ? this.f25724d.f25728b : Math.min(this.f25724d.f25728b, (float) C10305b.m29751b(C10303c.m29743a(), (float) C10305b.m29753c(C10303c.m29743a()))));
            hVar.mo63563i().mo63363e().mo63454i("fixed");
        }
    }

    /* renamed from: a */
    public C10351h mo63605a(JSONObject jSONObject, C10351h hVar) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.f25726f != null) {
                C10358b bVar = new C10358b();
                this.f25725e = bVar;
                JSONObject a = bVar.mo63587a(this.f25726f.f25586a, optInt, jSONObject);
                if (a != null) {
                    jSONObject = a;
                }
            }
        }
        C10351h a2 = mo63604a(jSONObject);
        a2.mo63549b(hVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            a2.mo63546a((List<C10351h>) null);
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i2);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    i = a2.mo63563i().mo63363e().mo63382Q();
                } else {
                    i = optJSONArray2.length();
                }
                for (int i3 = 0; i3 < i; i3++) {
                    C10351h a3 = mo63605a(optJSONArray2.optJSONObject(i3), a2);
                    arrayList.add(a3);
                    arrayList3.add(a3);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            a2.mo63546a((List<C10351h>) arrayList);
        }
        if (arrayList2.size() > 0) {
            a2.mo63551b((List<List<C10351h>>) arrayList2);
        }
        return a2;
    }

    /* renamed from: a */
    public C10351h mo63604a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        C10371j.m30197a(optString, optJSONObject);
        JSONObject a = C10371j.m30194a(optString, C10371j.m30195a(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        C10351h hVar = new C10351h();
        if (TextUtils.isEmpty(optString2)) {
            hVar.mo63550b(String.valueOf(hVar.hashCode()));
        } else {
            hVar.mo63550b(optString2);
        }
        if (optJSONObject != null) {
            hVar.mo63553c((float) optJSONObject.optDouble("x"));
            hVar.mo63555d((float) optJSONObject.optDouble("y"));
            hVar.mo63557e((float) optJSONObject.optDouble(IabUtils.KEY_WIDTH));
            hVar.mo63559f((float) optJSONObject.optDouble(IabUtils.KEY_HEIGHT));
            hVar.mo63561g((float) optJSONObject.optInt("remainWidth"));
            C10348e eVar = new C10348e();
            eVar.mo63356a(optString);
            eVar.mo63359b(optJSONObject.optString(C8849c.DATA));
            eVar.mo63361c(optJSONObject.optString("dataExtraInfo"));
            C10349f c = C10349f.m29903c(optJSONObject);
            eVar.mo63355a(c);
            C10349f c2 = C10349f.m29903c(a);
            if (c2 == null) {
                eVar.mo63358b(c);
            } else {
                eVar.mo63358b(c2);
            }
            m30180a(c);
            m30180a(c2);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.f25722b) != null) {
                m30179a(eVar, jSONObject2.optInt("image_mode"));
            }
            String b = eVar.mo63357b();
            C10349f e = eVar.mo63363e();
            if (f25720g.containsKey(b) && !e.mo63372G()) {
                e.mo63486r(f25720g.get(b));
            }
            if (e.mo63372G()) {
                str = eVar.mo63360c();
            } else {
                str = m30178a(eVar.mo63360c());
            }
            if (C10303c.m29744b()) {
                if (TextUtils.equals(b, "star") || TextUtils.equals(b, "text_star")) {
                    str = m30178a("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(b, "score-count") || TextUtils.equals(b, "score-count-type-1") || TextUtils.equals(b, "score-count-type-2")) {
                    str = m30178a("dynamic_creative.comment_num_i18n|");
                }
            }
            if (TextUtils.isEmpty(m30182b()) || (!TextUtils.equals("logo-union", optString) && !TextUtils.equals("logo", optString))) {
                eVar.mo63359b(str);
            } else {
                eVar.mo63359b(str + "adx:" + m30182b());
            }
            hVar.mo63543a(eVar);
        }
        return hVar;
    }

    /* renamed from: a */
    private void m30179a(C10348e eVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            eVar.mo63356a("video");
            String a = C10371j.m30193a("video");
            eVar.mo63363e().mo63486r(a);
            eVar.mo63364f().mo63486r(a);
            eVar.mo63359b(a);
            eVar.mo63363e().mo63411al();
            return;
        }
        eVar.mo63356a("image");
        String a2 = C10371j.m30193a("image");
        eVar.mo63363e().mo63486r(a2);
        eVar.mo63364f().mo63486r(a2);
        eVar.mo63359b(a2);
        if (a2 != null && (lastIndexOf = a2.lastIndexOf(".")) > 0) {
            String substring = a2.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, m30178a(substring + ".width"));
                jSONObject.put(IabUtils.KEY_HEIGHT, m30178a(substring + ".height"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            eVar.mo63361c(jSONObject.toString());
        }
        eVar.mo63363e().mo63412am();
    }

    /* renamed from: a */
    private String m30178a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f25723c.mo63353b(str2)) {
                String valueOf = String.valueOf(this.f25723c.mo63351a(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    private String m30182b() {
        C10345c cVar = this.f25723c;
        if (cVar == null) {
            return "";
        }
        return String.valueOf(cVar.mo63351a("adx_name"));
    }

    /* renamed from: a */
    private void m30180a(C10349f fVar) {
        if (fVar != null) {
            String s = fVar.mo63487s();
            if (!TextUtils.isEmpty(s)) {
                int indexOf = s.indexOf("{{");
                int indexOf2 = s.indexOf("}}");
                if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
                    String a = m30178a(s.substring(indexOf + 1, indexOf2));
                    if (!TextUtils.isEmpty(a)) {
                        fVar.mo63462k((s.substring(0, indexOf) + s.substring(indexOf2 + 2)) + a);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.g$a */
    /* compiled from: DynamicLayoutInflater */
    static class C10367a {

        /* renamed from: a */
        float f25727a;

        /* renamed from: b */
        float f25728b;

        /* renamed from: c */
        boolean f25729c;

        /* renamed from: a */
        public static C10367a m30186a(JSONObject jSONObject) {
            C10367a aVar = new C10367a();
            if (jSONObject != null) {
                aVar.f25727a = (float) jSONObject.optDouble(IabUtils.KEY_WIDTH);
                aVar.f25728b = (float) jSONObject.optDouble(IabUtils.KEY_HEIGHT);
                aVar.f25729c = jSONObject.optBoolean("isLandscape");
            }
            return aVar;
        }
    }
}
