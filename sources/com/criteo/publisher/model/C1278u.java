package com.criteo.publisher.model;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p074n0.C1301h;
import com.criteo.publisher.p074n0.C1311o;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.criteo.publisher.model.u */
/* compiled from: DeviceInfo */
public class C1278u {

    /* renamed from: a */
    private final Context f3978a;

    /* renamed from: b */
    private final C1076c f3979b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1301h<String> f3980c = new C1301h<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicBoolean f3981d = new AtomicBoolean(false);

    public C1278u(Context context, C1076c cVar) {
        C1197h.m5407b(getClass());
        this.f3978a = context;
        this.f3979b = cVar;
    }

    /* renamed from: com.criteo.publisher.model.u$a */
    /* compiled from: DeviceInfo */
    class C1279a implements Runnable {
        C1279a() {
        }

        public void run() {
            if (C1278u.this.f3981d.compareAndSet(false, true)) {
                C1278u.this.f3980c.mo3647a(C1278u.this.mo3604e());
            }
        }
    }

    /* renamed from: d */
    public void mo3603d() {
        m5676a((Runnable) new C1279a());
    }

    /* renamed from: b */
    public Future<String> mo3602b() {
        mo3603d();
        return this.f3980c;
    }

    /* renamed from: com.criteo.publisher.model.u$b */
    /* compiled from: DeviceInfo */
    class C1280b extends C1330x {

        /* renamed from: c */
        final /* synthetic */ Runnable f3983c;

        C1280b(C1278u uVar, Runnable runnable) {
            this.f3983c = runnable;
        }

        /* renamed from: a */
        public void mo3040a() {
            this.f3983c.run();
        }
    }

    /* renamed from: a */
    private void m5676a(Runnable runnable) {
        this.f3979b.mo3126a(new C1280b(this, runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo3604e() {
        String str;
        try {
            str = m5678c();
        } catch (Throwable unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? m5674a() : str;
    }

    /* renamed from: c */
    private String m5678c() {
        WebView webView = new WebView(this.f3978a);
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        return userAgentString;
    }

    /* renamed from: a */
    private String m5674a() {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Throwable th) {
            C1311o.m5779a(th);
            str = null;
        }
        return str != null ? str : "";
    }
}
