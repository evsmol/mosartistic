package com.yandex.metrica.impl.p082ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.Gl */
class C2067Gl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2165Il f5463a;

    /* renamed from: b */
    final /* synthetic */ WebView f5464b;

    /* renamed from: c */
    final /* synthetic */ CountDownLatch f5465c;

    C2067Gl(C2101Hl hl, C2165Il il, WebView webView, CountDownLatch countDownLatch) {
        this.f5463a = il;
        this.f5464b = webView;
        this.f5465c = countDownLatch;
    }

    public void run() {
        try {
            this.f5463a.f5799h = this.f5464b.getUrl();
            this.f5463a.f5800i = this.f5464b.getOriginalUrl();
            this.f5465c.countDown();
        } catch (Throwable unused) {
        }
    }
}
