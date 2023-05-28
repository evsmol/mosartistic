package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.google.android.gms.common.Scopes;
import java.util.List;
import java.util.Map;

public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a */
    private final Map<String, String> f20439a = CollectionUtils.map();

    /* renamed from: b */
    private final Object f20440b = new Object();

    /* renamed from: c */
    private Integer f20441c = null;

    /* renamed from: d */
    private AppLovinGender f20442d = null;

    /* renamed from: e */
    private AppLovinAdContentRating f20443e = null;

    /* renamed from: f */
    private String f20444f = null;

    /* renamed from: g */
    private String f20445g = null;

    /* renamed from: h */
    private List<String> f20446h = null;

    /* renamed from: i */
    private List<String> f20447i = null;

    /* renamed from: a */
    private void m24909a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f20440b) {
                if (StringUtils.isValidString(str2)) {
                    this.f20439a.put(str, str2);
                } else {
                    this.f20439a.remove(str);
                }
            }
        }
    }

    public void clearAll() {
        synchronized (this.f20440b) {
            this.f20439a.clear();
        }
    }

    public Map<String, String> getAllData() {
        Map<String, String> map;
        synchronized (this.f20440b) {
            map = CollectionUtils.map(this.f20439a);
        }
        return map;
    }

    public String getEmail() {
        return this.f20444f;
    }

    public AppLovinGender getGender() {
        return this.f20442d;
    }

    public List<String> getInterests() {
        return this.f20447i;
    }

    public List<String> getKeywords() {
        return this.f20446h;
    }

    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f20443e;
    }

    public String getPhoneNumber() {
        return this.f20445g;
    }

    public Integer getYearOfBirth() {
        return this.f20441c;
    }

    public void setEmail(String str) {
        m24909a(Scopes.EMAIL, str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f20444f = str;
    }

    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            m24909a("gender", str);
            this.f20442d = appLovinGender;
        }
        str = null;
        m24909a("gender", str);
        this.f20442d = appLovinGender;
    }

    public void setInterests(List<String> list) {
        m24909a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f20447i = list;
    }

    public void setKeywords(List<String> list) {
        m24909a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f20446h = list;
    }

    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        m24909a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f20443e = appLovinAdContentRating;
    }

    public void setPhoneNumber(String str) {
        m24909a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f20445g = str;
    }

    public void setYearOfBirth(Integer num) {
        m24909a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f20441c = num;
    }
}
