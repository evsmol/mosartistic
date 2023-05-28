package com.com.bytedance.overseas.sdk.p057b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C0434c;
import com.bytedance.sdk.openadsdk.core.C0558m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.com.bytedance.overseas.sdk.b.a */
/* compiled from: AdvertisingIdHelper */
public class C1010a {

    /* renamed from: c */
    private static volatile C1010a f3364c;

    /* renamed from: a */
    private String f3365a = "";

    /* renamed from: b */
    private final ExecutorService f3366b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static C1010a m4777a() {
        if (f3364c == null) {
            synchronized (C1010a.class) {
                if (f3364c == null) {
                    f3364c = new C1010a();
                }
            }
        }
        return f3364c;
    }

    private C1010a() {
    }

    /* renamed from: b */
    public String mo2932b() {
        if (!C0558m.m2673h().mo1715p("gaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f3365a)) {
            return this.f3365a;
        }
        String b = C0434c.m1779a(C0558m.m2663a()).mo1180b("gaid", "");
        this.f3365a = b;
        return b;
    }

    /* renamed from: a */
    public static void m4778a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0434c.m1779a(C0558m.m2663a()).mo1176a("gaid", str);
        }
    }

    /* renamed from: b */
    public void mo2933b(String str) {
        this.f3365a = str;
    }
}
