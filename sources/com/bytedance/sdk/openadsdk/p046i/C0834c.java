package com.bytedance.sdk.openadsdk.p046i;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.component.p323e.p326c.C10588b;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C0517j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.c */
/* compiled from: TTAdNetDepend */
public class C0834c implements C10588b {

    /* renamed from: a */
    String f3046a = "sp_multi_ttadnet_config";

    /* renamed from: b */
    private Context f3047b;

    /* renamed from: a */
    public Address mo2650a(Context context) {
        return null;
    }

    /* renamed from: b */
    public String mo2653b() {
        return "pangle_sdk";
    }

    /* renamed from: c */
    public String mo2654c() {
        return "android";
    }

    /* renamed from: d */
    public int mo2655d() {
        return BuildConfig.VERSION_CODE;
    }

    public C0834c(Context context) {
        this.f3047b = context;
    }

    /* renamed from: a */
    public int mo2649a() {
        return Integer.parseInt("1371");
    }

    /* renamed from: e */
    public String mo2656e() {
        return C0517j.m2474a(this.f3047b);
    }

    /* renamed from: a */
    public String mo2651a(Context context, String str, String str2) {
        return C0947a.m4410b(this.f3046a, str, str2);
    }

    /* renamed from: a */
    public void mo2652a(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    if (value instanceof Integer) {
                        C0947a.m4402a(this.f3046a, (String) next.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        C0947a.m4403a(this.f3046a, (String) next.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        C0947a.m4401a(this.f3046a, (String) next.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        C0947a.m4400a(this.f3046a, (String) next.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        C0947a.m4404a(this.f3046a, (String) next.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    public String[] mo2657f() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String w = C0558m.m2673h().mo1722w();
        if (!TextUtils.isEmpty(w)) {
            return ("SG".equals(w) || "CN".equals(w)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int o = C0996u.m4691o();
        return (o == 2 || o == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
