package p150io.bidmachine;

import java.util.Map;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.HeaderBiddingCollectParamsCallback */
public interface HeaderBiddingCollectParamsCallback {
    void onCollectFail(BMError bMError);

    void onCollectFinished(Map<String, String> map);
}
