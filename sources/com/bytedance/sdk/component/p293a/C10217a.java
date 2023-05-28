package com.bytedance.sdk.component.p293a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p293a.C10226g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.a */
/* compiled from: AbstractBridge */
public abstract class C10217a {

    /* renamed from: a */
    protected Context f25228a;

    /* renamed from: b */
    protected C10238m f25229b;

    /* renamed from: c */
    protected C10230h f25230c;

    /* renamed from: d */
    protected Handler f25231d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    protected String f25232e;

    /* renamed from: f */
    protected volatile boolean f25233f = false;

    /* renamed from: g */
    C10226g f25234g;

    /* renamed from: h */
    private final Map<String, C10226g> f25235h = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo63013a(C10232j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo63014a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63017a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo63020b(C10232j jVar);

    protected C10217a() {
    }

    /* access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (!this.f25233f) {
            C10231i.m29376a("Received call: " + str);
            this.f25231d.post(new Runnable() {
                public void run() {
                    if (!C10217a.this.f25233f) {
                        C10242q qVar = null;
                        try {
                            qVar = C10217a.this.m29326a(new JSONObject(str));
                        } catch (JSONException e) {
                            C10231i.m29380b("Exception thrown while parsing function.", e);
                        }
                        if (C10242q.m29407a(qVar)) {
                            C10231i.m29376a("By pass invalid call: " + qVar);
                            if (qVar != null) {
                                C10217a.this.mo63021b(C10258y.m29452a((Throwable) new C10246s(qVar.f25283a, "Failed to parse invocation.")), qVar);
                                return;
                            }
                            return;
                        }
                        C10217a.this.mo63016a(qVar);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63018a(String str, C10242q qVar) {
        mo63017a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo63019b() {
        this.f25234g.mo63037a();
        for (C10226g a : this.f25235h.values()) {
            a.mo63037a();
        }
        this.f25231d.removeCallbacksAndMessages((Object) null);
        this.f25233f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63016a(C10242q qVar) {
        String a;
        if (!this.f25233f && (a = mo63014a()) != null) {
            C10226g b = m29327b(qVar.f25289g);
            if (b == null) {
                C10231i.m29379b("Received call with unknown namespace, " + qVar);
                C10238m mVar = this.f25229b;
                if (mVar != null) {
                    mVar.mo63057a(mo63014a(), qVar.f25286d, 2);
                }
                mo63021b(C10258y.m29452a((Throwable) new C10246s(-4, "Namespace " + qVar.f25289g + " unknown.")), qVar);
                return;
            }
            C10225f fVar = new C10225f();
            fVar.f25244b = a;
            fVar.f25243a = this.f25228a;
            fVar.f25245c = b;
            try {
                C10226g.C10229a a2 = b.mo63036a(qVar, fVar);
                if (a2 == null) {
                    C10231i.m29379b("Received call but not registered, " + qVar);
                    if (this.f25229b != null) {
                        this.f25229b.mo63057a(mo63014a(), qVar.f25286d, 2);
                    }
                    mo63021b(C10258y.m29452a((Throwable) new C10246s(-2, "Function " + qVar.f25286d + " is not registered.")), qVar);
                    return;
                }
                if (a2.f25262a) {
                    mo63021b(a2.f25263b, qVar);
                }
                if (this.f25229b != null) {
                    this.f25229b.mo63056a(mo63014a(), qVar.f25286d);
                }
            } catch (Exception e) {
                C10231i.m29377a("call finished with error, " + qVar, e);
                mo63021b(C10258y.m29452a((Throwable) e), qVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63015a(C10232j jVar, C10250v vVar) {
        this.f25228a = mo63013a(jVar);
        this.f25230c = jVar.f25269d;
        this.f25229b = jVar.f25274i;
        this.f25234g = new C10226g(jVar, this, vVar);
        this.f25232e = jVar.f25276k;
        mo63020b(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo63021b(String str, C10242q qVar) {
        JSONObject jSONObject;
        if (!this.f25233f) {
            if (TextUtils.isEmpty(qVar.f25288f)) {
                C10231i.m29376a("By passing js callback due to empty callback: " + str);
                return;
            }
            if (!str.startsWith("{") || !str.endsWith("}")) {
                C10231i.m29375a((RuntimeException) new IllegalArgumentException("Illegal callback data: " + str));
            }
            C10231i.m29376a("Invoking js callback: " + qVar.f25288f);
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            mo63018a(C10241p.m29402a().mo63060a("__msg_type", "callback").mo63060a("__callback_id", qVar.f25288f).mo63060a("__params", jSONObject).mo63061b(), qVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5 = r9.optString("params");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.p293a.C10242q m29326a(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            boolean r1 = r8.f25233f
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r1 = "__callback_id"
            java.lang.String r1 = r9.optString(r1)
            java.lang.String r3 = "func"
            java.lang.String r3 = r9.optString(r3)
            java.lang.String r4 = r8.mo63014a()
            if (r4 != 0) goto L_0x0023
            com.bytedance.sdk.component.a.m r9 = r8.f25229b
            if (r9 == 0) goto L_0x0022
            r0 = 3
            r9.mo63057a(r2, r2, r0)
        L_0x0022:
            return r2
        L_0x0023:
            java.lang.String r2 = "__msg_type"
            java.lang.String r2 = r9.getString(r2)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r5 = ""
            java.lang.Object r6 = r9.opt(r0)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x004d
            boolean r5 = r6 instanceof org.json.JSONObject     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x003c
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x003c:
            boolean r5 = r6 instanceof java.lang.String     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0044
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0044:
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            java.lang.String r5 = r9.optString(r0)     // Catch:{ JSONException -> 0x0084 }
        L_0x004d:
            java.lang.String r0 = "JSSDK"
            java.lang.String r0 = r9.getString(r0)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r6 = "namespace"
            java.lang.String r6 = r9.optString(r6)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r7 = "__iframe_url"
            java.lang.String r9 = r9.optString(r7)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r7 = com.bytedance.sdk.component.p293a.C10242q.m29405a()     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r7.mo63063a((java.lang.String) r0)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo63065b((java.lang.String) r2)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo63066c((java.lang.String) r3)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo63067d((java.lang.String) r5)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo63068e((java.lang.String) r1)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo63069f((java.lang.String) r6)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r9 = r0.mo63070g((java.lang.String) r9)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q r9 = r9.mo63064a()     // Catch:{ JSONException -> 0x0084 }
            return r9
        L_0x0084:
            r9 = move-exception
            java.lang.String r0 = "Failed to create call."
            com.bytedance.sdk.component.p293a.C10231i.m29380b(r0, r9)
            com.bytedance.sdk.component.a.m r9 = r8.f25229b
            if (r9 == 0) goto L_0x0092
            r0 = 1
            r9.mo63057a(r4, r3, r0)
        L_0x0092:
            r9 = -1
            com.bytedance.sdk.component.a.q r9 = com.bytedance.sdk.component.p293a.C10242q.m29406a(r1, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p293a.C10217a.m29326a(org.json.JSONObject):com.bytedance.sdk.component.a.q");
    }

    /* renamed from: b */
    private C10226g m29327b(String str) {
        if (TextUtils.equals(str, this.f25232e) || TextUtils.isEmpty(str)) {
            return this.f25234g;
        }
        return this.f25235h.get(str);
    }
}
