package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Si */
public class C2534Si {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16646a(C2638Ui ui, C2572Tl.C2573a aVar) {
        JSONObject optJSONObject;
        if (ui.mo16864O() && (optJSONObject = aVar.optJSONObject("socket")) != null) {
            C2121If.C2147q qVar = new C2121If.C2147q();
            long optLong = optJSONObject.optLong("seconds_to_live");
            long optLong2 = optJSONObject.optLong("first_delay_seconds", qVar.f5716e);
            int optInt = optJSONObject.optInt("launch_delay_seconds", qVar.f5717f);
            long optLong3 = optJSONObject.optLong("open_event_interval_seconds", qVar.f5718g);
            long optLong4 = optJSONObject.optLong("min_failed_request_interval_seconds", qVar.f5719h);
            long optLong5 = optJSONObject.optLong("min_successful_request_interval_seconds", qVar.f5720i);
            long optLong6 = optJSONObject.optLong("open_retry_interval_seconds", qVar.f5721j);
            String optString = optJSONObject.optString("token");
            JSONArray optJSONArray = optJSONObject.optJSONArray("ports_https");
            JSONArray jSONArray = new JSONArray();
            if (optJSONArray == null) {
                optJSONArray = jSONArray;
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("ports_http");
            JSONArray jSONArray2 = new JSONArray();
            if (optJSONArray2 == null) {
                optJSONArray2 = jSONArray2;
            }
            boolean z = optJSONArray.length() > 0 || optJSONArray2.length() > 0;
            if (optLong > 0 && !TextUtils.isEmpty(optString) && z) {
                List<Integer> a = m8393a(optJSONArray);
                List<Integer> a2 = m8393a(optJSONArray2);
                if (!((ArrayList) a).isEmpty() || !((ArrayList) a2).isEmpty()) {
                    ui.mo16874a(new C2900di(optLong, optString, a, a2, optLong2, optInt, optLong3, optLong4, optLong5, optLong6));
                }
            }
        }
    }

    /* renamed from: a */
    private List<Integer> m8393a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            int optInt = jSONArray.optInt(i);
            if (optInt != 0) {
                arrayList.add(Integer.valueOf(optInt));
            }
        }
        return arrayList;
    }
}
