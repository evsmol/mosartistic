package com.adcolony.sdk;

import android.location.Location;

@Deprecated
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: a */
    C6290e1 f13226a = C6235c0.m15059a();

    /* renamed from: b */
    C6294f1 f13227b = C6235c0.m15073b();

    /* renamed from: c */
    Location f13228c;

    public AdColonyUserMetadata addUserInterest(String str) {
        if (C6509z0.m15964e(str)) {
            C6235c0.m15066a(this.f13226a, str);
            C6235c0.m15068a(this.f13227b, "adc_interests", this.f13226a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        C6290e1 a = C6235c0.m15059a();
        this.f13226a = a;
        C6235c0.m15068a(this.f13227b, "adc_interests", a);
        return this;
    }

    public Object getMetadata(String str) {
        return C6235c0.m15086g(this.f13227b, str);
    }

    public int getUserAge() {
        return C6235c0.m15083d(this.f13227b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return C6235c0.m15083d(this.f13227b, "adc_household_income");
    }

    public String getUserEducation() {
        return C6235c0.m15087h(this.f13227b, "adc_education");
    }

    public String getUserGender() {
        return C6235c0.m15087h(this.f13227b, "adc_gender");
    }

    public String[] getUserInterests() {
        return this.f13226a.mo50656d();
    }

    public Location getUserLocation() {
        return this.f13228c;
    }

    public String getUserMaritalStatus() {
        return C6235c0.m15087h(this.f13227b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return C6235c0.m15087h(this.f13227b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z) {
        if (C6509z0.m15964e(str)) {
            C6235c0.m15079b(this.f13227b, str, z);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(int i) {
        setMetadata("adc_age", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i) {
        setMetadata("adc_household_income", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (C6509z0.m15964e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(String str) {
        if (C6509z0.m15964e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.f13228c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", (double) location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", (double) location.getTime());
        setMetadata("adc_accuracy", (double) location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (C6509z0.m15964e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (C6509z0.m15964e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, double d) {
        if (C6509z0.m15964e(str)) {
            C6235c0.m15067a(this.f13227b, str, d);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (C6509z0.m15964e(str2) && C6509z0.m15964e(str)) {
            C6235c0.m15070a(this.f13227b, str, str2);
        }
        return this;
    }
}
