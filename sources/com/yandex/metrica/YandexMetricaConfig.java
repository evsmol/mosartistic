package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.p082ob.C1848A2;
import com.yandex.metrica.impl.p082ob.C2103Hn;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import com.yandex.metrica.impl.p082ob.C2289Ln;
import com.yandex.metrica.impl.p082ob.C3172m1;
import java.util.LinkedHashMap;
import java.util.Map;

public class YandexMetricaConfig {
    public final String apiKey;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: r */
        private static final C2252Kn<String> f26760r = new C2103Hn(new C2289Ln());
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f26761a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f26762b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Integer f26763c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Boolean f26764d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Boolean f26765e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Location f26766f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Boolean f26767g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Boolean f26768h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public PreloadInfo f26769i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Boolean f26770j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Boolean f26771k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Integer f26772l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public LinkedHashMap<String, String> f26773m = new LinkedHashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f26774n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Boolean f26775o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Boolean f26776p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Boolean f26777q;

        protected Builder(String str) {
            ((C2103Hn) f26760r).mo15517a(str);
            this.f26761a = str;
        }

        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f26770j = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f26777q = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f26762b = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f26764d = Boolean.valueOf(z);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f26773m.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f26766f = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f26767g = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f26768h = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f26772l = Integer.valueOf(i);
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f26765e = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f26769i = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f26775o = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f26763c = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f26776p = Boolean.valueOf(z);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f26771k = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f26774n = str;
            return this;
        }
    }

    protected YandexMetricaConfig(Builder builder) {
        this.apiKey = builder.f26761a;
        this.appVersion = builder.f26762b;
        this.sessionTimeout = builder.f26763c;
        this.crashReporting = builder.f26764d;
        this.nativeCrashReporting = builder.f26765e;
        this.location = builder.f26766f;
        this.locationTracking = builder.f26767g;
        this.logs = builder.f26768h;
        this.preloadInfo = builder.f26769i;
        this.firstActivationAsUpdate = builder.f26770j;
        this.statisticsSending = builder.f26771k;
        this.maxReportsInDatabaseCount = builder.f26772l;
        this.errorEnvironment = C1848A2.m6819e(builder.f26773m);
        this.userProfileID = builder.f26774n;
        this.revenueAutoTrackingEnabled = builder.f26775o;
        this.sessionsAutoTrackingEnabled = builder.f26776p;
        this.appOpenTrackingEnabled = builder.f26777q;
    }

    public static Builder createBuilderFromConfig(YandexMetricaConfig yandexMetricaConfig) {
        Builder newConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (C1848A2.m6809a((Object) yandexMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.location)) {
            newConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.preloadInfo)) {
            newConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry next : yandexMetricaConfig.errorEnvironment.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C1848A2.m6809a((Object) yandexMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return newConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C3172m1().mo17829a(str);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C3172m1().mo17830a(this);
    }

    protected YandexMetricaConfig(YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }
}
