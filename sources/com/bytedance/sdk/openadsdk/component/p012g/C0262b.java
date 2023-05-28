package com.bytedance.sdk.openadsdk.component.p012g;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.component.p011f.C0260a;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;
import com.bytedance.sdk.openadsdk.utils.C0996u;

/* renamed from: com.bytedance.sdk.openadsdk.component.g.b */
/* compiled from: TTAppOpenVideoManager */
public class C0262b {

    /* renamed from: a */
    private Context f853a;

    /* renamed from: b */
    private FrameLayout f854b;

    /* renamed from: c */
    private C0477n f855c;

    /* renamed from: d */
    private C0261a f856d;

    public C0262b(Context context) {
        this.f853a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo654a(FrameLayout frameLayout, C0477n nVar) {
        this.f854b = frameLayout;
        this.f855c = nVar;
        this.f856d = new C0261a(this.f853a, frameLayout, nVar);
    }

    /* renamed from: a */
    public boolean mo656a() {
        String str;
        int f = C0996u.m4657f(this.f855c);
        if (Build.VERSION.SDK_INT >= 23) {
            str = C0260a.m1014a(C0558m.m2663a(), f);
        } else {
            try {
                str = C0260a.m1013a();
            } catch (Throwable unused) {
                str = "";
            }
        }
        C10188c a = C0477n.m2007a(str, this.f855c);
        a.mo62945b(this.f855c.mo1345Y());
        a.mo62937a(this.f854b.getWidth());
        a.mo62944b(this.f854b.getHeight());
        a.mo62948c(this.f855c.mo1382ac());
        a.mo62938a(0);
        a.mo62942a(true);
        return this.f856d.mo2154a(a);
    }

    /* renamed from: b */
    public boolean mo657b() {
        C0261a aVar = this.f856d;
        return (aVar == null || aVar.mo2114n() == null || !this.f856d.mo2114n().mo62869l()) ? false : true;
    }

    /* renamed from: c */
    public boolean mo658c() {
        C0261a aVar = this.f856d;
        return (aVar == null || aVar.mo2114n() == null || !this.f856d.mo2114n().mo62870m()) ? false : true;
    }

    /* renamed from: a */
    public void mo655a(C10192c.C10193a aVar) {
        C0261a aVar2 = this.f856d;
        if (aVar2 != null) {
            aVar2.mo2148a(aVar);
        }
    }

    /* renamed from: d */
    public void mo659d() {
        try {
            if (mo657b()) {
                this.f856d.mo2155b();
            }
        } catch (Throwable th) {
            C10638l.m31234b("AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: e */
    public void mo660e() {
        C0261a aVar = this.f856d;
        if (aVar != null) {
            aVar.mo2161d();
        }
    }

    /* renamed from: f */
    public void mo661f() {
        C0261a aVar = this.f856d;
        if (aVar != null) {
            this.f853a = null;
            aVar.mo2165e();
            this.f856d = null;
        }
    }

    /* renamed from: g */
    public long mo662g() {
        C0261a aVar = this.f856d;
        if (aVar != null) {
            return aVar.mo2109g();
        }
        return 0;
    }

    /* renamed from: h */
    public long mo663h() {
        C0261a aVar = this.f856d;
        if (aVar != null) {
            return aVar.mo2110h();
        }
        return 0;
    }

    /* renamed from: i */
    public long mo664i() {
        C0261a aVar = this.f856d;
        if (aVar != null) {
            return aVar.mo2112j() + this.f856d.mo2110h();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo653a(int i) {
        if (this.f856d != null) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo372a(mo662g());
            aVar.mo379c(mo664i());
            aVar.mo376b(mo663h());
            aVar.mo383e(i);
            aVar.mo385f(this.f856d.mo2111i());
            this.f856d.mo645a(aVar);
        }
    }
}
