package p150io.bidmachine.analytics.entity;

import java.util.List;

/* renamed from: io.bidmachine.analytics.entity.AnalyticsMetricConfig */
public class AnalyticsMetricConfig {

    /* renamed from: a */
    public final String f12837a;

    /* renamed from: b */
    public final List<String> f12838b;

    /* renamed from: c */
    public final List<String> f12839c;

    public AnalyticsMetricConfig(String str, List<String> list, List<String> list2) {
        this.f12837a = str;
        this.f12838b = list;
        this.f12839c = list2;
    }

    public List<String> getDimensions() {
        return this.f12838b;
    }

    public String getEventName() {
        return this.f12837a;
    }

    public List<String> getMetrics() {
        return this.f12839c;
    }
}
