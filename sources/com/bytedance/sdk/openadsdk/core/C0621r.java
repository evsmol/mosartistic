package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10624c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.p024h.C0505a;
import com.bytedance.sdk.openadsdk.core.p024h.C0506b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.r */
/* compiled from: SecSdkHelper */
public class C0621r {

    /* renamed from: a */
    private static C0505a f2323a;

    /* renamed from: b */
    private String f2324b;

    /* renamed from: com.bytedance.sdk.openadsdk.core.r$a */
    /* compiled from: SecSdkHelper */
    private static class C0623a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C0621r f2325a = new C0621r();
    }

    private C0621r() {
        this.f2324b = null;
        f2323a = new C0506b();
    }

    /* renamed from: a */
    public void mo2019a(String str) {
        C0505a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f2323a) != null) {
            aVar.mo1625a(str);
        }
    }

    /* renamed from: a */
    public static C0621r m3009a() {
        return C0623a.f2325a;
    }

    /* renamed from: b */
    public void mo2021b(String str) {
        C0505a aVar = f2323a;
        if (aVar != null) {
            aVar.mo1627b(str);
        }
    }

    /* renamed from: b */
    public String mo2020b() {
        try {
            C10638l.m31238c("mssdk", "进入getSha1");
            if (!TextUtils.isEmpty(this.f2324b)) {
                C10638l.m31238c("mssdk", "sha1 内存 getSha1 " + this.f2324b);
                return this.f2324b;
            }
            String a = C0503h.m2278a("sdk_app_sha1", 2592000000L);
            this.f2324b = a;
            if (!TextUtils.isEmpty(a)) {
                C10638l.m31238c("mssdk", "sha1 return sha1: " + this.f2324b);
                return this.f2324b;
            }
            if (f2323a != null) {
                this.f2324b = f2323a.mo1626b();
                C10638l.m31238c("mssdk", "sha1: mssdk:  " + this.f2324b);
            }
            if (m3010c(this.f2324b)) {
                String upperCase = this.f2324b.toUpperCase();
                this.f2324b = upperCase;
                C0503h.m2280a("sdk_app_sha1", upperCase);
                return this.f2324b;
            }
            String a2 = C10624c.m31193a(C0558m.m2663a());
            this.f2324b = a2;
            if (!m3010c(a2)) {
                return "";
            }
            String upperCase2 = this.f2324b.toUpperCase();
            this.f2324b = upperCase2;
            C0503h.m2280a("sdk_app_sha1", upperCase2);
            return this.f2324b;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    private boolean m3010c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 20) {
            return false;
        }
        for (String equals : split) {
            if (!"00".equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String mo2022c() {
        C0505a aVar = f2323a;
        if (aVar == null) {
            return "";
        }
        String a = aVar.mo1623a();
        C10638l.m31238c("mssdk", "sec_did: " + a);
        return a != null ? a : "";
    }

    /* renamed from: a */
    public Map<String, String> mo2018a(String str, byte[] bArr) {
        C0505a aVar = f2323a;
        if (aVar != null) {
            return aVar.mo1624a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", bArr);
        }
        return new HashMap();
    }
}
