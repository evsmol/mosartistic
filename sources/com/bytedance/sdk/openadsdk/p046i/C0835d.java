package com.bytedance.sdk.openadsdk.p046i;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p307b.p308a.C10468d;
import com.bytedance.sdk.component.p323e.C10572a;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0832c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.i.d */
/* compiled from: TTNetClient */
public class C0835d {

    /* renamed from: a */
    private static volatile C0835d f3048a;

    /* renamed from: b */
    private Context f3049b;

    /* renamed from: c */
    private final C10572a f3050c;

    /* renamed from: d */
    private C0832c f3051d;

    /* renamed from: a */
    public static C0835d m4093a() {
        if (f3048a == null) {
            synchronized (C0835d.class) {
                if (f3048a == null) {
                    f3048a = new C0835d(C0558m.m2663a());
                }
            }
        }
        return f3048a;
    }

    private C0835d(Context context) {
        this.f3049b = context == null ? C0558m.m2663a() : context.getApplicationContext();
        C10572a a = new C10572a.C10574a().mo64154a(10000, TimeUnit.MILLISECONDS).mo64157b(10000, TimeUnit.MILLISECONDS).mo64158c(10000, TimeUnit.MILLISECONDS).mo64155a(true).mo64156a();
        this.f3050c = a;
        C10468d a2 = a.mo64153e().mo63869a();
        if (a2 != null) {
            a2.mo63871a(32);
        }
    }

    /* renamed from: b */
    public C10572a mo2660b() {
        return this.f3050c;
    }

    /* renamed from: c */
    public C0832c mo2661c() {
        m4094d();
        return this.f3051d;
    }

    /* renamed from: a */
    public void mo2659a(String str, ImageView imageView) {
        C0750a.m3821a(str).mo64101a(imageView);
    }

    /* renamed from: a */
    public void mo2658a(C0463k kVar, ImageView imageView) {
        if (kVar != null && !TextUtils.isEmpty(kVar.mo1281a()) && imageView != null) {
            C0750a.m3820a(kVar).mo64101a(imageView);
        }
    }

    /* renamed from: d */
    private void m4094d() {
        if (this.f3051d == null) {
            this.f3051d = new C0832c();
        }
    }
}
