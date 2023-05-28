package p150io.bidmachine.models;

/* renamed from: io.bidmachine.models.IBlockedParams */
public interface IBlockedParams<SelfType> {
    SelfType addBlockedAdvertiserDomain(String str);

    SelfType addBlockedAdvertiserIABCategory(String str);

    SelfType addBlockedApplication(String str);
}
