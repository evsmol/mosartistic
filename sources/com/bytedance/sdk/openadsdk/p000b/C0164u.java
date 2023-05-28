package com.bytedance.sdk.openadsdk.p000b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p300d.C10313e;
import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.u */
/* compiled from: WebviewTimeTrack */
public class C0164u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f617a = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0477n f618b;

    /* renamed from: c */
    private Boolean f619c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Boolean f620d = false;

    /* renamed from: e */
    private Boolean f621e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public JSONObject f622f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public JSONArray f623g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public JSONArray f624h;

    protected C0164u() {
    }

    public C0164u(int i, String str, C0477n nVar) {
        this.f617a = str;
        this.f618b = nVar;
        this.f622f = new JSONObject();
        this.f623g = new JSONArray();
        this.f624h = new JSONArray();
        m773a(this.f622f, "webview_source", (Object) Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m772a(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m773a(JSONObject jSONObject, String str, Object obj) {
        m774a(jSONObject, str, obj, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m774a(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (!z) {
                try {
                    if (jSONObject.has(str)) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(str, obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public boolean m780q() {
        return this.f621e.booleanValue() || (this.f620d.booleanValue() && this.f619c.booleanValue());
    }

    /* renamed from: a */
    public void mo460a() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(jSONObject, "render_sequence", (Object) Integer.valueOf(uVar.f618b.mo1462q()));
                C0164u.this.m773a(jSONObject, "webview_count", (Object) Integer.valueOf(C10313e.m29785a().mo63270e()));
                C0164u.this.m773a(jSONObject, "available_cache_count", (Object) Integer.valueOf(C10313e.m29785a().mo63268d()));
                C0164u uVar2 = C0164u.this;
                uVar2.m773a(uVar2.f622f, "render_start", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo461a(final int i) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                C0164u.this.mo462a(i, (String) null);
            }
        });
    }

    /* renamed from: a */
    public void mo462a(final int i, final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u.this.m773a(jSONObject, "code", (Object) Integer.valueOf(i));
                String str = str;
                if (str != null) {
                    C0164u.this.m773a(jSONObject, "msg", (Object) str);
                }
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "render_error", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo463a(final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                    C0164u.this.m773a(jSONObject, "jsb", (Object) str);
                    C0164u uVar = C0164u.this;
                    uVar.m773a(uVar.f622f, "webview_jsb_start", (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo464a(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    C0164u.this.m773a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    C0164u.this.m773a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    C0164u.this.m773a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    C0164u.this.m773a(jSONObject, "type", (Object) "intercept_html");
                    C0164u.this.m773a(jSONObject, "url", (Object) str2);
                    C0164u.this.m773a(jSONObject, IronSourceConstants.EVENTS_DURATION, (Object) Long.valueOf(j3 - j4));
                    C0164u uVar = C0164u.this;
                    uVar.m772a(uVar.f624h, (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo465a(final JSONObject jSONObject) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject = jSONObject;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(System.currentTimeMillis()));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "webview_load_error", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo466a(boolean z) {
        this.f621e = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public void mo467b() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "render_success", (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo468b(final int i) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u.this.m773a(jSONObject, "isWebViewCache", (Object) Integer.valueOf(i));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "before_webview_request", (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo469b(final int i, final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u.this.m773a(jSONObject, "code", (Object) Integer.valueOf(i));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo470b(final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                    C0164u.this.m773a(jSONObject, "jsb", (Object) str);
                    C0164u uVar = C0164u.this;
                    uVar.m773a(uVar.f622f, "webview_jsb_end", (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo471b(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    C0164u.this.m773a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    C0164u.this.m773a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    C0164u.this.m773a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    C0164u.this.m773a(jSONObject, "type", (Object) "intercept_js");
                    C0164u.this.m773a(jSONObject, "url", (Object) str2);
                    C0164u.this.m773a(jSONObject, IronSourceConstants.EVENTS_DURATION, (Object) Long.valueOf(j3 - j4));
                    C0164u uVar = C0164u.this;
                    uVar.m772a(uVar.f624h, (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo472b(final JSONObject jSONObject) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                if (C0164u.this.f622f != null && (jSONObject = jSONObject) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C0164u uVar = C0164u.this;
                        uVar.m773a(uVar.f622f, next, jSONObject.opt(next));
                    }
                    Boolean unused = C0164u.this.f620d = true;
                    C0164u.this.mo486m();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo473c() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "native_render_start", (Object) jSONObject);
            }
        });
    }

    /* renamed from: c */
    public void mo474c(final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: d */
    public void mo475d() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "native_render_end", (Object) jSONObject);
            }
        });
    }

    /* renamed from: d */
    public void mo476d(final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: e */
    public void mo477e() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m774a(uVar.f622f, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    /* renamed from: e */
    public void mo478e(final String str) {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: f */
    public void mo479f() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "webview_load_success", (Object) jSONObject);
            }
        });
    }

    /* renamed from: g */
    public void mo480g() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                C0164u.this.mo465a((JSONObject) null);
            }
        });
    }

    /* renamed from: h */
    public void mo481h() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "native_endcard_show", (Object) jSONObject);
            }
        });
    }

    /* renamed from: i */
    public void mo482i() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "native_endcard_close", (Object) jSONObject);
            }
        });
    }

    /* renamed from: j */
    public void mo483j() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u.this.m773a(jSONObject, "type", (Object) "native_enterBackground");
                C0164u uVar = C0164u.this;
                uVar.m772a(uVar.f623g, (Object) jSONObject);
            }
        });
    }

    /* renamed from: k */
    public void mo484k() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u.this.m773a(jSONObject, "type", (Object) "native_enterForeground");
                C0164u uVar = C0164u.this;
                uVar.m772a(uVar.f623g, (Object) jSONObject);
            }
        });
    }

    /* renamed from: l */
    public void mo485l() {
        this.f619c = true;
    }

    /* renamed from: m */
    public void mo486m() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                if (C0164u.this.m780q()) {
                    if (!(C0164u.this.f623g == null || C0164u.this.f623g.length() == 0)) {
                        try {
                            C0164u.this.f622f.put("native_switchBackgroundAndForeground", C0164u.this.f623g);
                        } catch (Exception unused) {
                        }
                    }
                    if (!(C0164u.this.f624h == null || C0164u.this.f624h.length() == 0)) {
                        try {
                            C0164u.this.f622f.put("intercept_source", C0164u.this.f624h);
                        } catch (Exception unused2) {
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("webview_time_track", C0164u.this.f622f);
                    if (C0503h.m2281d().mo1618s() && C0164u.this.f622f != null) {
                        C10638l.m31235b("WebviewTimeTrack", C0164u.this.f622f.toString());
                    }
                    C0136e.m625c(C0558m.m2663a(), C0164u.this.f618b, C0164u.this.f617a, "webview_time_track", (Map<String, Object>) hashMap);
                }
            }
        });
    }

    /* renamed from: n */
    public void mo487n() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "native_render_end", (Object) jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                C0164u.this.m773a(jSONObject2, "ts", (Object) Long.valueOf(currentTimeMillis2));
                C0164u uVar2 = C0164u.this;
                uVar2.m773a(uVar2.f622f, "render_success", (Object) jSONObject2);
            }
        });
    }

    /* renamed from: o */
    public void mo488o() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "no_native_render", (Object) jSONObject);
            }
        });
    }

    /* renamed from: p */
    public void mo489p() {
        C10631h.m31217a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C0164u.this.m773a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                C0164u uVar = C0164u.this;
                uVar.m773a(uVar.f622f, "render_failed", (Object) jSONObject);
            }
        });
    }
}
