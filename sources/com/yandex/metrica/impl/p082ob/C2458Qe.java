package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Qe */
public class C2458Qe implements C2252Kn<String> {
    /* renamed from: a */
    public C2167In mo15517a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return C2167In.m7453a(this, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return C2167In.m7453a(this, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return C2167In.m7453a(this, "key length more then 200 characters");
        }
        return C2167In.m7452a(this);
    }
}
