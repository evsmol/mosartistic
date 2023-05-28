package p150io.bidmachine.models;

import android.location.Location;
import p150io.bidmachine.utils.Gender;

/* renamed from: io.bidmachine.models.TargetingInfo */
public interface TargetingInfo {
    String getCity();

    String getCountry();

    Location getDeviceLocation();

    Gender getGender();

    String[] getKeywords();

    String getStoreUrl();

    Integer getUserAge();

    Integer getUserBirthdayYear();

    String getUserId();

    String getZip();

    Boolean isPaid();
}
