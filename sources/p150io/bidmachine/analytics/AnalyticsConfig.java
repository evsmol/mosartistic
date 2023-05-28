package p150io.bidmachine.analytics;

import java.util.ArrayList;
import java.util.List;
import p150io.bidmachine.analytics.entity.AnalyticsMetricConfig;

/* renamed from: io.bidmachine.analytics.AnalyticsConfig */
public class AnalyticsConfig {

    /* renamed from: a */
    public final String f12825a;

    /* renamed from: b */
    public final String f12826b;

    /* renamed from: c */
    public final long f12827c;

    /* renamed from: d */
    public final int f12828d;

    /* renamed from: e */
    public final int f12829e;

    /* renamed from: f */
    public final List<AnalyticsMetricConfig> f12830f;

    /* renamed from: io.bidmachine.analytics.AnalyticsConfig$Builder */
    public static final class Builder {

        /* renamed from: a */
        public final String f12831a;

        /* renamed from: b */
        public final String f12832b;

        /* renamed from: c */
        public final List<AnalyticsMetricConfig> f12833c;

        /* renamed from: d */
        public int f12834d = 30;

        /* renamed from: e */
        public int f12835e = 4;

        /* renamed from: f */
        public int f12836f = 8;

        public Builder(String str, String str2) {
            this.f12831a = str;
            this.f12832b = str2;
            this.f12833c = new ArrayList();
        }

        public Builder addAnalyticsMetricConfig(AnalyticsMetricConfig analyticsMetricConfig) {
            this.f12833c.add(analyticsMetricConfig);
            return this;
        }

        public AnalyticsConfig build() {
            return new AnalyticsConfig(this.f12831a, this.f12832b, this.f12834d, this.f12835e, this.f12836f, this.f12833c);
        }

        public Builder setAnalyticsMetricConfigList(List<AnalyticsMetricConfig> list) {
            this.f12833c.clear();
            this.f12833c.addAll(list);
            return this;
        }

        public Builder setEventBatchSize(int i) {
            return setEventBatchSize(i, (Integer) null);
        }

        public Builder setEventBatchSize(int i, Integer num) {
            int i2;
            this.f12835e = i;
            if (num == null || num.intValue() < i) {
                i2 = i * 2;
                if (i2 < 8) {
                    i2 = 8;
                }
            } else {
                i2 = num.intValue();
            }
            this.f12836f = i2;
            return this;
        }

        public Builder setIntervalSec(int i) {
            this.f12834d = i;
            return this;
        }
    }

    private AnalyticsConfig(String str, String str2, int i, int i2, int i3, List<AnalyticsMetricConfig> list) {
        this.f12825a = str;
        this.f12826b = str2;
        this.f12827c = ((long) i) * 1000;
        this.f12828d = i2;
        this.f12829e = i3;
        this.f12830f = list;
    }

    public List<AnalyticsMetricConfig> getAnalyticsMetricConfigList() {
        return this.f12830f;
    }

    public String getContext() {
        return this.f12826b;
    }

    public int getEventBatchMaxSize() {
        return this.f12829e;
    }

    public int getEventBatchSize() {
        return this.f12828d;
    }

    public long getIntervalMs() {
        return this.f12827c;
    }

    public String getRequestUrl() {
        return this.f12825a;
    }
}
