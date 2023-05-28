package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p122c.C4387a;
import com.ironsource.mediationsdk.utils.C4723k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.m */
public class C4643m {

    /* renamed from: com.ironsource.mediationsdk.m$a */
    interface C4644a {
        /* renamed from: a */
        void mo33540a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.m$b */
    interface C4645b {
        /* renamed from: a */
        void mo33537a();

        /* renamed from: a */
        void mo33538a(String str);
    }

    /* renamed from: a */
    public static JSONObject m13618a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C4387a.C4389a.f10471a.mo33197a(context);
        for (String str : strArr) {
            if (a.has(str)) {
                jSONObject.put(str, a.opt(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m13619a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C4387a.C4389a.f10471a.mo33197a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a.has(str)) {
                jSONObject.put(str, a.opt(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m13620a(String str, ConcurrentHashMap<String, C4495R> concurrentHashMap, C4644a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!C4723k.m13837b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (C4495R next : concurrentHashMap.values()) {
                if (next.mo33609h()) {
                    Map<String, Object> c = next.mo33545c();
                    if (c != null) {
                        hashMap.put(next.mo33612k(), c);
                        sb = new StringBuilder("2");
                    }
                } else if (!next.mo33609h()) {
                    arrayList.add(next.mo33612k());
                    sb = new StringBuilder("1");
                }
                sb.append(next.mo33612k());
                sb.append(",");
                sb2.append(sb.toString());
            }
        }
        aVar.mo33540a(hashMap, arrayList, sb2);
    }

    /* renamed from: a */
    static boolean m13621a(IronSourceBannerLayout ironSourceBannerLayout) {
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public JSONObject mo33970a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C4387a.C4389a.f10471a.mo33197a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a.has(next)) {
                jSONObject.put(next, a.opt(next));
            }
        }
        return jSONObject;
    }
}
