package com.yandex.metrica.networktasks.api;

import android.text.TextUtils;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import com.yandex.metrica.networktasks.impl.C3760a;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.networktasks.api.a */
class C3756a {
    C3756a() {
    }

    /* renamed from: a */
    public Response mo18591a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder withMethod = new Request.Builder(str2).withMethod("GET");
        if (!TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        NetworkClient.Builder withSslSocketFactory = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i = C3760a.f9708a;
        return withSslSocketFactory.withConnectTimeout(i).withReadTimeout(i).build().newCall(withMethod.build()).execute();
    }
}
