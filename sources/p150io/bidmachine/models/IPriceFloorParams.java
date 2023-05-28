package p150io.bidmachine.models;

/* renamed from: io.bidmachine.models.IPriceFloorParams */
public interface IPriceFloorParams<SelfType> {
    SelfType addPriceFloor(double d);

    SelfType addPriceFloor(String str, double d);
}
