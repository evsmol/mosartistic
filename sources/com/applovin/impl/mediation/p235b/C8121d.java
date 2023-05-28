package com.applovin.impl.mediation.p235b;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.d */
public class C8121d extends C8401a {

    /* renamed from: a */
    private final String f19778a;

    /* renamed from: e */
    private final String f19779e;

    /* renamed from: f */
    private final C8076f f19780f;

    /* renamed from: g */
    private final Map<String, String> f19781g;

    /* renamed from: h */
    private final Map<String, String> f19782h;

    /* renamed from: i */
    private final MaxError f19783i;

    public C8121d(String str, Map<String, String> map, MaxError maxError, C8076f fVar, C8490n nVar) {
        super("TaskFireMediationPostbacks", nVar);
        this.f19778a = str;
        this.f19779e = str + "_urls";
        this.f19781g = Utils.toUrlSafeMap(map, nVar);
        this.f19783i = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f19780f = fVar;
        Map<String, String> map2 = CollectionUtils.map(7);
        map2.put("AppLovin-Event-Type", str);
        map2.put("AppLovin-Ad-Network-Name", fVar.mo56152S());
        if (fVar instanceof C8070a) {
            C8070a aVar = (C8070a) fVar;
            map2.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            map2.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            map2.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.mo56096p());
        }
        if (maxError != null) {
            map2.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map2.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f19782h = map2;
    }

    /* renamed from: a */
    private String m24301a(String str, MaxError maxError) {
        int i;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage(), mo57167d())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2, mo57167d()));
    }

    /* renamed from: a */
    private Map<String, String> m24302a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f21118b.mo57342a(C8379a.f20679i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: a */
    private void m24303a(String str, Map<String, Object> map) {
        mo57167d().mo57339X().mo57568a(C8533h.m25871o().mo57602c(str).mo57599b("POST").mo57600b(this.f19782h).mo57597a(false).mo57603c(map).mo57601b(((Boolean) this.f21118b.mo57342a(C8379a.f20670Y)).booleanValue()).mo57598a());
    }

    /* renamed from: b */
    private String m24304b(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            str = str.replace(next, StringUtils.emptyIfNull(map.get(next)));
        }
        return str;
    }

    public void run() {
        List<String> g = this.f19780f.mo56187g(this.f19779e);
        Map<String, String> a = m24302a();
        for (String b : g) {
            Uri parse = Uri.parse(m24301a(m24304b(b, this.f19781g), this.f19783i));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            Map map = CollectionUtils.map(a.size());
            for (String next : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(next);
                if (a.containsKey(queryParameter)) {
                    map.put(next, this.f19780f.mo56190h(a.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(next, queryParameter);
                }
            }
            m24303a(clearQuery.build().toString(), (Map<String, Object>) map);
        }
    }
}
