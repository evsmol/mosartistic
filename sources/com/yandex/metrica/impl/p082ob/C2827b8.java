package com.yandex.metrica.impl.p082ob;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b8 */
public final class C2827b8 {

    /* renamed from: b */
    public static final C2828a f7432b = new C2828a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C2860c8 f7433a;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    public static final class C2828a {
        private C2828a() {
        }

        public /* synthetic */ C2828a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$b */
    static final class C2829b implements C2887d8 {

        /* renamed from: a */
        public static final C2829b f7434a = new C2829b();

        C2829b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x007a A[SYNTHETIC, Splitter:B:8:0x007a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final org.json.JSONObject mo17171a(org.json.JSONObject r7, org.json.JSONObject r8) {
            /*
                r6 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                java.lang.String r2 = "first_event_done"
                java.lang.Boolean r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r7, (java.lang.String) r2, (java.lang.Boolean) r1)
                java.lang.Boolean r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r2, (java.lang.Boolean) r3)
                r0.put(r2, r3)
                java.lang.String r2 = "init_event_done"
                java.lang.Boolean r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r7, (java.lang.String) r2, (java.lang.Boolean) r1)
                java.lang.Boolean r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r2, (java.lang.Boolean) r3)
                r0.put(r2, r3)
                r2 = -1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "report_request_id"
                java.lang.Integer r2 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Integer) r2)
                java.lang.Integer r2 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Integer) r2)
                r0.put(r3, r2)
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "global_number"
                java.lang.Integer r4 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Integer) r2)
                java.lang.Integer r4 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Integer) r4)
                r0.put(r3, r4)
                r3 = -1
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r4 = "session_id"
                java.lang.Long r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r7, (java.lang.String) r4, (java.lang.Long) r3)
                java.lang.Long r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8510a((org.json.JSONObject) r8, (java.lang.String) r4, (java.lang.Long) r3)
                r0.put(r4, r3)
                java.lang.String r3 = "referrer_handled"
                java.lang.Boolean r1 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Boolean) r1)
                java.lang.Boolean r1 = com.yandex.metrica.impl.p082ob.C2572Tl.m8508a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Boolean) r1)
                r0.put(r3, r1)
                java.lang.String r1 = "numbers_of_type"
                boolean r3 = r7.has(r1)
                r4 = 0
                if (r3 == 0) goto L_0x0073
                org.json.JSONObject r3 = r7.getJSONObject(r1)     // Catch:{ all -> 0x0073 }
                goto L_0x0074
            L_0x0073:
                r3 = r4
            L_0x0074:
                boolean r5 = r8.has(r1)
                if (r5 == 0) goto L_0x0080
                org.json.JSONObject r4 = r8.getJSONObject(r1)     // Catch:{ all -> 0x007f }
                goto L_0x0080
            L_0x007f:
            L_0x0080:
                if (r4 != 0) goto L_0x0083
                goto L_0x0084
            L_0x0083:
                r3 = r4
            L_0x0084:
                r0.put(r1, r3)
                r1 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                java.lang.String r4 = "open_id"
                java.lang.Integer r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r7, (java.lang.String) r4, (java.lang.Integer) r3)
                java.lang.Integer r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r4, (java.lang.Integer) r3)
                r0.put(r4, r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "attribution_id"
                java.lang.Integer r1 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Integer) r1)
                java.lang.Integer r1 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Integer) r1)
                r0.put(r3, r1)
                java.lang.String r1 = "last_migration_api_level"
                java.lang.Integer r7 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r7, (java.lang.String) r1, (java.lang.Integer) r2)
                java.lang.Integer r7 = com.yandex.metrica.impl.p082ob.C2572Tl.m8509a((org.json.JSONObject) r8, (java.lang.String) r1, (java.lang.Integer) r7)
                r0.put(r1, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2827b8.C2829b.mo17171a(org.json.JSONObject, org.json.JSONObject):org.json.JSONObject");
        }
    }

    public C2827b8(C2945f8 f8Var, C2945f8 f8Var2, String str) {
        this.f7433a = new C2860c8(f8Var, f8Var2, "[VitalComponentDataProvider-" + str + ']', C2829b.f7434a);
    }

    /* renamed from: a */
    public final synchronized void mo17221a(boolean z) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("first_event_done", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…(FIRST_EVENT_DONE, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: b */
    public final synchronized void mo17225b(boolean z) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("init_event_done", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…t(INIT_EVENT_DONE, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: c */
    public final synchronized void mo17227c(int i) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("report_request_id", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…REPORT_REQUEST_ID, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: d */
    public final synchronized JSONObject mo17229d() {
        return this.f7433a.mo17381a().optJSONObject("numbers_of_type");
    }

    /* renamed from: e */
    public final synchronized int mo17230e() {
        return this.f7433a.mo17381a().optInt("open_id", 1);
    }

    /* renamed from: f */
    public final synchronized boolean mo17231f() {
        return this.f7433a.mo17381a().optBoolean("referrer_handled", false);
    }

    /* renamed from: g */
    public final synchronized int mo17232g() {
        return this.f7433a.mo17381a().optInt("report_request_id", -1);
    }

    /* renamed from: h */
    public final synchronized long mo17233h() {
        return this.f7433a.mo17381a().optLong("session_id", -1);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: i */
    public final synchronized void mo17234i() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r0 = r4.f7433a     // Catch:{ all -> 0x002c }
            org.json.JSONObject r0 = r0.mo17381a()     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "attribution_id"
            r2 = 1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            int r0 = r0 + r2
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r1 = r4.f7433a     // Catch:{ all -> 0x0029 }
            org.json.JSONObject r2 = r1.mo17381a()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "attribution_id"
            org.json.JSONObject r0 = r2.put(r3, r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "vitalDataProvider.getOrL…EY_ATTRIBUTION_ID, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0029 }
            r1.mo17382a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            monitor-exit(r4)
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2827b8.mo17234i():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: j */
    public final synchronized void mo17235j() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r0 = r4.f7433a     // Catch:{ all -> 0x002c }
            org.json.JSONObject r0 = r0.mo17381a()     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "open_id"
            r2 = 1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            int r0 = r0 + r2
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r1 = r4.f7433a     // Catch:{ all -> 0x0029 }
            org.json.JSONObject r2 = r1.mo17381a()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "open_id"
            org.json.JSONObject r0 = r2.put(r3, r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "vitalDataProvider.getOrL…).put(KEY_OPEN_ID, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0029 }
            r1.mo17382a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            monitor-exit(r4)
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2827b8.mo17235j():void");
    }

    /* renamed from: k */
    public final synchronized boolean mo17236k() {
        return this.f7433a.mo17381a().optBoolean("first_event_done", false);
    }

    /* renamed from: l */
    public final synchronized boolean mo17237l() {
        return this.f7433a.mo17381a().optBoolean("init_event_done", false);
    }

    /* renamed from: a */
    public final synchronized void mo17218a(int i) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("global_number", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…KEY_GLOBAL_NUMBER, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: b */
    public final synchronized int mo17223b() {
        return this.f7433a.mo17381a().optInt("global_number", 0);
    }

    /* renamed from: c */
    public final synchronized void mo17228c(boolean z) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("referrer_handled", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…_REFERRER_HANDLED, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: a */
    public final synchronized void mo17219a(long j) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("session_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…ut(KEY_SESSION_ID, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: b */
    public final synchronized void mo17224b(int i) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("last_migration_api_level", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…GRATION_API_LEVEL, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: c */
    public final synchronized int mo17226c() {
        return this.f7433a.mo17381a().optInt("last_migration_api_level", 0);
    }

    /* renamed from: a */
    public final synchronized void mo17220a(JSONObject jSONObject) {
        C2860c8 c8Var = this.f7433a;
        JSONObject put = c8Var.mo17381a().put("numbers_of_type", jSONObject);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…Y_NUMBERS_OF_TYPE, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: a */
    public final synchronized int mo17217a() {
        return this.f7433a.mo17381a().optInt("attribution_id", 1);
    }

    /* renamed from: a */
    public final synchronized void mo17222a(boolean z, boolean z2, Integer num, Integer num2, Long l, Boolean bool, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        JSONObject put = new JSONObject().put("first_event_done", z).put("init_event_done", z2).put("report_request_id", num).put("global_number", num2).put("session_id", l).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        C2860c8 c8Var = this.f7433a;
        Intrinsics.checkNotNullExpressionValue(put, "json");
        c8Var.mo17382a(put);
    }
}
