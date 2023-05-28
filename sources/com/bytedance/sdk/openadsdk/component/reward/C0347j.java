package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.j */
/* compiled from: SpCache */
class C0347j {

    /* renamed from: a */
    private String f1123a;

    /* renamed from: b */
    private Context f1124b;

    C0347j(Context context, String str) {
        this.f1124b = context;
        this.f1123a = TextUtils.isEmpty(str) ? "" : str;
    }

    /* renamed from: b */
    private Context m1429b() {
        Context context = this.f1124b;
        return context == null ? C0558m.m2663a() : context;
    }

    /* renamed from: f */
    private SharedPreferences m1432f(String str) {
        try {
            if (m1429b() != null) {
                return m1429b().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: g */
    private String m1433g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = BuildConfig.ADAPTER_VERSION;
        }
        return this.f1123a + "_cache_" + str;
    }

    /* renamed from: c */
    private String m1430c() {
        return this.f1123a + "_adslot";
    }

    /* renamed from: d */
    private String m1431d() {
        return this.f1123a + "_adslot_preload";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo906a(String str) {
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4410b(m1433g(str), "material_data", (String) null);
            }
            SharedPreferences f = m1432f(m1433g(str));
            if (f != null) {
                return f.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo909b(String str) {
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4396a(m1433g(str), "create_time", 0);
            }
            SharedPreferences f = m1432f(m1433g(str));
            if (f != null) {
                return f.getLong("create_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo911c(String str) {
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4407a(m1433g(str), "has_played", true);
            }
            SharedPreferences f = m1432f(m1433g(str));
            if (f != null) {
                return f.getBoolean("has_played", true);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo908a(String str, String str2) {
        try {
            if (C0934b.m4334c()) {
                C0947a.m4400a(m1433g(str), "has_played", (Boolean) false);
                C0947a.m4403a(m1433g(str), "create_time", Long.valueOf(System.currentTimeMillis()));
                C0947a.m4404a(m1433g(str), "material_data", str2);
                return;
            }
            SharedPreferences f = m1432f(m1433g(str));
            if (f != null) {
                f.edit().putBoolean("has_played", false).putLong("create_time", System.currentTimeMillis()).putString("material_data", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo912d(String str) {
        try {
            if (C0934b.m4334c()) {
                C0947a.m4398a(m1433g(str));
                return;
            }
            SharedPreferences f = m1432f(m1433g(str));
            if (f != null) {
                f.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AdSlot mo913e(String str) {
        String str2;
        try {
            if (C0934b.m4334c()) {
                str2 = C0947a.m4410b(m1430c(), str, (String) null);
            } else {
                SharedPreferences f = m1432f(m1430c());
                str2 = f != null ? f.getString(str, (String) null) : null;
            }
            return AdSlot.getSlot(str2 != null ? new JSONObject(str2) : null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo907a(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (C0934b.m4334c()) {
                        C0947a.m4404a(m1430c(), adSlot.getCodeId(), jSONObject);
                        return;
                    }
                    SharedPreferences f = m1432f(m1430c());
                    if (f != null) {
                        f.edit().putString(adSlot.getCodeId(), jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo910b(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (C0934b.m4334c()) {
                        C0947a.m4404a(m1431d(), "preload_data", jSONObject);
                        return;
                    }
                    SharedPreferences f = m1432f(m1431d());
                    if (f != null) {
                        f.edit().putString("preload_data", jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdSlot mo905a() {
        String str;
        try {
            if (C0934b.m4334c()) {
                str = C0947a.m4410b(m1431d(), "preload_data", (String) null);
                C0947a.m4398a(m1431d());
            } else {
                SharedPreferences f = m1432f(m1431d());
                if (f != null) {
                    String string = f.getString("preload_data", (String) null);
                    f.edit().clear().apply();
                    str = string;
                } else {
                    str = null;
                }
            }
            return AdSlot.getSlot(str != null ? new JSONObject(str) : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
