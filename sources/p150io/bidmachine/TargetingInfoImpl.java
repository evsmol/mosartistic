package p150io.bidmachine;

import android.location.Location;
import java.util.Calendar;
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.models.TargetingInfo;
import p150io.bidmachine.utils.Gender;

/* renamed from: io.bidmachine.TargetingInfoImpl */
class TargetingInfoImpl implements TargetingInfo {
    private final DataRestrictions dataRestrictions;
    private final TargetingParams targetingParams;

    TargetingInfoImpl(DataRestrictions dataRestrictions2, TargetingParams targetingParams2) {
        this.dataRestrictions = dataRestrictions2;
        this.targetingParams = targetingParams2;
    }

    public String getUserId() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getUserId();
        }
        return null;
    }

    public Gender getGender() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getGender();
        }
        return null;
    }

    public Integer getUserBirthdayYear() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getBirthdayYear();
        }
        return null;
    }

    public Integer getUserAge() {
        Integer userBirthdayYear = getUserBirthdayYear();
        if (userBirthdayYear != null) {
            return Integer.valueOf(Calendar.getInstance().get(1) - userBirthdayYear.intValue());
        }
        return null;
    }

    public String[] getKeywords() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getKeywords();
        }
        return null;
    }

    public Location getDeviceLocation() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getDeviceLocation();
        }
        return null;
    }

    public String getCountry() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getCountry();
        }
        return null;
    }

    public String getCity() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getCity();
        }
        return null;
    }

    public String getZip() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getZip();
        }
        return null;
    }

    public String getStoreUrl() {
        return this.targetingParams.getStoreUrl();
    }

    public Boolean isPaid() {
        return this.targetingParams.getPaid();
    }
}
