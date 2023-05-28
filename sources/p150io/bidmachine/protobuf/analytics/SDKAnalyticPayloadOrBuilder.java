package p150io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;
import p150io.bidmachine.protobuf.analytics.SDKAnalyticPayload;

/* renamed from: io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder */
public interface SDKAnalyticPayloadOrBuilder extends MessageOrBuilder {
    SDKAnalyticPayload.Metric getMetrics(int i);

    int getMetricsCount();

    List<SDKAnalyticPayload.Metric> getMetricsList();

    SDKAnalyticPayload.MetricOrBuilder getMetricsOrBuilder(int i);

    List<? extends SDKAnalyticPayload.MetricOrBuilder> getMetricsOrBuilderList();
}
