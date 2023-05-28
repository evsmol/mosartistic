package p164c;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p083d.C3787a;
import p084e.C3792b;
import p150io.bidmachine.analytics.AnalyticsConfig;
import p150io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import p150io.bidmachine.analytics.entity.Event;

/* renamed from: c.c */
public class C6155c {

    /* renamed from: a */
    public static final AtomicBoolean f13108a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final List<C6153a> f13109b = new CopyOnWriteArrayList();

    /* renamed from: c.c$b */
    public static final class C6157b implements C6154b {
        private C6157b() {
        }

        /* renamed from: a */
        public void mo50213a(Event event) {
            C3792b.m11189a(event);
        }
    }

    /* renamed from: a */
    public static void m14773a(Context context) {
        Context applicationContext = context.getApplicationContext();
        for (C6153a a : f13109b) {
            a.mo50212a(applicationContext);
        }
    }

    /* renamed from: a */
    public static void m14774a(Context context, AnalyticsConfig analyticsConfig) {
        if (f13108a.compareAndSet(false, true)) {
            for (AnalyticsMetricConfig next : analyticsConfig.getAnalyticsMetricConfigList()) {
                try {
                    if (next.getEventName().equals("mimp")) {
                        f13109b.add(new C3787a(next, new C6157b()));
                    }
                } catch (Throwable unused) {
                }
            }
            m14773a(context);
        }
    }
}
