package p150io.bidmachine.models;

import android.content.Context;

/* renamed from: io.bidmachine.models.DeviceInfo */
public interface DeviceInfo {
    String getHttpAgent(Context context);

    String getIfa(Context context);

    boolean isLimitAdTrackingEnabled();
}
