package p150io.bidmachine;

import java.util.List;

/* renamed from: io.bidmachine.TrackingObject */
public abstract class TrackingObject {
    public abstract Object getTrackingKey();

    /* access modifiers changed from: package-private */
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        return null;
    }
}
