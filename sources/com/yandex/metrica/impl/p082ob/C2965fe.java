package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1924Cf;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fe */
public class C2965fe implements ProtobufConverter<C2923ee, C1924Cf.C1925a> {

    /* renamed from: a */
    private final C2893de f7859a = new C2893de();

    /* renamed from: a */
    public C1924Cf.C1925a fromModel(C2923ee eeVar) {
        C1924Cf.C1925a aVar = new C1924Cf.C1925a();
        if (!TextUtils.isEmpty(eeVar.f7751a)) {
            aVar.f5174a = eeVar.f7751a;
        }
        aVar.f5175b = eeVar.f7752b.toString();
        aVar.f5176c = eeVar.f7753c;
        aVar.f5177d = eeVar.f7754d;
        aVar.f5178e = this.f7859a.fromModel(eeVar.f7755e).intValue();
        return aVar;
    }

    /* renamed from: a */
    public C2923ee toModel(C1924Cf.C1925a aVar) {
        JSONObject jSONObject;
        String str = aVar.f5174a;
        String str2 = aVar.f5175b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C2923ee(str, jSONObject, aVar.f5176c, aVar.f5177d, this.f7859a.toModel(Integer.valueOf(aVar.f5178e)));
        }
        jSONObject = new JSONObject();
        return new C2923ee(str, jSONObject, aVar.f5176c, aVar.f5177d, this.f7859a.toModel(Integer.valueOf(aVar.f5178e)));
    }
}
