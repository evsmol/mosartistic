package com.bytedance.sdk.openadsdk.p046i.p047a;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.C10625d;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.b */
/* compiled from: GifRequestResult */
public class C0831b {

    /* renamed from: a */
    int f3037a;

    /* renamed from: b */
    private byte[] f3038b = null;

    /* renamed from: c */
    private Bitmap f3039c = null;

    /* renamed from: d */
    private List<Object> f3040d = null;

    /* renamed from: e */
    private Map<String, String> f3041e = null;

    public C0831b(byte[] bArr, int i) {
        this.f3038b = bArr;
        this.f3037a = i;
    }

    public C0831b(Bitmap bitmap, int i) {
        this.f3039c = bitmap;
        this.f3037a = i;
    }

    /* renamed from: a */
    public Bitmap mo2641a() {
        return this.f3039c;
    }

    /* renamed from: b */
    public byte[] mo2642b() {
        try {
            if (this.f3038b == null) {
                this.f3038b = C10625d.m31199a(this.f3039c);
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return this.f3038b;
    }

    /* renamed from: c */
    public boolean mo2643c() {
        if (this.f3039c != null) {
            return true;
        }
        byte[] bArr = this.f3038b;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }
}
