package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C8864c;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8849c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.p264b.C8856i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cdm extends C8864c {
    private final String TAG = "cdm";

    /* renamed from: ey */
    private final String f22471ey = "[ { \"status\": \"on\", \"sample\":\"1\", \"sample_type\":\"hour\", \"cycle\":\"1\", \"cycle_type\":\"interval\", \"key\":\"cdm\" } ]";

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public final boolean mo58779aA() {
        return false;
    }

    /* renamed from: aF */
    public final boolean mo58783aF() {
        return true;
    }

    public cdm(C8838c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
        C8856i.m26695aR().init(C8852e.getContext());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.appnext.base.p260a.p262b.C8837b> getData() {
        /*
            r5 = this;
            java.lang.String r0 = "[ { \"status\": \"on\", \"sample\":\"1\", \"sample_type\":\"hour\", \"cycle\":\"1\", \"cycle_type\":\"interval\", \"key\":\"cdm\" } ]"
            android.content.Context r1 = com.appnext.base.p264b.C8852e.getContext()
            boolean r1 = com.appnext.base.p264b.C8857j.m26712i(r1)
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            java.lang.String r3 = "http://cdn.appnext.com/tools/services/4.7.2/config.json?packageId="
            r1.<init>(r3)     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            android.content.Context r3 = com.appnext.base.p264b.C8852e.getContext()     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            r1.append(r3)     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            java.lang.String r3 = "&dosv="
            r1.append(r3)     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            r1.append(r3)     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            java.lang.String r3 = "&lvid=4.7.2"
            r1.append(r3)     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            java.lang.String r0 = com.appnext.core.C8917f.m26919a((java.lang.String) r1, (java.util.HashMap<java.lang.String, java.lang.String>) r2)     // Catch:{ HttpRetryException -> 0x0038, all -> 0x003c }
            goto L_0x003c
        L_0x0038:
            r1 = move-exception
            r1.responseCode()
        L_0x003c:
            com.appnext.base.a.a r1 = com.appnext.base.p260a.C8831a.m26576X()     // Catch:{ all -> 0x0076 }
            com.appnext.base.a.c.c r1 = r1.mo58686ab()     // Catch:{ all -> 0x0076 }
            java.util.List r1 = r1.mo58721as()     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0055
            android.content.Context r3 = com.appnext.base.p264b.C8852e.getContext()     // Catch:{ all -> 0x0076 }
            com.appnext.base.services.b.a r3 = com.appnext.base.services.p266b.C8873a.m26797d(r3)     // Catch:{ all -> 0x0076 }
            r3.mo58816h(r1)     // Catch:{ all -> 0x0076 }
        L_0x0055:
            java.util.List r0 = m26762C(r0)     // Catch:{ all -> 0x0076 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0076 }
        L_0x005d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0076 }
            com.appnext.base.a.b.c r1 = (com.appnext.base.p260a.p262b.C8838c) r1     // Catch:{ all -> 0x0076 }
            android.content.Context r3 = com.appnext.base.p264b.C8852e.getContext()     // Catch:{ all -> 0x0076 }
            com.appnext.base.services.b.a r3 = com.appnext.base.services.p266b.C8873a.m26797d(r3)     // Catch:{ all -> 0x0076 }
            r4 = 0
            r3.mo58814a(r1, r4)     // Catch:{ all -> 0x0076 }
            goto L_0x005d
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.operations.imp.cdm.getData():java.util.List");
    }

    /* renamed from: C */
    private static List<C8838c> m26762C(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getString("status").equals(C8850d.f22425fe)) {
                    jSONObject.put("service_key", jSONObject.optString("key") + System.currentTimeMillis());
                    arrayList.add(C8849c.m26673c(jSONObject));
                }
            }
            C8831a.m26576X().mo58686ab().delete();
            C8831a.m26576X().mo58686ab().mo58722b(jSONArray);
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return new ArrayList();
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return cdm.class.getSimpleName();
    }
}
