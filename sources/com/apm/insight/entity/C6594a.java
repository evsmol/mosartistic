package com.apm.insight.entity;

import android.content.Context;
import com.apm.insight.C6617h;
import com.apm.insight.nativecrash.C6700b;
import com.apm.insight.nativecrash.C6707c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.p178l.C6693v;
import com.apm.insight.runtime.p179a.C6720b;
import com.appnext.base.p264b.C8849c;
import com.appnext.base.p264b.C8850d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.a */
public class C6594a {

    /* renamed from: a */
    protected JSONObject f14149a;

    /* renamed from: b */
    protected Header f14150b;

    public C6594a() {
        this.f14149a = new JSONObject();
    }

    public C6594a(JSONObject jSONObject) {
        this.f14149a = jSONObject;
    }

    /* renamed from: a */
    public static C6594a m16162a(long j, Context context, String str) {
        C6594a aVar = new C6594a();
        aVar.mo52052a("is_dart", (Object) 1);
        aVar.mo52052a("crash_time", (Object) Long.valueOf(j));
        aVar.mo52052a("process_name", (Object) C6662a.m16480c(context));
        aVar.mo52052a(C8849c.DATA, (Object) str);
        C6662a.m16473a(context, aVar.mo52066h());
        return aVar;
    }

    /* renamed from: a */
    public static C6594a m16163a(long j, Context context, Thread thread, Throwable th) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        C6594a aVar = new C6594a();
        aVar.mo52052a("isJava", (Object) 1);
        aVar.mo52052a(C8849c.DATA, (Object) C6693v.m16658a(th));
        aVar.mo52052a("crash_time", (Object) Long.valueOf(j));
        aVar.mo52052a("process_name", (Object) C6662a.m16480c(context));
        if (!C6662a.m16479b(context)) {
            aVar.mo52052a("remote_process", (Object) 1);
        }
        String name = thread == null ? null : thread.getName();
        if (name != null) {
            aVar.mo52052a("crash_thread_name", (Object) name);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m16164a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, str3);
        }
    }

    /* renamed from: a */
    public static void m16165a(JSONObject jSONObject, Throwable th) {
        String str = "npth_err_info";
        if (jSONObject.opt(str) != null) {
            int i = 0;
            while (i < 5) {
                if (jSONObject.opt(str + i) == null) {
                    str = str + i;
                } else {
                    i++;
                }
            }
            return;
        }
        try {
            jSONObject.put(str, C6693v.m16658a(th));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16166a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16167a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        try {
            jSONObject3.put("storage", jSONObject4);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject4.optLong("inner_free");
        long optLong2 = jSONObject4.optLong("sdcard_free");
        long optLong3 = jSONObject4.optLong("inner_free_real");
        String str = "1M - 64M";
        String str2 = optLong <= 1024 ? "0 - 1K" : optLong <= 65536 ? "1K - 64K" : optLong <= 524288 ? "64K - 512K" : optLong <= C8850d.f22423fc ? "512K - 1M" : optLong <= 67108864 ? str : "64M - ";
        String str3 = optLong3 <= 1024 ? "0 - 1K" : optLong3 <= 65536 ? "1K - 64K" : optLong3 <= 524288 ? "64K - 512K" : optLong3 <= C8850d.f22423fc ? "512K - 1M" : optLong3 <= 67108864 ? str : "64M - ";
        if (optLong2 <= 1024) {
            str = "0 - 1K";
        } else if (optLong2 <= 65536) {
            str = "1K - 64K";
        } else if (optLong2 <= 524288) {
            str = "64K - 512K";
        } else if (optLong2 <= C8850d.f22423fc) {
            str = "512K - 1M";
        } else if (optLong2 > 67108864) {
            str = "64M - ";
        }
        m16164a(jSONObject3, "filters", "inner_free", str2);
        m16164a(jSONObject3, "filters", "inner_free_real", str3);
        m16164a(jSONObject3, "filters", "sdcard_free", str);
    }

    /* renamed from: a */
    public static boolean m16168a(String str) {
        return C6685o.m16600d(str).exists();
    }

    /* renamed from: b */
    public static void m16169b(JSONObject jSONObject, JSONObject jSONObject2) {
        Object opt;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt2 = jSONObject.opt(next);
                    if (opt2 == null) {
                        opt = jSONObject2.opt(next);
                    } else {
                        if (opt2 instanceof JSONObject) {
                            jSONObject3 = jSONObject.getJSONObject(next);
                            jSONObject4 = jSONObject2.getJSONObject(next);
                        } else if (opt2 instanceof JSONArray) {
                            JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                            if (optJSONArray != null) {
                                JSONArray jSONArray = (JSONArray) opt2;
                                if (jSONArray.length() != 1 || !(jSONArray.opt(0) instanceof JSONObject) || !(optJSONArray.opt(0) instanceof JSONObject)) {
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        jSONArray.put(optJSONArray.get(i));
                                    }
                                } else {
                                    jSONObject3 = jSONArray.getJSONObject(0);
                                    jSONObject4 = optJSONArray.getJSONObject(0);
                                }
                            }
                        } else {
                            opt = jSONObject2.opt(next);
                        }
                        m16169b(jSONObject3, jSONObject4);
                    }
                    jSONObject.put(next, opt);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static boolean m16170b(String str) {
        return ((long) C6707c.m16777c(str)) > C6700b.m16746i();
    }

    /* renamed from: c */
    public static boolean m16171c(String str) {
        return C6707c.m16774a(str) > 960;
    }

    /* renamed from: d */
    public static boolean m16172d(String str) {
        return C6707c.m16776b(str) > 350;
    }

    /* renamed from: a */
    public C6594a mo52043a(int i, String str) {
        try {
            this.f14149a.put("miniapp_id", i);
            this.f14149a.put("miniapp_version", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C6594a mo52044a(long j) {
        try {
            mo52052a("app_start_time", (Object) Long.valueOf(j));
            mo52052a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C6594a mo52045a(Header header) {
        mo52052a("header", (Object) header.mo52042f());
        this.f14150b = header;
        return this;
    }

    /* renamed from: a */
    public C6594a mo52046a(C6720b bVar) {
        mo52052a("activity_trace", (Object) bVar.mo52252g());
        mo52048a("activity_track", bVar.mo52254i());
        return this;
    }

    /* renamed from: a */
    public C6594a mo52047a(String str, String str2) {
        Object opt = mo52066h().opt(C8849c.DATA);
        m16164a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo52066h(), "filters", str, str2);
        return this;
    }

    /* renamed from: a */
    public C6594a mo52048a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = mo52066h().optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo52052a("custom_long", (Object) optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public C6594a mo52049a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo52052a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String put : list) {
            jSONArray.put(put);
        }
        mo52052a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public C6594a mo52050a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            try {
                this.f14149a.put("plugin_info", jSONArray);
                return this;
            } catch (Exception unused) {
            }
        } else {
            for (String next : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", next);
                jSONObject.put("version_code", map.get(next));
                jSONArray.put(jSONObject);
            }
            this.f14149a.put("plugin_info", jSONArray);
            return this;
        }
    }

    /* renamed from: a */
    public C6594a mo52051a(JSONObject jSONObject) {
        mo52052a("header", (Object) jSONObject);
        return this;
    }

    /* renamed from: a */
    public void mo52052a(String str, Object obj) {
        try {
            this.f14149a.put(str, obj);
        } catch (Exception e) {
            C6688q.m16632b((Throwable) e);
        }
    }

    /* renamed from: a */
    public boolean mo52053a() {
        Object opt = mo52066h().opt(C8849c.DATA);
        return opt instanceof JSONArray ? !C6678l.m16560a(((JSONArray) opt).optJSONObject(0), "logcat") : !C6678l.m16560a(this.f14149a, "logcat");
    }

    /* renamed from: b */
    public C6594a mo52054b(String str, String str2) {
        Object opt = mo52066h().opt(C8849c.DATA);
        m16164a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo52066h(), "custom", str, str2);
        return this;
    }

    /* renamed from: b */
    public C6594a mo52055b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer next : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(next), map.get(next));
                } catch (JSONException e) {
                    C6688q.m16632b((Throwable) e);
                }
            }
            try {
                this.f14149a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* renamed from: b */
    public C6594a mo52056b(JSONObject jSONObject) {
        m16167a(this.f14149a, jSONObject);
        return this;
    }

    /* renamed from: b */
    public void mo52057b() {
        mo52047a("has_logcat", String.valueOf(mo52053a()));
    }

    /* renamed from: c */
    public C6594a mo52058c(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject e = mo52062e("filters");
            for (Map.Entry next : map.entrySet()) {
                try {
                    e.put((String) next.getKey(), next.getValue());
                } catch (JSONException unused) {
                }
            }
            mo52052a("filters", (Object) e);
        }
        return this;
    }

    /* renamed from: c */
    public void mo52059c() {
        mo52047a("is_64_devices", String.valueOf(Header.m16141a()));
        mo52047a("is_64_runtime", String.valueOf(NativeImpl.m16720e()));
        mo52047a("is_x86_devices", String.valueOf(Header.m16144b()));
    }

    /* renamed from: c */
    public void mo52060c(JSONObject jSONObject) {
        m16169b(this.f14149a, jSONObject);
    }

    /* renamed from: d */
    public boolean mo52061d() {
        return m16171c(C6617h.m16312f());
    }

    /* renamed from: e */
    public JSONObject mo52062e(String str) {
        Object opt = mo52066h().opt(C8849c.DATA);
        JSONObject optJSONObject = opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo52066h();
        if (optJSONObject == null) {
            return new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 != null) {
            return optJSONObject2;
        }
        JSONObject jSONObject = new JSONObject();
        mo52052a(str, (Object) jSONObject);
        return jSONObject;
    }

    /* renamed from: e */
    public boolean mo52063e() {
        return m16172d(C6617h.m16312f());
    }

    /* renamed from: f */
    public boolean mo52064f() {
        return m16170b(C6617h.m16312f());
    }

    /* renamed from: g */
    public boolean mo52065g() {
        return m16168a(C6617h.m16312f());
    }

    /* renamed from: h */
    public JSONObject mo52066h() {
        return this.f14149a;
    }

    /* renamed from: i */
    public Header mo52067i() {
        if (this.f14150b == null) {
            Header header = new Header(C6617h.m16313g());
            this.f14150b = header;
            mo52045a(header);
        }
        return this.f14150b;
    }
}
