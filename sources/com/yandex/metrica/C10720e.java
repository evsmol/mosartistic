package com.yandex.metrica;

import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.p082ob.C1848A2;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.e */
public class C10720e extends ReporterConfig {

    /* renamed from: a */
    public final Integer f26854a;

    /* renamed from: b */
    public final Integer f26855b;

    /* renamed from: c */
    public final Map<String, String> f26856c;

    /* renamed from: com.yandex.metrica.e$a */
    public static class C10721a {

        /* renamed from: a */
        ReporterConfig.Builder f26857a;

        /* renamed from: b */
        Integer f26858b;

        /* renamed from: c */
        Integer f26859c;

        /* renamed from: d */
        LinkedHashMap<String, String> f26860d = new LinkedHashMap<>();

        public C10721a(String str) {
            this.f26857a = ReporterConfig.newConfigBuilder(str);
        }

        /* renamed from: a */
        public C10721a mo64734a(int i) {
            this.f26857a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        /* renamed from: a */
        public C10720e mo64735a() {
            return new C10720e(this);
        }
    }

    C10720e(C10721a aVar) {
        super(aVar.f26857a);
        Map<String, String> map;
        this.f26855b = aVar.f26858b;
        this.f26854a = aVar.f26859c;
        LinkedHashMap<String, String> linkedHashMap = aVar.f26860d;
        if (linkedHashMap == null) {
            map = null;
        } else {
            map = C1848A2.m6819e(linkedHashMap);
        }
        this.f26856c = map;
    }

    /* renamed from: a */
    public static C10720e m31576a(ReporterConfig reporterConfig) {
        if (reporterConfig instanceof C10720e) {
            return (C10720e) reporterConfig;
        }
        return new C10720e(reporterConfig);
    }

    /* renamed from: a */
    public static C10721a m31574a(C10720e eVar) {
        C10721a aVar = new C10721a(eVar.apiKey);
        if (C1848A2.m6809a((Object) eVar.sessionTimeout)) {
            aVar.f26857a.withSessionTimeout(eVar.sessionTimeout.intValue());
        }
        if (C1848A2.m6809a((Object) eVar.logs) && eVar.logs.booleanValue()) {
            aVar.f26857a.withLogs();
        }
        if (C1848A2.m6809a((Object) eVar.statisticsSending)) {
            aVar.f26857a.withStatisticsSending(eVar.statisticsSending.booleanValue());
        }
        if (C1848A2.m6809a((Object) eVar.maxReportsInDatabaseCount)) {
            aVar.f26857a.withMaxReportsInDatabaseCount(eVar.maxReportsInDatabaseCount.intValue());
        }
        if (C1848A2.m6809a((Object) eVar.f26854a)) {
            aVar.f26859c = Integer.valueOf(eVar.f26854a.intValue());
        }
        if (C1848A2.m6809a((Object) eVar.f26855b)) {
            aVar.f26858b = Integer.valueOf(eVar.f26855b.intValue());
        }
        if (C1848A2.m6809a((Object) eVar.f26856c)) {
            for (Map.Entry next : eVar.f26856c.entrySet()) {
                aVar.f26860d.put((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C1848A2.m6809a((Object) eVar.userProfileID)) {
            aVar.f26857a.withUserProfileID(eVar.userProfileID);
        }
        return aVar;
    }

    private C10720e(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof C10720e) {
            C10720e eVar = (C10720e) reporterConfig;
            this.f26854a = eVar.f26854a;
            this.f26855b = eVar.f26855b;
            this.f26856c = eVar.f26856c;
            return;
        }
        this.f26854a = null;
        this.f26855b = null;
        this.f26856c = null;
    }

    /* renamed from: a */
    public static C10721a m31575a(String str) {
        return new C10721a(str);
    }
}
