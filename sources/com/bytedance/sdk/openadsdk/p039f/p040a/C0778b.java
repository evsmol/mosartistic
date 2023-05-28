package com.bytedance.sdk.openadsdk.p039f.p040a;

import com.bytedance.sdk.component.p293a.C10221d;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0709w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.b */
/* compiled from: DoInterstitialWebViewCloseMethod */
public class C0778b extends C10221d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C0709w> f2947a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2556d() {
    }

    /* renamed from: a */
    public static void m3913a(C10245r rVar, final C0709w wVar) {
        rVar.mo63071a("interstitial_webview_close", (C10221d.C10223b) new C10221d.C10223b() {
            /* renamed from: a */
            public C10221d mo2557a() {
                return new C0778b(wVar);
            }
        });
    }

    public C0778b(C0709w wVar) {
        this.f2947a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2554a(JSONObject jSONObject, C10225f fVar) throws Exception {
        if (C0503h.m2281d().mo1618s()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[JSB-REQ] version: 3 data=");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            C10638l.m31235b("DoInterstitialWebViewCloseMethod", sb.toString());
        }
        C10638l.m31242e("DoInterstitialWebViewCloseMethod", "DoInterstitialWebViewCloseMethod invoke ");
        C0709w wVar = (C0709w) this.f2947a.get();
        if (wVar == null) {
            C10638l.m31242e("DoInterstitialWebViewCloseMethod", "invoke error");
            mo63031c();
            return;
        }
        wVar.mo2387g();
    }
}
