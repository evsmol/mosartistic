package com.bytedance.sdk.component.p313d.p316c.p321c;

import android.graphics.BitmapFactory;

/* renamed from: com.bytedance.sdk.component.d.c.c.a */
/* compiled from: FileUtil */
public class C10530a {
    /* renamed from: a */
    public static boolean m30850a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m30851b(byte[] bArr) {
        return bArr != null && bArr.length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }
}
