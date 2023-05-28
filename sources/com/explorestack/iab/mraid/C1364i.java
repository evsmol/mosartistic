package com.explorestack.iab.mraid;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.explorestack.iab.utils.C1406m;

/* renamed from: com.explorestack.iab.mraid.i */
public class C1364i extends WebView {

    /* renamed from: g */
    public static final String f4199g = C1364i.class.getSimpleName();

    /* renamed from: h */
    public static final C1368d f4200h = new C1368d((C1365a) null);

    /* renamed from: a */
    public final C1379m f4201a;

    /* renamed from: b */
    public final C1406m f4202b;

    /* renamed from: c */
    public C1369e f4203c;

    /* renamed from: d */
    public boolean f4204d = false;

    /* renamed from: e */
    public boolean f4205e = false;

    /* renamed from: f */
    public boolean f4206f = false;

    /* renamed from: com.explorestack.iab.mraid.i$a */
    public class C1365a implements View.OnTouchListener {
        public C1365a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C1364i.this.f4201a.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: com.explorestack.iab.mraid.i$b */
    public class C1366b implements C1406m.C1410d {
        public C1366b() {
        }

        /* renamed from: a */
        public void mo3921a(boolean z) {
            C1364i.this.mo3915i();
        }
    }

    /* renamed from: com.explorestack.iab.mraid.i$c */
    public class C1367c implements ValueCallback<String> {
        public C1367c() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            String a = C1364i.f4199g;
            MraidLog.m5985d(a, "evaluate js complete: " + str);
        }
    }

    /* renamed from: com.explorestack.iab.mraid.i$d */
    public static final class C1368d extends WebChromeClient {
        private C1368d() {
        }

        public /* synthetic */ C1368d(C1365a aVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo3924a(JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null || consoleMessage.message() == null) {
                return false;
            }
            if (!consoleMessage.message().contains("Uncaught ReferenceError")) {
                Object[] objArr = new Object[3];
                objArr[0] = consoleMessage.message();
                if (consoleMessage.sourceId() == null) {
                    str = "";
                } else {
                    str = " at " + consoleMessage.sourceId();
                }
                objArr[1] = str;
                objArr[2] = Integer.valueOf(consoleMessage.lineNumber());
                MraidLog.m5985d("JS console", String.format("%s%s:%d", objArr));
            }
            if (consoleMessage.message().contains("AppodealAlert")) {
                MraidLog.m5982a("Appodeal", consoleMessage.message().replace("AppodealAlert:", ""));
            }
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            MraidLog.m5985d("JS alert", str2);
            return mo3924a(jsResult);
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            MraidLog.m5985d("JS confirm", str2);
            return mo3924a(jsResult);
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            MraidLog.m5985d("JS prompt", str2);
            return mo3924a(jsPromptResult);
        }
    }

    /* renamed from: com.explorestack.iab.mraid.i$e */
    public interface C1369e {
        /* renamed from: a */
        void mo3929a(boolean z);
    }

    public C1364i(Context context) {
        super(context);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        this.f4201a = new C1379m(context);
        setOnTouchListener(new C1365a());
        setWebChromeClient(f4200h);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        setBackgroundColor(0);
        this.f4202b = new C1406m(context, this, new C1366b());
    }

    /* renamed from: a */
    public void mo3905a(String str) {
        if (mo3909d()) {
            MraidLog.m5985d(f4199g, "can't evaluating js: WebView is destroyed");
        } else if (TextUtils.isEmpty(str)) {
            MraidLog.m5985d(f4199g, "can't evaluating js: js is empty");
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    String str2 = f4199g;
                    MraidLog.m5985d(str2, "evaluating js: " + str);
                    evaluateJavascript(str, new C1367c());
                    return;
                } catch (Throwable th) {
                    MraidLog.m5982a(f4199g, th.getMessage());
                }
            }
            String str3 = f4199g;
            MraidLog.m5985d(str3, "loading url: " + str);
            loadUrl("javascript:" + str);
        }
    }

    /* renamed from: b */
    public final void mo3906b() {
        MraidLog.m5985d(f4199g, "onPause");
        try {
            onPause();
        } catch (Throwable th) {
            MraidLog.m5983a(f4199g, th);
        }
        this.f4205e = true;
        mo3915i();
    }

    /* renamed from: c */
    public final void mo3907c() {
        MraidLog.m5985d(f4199g, "onResume");
        try {
            onResume();
        } catch (Throwable th) {
            MraidLog.m5983a(f4199g, th);
        }
        this.f4205e = false;
        mo3915i();
    }

    public void computeScroll() {
    }

    /* renamed from: d */
    public boolean mo3909d() {
        return this.f4206f;
    }

    public void destroy() {
        this.f4206f = true;
        try {
            mo3913g();
            removeAllViews();
            this.f4202b.mo4146c();
            super.destroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    public boolean mo3911e() {
        return this.f4204d;
    }

    /* renamed from: f */
    public void mo3912f() {
        this.f4202b.mo4148e();
    }

    /* renamed from: g */
    public void mo3913g() {
        stopLoading();
        loadUrl("");
        mo3906b();
    }

    /* renamed from: h */
    public void mo3914h() {
        this.f4201a.mo3968b();
    }

    /* renamed from: i */
    public final void mo3915i() {
        boolean z = !this.f4205e && this.f4202b.mo4145b();
        if (z != this.f4204d) {
            this.f4204d = z;
            C1369e eVar = this.f4203c;
            if (eVar != null) {
                eVar.mo3929a(z);
            }
        }
    }

    /* renamed from: j */
    public boolean mo3916j() {
        return this.f4201a.mo3967a();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            mo3907c();
        } else {
            mo3906b();
        }
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return false;
    }

    public void setListener(C1369e eVar) {
        this.f4203c = eVar;
    }
}
