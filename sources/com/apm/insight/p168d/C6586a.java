package com.apm.insight.p168d;

import com.apm.insight.C6600f;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.p177k.C6645d;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.p179a.C6729f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.d.a */
public class C6586a {
    /* renamed from: a */
    public static void m16118a(String str) {
        m16119a(str, (Map<? extends String, ? extends String>) null, (Map<String, String>) null, (C6600f) null);
    }

    /* renamed from: a */
    public static void m16119a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C6600f fVar) {
        m16120a(str, map, map2, (Map<String, String>) null, fVar);
    }

    /* renamed from: a */
    public static void m16120a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C6600f fVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            final String str2 = str;
            final Map<? extends String, ? extends String> map4 = map;
            final Map<String, String> map5 = map2;
            final Map<String, String> map6 = map3;
            final C6600f fVar2 = fVar;
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                    boolean z;
                    try {
                        C6594a a = C6729f.m16893a().mo52278a(CrashType.DART, C6594a.m16162a(currentTimeMillis, C6617h.m16313g(), str2));
                        if (map4 != null) {
                            JSONObject optJSONObject = a.mo52066h().optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            C6594a.m16166a(optJSONObject, (Map<? extends String, ? extends String>) map4);
                            a.mo52052a("custom", (Object) optJSONObject);
                        }
                        if (map5 != null) {
                            JSONObject optJSONObject2 = a.mo52066h().optJSONObject("custom_long");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            C6594a.m16166a(optJSONObject2, (Map<? extends String, ? extends String>) map5);
                            a.mo52052a("custom_long", (Object) optJSONObject2);
                        }
                        if (map6 != null) {
                            JSONObject optJSONObject3 = a.mo52066h().optJSONObject("filters");
                            if (optJSONObject3 == null) {
                                optJSONObject3 = new JSONObject();
                                a.mo52052a("filters", (Object) optJSONObject3);
                            }
                            C6594a.m16166a(optJSONObject3, (Map<? extends String, ? extends String>) map6);
                        }
                        z = C6645d.m16403a().mo52133a(currentTimeMillis, a.mo52066h());
                    } catch (Throwable unused) {
                        z = false;
                    }
                    C6600f fVar = fVar2;
                    if (fVar != null) {
                        try {
                            fVar.mo52083a(z);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
