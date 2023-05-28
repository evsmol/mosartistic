package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.common.c */
/* compiled from: LandingPageNewStyleManager */
public class C0206c {

    /* renamed from: a */
    private C0477n f696a;

    /* renamed from: b */
    private RelativeLayout f697b;

    /* renamed from: c */
    private final Context f698c;

    /* renamed from: d */
    private SSWebView f699d;

    /* renamed from: e */
    private ImageView f700e;

    /* renamed from: f */
    private final String f701f;

    /* renamed from: g */
    private C0217f f702g;

    /* renamed from: h */
    private C0207d f703h;

    public C0206c(Context context, C0477n nVar, String str) {
        this.f698c = context;
        this.f696a = nVar;
        this.f701f = str;
        m844f();
    }

    /* renamed from: f */
    private void m844f() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f698c).inflate(C10647t.m31284f(this.f698c, "tt_activity_endcard_landingpage_newstyle"), (ViewGroup) null, false);
        this.f697b = relativeLayout;
        this.f699d = (SSWebView) relativeLayout.findViewById(C10647t.m31283e(this.f698c, "tt_browser_webview"));
        C0217f fVar = new C0217f(this.f698c, (RelativeLayout) this.f697b.findViewById(C10647t.m31283e(this.f698c, "tt_title_bar")), this.f696a);
        this.f702g = fVar;
        this.f700e = fVar.mo556c();
        this.f703h = new C0207d(this.f698c, (LinearLayout) this.f697b.findViewById(C10647t.m31283e(this.f698c, "tt_bottom_bar")), this.f699d, this.f696a, this.f701f);
    }

    /* renamed from: a */
    public void mo533a() {
        C0217f fVar = this.f702g;
        if (fVar != null) {
            fVar.mo553a();
        }
        C0207d dVar = this.f703h;
        if (dVar != null) {
            dVar.mo539a();
        }
    }

    /* renamed from: b */
    public void mo535b() {
        C0217f fVar = this.f702g;
        if (fVar != null) {
            fVar.mo555b();
        }
        C0207d dVar = this.f703h;
        if (dVar != null) {
            dVar.mo541b();
        }
    }

    /* renamed from: c */
    public ImageView mo536c() {
        return this.f700e;
    }

    /* renamed from: d */
    public SSWebView mo537d() {
        return this.f699d;
    }

    /* renamed from: e */
    public View mo538e() {
        return this.f697b;
    }

    /* renamed from: a */
    public void mo534a(WebView webView, int i) {
        C0217f fVar = this.f702g;
        if (fVar != null) {
            fVar.mo554a(webView, i);
        }
        C0207d dVar = this.f703h;
        if (dVar != null) {
            dVar.mo540a(webView);
        }
    }
}
