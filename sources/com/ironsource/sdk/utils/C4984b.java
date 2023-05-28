package com.ironsource.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.sdk.p144g.C4943f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.utils.b */
public class C4984b {

    /* renamed from: b */
    private static C4984b f12753b;

    /* renamed from: a */
    public SharedPreferences f12754a;

    static {
        C4984b.class.getSimpleName();
    }

    private C4984b(Context context) {
        this.f12754a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C4984b m14516a() {
        C4984b bVar;
        synchronized (C4984b.class) {
            bVar = f12753b;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C4984b m14517a(Context context) {
        C4984b bVar;
        synchronized (C4984b.class) {
            if (f12753b == null) {
                f12753b = new C4984b(context);
            }
            bVar = f12753b;
        }
        return bVar;
    }

    /* renamed from: b */
    public static boolean m14518b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    /* renamed from: c */
    private String m14519c() {
        return this.f12754a.getString("version", "-1");
    }

    /* renamed from: a */
    public final void mo34731a(String str) {
        if (!m14519c().equalsIgnoreCase(str)) {
            SharedPreferences.Editor edit = this.f12754a.edit();
            edit.putString("version", str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo34732a(String str, String str2, String str3) {
        String string = this.f12754a.getString("ssaUserData", (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f12754a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            return edit.commit();
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final List<String> mo34733b() {
        String string = this.f12754a.getString("search_keys", (String) null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4943f fVar = new C4943f(string);
            if (fVar.mo34682a("searchKeys")) {
                try {
                    arrayList.addAll(fVar.mo34679a((JSONArray) fVar.mo34684c("searchKeys")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
