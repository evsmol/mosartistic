package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import com.yandex.metrica.C10725i;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l0 */
public class C3138l0 implements C3244n1 {

    /* renamed from: a */
    private Location f8202a;

    /* renamed from: b */
    private Boolean f8203b;

    /* renamed from: c */
    private Boolean f8204c;

    /* renamed from: d */
    private Boolean f8205d;

    /* renamed from: e */
    private Map<String, String> f8206e = new LinkedHashMap();

    /* renamed from: f */
    private Map<String, String> f8207f = new LinkedHashMap();

    /* renamed from: g */
    private String f8208g;

    /* renamed from: h */
    private boolean f8209h;

    /* renamed from: i */
    private C2541T1 f8210i;

    /* renamed from: a */
    private static boolean m9925a(Object obj) {
        return obj == null;
    }

    /* renamed from: a */
    public void mo16698a(boolean z) {
        this.f8204c = Boolean.valueOf(z);
        m9926b();
    }

    /* renamed from: b */
    public void mo16699b(boolean z) {
        this.f8203b = Boolean.valueOf(z);
        m9926b();
    }

    /* renamed from: c */
    public void mo16700c(String str, String str2) {
        this.f8207f.put(str, str2);
    }

    public void setStatisticsSending(boolean z) {
        this.f8205d = Boolean.valueOf(z);
        m9926b();
    }

    public void setUserProfileID(String str) {
        this.f8208g = str;
    }

    /* renamed from: b */
    private void m9927b(Map<String, String> map, C10725i.C10727b bVar) {
        if (!C1848A2.m6815b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                bVar.mo64763b((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: a */
    public void mo16697a(Location location) {
        this.f8202a = location;
    }

    /* renamed from: a */
    public C10725i mo17790a(C10725i iVar) {
        if (this.f8209h) {
            return iVar;
        }
        C10725i.C10727b a = C10725i.m31592a(iVar.apiKey);
        a.mo64757a(iVar.f26870b, iVar.f26877i);
        a.mo64762b(iVar.f26869a);
        a.mo64752a(iVar.preloadInfo);
        a.mo64751a(iVar.location);
        if (C1848A2.m6809a((Object) iVar.f26872d)) {
            a.mo64756a(iVar.f26872d);
        }
        if (C1848A2.m6809a((Object) iVar.appVersion)) {
            a.mo64754a(iVar.appVersion);
        }
        if (C1848A2.m6809a((Object) iVar.f26874f)) {
            a.mo64761b(iVar.f26874f.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26873e)) {
            a.mo64750a(iVar.f26873e.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26875g)) {
            a.mo64765c(iVar.f26875g.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.logs) && iVar.logs.booleanValue()) {
            a.mo64760b();
        }
        if (C1848A2.m6809a((Object) iVar.sessionTimeout)) {
            a.mo64770e(iVar.sessionTimeout.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.crashReporting)) {
            a.mo64769d(iVar.crashReporting.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.nativeCrashReporting)) {
            a.mo64772f(iVar.nativeCrashReporting.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.locationTracking)) {
            a.mo64771e(iVar.locationTracking.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26871c)) {
            a.f26886f = iVar.f26871c;
        }
        if (C1848A2.m6809a((Object) iVar.firstActivationAsUpdate)) {
            a.mo64758a(iVar.firstActivationAsUpdate.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.statisticsSending)) {
            a.mo64776j(iVar.statisticsSending.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26879k)) {
            a.mo64764b(iVar.f26879k.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.maxReportsInDatabaseCount)) {
            a.mo64768d(iVar.maxReportsInDatabaseCount.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26880l)) {
            a.mo64753a(iVar.f26880l);
        }
        if (C1848A2.m6809a((Object) iVar.userProfileID)) {
            a.mo64766c(iVar.userProfileID);
        }
        if (C1848A2.m6809a((Object) iVar.revenueAutoTrackingEnabled)) {
            a.mo64774h(iVar.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.appOpenTrackingEnabled)) {
            a.mo64767c(iVar.appOpenTrackingEnabled.booleanValue());
        }
        m9924a(this.f8206e, a);
        m9924a(iVar.f26876h, a);
        m9927b(this.f8207f, a);
        m9927b(iVar.errorEnvironment, a);
        Boolean bool = this.f8203b;
        if (m9925a((Object) iVar.locationTracking) && C1848A2.m6809a((Object) bool)) {
            a.mo64771e(bool.booleanValue());
        }
        Location location = this.f8202a;
        if (m9925a((Object) iVar.location) && C1848A2.m6809a((Object) location)) {
            a.mo64751a(location);
        }
        Boolean bool2 = this.f8205d;
        if (m9925a((Object) iVar.statisticsSending) && C1848A2.m6809a((Object) bool2)) {
            a.mo64776j(bool2.booleanValue());
        }
        if (!C1848A2.m6809a((Object) iVar.userProfileID) && C1848A2.m6809a((Object) this.f8208g)) {
            a.mo64766c(this.f8208g);
        }
        this.f8209h = true;
        this.f8202a = null;
        this.f8203b = null;
        this.f8205d = null;
        this.f8206e.clear();
        this.f8207f.clear();
        this.f8208g = null;
        return a.mo64759a();
    }

    /* renamed from: b */
    private void m9926b() {
        C2541T1 t1 = this.f8210i;
        if (t1 != null) {
            t1.mo16676a(this.f8203b, this.f8205d, this.f8204c);
        }
    }

    /* renamed from: a */
    private void m9924a(Map<String, String> map, C10725i.C10727b bVar) {
        if (!C1848A2.m6815b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                bVar.mo64755a((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: a */
    public void mo17791a(C2541T1 t1) {
        this.f8210i = t1;
    }
}
