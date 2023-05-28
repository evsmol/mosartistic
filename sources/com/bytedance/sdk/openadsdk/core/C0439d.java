package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.d */
/* compiled from: AppEnvironment */
public class C0439d {

    /* renamed from: a */
    private static volatile C0439d f1464a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f1465b = C0947a.m4396a("tt_sp_app_env", "last_app_env_time", 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f1466c = false;

    private C0439d() {
    }

    /* renamed from: a */
    public static C0439d m1800a() {
        if (f1464a == null) {
            synchronized (C0439d.class) {
                if (f1464a == null) {
                    f1464a = new C0439d();
                }
            }
        }
        return f1464a;
    }

    /* renamed from: b */
    public void mo1187b() {
        if (!this.f1466c && !C0996u.m4627a(this.f1465b, System.currentTimeMillis())) {
            this.f1466c = true;
            C10615e.m31160a(new C10618g("trySendAppManifestInfo") {
                public void run() {
                    JSONObject a = C0439d.this.m1803c();
                    if (a != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long unused = C0439d.this.f1465b = currentTimeMillis;
                        C0947a.m4403a("tt_sp_app_env", "last_app_env_time", Long.valueOf(currentTimeMillis));
                        C0796b.m3985a().mo2609a(a);
                    }
                    boolean unused2 = C0439d.this.f1466c = false;
                }
            }, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public JSONObject m1803c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Context a = C0558m.m2663a();
            if (a == null) {
                return null;
            }
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 4111);
            ApplicationInfo applicationInfo = a.getApplicationInfo();
            if (applicationInfo != null) {
                jSONObject.put("application_name", applicationInfo.name);
            }
            if (packageInfo != null) {
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                String[] strArr = packageInfo.requestedPermissions;
                if (activityInfoArr != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        jSONArray.put(activityInfo.name);
                    }
                    jSONObject.put("activities", jSONArray);
                }
                if (activityInfoArr2 != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        jSONArray2.put(activityInfo2.name);
                    }
                    jSONObject.put("receivers", jSONArray2);
                }
                if (serviceInfoArr != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        jSONArray3.put(serviceInfo.name);
                    }
                    jSONObject.put("services", jSONArray3);
                }
                if (providerInfoArr != null) {
                    JSONArray jSONArray4 = new JSONArray();
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        jSONArray4.put(providerInfo.name);
                    }
                    jSONObject.put("providers", jSONArray4);
                }
                if (strArr != null) {
                    JSONArray jSONArray5 = new JSONArray();
                    for (String put : strArr) {
                        jSONArray5.put(put);
                    }
                    jSONObject.put("permissions", jSONArray5);
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
