package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10649v;
import com.bytedance.sdk.component.widget.p330a.C10658a;
import com.bytedance.sdk.component.widget.p331b.C10660a;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

public class SSWebView extends FrameLayout {

    /* renamed from: a */
    private C10660a f26549a;

    /* renamed from: b */
    private String f26550b;

    /* renamed from: c */
    private JSONObject f26551c;

    /* renamed from: d */
    private boolean f26552d;

    /* renamed from: e */
    private float f26553e;

    /* renamed from: f */
    private float f26554f;

    /* renamed from: g */
    private long f26555g;

    /* renamed from: h */
    private long f26556h;

    /* renamed from: i */
    private long f26557i;

    /* renamed from: j */
    private boolean f26558j;

    /* renamed from: k */
    private WebView f26559k;

    /* renamed from: l */
    private float f26560l;

    /* renamed from: m */
    private float f26561m;

    /* renamed from: n */
    private C10656b f26562n;

    /* renamed from: o */
    private C10649v f26563o;

    /* renamed from: p */
    private AttributeSet f26564p;

    /* renamed from: q */
    private Context f26565q;

    /* renamed from: r */
    private C10657c f26566r;

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$b */
    public interface C10656b {
    }

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$c */
    public interface C10657c {
        /* renamed from: a */
        void mo64366a(boolean z);
    }

    public SSWebView(Context context) {
        super(m31327a(context));
        this.f26553e = 0.0f;
        this.f26554f = 0.0f;
        this.f26555g = 0;
        this.f26556h = 0;
        this.f26557i = 0;
        this.f26558j = false;
        this.f26560l = 20.0f;
        this.f26561m = 50.0f;
        try {
            this.f26559k = new WebView(m31327a(context));
            mo64302b();
        } catch (Throwable unused) {
        }
        m31329b(m31327a(context));
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(m31327a(context), attributeSet);
        this.f26553e = 0.0f;
        this.f26554f = 0.0f;
        this.f26555g = 0;
        this.f26556h = 0;
        this.f26557i = 0;
        boolean z = false;
        this.f26558j = false;
        this.f26560l = 20.0f;
        this.f26561m = 50.0f;
        try {
            if (C10658a.m31358a().mo64368b() != null && C10658a.m31358a().mo64368b().mo1831a()) {
                int h = C10647t.m31286h(context, "tt_delay_init");
                int i = 0;
                boolean z2 = false;
                while (i < attributeSet.getAttributeCount()) {
                    try {
                        if (attributeSet.getAttributeNameResource(i) == h) {
                            z2 = attributeSet.getAttributeBooleanValue(i, false);
                        }
                        i++;
                    } catch (Throwable unused) {
                    }
                }
                z = z2;
            }
        } catch (Throwable unused2) {
        }
        this.f26565q = context;
        if (!z) {
            this.f26564p = attributeSet;
            mo64295a();
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(m31327a(context), attributeSet, i);
        this.f26553e = 0.0f;
        this.f26554f = 0.0f;
        this.f26555g = 0;
        this.f26556h = 0;
        this.f26557i = 0;
        this.f26558j = false;
        this.f26560l = 20.0f;
        this.f26561m = 50.0f;
        try {
            this.f26559k = new WebView(m31327a(context), attributeSet, i);
            mo64302b();
        } catch (Throwable unused) {
        }
        m31329b(m31327a(context));
    }

    /* renamed from: a */
    private static Context m31327a(Context context) {
        return (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    /* renamed from: a */
    private void m31328a(MotionEvent motionEvent) {
        if (this.f26552d && this.f26549a != null) {
            if ((this.f26550b != null || this.f26551c != null) && motionEvent != null) {
                try {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f26553e = motionEvent.getRawX();
                        this.f26554f = motionEvent.getRawY();
                        this.f26555g = System.currentTimeMillis();
                        this.f26551c = new JSONObject();
                        if (this.f26559k != null) {
                            this.f26559k.setTag(C10647t.m31283e(getContext(), "tt_id_click_begin"), Long.valueOf(this.f26555g));
                        }
                    } else if (action == 1 || action == 3) {
                        this.f26551c.put("start_x", String.valueOf(this.f26553e));
                        this.f26551c.put("start_y", String.valueOf(this.f26554f));
                        this.f26551c.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f26553e));
                        this.f26551c.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f26554f));
                        this.f26551c.put("url", String.valueOf(getUrl()));
                        this.f26551c.put("tag", "");
                        this.f26556h = System.currentTimeMillis();
                        if (this.f26559k != null) {
                            this.f26559k.setTag(C10647t.m31283e(getContext(), "tt_id_click_end"), Long.valueOf(this.f26556h));
                        }
                        this.f26551c.put("down_time", this.f26555g);
                        this.f26551c.put("up_time", this.f26556h);
                        if (C10658a.m31358a().mo64368b() != null && this.f26557i != this.f26555g) {
                            this.f26557i = this.f26555g;
                            C10658a.m31358a().mo64368b().mo1830a(this.f26549a, this.f26550b, "in_web_click", this.f26551c, this.f26556h - this.f26555g);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m31329b(Context context) {
        m31331c(context);
        m31334p();
        m31333o();
    }

    /* renamed from: b */
    private static boolean m31330b(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass != null && loadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return loadClass2 != null && loadClass2.isInstance(view);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private static void m31331c(Context context) {
        if (Build.VERSION.SDK_INT == 17 && context != null) {
            try {
                AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                if (accessibilityManager == null) {
                    return;
                }
                if (accessibilityManager.isEnabled()) {
                    Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod("setState", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(accessibilityManager, new Object[]{0});
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m31332c(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass != null && loadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return loadClass2 != null && loadClass2.isInstance(view);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: o */
    private void m31333o() {
        try {
            this.f26559k.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f26559k.removeJavascriptInterface("accessibility");
            this.f26559k.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private void m31334p() {
        try {
            WebSettings settings = this.f26559k.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.f26559k.getSettings()) != null) {
                settings.setJavaScriptEnabled(!Uri.parse(str).getScheme().equals("file"));
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewParent mo64294a(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (m31330b(view2) || m31332c(view2)) ? parent : mo64294a(view2);
    }

    /* renamed from: a */
    public void mo64295a() {
        try {
            this.f26559k = this.f26564p == null ? new WebView(m31327a(this.f26565q)) : new WebView(m31327a(this.f26565q), this.f26564p);
            mo64302b();
            m31329b(m31327a(this.f26565q));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64296a(Object obj, String str) {
        try {
            this.f26559k.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64297a(String str) {
        try {
            setJavaScriptEnabled(str);
            this.f26559k.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64298a(String str, ValueCallback<String> valueCallback) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f26559k.evaluateJavascript(str, valueCallback);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64299a(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.f26559k.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64300a(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.f26559k.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo64301a(boolean z) {
        try {
            this.f26559k.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo64302b() {
        if (this.f26559k != null) {
            removeAllViews();
            setBackground((Drawable) null);
            try {
                this.f26559k.setId(C10647t.m31283e(getContext(), "tt_id_root_web_view"));
            } catch (Throwable unused) {
            }
            addView(this.f26559k, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: b */
    public void mo64303b(String str) {
        try {
            this.f26559k.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo64304c() {
        try {
            this.f26559k.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void computeScroll() {
        try {
            this.f26559k.computeScroll();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void mo64306d() {
        try {
            this.f26559k.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C10657c cVar = this.f26566r;
        if (cVar != null) {
            cVar.mo64366a(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo64308e() {
        try {
            return this.f26559k.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public void mo64309f() {
        try {
            this.f26559k.goBack();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public boolean mo64310g() {
        try {
            return this.f26559k.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getContentHeight() {
        try {
            return this.f26559k.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public C10660a getMaterialMeta() {
        return this.f26549a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r3.f26559k.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getOriginalUrl() {
        /*
            r3 = this;
            android.webkit.WebView r0 = r3.f26559k     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r0.getOriginalUrl()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "data:text/html"
            boolean r1 = r0.startsWith(r1)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            android.webkit.WebView r1 = r3.f26559k     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r1.getUrl()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            java.lang.String r2 = "file://"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x0021
            r0 = r1
        L_0x0021:
            return r0
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.widget.SSWebView.getOriginalUrl():java.lang.String");
    }

    public int getProgress() {
        try {
            return this.f26559k.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getTag() {
        return this.f26550b;
    }

    public String getUrl() {
        try {
            return this.f26559k.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        try {
            return this.f26559k.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.f26559k;
    }

    /* renamed from: h */
    public void mo64319h() {
        try {
            this.f26559k.goForward();
        } catch (Throwable unused) {
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: i */
    public void mo64321i() {
        WebView webView = this.f26559k;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* renamed from: j */
    public void mo64322j() {
        try {
            this.f26559k.clearHistory();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    public void mo64323k() {
        try {
            this.f26559k.onPause();
            if (this.f26566r != null) {
                this.f26566r.mo64366a(false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    public void mo64324l() {
        try {
            this.f26559k.destroy();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public void mo64325m() {
        try {
            this.f26559k.clearView();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public void mo64326n() {
        try {
            this.f26559k.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10649v vVar = this.f26563o;
        if (vVar != null) {
            vVar.mo64289b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent a;
        try {
            m31328a(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f26558j && (a = mo64294a((View) this)) != null) {
                a.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C10649v vVar = this.f26563o;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.mo64286a();
        } else {
            vVar.mo64289b();
        }
    }

    public void removeAllViews() {
        try {
            this.f26559k.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.f26559k.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.f26559k.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.f26559k.getSettings().setAppCacheEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBackgroundColor(int i) {
        try {
            this.f26559k.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.f26559k.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.f26559k.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.f26559k.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.f26559k.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.f26559k.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.f26559k.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.f26559k.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.f26559k.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.f26558j = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.f26559k.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.f26559k.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.f26552d = z;
    }

    public void setLayerType(int i, Paint paint) {
        try {
            this.f26559k.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.f26559k.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.f26559k.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(C10660a aVar) {
        this.f26549a = aVar;
    }

    public void setMixedContentMode(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f26559k.getSettings().setMixedContentMode(i);
            }
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.f26559k.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(C10656b bVar) {
        this.f26562n = bVar;
    }

    public void setOverScrollMode(int i) {
        try {
            this.f26559k.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.f26560l = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.f26559k.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f26550b = str;
    }

    public void setTouchStateListener(C10657c cVar) {
        this.f26566r = cVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.f26559k.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.f26559k.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.f26559k.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.f26559k.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof C10657c) {
                setTouchStateListener((C10657c) webViewClient);
            } else {
                setTouchStateListener((C10657c) null);
            }
            if (webViewClient == null) {
                webViewClient = new C10655a();
            }
            this.f26559k.setWebViewClient(webViewClient);
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.f26561m = f;
    }

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$a */
    public static class C10655a extends WebViewClient {
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                if (webView != null) {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            }
            if (webView != null) {
                ViewGroup viewGroup2 = (ViewGroup) webView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(webView);
                }
                webView.destroy();
            }
            return true;
        }
    }
}
