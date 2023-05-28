package com.appnext.base.p264b;

import android.os.PersistableBundle;
import com.appnext.base.p260a.p262b.C8838c;
import org.json.JSONObject;

/* renamed from: com.appnext.base.b.c */
public final class C8849c {
    public static final String DATA = "data";
    public static final String KEY = "key";
    public static final String STATUS = "status";

    /* renamed from: eO */
    public static final String f22408eO = "cycle";

    /* renamed from: eP */
    public static final String f22409eP = "cycle_type";

    /* renamed from: eQ */
    public static final String f22410eQ = "sample";

    /* renamed from: eR */
    public static final String f22411eR = "sample_type";

    /* renamed from: eS */
    public static final String f22412eS = "service_key";

    /* renamed from: e */
    public static PersistableBundle m26674e(C8838c cVar) {
        PersistableBundle persistableBundle = new PersistableBundle();
        try {
            String str = "";
            persistableBundle.putString("key", cVar.getKey() != null ? cVar.getKey() : str);
            persistableBundle.putString(f22408eO, cVar.mo58705an() != null ? cVar.mo58705an() : str);
            persistableBundle.putString(f22409eP, cVar.mo58706ao() != null ? cVar.mo58706ao() : str);
            cVar.mo58703al();
            persistableBundle.putString(f22410eQ, cVar.mo58703al());
            persistableBundle.putString(f22411eR, cVar.mo58704am() != null ? cVar.mo58704am() : str);
            persistableBundle.putString("service_key", cVar.mo58707ap() != null ? cVar.mo58707ap() : str);
            if (cVar.mo58702ak() != null) {
                str = cVar.mo58702ak();
            }
            persistableBundle.putString("status", str);
            if (cVar.mo58708aq() != null) {
                persistableBundle.putString(DATA, cVar.mo58708aq().toString());
            }
            JSONObject aq = cVar.mo58708aq();
            if (aq != null) {
                persistableBundle.putString(DATA, aq.toString());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return persistableBundle;
    }

    /* renamed from: b */
    public static C8838c m26672b(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            return null;
        }
        String string = persistableBundle.getString("key", "");
        String string2 = persistableBundle.getString(f22408eO, "");
        String string3 = persistableBundle.getString(f22409eP, "");
        return new C8838c(persistableBundle.getString("status", ""), persistableBundle.getString(f22410eQ, ""), persistableBundle.getString(f22411eR, ""), string2, string3, string, persistableBundle.getString("service_key", ""), persistableBundle.getString(DATA, (String) null));
    }

    /* renamed from: c */
    public static C8838c m26673c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        try {
            String string = jSONObject2.has("key") ? jSONObject2.getString("key") : null;
            String string2 = jSONObject2.has(f22408eO) ? jSONObject2.getString(f22408eO) : null;
            String string3 = jSONObject2.has(f22409eP) ? jSONObject2.getString(f22409eP) : null;
            return new C8838c(jSONObject2.has("status") ? jSONObject2.getString("status") : null, jSONObject2.has(f22410eQ) ? jSONObject2.getString(f22410eQ) : null, jSONObject2.has(f22411eR) ? jSONObject2.getString(f22411eR) : null, string2, string3, string, jSONObject2.has("service_key") ? jSONObject2.getString("service_key") : null, jSONObject2.has(DATA) ? jSONObject2.getString(DATA) : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
