package p150io.bidmachine.protobuf.analytics;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;

/* renamed from: io.bidmachine.protobuf.analytics.SDKAnalyticProto */
public final class SDKAnalyticProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n'bidmachine/protobuf/analytics/sdk.proto\u0012\u001dbidmachine.protobuf.analytics\"\u0005\n\u0012SDKAnalyticPayload\u0012I\n\u0007metrics\u0018\u0001 \u0003(\u000b28.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric\u001a¶\u0004\n\u0006Metric\u0012\u000f\n\u0007context\u0018\u0001 \u0001(\t\u0012Q\n\u0004data\u0018\u0002 \u0003(\u000b2C.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData\u001aÇ\u0003\n\nMetricData\u0012\u0011\n\ttimestamp\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012a\n\ndimensions\u0018\u0003 \u0003(\u000b2M.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension\u0012]\n\bmeasures\u0018\u0004 \u0003(\u000b2K.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure\u0012X\n\u0005error\u0018\u0005 \u0001(\u000b2I.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error\u001a(\n\tDimension\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u001a&\n\u0007Measure\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0001\u001a*\n\u0005Error\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\tB<\n io.bidmachine.protobuf.analyticsB\u0010SDKAnalyticProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor */
    static final Descriptors.Descriptor f12899x769ec1cf;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12900x9712a94d;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor */
    static final Descriptors.Descriptor f12901x643c8f6d;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12902xe6cff8eb;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor */
    static final Descriptors.Descriptor f12903xa931ac97;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12904x7a924c15;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor */
    static final Descriptors.Descriptor f12905x79f1df6;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12906x5663ee74;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor */
    static final Descriptors.Descriptor f12907x6a8b01ed;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12908x5ac3eb6b;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor */
    static final Descriptors.Descriptor f12909x55a22da0;

    /* renamed from: internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12910x6959b41e;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private SDKAnalyticProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        f12909x55a22da0 = descriptor2;
        f12910x6959b41e = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Metrics"});
        Descriptors.Descriptor descriptor3 = f12909x55a22da0.getNestedTypes().get(0);
        f12907x6a8b01ed = descriptor3;
        f12908x5ac3eb6b = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Context", "Data"});
        Descriptors.Descriptor descriptor4 = f12907x6a8b01ed.getNestedTypes().get(0);
        f12905x79f1df6 = descriptor4;
        f12906x5663ee74 = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Timestamp", "Name", "Dimensions", "Measures", LogConstants.EVENT_ERROR});
        Descriptors.Descriptor descriptor5 = f12905x79f1df6.getNestedTypes().get(0);
        f12899x769ec1cf = descriptor5;
        f12900x9712a94d = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Name", "Value"});
        Descriptors.Descriptor descriptor6 = f12905x79f1df6.getNestedTypes().get(1);
        f12903xa931ac97 = descriptor6;
        f12904x7a924c15 = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Name", "Value"});
        Descriptors.Descriptor descriptor7 = f12905x79f1df6.getNestedTypes().get(2);
        f12901x643c8f6d = descriptor7;
        f12902xe6cff8eb = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Name", "Description"});
    }
}
