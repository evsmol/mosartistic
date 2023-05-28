package com.applovin.impl.mediation.p234a;

import android.os.Bundle;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.f */
public class C8076f {

    /* renamed from: a */
    private final JSONObject f19616a;

    /* renamed from: b */
    protected final C8490n f19617b;

    /* renamed from: c */
    private final JSONObject f19618c;

    /* renamed from: d */
    private final Map<String, Object> f19619d;

    /* renamed from: e */
    private final Object f19620e = new Object();

    /* renamed from: f */
    private final Object f19621f = new Object();

    /* renamed from: g */
    private String f19622g;

    /* renamed from: h */
    private String f19623h;

    public C8076f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        } else if (jSONObject != null) {
            this.f19617b = nVar;
            this.f19616a = jSONObject2;
            this.f19618c = jSONObject;
            this.f19619d = map;
        } else {
            throw new IllegalArgumentException("No ad object specified");
        }
    }

    /* renamed from: a */
    private int mo56060a() {
        return mo56175b("mute_state", mo56161a("mute_state", ((Integer) this.f19617b.mo57342a(C8379a.f20657L)).intValue()));
    }

    /* renamed from: P */
    public JSONObject mo56149P() {
        JSONObject jSONObject;
        synchronized (this.f19621f) {
            jSONObject = this.f19616a;
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public JSONObject mo56150Q() {
        JSONObject jSONObject;
        synchronized (this.f19620e) {
            jSONObject = this.f19618c;
        }
        return jSONObject;
    }

    /* renamed from: R */
    public String mo56151R() {
        return mo56178b("class", (String) null);
    }

    /* renamed from: S */
    public String mo56152S() {
        return mo56178b(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
    }

    /* renamed from: T */
    public String mo56153T() {
        return mo56152S().split("_")[0];
    }

    /* renamed from: U */
    public boolean mo56154U() {
        return mo56177b("is_testing", (Boolean) false).booleanValue();
    }

    /* renamed from: V */
    public Boolean mo56155V() {
        String str = this.f19617b.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT);
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo56183c(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT) ? mo56177b(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) false) : mo56163a(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) null);
    }

    /* renamed from: W */
    public Boolean mo56156W() {
        String str = this.f19617b.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER);
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo56183c(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER) ? mo56177b(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) false) : mo56163a(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) null);
    }

    /* renamed from: X */
    public Boolean mo56157X() {
        String str = this.f19617b.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.DO_NOT_SELL);
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo56183c(AppLovinSdkExtraParameterKey.DO_NOT_SELL) ? mo56177b(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) false) : mo56163a(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) null);
    }

    /* renamed from: Y */
    public String mo56158Y() {
        return mo56183c("consent_string") ? mo56178b("consent_string", (String) null) : mo56164a("consent_string", (String) null);
    }

    /* renamed from: Z */
    public boolean mo56159Z() {
        return mo56177b("run_on_ui_thread", (Boolean) true).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo56160a(String str, float f) {
        float f2;
        synchronized (this.f19620e) {
            f2 = JsonUtils.getFloat(this.f19618c, str, f);
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo56161a(String str, int i) {
        int i2;
        synchronized (this.f19621f) {
            i2 = JsonUtils.getInt(this.f19616a, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo56162a(String str, long j) {
        long j2;
        synchronized (this.f19621f) {
            j2 = JsonUtils.getLong(this.f19616a, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo56163a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f19621f) {
            bool2 = JsonUtils.getBoolean(this.f19616a, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo56164a(String str, String str2) {
        String string;
        synchronized (this.f19621f) {
            string = JsonUtils.getString(this.f19616a, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray mo56165a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f19621f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f19616a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo56166a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f19620e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f19618c, str, jSONObject);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56167a(String str, Object obj) {
        synchronized (this.f19620e) {
            JsonUtils.putObject(this.f19618c, str, obj);
        }
    }

    /* renamed from: aa */
    public Map<String, Object> mo56168aa() {
        return this.f19619d;
    }

    /* renamed from: ab */
    public Bundle mo56169ab() {
        Bundle bundle = mo56184d("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(mo56166a("server_parameters", (JSONObject) null)) : new Bundle();
        int a = mo56060a();
        if (a != -1) {
            bundle.putBoolean("is_muted", a == 2 ? this.f19617b.mo57400q().isMuted() : a == 0);
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, mo56162a(AppLovinEventParameters.REVENUE_AMOUNT, 0));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, mo56164a(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    /* renamed from: ac */
    public Bundle mo56170ac() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), mo56169ab());
    }

    /* renamed from: ad */
    public long mo56171ad() {
        return mo56176b("adapter_timeout_ms", ((Long) this.f19617b.mo57342a(C8379a.f20681k)).longValue());
    }

    /* renamed from: ae */
    public long mo56172ae() {
        return mo56176b("init_completion_delay_ms", -1);
    }

    /* renamed from: af */
    public long mo56173af() {
        return mo56176b("auto_init_delay_ms", 0);
    }

    /* renamed from: ag */
    public String mo56174ag() {
        return this.f19623h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo56175b(String str, int i) {
        int i2;
        synchronized (this.f19620e) {
            i2 = JsonUtils.getInt(this.f19618c, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo56176b(String str, long j) {
        long j2;
        synchronized (this.f19620e) {
            j2 = JsonUtils.getLong(this.f19618c, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Boolean mo56177b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f19620e) {
            bool2 = JsonUtils.getBoolean(this.f19618c, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo56178b(String str, String str2) {
        String string;
        synchronized (this.f19620e) {
            string = JsonUtils.getString(this.f19618c, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONArray mo56179b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f19620e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f19618c, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56180c(String str, int i) {
        synchronized (this.f19620e) {
            JsonUtils.putInt(this.f19618c, str, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56181c(String str, long j) {
        synchronized (this.f19620e) {
            JsonUtils.putLong(this.f19618c, str, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56182c(String str, String str2) {
        synchronized (this.f19620e) {
            JsonUtils.putString(this.f19618c, str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo56183c(String str) {
        boolean has;
        synchronized (this.f19620e) {
            has = this.f19618c.has(str);
        }
        return has;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Object mo56184d(String str) {
        Object opt;
        synchronized (this.f19620e) {
            opt = this.f19618c.opt(str);
        }
        return opt;
    }

    /* renamed from: e */
    public void mo56185e(String str) {
        this.f19622g = str;
    }

    /* renamed from: f */
    public void mo56186f(String str) {
        this.f19623h = str;
    }

    /* renamed from: g */
    public List<String> mo56187g(String str) {
        if (str != null) {
            List optList = JsonUtils.optList(mo56165a(str, new JSONArray()), Collections.EMPTY_LIST);
            List optList2 = JsonUtils.optList(mo56179b(str, new JSONArray()), Collections.EMPTY_LIST);
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String getAdUnitId() {
        return mo56164a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f19622g;
    }

    /* renamed from: h */
    public String mo56190h(String str) {
        String b = mo56178b(str, "");
        return StringUtils.isValidString(b) ? b : mo56164a(str, "");
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + mo56151R() + "', adapterName='" + mo56152S() + "', isTesting=" + mo56154U() + '}';
    }
}
