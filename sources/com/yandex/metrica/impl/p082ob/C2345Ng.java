package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.yandex.metrica.networktasks.api.IParamsAppender;

/* renamed from: com.yandex.metrica.impl.ob.Ng */
public class C2345Ng implements IParamsAppender<C3729zb> {
    /* renamed from: a */
    public void appendParams(Uri.Builder builder, C3729zb zbVar) {
        m8027a(builder, "adv_id", "limit_ad_tracking", zbVar.mo18453a().f9198a);
        m8027a(builder, "oaid", "limit_oaid_tracking", zbVar.mo18454b().f9198a);
        m8027a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", zbVar.mo18455c().f9198a);
    }

    /* renamed from: a */
    private void m8027a(Uri.Builder builder, String str, String str2, C3504tb tbVar) {
        String str3 = "";
        if (tbVar == null) {
            builder.appendQueryParameter(str, str3);
            builder.appendQueryParameter(str2, str3);
            return;
        }
        String str4 = tbVar.f9142b;
        if (str4 == null) {
            str4 = str3;
        }
        builder.appendQueryParameter(str, str4);
        Boolean bool = tbVar.f9143c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : BuildConfig.ADAPTER_VERSION;
        }
        builder.appendQueryParameter(str2, str3);
    }
}
