package p150io.bidmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p150io.bidmachine.models.IPriceFloorParams;

/* renamed from: io.bidmachine.PriceFloorParams */
public final class PriceFloorParams implements IPriceFloorParams<PriceFloorParams> {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    public PriceFloorParams addPriceFloor(double d) {
        addPriceFloor(UUID.randomUUID().toString(), d);
        return this;
    }

    public PriceFloorParams addPriceFloor(String str, double d) {
        this.priceFloorsMap.put(str, Double.valueOf(d));
        return this;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }
}
