package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.p046i.C0826a;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0827a;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0831b;

/* renamed from: com.bytedance.sdk.openadsdk.utils.g */
/* compiled from: ImageBytesHelper */
public class C0977g {

    /* renamed from: com.bytedance.sdk.openadsdk.utils.g$a */
    /* compiled from: ImageBytesHelper */
    public interface C0979a {
        /* renamed from: a */
        void mo29a();

        /* renamed from: a */
        void mo30a(C0831b bVar);

        /* renamed from: b */
        void mo31b();
    }

    /* renamed from: a */
    public static void m4536a(C0826a aVar, int i, int i2, final C0979a aVar2, String str) {
        C10638l.m31242e("splashLoadAd", " getImageBytes url " + aVar);
        C0835d.m4093a().mo2661c().mo2637a(aVar, new C0827a.C0830b() {
            /* renamed from: a */
            public void mo2640a(String str, C0831b bVar) {
                C0979a aVar;
                if (!bVar.mo2643c() || (aVar = aVar2) == null) {
                    C0979a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.mo29a();
                        return;
                    }
                    return;
                }
                aVar.mo30a(bVar);
            }

            /* renamed from: a */
            public void mo2639a(int i, String str, Throwable th) {
                C0979a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo29a();
                }
            }

            /* renamed from: a */
            public void mo2638a() {
                C0979a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo31b();
                }
            }
        }, i, i2, str);
    }

    /* renamed from: a */
    public static Drawable m4535a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
