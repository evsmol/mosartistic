package p150io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;

/* renamed from: io.bidmachine.protobuf.headerbidding.HeaderBiddingProto */
public final class HeaderBiddingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n5bidmachine/protobuf/headerbidding/headerbidding.proto\u0012!bidmachine.protobuf.headerbidding\"Ö\u0002\n\u0016HeaderBiddingPlacement\u0012R\n\bad_units\u0018\u0001 \u0003(\u000b2@.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit\u001aç\u0001\n\u0006AdUnit\u0012\u000e\n\u0006bidder\u0018\u0001 \u0001(\t\u0012\u0015\n\rbidder_sdkver\u0018\u0002 \u0001(\t\u0012i\n\rclient_params\u0018\u0003 \u0003(\u000b2R.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.ClientParamsEntry\u0012\u0016\n\u000eprice_estimate\u0018\u0004 \u0001(\u0001\u001a3\n\u0011ClientParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"Å\u0002\n\u000fHeaderBiddingAd\u0012\u000e\n\u0006bidder\u0018\u0001 \u0001(\t\u0012[\n\rclient_params\u0018\u0002 \u0003(\u000b2D.bidmachine.protobuf.headerbidding.HeaderBiddingAd.ClientParamsEntry\u0012[\n\rserver_params\u0018\u0003 \u0003(\u000b2D.bidmachine.protobuf.headerbidding.HeaderBiddingAd.ServerParamsEntry\u001a3\n\u0011ClientParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a3\n\u0011ServerParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001BB\n$io.bidmachine.protobuf.headerbiddingB\u0012HeaderBiddingProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor */
    static final Descriptors.Descriptor f12911x81b5b3da;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12912x3c086058;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor */
    static final Descriptors.Descriptor f12913x64f68552;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12914x3dfc39d0;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor */
    static final Descriptors.Descriptor f12915x7474efbc;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12916xa9c69a3a;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_descriptor */
    static final Descriptors.Descriptor f12917x652ceffc;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12918x739a5a7a;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor */
    static final Descriptors.Descriptor f12919x82b2505e;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12920xa7f238dc;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor */
    static final Descriptors.Descriptor f12921x11be5538;

    /* renamed from: internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12922xbf00c3b6;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private HeaderBiddingProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        f12921x11be5538 = descriptor2;
        f12922xbf00c3b6 = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"AdUnits"});
        Descriptors.Descriptor descriptor3 = f12921x11be5538.getNestedTypes().get(0);
        f12919x82b2505e = descriptor3;
        f12920xa7f238dc = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Bidder", "BidderSdkver", "ClientParams", "PriceEstimate"});
        Descriptors.Descriptor descriptor4 = f12919x82b2505e.getNestedTypes().get(0);
        f12917x652ceffc = descriptor4;
        f12918x739a5a7a = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(1);
        f12915x7474efbc = descriptor5;
        f12916xa9c69a3a = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Bidder", "ClientParams", "ServerParams"});
        Descriptors.Descriptor descriptor6 = f12915x7474efbc.getNestedTypes().get(0);
        f12911x81b5b3da = descriptor6;
        f12912x3c086058 = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor7 = f12915x7474efbc.getNestedTypes().get(1);
        f12913x64f68552 = descriptor7;
        f12914x3dfc39d0 = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Key", "Value"});
    }
}
