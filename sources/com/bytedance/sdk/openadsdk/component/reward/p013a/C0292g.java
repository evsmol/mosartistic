package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0411e;
import com.bytedance.sdk.openadsdk.core.p016b.C0413g;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.core.p026j.C0536c;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.g */
/* compiled from: VastEndCardManager */
public class C0292g {

    /* renamed from: a */
    private final Activity f973a;

    /* renamed from: b */
    private C0477n f974b;

    /* renamed from: c */
    private FrameLayout f975c;

    /* renamed from: d */
    private SSWebView f976d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f977e;

    /* renamed from: f */
    private boolean f978f;

    /* renamed from: g */
    private C0413g f979g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0278e f980h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f981i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f982j;

    public C0292g(Activity activity) {
        this.f973a = activity;
    }

    /* renamed from: a */
    public void mo823a(C0477n nVar) {
        C0536c c;
        Activity activity = this.f973a;
        if (activity != null) {
            this.f974b = nVar;
            this.f975c = (FrameLayout) activity.findViewById(C10647t.m31283e(activity, "tt_reward_full_endcard_vast"));
            if (this.f974b.mo1403ax() != null && (c = this.f974b.mo1403ax().mo1734c()) != null) {
                if (c.mo1778e() != null) {
                    this.f978f = true;
                    Activity activity2 = this.f973a;
                    this.f977e = (ImageView) activity2.findViewById(C10647t.m31283e(activity2, "tt_reward_full_endcard_vast_image"));
                    m1255a(c.mo1774b(), c.mo1776c(), this.f974b.mo1403ax());
                    C0750a.m3821a(c.mo1778e()).mo64107a(C10571t.BITMAP).mo64102a((C10565n) new C10565n<Bitmap>() {
                        /* renamed from: a */
                        public void mo257a(C10561j<Bitmap> jVar) {
                            if (C0292g.this.f977e != null && jVar != null) {
                                Bitmap b = jVar.mo64116b();
                                if (b == null) {
                                    C0292g.this.m1254a(-1);
                                    return;
                                }
                                C0292g.this.f977e.setImageBitmap(b);
                                boolean unused = C0292g.this.f982j = true;
                            }
                        }

                        /* renamed from: a */
                        public void mo256a(int i, String str, Throwable th) {
                            if (C0292g.this.f977e != null) {
                                C0292g.this.f977e.setVisibility(8);
                            }
                            C0292g.this.m1254a(-2);
                        }
                    });
                    return;
                }
                Activity activity3 = this.f973a;
                this.f976d = (SSWebView) activity3.findViewById(C10647t.m31283e(activity3, "tt_reward_full_endcard_vast_web"));
                m1260b();
                String d = c.mo1777d();
                if (d != null) {
                    this.f978f = true;
                    if (d.startsWith("http")) {
                        this.f976d.mo64297a(d);
                        return;
                    }
                    this.f976d.setDefaultTextEncodingName("UTF -8");
                    this.f976d.mo64299a((String) null, d, "text/html", "UTF-8", (String) null);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1254a(int i) {
        m1256a(i, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1256a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", i);
            if (str != null) {
                jSONObject.put("url", str);
            }
            String str2 = "";
            if (this.f974b.mo1403ax() != null) {
                str2 = this.f974b.mo1403ax().mo1746k();
            }
            C0136e.m622b(C0558m.m2663a(), this.f974b, str2, "load_vast_endcard_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m1260b() {
        this.f976d.setWebViewClient(new SSWebView.C10655a() {
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && !C0292g.this.f981i && webResourceError != null) {
                    String str = null;
                    if (webResourceRequest.getUrl() != null) {
                        str = webResourceRequest.getUrl().toString();
                    }
                    C0292g.this.m1256a(webResourceError.getErrorCode(), str);
                    boolean unused = C0292g.this.f981i = true;
                }
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (Build.VERSION.SDK_INT < 23 && !C0292g.this.f981i) {
                    C0292g.this.m1256a(i, str2);
                    boolean unused = C0292g.this.f981i = true;
                }
            }
        });
    }

    /* renamed from: a */
    private void m1255a(int i, int i2, final C0518a aVar) {
        Activity activity;
        if (i != 0 && i2 != 0 && this.f977e != null && (activity = this.f973a) != null) {
            int c = C1002v.m4740c((Context) activity);
            int d = C1002v.m4744d((Context) this.f973a);
            float f = ((float) i) / ((float) i2);
            float f2 = (float) c;
            if (f <= f2 / ((float) d)) {
                c = (int) Math.ceil((double) (f2 * f));
            } else {
                d = (int) Math.ceil((double) (f2 / f));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f977e.getLayoutParams();
            layoutParams.width = c;
            layoutParams.height = d;
            this.f977e.setLayoutParams(layoutParams);
            C02953 r4 = new C0413g("VAST_END_CARD", aVar) {
                /* renamed from: a */
                public void mo827a() {
                    if (aVar.mo1734c() != null) {
                        aVar.mo1734c().mo1772a(C0292g.this.f980h != null ? C0292g.this.f980h.mo762s() : -1);
                    }
                }
            };
            this.f979g = r4;
            this.f977e.setOnClickListener(r4);
            this.f977e.setOnTouchListener(this.f979g);
        }
    }

    /* renamed from: a */
    public void mo821a() {
        C1002v.m4716a((View) this.f975c, 8);
    }

    /* renamed from: a */
    public boolean mo824a(C0278e eVar) {
        C0536c c;
        if (!this.f978f) {
            return false;
        }
        this.f980h = eVar;
        ImageView imageView = this.f977e;
        if (imageView == null || !this.f982j) {
            SSWebView sSWebView = this.f976d;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
            }
        } else {
            imageView.setVisibility(0);
        }
        C1002v.m4716a((View) this.f975c, 0);
        C0477n nVar = this.f974b;
        if (nVar == null || nVar.mo1403ax() == null || (c = this.f974b.mo1403ax().mo1734c()) == null) {
            return true;
        }
        C0278e eVar2 = this.f980h;
        c.mo1775b(eVar2 != null ? eVar2.mo762s() : -1);
        return true;
    }

    /* renamed from: a */
    public void mo822a(C0411e eVar) {
        C0413g gVar = this.f979g;
        if (gVar != null) {
            gVar.mo1122a(eVar);
        }
    }
}
