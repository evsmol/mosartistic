package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;

public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";

    /* renamed from: a */
    private static final List<C6294f1> f13187a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    static void m14822a(C6294f1 f1Var) {
        List<C6294f1> list = f13187a;
        synchronized (list) {
            if (200 > list.size()) {
                list.add(f1Var);
            }
        }
    }

    /* renamed from: b */
    static void m14825b() {
        C6328k b = C6185a.m14887b();
        if (!b.mo50811v().equals("") && b.mo50769I()) {
            List<C6294f1> list = f13187a;
            synchronized (list) {
                for (C6294f1 b2 : list) {
                    m14826b(b2);
                }
                f13187a.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m14827c(C6294f1 f1Var) {
        C6294f1 f = C6235c0.m15085f(f1Var, "payload");
        if (C6361l.f13654H) {
            C6235c0.m15070a(f, "api_key", "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            C6235c0.m15070a(f, "api_key", C6185a.m14887b().mo50811v());
        }
        try {
            f1Var.mo50709r("payload");
            f1Var.mo50676a("payload", f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m14828d(C6294f1 f1Var) {
        C6235c0.m15070a(f1Var, "timezone", TimeZone.getDefault().getID());
        C6235c0.m15070a(f1Var, "action_time", String.valueOf(Math.round((float) (System.currentTimeMillis() / 1000))));
    }

    public static void logAchievementUnlocked(String str) {
        if (!m14824a(str, "logAchievementUnlocked")) {
            HashMap hashMap = new HashMap();
            hashMap.put("description", str);
            logEvent("achievement_unlocked", hashMap);
        }
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logAdImpression() {
        logEvent("ad_impression");
    }

    public static void logAddToCart(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_cart", hashMap);
    }

    public static void logAddToWishlist(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_wishlist", hashMap);
    }

    public static void logAppOpen() {
        logEvent("app_open");
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(AppLovinEventParameters.CONTENT_IDENTIFIER, str);
        hashMap.put("content_type", str2);
        logEvent("content_view", hashMap);
    }

    public static void logCreditsSpent(String str, Integer num, Double d, String str2) {
        if (str2 == null || str2.length() == 3) {
            HashMap hashMap = new HashMap();
            hashMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            hashMap.put("quantity", String.valueOf(num));
            hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, String.valueOf(d));
            hashMap.put("currency_code", str2);
            logEvent("credits_spent", hashMap);
            return;
        }
        new C6288e0.C6289a().mo50644a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo50645a(C6288e0.f13497h);
    }

    public static void logCustomEvent(String str, String str2) {
        if (!m14824a(str2, "logCustomEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("description", str2);
            logEvent("custom_event", hashMap);
        }
    }

    public static void logEvent(String str) {
        logEvent(str, (HashMap<String, String>) null);
    }

    public static void logInvite() {
        logEvent(AppLovinEventTypes.USER_SENT_INVITATION);
    }

    public static void logLevelAchieved(Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", hashMap);
    }

    public static void logLogin(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        logEvent(AppLovinEventTypes.USER_LOGGED_IN, hashMap);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logRegistrationCompleted(String str, String str2) {
        if (!m14824a(str2, "logRegistrationCompleted")) {
            HashMap hashMap = new HashMap();
            hashMap.put("method", str);
            hashMap.put("description", str2);
            logEvent("registration_completed", hashMap);
        }
    }

    public static void logReservation() {
        logEvent(AppLovinEventTypes.USER_CREATED_RESERVATION);
    }

    public static void logSearch(String str) {
        if (str == null || str.length() <= 512) {
            HashMap hashMap = new HashMap();
            hashMap.put("search_string", str);
            logEvent(AppLovinEventTypes.USER_EXECUTED_SEARCH, hashMap);
            return;
        }
        new C6288e0.C6289a().mo50644a("logSearch searchString cannot exceed 512 characters. Event will ").mo50644a("not be sent.").mo50645a(C6288e0.f13497h);
    }

    public static void logSocialSharingEvent(String str, String str2) {
        if (!m14824a(str2, "logSocialSharingEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("network", str);
            hashMap.put("description", str2);
            logEvent("social_sharing_event", hashMap);
        }
    }

    public static void logTransaction(String str, Integer num, Double d, String str2, String str3, String str4, String str5) {
        if (!m14824a(str5, "logTransaction")) {
            if (str2 == null || str2.length() == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", str);
                hashMap.put("quantity", String.valueOf(num));
                hashMap.put("price", String.valueOf(d));
                hashMap.put("currency_code", str2);
                hashMap.put("receipt", str3);
                hashMap.put("store", str4);
                hashMap.put("description", str5);
                logEvent("transaction", hashMap);
                return;
            }
            new C6288e0.C6289a().mo50644a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo50645a(C6288e0.f13497h);
        }
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }

    public static void logEvent(String str, HashMap<String, String> hashMap) {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "event_name", str);
        C6294f1 b2 = C6235c0.m15073b();
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                if (next.getValue() != null && !((String) next.getValue()).equals("null")) {
                    C6235c0.m15070a(b2, (String) next.getKey(), (String) next.getValue());
                }
            }
        }
        m14828d(b2);
        C6235c0.m15069a(b, "payload", b2);
        m14826b(b);
    }

    /* renamed from: a */
    static boolean m14823a() {
        boolean z;
        List<C6294f1> list = f13187a;
        synchronized (list) {
            z = list.size() != 0;
        }
        return z;
    }

    /* renamed from: b */
    private static void m14826b(C6294f1 f1Var) {
        C6328k b = C6185a.m14887b();
        if (b.mo50811v().equals("") || !b.mo50769I()) {
            m14822a(f1Var);
            return;
        }
        m14827c(f1Var);
        new C6312h0("AdColony.log_event", 1, f1Var).mo50736c();
    }

    /* renamed from: a */
    private static boolean m14824a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        new C6288e0.C6289a().mo50644a("Description of event ").mo50644a(str2).mo50644a(" must be less").mo50644a(" than 512 characters").mo50645a(C6288e0.f13497h);
        return true;
    }
}
