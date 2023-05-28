package com.appodeal.ads.modules.libs.network.httpclients;

import com.appodeal.ads.modules.libs.network.HttpClient;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.modules.libs.network.httpclients.c */
public final class C9301c {

    /* renamed from: a */
    public final HttpClient.Method f23532a;

    /* renamed from: b */
    public final String f23533b;

    /* renamed from: c */
    public final byte[] f23534c;

    /* renamed from: d */
    public final Map<String, List<String>> f23535d;

    public C9301c(HttpClient.Method method, String str, byte[] bArr, Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(map, "headers");
        this.f23532a = method;
        this.f23533b = str;
        this.f23534c = bArr;
        this.f23535d = map;
    }

    /* renamed from: a */
    public final byte[] mo60308a() {
        return this.f23534c;
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo60309b() {
        return this.f23535d;
    }

    /* renamed from: c */
    public final HttpClient.Method mo60310c() {
        return this.f23532a;
    }

    /* renamed from: d */
    public final String mo60311d() {
        return this.f23533b;
    }
}
