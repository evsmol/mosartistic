package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.yandex.metrica.impl.p082ob.C2076H1;
import com.yandex.metrica.impl.p082ob.C2188Jf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.lh */
public class C3160lh {

    /* renamed from: a */
    private static final Map<C2188Jf.C2193e.C2195b.C2196a, String> f8254a = Collections.unmodifiableMap(new C3161a());

    /* renamed from: b */
    private static final Map<C2076H1.C2080d, String> f8255b = Collections.unmodifiableMap(new C3162b());

    /* renamed from: com.yandex.metrica.impl.ob.lh$a */
    class C3161a extends HashMap<C2188Jf.C2193e.C2195b.C2196a, String> {
        C3161a() {
            put(C2188Jf.C2193e.C2195b.C2196a.COMPLETE, "complete");
            put(C2188Jf.C2193e.C2195b.C2196a.ERROR, "error");
            put(C2188Jf.C2193e.C2195b.C2196a.OFFLINE, "offline");
            put(C2188Jf.C2193e.C2195b.C2196a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lh$b */
    class C3162b extends HashMap<C2076H1.C2080d, String> {
        C3162b() {
            put(C2076H1.C2080d.WIFI, "wifi");
            put(C2076H1.C2080d.CELL, "cell");
            put(C2076H1.C2080d.OFFLINE, "offline");
            put(C2076H1.C2080d.UNDEFINED, AdError.UNDEFINED_DOMAIN);
        }
    }

    /* renamed from: a */
    public String mo17825a(C2188Jf.C2193e.C2195b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", bVar.mo16024d().f5869a);
            jSONObject.putOpt("url", bVar.mo16024d().f5870b);
            jSONObject.putOpt("status", f8254a.get(bVar.mo16028h()));
            jSONObject.putOpt("code", bVar.mo16026f());
            if (!C1848A2.m6811a(bVar.mo16025e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.mo16025e(), 0));
            } else if (!C1848A2.m6811a(bVar.mo16022b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.mo16022b(), 0));
            }
            jSONObject.putOpt("headers", m9989a(bVar.mo16027g()));
            Throwable c = bVar.mo16023c();
            if (c != null) {
                str = c.toString() + "\n" + Log.getStackTraceString(c);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f8255b.get(bVar.mo16016a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    /* renamed from: a */
    private JSONObject m9989a(Map<String, List<String>> map) throws JSONException {
        if (C1848A2.m6815b((Map) map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (!C1848A2.m6814b((Collection) next.getValue())) {
                List<String> list = (List) next.getValue();
                if (list.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i = 0; i < 10; i++) {
                        arrayList.add(list.get(i));
                    }
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(C1848A2.m6798a(str2, 100));
                    }
                }
                jSONObject.putOpt(str, TextUtils.join(",", arrayList2));
            }
        }
        return jSONObject;
    }
}
