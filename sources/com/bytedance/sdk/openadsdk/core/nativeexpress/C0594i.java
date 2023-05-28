package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.component.adexpress.p298b.C10291h;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0164u;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.i */
/* compiled from: ExpressRenderEventMonitor */
public class C0594i implements C10291h {

    /* renamed from: a */
    private C0164u f2229a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f2230b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0477n f2231c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f2232d;

    /* renamed from: e */
    private long f2233e;

    /* renamed from: f */
    private long f2234f;

    public C0594i(C0164u uVar, String str, C0477n nVar, String str2) {
        this.f2229a = uVar;
        this.f2230b = str;
        this.f2232d = str2;
        this.f2231c = nVar;
    }

    /* renamed from: a */
    public void mo1961a() {
        this.f2229a.mo460a();
        C10638l.m31235b("ExpressRenderEvent", "start render ");
    }

    /* renamed from: a */
    public void mo1964a(boolean z) {
        this.f2229a.mo468b(z ? 1 : 0);
        C10638l.m31235b("ExpressRenderEvent", "webview start request");
    }

    /* renamed from: b */
    public void mo1965b() {
        C10638l.m31235b("ExpressRenderEvent", "WebView start load");
    }

    /* renamed from: c */
    public void mo1967c() {
        C10638l.m31235b("ExpressRenderEvent", "webview render success");
        this.f2229a.mo467b();
    }

    /* renamed from: a */
    public void mo1962a(int i) {
        this.f2229a.mo461a(i);
        C0593h.m2862a(i, this.f2230b, this.f2232d, this.f2231c);
        C10638l.m31235b("ExpressRenderEvent", "WebView render fail");
    }

    /* renamed from: b */
    public void mo1966b(int i) {
        C10638l.m31235b("ExpressRenderEvent", "dynamic start render");
        this.f2233e = System.currentTimeMillis();
        if (i == 3) {
            this.f2229a.mo474c("dynamic_render2_start");
        } else {
            this.f2229a.mo474c("dynamic_render_start");
        }
    }

    /* renamed from: c */
    public void mo1968c(int i) {
        if (i == 3) {
            this.f2229a.mo476d("dynamic_sub_analysis2_start");
        } else {
            this.f2229a.mo476d("dynamic_sub_analysis_start");
        }
    }

    /* renamed from: d */
    public void mo1970d(int i) {
        if (i == 3) {
            this.f2229a.mo476d("dynamic_sub_analysis2_end");
        } else {
            this.f2229a.mo476d("dynamic_sub_analysis_end");
        }
    }

    /* renamed from: e */
    public void mo1972e(int i) {
        if (i == 3) {
            this.f2229a.mo476d("dynamic_sub_render2_start");
        } else {
            this.f2229a.mo476d("dynamic_sub_render_start");
        }
    }

    /* renamed from: f */
    public void mo1974f(int i) {
        if (i == 3) {
            this.f2229a.mo476d("dynamic_sub_render2_end");
        } else {
            this.f2229a.mo476d("dynamic_sub_render_end");
        }
    }

    /* renamed from: g */
    public void mo1976g(int i) {
        final String str;
        this.f2234f = System.currentTimeMillis();
        C10638l.m31235b("ExpressRenderEvent", "dynamic render success render type: " + i + "; ****cost time(ms): " + (this.f2234f - this.f2233e) + "****");
        if (i == 3) {
            this.f2229a.mo478e("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f2229a.mo478e("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f2229a.mo466a(true);
        C10615e.m31165b((C10618g) new C10618g("dynamic_success") {
            public void run() {
                C0136e.m625c(C0558m.m2663a(), C0594i.this.f2231c, C0594i.this.f2230b, str, (Map<String, Object>) null);
            }
        });
    }

    /* renamed from: a */
    public void mo1963a(int i, int i2, boolean z) {
        C10638l.m31235b("ExpressRenderEvent", "dynamic fail");
        if (!z) {
            this.f2229a.mo466a(true);
        }
        if (i == 3) {
            this.f2229a.mo469b(i2, "dynamic_render2_error");
        } else {
            this.f2229a.mo469b(i2, "dynamic_render_error");
        }
        C0593h.m2862a(i2, this.f2230b, this.f2232d, this.f2231c);
    }

    /* renamed from: d */
    public void mo1969d() {
        C10638l.m31235b("ExpressRenderEvent", "native render start");
        this.f2229a.mo473c();
    }

    /* renamed from: e */
    public void mo1971e() {
        C10638l.m31235b("ExpressRenderEvent", "native success");
        this.f2229a.mo466a(true);
        this.f2229a.mo487n();
        C10615e.m31165b((C10618g) new C10618g("native_success") {
            public void run() {
                C0593h.m2863a(C0594i.this.f2230b, C0594i.this.f2232d, C0594i.this.f2231c);
                C0136e.m625c(C0558m.m2663a(), C0594i.this.f2231c, C0594i.this.f2230b, "dynamic_backup_render", (Map<String, Object>) null);
            }
        });
    }

    /* renamed from: f */
    public void mo1973f() {
        C10638l.m31235b("ExpressRenderEvent", "no native render");
        this.f2229a.mo488o();
    }

    /* renamed from: g */
    public void mo1975g() {
        C10638l.m31235b("ExpressRenderEvent", "render fail");
        this.f2229a.mo489p();
    }

    /* renamed from: h */
    public void mo1977h() {
        C10638l.m31235b("ExpressRenderEvent", "render success");
        this.f2229a.mo467b();
    }

    /* renamed from: i */
    public void mo1978i() {
        this.f2229a.mo485l();
        this.f2229a.mo486m();
    }
}
