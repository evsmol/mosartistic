package com.applovin.impl.sdk;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.p */
public abstract class C8548p {

    /* renamed from: a */
    protected final C8490n f21586a;

    /* renamed from: b */
    protected final C8626v f21587b;

    /* renamed from: c */
    private final String f21588c;

    public C8548p(String str, C8490n nVar) {
        this.f21588c = str;
        this.f21586a = nVar;
        this.f21587b = nVar.mo57320D();
    }

    /* renamed from: b */
    private Map<String, String> m25990b(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", this.f21588c);
        hashMap.put("platform", this.f21586a.mo57340Y().mo57631f());
        hashMap.put("applovin_random_token", this.f21586a.mo57399p());
        hashMap.put("compass_random_token", this.f21586a.mo57398o());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        hashMap.put("aei", String.valueOf(this.f21586a.mo57342a(C8380b.f20745au)));
        hashMap.put("mei", String.valueOf(this.f21586a.mo57342a(C8380b.f20746av)));
        m25991c(hashMap);
        m25992d(hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: c */
    private void m25991c(Map<String, String> map) {
        PackageInfo packageInfo;
        int i = 0;
        try {
            packageInfo = this.f21586a.mo57332P().getPackageManager().getPackageInfo(this.f21586a.mo57332P().getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        if (packageInfo != null) {
            i = packageInfo.versionCode;
        }
        map.put("app_version_code", String.valueOf(i));
    }

    /* renamed from: d */
    private void m25992d(Map<String, String> map) {
        String str;
        Object c = this.f21586a.mo57367ah().mo57676c();
        if (c instanceof C8350e) {
            map.put("fs_ad_network", "AppLovin");
            str = Long.toString(((C8350e) c).getAdIdNumber());
        } else if (c instanceof C8070a) {
            C8070a aVar = (C8070a) c;
            map.put("fs_ad_network", aVar.getNetworkName());
            str = aVar.getCreativeId();
        } else {
            str = "None";
            map.put("fs_ad_network", str);
        }
        map.put("fs_ad_creative_id", str);
    }

    /* renamed from: a */
    public void mo57644a(Map<String, String> map) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21587b;
            vVar.mo57818b("ErrorReporter", "Reporting " + this.f21588c + " error...");
        }
        this.f21586a.mo57339X().mo57568a(C8533h.m25871o().mo57602c("https://ms.applovin.com/1.0/sdk/error").mo57597a(false).mo57599b("POST").mo57596a(m25990b(map)).mo57598a());
    }
}
