package p150io.bidmachine.models;

/* renamed from: io.bidmachine.models.ISessionAdParams */
public interface ISessionAdParams<SelfType> {
    SelfType setClickRate(Float f);

    SelfType setCompletionRate(Float f);

    SelfType setImpressionCount(Integer num);

    SelfType setIsUserClickedOnLastAd(Boolean bool);

    SelfType setSessionDuration(Integer num);
}
