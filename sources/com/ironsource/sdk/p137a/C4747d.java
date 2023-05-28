package com.ironsource.sdk.p137a;

import android.util.Log;
import com.ironsource.p116a.C4353a;
import com.ironsource.p116a.C4355b;
import com.ironsource.sdk.p137a.C4749f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.d */
public final class C4747d {

    /* renamed from: a */
    private static C4747d f12034a;

    /* renamed from: b */
    private C4355b f12035b;

    private C4747d() {
    }

    /* renamed from: a */
    private static C4747d m13918a() {
        if (f12034a == null) {
            f12034a = new C4747d();
        }
        return f12034a;
    }

    /* renamed from: a */
    public static void m13919a(C4353a aVar, C4744b bVar) {
        if (aVar != null) {
            try {
                m13918a().f12035b = new C4355b(aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m13920a(C4749f.C4750a aVar) {
        m13921a(aVar, (Map<String, Object>) new HashMap());
    }

    /* renamed from: a */
    public static void m13921a(C4749f.C4750a aVar, Map<String, Object> map) {
        C4355b bVar = m13918a().f12035b;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f12059b));
        }
        bVar.mo33049a(aVar.f12058a, map);
    }
}
