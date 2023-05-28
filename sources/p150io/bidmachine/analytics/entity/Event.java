package p150io.bidmachine.analytics.entity;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.bidmachine.analytics.entity.Event */
public class Event {

    /* renamed from: a */
    public final long f12840a = System.currentTimeMillis();

    /* renamed from: b */
    public final String f12841b;

    /* renamed from: c */
    public final Map<String, String> f12842c;

    /* renamed from: d */
    public final Map<String, Double> f12843d;

    public Event(String str) {
        this.f12841b = str;
        this.f12842c = new HashMap();
        this.f12843d = new HashMap();
    }

    public Event addDimension(String str, String str2) {
        this.f12842c.put(str, str2);
        return this;
    }

    public Event addMetric(String str, double d) {
        this.f12843d.put(str, Double.valueOf(d));
        return this;
    }

    public Map<String, String> getDimensions() {
        return this.f12842c;
    }

    public Map<String, Double> getMetrics() {
        return this.f12843d;
    }

    public String getName() {
        return this.f12841b;
    }

    public long getTimestamp() {
        return this.f12840a;
    }

    public Event setDimensions(Map<String, String> map) {
        this.f12842c.clear();
        this.f12842c.putAll(map);
        return this;
    }

    public Event setMetrics(Map<String, Double> map) {
        this.f12843d.clear();
        this.f12843d.putAll(map);
        return this;
    }
}
