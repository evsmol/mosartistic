package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.content.Context;
import com.appnext.base.p264b.C8856i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i0 */
public final class C3045i0 {

    /* renamed from: a */
    private final Context f8022a;

    /* renamed from: b */
    private final C1967E f8023b;

    /* renamed from: c */
    private final C3598w f8024c;

    /* renamed from: d */
    private final C3580vc f8025d;

    /* renamed from: e */
    private final C2107I2 f8026e;

    /* renamed from: f */
    private final C1950D9 f8027f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ContentValues f8028g;

    /* renamed from: h */
    private C2275Lg f8029h;

    public C3045i0(Context context) {
        this(context, C2007F0.m7154g().mo15741c(), C2007F0.m7154g().mo15740b(), C3580vc.m10884a(context), C2081H2.m7295a(context));
    }

    /* renamed from: a */
    public C3045i0 mo17695a(ContentValues contentValues) {
        this.f8028g = contentValues;
        return this;
    }

    /* renamed from: a */
    public C3045i0 mo17696a(C2275Lg lg) {
        this.f8029h = lg;
        return this;
    }

    /* renamed from: a */
    public void mo17697a() {
        JSONObject jSONObject = new JSONObject();
        try {
            m9720a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f8028g.put("report_request_parameters", jSONObject.toString());
    }

    C3045i0(Context context, C1967E e, C3598w wVar, C3580vc vcVar, C2081H2 h2) {
        this.f8027f = new C1950D9();
        this.f8022a = context;
        this.f8023b = e;
        this.f8024c = wVar;
        this.f8025d = vcVar;
        this.f8026e = h2.mo15844a();
    }

    /* renamed from: a */
    private void m9720a(JSONObject jSONObject) throws JSONException {
        JSONObject putOpt = jSONObject.putOpt("dId", this.f8029h.mo15705g()).putOpt("uId", this.f8029h.mo15721w()).putOpt("appVer", this.f8029h.mo15704f()).putOpt("appBuild", this.f8029h.mo15696b());
        this.f8029h.getClass();
        JSONObject putOpt2 = putOpt.putOpt("analyticsSdkVersionName", "5.3.0");
        this.f8029h.getClass();
        JSONObject putOpt3 = putOpt2.putOpt("kitBuildNumber", "45003240").putOpt("kitBuildType", this.f8029h.mo15708j()).putOpt("osVer", this.f8029h.mo15713o()).putOpt("osApiLev", Integer.valueOf(this.f8029h.mo15712n())).putOpt("lang", this.f8029h.mo15709k()).putOpt("root", this.f8029h.mo15706h()).putOpt("app_debuggable", this.f8029h.mo15868z()).putOpt("app_framework", this.f8029h.mo15698c()).putOpt("attribution_id", Integer.valueOf(this.f8029h.mo16186C()));
        this.f8029h.getClass();
        putOpt3.putOpt("commit_hash", "a72bf6f57701ed3c2b8ed570054febbff4e58c12");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.Collection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17698a(com.yandex.metrica.impl.p082ob.C1904Bm r6, com.yandex.metrica.impl.p082ob.C3460s.C3461a r7, com.yandex.metrica.impl.p082ob.C3597vn<com.yandex.metrica.impl.p082ob.C3552ui.C3554b, java.lang.Object> r8) {
        /*
            r5 = this;
            com.yandex.metrica.impl.ob.c0 r0 = r6.f5137a
            android.content.ContentValues r1 = r5.f8028g
            java.lang.String r2 = r0.f7524a
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            java.lang.String r2 = r0.f7525b
            java.lang.String r3 = "value"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            int r2 = r0.f7528e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            int r2 = r0.f7529f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "custom_type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            java.lang.String r2 = r0.mo17339h()
            java.lang.String r3 = "error_environment"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            java.lang.String r2 = r0.mo17347p()
            java.lang.String r3 = "user_info"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            int r2 = r0.f7531h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "truncated"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            android.content.Context r2 = r5.f8022a
            int r2 = com.yandex.metrica.impl.p082ob.C2076H1.m7293b((android.content.Context) r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "connection_type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            java.lang.String r2 = r0.mo17344m()
            java.lang.String r3 = "profile_id"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f8028g
            com.yandex.metrica.impl.ob.Em r6 = r6.f5138b
            int r6 = r6.mo15735a()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "encrypting_mode"
            r1.put(r2, r6)
            android.content.ContentValues r6 = r5.f8028g
            com.yandex.metrica.impl.ob.D0 r1 = r0.mo17341j()
            int r1 = r1.f5195a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "first_occurrence_status"
            r6.put(r2, r1)
            com.yandex.metrica.impl.ob.y0 r6 = r0.mo17345n()
            if (r6 == 0) goto L_0x00a2
            android.content.ContentValues r1 = r5.f8028g
            int r6 = r6.f9487a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "source"
            r1.put(r2, r6)
        L_0x00a2:
            java.lang.Boolean r6 = r0.mo17333c()
            if (r6 == 0) goto L_0x00af
            android.content.ContentValues r1 = r5.f8028g
            java.lang.String r2 = "attribution_id_changed"
            r1.put(r2, r6)
        L_0x00af:
            android.content.ContentValues r6 = r5.f8028g
            java.lang.Integer r1 = r0.mo17342k()
            java.lang.String r2 = "open_id"
            r6.put(r2, r1)
            android.content.ContentValues r6 = r5.f8028g
            com.yandex.metrica.impl.ob.D9 r1 = r5.f8027f
            java.util.Map r0 = r0.mo17340i()
            byte[] r0 = r1.fromModel((java.util.Map<java.lang.String, byte[]>) r0)
            java.lang.String r1 = "extras"
            r6.put(r1, r0)
            android.content.ContentValues r6 = r5.f8028g
            java.lang.String r0 = r7.f9083a
            java.lang.String r1 = "app_environment"
            r6.put(r1, r0)
            android.content.ContentValues r6 = r5.f8028g
            long r0 = r7.f9084b
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "app_environment_revision"
            r6.put(r0, r7)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "enabled"
            r0 = 0
            com.yandex.metrica.impl.ob.Lg r1 = r5.f8029h     // Catch:{ all -> 0x012a }
            boolean r1 = r1.mo16200Q()     // Catch:{ all -> 0x012a }
            r6.put(r7, r1)     // Catch:{ all -> 0x012a }
            com.yandex.metrica.impl.ob.Lg r7 = r5.f8029h     // Catch:{ all -> 0x012a }
            boolean r7 = r7.mo16200Q()     // Catch:{ all -> 0x012a }
            if (r7 == 0) goto L_0x010f
            com.yandex.metrica.impl.ob.Lg r7 = r5.f8029h     // Catch:{ all -> 0x012a }
            android.location.Location r7 = r7.mo16191H()     // Catch:{ all -> 0x012a }
            if (r7 != 0) goto L_0x010a
            com.yandex.metrica.impl.ob.vc r7 = r5.f8025d     // Catch:{ all -> 0x012a }
            android.location.Location r7 = r7.mo18327a()     // Catch:{ all -> 0x012a }
            r1 = r0
            goto L_0x0111
        L_0x010a:
            com.yandex.metrica.impl.ob.K2 r1 = com.yandex.metrica.impl.p082ob.C2216K2.m7600a(r7)     // Catch:{ all -> 0x012a }
            goto L_0x0111
        L_0x010f:
            r7 = r0
            r1 = r7
        L_0x0111:
            if (r1 != 0) goto L_0x0119
            if (r7 == 0) goto L_0x0119
            com.yandex.metrica.impl.ob.K2 r1 = com.yandex.metrica.impl.p082ob.C2216K2.m7601b(r7)     // Catch:{ all -> 0x012a }
        L_0x0119:
            if (r1 == 0) goto L_0x011e
            r5.m9721a(r6, r1)     // Catch:{ all -> 0x012a }
        L_0x011e:
            android.content.ContentValues r7 = r5.f8028g     // Catch:{ all -> 0x012a }
            java.lang.String r1 = "location_info"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x012a }
            r7.put(r1, r6)     // Catch:{ all -> 0x012a }
            goto L_0x012b
        L_0x012a:
        L_0x012b:
            java.util.EnumMap r6 = new java.util.EnumMap
            java.lang.Class<com.yandex.metrica.impl.ob.ui$b> r7 = com.yandex.metrica.impl.p082ob.C3552ui.C3554b.class
            r6.<init>(r7)
            com.yandex.metrica.impl.ob.F0 r7 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Xj r7 = r7.mo15759v()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.yandex.metrica.impl.ob.h0 r2 = new com.yandex.metrica.impl.ob.h0
            r2.<init>(r5, r1)
            r7.mo15944a((com.yandex.metrica.impl.p082ob.C3593vj) r2)
            com.yandex.metrica.impl.ob.ui$b r2 = com.yandex.metrica.impl.p082ob.C3552ui.C3554b.WIFI
            com.yandex.metrica.impl.ob.I2 r3 = r5.f8026e
            java.lang.Object r3 = r3.mo15800a()
            r6.put(r2, r3)
            com.yandex.metrica.impl.ob.ui$b r3 = com.yandex.metrica.impl.p082ob.C3552ui.C3554b.CELL
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x015c
            r1 = r0
            goto L_0x0162
        L_0x015c:
            java.lang.Object r1 = r1.getFirst()
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x0162:
            r6.put(r3, r1)
            com.yandex.metrica.impl.ob.zn r6 = r8.mo18139a(r6)
            android.content.ContentValues r8 = r5.f8028g
            com.yandex.metrica.impl.ob.zn$a r1 = r6.f9606a
            com.yandex.metrica.impl.ob.zn$a r4 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.NOT_CHANGED
            if (r1 != r4) goto L_0x0173
            r1 = 1
            goto L_0x0174
        L_0x0173:
            r1 = 0
        L_0x0174:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "has_omitted_data"
            r8.put(r4, r1)
            com.yandex.metrica.impl.ob.zn$a r8 = r6.f9606a
            D r1 = r6.f9607b
            if (r1 != 0) goto L_0x0185
            r1 = r0
            goto L_0x018d
        L_0x0185:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r3)
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x018d:
            com.yandex.metrica.impl.ob.g0 r3 = new com.yandex.metrica.impl.ob.g0
            r3.<init>(r5)
            r7.mo15941a((com.yandex.metrica.impl.p082ob.C2810ak) r3)
            com.yandex.metrica.impl.ob.zn$a r7 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.NEW
            if (r8 == r7) goto L_0x019d
            com.yandex.metrica.impl.ob.zn$a r3 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.REFRESH
            if (r8 != r3) goto L_0x01ae
        L_0x019d:
            if (r1 == 0) goto L_0x01ae
            android.content.ContentValues r8 = r5.f8028g
            org.json.JSONArray r1 = com.yandex.metrica.impl.p082ob.C2572Tl.m8519a((java.util.Collection<com.yandex.metrica.impl.p082ob.C3555uj>) r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "cell_info"
            r8.put(r3, r1)
        L_0x01ae:
            com.yandex.metrica.impl.ob.zn$a r8 = r6.f9606a
            D r6 = r6.f9607b
            if (r6 != 0) goto L_0x01b5
            goto L_0x01be
        L_0x01b5:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r2)
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
        L_0x01be:
            com.yandex.metrica.impl.ob.zn$a r6 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.REFRESH
            if (r8 == r6) goto L_0x01c4
            if (r8 != r7) goto L_0x01d5
        L_0x01c4:
            if (r0 == 0) goto L_0x01d5
            org.json.JSONArray r6 = com.yandex.metrica.impl.p082ob.C2010F2.m7185a(r0)
            android.content.ContentValues r7 = r5.f8028g
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "wifi_network_info"
            r7.put(r8, r6)
        L_0x01d5:
            android.content.ContentValues r6 = r5.f8028g
            com.yandex.metrica.impl.ob.E r7 = r5.f8023b
            com.yandex.metrica.impl.ob.E$b$a r7 = r7.mo15642b()
            int r7 = r7.mo15643a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "battery_charge_type"
            r6.put(r8, r7)
            android.content.ContentValues r6 = r5.f8028g
            com.yandex.metrica.impl.ob.w r7 = r5.f8024c
            com.yandex.metrica.impl.ob.w$a r7 = r7.mo18348c()
            com.yandex.metrica.impl.ob.oc$a r7 = com.yandex.metrica.impl.p082ob.C3316oc.C3317a.m10241a((com.yandex.metrica.impl.p082ob.C3598w.C3599a) r7)
            java.lang.String r7 = r7.mo17917a()
            java.lang.String r8 = "collection_mode"
            r6.put(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3045i0.mo17698a(com.yandex.metrica.impl.ob.Bm, com.yandex.metrica.impl.ob.s$a, com.yandex.metrica.impl.ob.vn):void");
    }

    /* renamed from: a */
    private void m9721a(JSONObject jSONObject, C2216K2 k2) throws JSONException {
        jSONObject.put(C8856i.f22445fC, k2.getLatitude());
        jSONObject.put("lon", k2.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(k2.getTime()));
        jSONObject.putOpt("precision", k2.hasAccuracy() ? Float.valueOf(k2.getAccuracy()) : null);
        jSONObject.putOpt("direction", k2.hasBearing() ? Float.valueOf(k2.getBearing()) : null);
        jSONObject.putOpt("speed", k2.hasSpeed() ? Float.valueOf(k2.getSpeed()) : null);
        jSONObject.putOpt("altitude", k2.hasAltitude() ? Double.valueOf(k2.getAltitude()) : null);
        jSONObject.putOpt(IronSourceConstants.EVENTS_PROVIDER, C2814b.m9062a(k2.getProvider(), (String) null));
        jSONObject.putOpt("original_provider", k2.mo16062a());
    }
}
