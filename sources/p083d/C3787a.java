package p083d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.UUID;
import p150io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import p164c.C6153a;
import p164c.C6154b;

/* renamed from: d.a */
public class C3787a extends C6153a {

    /* renamed from: b */
    public final C3788a f9755b;

    /* renamed from: d.a$a */
    public static final class C3788a implements AppLovinCommunicatorSubscriber {

        /* renamed from: a */
        public final AnalyticsMetricConfig f9756a;

        /* renamed from: b */
        public final C6154b f9757b;

        /* renamed from: c */
        public final String f9758c = UUID.randomUUID().toString();

        public C3788a(AnalyticsMetricConfig analyticsMetricConfig, C6154b bVar) {
            this.f9756a = analyticsMetricConfig;
            this.f9757b = bVar;
        }

        /* renamed from: a */
        public final String mo18657a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj == null) {
                return null;
            }
            String valueOf = String.valueOf(obj);
            if (TextUtils.isEmpty(valueOf)) {
                return null;
            }
            return valueOf;
        }

        public String getCommunicatorId() {
            return this.f9758c;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:53|54|55|56|70) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00ab */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage r7) {
            /*
                r6 = this;
                if (r7 != 0) goto L_0x0003
                return
            L_0x0003:
                java.lang.String r0 = "max_revenue_events"
                java.lang.String r1 = r7.getTopic()     // Catch:{ all -> 0x00b4 }
                boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b4 }
                if (r0 != 0) goto L_0x0010
                return
            L_0x0010:
                android.os.Bundle r7 = r7.getMessageData()     // Catch:{ all -> 0x00b4 }
                int r0 = r7.size()     // Catch:{ all -> 0x00b4 }
                if (r0 == 0) goto L_0x00b4
                io.bidmachine.analytics.entity.Event r0 = new io.bidmachine.analytics.entity.Event     // Catch:{ all -> 0x00b4 }
                java.lang.String r1 = "mimp"
                r0.<init>(r1)     // Catch:{ all -> 0x00b4 }
                io.bidmachine.analytics.entity.AnalyticsMetricConfig r1 = r6.f9756a     // Catch:{ all -> 0x00b4 }
                java.util.List r1 = r1.getDimensions()     // Catch:{ all -> 0x00b4 }
                io.bidmachine.analytics.entity.AnalyticsMetricConfig r2 = r6.f9756a     // Catch:{ all -> 0x00b4 }
                java.util.List r2 = r2.getMetrics()     // Catch:{ all -> 0x00b4 }
                if (r1 == 0) goto L_0x0035
                int r3 = r1.size()     // Catch:{ all -> 0x00b4 }
                if (r3 != 0) goto L_0x003e
            L_0x0035:
                if (r2 == 0) goto L_0x0088
                int r3 = r2.size()     // Catch:{ all -> 0x00b4 }
                if (r3 != 0) goto L_0x003e
                goto L_0x0088
            L_0x003e:
                if (r1 == 0) goto L_0x0061
                int r3 = r1.size()     // Catch:{ all -> 0x00b4 }
                if (r3 <= 0) goto L_0x0061
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b4 }
            L_0x004a:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00b4 }
                if (r3 == 0) goto L_0x0061
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b4 }
                java.lang.String r4 = r6.mo18657a(r7, r3)     // Catch:{ Exception -> 0x004a }
                if (r4 != 0) goto L_0x005d
                goto L_0x004a
            L_0x005d:
                r0.addDimension(r3, r4)     // Catch:{ Exception -> 0x004a }
                goto L_0x004a
            L_0x0061:
                if (r2 == 0) goto L_0x00af
                int r1 = r2.size()     // Catch:{ all -> 0x00b4 }
                if (r1 <= 0) goto L_0x00af
                java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x00b4 }
            L_0x006d:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b4 }
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b4 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = r6.mo18657a(r7, r2)     // Catch:{ Exception -> 0x006d }
                if (r3 != 0) goto L_0x0080
                goto L_0x006d
            L_0x0080:
                double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x006d }
                r0.addMetric(r2, r3)     // Catch:{ Exception -> 0x006d }
                goto L_0x006d
            L_0x0088:
                java.util.Set r1 = r7.keySet()     // Catch:{ all -> 0x00b4 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b4 }
            L_0x0090:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b4 }
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b4 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = r6.mo18657a(r7, r2)     // Catch:{ Exception -> 0x0090 }
                if (r3 != 0) goto L_0x00a3
                goto L_0x0090
            L_0x00a3:
                double r4 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x00ab }
                r0.addMetric(r2, r4)     // Catch:{ NumberFormatException -> 0x00ab }
                goto L_0x0090
            L_0x00ab:
                r0.addDimension(r2, r3)     // Catch:{ Exception -> 0x0090 }
                goto L_0x0090
            L_0x00af:
                c.b r7 = r6.f9757b     // Catch:{ all -> 0x00b4 }
                r7.mo50213a(r0)     // Catch:{ all -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p083d.C3787a.C3788a.onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage):void");
        }
    }

    public C3787a(AnalyticsMetricConfig analyticsMetricConfig, C6154b bVar) {
        this.f9755b = new C3788a(analyticsMetricConfig, bVar);
    }

    /* renamed from: b */
    public void mo18656b(Context context) {
        AppLovinCommunicator.getInstance(context).subscribe((AppLovinCommunicatorSubscriber) this.f9755b, "max_revenue_events");
    }
}
