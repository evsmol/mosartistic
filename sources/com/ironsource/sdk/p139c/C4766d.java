package com.ironsource.sdk.p139c;

import com.google.android.gms.plus.PlusShare;
import com.ironsource.sdk.C4742a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.ironsource.sdk.c.d */
public class C4766d {

    /* renamed from: a */
    public static final String f12112a = C4766d.class.getSimpleName();

    /* renamed from: c */
    private static C4766d f12113c = null;

    /* renamed from: b */
    public Map<String, C4768e> f12114b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static synchronized C4766d m13973a() {
        C4766d dVar;
        synchronized (C4766d.class) {
            if (f12113c == null) {
                f12113c = new C4766d();
            }
            dVar = f12113c;
        }
        return dVar;
    }

    /* renamed from: a */
    public static String m13974a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    /* renamed from: b */
    public static boolean m13976b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private static C4742a m13977d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get(IabUtils.KEY_HEIGHT).toString();
            String obj2 = jSONObject2.get(IabUtils.KEY_WIDTH).toString();
            return new C4742a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get(PlusShare.KEY_CALL_TO_ACTION_LABEL).toString());
        } catch (Exception unused) {
            return new C4742a();
        }
    }

    /* renamed from: a */
    public final C4768e mo34275a(String str) {
        if (str.isEmpty() || !this.f12114b.containsKey(str)) {
            return null;
        }
        return this.f12114b.get(str);
    }

    /* renamed from: c */
    public C4742a mo34276c(JSONObject jSONObject) {
        C4742a aVar = new C4742a();
        try {
            return m13977d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
