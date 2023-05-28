package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.entity.C6595b;
import com.apm.insight.p176j.C6629b;
import com.apm.insight.p177k.C6658k;
import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6693v;
import com.apm.insight.runtime.C6740d;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.g */
public class C6606g {

    /* renamed from: b */
    protected static MonitorCrash f14182b;

    /* renamed from: a */
    protected MonitorCrash f14183a;

    private C6606g(MonitorCrash monitorCrash) {
        this.f14183a = monitorCrash;
        C6595b.m16205a(this);
        C6629b.m16359d();
        C6658k.m16464e();
    }

    /* renamed from: a */
    public static Object m16247a() {
        return f14182b;
    }

    /* renamed from: a */
    static void m16249a(Context context, final MonitorCrash monitorCrash) {
        f14182b = monitorCrash;
        C6606g gVar = new C6606g(monitorCrash);
        final C6740d a = C6617h.m16297a();
        Npth.init(context, new ICommonParams(gVar) {

            /* renamed from: a */
            final /* synthetic */ C6606g f14184a;

            {
                this.f14184a = r1;
            }

            public Map<String, Object> getCommonParams() {
                return C6678l.m16562b(this.f14184a.m16253e());
            }

            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? a.mo52293d() : monitorCrash.mConfig.mDeviceId;
            }

            public List<String> getPatchInfo() {
                return null;
            }

            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            public String getSessionId() {
                return null;
            }

            public long getUserId() {
                return 0;
            }
        });
    }

    /* renamed from: a */
    static void m16250a(MonitorCrash monitorCrash) {
        new C6606g(monitorCrash);
    }

    /* renamed from: b */
    private JSONObject m16251b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f14183a.mCustomData == null || (userData = this.f14183a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    /* renamed from: c */
    private JSONObject m16252c(CrashType crashType) {
        return new JSONObject(this.f14183a.mTagMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public JSONObject m16253e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f14183a.mConfig.mPackageName == null) {
                Context g = C6617h.m16313g();
                PackageInfo packageInfo = g.getPackageManager().getPackageInfo(g.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f14183a.mConfig.mVersionInt == -1) {
                        this.f14183a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f14183a.mConfig.mVersionStr == null) {
                        this.f14183a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f14183a.mConfig.mDeviceId) || BuildConfig.ADAPTER_VERSION.equals(this.f14183a.mConfig.mDeviceId)) {
            this.f14183a.mConfig.mDeviceId = C6617h.m16309c().mo52322a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f14183a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f14183a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f14183a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f14183a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f14183a.mConfig.mChannel);
            jSONObject.put("package", C6678l.m16556a(this.f14183a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f14183a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f14183a.mConfig.mUID);
            jSONObject.put("ssid", this.f14183a.mConfig.mSSID);
            jSONObject.put("os", APSAnalytics.OS_NAME);
            jSONObject.put("so_list", C6678l.m16556a(this.f14183a.mConfig.mSoList));
            jSONObject.put("single_upload", mo52094d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public JSONArray mo52087a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        if (this.f14183a.mConfig.mPackageName == null) {
            return new JSONArray().put(new C6693v.C6694a(0, stackTraceElementArr.length).mo52175a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return C6693v.m16663a(stackTraceElementArr, this.f14183a.mConfig.mPackageName);
    }

    /* renamed from: a */
    public JSONArray mo52088a(String[] strArr) {
        return this.f14183a.config().mPackageName == null ? new JSONArray().put(new C6693v.C6694a(0, strArr.length).mo52175a()) : C6693v.m16664a(strArr, this.f14183a.mConfig.mPackageName);
    }

    /* renamed from: a */
    public JSONObject mo52089a(CrashType crashType) {
        return mo52090a(crashType, (JSONArray) null);
    }

    /* renamed from: a */
    public JSONObject mo52090a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m16253e());
            if (crashType != null) {
                jSONObject.put("custom", m16251b(crashType));
                jSONObject.put("filters", m16252c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public boolean mo52091a(Object obj) {
        return this.f14183a == obj;
    }

    /* renamed from: b */
    public String mo52092b() {
        return this.f14183a.mConfig.mAid;
    }

    /* renamed from: c */
    public JSONObject mo52093c() {
        return m16253e();
    }

    /* renamed from: d */
    public boolean mo52094d() {
        return false;
    }
}
