package com.yandex.metrica;

import com.yandex.metrica.impl.p082ob.C1848A2;
import com.yandex.metrica.impl.p082ob.C2103Hn;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import com.yandex.metrica.impl.p082ob.C2289Ln;

public class ReporterConfig {
    public final String apiKey;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: g */
        private static final C2252Kn<String> f26743g = new C2103Hn(new C2289Ln());
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f26744a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Integer f26745b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Boolean f26746c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Boolean f26747d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f26748e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f26749f;

        Builder(String str) {
            ((C2103Hn) f26743g).mo15517a(str);
            this.f26744a = str;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        public Builder withLogs() {
            this.f26746c = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f26748e = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f26745b = Integer.valueOf(i);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f26747d = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f26749f = str;
            return this;
        }
    }

    ReporterConfig(Builder builder) {
        this.apiKey = builder.f26744a;
        this.sessionTimeout = builder.f26745b;
        this.logs = builder.f26746c;
        this.statisticsSending = builder.f26747d;
        this.maxReportsInDatabaseCount = builder.f26748e;
        this.userProfileID = builder.f26749f;
    }

    public static Builder createBuilderFromConfig(ReporterConfig reporterConfig) {
        Builder newConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (C1848A2.m6809a((Object) reporterConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (C1848A2.m6809a((Object) reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C1848A2.m6809a((Object) reporterConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (C1848A2.m6809a((Object) reporterConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C1848A2.m6809a((Object) reporterConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return newConfigBuilder;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }
}
