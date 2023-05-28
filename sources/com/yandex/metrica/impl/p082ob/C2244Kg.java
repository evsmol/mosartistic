package com.yandex.metrica.impl.p082ob;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Kg */
public class C2244Kg {

    /* renamed from: a */
    private final Map<String, String> f5978a;

    public C2244Kg() {
        HashMap hashMap = new HashMap();
        this.f5978a = hashMap;
        hashMap.put("easy_collecting", "ec");
        hashMap.put("cells_around", "ca");
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("throttling", "tht");
        hashMap.put("wifi_around", "wa");
        hashMap.put("wifi_connected", "wc");
        hashMap.put("features_collecting", "fc");
        hashMap.put("cell_additional_info", "cai");
        hashMap.put("cell_additional_info_connected_only", "caico");
        hashMap.put("location_collecting", "lc");
        hashMap.put("lbs_collecting", "lbs");
        hashMap.put("package_info", "pi");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("sdk_list", "sl");
        hashMap.put("socket", "s");
        hashMap.put("identity_light_collecting", "ilc");
        hashMap.put("gpl_collecting", "gplc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("ui_parsing", "up");
        hashMap.put("ui_collecting_for_bridge", "ucfb");
        hashMap.put("ui_event_sending", "ues");
        hashMap.put("ui_raw_event_sending", "ures");
        hashMap.put("cache_control", "cc");
        hashMap.put("mediascope_api_keys", "mak");
        hashMap.put("diagnostics", "d");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put("attribution", "at");
        hashMap.put("egress", "eg");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
    }

    /* renamed from: a */
    public String mo16084a(String str) {
        return this.f5978a.containsKey(str) ? this.f5978a.get(str) : str;
    }
}
