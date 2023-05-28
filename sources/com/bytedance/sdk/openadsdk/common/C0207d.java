package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.common.d */
/* compiled from: TTBottomNewStyleManager */
public class C0207d {

    /* renamed from: a */
    private final LinearLayout f704a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SSWebView f705b;

    /* renamed from: c */
    private final C0477n f706c;

    /* renamed from: d */
    private final String f707d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f708e;

    /* renamed from: f */
    private ImageView f709f;

    /* renamed from: g */
    private ImageView f710g;

    /* renamed from: h */
    private ImageView f711h;

    /* renamed from: i */
    private ImageView f712i;

    public C0207d(Context context, LinearLayout linearLayout, SSWebView sSWebView, C0477n nVar, String str) {
        this.f708e = context;
        this.f704a = linearLayout;
        this.f705b = sSWebView;
        this.f706c = nVar;
        this.f707d = str;
        m857c();
    }

    /* renamed from: c */
    private void m857c() {
        this.f709f = (ImageView) this.f704a.findViewById(C10647t.m31283e(this.f708e, "tt_bottom_bar_back"));
        this.f710g = (ImageView) this.f704a.findViewById(C10647t.m31283e(this.f708e, "tt_bottom_bar_forward"));
        this.f711h = (ImageView) this.f704a.findViewById(C10647t.m31283e(this.f708e, "tt_bottom_bar_refresh"));
        this.f712i = (ImageView) this.f704a.findViewById(C10647t.m31283e(this.f708e, "tt_bottom_bar_go_to_browser"));
        this.f709f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0207d.this.f705b != null && C0207d.this.f705b.mo64308e()) {
                    C0207d.this.m853a("backward");
                    C0207d.this.f705b.mo64309f();
                }
            }
        });
        this.f710g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0207d.this.f705b != null && C0207d.this.f705b.mo64310g()) {
                    C0207d.this.m853a("forward");
                    C0207d.this.f705b.mo64319h();
                }
            }
        });
        this.f711h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0207d.this.f705b != null) {
                    C0207d.this.m856b("refresh");
                    C0207d.this.f705b.mo64306d();
                }
            }
        });
        this.f712i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0207d.this.f705b != null) {
                    C0207d.this.m856b("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = C0207d.this.f705b.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        C10622b.m31190a(C0207d.this.f708e, intent, (C10622b.C10623a) null);
                    }
                }
            }
        });
        this.f704a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.f709f.setClickable(false);
        this.f710g.setClickable(false);
        this.f709f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f710g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    /* renamed from: a */
    public void mo540a(WebView webView) {
        try {
            if (this.f709f != null) {
                if (webView.canGoBack()) {
                    this.f709f.setClickable(true);
                    this.f709f.clearColorFilter();
                } else {
                    this.f709f.setClickable(false);
                    this.f709f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f710g == null) {
                return;
            }
            if (webView.canGoForward()) {
                this.f710g.setClickable(true);
                this.f710g.clearColorFilter();
                return;
            }
            this.f710g.setClickable(false);
            this.f710g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo539a() {
        if (this.f704a.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.f704a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        }
    }

    /* renamed from: b */
    public void mo541b() {
        if (this.f704a.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.f704a, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m853a(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f705b.getWebView() == null || (copyBackForwardList = this.f705b.getWebView().copyBackForwardList()) == null)) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f705b.getUrl();
                }
                String str2 = "";
                if (str.equals("backward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i = 1;
                if (str.equals("forward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", str2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        C0136e.m626c(C0558m.m2663a(), this.f706c, this.f707d, str, jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m856b(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f705b.getWebView() == null || (copyBackForwardList = this.f705b.getWebView().copyBackForwardList()) == null)) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f705b.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        C0136e.m626c(C0558m.m2663a(), this.f706c, this.f707d, str, jSONObject);
    }
}
