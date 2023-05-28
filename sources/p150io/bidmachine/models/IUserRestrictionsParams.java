package p150io.bidmachine.models;

/* renamed from: io.bidmachine.models.IUserRestrictionsParams */
public interface IUserRestrictionsParams<SelfType> {
    SelfType setConsentConfig(boolean z, String str);

    SelfType setCoppa(Boolean bool);

    SelfType setSubjectToGDPR(Boolean bool);

    SelfType setUSPrivacyString(String str);
}
