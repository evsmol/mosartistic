package p085f;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p150io.bidmachine.protobuf.analytics.SDKAnalyticPayload;
import p163b.C6148a;

/* renamed from: f.e */
public class C3799e extends C3793a<C3799e> {

    /* renamed from: f */
    public final List<C6148a> f9776f;

    public C3799e(String str, List<C6148a> list) {
        super(C3798d.Post, str);
        this.f9776f = list;
    }

    /* renamed from: a */
    public final SDKAnalyticPayload.Metric.MetricData mo18691a(C6148a aVar) {
        try {
            SDKAnalyticPayload.Metric.MetricData.Builder name = SDKAnalyticPayload.Metric.MetricData.newBuilder().setTimestamp(String.valueOf(aVar.mo50207f())).setName(aVar.mo50206e());
            JSONObject b = aVar.mo50203b();
            if (b.length() > 0) {
                Iterator<String> keys = b.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    name.addDimensions(SDKAnalyticPayload.Metric.MetricData.Dimension.newBuilder().setName(next).setValue(b.optString(next)));
                }
            }
            JSONObject d = aVar.mo50205d();
            if (d.length() > 0) {
                Iterator<String> keys2 = d.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    name.addMeasures(SDKAnalyticPayload.Metric.MetricData.Measure.newBuilder().setName(next2).setValue(d.optDouble(next2)));
                }
            }
            return name.build();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public void mo18685c(URLConnection uRLConnection) {
        uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
    }

    /* renamed from: e */
    public byte[] mo18687e() {
        try {
            HashMap hashMap = new HashMap();
            for (C6148a next : this.f9776f) {
                String a = next.mo50202a();
                SDKAnalyticPayload.Metric.Builder builder = (SDKAnalyticPayload.Metric.Builder) hashMap.get(a);
                if (builder == null) {
                    builder = SDKAnalyticPayload.Metric.newBuilder().setContext(a);
                    hashMap.put(a, builder);
                }
                builder.addData(mo18691a(next));
            }
            SDKAnalyticPayload.Builder newBuilder = SDKAnalyticPayload.newBuilder();
            for (SDKAnalyticPayload.Metric.Builder addMetrics : hashMap.values()) {
                newBuilder.addMetrics(addMetrics);
            }
            return newBuilder.build().toByteArray();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C3799e mo18686d() {
        return this;
    }

    /* renamed from: h */
    public List<C6148a> mo18693h() {
        return this.f9776f;
    }
}
