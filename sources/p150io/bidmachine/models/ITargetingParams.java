package p150io.bidmachine.models;

import android.location.Location;
import java.util.List;
import p150io.bidmachine.ExternalUserId;
import p150io.bidmachine.utils.Gender;

/* renamed from: io.bidmachine.models.ITargetingParams */
public interface ITargetingParams<SelfType> extends IBlockedParams<SelfType> {
    SelfType setBirthdayYear(Integer num);

    SelfType setCity(String str);

    SelfType setCountry(String str);

    SelfType setDeviceLocation(Location location);

    SelfType setExternalUserIds(List<ExternalUserId> list);

    SelfType setFramework(String str);

    SelfType setGender(Gender gender);

    SelfType setKeywords(String... strArr);

    SelfType setPaid(Boolean bool);

    SelfType setStoreCategory(String str);

    SelfType setStoreSubCategories(String... strArr);

    SelfType setStoreUrl(String str);

    SelfType setUserId(String str);

    SelfType setZip(String str);
}
