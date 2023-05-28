package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1924Cf;
import com.yandex.metrica.impl.p082ob.C2600Ud;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Sd */
public class C2520Sd implements ProtobufConverter<C2600Ud.C2601a, C1924Cf.C1926b> {

    /* renamed from: a */
    private final C2893de f6646a;

    public C2520Sd() {
        this(new C2893de());
    }

    /* renamed from: a */
    public C1924Cf.C1926b fromModel(C2600Ud.C2601a aVar) {
        C1924Cf.C1926b bVar = new C1924Cf.C1926b();
        if (!TextUtils.isEmpty(aVar.f6883a)) {
            bVar.f5180a = aVar.f6883a;
        }
        bVar.f5181b = aVar.f6884b.toString();
        bVar.f5182c = this.f6646a.fromModel(aVar.f6885c).intValue();
        return bVar;
    }

    C2520Sd(C2893de deVar) {
        this.f6646a = deVar;
    }

    /* renamed from: a */
    public C2600Ud.C2601a toModel(C1924Cf.C1926b bVar) {
        JSONObject jSONObject;
        String str = bVar.f5180a;
        String str2 = bVar.f5181b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C2600Ud.C2601a(str, jSONObject, this.f6646a.toModel(Integer.valueOf(bVar.f5182c)));
        }
        jSONObject = new JSONObject();
        return new C2600Ud.C2601a(str, jSONObject, this.f6646a.toModel(Integer.valueOf(bVar.f5182c)));
    }
}
