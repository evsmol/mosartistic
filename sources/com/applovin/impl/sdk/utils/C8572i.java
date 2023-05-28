package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8381c;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p254c.C8383e;
import com.appnext.core.p267a.C8894b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.i */
public class C8572i {

    /* renamed from: a */
    private static final int[] f21647a = {7, 4, 2, 1, 11};

    /* renamed from: b */
    private static final int[] f21648b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c */
    private static final int[] f21649c = {15, 13};

    /* renamed from: d */
    private static final int[] f21650d = {20};

    /* renamed from: a */
    public static String m26094a(InputStream inputStream, C8490n nVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) nVar.mo57342a(C8380b.f20885dd)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m26095a(String str, C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20780bc), str, nVar);
    }

    /* renamed from: a */
    public static String m26096a(String str, String str2, C8490n nVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (nVar != null) {
            return str + str2;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static JSONObject m26097a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    /* renamed from: a */
    public static void m26098a(int i, C8490n nVar) {
        if (i == 401) {
            C8626v.m26258i("AppLovinSdk", "SDK key \"" + nVar.mo57319C() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i == 418) {
            nVar.mo57331O().mo57091a((C8380b<?>) C8380b.f20697Z, (Object) true);
            nVar.mo57331O().mo57090a();
        } else {
            if (i < 400 || i >= 500) {
                if (i != -1 || !((Boolean) nVar.mo57342a(C8380b.f20726ab)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) nVar.mo57342a(C8380b.f20726ab)).booleanValue()) {
                return;
            }
            nVar.mo57394k();
        }
    }

    /* renamed from: a */
    public static void m26099a(JSONObject jSONObject, boolean z, C8490n nVar) {
        nVar.mo57369aj().mo57295a(jSONObject, z);
    }

    /* renamed from: a */
    public static boolean m26100a() {
        return m26103a((String) null);
    }

    /* renamed from: a */
    private static boolean m26101a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m26102a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b = m26104b(context);
        if (b != null) {
            return b.isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m26103a(String str) {
        if (C8571h.m26087e()) {
            return (!C8571h.m26088f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    /* renamed from: b */
    private static NetworkInfo m26104b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static String m26105b(String str, C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20781bd), str, nVar);
    }

    /* renamed from: c */
    public static void m26106c(JSONObject jSONObject, C8490n nVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", (String) null);
        if (StringUtils.isValidString(string)) {
            nVar.mo57349a(C8382d.f21018z, string);
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57820c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* renamed from: d */
    public static void m26107d(JSONObject jSONObject, C8490n nVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (nVar != null) {
            try {
                if (jSONObject.has(C8894b.f22527hW)) {
                    C8381c O = nVar.mo57331O();
                    if (!jSONObject.isNull(C8894b.f22527hW)) {
                        O.mo57092a(jSONObject.getJSONObject(C8894b.f22527hW));
                        O.mo57090a();
                    }
                }
            } catch (JSONException e) {
                nVar.mo57320D();
                if (C8626v.m26252a()) {
                    nVar.mo57320D().mo57819b("ConnectionUtils", "Unable to parse settings out of API response", e);
                }
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: e */
    public static Map<String, String> m26108e(C8490n nVar) {
        String str;
        Map<String, String> map = CollectionUtils.map();
        String str2 = (String) nVar.mo57342a(C8380b.f20727ac);
        if (StringUtils.isValidString(str2)) {
            str = "device_token";
        } else {
            if (!((Boolean) nVar.mo57342a(C8380b.f20908eA)).booleanValue()) {
                str2 = nVar.mo57319C();
                str = "api_key";
            }
            map.putAll(Utils.stringifyObjectMap(nVar.mo57340Y().mo57634i()));
            return map;
        }
        map.put(str, str2);
        map.putAll(Utils.stringifyObjectMap(nVar.mo57340Y().mo57634i()));
        return map;
    }

    /* renamed from: e */
    public static void m26109e(JSONObject jSONObject, C8490n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(nVar.mo57332P()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, (Object) null);
                if (object != null) {
                    C8383e.m25218a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: f */
    public static String m26110f(C8490n nVar) {
        NetworkInfo b = m26104b(nVar.mo57332P());
        if (b == null) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        int type = b.getType();
        int subtype = b.getSubtype();
        return type == 1 ? "wifi" : type == 0 ? m26101a(subtype, f21647a) ? "2g" : m26101a(subtype, f21648b) ? "3g" : m26101a(subtype, f21649c) ? "4g" : m26101a(subtype, f21650d) ? "5g" : "mobile" : DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    }

    /* renamed from: f */
    public static void m26111f(JSONObject jSONObject, C8490n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            nVar.mo57410z().updateVariables(jSONObject2);
        }
    }

    /* renamed from: g */
    public static String m26112g(C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20778ba), ((Boolean) nVar.mo57342a(C8380b.f20893dl)).booleanValue() ? "5.0/ad" : "4.0/ad", nVar);
    }

    /* renamed from: h */
    public static String m26113h(C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20779bb), ((Boolean) nVar.mo57342a(C8380b.f20893dl)).booleanValue() ? "5.0/ad" : "4.0/ad", nVar);
    }

    /* renamed from: i */
    public static String m26114i(C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20778ba), "4.0/ad", nVar);
    }

    /* renamed from: j */
    public static String m26115j(C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20779bb), "4.0/ad", nVar);
    }

    /* renamed from: k */
    public static String m26116k(C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20784bg), "1.0/variable_config", nVar);
    }

    /* renamed from: l */
    public static String m26117l(C8490n nVar) {
        return m26096a((String) nVar.mo57342a(C8380b.f20785bh), "1.0/variable_config", nVar);
    }
}
