package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import com.yandex.metrica.impl.p082ob.C2841bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pi */
public class C2436Pi {

    /* renamed from: a */
    private static final Map<String, C2841bi.C2842a> f6487a = Collections.unmodifiableMap(new C2437a());

    /* renamed from: com.yandex.metrica.impl.ob.Pi$a */
    class C2437a extends HashMap<String, C2841bi.C2842a> {
        C2437a() {
            put("wifi", C2841bi.C2842a.WIFI);
            put("cell", C2841bi.C2842a.CELL);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16479a(C2638Ui ui, C2572Tl.C2573a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("requests");
        if (optJSONObject != null && optJSONObject.has("list") && (optJSONArray = optJSONObject.optJSONArray("list")) != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(m8149a(optJSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
            if (!arrayList.isEmpty()) {
                ui.mo16910g((List<C2841bi>) arrayList);
            }
        }
    }

    /* renamed from: a */
    private C2841bi m8149a(JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> keys = jSONObject2.keys();
        while (true) {
            i = 0;
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i)));
                i++;
            }
        }
        String b = C2572Tl.m8530b(jSONObject, "id");
        String b2 = C2572Tl.m8530b(jSONObject, "url");
        String b3 = C2572Tl.m8530b(jSONObject, "method");
        Long valueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i < jSONArray2.length()) {
                arrayList2.add(f6487a.get(jSONArray2.getString(i)));
                i++;
            }
        }
        return new C2841bi(b, b2, b3, arrayList, valueOf, arrayList2);
    }
}
