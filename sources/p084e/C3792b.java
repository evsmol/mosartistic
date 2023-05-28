package p084e;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p087h.C3803b;
import p150io.bidmachine.analytics.AnalyticsConfig;
import p150io.bidmachine.analytics.entity.Event;

/* renamed from: e.b */
public class C3792b {

    /* renamed from: a */
    public static final AtomicBoolean f9764a = new AtomicBoolean(false);

    /* renamed from: b */
    public static C3789a f9765b;

    /* renamed from: a */
    public static void m11188a(Context context, AnalyticsConfig analyticsConfig) {
        if (f9764a.compareAndSet(false, true)) {
            C3803b bVar = new C3803b(context);
            bVar.mo18703b();
            f9765b = new C3789a(analyticsConfig, bVar);
        }
    }

    /* renamed from: a */
    public static void m11189a(Event event) {
        C3789a aVar = f9765b;
        if (aVar != null) {
            aVar.mo18669b(event);
        }
    }
}
