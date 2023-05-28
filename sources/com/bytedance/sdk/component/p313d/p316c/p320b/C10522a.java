package com.bytedance.sdk.component.p313d.p316c.p320b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* renamed from: com.bytedance.sdk.component.d.c.b.a */
/* compiled from: DefaultDecoder */
public class C10522a {

    /* renamed from: a */
    public static final ImageView.ScaleType f26235a = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: b */
    public static final Bitmap.Config f26236b = Bitmap.Config.ARGB_4444;

    /* renamed from: c */
    private final Bitmap.Config f26237c;

    /* renamed from: d */
    private final int f26238d;

    /* renamed from: e */
    private final int f26239e;

    /* renamed from: f */
    private final ImageView.ScaleType f26240f;

    public C10522a(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config) {
        this.f26237c = config;
        this.f26238d = i;
        this.f26239e = i2;
        this.f26240f = scaleType;
    }

    /* renamed from: a */
    static int m30777a(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    /* renamed from: a */
    private static int m30778a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = (double) i2;
            return ((double) i) * d < d2 ? (int) (d2 / d) : i;
        }
        double d3 = (double) i2;
        return ((double) i) * d > d3 ? (int) (d3 / d) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a1657027613264dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public Bitmap mo64071a(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f26238d == 0 && this.f26239e == 0) {
            options.inPreferredConfig = this.f26237c;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int a = m30778a(this.f26238d, this.f26239e, i, i2, this.f26240f);
        int a2 = m30778a(this.f26239e, this.f26238d, i2, i, this.f26240f);
        options.inJustDecodeBounds = false;
        options.inSampleSize = m30777a(i, i2, a, a2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return decodeByteArray;
        }
        if (decodeByteArray.getWidth() <= a && decodeByteArray.getHeight() <= a2) {
            return decodeByteArray;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a, a2, true);
        if (createScaledBitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        return createScaledBitmap;
    }
}
