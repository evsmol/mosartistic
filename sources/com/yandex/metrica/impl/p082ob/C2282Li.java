package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Li */
public class C2282Li {

    /* renamed from: a */
    private static final Map<String, Integer> f6117a = Collections.unmodifiableMap(new C2283a());

    /* renamed from: com.yandex.metrica.impl.ob.Li$a */
    class C2283a extends HashMap<String, Integer> {
        C2283a() {
            put("BACKGROUND", 0);
            put("FOREGROUND", 2);
            put("VISIBLE", 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16223a(com.yandex.metrica.impl.p082ob.C2638Ui r17, org.json.JSONObject r18) {
        /*
            r16 = this;
            com.yandex.metrica.impl.ob.L9 r0 = new com.yandex.metrica.impl.ob.L9
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "location_collecting"
            r3 = r18
            org.json.JSONArray r2 = r3.optJSONArray(r2)
            if (r2 == 0) goto L_0x036e
            r3 = 0
            r4 = 0
        L_0x0016:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x036e
            org.json.JSONObject r5 = r2.optJSONObject(r4)
            if (r5 == 0) goto L_0x036a
            com.yandex.metrica.impl.ob.Sh r6 = r17.mo16902e()
            com.yandex.metrica.impl.ob.If$k r7 = new com.yandex.metrica.impl.ob.If$k
            r7.<init>()
            java.lang.String r8 = "config"
            org.json.JSONObject r8 = r5.optJSONObject(r8)
            com.yandex.metrica.impl.ob.If$k$a r9 = new com.yandex.metrica.impl.ob.If$k$a
            r9.<init>()
            r7.f5658a = r9
            if (r8 == 0) goto L_0x0281
            java.lang.String r13 = "min_update_interval_seconds"
            r14 = 0
            java.lang.Long r13 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r8, (java.lang.String) r13, (java.lang.Long) r14)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            long r10 = r11.f5660a
            long r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8504a((java.lang.Long) r13, (java.util.concurrent.TimeUnit) r15, (long) r10)
            r9.f5660a = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "min_update_distance_meters"
            boolean r11 = r8.has(r10)
            if (r11 == 0) goto L_0x0061
            double r10 = r8.getDouble(r10)     // Catch:{ all -> 0x0061 }
            float r10 = (float) r10     // Catch:{ all -> 0x0061 }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ all -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r10 = r14
        L_0x0062:
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            float r11 = r11.f5661b
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            if (r10 != 0) goto L_0x006d
            r10 = r11
        L_0x006d:
            float r10 = r10.floatValue()
            r9.f5661b = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "records_count_to_force_flush"
            java.lang.Integer r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Integer) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            int r11 = r11.f5662c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r10 != 0) goto L_0x0086
            r10 = r11
        L_0x0086:
            int r10 = r10.intValue()
            r9.f5662c = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "max_records_count_in_batch"
            java.lang.Integer r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Integer) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            int r11 = r11.f5663d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r10 != 0) goto L_0x009f
            r10 = r11
        L_0x009f:
            int r10 = r10.intValue()
            r9.f5663d = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "max_age_seconds_to_force_flush"
            java.lang.Long r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Long) r14)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            com.yandex.metrica.impl.ob.If$k$a r13 = r7.f5658a
            long r12 = r13.f5664e
            long r12 = com.yandex.metrica.impl.p082ob.C2572Tl.m8504a((java.lang.Long) r10, (java.util.concurrent.TimeUnit) r11, (long) r12)
            r9.f5664e = r12
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "max_records_to_store_locally"
            java.lang.Integer r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Integer) r14)
            com.yandex.metrica.impl.ob.If$k$a r12 = r7.f5658a
            int r12 = r12.f5665f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            if (r10 != 0) goto L_0x00cc
            r10 = r12
        L_0x00cc:
            int r10 = r10.intValue()
            r9.f5665f = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "lbs_min_update_interval_seconds"
            java.lang.Long r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Long) r14)
            com.yandex.metrica.impl.ob.If$k$a r12 = r7.f5658a
            long r12 = r12.f5669j
            long r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8504a((java.lang.Long) r10, (java.util.concurrent.TimeUnit) r11, (long) r12)
            r9.f5669j = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "location_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            boolean r11 = r11.f5666g
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x00f7
            r10 = r11
        L_0x00f7:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0103
            boolean r10 = r6.f6668g
            if (r10 == 0) goto L_0x0103
            r10 = 1
            goto L_0x0104
        L_0x0103:
            r10 = 0
        L_0x0104:
            r9.f5666g = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "lbs_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            boolean r11 = r11.f5667h
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x0119
            r10 = r11
        L_0x0119:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0125
            boolean r10 = r6.f6669h
            if (r10 == 0) goto L_0x0125
            r10 = 1
            goto L_0x0126
        L_0x0125:
            r10 = 0
        L_0x0126:
            r9.f5667h = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "passive_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            boolean r11 = r11.f5668i
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x013b
            r10 = r11
        L_0x013b:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0147
            boolean r10 = r6.f6668g
            if (r10 == 0) goto L_0x0147
            r10 = 1
            goto L_0x0148
        L_0x0147:
            r10 = 0
        L_0x0148:
            r9.f5668i = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "all_cells_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            boolean r11 = r11.f5675p
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x015d
            r10 = r11
        L_0x015d:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0169
            boolean r10 = r6.f6679r
            if (r10 == 0) goto L_0x0169
            r10 = 1
            goto L_0x016a
        L_0x0169:
            r10 = 0
        L_0x016a:
            r9.f5675p = r10
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "connected_cell_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            com.yandex.metrica.impl.ob.If$k$a r11 = r7.f5658a
            boolean r11 = r11.f5676q
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x017f
            r10 = r11
        L_0x017f:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x018b
            boolean r10 = r6.f6679r
            if (r10 == 0) goto L_0x018b
            r10 = 1
            goto L_0x018c
        L_0x018b:
            r10 = 0
        L_0x018c:
            r9.f5676q = r10
            boolean r9 = r6.f6677p
            if (r9 == 0) goto L_0x01a0
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            java.lang.String r10 = "wifi_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.If$k$a$a r10 = m7856a((org.json.JSONObject) r10, (boolean) r3)
            r9.f5670k = r10
        L_0x01a0:
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            boolean r10 = r9.f5667h
            if (r10 == 0) goto L_0x01b2
            java.lang.String r10 = "lbs_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.If$k$a$a r10 = m7856a((org.json.JSONObject) r10, (boolean) r3)
            r9.f5671l = r10
        L_0x01b2:
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            boolean r10 = r9.f5666g
            if (r10 == 0) goto L_0x01c4
            java.lang.String r10 = "gps_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.If$k$a$a r10 = m7856a((org.json.JSONObject) r10, (boolean) r3)
            r9.f5672m = r10
        L_0x01c4:
            com.yandex.metrica.impl.ob.If$k$a r9 = r7.f5658a
            boolean r10 = r9.f5668i
            if (r10 == 0) goto L_0x01d7
            java.lang.String r10 = "passive_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            r11 = 1
            com.yandex.metrica.impl.ob.If$k$a$a r10 = m7856a((org.json.JSONObject) r10, (boolean) r11)
            r9.f5673n = r10
        L_0x01d7:
            boolean r6 = r6.f6670i
            if (r6 == 0) goto L_0x0281
            com.yandex.metrica.impl.ob.If$k$a r6 = r7.f5658a
            java.lang.String r9 = "gpl_access_config"
            org.json.JSONObject r8 = r8.optJSONObject(r9)
            com.yandex.metrica.impl.ob.If$k$a$b r9 = new com.yandex.metrica.impl.ob.If$k$a$b
            r9.<init>()
            java.lang.String r10 = "scanning_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            boolean r11 = r9.f5683b
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x01f7
            r10 = r11
        L_0x01f7:
            boolean r10 = r10.booleanValue()
            r9.f5683b = r10
            java.lang.String r10 = "last_known_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r10, (java.lang.Boolean) r14)
            boolean r11 = r9.f5682a
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x020c
            r10 = r11
        L_0x020c:
            boolean r10 = r10.booleanValue()
            r9.f5682a = r10
            boolean r10 = r9.f5683b
            if (r10 == 0) goto L_0x027f
            java.lang.String r10 = "priority"
            java.lang.String r10 = com.yandex.metrica.impl.p082ob.C2572Tl.m8530b((org.json.JSONObject) r8, (java.lang.String) r10)
            java.lang.String r11 = "duration_seconds"
            java.lang.Long r11 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r8, (java.lang.String) r11, (java.lang.Long) r14)
            java.lang.String r12 = "interval_seconds"
            java.lang.Long r8 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r8, (java.lang.String) r12, (java.lang.Long) r14)
            if (r10 == 0) goto L_0x0260
            java.lang.String r12 = "PRIORITY_NO_POWER"
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L_0x0237
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            goto L_0x0260
        L_0x0237:
            java.lang.String r12 = "PRIORITY_LOW_POWER"
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L_0x0245
            r12 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            goto L_0x0260
        L_0x0245:
            java.lang.String r12 = "PRIORITY_BALANCED_POWER_ACCURACY"
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L_0x0253
            r12 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            goto L_0x0260
        L_0x0253:
            java.lang.String r12 = "PRIORITY_HIGH_ACCURACY"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0260
            r10 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
        L_0x0260:
            if (r14 == 0) goto L_0x027f
            if (r11 == 0) goto L_0x027f
            if (r8 == 0) goto L_0x027f
            com.yandex.metrica.impl.ob.If$k$a$b$a r10 = new com.yandex.metrica.impl.ob.If$k$a$b$a
            r10.<init>()
            long r11 = r11.longValue()
            r10.f5685a = r11
            long r11 = r8.longValue()
            r10.f5686b = r11
            int r8 = r14.intValue()
            r10.f5687c = r8
            r9.f5684c = r10
        L_0x027f:
            r6.f5674o = r9
        L_0x0281:
            com.yandex.metrica.impl.ob.If$k$b r6 = new com.yandex.metrica.impl.ob.If$k$b
            r6.<init>()
            r7.f5659b = r6
            java.lang.String r6 = "preconditions"
            org.json.JSONObject r5 = r5.optJSONObject(r6)
            if (r5 == 0) goto L_0x0363
            com.yandex.metrica.impl.ob.If$k$b r6 = r7.f5659b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = "charge_types"
            org.json.JSONArray r9 = r5.optJSONArray(r9)
            if (r9 == 0) goto L_0x02f3
            r10 = 0
        L_0x02a0:
            int r11 = r9.length()
            if (r10 >= r11) goto L_0x02f3
            java.lang.String r11 = r9.optString(r10)
            java.lang.String r12 = "USB"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x02bd
            r12 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r8.add(r11)
            r11 = 2
            r12 = 3
            goto L_0x02f0
        L_0x02bd:
            java.lang.String r12 = "AC"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x02cf
            r12 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r8.add(r11)
        L_0x02cd:
            r11 = 2
            goto L_0x02f0
        L_0x02cf:
            r12 = 3
            java.lang.String r13 = "NONE"
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x02e0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r8.add(r11)
            goto L_0x02cd
        L_0x02e0:
            java.lang.String r13 = "WIRELESS"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x02cd
            r11 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r8.add(r13)
        L_0x02f0:
            int r10 = r10 + 1
            goto L_0x02a0
        L_0x02f3:
            int r9 = r8.size()
            int[] r9 = new int[r9]
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x02fe:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0313
            java.lang.Object r11 = r8.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r9[r10] = r11
            r11 = 1
            int r10 = r10 + r11
            goto L_0x02fe
        L_0x0313:
            r6.f5688a = r9
            com.yandex.metrica.impl.ob.If$k$b r6 = r7.f5659b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = "app_statuses"
            org.json.JSONArray r5 = r5.optJSONArray(r9)
            if (r5 == 0) goto L_0x0341
            r9 = 0
        L_0x0325:
            int r10 = r5.length()
            if (r9 >= r10) goto L_0x0341
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f6117a
            java.lang.String r11 = ""
            java.lang.String r11 = r5.optString(r9, r11)
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x033e
            r8.add(r10)
        L_0x033e:
            int r9 = r9 + 1
            goto L_0x0325
        L_0x0341:
            int r5 = r8.size()
            int[] r5 = new int[r5]
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
        L_0x034c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0361
            java.lang.Object r10 = r8.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r5[r9] = r10
            r10 = 1
            int r9 = r9 + r10
            goto L_0x034c
        L_0x0361:
            r6.f5689b = r5
        L_0x0363:
            com.yandex.metrica.impl.ob.oc r5 = r0.toModel((com.yandex.metrica.impl.p082ob.C2121If.C2134k) r7)
            r1.add(r5)
        L_0x036a:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x036e:
            r0 = r17
            r0.mo16893b((java.util.List<com.yandex.metrica.impl.p082ob.C3316oc>) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2282Li.mo16223a(com.yandex.metrica.impl.ob.Ui, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static C2121If.C2134k.C2135a.C2136a m7856a(JSONObject jSONObject, boolean z) {
        C2121If.C2134k.C2135a.C2136a aVar = new C2121If.C2134k.C2135a.C2136a();
        Boolean a = C2572Tl.m8508a(jSONObject, "last_known_enabled", (Boolean) null);
        Boolean valueOf = Boolean.valueOf(aVar.f5677a);
        if (a == null) {
            a = valueOf;
        }
        aVar.f5677a = a.booleanValue();
        Boolean a2 = C2572Tl.m8508a(jSONObject, "scanning_enabled", (Boolean) null);
        Boolean valueOf2 = Boolean.valueOf(z);
        if (a2 == null) {
            a2 = valueOf2;
        }
        boolean booleanValue = a2.booleanValue();
        aVar.f5678b = booleanValue;
        if (jSONObject != null && booleanValue) {
            C2121If.C2134k.C2135a.C2136a.C2137a aVar2 = new C2121If.C2134k.C2135a.C2136a.C2137a();
            Long a3 = C2572Tl.m8510a(jSONObject, "duration_seconds", (Long) null);
            Long valueOf3 = Long.valueOf(aVar2.f5680a);
            if (a3 == null) {
                a3 = valueOf3;
            }
            aVar2.f5680a = a3.longValue();
            Long a4 = C2572Tl.m8510a(jSONObject, "interval_seconds", (Long) null);
            Long valueOf4 = Long.valueOf(aVar2.f5681b);
            if (a4 == null) {
                a4 = valueOf4;
            }
            aVar2.f5681b = a4.longValue();
            aVar.f5679c = aVar2;
        }
        return aVar;
    }
}
