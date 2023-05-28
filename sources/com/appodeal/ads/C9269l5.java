package com.appodeal.ads;

import com.appnext.base.p264b.C8856i;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.C9623a;
import com.ironsource.mediationsdk.IronSourceSegment;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.l5 */
public final class C9269l5 implements UserData {

    /* renamed from: l */
    public static volatile C9269l5 f23314l;

    /* renamed from: a */
    public String f23315a;

    /* renamed from: b */
    public UserSettings.Gender f23316b;

    /* renamed from: c */
    public Integer f23317c;

    /* renamed from: d */
    public String f23318d;

    /* renamed from: e */
    public String f23319e;

    /* renamed from: f */
    public String f23320f;

    /* renamed from: g */
    public String f23321g;

    /* renamed from: h */
    public Float f23322h;

    /* renamed from: i */
    public Float f23323i;

    /* renamed from: j */
    public String f23324j;

    /* renamed from: k */
    public String f23325k;

    /* renamed from: a */
    public static C9269l5 m27453a() {
        if (f23314l == null) {
            synchronized (C9269l5.class) {
                if (f23314l == null) {
                    f23314l = new C9269l5();
                }
            }
        }
        return f23314l;
    }

    /* renamed from: a */
    public static void m27454a(JSONObject jSONObject) {
        int optInt;
        int optInt2;
        UserSettings.Gender fromInteger;
        if (jSONObject != null) {
            C9269l5 a = m27453a();
            JSONObject optJSONObject = jSONObject.optJSONObject("user_settings");
            if (optJSONObject != null) {
                if (a.f23316b == null && optJSONObject.has("gender") && (optInt2 = optJSONObject.optInt("gender", -1)) > -1 && (fromInteger = UserSettings.Gender.fromInteger(Integer.valueOf(optInt2))) != null) {
                    a.f23316b = fromInteger;
                }
                if (a.f23317c == null && optJSONObject.has(IronSourceSegment.AGE) && (optInt = optJSONObject.optInt(IronSourceSegment.AGE, -1)) > -1) {
                    a.f23317c = Integer.valueOf(optInt);
                }
                if (optJSONObject.has(C8856i.f22445fC)) {
                    float optDouble = (float) optJSONObject.optDouble(C8856i.f22445fC, -1.0d);
                    if (optDouble > -1.0f) {
                        a.f23322h = Float.valueOf(optDouble);
                    }
                }
                if (optJSONObject.has("lon")) {
                    float optDouble2 = (float) optJSONObject.optDouble("lon", -1.0d);
                    if (optDouble2 > -1.0f) {
                        a.f23323i = Float.valueOf(optDouble2);
                    }
                }
                a.f23324j = C9326n5.m27532a(optJSONObject, "city", a.f23324j);
                a.f23325k = C9326n5.m27532a(optJSONObject, "zip", a.f23325k);
            }
            a.f23318d = C9326n5.m27532a(jSONObject, "ip", a.f23318d);
            a.f23319e = C9326n5.m27532a(jSONObject, "ipv6", a.f23319e);
            a.f23320f = C9326n5.m27532a(jSONObject, "country_id", a.f23320f);
            a.f23321g = C9326n5.m27532a(jSONObject, "address", a.f23321g);
        }
    }

    public final String getAddress() {
        return this.f23321g;
    }

    @Deprecated
    public final Integer getAge() {
        return this.f23317c;
    }

    public final String getCity() {
        return this.f23324j;
    }

    public final String getCountryId() {
        return this.f23320f;
    }

    @Deprecated
    public final UserSettings.Gender getGender() {
        return this.f23316b;
    }

    public final String getIp() {
        return this.f23318d;
    }

    public final String getIpv6() {
        return this.f23319e;
    }

    public final Float getLat() {
        return this.f23322h;
    }

    public final Float getLon() {
        return this.f23323i;
    }

    public final String getUserId() {
        return this.f23315a;
    }

    public final String getZip() {
        return this.f23325k;
    }

    @Deprecated
    public final UserSettings setAge(int i) {
        Log.log("UserSettings", LogConstants.EVENT_SET, String.format("age: %s", new Object[]{Integer.valueOf(i)}), Log.LogLevel.verbose);
        this.f23317c = Integer.valueOf(i);
        return this;
    }

    @Deprecated
    public final UserSettings setGender(UserSettings.Gender gender) {
        if (gender == null) {
            Log.log(new C9623a("Unable to set gender to null"));
            return this;
        }
        Log.log("UserSettings", LogConstants.EVENT_SET, String.format("gender: %s", new Object[]{gender}), Log.LogLevel.verbose);
        this.f23316b = gender;
        return this;
    }

    public final UserSettings setUserId(String str) {
        if (str == null) {
            Log.log(new C9623a("Unable to set user id to null"));
            return this;
        }
        Log.log("UserSettings", LogConstants.EVENT_SET, String.format("userId: %s", new Object[]{str}), Log.LogLevel.verbose);
        this.f23315a = str;
        return this;
    }
}
