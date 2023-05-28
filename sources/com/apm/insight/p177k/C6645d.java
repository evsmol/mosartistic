package com.apm.insight.p177k;

import android.content.Context;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.p174h.C6620b;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.p178l.C6689r;
import com.apm.insight.runtime.C6718a;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.C6764r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.d */
public class C6645d {

    /* renamed from: a */
    private static volatile C6645d f14292a;

    /* renamed from: b */
    private volatile Context f14293b;

    private C6645d(Context context) {
        this.f14293b = context;
    }

    /* renamed from: a */
    public static C6645d m16403a() {
        if (f14292a == null) {
            f14292a = new C6645d(C6617h.m16313g());
        }
        return f14292a;
    }

    /* renamed from: a */
    public void mo52131a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String f = C6647e.m16432f();
                File file = new File(C6685o.m16585a(this.f14293b), C6685o.m16597c());
                C6675i.m16520a(file, file.getName(), f, jSONObject, C6647e.m16424b());
                if (C6647e.m16410a(f, jSONObject.toString()).mo52152a()) {
                    C6675i.m16532a(file);
                }
            } catch (Throwable th) {
                C6688q.m16632b(th);
            }
        }
    }

    /* renamed from: a */
    public void mo52132a(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = C6647e.m16427c();
                int i = 0;
                File file = new File(C6685o.m16585a(this.f14293b), C6617h.m16298a(j, CrashType.ANR, false, false));
                C6675i.m16520a(file, file.getName(), c, jSONObject, C6647e.m16424b());
                if (!z) {
                    return;
                }
                if (!Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    C6689r.m16636a(jSONObject);
                    if (C6718a.m16808j()) {
                        HashMap<String, C6764r.C6765a> a = C6764r.m17028a(j, "anr_trace");
                        fileArr = new File[(a.size() + 2)];
                        for (Map.Entry next : a.entrySet()) {
                            if (!((String) next.getKey()).equals(C6662a.m16480c(this.f14293b))) {
                                fileArr[i] = C6685o.m16586a(this.f14293b, ((C6764r.C6765a) next.getValue()).f14530b);
                                i++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = C6685o.m16586a(this.f14293b, C6617h.m16312f());
                    fileArr[fileArr.length - 2] = C6764r.m17027a(j);
                    if (C6647e.m16412a(c, jSONObject.toString(), fileArr).mo52152a()) {
                        C6675i.m16532a(file);
                        if (!Npth.hasCrash()) {
                            C6675i.m16532a(C6685o.m16601e(C6617h.m16313g()));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo52133a(long j, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = C6647e.m16427c();
                File file = new File(C6685o.m16585a(this.f14293b), C6685o.m16589a(C6617h.m16311e()));
                C6675i.m16520a(file, file.getName(), c, jSONObject, C6647e.m16416a());
                jSONObject.put("upload_scene", "direct");
                C6689r.m16636a(jSONObject);
                if (!C6647e.m16421b(c, jSONObject.toString()).mo52152a()) {
                    return false;
                }
                C6675i.m16532a(file);
                return true;
            } catch (Throwable th) {
                C6688q.m16632b(th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo52134a(JSONObject jSONObject, File file, File file2) {
        try {
            String g = C6647e.m16433g();
            C6689r.m16636a(jSONObject);
            return C6647e.m16412a(g, jSONObject.toString(), file, file2, C6764r.m17027a(System.currentTimeMillis()), new File(C6620b.m16331a())).mo52152a();
        } catch (Throwable th) {
            C6688q.m16632b(th);
            return false;
        }
    }

    /* renamed from: b */
    public void mo52135b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                    String c = C6647e.m16427c();
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C6647e.m16421b(c, jSONObject.toString());
                }
            });
        }
    }
}
