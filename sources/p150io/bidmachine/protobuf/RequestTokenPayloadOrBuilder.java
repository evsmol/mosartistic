package p150io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageOrBuilder;
import java.util.Map;
import p150io.bidmachine.protobuf.RequestTokenPayload;

/* renamed from: io.bidmachine.protobuf.RequestTokenPayloadOrBuilder */
public interface RequestTokenPayloadOrBuilder extends MessageOrBuilder {
    boolean containsCustomData(String str);

    RequestTokenPayload.AppData getAppData();

    RequestTokenPayload.AppDataOrBuilder getAppDataOrBuilder();

    @Deprecated
    Map<String, String> getCustomData();

    int getCustomDataCount();

    Map<String, String> getCustomDataMap();

    String getCustomDataOrDefault(String str, String str2);

    String getCustomDataOrThrow(String str);

    RequestTokenPayload.DeviceData getDeviceData();

    RequestTokenPayload.DeviceDataOrBuilder getDeviceDataOrBuilder();

    RequestTokenPayload.PlacementData getPlacementData();

    RequestTokenPayload.PlacementDataOrBuilder getPlacementDataOrBuilder();

    RequestTokenPayload.SessionData getSessionData();

    RequestTokenPayload.SessionDataOrBuilder getSessionDataOrBuilder();

    RequestTokenPayload.UserData getUserData();

    RequestTokenPayload.UserDataOrBuilder getUserDataOrBuilder();

    boolean hasAppData();

    boolean hasDeviceData();

    boolean hasPlacementData();

    boolean hasSessionData();

    boolean hasUserData();
}
