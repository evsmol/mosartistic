package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.C8475k;
import com.applovin.impl.sdk.C8626v;

public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a = C8475k.m25556b().mo57299a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a = C8475k.m25551a().mo57299a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return C8475k.m25551a().mo57299a(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a = C8475k.m25558c().mo57299a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return C8475k.m25558c().mo57299a(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "isUserConsentSet()");
        return C8475k.m25556b().mo57299a(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "setDoNotSell()");
        if (C8475k.m25559c(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, (Boolean) null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (C8475k.m25557b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), (Boolean) null, (Boolean) null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        C8626v.m26255f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (C8475k.m25555a(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, Boolean.valueOf(z), (Boolean) null);
        }
    }
}
