package com.apm.insight.entity;

import android.text.TextUtils;
import com.apm.insight.C6606g;
import com.apm.insight.CrashType;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.p178l.C6693v;
import com.apm.insight.runtime.C6718a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.b */
public final class C6595b {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C6606g> f14151a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static ConcurrentHashMap<Integer, C6606g> f14152b = new ConcurrentHashMap<>();

    /* renamed from: com.apm.insight.entity.b$a */
    public interface C6596a {
        /* renamed from: a */
        void mo51989a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static File m16198a(File file) {
        return new File(file, "all_data.json");
    }

    /* renamed from: a */
    public static JSONArray m16199a() {
        C6606g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C6606g> it = f14151a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.mo52093c());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m16200a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C6606g> it = f14151a.iterator();
        while (true) {
            if (it.hasNext()) {
                C6606g next = it.next();
                if (next != null && next.mo52091a(obj)) {
                    jSONArray.put(next.mo52090a(CrashType.JAVA, (JSONArray) null));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m16201a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        Iterator<C6606g> it = f14151a.iterator();
        while (it.hasNext()) {
            C6606g next = it.next();
            if (next != null && next.mo52091a(obj)) {
                JSONArray a = next.mo52087a(stackTraceElementArr, th);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", next.mo52092b());
                    jSONObject.put("lines", a);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONArray m16202a(String str) {
        C6606g next;
        JSONArray jSONArray = new JSONArray();
        String[] split = str.split("\n");
        Iterator<C6606g> it = f14151a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (C6718a.m16799b(next.mo52092b())) {
                JSONArray a = next.mo52088a(split);
                if (!C6678l.m16558a(a)) {
                    jSONArray.put(next.mo52090a(CrashType.ANR, a));
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m16203a(String str, String str2, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("header")) != null && C6718a.m16801c(String.valueOf(optJSONObject.opt("aid")))) {
                if (!TextUtils.isEmpty(optJSONObject.optString("package"))) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("so_list");
                    if (!C6678l.m16558a(optJSONArray)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= optJSONArray.length()) {
                                break;
                            } else if (str.contains(optJSONArray.optString(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                jSONArray2.put(optJSONObject2);
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONArray m16204a(Throwable th, Thread thread, File file) {
        C6606g next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] b = C6693v.m16676b(th);
        Iterator<C6606g> it = f14151a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (!C6718a.m16797a(next.mo52092b())) {
                C6688q.m16625a((Object) "not enable javaCrash aid: " + next.mo52092b());
            } else {
                JSONArray a = next.mo52087a(b, th);
                if (!C6678l.m16558a(a)) {
                    jSONArray.put(next.mo52090a(CrashType.JAVA, a));
                }
            }
        }
        if (C6678l.m16558a(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                C6675i.m16526a(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m16205a(C6606g gVar) {
        f14151a.add(gVar);
        if (gVar.mo52094d()) {
            f14152b.put(4444, gVar);
        }
    }

    /* renamed from: a */
    public static void m16206a(JSONObject jSONObject, JSONArray jSONArray, C6596a aVar) {
        JSONObject optJSONObject;
        C6688q.m16625a((Object) "uploadFromFile with allData " + jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        while (i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null) {
            if (C6678l.m16553a(optJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                C6594a.m16169b(jSONObject2, jSONObject);
                C6594a.m16169b(jSONObject2, optJSONObject);
                aVar.mo51989a(jSONObject2);
            } else {
                jSONArray2.put(optJSONObject);
            }
            i++;
        }
        if (jSONArray2.length() != 0) {
            JSONObject jSONObject3 = new JSONObject();
            C6594a.m16169b(jSONObject3, jSONObject);
            try {
                jSONObject3.put("all_data", jSONArray2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            aVar.mo51989a(jSONObject3);
        }
    }

    /* renamed from: b */
    public static String m16207b(Object obj) {
        Iterator<C6606g> it = f14151a.iterator();
        while (it.hasNext()) {
            C6606g next = it.next();
            if (next != null && next.mo52091a(obj)) {
                return next.mo52092b();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m16208b() {
        C6606g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C6606g> it = f14151a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.mo52089a((CrashType) null));
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static int m16209c() {
        return f14151a.size();
    }
}
