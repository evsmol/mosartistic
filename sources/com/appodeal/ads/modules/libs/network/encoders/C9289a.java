package com.appodeal.ads.modules.libs.network.encoders;

import android.util.Base64;
import com.appnext.base.p264b.C8849c;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.modules.libs.network.encoders.a */
public final class C9289a implements C9291c, C9292d {

    /* renamed from: a */
    public static final C9289a f23516a = new C9289a();

    /* renamed from: a */
    public final Map<String, List<String>> mo60305a() {
        return MapsKt.emptyMap();
    }

    /* renamed from: a */
    public final byte[] mo60306a(String str, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, C8849c.DATA);
        byte[] decode = Base64.decode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(data, Base64.DEFAULT)");
        return decode;
    }

    /* renamed from: a */
    public final byte[] mo60307a(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, C8849c.DATA);
        byte[] encode = Base64.encode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(data, Base64.DEFAULT)");
        return encode;
    }
}
