package p150io.bidmachine.unified;

import p150io.bidmachine.AdRequestParameters;
import p150io.bidmachine.GeneralParams;
import p150io.bidmachine.models.DeviceInfo;

/* renamed from: io.bidmachine.unified.UnifiedAdRequestParams */
public interface UnifiedAdRequestParams extends GeneralParams {
    AdRequestParameters getAdRequestParameters();

    DeviceInfo getDeviceInfo();
}
