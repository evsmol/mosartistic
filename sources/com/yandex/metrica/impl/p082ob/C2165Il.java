package com.yandex.metrica.impl.p082ob;

import com.appnext.base.p260a.p263c.C8843d;
import com.yandex.metrica.impl.p082ob.C3454rl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Il */
public class C2165Il extends C3454rl {

    /* renamed from: h */
    public volatile String f5799h = null;

    /* renamed from: i */
    public volatile String f5800i = null;

    C2165Il(String str, String str2, C3454rl.C3456b bVar, int i, boolean z) {
        super(str, str2, (C3454rl.C3456b) null, i, z, C3454rl.C3457c.VIEW, C3454rl.C3455a.WEBVIEW);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo15957a(C3040hl hlVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C8843d.COLUMN_TYPE, "HTML");
            if (hlVar.f8012j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", C1848A2.m6798a(this.f5799h, hlVar.f8017o));
                jSONObject2.putOpt("ou", C1848A2.m6798a(this.f5800i, hlVar.f8017o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15958a() {
        return true;
    }

    public String toString() {
        return "WebViewElement{url='" + this.f5799h + '\'' + ", originalUrl='" + this.f5800i + '\'' + ", mClassName='" + this.f9047a + '\'' + ", mId='" + this.f9048b + '\'' + ", mParseFilterReason=" + this.f9049c + ", mDepth=" + this.f9050d + ", mListItem=" + this.f9051e + ", mViewType=" + this.f9052f + ", mClassType=" + this.f9053g + "} ";
    }
}
