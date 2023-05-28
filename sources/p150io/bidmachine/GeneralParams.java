package p150io.bidmachine;

import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.models.TargetingInfo;

/* renamed from: io.bidmachine.GeneralParams */
public interface GeneralParams {
    DataRestrictions getDataRestrictions();

    TargetingInfo getTargetingInfo();

    boolean isTestMode();
}
