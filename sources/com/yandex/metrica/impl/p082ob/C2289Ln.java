package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.Ln */
public class C2289Ln implements C2252Kn<String> {
    /* renamed from: a */
    public C2167In mo15517a(Object obj) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return C2167In.m7453a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return C2167In.m7452a(this);
        } catch (Throwable unused) {
            return C2167In.m7453a(this, "Invalid ApiKey=" + str + ". " + "Please, read official documentation how to obtain one:" + " " + "https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
    }
}
