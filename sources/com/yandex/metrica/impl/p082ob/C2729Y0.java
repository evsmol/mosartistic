package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.yandex.metrica.impl.p082ob.C3368q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Y0 */
public final class C2729Y0 {

    /* renamed from: a */
    private final JSONObject f7215a = new JSONObject();

    /* renamed from: b */
    private final Context f7216b;

    /* renamed from: c */
    private final C3368q0 f7217c;

    public C2729Y0(Context context, C3368q0 q0Var) {
        this.f7216b = context;
        this.f7217c = q0Var;
    }

    /* renamed from: a */
    static <T> T m8907a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return jSONObject.get(str);
    }

    /* renamed from: d */
    private void m8908d() throws JSONException {
        if (C1848A2.m6808a(24)) {
            JSONObject jSONObject = (JSONObject) m8907a(this.f7215a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) C1848A2.m6794a(new C1879B2(1), this.f7216b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) C1848A2.m6794a(new C1879B2(2), this.f7216b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2729Y0 mo17072b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) m8907a(this.f7215a, "dfid", new JSONObject());
        if (C1848A2.m6808a(21)) {
            jSONArray = new JSONArray(Build.SUPPORTED_ABIS);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = Build.CPU_ABI;
            if (!DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(str)) {
                arrayList.add(str);
            }
            String str2 = Build.CPU_ABI2;
            if (!DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(str2)) {
                arrayList.add(str2);
            }
            jSONArray = new JSONArray(arrayList);
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    /* renamed from: c */
    public C2729Y0 mo17073c() {
        try {
            JSONObject jSONObject = (JSONObject) m8907a(this.f7215a, "dfid", new JSONObject());
            C3368q0.C3369a a = this.f7217c.mo18063a();
            jSONObject.put("tds", a.f8674a);
            jSONObject.put("fds", a.f8675b);
            ((JSONObject) m8907a(this.f7215a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            m8908d();
            ((JSONObject) m8907a(this.f7215a, "dfid", new JSONObject())).put("lc", C2572Tl.m8534b((List<?>) C2980g1.m9593a(this.f7216b).mo17618a()));
        } catch (Throwable unused) {
        }
        try {
            Object obj = Class.forName("kotlin.KotlinVersion").getDeclaredField("CURRENT").get((Object) null);
            int intValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue3 = ((Integer) obj.getClass().getDeclaredMethod("getPatch", new Class[0]).invoke(obj, new Object[0])).intValue();
            ((JSONObject) m8907a(this.f7215a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", intValue).put("minor", intValue2).put("patch", intValue3));
        } catch (ClassNotFoundException unused2) {
        }
        return this;
    }

    public String toString() {
        return this.f7215a.toString();
    }

    /* renamed from: a */
    public String mo17071a() {
        return this.f7215a.toString();
    }
}
