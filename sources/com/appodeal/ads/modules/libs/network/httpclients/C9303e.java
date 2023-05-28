package com.appodeal.ads.modules.libs.network.httpclients;

import com.appodeal.ads.modules.libs.network.HttpError;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.modules.libs.network.httpclients.e */
public interface C9303e {

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.e$a */
    public static final class C9304a implements C9303e {

        /* renamed from: a */
        public final HttpError f23536a;

        public C9304a(Map map, HttpError httpError) {
            Intrinsics.checkNotNullParameter(map, "headers");
            Intrinsics.checkNotNullParameter(httpError, "httpError");
            this.f23536a = httpError;
        }

        /* renamed from: a */
        public final HttpError mo60312a() {
            return this.f23536a;
        }
    }

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.e$b */
    public static final class C9305b implements C9303e {

        /* renamed from: a */
        public final byte[] f23537a;

        /* renamed from: b */
        public final String f23538b;

        /* renamed from: c */
        public final Map<String, List<String>> f23539c;

        public C9305b(byte[] bArr, String str, Map map) {
            Intrinsics.checkNotNullParameter(map, "headers");
            this.f23537a = bArr;
            this.f23538b = str;
            this.f23539c = map;
        }

        /* renamed from: a */
        public final String mo60313a() {
            return this.f23538b;
        }

        /* renamed from: b */
        public final byte[] mo60314b() {
            return this.f23537a;
        }

        /* renamed from: c */
        public final Map<String, List<String>> mo60315c() {
            return this.f23539c;
        }
    }
}
