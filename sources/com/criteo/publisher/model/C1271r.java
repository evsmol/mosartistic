package com.criteo.publisher.model;

import java.util.List;

/* renamed from: com.criteo.publisher.model.r */
/* compiled from: CdbResponse */
public class C1271r {

    /* renamed from: a */
    private final List<C1272s> f3952a;

    /* renamed from: b */
    private final int f3953b;

    /* renamed from: c */
    private final Boolean f3954c;

    public C1271r(List<C1272s> list, int i, Boolean bool) {
        this.f3952a = list;
        this.f3953b = i;
        this.f3954c = bool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[SYNTHETIC, Splitter:B:23:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.criteo.publisher.model.C1271r m5632a(org.json.JSONObject r7) {
        /*
            java.lang.Class<com.criteo.publisher.model.r> r0 = com.criteo.publisher.model.C1271r.class
            com.criteo.publisher.logging.g r0 = com.criteo.publisher.logging.C1197h.m5407b(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "timeToNextCall"
            boolean r3 = r7.has(r2)
            r4 = 0
            if (r3 == 0) goto L_0x0034
            int r2 = r7.getInt(r2)     // Catch:{ JSONException -> 0x0019 }
            goto L_0x0035
        L_0x0019:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Exception while reading cdb time to next call"
            r3.append(r5)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r0.mo3339a((java.lang.String) r2, (java.lang.Object[]) r3)
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.String r3 = "slots"
            boolean r5 = r7.has(r3)
            if (r5 == 0) goto L_0x0068
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONArray r5 = r7.getJSONArray(r3)     // Catch:{ JSONException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r3 = move-exception
            java.lang.String r6 = "Exception while reading slots array"
            r0.mo3338a((java.lang.String) r6, (java.lang.Throwable) r3)
        L_0x004d:
            int r3 = r5.length()
            if (r4 >= r3) goto L_0x0068
            org.json.JSONObject r3 = r5.getJSONObject(r4)     // Catch:{ Exception -> 0x005f }
            com.criteo.publisher.model.s r3 = com.criteo.publisher.model.C1272s.m5637a((org.json.JSONObject) r3)     // Catch:{ Exception -> 0x005f }
            r1.add(r3)     // Catch:{ Exception -> 0x005f }
            goto L_0x0065
        L_0x005f:
            r3 = move-exception
            java.lang.String r6 = "Exception while reading slot from slots array"
            r0.mo3338a((java.lang.String) r6, (java.lang.Throwable) r3)
        L_0x0065:
            int r4 = r4 + 1
            goto L_0x004d
        L_0x0068:
            r3 = 0
            java.lang.String r4 = "consentGiven"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x0080
            boolean r7 = r7.getBoolean(r4)     // Catch:{ JSONException -> 0x007a }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x007a }
            goto L_0x0080
        L_0x007a:
            r7 = move-exception
            java.lang.String r4 = "Exception while reading consentGiven"
            r0.mo3338a((java.lang.String) r4, (java.lang.Throwable) r7)
        L_0x0080:
            com.criteo.publisher.model.r r7 = new com.criteo.publisher.model.r
            r7.<init>(r1, r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.C1271r.m5632a(org.json.JSONObject):com.criteo.publisher.model.r");
    }

    /* renamed from: b */
    public List<C1272s> mo3563b() {
        return this.f3952a;
    }

    /* renamed from: c */
    public int mo3564c() {
        return this.f3953b;
    }

    /* renamed from: a */
    public Boolean mo3562a() {
        return this.f3954c;
    }

    /* renamed from: a */
    public C1272s mo3561a(String str) {
        for (C1272s next : this.f3952a) {
            if (str.equals(next.mo3575f())) {
                return next;
            }
        }
        return null;
    }

    public String toString() {
        return "CdbResponse{slots=" + this.f3952a + ", timeToNextCall=" + this.f3953b + ", consentGiven = " + this.f3954c + '}';
    }
}
