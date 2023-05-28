package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yh */
class C3706yh {

    /* renamed from: a */
    private final C3650xb f9524a;

    /* renamed from: b */
    private final Context f9525b;

    /* renamed from: c */
    private String f9526c;

    /* renamed from: d */
    private String f9527d;

    /* renamed from: e */
    private boolean f9528e;

    /* renamed from: f */
    private C3356pi f9529f;

    C3706yh(Context context, C3356pi piVar) {
        this(context, piVar, C2007F0.m7154g().mo15755r());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r2 = r2.f9198a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo18431a() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r5.f9528e
            if (r1 != 0) goto L_0x003b
            com.yandex.metrica.impl.ob.xb r1 = r5.f9524a
            android.content.Context r2 = r5.f9525b
            com.yandex.metrica.impl.ob.zb r1 = r1.mo18393a((android.content.Context) r2)
            com.yandex.metrica.impl.ob.ub r2 = r1.mo18453a()
            boolean r3 = r2.mo18256a()
            r4 = 0
            if (r3 == 0) goto L_0x0023
            com.yandex.metrica.impl.ob.tb r2 = r2.f9198a
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = r2.f9142b
            goto L_0x0024
        L_0x0023:
            r2 = r4
        L_0x0024:
            r5.f9526c = r2
            com.yandex.metrica.impl.ob.ub r1 = r1.mo18454b()
            boolean r2 = r1.mo18256a()
            if (r2 == 0) goto L_0x0036
            com.yandex.metrica.impl.ob.tb r1 = r1.f9198a
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f9142b
        L_0x0036:
            r5.f9527d = r4
            r1 = 1
            r5.f9528e = r1
        L_0x003b:
            java.lang.String r1 = "uuid"
            com.yandex.metrica.impl.ob.pi r2 = r5.f9529f     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.mo17968V()     // Catch:{ all -> 0x005f }
            r5.m11087a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "device_id"
            com.yandex.metrica.impl.ob.pi r2 = r5.f9529f     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.mo17977i()     // Catch:{ all -> 0x005f }
            r5.m11087a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "google_aid"
            java.lang.String r2 = r5.f9526c     // Catch:{ all -> 0x005f }
            r5.m11087a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "huawei_aid"
            java.lang.String r2 = r5.f9527d     // Catch:{ all -> 0x005f }
            r5.m11087a(r0, r1, r2)     // Catch:{ all -> 0x005f }
        L_0x005f:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3706yh.mo18431a():java.lang.String");
    }

    C3706yh(Context context, C3356pi piVar, C3650xb xbVar) {
        this.f9528e = false;
        this.f9525b = context;
        this.f9529f = piVar;
        this.f9524a = xbVar;
    }

    /* renamed from: a */
    public void mo18432a(C3356pi piVar) {
        this.f9529f = piVar;
    }

    /* renamed from: a */
    private void m11087a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
