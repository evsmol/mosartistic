package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8567e;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();
    public final C8490n coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* renamed from: com.applovin.sdk.AppLovinSdk$a */
    private static class C8654a extends AppLovinSdkSettings {
        C8654a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(C8490n nVar) {
        this.coreSdk = nVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new C8654a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(C8567e.m26072a(context).mo57695a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        } else if (context != null) {
            synchronized (sdkInstancesLock) {
                if (sdkInstances.containsKey(str)) {
                    AppLovinSdk appLovinSdk = sdkInstances.get(str);
                    return appLovinSdk;
                }
                if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                    C8626v.m26258i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                    if (!sdkInstances.isEmpty()) {
                        AppLovinSdk next = sdkInstances.values().iterator().next();
                        return next;
                    }
                    str = str.replace(File.separator, "");
                }
                C8490n nVar = new C8490n();
                nVar.mo57354a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(nVar);
                nVar.mo57352a(appLovinSdk2);
                appLovinSdkSettings.attachAppLovinSdk(nVar);
                sdkInstances.put(str, appLovinSdk2);
                return appLovinSdk2;
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    private static String getVersion() {
        return "11.6.1";
    }

    private static int getVersionCode() {
        return 11060199;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, (SdkInitializationListener) null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk instance = getInstance(context);
            if (instance != null) {
                instance.initializeSdk(sdkInitializationListener);
            } else {
                C8626v.m26258i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk next : sdkInstances.values()) {
                next.coreSdk.mo57381b();
                next.coreSdk.mo57392i();
                if (bool != null) {
                    next.coreSdk.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D = next.coreSdk.mo57320D();
                        D.mo57820c(TAG, "Toggled 'huc' to " + bool);
                    }
                    next.getEventService().trackEvent(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, CollectionUtils.map(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool.toString()));
                }
                if (bool2 != null) {
                    next.coreSdk.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D2 = next.coreSdk.mo57320D();
                        D2.mo57820c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    next.getEventService().trackEvent(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, CollectionUtils.map(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool2.toString()));
                }
                if (bool3 != null) {
                    next.coreSdk.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D3 = next.coreSdk.mo57320D();
                        D3.mo57820c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    next.getEventService().trackEvent(AppLovinSdkExtraParameterKey.DO_NOT_SELL, CollectionUtils.map(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.mo57406v();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a = C8134c.m24356a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a.length());
        for (int i = 0; i < a.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.mo57403t();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.mo57408x();
    }

    public String getMediationProvider() {
        return this.coreSdk.mo57405u();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.mo57360aa();
    }

    public String getSdkKey() {
        return this.coreSdk.mo57319C();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.mo57400q();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.mo57402s();
    }

    public String getUserIdentifier() {
        return this.coreSdk.mo57397n();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.mo57401r();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.mo57409y();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.mo57410z();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.mo57351a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.mo57387d();
    }

    public boolean isInitialized() {
        return this.coreSdk.mo57387d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.mo57385c(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.mo57353a(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.mo57383b(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.mo57396m();
    }

    public void showMediationDebugger() {
        this.coreSdk.mo57395l();
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.mo57356a(map);
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.mo57334S() + '}';
    }
}
