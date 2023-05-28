package com.bytedance.sdk.component.p293a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.p293a.C10233k;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.a.j */
/* compiled from: Environment */
public class C10232j {

    /* renamed from: a */
    WebView f25266a;

    /* renamed from: b */
    C10217a f25267b;

    /* renamed from: c */
    String f25268c = "IESJSBridge";

    /* renamed from: d */
    C10230h f25269d;

    /* renamed from: e */
    Context f25270e;

    /* renamed from: f */
    boolean f25271f;

    /* renamed from: g */
    boolean f25272g;

    /* renamed from: h */
    boolean f25273h;

    /* renamed from: i */
    C10238m f25274i;

    /* renamed from: j */
    C10239n f25275j;

    /* renamed from: k */
    String f25276k = "host";

    /* renamed from: l */
    final Set<String> f25277l = new LinkedHashSet();

    /* renamed from: m */
    final Set<String> f25278m = new LinkedHashSet();

    /* renamed from: n */
    boolean f25279n;

    /* renamed from: o */
    boolean f25280o;

    /* renamed from: p */
    C10233k.C10236b f25281p;

    C10232j(WebView webView) {
        this.f25266a = webView;
    }

    C10232j() {
    }

    /* renamed from: a */
    public C10232j mo63043a(C10217a aVar) {
        this.f25267b = aVar;
        return this;
    }

    /* renamed from: a */
    public C10232j mo63045a(String str) {
        this.f25268c = str;
        return this;
    }

    /* renamed from: a */
    public C10232j mo63044a(C10237l lVar) {
        this.f25269d = C10230h.m29371a(lVar);
        return this;
    }

    /* renamed from: a */
    public C10232j mo63046a(boolean z) {
        this.f25271f = z;
        return this;
    }

    /* renamed from: b */
    public C10232j mo63047b(boolean z) {
        this.f25272g = z;
        return this;
    }

    /* renamed from: a */
    public C10232j mo63042a() {
        this.f25280o = true;
        return this;
    }

    /* renamed from: b */
    public C10245r mo63048b() {
        m29381c();
        return new C10245r(this);
    }

    /* renamed from: c */
    private void m29381c() {
        if ((this.f25266a == null && !this.f25279n && this.f25267b == null) || ((TextUtils.isEmpty(this.f25268c) && this.f25266a != null) || this.f25269d == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
