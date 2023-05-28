package com.appodeal.ads.unified;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appnext.base.p264b.C8856i;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.C9182f1;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.LocationData;
import com.appodeal.ads.UserSettings;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public class UnifiedAdUtils {
    public static boolean checkExistApacheLegacyInManifest(Context context) {
        return C9326n5.m27546b(context);
    }

    public static float getScreenDensity(Context context) {
        return C9182f1.m27290l(context);
    }

    public static float getScreenHeightInDp(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.y) / displayMetrics.density;
    }

    public static String getStringOrNullFromJson(JSONObject jSONObject, String str) {
        return C9326n5.m27532a(jSONObject, str, (String) null);
    }

    public static String parseUrlWithTopParams(Context context, String str, AdNetworkMediationParams adNetworkMediationParams) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String next : queryParameterNames) {
            String queryParameter = parse.getQueryParameter(next);
            if (queryParameter != null) {
                linkedHashMap.put(next, queryParameter);
            }
        }
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        if (adNetworkMediationParams.getRestrictedData().isUserAgeRestricted()) {
            linkedHashMap.put("coppa", "1");
        }
        LocationData location = adNetworkMediationParams.getRestrictedData().getLocation(context);
        Integer deviceLocationType = location.getDeviceLocationType();
        if (deviceLocationType != null && deviceLocationType.intValue() == 1) {
            linkedHashMap.put("geo_type", "1");
        }
        Float obtainLatitude = location.obtainLatitude();
        if (obtainLatitude != null) {
            linkedHashMap.put(C8856i.f22445fC, String.valueOf(obtainLatitude));
        }
        Float obtainLongitude = location.obtainLongitude();
        if (obtainLongitude != null) {
            linkedHashMap.put("lon", String.valueOf(obtainLongitude));
        }
        UserSettings.Gender gender = adNetworkMediationParams.getRestrictedData().getGender();
        if (gender != null) {
            linkedHashMap.put("gender", gender.getStringValue());
        }
        Integer age = adNetworkMediationParams.getRestrictedData().getAge();
        if (age != null) {
            linkedHashMap.put(IronSourceSegment.AGE, String.valueOf(age));
        }
        String userId = adNetworkMediationParams.getRestrictedData().getUserId();
        if (userId != null) {
            linkedHashMap.put(DataKeys.USER_ID, userId);
        }
        linkedHashMap.put("language", Locale.getDefault().getLanguage());
        linkedHashMap.put("connectiontype", String.valueOf(C9182f1.m27275d(context)));
        String e = C9182f1.m27277e(context);
        if (e != null) {
            linkedHashMap.put("carrier", e);
        }
        if (!adNetworkMediationParams.getRestrictedData().isUserProtected()) {
            if (Appodeal.isInitialized(512)) {
                linkedHashMap.put("native_ad_type", Appodeal.getNativeAdType().toString());
            }
            linkedHashMap.put("device_ext", C9182f1.m27279f(context).toString());
            linkedHashMap.put("app_ext", C9326n5.m27533a().toString());
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            linkedHashMap.put("ppi", String.valueOf(displayMetrics.densityDpi));
            linkedHashMap.put("pxratio", String.valueOf(displayMetrics.density));
        }
        if (adNetworkMediationParams.isCoronaApp()) {
            linkedHashMap.put("corona", "1");
            if (!adNetworkMediationParams.getRestrictedData().isUserProtected()) {
                linkedHashMap.put(IabUtils.KEY_STORE_URL, adNetworkMediationParams.getStoreUrl());
                linkedHashMap.put("bundle_id", context.getPackageName());
                linkedHashMap.put("app_name", adNetworkMediationParams.getAppName());
            }
        }
        linkedHashMap.put("impid", adNetworkMediationParams.getImpressionId());
        linkedHashMap.put("metadata_headers", "1");
        for (String str2 : linkedHashMap.keySet()) {
            clearQuery.appendQueryParameter(str2, (String) linkedHashMap.get(str2));
        }
        return clearQuery.build().toString();
    }
}
