package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AppLovinSdkSettings {

    /* renamed from: a */
    private boolean f21928a;

    /* renamed from: b */
    private boolean f21929b;

    /* renamed from: c */
    private boolean f21930c;

    /* renamed from: d */
    private boolean f21931d;

    /* renamed from: e */
    private boolean f21932e;

    /* renamed from: f */
    private boolean f21933f = true;

    /* renamed from: g */
    private String f21934g;

    /* renamed from: h */
    private List<String> f21935h = Collections.emptyList();

    /* renamed from: i */
    private List<String> f21936i = Collections.emptyList();

    /* renamed from: j */
    private final Map<String, String> f21937j = CollectionUtils.map();

    /* renamed from: k */
    private final Object f21938k = new Object();

    /* renamed from: l */
    private C8490n f21939l;
    private final Map<String, Object> localSettings = CollectionUtils.map();
    private final Map<String, String> metaData = CollectionUtils.map();

    public AppLovinSdkSettings(Context context) {
        this.f21928a = Utils.isVerboseLoggingEnabled(context);
        this.f21930c = true;
        this.f21931d = true;
        this.f21932e = true;
    }

    /* access modifiers changed from: protected */
    public void attachAppLovinSdk(C8490n nVar) {
        this.f21939l = nVar;
        if (StringUtils.isValidString(this.f21934g)) {
            nVar.mo57330N().mo56528a(true);
            nVar.mo57330N().mo56526a(this.f21934g);
            this.f21934g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f21938k) {
            map = CollectionUtils.map(this.f21937j);
        }
        return map;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f21936i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f21935h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f21930c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f21931d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f21932e;
    }

    public boolean isMuted() {
        return this.f21929b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f21928a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        C8626v.m26259j("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        this.f21930c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        C8626v.m26259j("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
        this.f21931d = z;
    }

    public void setExtraParameter(String str, String str2) {
        C8626v.m26259j("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            C8626v.m26258i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        synchronized (this.f21938k) {
            this.f21937j.put(str, trim);
        }
        if (!"test_mode_network".equalsIgnoreCase(str)) {
            return;
        }
        if (this.f21939l == null) {
            this.f21934g = trim;
        } else if (StringUtils.isValidString(trim)) {
            this.f21939l.mo57330N().mo56528a(true);
            this.f21939l.mo57330N().mo56526a(trim);
        } else {
            this.f21939l.mo57330N().mo56528a(false);
            this.f21939l.mo57330N().mo56526a((String) null);
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        C8626v.m26259j("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (StringUtils.isValidString(next) && next.length() > 0) {
                    if (next.length() == 16) {
                        arrayList.add(next);
                    } else {
                        C8626v.m26258i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + next + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f21936i = arrayList;
            return;
        }
        this.f21936i = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z) {
        C8626v.m26259j("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z + ")");
        this.f21932e = z;
    }

    public void setMuted(boolean z) {
        C8626v.m26259j("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.f21929b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        C8626v.m26259j("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.f21933f = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        C8626v.m26259j("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next == null || next.length() != 36) {
                    C8626v.m26258i("AppLovinSdkSettings", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(next);
                }
            }
            this.f21935h = arrayList;
            return;
        }
        this.f21935h = Collections.emptyList();
    }

    public void setVerboseLogging(boolean z) {
        C8626v.m26259j("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (Utils.isVerboseLoggingConfigured()) {
            C8626v.m26258i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (Utils.isVerboseLoggingEnabled((Context) null) != z) {
                C8626v.m26258i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f21928a = z;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f21933f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f21928a + ", muted=" + this.f21929b + ", testDeviceAdvertisingIds=" + this.f21935h.toString() + ", initializationAdUnitIds=" + this.f21936i.toString() + ", creativeDebuggerEnabled=" + this.f21930c + ", exceptionHandlerEnabled=" + this.f21931d + ", locationCollectionEnabled=" + this.f21932e + '}';
    }
}
