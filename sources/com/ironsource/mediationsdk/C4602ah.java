package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.C4386c;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ah */
final class C4602ah {

    /* renamed from: b */
    private static C4602ah f11354b;

    /* renamed from: a */
    JSONObject f11355a = new JSONObject();

    private C4602ah() {
    }

    /* renamed from: a */
    public static synchronized C4602ah m13449a() {
        C4602ah ahVar;
        synchronized (C4602ah.class) {
            if (f11354b == null) {
                f11354b = new C4602ah();
            }
            ahVar = f11354b;
        }
        return ahVar;
    }

    /* renamed from: a */
    private synchronized void m13452a(String str, Object obj) {
        try {
            this.f11355a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    static JSONObject m13453b() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = C4407h.m12565k();
        int l = C4407h.m12568l();
        float o = C4407h.m12573o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C4616d.m13502a().f11403c;
                concurrentHashMap.putAll(C4723k.m13824a().mo34195d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                Boolean bool = C4455H.m12683a().f10667y;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String B = C4407h.m12534B(applicationContext);
                if (!TextUtils.isEmpty(B)) {
                    jSONObject.put("asid", B);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", (double) C4407h.m12567l(applicationContext));
                jSONObject.put("root", C4407h.m12564j());
                jSONObject.put("bat", C4407h.m12585v(applicationContext));
                jSONObject.put("diskFS", C4407h.m12575p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", C4731o.m13872a().mo34207b(2));
                jSONObject.put("sDepRV", C4731o.m13872a().mo34207b(1));
                jSONObject.put("UA", C4407h.m12580r());
            } catch (JSONException e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    static JSONObject m13454c() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e = C4407h.m12553e();
                if (e != null) {
                    jSONObject.put("dOSVF", e);
                    jSONObject.put("dOSV", e.replaceAll("[^0-9/.]", ""));
                }
                String y = C4407h.m12588y(applicationContext);
                if (y != null) {
                    jSONObject.put("auid", y);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put(Constants.APP_KEY, C4455H.m12683a().f10652j);
                jSONObject.put("mCar", C4407h.m12562i(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", "android");
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", C4386c.m12480c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", C4455H.m12683a().f10653k);
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static JSONObject m13455d() {
        String str;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            String[] C = C4407h.m12535C(applicationContext);
            String str2 = "";
            if (C == null || C.length != 2) {
                str = str2;
                z = false;
            } else {
                str = !TextUtils.isEmpty(C[0]) ? C[0] : str2;
                z = Boolean.valueOf(C[1]).booleanValue();
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = IronSourceConstants.TYPE_GAID;
            } else {
                str = C4407h.m12587x(applicationContext);
                if (!TextUtils.isEmpty(str)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
            }
            try {
                jSONObject.put("advId", str);
                jSONObject.put("advType", str2);
                jSONObject.put("isLAT", z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33857a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m13452a(next, jSONObject.opt(next));
        }
    }
}
