package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.sdk.p140d.C4908b;
import com.ironsource.sdk.utils.C4984b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: a */
    private static final int f12143a = SDKUtils.generateViewId();

    /* renamed from: b */
    private static final int f12144b = SDKUtils.generateViewId();

    /* renamed from: c */
    private WebView f12145c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4845x f12146d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressBar f12147e;

    /* renamed from: f */
    private boolean f12148f;

    /* renamed from: g */
    private RelativeLayout f12149g;

    /* renamed from: h */
    private String f12150h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f12151i = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f12152j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f12153k = new Runnable() {
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f12152j));
        }
    };

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    class C4777a extends WebViewClient {
        private C4777a() {
        }

        /* synthetic */ C4777a(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f12147e.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f12147e.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m14505e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = C4984b.m14516a().mo34733b();
            if (!b.isEmpty()) {
                for (String contains : b) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f12146d.mo34446i();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f12146d != null) {
                                C4845x d = OpenUrlActivity.this.f12146d;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                d.mo34441b(C4845x.m14183b("failedToStartStoreActivity", C4845x.m14167a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        C4845x xVar;
        if (this.f12148f && (xVar = this.f12146d) != null) {
            xVar.mo34444e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f12145c.stopLoading();
        this.f12145c.clearHistory();
        try {
            this.f12145c.loadUrl(str);
        } catch (Throwable th) {
            Logger.m14505e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f12145c.canGoBack()) {
            this.f12145c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m14507i("OpenUrlActivity", "onCreate()");
        try {
            this.f12146d = (C4845x) C4908b.m14292a((Context) this).f12532a.f12194a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f12150h = extras.getString(C4845x.f12357c);
            this.f12148f = extras.getBoolean(C4845x.f12358d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f12152j = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & 4098) == 0) {
                            OpenUrlActivity.this.f12151i.removeCallbacks(OpenUrlActivity.this.f12153k);
                            OpenUrlActivity.this.f12151i.postDelayed(OpenUrlActivity.this.f12153k, 500);
                        }
                    }
                });
                runOnUiThread(this.f12153k);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f12149g = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f12145c;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f12152j && (i == 25 || i == 24)) {
            this.f12151i.postDelayed(this.f12153k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C4845x xVar = this.f12146d;
        if (xVar != null) {
            xVar.mo34438a(false, "secondary");
            if (this.f12149g != null && (viewGroup = (ViewGroup) this.f12145c.getParent()) != null) {
                if (viewGroup.findViewById(f12143a) != null) {
                    viewGroup.removeView(this.f12145c);
                }
                if (viewGroup.findViewById(f12144b) != null) {
                    viewGroup.removeView(this.f12147e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f12145c == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f12145c = webView;
            webView.setId(f12143a);
            this.f12145c.getSettings().setJavaScriptEnabled(true);
            this.f12145c.setWebViewClient(new C4777a(this, (byte) 0));
            loadUrl(this.f12150h);
        }
        if (findViewById(f12143a) == null) {
            this.f12149g.addView(this.f12145c, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f12147e == null) {
            this.f12147e = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f12147e.setId(f12144b);
        }
        if (findViewById(f12144b) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f12147e.setLayoutParams(layoutParams);
            this.f12147e.setVisibility(4);
            this.f12149g.addView(this.f12147e);
        }
        C4845x xVar = this.f12146d;
        if (xVar != null) {
            xVar.mo34438a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f12152j && z) {
            runOnUiThread(this.f12153k);
        }
    }
}
