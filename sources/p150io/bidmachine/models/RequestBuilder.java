package p150io.bidmachine.models;

import java.util.List;
import p150io.bidmachine.AdRequest;
import p150io.bidmachine.CustomParams;
import p150io.bidmachine.NetworkConfig;
import p150io.bidmachine.PriceFloorParams;
import p150io.bidmachine.SessionAdParams;
import p150io.bidmachine.TargetingParams;
import p150io.bidmachine.models.RequestBuilder;

/* renamed from: io.bidmachine.models.RequestBuilder */
public interface RequestBuilder<SelfType extends RequestBuilder, ReturnType extends AdRequest> {
    ReturnType build();

    SelfType setBidPayload(String str);

    SelfType setCustomParams(CustomParams customParams);

    SelfType setListener(AdRequest.AdRequestListener<ReturnType> adRequestListener);

    SelfType setLoadingTimeOut(Integer num);

    SelfType setNetworks(String str);

    SelfType setNetworks(List<NetworkConfig> list);

    SelfType setPlacementId(String str);

    SelfType setPriceFloorParams(PriceFloorParams priceFloorParams);

    SelfType setSessionAdParams(SessionAdParams sessionAdParams);

    SelfType setTargetingParams(TargetingParams targetingParams);
}
