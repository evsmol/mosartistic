package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.p082ob.C1848A2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.i */
public class C10725i extends YandexMetricaConfig {

    /* renamed from: a */
    public final String f26869a;

    /* renamed from: b */
    public final Map<String, String> f26870b;

    /* renamed from: c */
    public final String f26871c;

    /* renamed from: d */
    public final List<String> f26872d;

    /* renamed from: e */
    public final Integer f26873e;

    /* renamed from: f */
    public final Integer f26874f;

    /* renamed from: g */
    public final Integer f26875g;

    /* renamed from: h */
    public final Map<String, String> f26876h;

    /* renamed from: i */
    public final Boolean f26877i;

    /* renamed from: j */
    public final Boolean f26878j;

    /* renamed from: k */
    public final Boolean f26879k;

    /* renamed from: l */
    public final C10718c f26880l;

    /* renamed from: com.yandex.metrica.i$b */
    public static final class C10727b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public YandexMetricaConfig.Builder f26881a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f26882b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public List<String> f26883c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Integer f26884d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Map<String, String> f26885e;

        /* renamed from: f */
        public String f26886f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Integer f26887g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Integer f26888h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public LinkedHashMap<String, String> f26889i = new LinkedHashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Boolean f26890j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Boolean f26891k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Boolean f26892l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C10718c f26893m;

        protected C10727b(String str) {
            this.f26881a = YandexMetricaConfig.newConfigBuilder(str);
        }

        /* renamed from: c */
        static /* synthetic */ void m31595c(C10727b bVar) {
        }

        /* renamed from: f */
        static /* synthetic */ void m31598f(C10727b bVar) {
        }

        /* renamed from: c */
        public C10727b mo64766c(String str) {
            this.f26881a.withUserProfileID(str);
            return this;
        }

        /* renamed from: f */
        public C10727b mo64772f(boolean z) {
            this.f26881a.withNativeCrashReporting(z);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64754a(String str) {
            this.f26881a.withAppVersion(str);
            return this;
        }

        /* renamed from: b */
        public C10727b mo64764b(boolean z) {
            this.f26892l = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C10727b mo64765c(int i) {
            this.f26888h = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C10727b mo64769d(boolean z) {
            this.f26881a.withCrashReporting(z);
            return this;
        }

        /* renamed from: e */
        public C10727b mo64770e(int i) {
            this.f26881a.withSessionTimeout(i);
            return this;
        }

        /* renamed from: g */
        public C10727b mo64773g(boolean z) {
            this.f26891k = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: h */
        public C10727b mo64774h(boolean z) {
            this.f26881a.withRevenueAutoTrackingEnabled(z);
            return this;
        }

        /* renamed from: i */
        public C10727b mo64775i(boolean z) {
            this.f26881a.withSessionsAutoTrackingEnabled(z);
            return this;
        }

        /* renamed from: j */
        public C10727b mo64776j(boolean z) {
            this.f26881a.withStatisticsSending(z);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64751a(Location location) {
            this.f26881a.withLocation(location);
            return this;
        }

        /* renamed from: b */
        public C10727b mo64760b() {
            this.f26881a.withLogs();
            return this;
        }

        /* renamed from: c */
        public C10727b mo64767c(boolean z) {
            this.f26881a.withAppOpenTrackingEnabled(z);
            return this;
        }

        /* renamed from: d */
        public C10727b mo64768d(int i) {
            this.f26881a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        /* renamed from: e */
        public C10727b mo64771e(boolean z) {
            this.f26881a.withLocationTracking(z);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64756a(List<String> list) {
            this.f26883c = list;
            return this;
        }

        /* renamed from: b */
        public C10727b mo64763b(String str, String str2) {
            this.f26881a.withErrorEnvironmentValue(str, str2);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64750a(int i) {
            if (i >= 0) {
                this.f26884d = Integer.valueOf(i);
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", new Object[]{"App Build Number"}));
        }

        /* renamed from: b */
        public C10727b mo64762b(String str) {
            this.f26882b = str;
            return this;
        }

        /* renamed from: b */
        public C10727b mo64761b(int i) {
            this.f26887g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64757a(Map<String, String> map, Boolean bool) {
            this.f26890j = bool;
            this.f26885e = map;
            return this;
        }

        /* renamed from: a */
        public C10727b mo64752a(PreloadInfo preloadInfo) {
            this.f26881a.withPreloadInfo(preloadInfo);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64758a(boolean z) {
            this.f26881a.handleFirstActivationAsUpdate(z);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64755a(String str, String str2) {
            this.f26889i.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C10727b mo64753a(C10718c cVar) {
            this.f26893m = cVar;
            return this;
        }

        /* renamed from: a */
        public C10725i mo64759a() {
            return new C10725i(this);
        }
    }

    /* renamed from: a */
    public static C10727b m31592a(String str) {
        return new C10727b(str);
    }

    public C10725i(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f26869a = null;
        this.f26870b = null;
        this.f26873e = null;
        this.f26874f = null;
        this.f26875g = null;
        this.f26871c = null;
        this.f26876h = null;
        this.f26877i = null;
        this.f26878j = null;
        this.f26872d = null;
        this.f26879k = null;
        this.f26880l = null;
    }

    /* renamed from: a */
    public static C10727b m31591a(YandexMetricaConfig yandexMetricaConfig) {
        C10727b bVar = new C10727b(yandexMetricaConfig.apiKey);
        if (C1848A2.m6809a((Object) yandexMetricaConfig.appVersion)) {
            bVar.mo64754a(yandexMetricaConfig.appVersion);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.sessionTimeout)) {
            bVar.mo64770e(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.crashReporting)) {
            bVar.mo64769d(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            bVar.mo64772f(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.location)) {
            bVar.mo64751a(yandexMetricaConfig.location);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.locationTracking)) {
            bVar.mo64771e(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            bVar.mo64760b();
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.preloadInfo)) {
            bVar.mo64752a(yandexMetricaConfig.preloadInfo);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            bVar.mo64758a(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.statisticsSending)) {
            bVar.mo64776j(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            bVar.mo64768d(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry next : yandexMetricaConfig.errorEnvironment.entrySet()) {
                bVar.mo64763b((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.userProfileID)) {
            bVar.mo64766c(yandexMetricaConfig.userProfileID);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            bVar.mo64774h(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            bVar.mo64775i(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.appOpenTrackingEnabled)) {
            bVar.mo64767c(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof C10725i) {
            C10725i iVar = (C10725i) yandexMetricaConfig;
            if (C1848A2.m6809a((Object) iVar.f26872d)) {
                bVar.mo64756a(iVar.f26872d);
            }
            if (C1848A2.m6809a((Object) iVar.f26880l)) {
                bVar.mo64753a(iVar.f26880l);
            }
            C1848A2.m6809a((Object) null);
        }
        return bVar;
    }

    private C10725i(C10727b bVar) {
        super(bVar.f26881a);
        List<String> list;
        this.f26873e = bVar.f26884d;
        List h = bVar.f26883c;
        Map<String, String> map = null;
        if (h == null) {
            list = null;
        } else {
            list = C1848A2.m6816c(h);
        }
        this.f26872d = list;
        this.f26869a = bVar.f26882b;
        Map j = bVar.f26885e;
        this.f26870b = j != null ? C1848A2.m6819e(j) : map;
        this.f26875g = bVar.f26888h;
        this.f26874f = bVar.f26887g;
        this.f26871c = bVar.f26886f;
        this.f26876h = C1848A2.m6819e(bVar.f26889i);
        this.f26877i = bVar.f26890j;
        this.f26878j = bVar.f26891k;
        C10727b.m31595c(bVar);
        this.f26879k = bVar.f26892l;
        this.f26880l = bVar.f26893m;
        C10727b.m31598f(bVar);
    }
}
