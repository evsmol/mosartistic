package com.ironsource.sdk.p137a;

import android.util.Base64;
import com.appnext.base.p264b.C8849c;
import com.ironsource.p116a.C4358d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.a.c */
public final class C4746c implements C4358d {
    /* renamed from: a */
    public final String mo33052a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", new Object[]{C8849c.DATA, Base64.encodeToString(new JSONObject().put("table", "supersonic.adunitanalytics.ad_unit_events").put(C8849c.DATA, new JSONObject(map)).toString().getBytes(), 2)});
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
