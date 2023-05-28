package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.yandex.metrica.impl.p082ob.C1848A2;
import com.yandex.metrica.impl.p082ob.C2936f0;
import com.yandex.metrica.impl.p082ob.C3580vc;

@Deprecated
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C10684a();

    /* renamed from: a */
    private final ContentValues f26720a;

    /* renamed from: com.yandex.metrica.CounterConfiguration$a */
    class C10684a implements Parcelable.Creator<CounterConfiguration> {
        C10684a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues) parcel.readBundle(C2936f0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        public Object[] newArray(int i) {
            return new CounterConfiguration[i];
        }
    }

    /* renamed from: com.yandex.metrica.CounterConfiguration$b */
    public enum C10685b {
        MAIN("main"),
        MANUAL("manual"),
        APPMETRICA("appmetrica"),
        COMMUTATION("commutation"),
        SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
        SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
        CRASH(AppMeasurement.CRASH_ORIGIN);
        

        /* renamed from: a */
        private final String f26729a;

        private C10685b(String str) {
            this.f26729a = str;
        }

        /* renamed from: a */
        public String mo64636a() {
            return this.f26729a;
        }

        /* renamed from: a */
        public static C10685b m31470a(String str) {
            C10685b[] values = values();
            for (int i = 0; i < 7; i++) {
                C10685b bVar = values[i];
                if (bVar.f26729a.equals(str)) {
                    return bVar;
                }
            }
            return MAIN;
        }
    }

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f26720a = new ContentValues(counterConfiguration.f26720a);
            m31445r();
        }
    }

    /* renamed from: a */
    private void m31431a(String str) {
        if (C1848A2.m6809a((Object) str)) {
            synchronized (this) {
                this.f26720a.put("CFG_API_KEY", str);
            }
        }
    }

    /* renamed from: b */
    private void m31434b(Integer num) {
        if (C1848A2.m6809a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                ContentValues contentValues = this.f26720a;
                if (intValue <= 0) {
                    intValue = Integer.MAX_VALUE;
                }
                contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(intValue));
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    private void m31438c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "20799a27-fa80-4b36-b2db-0f8141f24180"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001a
            com.yandex.metrica.CounterConfiguration$b r3 = com.yandex.metrica.CounterConfiguration.C10685b.APPMETRICA
            monitor-enter(r2)
            android.content.ContentValues r0 = r2.f26720a     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.mo64636a()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            r0.put(r1, r3)     // Catch:{ all -> 0x0017 }
            goto L_0x0028
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x001a:
            com.yandex.metrica.CounterConfiguration$b r3 = com.yandex.metrica.CounterConfiguration.C10685b.MANUAL
            monitor-enter(r2)
            android.content.ContentValues r0 = r2.f26720a     // Catch:{ all -> 0x002a }
            java.lang.String r3 = r3.mo64636a()     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            r0.put(r1, r3)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.m31438c(java.lang.String):void");
    }

    /* renamed from: d */
    private void m31440d(Integer num) {
        if (C1848A2.m6809a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f26720a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: e */
    private void m31441e(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.locationTracking)) {
            mo64613b(iVar.locationTracking.booleanValue());
        }
    }

    /* renamed from: f */
    private void m31442f(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.location)) {
            mo64608a(iVar.location);
        }
    }

    /* renamed from: g */
    private void m31443g(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.f26878j)) {
            boolean booleanValue = iVar.f26878j.booleanValue();
            synchronized (this) {
                this.f26720a.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(booleanValue));
            }
        }
    }

    /* renamed from: h */
    private void m31444h(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.revenueAutoTrackingEnabled)) {
            boolean booleanValue = iVar.revenueAutoTrackingEnabled.booleanValue();
            synchronized (this) {
                this.f26720a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(booleanValue));
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: r */
    private void m31445r() {
        /*
            r3 = this;
            android.content.ContentValues r0 = r3.f26720a
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.content.ContentValues r0 = r3.f26720a
            java.lang.String r1 = "CFG_MAIN_REPORTER"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x003d
            android.content.ContentValues r0 = r3.f26720a
            java.lang.String r1 = "CFG_MAIN_REPORTER"
            java.lang.Boolean r0 = r0.getAsBoolean(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0035
            com.yandex.metrica.CounterConfiguration$b r0 = com.yandex.metrica.CounterConfiguration.C10685b.MAIN
            monitor-enter(r3)
            android.content.ContentValues r1 = r3.f26720a     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r0.mo64636a()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "CFG_REPORTER_TYPE"
            r1.put(r2, r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0063
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0035:
            java.lang.String r0 = r3.mo64607a()
            r3.m31438c((java.lang.String) r0)
            goto L_0x0068
        L_0x003d:
            android.content.ContentValues r0 = r3.f26720a
            java.lang.String r1 = "CFG_COMMUTATION_REPORTER"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0068
            android.content.ContentValues r0 = r3.f26720a
            java.lang.String r1 = "CFG_COMMUTATION_REPORTER"
            java.lang.Boolean r0 = r0.getAsBoolean(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            com.yandex.metrica.CounterConfiguration$b r0 = com.yandex.metrica.CounterConfiguration.C10685b.COMMUTATION
            monitor-enter(r3)
            android.content.ContentValues r1 = r3.f26720a     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r0.mo64636a()     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "CFG_REPORTER_TYPE"
            r1.put(r2, r0)     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r3)
            goto L_0x0068
        L_0x0065:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.m31445r():void");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public Integer mo64623i() {
        return this.f26720a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    /* renamed from: j */
    public Boolean mo64624j() {
        return this.f26720a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    /* renamed from: k */
    public C10685b mo64625k() {
        return C10685b.m31470a(this.f26720a.getAsString("CFG_REPORTER_TYPE"));
    }

    /* renamed from: l */
    public Integer mo64626l() {
        return this.f26720a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    /* renamed from: m */
    public Boolean mo64627m() {
        return this.f26720a.getAsBoolean("CFG_STATISTICS_SENDING");
    }

    /* renamed from: n */
    public Boolean mo64628n() {
        return this.f26720a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    /* renamed from: o */
    public Boolean mo64629o() {
        return this.f26720a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    /* renamed from: p */
    public Boolean mo64630p() {
        return this.f26720a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    /* renamed from: q */
    public synchronized Boolean mo64631q() {
        return this.f26720a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f26720a + '}';
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f26720a);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    private void m31430a(Integer num) {
        if (C1848A2.m6809a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f26720a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: e */
    public Integer mo64619e() {
        return this.f26720a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    /* renamed from: f */
    public Boolean mo64620f() {
        return this.f26720a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
    }

    /* renamed from: b */
    private void m31432b(C10725i iVar) {
        if (!TextUtils.isEmpty(iVar.appVersion)) {
            String str = iVar.appVersion;
            synchronized (this) {
                this.f26720a.put("CFG_APP_VERSION", str);
            }
        }
    }

    /* renamed from: d */
    private void m31439d(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.firstActivationAsUpdate)) {
            boolean booleanValue = iVar.firstActivationAsUpdate.booleanValue();
            synchronized (this) {
                this.f26720a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(booleanValue));
            }
        }
    }

    /* renamed from: g */
    public Location mo64621g() {
        if (!this.f26720a.containsKey("CFG_MANUAL_LOCATION")) {
            return null;
        }
        byte[] asByteArray = this.f26720a.getAsByteArray("CFG_MANUAL_LOCATION");
        int i = C3580vc.f9320q;
        if (asByteArray == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(asByteArray, 0, asByteArray.length);
            obtain.setDataPosition(0);
            Location location = (Location) obtain.readValue(Location.class.getClassLoader());
            obtain.recycle();
            return location;
        } catch (Throwable unused) {
            obtain.recycle();
            return null;
        }
    }

    /* renamed from: h */
    public Integer mo64622h() {
        return this.f26720a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    public CounterConfiguration() {
        this.f26720a = new ContentValues();
    }

    /* renamed from: a */
    private void m31429a(Boolean bool) {
        if (C1848A2.m6809a((Object) bool)) {
            boolean booleanValue = bool.booleanValue();
            synchronized (this) {
                this.f26720a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(booleanValue));
            }
        }
    }

    /* renamed from: c */
    private void m31435c(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.f26869a)) {
            String str = iVar.f26869a;
            synchronized (this) {
                ContentValues contentValues = this.f26720a;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
            }
        }
    }

    /* renamed from: d */
    public String mo64616d() {
        return this.f26720a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    public CounterConfiguration(C10725i iVar, C10685b bVar) {
        this();
        synchronized (this) {
            m31431a(iVar.apiKey);
            m31440d(iVar.sessionTimeout);
            m31442f(iVar);
            m31441e(iVar);
            m31435c(iVar);
            m31430a(iVar.f26874f);
            m31434b(iVar.f26875g);
            m31432b(iVar);
            m31428a(iVar);
            m31443g(iVar);
            m31439d(iVar);
            m31436c(iVar.statisticsSending);
            m31437c(iVar.maxReportsInDatabaseCount);
            m31433b(iVar.nativeCrashReporting);
            m31444h(iVar);
            mo64609a(bVar);
        }
    }

    /* renamed from: b */
    private void m31433b(Boolean bool) {
        if (C1848A2.m6809a((Object) bool)) {
            this.f26720a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
        }
    }

    /* renamed from: d */
    public synchronized void mo64617d(String str) {
        this.f26720a.put("CFG_UUID", str);
    }

    /* renamed from: a */
    private void m31428a(C10725i iVar) {
        if (C1848A2.m6809a((Object) iVar.f26873e)) {
            int intValue = iVar.f26873e.intValue();
            synchronized (this) {
                this.f26720a.put("CFG_APP_VERSION_CODE", String.valueOf(intValue));
            }
        }
    }

    /* renamed from: c */
    private void m31436c(Boolean bool) {
        if (C1848A2.m6809a((Object) bool)) {
            mo64615c(bool.booleanValue());
        }
    }

    /* renamed from: b */
    public synchronized void mo64612b(String str) {
        this.f26720a.put("CFG_API_KEY", str);
    }

    /* renamed from: c */
    private void m31437c(Integer num) {
        if (C1848A2.m6809a((Object) num)) {
            this.f26720a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    /* renamed from: b */
    public synchronized void mo64613b(boolean z) {
        this.f26720a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public String mo64607a() {
        return this.f26720a.getAsString("CFG_API_KEY");
    }

    /* renamed from: b */
    public String mo64611b() {
        return this.f26720a.getAsString("CFG_APP_VERSION_CODE");
    }

    /* renamed from: a */
    public synchronized void mo64610a(boolean z) {
        this.f26720a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public String mo64614c() {
        return this.f26720a.getAsString("CFG_APP_VERSION");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo64608a(android.location.Location r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.ContentValues r0 = r4.f26720a     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "CFG_MANUAL_LOCATION"
            int r2 = com.yandex.metrica.impl.p082ob.C3580vc.f9320q     // Catch:{ all -> 0x001d }
            r2 = 0
            if (r5 == 0) goto L_0x0018
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x001d }
            r3.writeValue(r5)     // Catch:{ all -> 0x0015 }
            byte[] r2 = r3.marshall()     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.recycle()     // Catch:{ all -> 0x001d }
        L_0x0018:
            r0.put(r1, r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r4)
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.mo64608a(android.location.Location):void");
    }

    /* renamed from: c */
    public final synchronized void mo64615c(boolean z) {
        this.f26720a.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z));
    }

    public CounterConfiguration(C10720e eVar) {
        this();
        synchronized (this) {
            m31431a(eVar.apiKey);
            m31440d(eVar.sessionTimeout);
            m31430a(eVar.f26854a);
            m31434b(eVar.f26855b);
            m31429a(eVar.logs);
            m31436c(eVar.statisticsSending);
            m31437c(eVar.maxReportsInDatabaseCount);
            m31438c(eVar.apiKey);
        }
    }

    CounterConfiguration(ContentValues contentValues) {
        this.f26720a = contentValues;
        m31445r();
    }

    /* renamed from: a */
    public synchronized void mo64609a(C10685b bVar) {
        this.f26720a.put("CFG_REPORTER_TYPE", bVar.mo64636a());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static com.yandex.metrica.CounterConfiguration m31427a(android.os.Bundle r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x000e
            java.lang.String r1 = "COUNTER_CFG_OBJ"
            android.os.Parcelable r1 = r4.getParcelable(r1)     // Catch:{ all -> 0x000d }
            com.yandex.metrica.CounterConfiguration r1 = (com.yandex.metrica.CounterConfiguration) r1     // Catch:{ all -> 0x000d }
            r0 = r1
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            if (r0 != 0) goto L_0x0015
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            r0.<init>()
        L_0x0015:
            monitor-enter(r0)
            if (r4 != 0) goto L_0x001a
            goto L_0x009b
        L_0x001a:
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f26720a     // Catch:{ all -> 0x0036 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "CFG_DISPATCH_PERIOD"
            r2.put(r3, r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0039
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x0039:
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f26720a     // Catch:{ all -> 0x0055 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "CFG_SESSION_TIMEOUT"
            r2.put(r3, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0058
        L_0x0055:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x0058:
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f26720a     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "CFG_MAX_REPORTS_COUNT"
            if (r1 > 0) goto L_0x0070
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0070:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x007c
        L_0x0079:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x007c:
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "-1"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x009b
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r4 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            r0.mo64612b((java.lang.String) r4)     // Catch:{ all -> 0x009d }
        L_0x009b:
            monitor-exit(r0)
            return r0
        L_0x009d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.m31427a(android.os.Bundle):com.yandex.metrica.CounterConfiguration");
    }
}
