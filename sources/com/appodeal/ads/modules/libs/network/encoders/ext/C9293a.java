package com.appodeal.ads.modules.libs.network.encoders.ext;

import com.appodeal.ads.modules.libs.network.encoders.C9291c;
import com.appodeal.ads.modules.libs.network.encoders.C9292d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.modules.libs.network.encoders.ext.a */
public final class C9293a {
    /* renamed from: a */
    public static final byte[] m27474a(byte[] bArr, String str, List<? extends C9291c> list) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(list, "decoders");
        for (C9291c a : list) {
            bArr = a.mo60306a(str, bArr);
        }
        return bArr;
    }

    /* renamed from: a */
    public static final byte[] m27475a(byte[] bArr, List<? extends C9292d> list) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(list, "encoders");
        for (C9292d a : list) {
            bArr = a.mo60307a(bArr);
        }
        return bArr;
    }
}
