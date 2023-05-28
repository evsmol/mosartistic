package p150io.bidmachine;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p084e.C3792b;
import p150io.bidmachine.analytics.AnalyticsConfig;
import p150io.bidmachine.analytics.InitializeListener;
import p150io.bidmachine.analytics.entity.Event;
import p158a.C5785a;
import p164c.C6155c;

/* renamed from: io.bidmachine.BidMachineAnalytics */
final class BidMachineAnalytics {

    /* renamed from: a */
    public static final AtomicBoolean f12778a = new AtomicBoolean(false);

    /* renamed from: a */
    public static /* synthetic */ void m14535a(Context context, AnalyticsConfig analyticsConfig, InitializeListener initializeListener) {
        try {
            C3792b.m11188a(context, analyticsConfig);
            C6155c.m14774a(context, analyticsConfig);
            if (initializeListener != null) {
                initializeListener.onInitialized();
            }
        } catch (Throwable unused) {
        }
    }

    public static void initialize(Context context, AnalyticsConfig analyticsConfig) {
        initialize(context, analyticsConfig, (InitializeListener) null);
    }

    public static void initialize(Context context, AnalyticsConfig analyticsConfig, InitializeListener initializeListener) {
        if (f12778a.compareAndSet(false, true)) {
            C5785a.m14757b(new Runnable(context.getApplicationContext(), analyticsConfig, initializeListener) {
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ AnalyticsConfig f$1;
                public final /* synthetic */ InitializeListener f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    BidMachineAnalytics.m14535a(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    public static void trackEvent(Event event) {
        C3792b.m11189a(event);
    }
}
