package com.explorestack.protobuf.adcom;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.AnyProto;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.StructProto;

public final class AdcomProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%bidmachine/protobuf/adcom/adcom.proto\u0012\u0019bidmachine.protobuf.adcom\u001a\u0019google/protobuf/any.proto\u001a\u001cgoogle/protobuf/struct.proto\"ü\u001e\n\u0007Context\u00123\n\u0003app\u0018\u0001 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.App\u00129\n\u0006device\u0018\u0002 \u0001(\u000b2).bidmachine.protobuf.adcom.Context.Device\u00125\n\u0004regs\u0018\u0003 \u0001(\u000b2'.bidmachine.protobuf.adcom.Context.Regs\u0012E\n\frestrictions\u0018\u0004 \u0001(\u000b2/.bidmachine.protobuf.adcom.Context.Restrictions\u00125\n\u0004user\u0018\u0005 \u0001(\u000b2'.bidmachine.protobuf.adcom.Context.User\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001aè\f\n\u0003App\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012=\n\u0003pub\u0018\u0003 \u0001(\u000b20.bidmachine.protobuf.adcom.Context.App.Publisher\u0012?\n\u0007content\u0018\u0004 \u0001(\u000b2..bidmachine.protobuf.adcom.Context.App.Content\u0012\u000e\n\u0006domain\u0018\u0005 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0006 \u0003(\t\u0012\u000f\n\u0007sectcat\u0018\u0007 \u0003(\t\u0012\u000f\n\u0007pagecat\u0018\b \u0003(\t\u0012;\n\u0006cattax\u0018\t \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\u0012\n\nprivpolicy\u0018\n \u0001(\b\u0012\u0010\n\bkeywords\u0018\u000b \u0001(\t\u0012\u000e\n\u0006bundle\u0018\f \u0001(\t\u0012\u000f\n\u0007storeid\u0018\r \u0001(\t\u0012\u0010\n\bstoreurl\u0018\u000e \u0001(\t\u0012\u000b\n\u0003ver\u0018\u000f \u0001(\t\u0012\f\n\u0004paid\u0018\u0010 \u0001(\b\u0012$\n\u0003ext\u0018\u0012 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0011 \u0003(\u000b2\u0014.google.protobuf.Any\u001aÎ\u0001\n\tPublisher\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006domain\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0004 \u0003(\t\u0012;\n\u0006cattax\u0018\u0005 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¶\u0007\n\u0007Content\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007episode\u0018\u0002 \u0001(\r\u0012\r\n\u0005title\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006series\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006season\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006artist\u0018\u0006 \u0001(\t\u0012\r\n\u0005genre\u0018\u0007 \u0001(\t\u0012\r\n\u0005album\u0018\b \u0001(\t\u0012\f\n\u0004isrc\u0018\t \u0001(\t\u0012\u000b\n\u0003url\u0018\n \u0001(\t\u0012\u000b\n\u0003cat\u0018\u000b \u0003(\t\u0012;\n\u0006cattax\u0018\f \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012;\n\u0005prodq\u0018\r \u0001(\u000e2,.bidmachine.protobuf.adcom.ProductionQuality\u0012:\n\u0007context\u0018\u000e \u0001(\u000e2).bidmachine.protobuf.adcom.ContentContext\u0012\u000e\n\u0006rating\u0018\u000f \u0001(\t\u0012\u000f\n\u0007urating\u0018\u0010 \u0001(\t\u00127\n\u0007mrating\u0018\u0011 \u0001(\u000e2&.bidmachine.protobuf.adcom.MediaRating\u0012\u0010\n\bkeywords\u0018\u0012 \u0001(\t\u0012\f\n\u0004live\u0018\u0013 \u0001(\b\u0012\u000e\n\u0006srcrel\u0018\u0014 \u0001(\r\u0012\u000b\n\u0003len\u0018\u0015 \u0001(\r\u0012\f\n\u0004lang\u0018\u0016 \u0001(\t\u0012\r\n\u0005embed\u0018\u0017 \u0001(\b\u0012I\n\bproducer\u0018\u0018 \u0001(\u000b27.bidmachine.protobuf.adcom.Context.App.Content.Producer\u00125\n\u0004data\u0018\u0019 \u0003(\u000b2'.bidmachine.protobuf.adcom.Context.Data\u0012$\n\u0003ext\u0018\u001b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u001a \u0003(\u000b2\u0014.google.protobuf.Any\u001aÍ\u0001\n\bProducer\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006domain\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0004 \u0003(\t\u0012;\n\u0006cattax\u0018\u0005 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001aµ\u0002\n\u0004Data\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012@\n\u0007segment\u0018\u0003 \u0003(\u000b2/.bidmachine.protobuf.adcom.Context.Data.Segment\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0001\n\u0007Segment\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\r\n\u0005value\u0018\u0003 \u0001(\t\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001aá\u0002\n\u0003Geo\u00125\n\u0004type\u0018\u0001 \u0001(\u000e2'.bidmachine.protobuf.adcom.LocationType\u0012\u000b\n\u0003lat\u0018\u0002 \u0001(\u0002\u0012\u000b\n\u0003lon\u0018\u0003 \u0001(\u0002\u0012\r\n\u0005accur\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007lastfix\u0018\u0005 \u0001(\u0004\u0012<\n\u0006ipserv\u0018\u0006 \u0001(\u000e2,.bidmachine.protobuf.adcom.IpLocationService\u0012\u000f\n\u0007country\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006region\u0018\b \u0001(\t\u0012\r\n\u0005metro\u0018\t \u0001(\t\u0012\f\n\u0004city\u0018\n \u0001(\t\u0012\u000b\n\u0003zip\u0018\u000b \u0001(\t\u0012\u0011\n\tutcoffset\u0018\f \u0001(\u0005\u0012$\n\u0003ext\u0018\u000e \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\r \u0003(\u000b2\u0014.google.protobuf.Any\u001aÛ\u0004\n\u0006Device\u00123\n\u0004type\u0018\u0001 \u0001(\u000e2%.bidmachine.protobuf.adcom.DeviceType\u0012\n\n\u0002ua\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003ifa\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003dnt\u0018\u0004 \u0001(\b\u0012\u000b\n\u0003lmt\u0018\u0005 \u0001(\b\u0012\f\n\u0004make\u0018\u0006 \u0001(\t\u0012\r\n\u0005model\u0018\u0007 \u0001(\t\u0012)\n\u0002os\u0018\b \u0001(\u000e2\u001d.bidmachine.protobuf.adcom.OS\u0012\u000b\n\u0003osv\u0018\t \u0001(\t\u0012\u000b\n\u0003hwv\u0018\n \u0001(\t\u0012\t\n\u0001h\u0018\u000b \u0001(\r\u0012\t\n\u0001w\u0018\f \u0001(\r\u0012\u000b\n\u0003ppi\u0018\r \u0001(\r\u0012\u000f\n\u0007pxratio\u0018\u000e \u0001(\u0002\u0012\n\n\u0002js\u0018\u000f \u0001(\b\u0012\f\n\u0004lang\u0018\u0010 \u0001(\t\u0012\n\n\u0002ip\u0018\u0011 \u0001(\t\u0012\f\n\u0004ipv6\u0018\u0012 \u0001(\t\u0012\u000b\n\u0003xff\u0018\u0013 \u0001(\t\u0012\f\n\u0004iptr\u0018\u0014 \u0001(\b\u0012\u000f\n\u0007carrier\u0018\u0015 \u0001(\t\u0012\u000e\n\u0006mccmnc\u0018\u0016 \u0001(\t\u0012\u0011\n\tmccmncsim\u0018\u0017 \u0001(\t\u0012:\n\u0007contype\u0018\u0018 \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012\u0010\n\bgeofetch\u0018\u0019 \u0001(\b\u00123\n\u0003geo\u0018\u001a \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u0012$\n\u0003ext\u0018\u001c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u001b \u0003(\u000b2\u0014.google.protobuf.Any\u001ar\n\u0004Regs\u0012\r\n\u0005coppa\u0018\u0001 \u0001(\b\u0012\f\n\u0004gdpr\u0018\u0002 \u0001(\b\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0002\n\fRestrictions\u0012\f\n\u0004bcat\u0018\u0001 \u0003(\t\u0012;\n\u0006cattax\u0018\u0002 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\f\n\u0004badv\u0018\u0003 \u0003(\t\u0012\f\n\u0004bapp\u0018\u0004 \u0003(\t\u0012;\n\u0005battr\u0018\u0005 \u0003(\u000e2,.bidmachine.protobuf.adcom.CreativeAttribute\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0002\n\u0004User\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u0010\n\bbuyeruid\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003yob\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006gender\u0018\u0004 \u0001(\t\u0012\u0010\n\bkeywords\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007consent\u0018\u0006 \u0001(\t\u00123\n\u0003geo\u0018\u0007 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u00125\n\u0004data\u0018\b \u0003(\u000b2'.bidmachine.protobuf.adcom.Context.Data\u0012$\n\u0003ext\u0018\n \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\t \u0003(\u000b2\u0014.google.protobuf.Any\"Ï\"\n\tPlacement\u0012\r\n\u0005tagid\u0018\u0001 \u0001(\t\u0012\f\n\u0004ssai\u0018\u0002 \u0001(\r\u0012\u000b\n\u0003sdk\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006reward\u0018\u0005 \u0001(\b\u0012\f\n\u0004bcat\u0018\u0006 \u0003(\t\u0012;\n\u0006cattax\u0018\u0007 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\f\n\u0004badv\u0018\t \u0003(\t\u0012\f\n\u0004bapp\u0018\n \u0003(\t\u0012;\n\u0005battr\u0018\u000b \u0003(\u000e2,.bidmachine.protobuf.adcom.CreativeAttribute\u0012\r\n\u0005wlang\u0018\f \u0003(\t\u0012\u000e\n\u0006secure\u0018\r \u0001(\b\u0012\f\n\u0004admx\u0018\u000e \u0001(\b\u0012\r\n\u0005curlx\u0018\u000f \u0001(\b\u0012F\n\u0007display\u0018\u0010 \u0001(\u000b25.bidmachine.protobuf.adcom.Placement.DisplayPlacement\u0012B\n\u0005video\u0018\u0011 \u0001(\u000b23.bidmachine.protobuf.adcom.Placement.VideoPlacement\u0012$\n\u0003ext\u0018\u0014 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0013 \u0003(\u000b2\u0014.google.protobuf.Any\u001aí\u0014\n\u0010DisplayPlacement\u00129\n\u0003pos\u0018\u0001 \u0001(\u000e2,.bidmachine.protobuf.adcom.PlacementPosition\u0012\r\n\u0005instl\u0018\u0002 \u0001(\b\u0012\u0010\n\btopframe\u0018\u0003 \u0001(\b\u0012\u000f\n\u0007ifrbust\u0018\u0004 \u0003(\t\u00125\n\u0007clktype\u0018\u0005 \u0001(\u000e2$.bidmachine.protobuf.adcom.ClickType\u0012\u000e\n\u0006ampren\u0018\u0006 \u0001(\r\u0012>\n\u0005ptype\u0018\u0007 \u0001(\u000e2/.bidmachine.protobuf.adcom.DisplayPlacementType\u0012>\n\u0007context\u0018\b \u0001(\u000e2-.bidmachine.protobuf.adcom.DisplayContextType\u0012\f\n\u0004mime\u0018\t \u0003(\t\u00124\n\u0003api\u0018\n \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012=\n\u0005ctype\u0018\u000b \u0003(\u000e2..bidmachine.protobuf.adcom.DisplayCreativeType\u0012\t\n\u0001w\u0018\f \u0001(\r\u0012\t\n\u0001h\u0018\r \u0001(\r\u00121\n\u0004unit\u0018\u000e \u0001(\u000e2#.bidmachine.protobuf.adcom.SizeUnit\u0012\f\n\u0004priv\u0018\u000f \u0001(\b\u0012W\n\ndisplayfmt\u0018\u0010 \u0003(\u000b2C.bidmachine.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat\u0012U\n\tnativefmt\u0018\u0011 \u0001(\u000b2B.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat\u0012N\n\u0005event\u0018\u0012 \u0003(\u000b2?.bidmachine.protobuf.adcom.Placement.DisplayPlacement.EventSpec\u0012$\n\u0003ext\u0018\u0014 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0013 \u0003(\u000b2\u0014.google.protobuf.Any\u001aÔ\u0001\n\rDisplayFormat\u0012\t\n\u0001w\u0018\u0001 \u0001(\r\u0012\t\n\u0001h\u0018\u0002 \u0001(\r\u0012\u000e\n\u0006wratio\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006hratio\u0018\u0004 \u0001(\r\u0012>\n\u0006expdir\u0018\u0005 \u0003(\u000e2..bidmachine.protobuf.adcom.ExpandableDirection\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001aå\t\n\fNativeFormat\u0012]\n\u0005asset\u0018\u0001 \u0003(\u000b2N.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat\u0012$\n\u0003ext\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0002 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¦\b\n\u000bAssetFormat\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003req\u0018\u0002 \u0001(\b\u0012n\n\u0005title\u0018\u0003 \u0001(\u000b2_.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat\u0012l\n\u0003img\u0018\u0004 \u0001(\u000b2_.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat\u0012B\n\u0005video\u0018\u0005 \u0001(\u000b23.bidmachine.protobuf.adcom.Placement.VideoPlacement\u0012l\n\u0004data\u0018\u0006 \u0001(\u000b2^.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat\u0012$\n\u0003ext\u0018\b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0007 \u0003(\u000b2\u0014.google.protobuf.Any\u001an\n\u0010TitleAssetFormat\u0012\u000b\n\u0003len\u0018\u0001 \u0001(\r\u0012$\n\u0003ext\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0002 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0002\n\u0010ImageAssetFormat\u0012=\n\u0004type\u0018\u0001 \u0001(\u000e2/.bidmachine.protobuf.adcom.NativeImageAssetType\u0012\f\n\u0004mime\u0018\u0002 \u0003(\t\u0012\t\n\u0001w\u0018\u0003 \u0001(\r\u0012\t\n\u0001h\u0018\u0004 \u0001(\r\u0012\f\n\u0004wmin\u0018\u0005 \u0001(\r\u0012\f\n\u0004hmin\u0018\u0006 \u0001(\r\u0012\u000e\n\u0006wratio\u0018\u0007 \u0001(\r\u0012\u000e\n\u0006hratio\u0018\b \u0001(\r\u0012$\n\u0003ext\u0018\n \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\t \u0003(\u000b2\u0014.google.protobuf.Any\u001a«\u0001\n\u000fDataAssetFormat\u0012<\n\u0004type\u0018\u0001 \u0001(\u000e2..bidmachine.protobuf.adcom.NativeDataAssetType\u0012\u000b\n\u0003len\u0018\u0002 \u0001(\r\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¼\u0002\n\tEventSpec\u00122\n\u0004type\u0018\u0001 \u0001(\u000e2$.bidmachine.protobuf.adcom.EventType\u0012>\n\u0006method\u0018\u0002 \u0003(\u000e2..bidmachine.protobuf.adcom.EventTrackingMethod\u00124\n\u0003api\u0018\u0003 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012\r\n\u0005jstrk\u0018\u0004 \u0003(\t\u0012\u000b\n\u0003wjs\u0018\u0005 \u0001(\b\u0012\r\n\u0005pxtrk\u0018\u0006 \u0003(\t\u0012\u000b\n\u0003wpx\u0018\u0007 \u0001(\b\u0012$\n\u0003ext\u0018\t \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\b \u0003(\u000b2\u0014.google.protobuf.Any\u001aÌ\t\n\u000eVideoPlacement\u0012<\n\u0005ptype\u0018\u0001 \u0001(\u000e2-.bidmachine.protobuf.adcom.VideoPlacementType\u00129\n\u0003pos\u0018\u0002 \u0001(\u000e2,.bidmachine.protobuf.adcom.PlacementPosition\u0012\r\n\u0005delay\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004skip\u0018\u0004 \u0001(\b\u0012\u000f\n\u0007skipmin\u0018\u0005 \u0001(\r\u0012\u0011\n\tskipafter\u0018\u0006 \u0001(\r\u0012=\n\nplaymethod\u0018\u0007 \u0001(\u000e2).bidmachine.protobuf.adcom.PlaybackMethod\u0012A\n\u0007playend\u0018\b \u0001(\u000e20.bidmachine.protobuf.adcom.PlaybackCessationMode\u00125\n\u0007clktype\u0018\t \u0001(\u000e2$.bidmachine.protobuf.adcom.ClickType\u0012\f\n\u0004mime\u0018\n \u0003(\t\u00124\n\u0003api\u0018\u000b \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012;\n\u0005ctype\u0018\f \u0003(\u000e2,.bidmachine.protobuf.adcom.VideoCreativeType\u0012\t\n\u0001w\u0018\r \u0001(\r\u0012\t\n\u0001h\u0018\u000e \u0001(\r\u00121\n\u0004unit\u0018\u000f \u0001(\u000e2#.bidmachine.protobuf.adcom.SizeUnit\u0012\u000e\n\u0006mindur\u0018\u0010 \u0001(\r\u0012\u000e\n\u0006maxdur\u0018\u0011 \u0001(\r\u0012\u000e\n\u0006maxext\u0018\u0012 \u0001(\u0005\u0012\u000f\n\u0007minbitr\u0018\u0013 \u0001(\r\u0012\u000f\n\u0007maxbitr\u0018\u0014 \u0001(\r\u0012;\n\bdelivery\u0018\u0015 \u0003(\u000e2).bidmachine.protobuf.adcom.DeliveryMethod\u0012\u000e\n\u0006maxseq\u0018\u0016 \u0001(\r\u00128\n\u0006linear\u0018\u0017 \u0001(\u000e2(.bidmachine.protobuf.adcom.LinearityMode\u0012\u000e\n\u0006boxing\u0018\u0018 \u0001(\b\u0012K\n\u0004comp\u0018\u0019 \u0003(\u000b2=.bidmachine.protobuf.adcom.Placement.VideoPlacement.Companion\u0012:\n\bcomptype\u0018\u001a \u0003(\u000e2(.bidmachine.protobuf.adcom.CompanionType\u0012$\n\u0003ext\u0018\u001c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u001b \u0003(\u000b2\u0014.google.protobuf.Any\u001a»\u0001\n\tCompanion\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003vcm\u0018\u0002 \u0001(\r\u0012F\n\u0007display\u0018\u0003 \u0001(\u000b25.bidmachine.protobuf.adcom.Placement.DisplayPlacement\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\"ã\u001a\n\u0002Ad\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007adomain\u0018\u0002 \u0003(\t\u0012\u000e\n\u0006bundle\u0018\u0003 \u0003(\t\u0012\f\n\u0004iurl\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0005 \u0003(\t\u0012;\n\u0006cattax\u0018\u0006 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\f\n\u0004lang\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006secure\u0018\t \u0001(\b\u00127\n\u0007mrating\u0018\n \u0001(\u000e2&.bidmachine.protobuf.adcom.MediaRating\u0012\f\n\u0004init\u0018\u000b \u0001(\t\u0012\u000f\n\u0007lastmod\u0018\f \u0001(\t\u00126\n\u0007display\u0018\r \u0001(\u000b2%.bidmachine.protobuf.adcom.Ad.Display\u00122\n\u0005video\u0018\u000e \u0001(\u000b2#.bidmachine.protobuf.adcom.Ad.Video\u00122\n\u0005audit\u0018\u0010 \u0001(\u000b2#.bidmachine.protobuf.adcom.Ad.Audit\u0012$\n\u0003ext\u0018\u0012 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0011 \u0003(\u000b2\u0014.google.protobuf.Any\u001aú\u0002\n\u0005Event\u00122\n\u0004type\u0018\u0001 \u0001(\u000e2$.bidmachine.protobuf.adcom.EventType\u0012>\n\u0006method\u0018\u0002 \u0001(\u000e2..bidmachine.protobuf.adcom.EventTrackingMethod\u00124\n\u0003api\u0018\u0003 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012=\n\u0005cdata\u0018\u0005 \u0003(\u000b2..bidmachine.protobuf.adcom.Ad.Event.CdataEntry\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001a,\n\nCdataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a\u0010\n\u0007Display\u0012\f\n\u0004mime\u0018\u0001 \u0003(\t\u00124\n\u0003api\u0018\u0002 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012<\n\u0004type\u0018\u0003 \u0003(\u000e2..bidmachine.protobuf.adcom.DisplayCreativeType\u0012\t\n\u0001w\u0018\u0004 \u0001(\r\u0012\t\n\u0001h\u0018\u0005 \u0001(\r\u0012\u000e\n\u0006wratio\u0018\u0006 \u0001(\r\u0012\u000e\n\u0006hratio\u0018\u0007 \u0001(\r\u0012\u000b\n\u0003adm\u0018\b \u0001(\t\u0012\f\n\u0004curl\u0018\t \u0001(\t\u0012<\n\u0006banner\u0018\n \u0001(\u000b2,.bidmachine.protobuf.adcom.Ad.Display.Banner\u0012<\n\u0006native\u0018\u000b \u0001(\u000b2,.bidmachine.protobuf.adcom.Ad.Display.Native\u00122\n\u0005event\u0018\f \u0003(\u000b2#.bidmachine.protobuf.adcom.Ad.Event\u0012$\n\u0003ext\u0018\u000e \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\r \u0003(\u000b2\u0014.google.protobuf.Any\u001ar\n\u0006Banner\u0012\u000b\n\u0003img\u0018\u0001 \u0001(\t\u0012\f\n\u0004link\u0018\u0002 \u0001(\t\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¼\u000b\n\u0006Native\u0012D\n\u0004link\u0018\u0001 \u0001(\u000b26.bidmachine.protobuf.adcom.Ad.Display.Native.LinkAsset\u0012A\n\u0005asset\u0018\u0002 \u0003(\u000b22.bidmachine.protobuf.adcom.Ad.Display.Native.Asset\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0001\n\tLinkAsset\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\r\n\u0005urlfb\u0018\u0002 \u0001(\t\u0012\f\n\u0004trkr\u0018\u0003 \u0003(\t\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001aÒ\b\n\u0005Asset\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003req\u0018\u0002 \u0001(\b\u0012L\n\u0005title\u0018\u0003 \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset\u0012L\n\u0005image\u0018\u0004 \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset\u0012L\n\u0005video\u0018\u0005 \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset\u0012J\n\u0004data\u0018\u0006 \u0001(\u000b2<.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.DataAsset\u0012D\n\u0004link\u0018\u0007 \u0001(\u000b26.bidmachine.protobuf.adcom.Ad.Display.Native.LinkAsset\u0012$\n\u0003ext\u0018\t \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\b \u0003(\u000b2\u0014.google.protobuf.Any\u001av\n\nTitleAsset\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003len\u0018\u0002 \u0001(\r\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a½\u0001\n\nImageAsset\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\t\n\u0001w\u0018\u0002 \u0001(\r\u0012\t\n\u0001h\u0018\u0003 \u0001(\r\u0012=\n\u0004type\u0018\u0004 \u0001(\u000e2/.bidmachine.protobuf.adcom.NativeImageAssetType\u0012$\n\u0003ext\u0018\u0006 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0005 \u0003(\u000b2\u0014.google.protobuf.Any\u001av\n\nVideoAsset\u0012\u000b\n\u0003adm\u0018\u0001 \u0001(\t\u0012\f\n\u0004curl\u0018\u0002 \u0001(\t\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a´\u0001\n\tDataAsset\u0012\r\n\u0005value\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003len\u0018\u0002 \u0001(\r\u0012<\n\u0004type\u0018\u0003 \u0001(\u000e2..bidmachine.protobuf.adcom.NativeDataAssetType\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001añ\u0001\n\u0005Video\u0012\f\n\u0004mime\u0018\u0001 \u0003(\t\u00124\n\u0003api\u0018\u0002 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012:\n\u0004type\u0018\u0003 \u0003(\u000e2,.bidmachine.protobuf.adcom.VideoCreativeType\u0012\u000b\n\u0003adm\u0018\u0004 \u0001(\t\u0012\f\n\u0004curl\u0018\u0005 \u0001(\t\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001að\u0001\n\u0005Audit\u0012:\n\u0006status\u0018\u0001 \u0001(\u000e2*.bidmachine.protobuf.adcom.AuditStatusCode\u0012\u0010\n\bfeedback\u0018\u0002 \u0003(\t\u0012\f\n\u0004init\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007lastmod\u0018\u0004 \u0001(\t\u0012+\n\u0004corr\u0018\u0005 \u0001(\u000b2\u001d.bidmachine.protobuf.adcom.Ad\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any*Ö\u0001\n\u000fAuditStatusCode\u0012\u001d\n\u0019AUDIT_STATUS_CODE_INVALID\u0010\u0000\u0012#\n\u001fAUDIT_STATUS_CODE_PENDING_AUDIT\u0010\u0001\u0012\"\n\u001eAUDIT_STATUS_CODE_PRE_APPROVED\u0010\u0002\u0012\u001e\n\u001aAUDIT_STATUS_CODE_APPROVED\u0010\u0003\u0012\u001c\n\u0018AUDIT_STATUS_CODE_DENIED\u0010\u0004\u0012\u001d\n\u0019AUDIT_STATUS_CODE_CHANGED\u0010\u0005*ï\u0001\n\fApiFramework\u0012\u0019\n\u0015API_FRAMEWORK_INVALID\u0010\u0000\u0012\u001b\n\u0017API_FRAMEWORK_VPAID_1_0\u0010\u0001\u0012\u001b\n\u0017API_FRAMEWORK_VPAID_2_0\u0010\u0002\u0012\u001b\n\u0017API_FRAMEWORK_MRAID_1_0\u0010\u0003\u0012\u0017\n\u0013API_FRAMEWORK_ORMMA\u0010\u0004\u0012\u001b\n\u0017API_FRAMEWORK_MRAID_2_0\u0010\u0005\u0012\u001b\n\u0017API_FRAMEWORK_MRAID_3_0\u0010\u0006\u0012\u001a\n\u0016API_FRAMEWORK_OMID_1_0\u0010\u0007*©\u0001\n\u0010CategoryTaxonomy\u0012\u001d\n\u0019CATEGORY_TAXONOMY_INVALID\u0010\u0000\u0012%\n!CATEGORY_TAXONOMY_IAB_CONTENT_1_0\u0010\u0001\u0012%\n!CATEGORY_TAXONOMY_IAB_CONTENT_2_0\u0010\u0002\u0012(\n$CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0\u0010\u0003*\u0001\n\tClickType\u0012\u001c\n\u0018CLICK_TYPE_NON_CLICKABLE\u0010\u0000\u0012 \n\u001cCLICK_TYPE_CLICKABLE_UNKNOWN\u0010\u0001\u0012)\n%CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER\u0010\u0002\u0012'\n#CLICK_TYPE_CLICKABLE_NATIVE_BROWSER\u0010\u0003*\u0001\n\rCompanionType\u0012\u001a\n\u0016COMPANION_TYPE_INVALID\u0010\u0000\u0012\"\n\u001eCOMPANION_TYPE_STATIC_RESOURCE\u0010\u0001\u0012 \n\u001cCOMPANION_TYPE_HTML_RESOURCE\u0010\u0002\u0012\"\n\u001eCOMPANION_TYPE_IFRAME_RESOURCE\u0010\u0003*·\u0002\n\u000eConnectionType\u0012\u001b\n\u0017CONNECTION_TYPE_INVALID\u0010\u0000\u0012\u001c\n\u0018CONNECTION_TYPE_ETHERNET\u0010\u0001\u0012\u0018\n\u0014CONNECTION_TYPE_WIFI\u0010\u0002\u0012,\n(CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN\u0010\u0003\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_2G\u0010\u0004\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_3G\u0010\u0005\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_4G\u0010\u0006\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_5G\u0010\u0007*ð\u0001\n\u000eContentContext\u0012\u001b\n\u0017CONTENT_CONTEXT_INVALID\u0010\u0000\u0012\u0019\n\u0015CONTENT_CONTEXT_VIDEO\u0010\u0001\u0012\u0018\n\u0014CONTENT_CONTEXT_GAME\u0010\u0002\u0012\u0019\n\u0015CONTENT_CONTEXT_MUSIC\u0010\u0003\u0012\u001f\n\u001bCONTENT_CONTEXT_APPLICATION\u0010\u0004\u0012\u0018\n\u0014CONTENT_CONTEXT_TEXT\u0010\u0005\u0012\u0019\n\u0015CONTENT_CONTEXT_OTHER\u0010\u0006\u0012\u001b\n\u0017CONTENT_CONTEXT_UNKNOWN\u0010\u0007*Î\u0006\n\u0011CreativeAttribute\u0012\u001e\n\u001aCREATIVE_ATTRIBUTE_INVALID\u0010\u0000\u0012(\n$CREATIVE_ATTRIBUTE_AUDIO_AD_AUTOPLAY\u0010\u0001\u0012.\n*CREATIVE_ATTRIBUTE_AUDIO_AD_USER_INITIATED\u0010\u0002\u0012+\n'CREATIVE_ATTRIBUTE_EXPANDABLE_AUTOMATIC\u0010\u0003\u00126\n2CREATIVE_ATTRIBUTE_EXPANDABLE_USER_INITIATED_CLICK\u0010\u0004\u00129\n5CREATIVE_ATTRIBUTE_EXPANDABLE_USER_INITIATED_ROLLOVER\u0010\u0005\u00122\n.CREATIVE_ATTRIBUTE_IN_BANNER_VIDEO_AD_AUTOPLAY\u0010\u0006\u00128\n4CREATIVE_ATTRIBUTE_IN_BANNER_VIDEO_AD_USER_INITIATED\u0010\u0007\u0012\u001a\n\u0016CREATIVE_ATTRIBUTE_POP\u0010\b\u00125\n1CREATIVE_ATTRIBUTE_PROVOCATIVE_SUGGESTIVE_IMAGERY\u0010\t\u0012(\n$CREATIVE_ATTRIBUTE_EXTREME_ANIMATION\u0010\n\u0012\u001e\n\u001aCREATIVE_ATTRIBUTE_SURVEYS\u0010\u000b\u0012 \n\u001cCREATIVE_ATTRIBUTE_TEXT_ONLY\u0010\f\u0012'\n#CREATIVE_ATTRIBUTE_USER_INTERACTIVE\u0010\r\u0012\"\n\u001eCREATIVE_ATTRIBUTE_ALERT_STYLE\u0010\u000e\u0012.\n*CREATIVE_ATTRIBUTE_HAS_AUDIO_ON_OFF_BUTTON\u0010\u000f\u0012.\n*CREATIVE_ATTRIBUTE_AD_PROVIDES_SKIP_BUTTON\u0010\u0010\u0012\"\n\u001eCREATIVE_ATTRIBUTE_ADOBE_FLASH\u0010\u0011\u0012!\n\u001dCREATIVE_ATTRIBUTE_RESPONSIVE\u0010\u0012*\u0001\n\u000eDeliveryMethod\u0012\u001b\n\u0017DELIVERY_METHOD_INVALID\u0010\u0000\u0012\u001d\n\u0019DELIVERY_METHOD_STREAMING\u0010\u0001\u0012\u001f\n\u001bDELIVERY_METHOD_PROGRESSIVE\u0010\u0002\u0012\u001c\n\u0018DELIVERY_METHOD_DOWNLOAD\u0010\u0003*s\n\nDeviceType\u0012\u0017\n\u0013DEVICE_TYPE_INVALID\u0010\u0000\u0012\u0016\n\u0012DEVICE_TYPE_MOBILE\u0010\u0001\u0012\u001c\n\u0018DEVICE_TYPE_PHONE_DEVICE\u0010\u0004\u0012\u0016\n\u0012DEVICE_TYPE_TABLET\u0010\u0005*³\u0004\n\u0012DisplayContextType\u0012 \n\u001cDISPLAY_CONTEXT_TYPE_INVALID\u0010\u0000\u00120\n,DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT\u0010\n\u0012(\n$DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT\u0010\u000b\u0012&\n\"DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT\u0010\f\u0012&\n\"DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT\u0010\r\u0012&\n\"DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT\u0010\u000e\u0012/\n+DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT\u0010\u000f\u0012/\n+DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT\u0010\u0014\u0012&\n\"DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT\u0010\u0015\u0012%\n!DISPLAY_CONTEXT_TYPE_CHAT_CONTENT\u0010\u0016\u0012(\n$DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT\u0010\u001e\u0012\"\n\u001eDISPLAY_CONTEXT_TYPE_APP_STORE\u0010\u001f\u0012(\n$DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS\u0010 *Ì\u0001\n\u0013DisplayCreativeType\u0012!\n\u001dDISPLAY_CREATIVE_TYPE_INVALID\u0010\u0000\u0012\u001e\n\u001aDISPLAY_CREATIVE_TYPE_HTML\u0010\u0001\u0012!\n\u001dDISPLAY_CREATIVE_TYPE_AMPHTML\u0010\u0002\u0012&\n\"DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT\u0010\u0003\u0012'\n#DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT\u0010\u0004*ô\u0001\n\u0014DisplayPlacementType\u0012\"\n\u001eDISPLAY_PLACEMENT_TYPE_INVALID\u0010\u0000\u0012*\n&DISPLAY_PLACEMENT_TYPE_IN_FEED_DISPLAY\u0010\u0001\u0012)\n%DISPLAY_PLACEMENT_TYPE_IN_ATOMIC_UNIT\u0010\u0002\u0012/\n+DISPLAY_PLACEMENT_TYPE_OUTSIDE_CORE_CONTENT\u0010\u0003\u00120\n,DISPLAY_PLACEMENT_TYPE_RECOMMENDATION_WIDGET\u0010\u0004*Ø\u0001\n\u0013ExpandableDirection\u0012 \n\u001cEXPANDABLE_DIRECTION_INVALID\u0010\u0000\u0012\u001d\n\u0019EXPANDABLE_DIRECTION_LEFT\u0010\u0001\u0012\u001e\n\u001aEXPANDABLE_DIRECTION_RIGHT\u0010\u0002\u0012\u001b\n\u0017EXPANDABLE_DIRECTION_UP\u0010\u0003\u0012\u001d\n\u0019EXPANDABLE_DIRECTION_DOWN\u0010\u0004\u0012$\n EXPANDABLE_DIRECTION_FULL_SCREEN\u0010\u0005*\u0001\n\u0013EventTrackingMethod\u0012!\n\u001dEVENT_TRACKING_METHOD_INVALID\u0010\u0000\u0012%\n!EVENT_TRACKING_METHOD_IMAGE_PIXEL\u0010\u0001\u0012$\n EVENT_TRACKING_METHOD_JAVASCRIPT\u0010\u0002*¡\u0001\n\tEventType\u0012\u0016\n\u0012EVENT_TYPE_INVALID\u0010\u0000\u0012\u0019\n\u0015EVENT_TYPE_IMPRESSI", "ON\u0010\u0001\u0012\u001e\n\u001aEVENT_TYPE_VIEWABLE_MRC_50\u0010\u0002\u0012\u001f\n\u001bEVENT_TYPE_VIEWABLE_MRC_100\u0010\u0003\u0012 \n\u001cEVENT_TYPE_VIEWABLE_VIDEO_50\u0010\u0004*¾\u0001\n\u0011IpLocationService\u0012\u001f\n\u001bIP_LOCATION_SERVICE_INVALID\u0010\u0000\u0012#\n\u001fIP_LOCATION_SERVICE_IP2LOCATION\u0010\u0001\u0012\u001f\n\u001bIP_LOCATION_SERVICE_NEUSTAR\u0010\u0002\u0012\u001f\n\u001bIP_LOCATION_SERVICE_MAXMIND\u0010\u0003\u0012!\n\u001dIP_LOCATION_SERVICE_NETAQUITY\u0010\u0004*e\n\rLinearityMode\u0012\u001a\n\u0016LINEARITY_MODE_INVALID\u0010\u0000\u0012\u0019\n\u0015LINEARITY_MODE_LINEAR\u0010\u0001\u0012\u001d\n\u0019LINEARITY_MODE_NON_LINEAR\u0010\u0002*n\n\fLocationType\u0012\u0019\n\u0015LOCATION_TYPE_INVALID\u0010\u0000\u0012\u0015\n\u0011LOCATION_TYPE_GPS\u0010\u0001\u0012\u0014\n\u0010LOCATION_TYPE_IP\u0010\u0002\u0012\u0016\n\u0012LOCATION_TYPE_USER\u0010\u0003*\u0001\n\u000bMediaRating\u0012\u0018\n\u0014MEDIA_RATING_INVALID\u0010\u0000\u0012\u001e\n\u001aMEDIA_RATING_ALL_AUDIENCES\u0010\u0001\u0012%\n!MEDIA_RATING_EVERYONE_OVER_AGE_12\u0010\u0002\u0012!\n\u001dMEDIA_RATING_MATURE_AUDIENCES\u0010\u0003*é\u0003\n\u0013NativeDataAssetType\u0012\"\n\u001eNATIVE_DATA_ASSET_TYPE_INVALID\u0010\u0000\u0012$\n NATIVE_DATA_ASSET_TYPE_SPONSORED\u0010\u0001\u0012\u001f\n\u001bNATIVE_DATA_ASSET_TYPE_DESC\u0010\u0002\u0012!\n\u001dNATIVE_DATA_ASSET_TYPE_RATING\u0010\u0003\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_LIKES\u0010\u0004\u0012$\n NATIVE_DATA_ASSET_TYPE_DOWNLOADS\u0010\u0005\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_PRICE\u0010\u0006\u0012%\n!NATIVE_DATA_ASSET_TYPE_SALE_PRICE\u0010\u0007\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_PHONE\u0010\b\u0012\"\n\u001eNATIVE_DATA_ASSET_TYPE_ADDRESS\u0010\t\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_DESC2\u0010\n\u0012&\n\"NATIVE_DATA_ASSET_TYPE_DISPLAY_URL\u0010\u000b\u0012#\n\u001fNATIVE_DATA_ASSET_TYPE_CTA_TEXT\u0010\f*\u0001\n\u0014NativeImageAssetType\u0012#\n\u001fNATIVE_IMAGE_ASSET_TYPE_INVALID\u0010\u0000\u0012&\n\"NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE\u0010\u0001\u0012&\n\"NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE\u0010\u0003*0\n\u0002OS\u0012\u000e\n\nOS_INVALID\u0010\u0000\u0012\u000e\n\nOS_ANDROID\u0010\u0002\u0012\n\n\u0006OS_IOS\u0010\r*â\u0001\n\u0015PlaybackCessationMode\u0012#\n\u001fPLAYBACK_CESSATION_MODE_INVALID\u0010\u0000\u0012/\n+PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION\u0010\u0001\u0012/\n+PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT\u0010\u0002\u0012B\n>PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING\u0010\u0003*¾\u0002\n\u000ePlaybackMethod\u0012\u001b\n\u0017PLAYBACK_METHOD_INVALID\u0010\u0000\u0012)\n%PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON\u0010\u0001\u0012*\n&PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF\u0010\u0002\u0012%\n!PLAYBACK_METHOD_ON_CLICK_SOUND_ON\u0010\u0003\u0012*\n&PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON\u0010\u0004\u00121\n-PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON\u0010\u0005\u00122\n.PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF\u0010\u0006*¡\u0002\n\u0011PlacementPosition\u0012\u001e\n\u001aPLACEMENT_POSITION_INVALID\u0010\u0000\u0012%\n!PLACEMENT_POSITION_ABOVE_THE_FOLD\u0010\u0001\u0012\u001d\n\u0019PLACEMENT_POSITION_LOCKED\u0010\u0002\u0012%\n!PLACEMENT_POSITION_BELOW_THE_FOLD\u0010\u0003\u0012\u001d\n\u0019PLACEMENT_POSITION_HEADER\u0010\u0004\u0012\u001d\n\u0019PLACEMENT_POSITION_FOOTER\u0010\u0005\u0012\u001e\n\u001aPLACEMENT_POSITION_SIDEBAR\u0010\u0006\u0012!\n\u001dPLACEMENT_POSITION_FULLSCREEN\u0010\u0007*«\u0001\n\u0011ProductionQuality\u0012\u001e\n\u001aPRODUCTION_QUALITY_INVALID\u0010\u0000\u0012.\n*PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED\u0010\u0001\u0012\u001f\n\u001bPRODUCTION_QUALITY_PROSUMER\u0010\u0002\u0012%\n!PRODUCTION_QUALITY_USER_GENERATED\u0010\u0003*f\n\bSizeUnit\u0012\u0015\n\u0011SIZE_UNIT_INVALID\u0010\u0000\u0012\u0012\n\u000eSIZE_UNIT_DIPS\u0010\u0001\u0012\u0014\n\u0010SIZE_UNIT_INCHES\u0010\u0002\u0012\u0019\n\u0015SIZE_UNIT_CENTIMETERS\u0010\u0003*°\u0003\n\u0011VideoCreativeType\u0012\u001f\n\u001bVIDEO_CREATIVE_TYPE_INVALID\u0010\u0000\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_1_0\u0010\u0001\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_2_0\u0010\u0002\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_3_0\u0010\u0003\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0\u0010\u0004\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0\u0010\u0005\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0\u0010\u0006\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_4_0\u0010\u0007\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0\u0010\b\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_4_1\u0010\t\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1\u0010\n*ì\u0001\n\u0012VideoPlacementType\u0012 \n\u001cVIDEO_PLACEMENT_TYPE_INVALID\u0010\u0000\u0012\"\n\u001eVIDEO_PLACEMENT_TYPE_IN_STREAM\u0010\u0001\u0012\"\n\u001eVIDEO_PLACEMENT_TYPE_IN_BANNER\u0010\u0002\u0012#\n\u001fVIDEO_PLACEMENT_TYPE_IN_ARTICLE\u0010\u0003\u0012 \n\u001cVIDEO_PLACEMENT_TYPE_IN_FEED\u0010\u0004\u0012%\n!VIDEO_PLACEMENT_TYPE_INTERSTITIAL\u0010\u0005B7\n\u001fcom.explorestack.protobuf.adcomB\nAdcomProtoP\u0001¢\u0002\u0005ADCOMb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), StructProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Audit_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4726xb068ce5e;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_descriptor */
    static final Descriptors.Descriptor f4727xbef51918;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4728xb2a5a796;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_descriptor */
    static final Descriptors.Descriptor f4729x89a0a5f5;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4730xe190773;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_descriptor */
    static final Descriptors.Descriptor f4731xe346a32c;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4732x6f25ddaa;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_descriptor */
    static final Descriptors.Descriptor f4733xe9d08229;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4734xbc936fa7;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_descriptor */
    static final Descriptors.Descriptor f4735xef01ce4c;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4736x9713e8ca;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_descriptor */
    static final Descriptors.Descriptor f4737xaadcb19c;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4738xdcbe7c1a;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_descriptor */
    static final Descriptors.Descriptor f4739xad6b82b6;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4740x5edf9334;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_descriptor */
    static final Descriptors.Descriptor f4741xab69174d;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4742x1466a0cb;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Display_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4743x95c152d7;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Event_CdataEntry_descriptor */
    static final Descriptors.Descriptor f4744x268e1e57;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Event_CdataEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4745x4440fdd5;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Event_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4746xb023293f;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Ad_Video_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4747x29a951be;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_adcom_Ad_fieldAccessorTable;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_descriptor */
    static final Descriptors.Descriptor f4748xa9939fb9;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4749x3067fd37;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_Content_descriptor */
    static final Descriptors.Descriptor f4750xae6b1132;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_Content_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4751xb796e5b0;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_descriptor */
    static final Descriptors.Descriptor f4752xd51a888f;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4753x6bbbb00d;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Context_App_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_App_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4754x78e9d10a;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_descriptor */
    static final Descriptors.Descriptor f4755x35478b71;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4756xbc30b0ef;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Data_descriptor */
    static final Descriptors.Descriptor f4757x922b3cc5;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Data_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4758x7d47ce43;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Device_descriptor */
    static final Descriptors.Descriptor f4759x47238659;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Device_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4760xf57743d7;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Context_Geo_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Geo_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4761x2dd7cdda;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Regs_descriptor */
    static final Descriptors.Descriptor f4762x71787ef0;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Regs_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4763x4bb1b56e;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Restrictions_descriptor */
    static final Descriptors.Descriptor f4764xe14c9528;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_Restrictions_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4765xf80813a6;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_User_descriptor */
    static final Descriptors.Descriptor f4766xf4741204;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_User_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4767x84c2f482;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Context_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Context_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4768xdcb25d8c;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_descriptor */
    static final Descriptors.Descriptor f4769xeeeddc88;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4770x691bfb06;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_descriptor */
    static final Descriptors.Descriptor f4771xc2b466c;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4772x17d340ea;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_descriptor */
    static final Descriptors.Descriptor f4773x212e8e87;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4774x5c463e05;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_descriptor */
    static final Descriptors.Descriptor f4775x9b76db0c;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4776x6710358a;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_descriptor */
    static final Descriptors.Descriptor f4777xc62ac849;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4778xddd595c7;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_descriptor */
    static final Descriptors.Descriptor f4779xc2255de5;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4780x6e1ecf63;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_descriptor */
    static final Descriptors.Descriptor f4781x57214e8d;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4782x4d13980b;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_descriptor */
    static final Descriptors.Descriptor f4783x24df6502;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4784x21a26980;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_descriptor */
    static final Descriptors.Descriptor f4785xdac8ac2e;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4786x5517c4ac;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_descriptor */
    static final Descriptors.Descriptor f4787xb6f963fb;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4788xa76e5f79;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_adcom_Placement_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_adcom_Placement_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f4789x266650d6;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AdcomProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_adcom_Context_descriptor = descriptor2;
        f4768xdcb25d8c = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"App", "Device", "Regs", "Restrictions", "User", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor3 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_adcom_Context_App_descriptor = descriptor3;
        f4754x78e9d10a = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Id", "Name", "Pub", "Content", "Domain", "Cat", "Sectcat", "Pagecat", "Cattax", "Privpolicy", "Keywords", "Bundle", "Storeid", "Storeurl", "Ver", "Paid", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor4 = internal_static_bidmachine_protobuf_adcom_Context_App_descriptor.getNestedTypes().get(0);
        f4752xd51a888f = descriptor4;
        f4753x6bbbb00d = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Id", "Name", "Domain", "Cat", "Cattax", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor5 = internal_static_bidmachine_protobuf_adcom_Context_App_descriptor.getNestedTypes().get(1);
        f4750xae6b1132 = descriptor5;
        f4751xb796e5b0 = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Id", "Episode", "Title", "Series", "Season", "Artist", "Genre", "Album", "Isrc", "Url", "Cat", "Cattax", "Prodq", "Context", "Rating", "Urating", "Mrating", "Keywords", "Live", "Srcrel", "Len", "Lang", "Embed", "Producer", "Data", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor6 = f4750xae6b1132.getNestedTypes().get(0);
        f4748xa9939fb9 = descriptor6;
        f4749x3067fd37 = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Id", "Name", "Domain", "Cat", "Cattax", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor7 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(1);
        f4757x922b3cc5 = descriptor7;
        f4758x7d47ce43 = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id", "Name", "Segment", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor8 = f4757x922b3cc5.getNestedTypes().get(0);
        f4755x35478b71 = descriptor8;
        f4756xbc30b0ef = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Id", "Name", "Value", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor9 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_adcom_Context_Geo_descriptor = descriptor9;
        f4761x2dd7cdda = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Type", "Lat", "Lon", "Accur", "Lastfix", "Ipserv", "Country", "Region", "Metro", "City", "Zip", "Utcoffset", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor10 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(3);
        f4759x47238659 = descriptor10;
        f4760xf57743d7 = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Type", "Ua", "Ifa", "Dnt", "Lmt", "Make", "Model", "Os", "Osv", "Hwv", "H", "W", "Ppi", "Pxratio", "Js", "Lang", "Ip", "Ipv6", "Xff", "Iptr", "Carrier", "Mccmnc", "Mccmncsim", "Contype", "Geofetch", "Geo", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor11 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(4);
        f4762x71787ef0 = descriptor11;
        f4763x4bb1b56e = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Coppa", "Gdpr", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor12 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(5);
        f4764xe14c9528 = descriptor12;
        f4765xf80813a6 = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Bcat", "Cattax", "Badv", "Bapp", "Battr", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor13 = internal_static_bidmachine_protobuf_adcom_Context_descriptor.getNestedTypes().get(6);
        f4766xf4741204 = descriptor13;
        f4767x84c2f482 = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Id", "Buyeruid", "Yob", "Gender", "Keywords", "Consent", "Geo", "Data", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_adcom_Placement_descriptor = descriptor14;
        f4789x266650d6 = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Tagid", "Ssai", "Sdk", "Sdkver", "Reward", "Bcat", "Cattax", "Badv", "Bapp", "Battr", "Wlang", "Secure", "Admx", "Curlx", "Display", "Video", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor15 = internal_static_bidmachine_protobuf_adcom_Placement_descriptor.getNestedTypes().get(0);
        f4783x24df6502 = descriptor15;
        f4784x21a26980 = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Pos", "Instl", "Topframe", "Ifrbust", "Clktype", "Ampren", "Ptype", "Context", "Mime", "Api", "Ctype", "W", "H", "Unit", "Priv", "Displayfmt", "Nativefmt", "Event", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor16 = f4783x24df6502.getNestedTypes().get(0);
        f4769xeeeddc88 = descriptor16;
        f4770x691bfb06 = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"W", "H", "Wratio", "Hratio", "Expdir", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor17 = f4783x24df6502.getNestedTypes().get(1);
        f4781x57214e8d = descriptor17;
        f4782x4d13980b = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Asset", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor18 = f4781x57214e8d.getNestedTypes().get(0);
        f4779xc2255de5 = descriptor18;
        f4780x6e1ecf63 = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Id", "Req", "Title", "Img", "Video", "Data", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor19 = f4779xc2255de5.getNestedTypes().get(0);
        f4777xc62ac849 = descriptor19;
        f4778xddd595c7 = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Len", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor20 = f4779xc2255de5.getNestedTypes().get(1);
        f4775x9b76db0c = descriptor20;
        f4776x6710358a = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Type", "Mime", "W", "H", "Wmin", "Hmin", "Wratio", "Hratio", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor21 = f4779xc2255de5.getNestedTypes().get(2);
        f4773x212e8e87 = descriptor21;
        f4774x5c463e05 = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Type", "Len", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor22 = f4783x24df6502.getNestedTypes().get(2);
        f4771xc2b466c = descriptor22;
        f4772x17d340ea = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Type", "Method", "Api", "Jstrk", "Wjs", "Pxtrk", "Wpx", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor23 = internal_static_bidmachine_protobuf_adcom_Placement_descriptor.getNestedTypes().get(1);
        f4787xb6f963fb = descriptor23;
        f4788xa76e5f79 = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Ptype", "Pos", "Delay", "Skip", "Skipmin", "Skipafter", "Playmethod", "Playend", "Clktype", "Mime", "Api", "Ctype", "W", "H", "Unit", "Mindur", "Maxdur", "Maxext", "Minbitr", "Maxbitr", "Delivery", "Maxseq", "Linear", "Boxing", "Comp", "Comptype", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor24 = f4787xb6f963fb.getNestedTypes().get(0);
        f4785xdac8ac2e = descriptor24;
        f4786x5517c4ac = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Id", "Vcm", "Display", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor25 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_adcom_Ad_descriptor = descriptor25;
        internal_static_bidmachine_protobuf_adcom_Ad_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Id", "Adomain", "Bundle", "Iurl", "Cat", "Cattax", "Lang", "Secure", "Mrating", "Init", "Lastmod", "Display", "Video", "Audit", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor26 = internal_static_bidmachine_protobuf_adcom_Ad_descriptor.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor = descriptor26;
        f4746xb023293f = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"Type", "Method", "Api", "Url", "Cdata", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor27 = internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor.getNestedTypes().get(0);
        f4744x268e1e57 = descriptor27;
        f4745x4440fdd5 = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor28 = internal_static_bidmachine_protobuf_adcom_Ad_descriptor.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor = descriptor28;
        f4743x95c152d7 = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"Mime", "Api", "Type", "W", "H", "Wratio", "Hratio", "Adm", "Curl", "Banner", LogConstants.KEY_NATIVE, "Event", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor29 = internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor.getNestedTypes().get(0);
        f4727xbef51918 = descriptor29;
        f4728xb2a5a796 = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"Img", "Link", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor30 = internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor.getNestedTypes().get(1);
        f4741xab69174d = descriptor30;
        f4742x1466a0cb = new GeneratedMessageV3.FieldAccessorTable(descriptor30, new String[]{"Link", "Asset", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor31 = f4741xab69174d.getNestedTypes().get(0);
        f4739xad6b82b6 = descriptor31;
        f4740x5edf9334 = new GeneratedMessageV3.FieldAccessorTable(descriptor31, new String[]{"Url", "Urlfb", "Trkr", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor32 = f4741xab69174d.getNestedTypes().get(1);
        f4737xaadcb19c = descriptor32;
        f4738xdcbe7c1a = new GeneratedMessageV3.FieldAccessorTable(descriptor32, new String[]{"Id", "Req", "Title", "Image", "Video", "Data", "Link", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor33 = f4737xaadcb19c.getNestedTypes().get(0);
        f4733xe9d08229 = descriptor33;
        f4734xbc936fa7 = new GeneratedMessageV3.FieldAccessorTable(descriptor33, new String[]{"Text", "Len", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor34 = f4737xaadcb19c.getNestedTypes().get(1);
        f4731xe346a32c = descriptor34;
        f4732x6f25ddaa = new GeneratedMessageV3.FieldAccessorTable(descriptor34, new String[]{"Url", "W", "H", "Type", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor35 = f4737xaadcb19c.getNestedTypes().get(2);
        f4735xef01ce4c = descriptor35;
        f4736x9713e8ca = new GeneratedMessageV3.FieldAccessorTable(descriptor35, new String[]{"Adm", "Curl", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor36 = f4737xaadcb19c.getNestedTypes().get(3);
        f4729x89a0a5f5 = descriptor36;
        f4730xe190773 = new GeneratedMessageV3.FieldAccessorTable(descriptor36, new String[]{"Value", "Len", "Type", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor37 = internal_static_bidmachine_protobuf_adcom_Ad_descriptor.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor = descriptor37;
        f4747x29a951be = new GeneratedMessageV3.FieldAccessorTable(descriptor37, new String[]{"Mime", "Api", "Type", "Adm", "Curl", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor38 = internal_static_bidmachine_protobuf_adcom_Ad_descriptor.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor = descriptor38;
        f4726xb068ce5e = new GeneratedMessageV3.FieldAccessorTable(descriptor38, new String[]{"Status", "Feedback", "Init", "Lastmod", "Corr", "Ext", "ExtProto"});
        AnyProto.getDescriptor();
        StructProto.getDescriptor();
    }
}
