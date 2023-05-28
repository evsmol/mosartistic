package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Xd */
public final class C2716Xd implements C2672W<C2923ee> {
    public Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            C3015h2.m9664b("Tracking id is empty", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                C3015h2.m9664b("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                C3015h2.m9664b("Additional params are empty", new Object[0]);
                return null;
            }
            C3015h2.m9658a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C2923ee(asString, jSONObject, true, false, C3522u0.RETAIL);
        } catch (Throwable th) {
            C3015h2.m9659a(th, "Could not parse additional parameters", new Object[0]);
            return null;
        }
    }
}
