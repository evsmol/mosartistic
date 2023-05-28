package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C6236c1;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
import kotlin.Unit;
import kotlin.text.Regex;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.l0 */
public final class C6369l0 extends C6236c1 {

    /* renamed from: F */
    private final int f13661F;

    /* renamed from: G */
    private ImageView f13662G;

    /* renamed from: H */
    private String f13663H = "";
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f13664I = "";

    /* renamed from: J */
    private int f13665J;

    /* renamed from: K */
    private int f13666K;

    /* renamed from: L */
    private boolean f13667L;

    /* renamed from: M */
    private boolean f13668M;

    /* renamed from: com.adcolony.sdk.l0$a */
    private final class C6370a extends C6236c1.C6239c {
        public C6370a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6375f().mo50840a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$b */
    private final class C6371b extends C6236c1.C6240d {
        public C6371b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6375f().mo50840a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$c */
    private final class C6372c extends C6236c1.C6241e {
        public C6372c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6375f().mo50840a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$d */
    private final class C6373d extends C6236c1.C6242f {
        public C6373d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6375f().mo50840a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$e */
    private final class C6374e extends C6236c1.C6243g {
        public C6374e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6375f().mo50840a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$f */
    private final class C6375f {
        public C6375f() {
        }

        /* renamed from: a */
        public final void mo50840a() {
            if (!C6369l0.this.getModuleInitialized()) {
                float s = C6185a.m14887b().mo50803n().mo50956s();
                C6294f1 info = C6369l0.this.getInfo();
                C6369l0 l0Var = C6369l0.this;
                C6235c0.m15077b(info, "app_orientation", C6509z0.m15960d(C6509z0.m15967f()));
                C6235c0.m15077b(info, "x", C6509z0.m15924a((View) l0Var));
                C6235c0.m15077b(info, "y", C6509z0.m15943b((View) l0Var));
                C6235c0.m15077b(info, IabUtils.KEY_WIDTH, (int) (((float) l0Var.getCurrentWidth()) / s));
                C6235c0.m15077b(info, IabUtils.KEY_HEIGHT, (int) (((float) l0Var.getCurrentHeight()) / s));
                C6235c0.m15070a(info, "ad_session_id", l0Var.getAdSessionId());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l0$g */
    static final class C6376g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6369l0 f13675a;

        C6376g(C6369l0 l0Var) {
            this.f13675a = l0Var;
        }

        public final void onClick(View view) {
            C6509z0.m15934a(new Intent("android.intent.action.VIEW", Uri.parse(this.f13675a.f13664I)));
            C6185a.m14887b().mo50761A().mo51082c(this.f13675a.getAdSessionId());
        }
    }

    public C6369l0(Context context, int i, C6312h0 h0Var, int i2) {
        super(context, i, h0Var);
        this.f13661F = i2;
    }

    /* renamed from: q */
    private final void m15500q() {
        Context a = C6185a.m14880a();
        if (a != null && getParentContainer() != null && !this.f13668M) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(a);
            imageView.setImageURI(Uri.fromFile(new File(this.f13663H)));
            imageView.setBackground(gradientDrawable);
            imageView.setOnClickListener(new C6376g(this));
            Unit unit = Unit.INSTANCE;
            this.f13662G = imageView;
            m15501r();
            addView(this.f13662G);
        }
    }

    /* renamed from: r */
    private final void m15501r() {
        ImageView imageView = this.f13662G;
        if (imageView != null) {
            Rect w = C6185a.m14887b().mo50803n().mo50960w();
            int currentX = this.f13667L ? getCurrentX() + getCurrentWidth() : w.width();
            int currentY = this.f13667L ? getCurrentY() + getCurrentHeight() : w.height();
            float s = C6185a.m14887b().mo50803n().mo50956s();
            int i = (int) (((float) this.f13665J) * s);
            int i2 = (int) (((float) this.f13666K) * s);
            imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, currentX - i, currentY - i2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ void mo50467e() {
        super.mo50467e();
        boolean z = true;
        if (this.f13663H.length() > 0) {
            if (this.f13664I.length() <= 0) {
                z = false;
            }
            if (z) {
                m15500q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ int getAdc3ModuleId() {
        return this.f13661F;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C6371b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C6372c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C6373d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C6374e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C6370a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo50496k() {
        if (getMraidFilepath().length() > 0) {
            Regex regex = new Regex("script\\s*src\\s*=\\s*\"mraid.js\"");
            setMUrl(mo50563a(regex.replaceFirst(getMUrl(), "script src=\"file://" + getMraidFilepath() + '\"'), C6235c0.m15087h(C6235c0.m15085f(getInfo(), "device_info"), "iab_filepath")));
        }
    }

    /* renamed from: p */
    public final void mo50839p() {
        C6223c parentContainer;
        ImageView imageView = this.f13662G;
        if (imageView != null && (parentContainer = getParentContainer()) != null) {
            parentContainer.mo50526a((View) imageView, FriendlyObstructionPurpose.OTHER);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C6312h0 h0Var) {
        super.setBounds(h0Var);
        m15501r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo50463a(C6312h0 h0Var, int i, C6223c cVar) {
        C6294f1 a = h0Var.mo50732a();
        this.f13663H = C6235c0.m15087h(a, "ad_choices_filepath");
        this.f13664I = C6235c0.m15087h(a, "ad_choices_url");
        this.f13665J = C6235c0.m15083d(a, "ad_choices_width");
        this.f13666K = C6235c0.m15083d(a, "ad_choices_height");
        this.f13667L = C6235c0.m15076b(a, "ad_choices_snap_to_webview");
        this.f13668M = C6235c0.m15076b(a, "disable_ad_choices");
        super.mo50463a(h0Var, i, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo50465a(C6294f1 f1Var, String str) {
        if (super.mo50465a(f1Var, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }
}
