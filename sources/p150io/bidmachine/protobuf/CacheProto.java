package p150io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.TimestampProto;
import com.explorestack.protobuf.adcom.AdcomProto;
import com.explorestack.protobuf.openrtb.OpenrtbProto;

/* renamed from: io.bidmachine.protobuf.CacheProto */
public final class CacheProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fbidmachine/protobuf/cache.proto\u0012\u0013bidmachine.protobuf\u001a%bidmachine/protobuf/adcom/adcom.proto\u001a)bidmachine/protobuf/openrtb/openrtb.proto\u001a\u001fgoogle/protobuf/timestamp.proto\"ñ\u0001\n\u000fResponsePayload\u0012.\n\ncache_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012?\n\u0011request_item_spec\u0018\u0004 \u0001(\u000b2$.bidmachine.protobuf.adcom.Placement\u0012\u001c\n\u0012response_cache_url\u0018\u0002 \u0001(\tH\u0000\u0012>\n\u000eresponse_cache\u0018\u0003 \u0001(\u000b2$.bidmachine.protobuf.openrtb.OpenrtbH\u0000B\u000f\n\rpayload_oneof\"\f\n\u0013RequestTokenPayload\u0012N\n\u000eplacement_data\u0018\u0001 \u0001(\u000b26.bidmachine.protobuf.RequestTokenPayload.PlacementData\u0012J\n\fsession_data\u0018\u0002 \u0001(\u000b24.bidmachine.protobuf.RequestTokenPayload.SessionData\u0012H\n\u000bdevice_data\u0018\u0003 \u0001(\u000b23.bidmachine.protobuf.RequestTokenPayload.DeviceData\u0012M\n\u000bcustom_data\u0018\u0004 \u0003(\u000b28.bidmachine.protobuf.RequestTokenPayload.CustomDataEntry\u0012D\n\tuser_data\u0018\u0005 \u0001(\u000b21.bidmachine.protobuf.RequestTokenPayload.UserData\u0012B\n\bapp_data\u0018\u0006 \u0001(\u000b20.bidmachine.protobuf.RequestTokenPayload.AppData\u001a,\n\rPlacementData\u0012\u000b\n\u0003sdk\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0002 \u0001(\t\u001aÅ\u0003\n\u000bSessionData\u0012\u0012\n\nsession_id\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fsessionduration\u0018\u0002 \u0001(\u0004\u0012n\n\u0016session_placement_data\u0018\u0003 \u0003(\u000b2N.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataEntry\u001a\u0001\n\u0014SessionPlacementData\u0012\u0010\n\bimpdepth\u0018\u0001 \u0001(\r\u0012\u0012\n\nlastbundle\u0018\u0003 \u0001(\t\u0012\u0013\n\u000blastadomain\u0018\u0004 \u0001(\t\u0012\u0011\n\tclickrate\u0018\u0005 \u0001(\u0002\u0012\u0011\n\tlastclick\u0018\u0006 \u0001(\b\u0012\u0016\n\u000ecompletionrate\u0018\u0007 \u0001(\u0002\u001a\u0001\n\u0019SessionPlacementDataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012X\n\u0005value\u0018\u0002 \u0001(\u000b2I.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData:\u00028\u0001\u001a\u0003\n\nDeviceData\u0012\u000b\n\u0003ifv\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\u0002 \u0001(\t\u0012\u0015\n\rinputlanguage\u0018\u0003 \u0003(\t\u0012\u0011\n\tdiskspace\u0018\u0004 \u0001(\u0004\u0012\u0011\n\ttotaldisk\u0018\u0005 \u0001(\u0004\u0012\u0010\n\bringmute\u0018\u0006 \u0001(\b\u0012\u0010\n\bcharging\u0018\u0007 \u0001(\b\u0012\u000f\n\u0007headset\u0018\b \u0001(\b\u0012\u0014\n\fbatterylevel\u0018\t \u0001(\u0002\u0012\u0014\n\fbatterysaver\u0018\n \u0001(\b\u0012\u0010\n\bdarkmode\u0018\u000b \u0001(\b\u0012\u0010\n\bairplane\u0018\f \u0001(\b\u0012\u000b\n\u0003dnd\u0018\r \u0001(\b\u0012\u0012\n\ndevicename\u0018\u000e \u0001(\t\u0012\f\n\u0004time\u0018\u000f \u0001(\u0004\u0012\u0014\n\fscreenbright\u0018\u0010 \u0001(\u0002\u0012\u0011\n\tjailbreak\u0018\u0011 \u0001(\b\u0012\u0012\n\nlastbootup\u0018\u0012 \u0001(\u0004\u0012\u000e\n\u0006access\u0018\u0013 \u0001(\t\u0012\u0013\n\u000bheadsetname\u0018\u0014 \u0001(\t\u0012\u0010\n\btotalmem\u0018\u0015 \u0001(\u0004\u0012\f\n\u0004atts\u0018\u0016 \u0001(\r\u001a1\n\u000fCustomDataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a7\n\bUserData\u0012\u000f\n\u0007consent\u0018\u0001 \u0001(\t\u0012\f\n\u0004gdpr\u0018\u0002 \u0001(\b\u0012\f\n\u0004ccpa\u0018\u0003 \u0001(\t\u001a,\n\u0007AppData\u0012\u0010\n\bapp_name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007app_ver\u0018\u0002 \u0001(\tB,\n\u0016io.bidmachine.protobufB\nCacheProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{AdcomProto.getDescriptor(), OpenrtbProto.getDescriptor(), TimestampProto.getDescriptor()});

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_descriptor */
    static final Descriptors.Descriptor f12848xaf207aac;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12849xed70352a;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor */
    static final Descriptors.Descriptor f12850x11ac4120;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12851xb1d8479e;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_descriptor */
    static final Descriptors.Descriptor f12852x10ef6165;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12853x426d52e3;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_descriptor */
    static final Descriptors.Descriptor f12854x75756ea8;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12855x87f6d26;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor */
    static final Descriptors.Descriptor f12856x20faa07d;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12857xd533f9fb;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor */
    static final Descriptors.Descriptor f12858x95df756d;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12859xd22cdeeb;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor */
    static final Descriptors.Descriptor f12860x516abd17;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12861x42f2dc95;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_descriptor */
    static final Descriptors.Descriptor f12862xf1b6cd10;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12863x104fe38e;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor */
    static final Descriptors.Descriptor f12864xd4ee2838;

    /* renamed from: internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12865x4aad96b6;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_ResponsePayload_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f12866xd1287a8d;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private CacheProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_ResponsePayload_descriptor = descriptor2;
        f12866xd1287a8d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CacheTime", "RequestItemSpec", "ResponseCacheUrl", "ResponseCache", "PayloadOneof"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        f12864xd4ee2838 = descriptor3;
        f12865x4aad96b6 = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"PlacementData", "SessionData", "DeviceData", "CustomData", "UserData", "AppData"});
        Descriptors.Descriptor descriptor4 = f12864xd4ee2838.getNestedTypes().get(0);
        f12854x75756ea8 = descriptor4;
        f12855x87f6d26 = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Sdk", "Sdkver"});
        Descriptors.Descriptor descriptor5 = f12864xd4ee2838.getNestedTypes().get(1);
        f12860x516abd17 = descriptor5;
        f12861x42f2dc95 = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"SessionId", "Sessionduration", "SessionPlacementData"});
        Descriptors.Descriptor descriptor6 = f12860x516abd17.getNestedTypes().get(0);
        f12858x95df756d = descriptor6;
        f12859xd22cdeeb = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Impdepth", "Lastbundle", "Lastadomain", "Clickrate", "Lastclick", "Completionrate"});
        Descriptors.Descriptor descriptor7 = f12860x516abd17.getNestedTypes().get(1);
        f12856x20faa07d = descriptor7;
        f12857xd533f9fb = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor8 = f12864xd4ee2838.getNestedTypes().get(2);
        f12852x10ef6165 = descriptor8;
        f12853x426d52e3 = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Ifv", "BmIfv", "Inputlanguage", "Diskspace", "Totaldisk", "Ringmute", "Charging", "Headset", "Batterylevel", "Batterysaver", "Darkmode", "Airplane", "Dnd", "Devicename", "Time", "Screenbright", "Jailbreak", "Lastbootup", "Access", "Headsetname", "Totalmem", "Atts"});
        Descriptors.Descriptor descriptor9 = f12864xd4ee2838.getNestedTypes().get(3);
        f12850x11ac4120 = descriptor9;
        f12851xb1d8479e = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor10 = f12864xd4ee2838.getNestedTypes().get(4);
        f12862xf1b6cd10 = descriptor10;
        f12863x104fe38e = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Consent", "Gdpr", "Ccpa"});
        Descriptors.Descriptor descriptor11 = f12864xd4ee2838.getNestedTypes().get(5);
        f12848xaf207aac = descriptor11;
        f12849xed70352a = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"AppName", "AppVer"});
        AdcomProto.getDescriptor();
        OpenrtbProto.getDescriptor();
        TimestampProto.getDescriptor();
    }
}
