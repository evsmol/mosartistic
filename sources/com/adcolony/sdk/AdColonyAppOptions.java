package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a */
    private String f13181a = "";

    /* renamed from: b */
    private C6294f1 f13182b = new C6294f1();

    /* renamed from: c */
    private AdColonyUserMetadata f13183c;

    public AdColonyAppOptions() {
        setOriginStore("google");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo50288a(String str) {
        if (str == null) {
            return this;
        }
        this.f13181a = str;
        C6235c0.m15070a(this.f13182b, "app_id", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6294f1 mo50290b() {
        return this.f13182b;
    }

    public int getAppOrientation() {
        return C6235c0.m15057a(this.f13182b, "app_orientation", -1);
    }

    public String getAppVersion() {
        return C6235c0.m15087h(this.f13182b, "app_version");
    }

    @Deprecated
    public String getGDPRConsentString() {
        return C6235c0.m15087h(this.f13182b, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return C6235c0.m15076b(this.f13182b, "gdpr_required");
    }

    public boolean getIsChildDirectedApp() {
        return C6235c0.m15076b(this.f13182b, "is_child_directed");
    }

    public boolean getKeepScreenOn() {
        return C6235c0.m15076b(this.f13182b, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, AppMeasurementSdk.ConditionalUserProperty.NAME, C6235c0.m15087h(this.f13182b, "mediation_network"));
        C6235c0.m15070a(b, "version", C6235c0.m15087h(this.f13182b, "mediation_network_version"));
        return b.mo50678a();
    }

    public boolean getMultiWindowEnabled() {
        return C6235c0.m15076b(this.f13182b, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return C6235c0.m15086g(this.f13182b, str);
    }

    public String getOriginStore() {
        return C6235c0.m15087h(this.f13182b, "origin_store");
    }

    public JSONObject getPluginInfo() {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, AppMeasurementSdk.ConditionalUserProperty.NAME, C6235c0.m15087h(this.f13182b, "plugin"));
        C6235c0.m15070a(b, "version", C6235c0.m15087h(this.f13182b, "plugin_version"));
        return b.mo50678a();
    }

    public String getPrivacyConsentString(String str) {
        C6294f1 f1Var = this.f13182b;
        return C6235c0.m15087h(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        C6294f1 f1Var = this.f13182b;
        return C6235c0.m15076b(f1Var, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return C6235c0.m15057a(this.f13182b, "orientation", -1);
    }

    public boolean getTestModeEnabled() {
        return C6235c0.m15076b(this.f13182b, "test_mode");
    }

    public String getUserID() {
        return C6235c0.m15087h(this.f13182b, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f13183c;
    }

    public boolean isPrivacyFrameworkRequiredSet(String str) {
        C6294f1 f1Var = this.f13182b;
        return f1Var.mo50682a(str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption("app_version", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        C6235c0.m15070a(this.f13182b, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setIsChildDirectedApp(boolean z) {
        setOption("is_child_directed", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        C6235c0.m15079b(this.f13182b, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        C6235c0.m15070a(this.f13182b, "mediation_network", str);
        C6235c0.m15070a(this.f13182b, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        C6235c0.m15079b(this.f13182b, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        C6235c0.m15079b(this.f13182b, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        C6235c0.m15070a(this.f13182b, "plugin", str);
        C6235c0.m15070a(this.f13182b, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        C6294f1 f1Var = this.f13182b;
        C6235c0.m15070a(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption("orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        C6235c0.m15079b(this.f13182b, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f13183c = adColonyUserMetadata;
        C6235c0.m15069a(this.f13182b, "user_metadata", adColonyUserMetadata.f13227b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50291b(Context context) {
        m14815a(context);
        Boolean g = this.f13182b.mo50698g("use_forced_controller");
        if (g != null) {
            C6361l.f13654H = g.booleanValue();
        }
        if (this.f13182b.mo50697f("use_staging_launch_server")) {
            C6328k.f13570Z = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b = C6509z0.m15947b(context, "IABUSPrivacy_String");
        String b2 = C6509z0.m15947b(context, "IABTCF_TCString");
        int a = C6509z0.m15922a(context, "IABTCF_gdprApplies");
        if (b != null) {
            C6235c0.m15070a(this.f13182b, "ccpa_consent_string", b);
        }
        if (b2 != null) {
            C6235c0.m15070a(this.f13182b, "gdpr_consent_string", b2);
        }
        boolean z = true;
        if (a == 0 || a == 1) {
            C6294f1 f1Var = this.f13182b;
            if (a != 1) {
                z = false;
            }
            C6235c0.m15079b(f1Var, "gdpr_required", z);
        }
    }

    public AdColonyAppOptions setOption(String str, double d) {
        C6235c0.m15067a(this.f13182b, str, d);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo50289a() {
        return this.f13181a;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        C6235c0.m15070a(this.f13182b, str, str2);
        return this;
    }

    /* renamed from: a */
    private void m14815a(Context context) {
        setOption("bundle_id", C6509z0.m15961d(context));
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork("MoPub", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(":");
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals("store")) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }
}
