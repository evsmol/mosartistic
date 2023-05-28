package com.bytedance.sdk.openadsdk.component.p011f;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.openadsdk.component.C0224a;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import java.io.File;

/* renamed from: com.bytedance.sdk.openadsdk.component.f.a */
/* compiled from: TTAppOpenUtils */
public class C0260a {

    /* renamed from: a */
    private static String f851a;

    /* renamed from: a */
    public static File m1012a(String str, int i) {
        return m1011a(C0558m.m2663a(), C0224a.m881a(C0558m.m2663a()).mo570a(String.valueOf(i)), str);
    }

    /* renamed from: a */
    public static String m1013a() {
        if (TextUtils.isEmpty(f851a)) {
            f851a = C10184b.m29123a().getCacheDir() + File.separator + "proxy_cache";
        }
        return f851a;
    }

    /* renamed from: b */
    public static File m1017b(String str, int i) {
        return m1011a(C0558m.m2663a(), C0224a.m881a(C0558m.m2663a()).mo586h(i), str);
    }

    /* renamed from: a */
    public static String m1014a(Context context, int i) {
        return C10627f.m31204a(context, C0934b.m4334c(), C0224a.m881a(C0558m.m2663a()).mo570a(String.valueOf(i))).getAbsolutePath();
    }

    /* renamed from: a */
    public static File m1011a(Context context, String str, String str2) {
        return C10627f.m31205a(context, C0934b.m4334c(), str, str2);
    }

    /* renamed from: a */
    public static void m1016a(File file) {
        if (file != null) {
            try {
                C10627f.m31209b(file);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1015a(Context context) {
        try {
            C0224a.m881a(context).mo571a();
        } catch (Throwable unused) {
        }
    }
}
