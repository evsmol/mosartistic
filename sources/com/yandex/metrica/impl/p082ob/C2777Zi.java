package com.yandex.metrica.impl.p082ob;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Zi */
class C2777Zi {
    C2777Zi() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2121If.C2155y[] mo17122a(JSONArray jSONArray) {
        int i;
        if (jSONArray == null) {
            return new C2121If.C2155y[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                Integer num = null;
                Integer a = C2572Tl.m8509a(jSONObject, "type", (Integer) null);
                if (a != null) {
                    int intValue = a.intValue();
                    if (intValue == 0) {
                        i = 0;
                    } else if (intValue == 1) {
                        i = 1;
                    } else if (intValue == 2) {
                        i = 2;
                    } else if (intValue == 3) {
                        i = 3;
                    }
                    num = i;
                }
                String b = C2572Tl.m8530b(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (!(num == null || b == null)) {
                    C2121If.C2155y yVar = new C2121If.C2155y();
                    yVar.f5755a = num.intValue();
                    yVar.f5756b = b;
                    arrayList.add(yVar);
                }
            } catch (Throwable unused) {
            }
        }
        return (C2121If.C2155y[]) arrayList.toArray(new C2121If.C2155y[0]);
    }
}
