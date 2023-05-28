package p150io.bidmachine;

import java.util.UUID;

/* renamed from: io.bidmachine.SimpleTrackingObject */
public class SimpleTrackingObject extends TrackingObject {
    private final Object trackingKey;

    public SimpleTrackingObject() {
        this(UUID.randomUUID().toString());
    }

    public SimpleTrackingObject(Object obj) {
        this.trackingKey = obj;
    }

    public Object getTrackingKey() {
        return this.trackingKey;
    }
}
