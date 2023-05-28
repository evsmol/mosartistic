package com.appnext.core.webview;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.C8917f;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class AppnextWebView {

    /* renamed from: il */
    public static final int f22700il = 1;

    /* renamed from: im */
    public static final int f22701im = 2;
    /* access modifiers changed from: private */

    /* renamed from: in */
    public static AppnextWebView f22702in;
    /* access modifiers changed from: private */

    /* renamed from: bX */
    public WebAppInterface f22703bX;
    /* access modifiers changed from: private */

    /* renamed from: io */
    public final HashMap<String, C8966b> f22704io = new HashMap<>();

    /* renamed from: ip */
    private HashMap<String, WebView> f22705ip;

    /* renamed from: com.appnext.core.webview.AppnextWebView$c */
    public interface C8967c {
        void error(String str);

        /* renamed from: f */
        void mo58459f(String str);
    }

    /* renamed from: a */
    public final void mo59086a(WebAppInterface webAppInterface) {
        if (this.f22703bX == webAppInterface) {
            this.f22703bX = null;
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$b */
    private class C8966b {

        /* renamed from: aQ */
        public String f22710aQ;

        /* renamed from: hF */
        public ArrayList<C8967c> f22711hF;

        /* renamed from: is */
        public String f22713is;
        public int state;

        private C8966b() {
            this.state = 0;
            this.f22713is = "";
            this.f22711hF = new ArrayList<>();
        }
    }

    /* renamed from: u */
    public static AppnextWebView m27061u(Context context) {
        if (f22702in == null) {
            AppnextWebView appnextWebView = new AppnextWebView();
            f22702in = appnextWebView;
            appnextWebView.f22705ip = new HashMap<>();
        }
        return f22702in;
    }

    private AppnextWebView() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo59087a(java.lang.String r8, com.appnext.core.webview.AppnextWebView.C8967c r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r0 = r7.f22704io     // Catch:{ all -> 0x004c }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r0 = r7.f22704io     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x004c }
            com.appnext.core.webview.AppnextWebView$b r0 = (com.appnext.core.webview.AppnextWebView.C8966b) r0     // Catch:{ all -> 0x004c }
            goto L_0x001a
        L_0x0013:
            com.appnext.core.webview.AppnextWebView$b r0 = new com.appnext.core.webview.AppnextWebView$b     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r0.f22710aQ = r8     // Catch:{ all -> 0x004c }
        L_0x001a:
            int r2 = r0.state     // Catch:{ all -> 0x004c }
            r3 = 2
            if (r2 != r3) goto L_0x0026
            if (r9 == 0) goto L_0x004a
            r9.mo58459f(r8)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return
        L_0x0026:
            int r2 = r0.state     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x003e
            r2 = 1
            r0.state = r2     // Catch:{ all -> 0x004c }
            com.appnext.core.webview.AppnextWebView$a r4 = new com.appnext.core.webview.AppnextWebView$a     // Catch:{ all -> 0x004c }
            r4.<init>(r0)     // Catch:{ all -> 0x004c }
            java.util.concurrent.Executor r5 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ all -> 0x004c }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x004c }
            r6 = 0
            r3[r6] = r8     // Catch:{ all -> 0x004c }
            r3[r2] = r1     // Catch:{ all -> 0x004c }
            r4.executeOnExecutor(r5, r3)     // Catch:{ all -> 0x004c }
        L_0x003e:
            if (r9 == 0) goto L_0x0045
            java.util.ArrayList<com.appnext.core.webview.AppnextWebView$c> r1 = r0.f22711hF     // Catch:{ all -> 0x004c }
            r1.add(r9)     // Catch:{ all -> 0x004c }
        L_0x0045:
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r9 = r7.f22704io     // Catch:{ all -> 0x004c }
            r9.put(r8, r0)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.webview.AppnextWebView.mo59087a(java.lang.String, com.appnext.core.webview.AppnextWebView$c):void");
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$a */
    private class C8965a extends AsyncTask<String, Void, String> {

        /* renamed from: ir */
        C8966b f22709ir;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            super.onPostExecute(str);
            if (str.startsWith("error:")) {
                this.f22709ir.state = 0;
                AppnextWebView.this.f22704io.put(this.f22709ir.f22710aQ, this.f22709ir);
                AppnextWebView.m27055a(AppnextWebView.this, this.f22709ir, str.substring(7));
                return;
            }
            this.f22709ir.state = 2;
            AppnextWebView.this.f22704io.put(this.f22709ir.f22710aQ, this.f22709ir);
            AppnextWebView.m27058b(AppnextWebView.this, this.f22709ir, str);
        }

        public C8965a(C8966b bVar) {
            this.f22709ir = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String doInBackground(String... strArr) {
            try {
                C8966b bVar = (C8966b) AppnextWebView.this.f22704io.get(strArr[0]);
                bVar.f22713is = C8917f.m26922a(strArr[0], (HashMap<String, String>) null, true, 10000);
                AppnextWebView.this.f22704io.put(strArr[0], bVar);
                return strArr[0];
            } catch (HttpRetryException e) {
                return "error: " + e.getReason();
            } catch (IOException unused) {
                return "error: network problem";
            } catch (Throwable unused2) {
                return "error: unknown error";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: ag */
        public final void mo59092ag(String str) {
            super.onPostExecute(str);
            if (str.startsWith("error:")) {
                this.f22709ir.state = 0;
                AppnextWebView.this.f22704io.put(this.f22709ir.f22710aQ, this.f22709ir);
                AppnextWebView.m27055a(AppnextWebView.this, this.f22709ir, str.substring(7));
                return;
            }
            this.f22709ir.state = 2;
            AppnextWebView.this.f22704io.put(this.f22709ir.f22710aQ, this.f22709ir);
            AppnextWebView.m27058b(AppnextWebView.this, this.f22709ir, str);
        }
    }

    /* renamed from: v */
    private WebView m27062v(Context context) {
        WebView webView = new WebView(context.getApplicationContext());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            webView.getSettings().setMixedContentMode(0);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str == null) {
                    return false;
                }
                if (!str.startsWith("http")) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                webView.loadUrl(str);
                return true;
            }
        });
        return webView;
    }

    /* renamed from: a */
    public final WebView mo59085a(Context context, String str, WebAppInterface webAppInterface, C8968a aVar, String str2) {
        String str3;
        try {
            f22702in.f22703bX = webAppInterface;
            WebView webView = this.f22705ip.get(str2);
            if (!(webView == null || webView.getParent() == null)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            URL url = new URL(str);
            String str4 = url.getProtocol() + "://" + url.getHost();
            WebView webView2 = new WebView(context.getApplicationContext());
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.getSettings().setAppCacheEnabled(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setDatabaseEnabled(true);
            if (Build.VERSION.SDK_INT >= 21) {
                webView2.getSettings().setMixedContentMode(0);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            webView2.setWebChromeClient(new WebChromeClient());
            webView2.setWebViewClient(new WebViewClient() {
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (!str.startsWith("http")) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    webView.loadUrl(str);
                    return true;
                }
            });
            if (this.f22704io.containsKey(str)) {
                if (this.f22704io.get(str).state == 2 && !this.f22704io.get(str).f22713is.equals("")) {
                    str3 = "<script>" + this.f22704io.get(str).f22713is + "</script>";
                    webView2.loadDataWithBaseURL(str4, "<html><body>" + str3 + "</body></html>", (String) null, "UTF-8", (String) null);
                    this.f22705ip.put(str2, webView2);
                    webView2.addJavascriptInterface(new WebInterface(), "Appnext");
                    return webView2;
                }
            }
            if (aVar != null) {
                str3 = "<script>" + aVar.mo58525J() + "</script>";
            } else {
                str3 = "<script src='" + str + "'></script>";
            }
            webView2.loadDataWithBaseURL(str4, "<html><body>" + str3 + "</body></html>", (String) null, "UTF-8", (String) null);
            this.f22705ip.put(str2, webView2);
            webView2.addJavascriptInterface(new WebInterface(), "Appnext");
            return webView2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ah */
    public final boolean mo59088ah(String str) {
        return this.f22705ip.get(str) != null;
    }

    /* renamed from: ai */
    public final WebView mo59089ai(String str) {
        WebView webView = this.f22705ip.get(str);
        if (!(webView == null || webView.getParent() == null)) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        return webView;
    }

    /* renamed from: aj */
    public final String mo59090aj(String str) {
        C8966b bVar = this.f22704io.get(str);
        if (bVar == null || bVar.state != 2) {
            return null;
        }
        return bVar.f22713is;
    }

    /* renamed from: b */
    public static void m27059b(WebAppInterface webAppInterface) {
        f22702in.f22703bX = webAppInterface;
    }

    /* renamed from: a */
    private void m27054a(C8966b bVar, String str) {
        new StringBuilder("webview error: ").append(str);
        synchronized (this.f22704io) {
            Iterator<C8967c> it = bVar.f22711hF.iterator();
            while (it.hasNext()) {
                it.next().error(str);
            }
            bVar.f22711hF.clear();
            this.f22704io.remove(bVar.f22710aQ);
        }
    }

    /* renamed from: b */
    private void m27057b(C8966b bVar, String str) {
        new StringBuilder("downloaded ").append(str);
        synchronized (this.f22704io) {
            Iterator<C8967c> it = bVar.f22711hF.iterator();
            while (it.hasNext()) {
                it.next().mo58459f(str);
            }
            bVar.f22711hF.clear();
        }
    }

    private class WebInterface extends WebAppInterface {
        public WebInterface() {
        }

        @JavascriptInterface
        public void destroy(String str) {
            super.destroy(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.destroy(str);
            }
        }

        @JavascriptInterface
        public void postView(String str) {
            super.postView(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.postView(str);
            }
        }

        @JavascriptInterface
        public void openStore(String str) {
            super.openStore(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.openStore(str);
            }
        }

        @JavascriptInterface
        public void play() {
            super.play();
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.play();
            }
        }

        @JavascriptInterface
        public String filterAds(String str) {
            super.filterAds(str);
            return AppnextWebView.f22702in.f22703bX != null ? AppnextWebView.f22702in.f22703bX.filterAds(str) : str;
        }

        @JavascriptInterface
        public String loadAds() {
            super.loadAds();
            return AppnextWebView.f22702in.f22703bX != null ? AppnextWebView.f22702in.f22703bX.loadAds() : "";
        }

        @JavascriptInterface
        public void openLink(String str) {
            super.openLink(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.openLink(str);
            }
        }

        @JavascriptInterface
        public void gotoAppWall() {
            super.gotoAppWall();
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.gotoAppWall();
            }
        }

        @JavascriptInterface
        public void videoPlayed() {
            super.videoPlayed();
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.videoPlayed();
            }
        }

        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.notifyImpression(str);
            }
        }

        @JavascriptInterface
        public void jsError(String str) {
            super.jsError(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.jsError(str);
            }
        }

        @JavascriptInterface
        public void openResultPage(String str) {
            super.openResultPage(str);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.openResultPage(str);
            }
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            super.logSTP(str, str2);
            if (AppnextWebView.f22702in.f22703bX != null) {
                AppnextWebView.f22702in.f22703bX.logSTP(str, str2);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m27055a(AppnextWebView appnextWebView, C8966b bVar, String str) {
        new StringBuilder("webview error: ").append(str);
        synchronized (appnextWebView.f22704io) {
            Iterator<C8967c> it = bVar.f22711hF.iterator();
            while (it.hasNext()) {
                it.next().error(str);
            }
            bVar.f22711hF.clear();
            appnextWebView.f22704io.remove(bVar.f22710aQ);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m27058b(AppnextWebView appnextWebView, C8966b bVar, String str) {
        new StringBuilder("downloaded ").append(str);
        synchronized (appnextWebView.f22704io) {
            Iterator<C8967c> it = bVar.f22711hF.iterator();
            while (it.hasNext()) {
                it.next().mo58459f(str);
            }
            bVar.f22711hF.clear();
        }
    }
}
