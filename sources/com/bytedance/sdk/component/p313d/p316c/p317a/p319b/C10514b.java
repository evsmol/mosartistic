package com.bytedance.sdk.component.p313d.p316c.p317a.p319b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.sdk.component.p313d.C10567p;
import com.bytedance.sdk.component.p313d.p316c.p317a.C10520c;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.b */
/* compiled from: LruCountBitmapCache */
public class C10514b implements C10567p {

    /* renamed from: a */
    private int f26214a;

    /* renamed from: b */
    private int f26215b;

    /* renamed from: c */
    private int f26216c;

    /* renamed from: d */
    private C10520c<String, Bitmap> f26217d;

    public C10514b(int i, int i2) {
        this.f26216c = i;
        this.f26214a = i2;
        this.f26217d = new C10520c<String, Bitmap>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo64054b(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return C10514b.m30741a(bitmap);
            }
        };
    }

    /* renamed from: a */
    public boolean mo63992a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f26217d.mo64063a(str, bitmap);
        return true;
    }

    /* renamed from: a */
    public Bitmap mo63991a(String str) {
        return this.f26217d.mo64062a(str);
    }

    /* renamed from: b */
    public boolean mo63993b(String str) {
        return this.f26217d.mo64062a(str) != null;
    }

    /* renamed from: a */
    public static int m30741a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
