package com.appodeal.ads.modules.common.internal.ext;

import com.applovin.exoplayer2.common.base.Ascii;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38198d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo38199d2 = {"toHexString", "", "", "apd_internal"}, mo38200k = 2, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public final class ByteArrayExtKt {
    public static final String toHexString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        char[] cArr = new char[(bArr.length * 2)];
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = charArray[b >>> 4];
            cArr[i3 + 1] = charArray[b & Ascii.f15551SI];
            i = i2;
        }
        return new String(cArr);
    }
}
