package com.ironsource.mediationsdk.p126a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.a */
abstract class C4524a {

    /* renamed from: a */
    JSONObject f11058a;

    /* renamed from: b */
    int f11059b;

    /* renamed from: c */
    String f11060c;

    /* renamed from: d */
    private final String f11061d = "eventId";

    /* renamed from: e */
    private final String f11062e = "timestamp";

    /* renamed from: f */
    private final String f11063f = "InterstitialEvents";

    /* renamed from: g */
    private final String f11064g = "events";

    /* renamed from: h */
    private final String f11065h = "events";

    C4524a() {
    }

    /* renamed from: a */
    static JSONObject m13121a(C4532c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.mo33672c()) ? new JSONObject(cVar.mo33672c()) : new JSONObject();
            jSONObject.put("eventId", cVar.mo33668a());
            jSONObject.put("timestamp", cVar.mo33671b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo33631a() {
        return TextUtils.isEmpty(this.f11060c) ? mo33634b() : this.f11060c;
    }

    /* renamed from: a */
    public abstract String mo33632a(ArrayList<C4532c> arrayList, JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo33633a(JSONArray jSONArray) {
        try {
            if (this.f11058a == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f11058a.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
            String str = "events";
            if (this.f11059b == 2) {
                str = "InterstitialEvents";
            }
            jSONObject.put(str, jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo33634b();

    /* renamed from: c */
    public abstract String mo33635c();
}
