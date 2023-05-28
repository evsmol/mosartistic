package com.bytedance.sdk.component.adexpress.p294a.p297c;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10363f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.c.a */
/* compiled from: TempPkgModel */
public class C10277a {

    /* renamed from: a */
    private String f25376a;

    /* renamed from: b */
    private String f25377b;

    /* renamed from: c */
    private String f25378c;

    /* renamed from: d */
    private String f25379d;

    /* renamed from: e */
    private List<C10278a> f25380e;

    /* renamed from: a */
    public String mo63121a() {
        return this.f25376a;
    }

    /* renamed from: a */
    public void mo63122a(String str) {
        this.f25376a = str;
    }

    /* renamed from: b */
    public String mo63124b() {
        return this.f25377b;
    }

    /* renamed from: b */
    public void mo63125b(String str) {
        this.f25377b = str;
    }

    /* renamed from: c */
    public String mo63126c() {
        return this.f25378c;
    }

    /* renamed from: c */
    public void mo63127c(String str) {
        this.f25378c = str;
    }

    /* renamed from: d */
    public String mo63128d() {
        return this.f25379d;
    }

    /* renamed from: d */
    public void mo63129d(String str) {
        this.f25379d = str;
    }

    /* renamed from: e */
    public List<C10278a> mo63130e() {
        if (this.f25380e == null) {
            this.f25380e = new ArrayList();
        }
        return this.f25380e;
    }

    /* renamed from: a */
    public void mo63123a(List<C10278a> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f25380e = list;
    }

    /* renamed from: f */
    public boolean mo63131f() {
        return !TextUtils.isEmpty(mo63126c()) && !TextUtils.isEmpty(mo63124b()) && !TextUtils.isEmpty(mo63121a());
    }

    /* renamed from: g */
    public String mo63132g() {
        if (!mo63131f()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(AppMeasurementSdk.ConditionalUserProperty.NAME, mo63121a());
            jSONObject.putOpt("version", mo63124b());
            jSONObject.putOpt("main", mo63126c());
            jSONObject.putOpt("fallback", mo63128d());
            JSONArray jSONArray = new JSONArray();
            if (mo63130e() != null) {
                for (C10278a next : mo63130e()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", next.mo63133a());
                    jSONObject2.putOpt("md5", next.mo63136b());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(next.mo63138c()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.a.c.a$a */
    /* compiled from: TempPkgModel */
    public static class C10278a {

        /* renamed from: a */
        private String f25381a;

        /* renamed from: b */
        private String f25382b;

        /* renamed from: c */
        private int f25383c;

        public boolean equals(Object obj) {
            if (!(obj instanceof C10278a)) {
                return super.equals(obj);
            }
            String str = this.f25381a;
            return str != null && str.equals(((C10278a) obj).mo63133a());
        }

        /* renamed from: a */
        public String mo63133a() {
            return this.f25381a;
        }

        /* renamed from: a */
        public void mo63135a(String str) {
            this.f25381a = str;
        }

        /* renamed from: b */
        public String mo63136b() {
            return this.f25382b;
        }

        /* renamed from: b */
        public void mo63137b(String str) {
            this.f25382b = str;
        }

        /* renamed from: c */
        public int mo63138c() {
            return this.f25383c;
        }

        /* renamed from: a */
        public void mo63134a(int i) {
            this.f25383c = i;
        }
    }

    /* renamed from: e */
    public static C10277a m29547e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m29546a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C10277a m29546a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C10277a aVar = new C10277a();
        aVar.mo63122a(jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        aVar.mo63125b(jSONObject.optString("version"));
        aVar.mo63127c(jSONObject.optString("main"));
        String optString = jSONObject.optString("fallback_optimize");
        aVar.mo63129d(optString);
        C10363f.m30163a(optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C10278a aVar2 = new C10278a();
                aVar2.mo63135a(optJSONObject.optString("url"));
                aVar2.mo63137b(optJSONObject.optString("md5"));
                aVar2.mo63134a(optJSONObject.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(aVar2);
            }
        }
        aVar.mo63123a((List<C10278a>) arrayList);
        if (!aVar.mo63131f()) {
            return null;
        }
        return aVar;
    }
}
