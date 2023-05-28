package com.bytedance.sdk.component.p293a;

import android.webkit.WebView;
import com.bytedance.sdk.component.p293a.C10221d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.a.r */
/* compiled from: JsBridge2 */
public class C10245r {

    /* renamed from: a */
    static C10255w f25298a;

    /* renamed from: b */
    private final C10217a f25299b;

    /* renamed from: c */
    private final WebView f25300c;

    /* renamed from: d */
    private final C10232j f25301d;

    /* renamed from: e */
    private final List<C10239n> f25302e = new ArrayList();

    /* renamed from: f */
    private C10240o f25303f;

    /* renamed from: g */
    private volatile boolean f25304g = false;

    /* renamed from: a */
    public static C10232j m29423a(WebView webView) {
        return new C10232j(webView);
    }

    /* renamed from: a */
    public C10245r mo63072a(String str, C10224e<?, ?> eVar) {
        return mo63074a(str, (String) null, eVar);
    }

    /* renamed from: a */
    public C10245r mo63074a(String str, String str2, C10224e<?, ?> eVar) {
        m29424b();
        this.f25299b.f25234g.mo63039a(str, eVar);
        C10240o oVar = this.f25303f;
        if (oVar != null) {
            oVar.mo63059a(str);
        }
        return this;
    }

    /* renamed from: a */
    public C10245r mo63071a(String str, C10221d.C10223b bVar) {
        return mo63073a(str, (String) null, bVar);
    }

    /* renamed from: a */
    public C10245r mo63073a(String str, String str2, C10221d.C10223b bVar) {
        m29424b();
        this.f25299b.f25234g.mo63038a(str, bVar);
        C10240o oVar = this.f25303f;
        if (oVar != null) {
            oVar.mo63059a(str);
        }
        return this;
    }

    /* renamed from: a */
    public void mo63075a() {
        if (!this.f25304g) {
            this.f25299b.mo63019b();
            this.f25304g = true;
            for (C10239n next : this.f25302e) {
                if (next != null) {
                    next.mo63058a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = f25298a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C10245r(com.bytedance.sdk.component.p293a.C10232j r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f25302e = r0
            r0 = 0
            r2.f25304g = r0
            r2.f25301d = r3
            boolean r0 = r3.f25273h
            if (r0 == 0) goto L_0x001e
            com.bytedance.sdk.component.a.w r0 = f25298a
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r3.f25276k
            com.bytedance.sdk.component.a.v r0 = r0.mo63084a((java.lang.String) r1)
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            android.webkit.WebView r1 = r3.f25266a
            if (r1 == 0) goto L_0x0034
            com.bytedance.sdk.component.a.a r1 = r3.f25267b
            if (r1 != 0) goto L_0x002f
            com.bytedance.sdk.component.a.z r1 = new com.bytedance.sdk.component.a.z
            r1.<init>()
            r2.f25299b = r1
            goto L_0x0038
        L_0x002f:
            com.bytedance.sdk.component.a.a r1 = r3.f25267b
            r2.f25299b = r1
            goto L_0x0038
        L_0x0034:
            com.bytedance.sdk.component.a.a r1 = r3.f25267b
            r2.f25299b = r1
        L_0x0038:
            com.bytedance.sdk.component.a.a r1 = r2.f25299b
            r1.mo63015a((com.bytedance.sdk.component.p293a.C10232j) r3, (com.bytedance.sdk.component.p293a.C10250v) r0)
            android.webkit.WebView r0 = r3.f25266a
            r2.f25300c = r0
            java.util.List<com.bytedance.sdk.component.a.n> r0 = r2.f25302e
            com.bytedance.sdk.component.a.n r1 = r3.f25275j
            r0.add(r1)
            boolean r0 = r3.f25271f
            com.bytedance.sdk.component.p293a.C10231i.m29378a((boolean) r0)
            boolean r3 = r3.f25272g
            com.bytedance.sdk.component.p293a.C10258y.m29453a((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p293a.C10245r.<init>(com.bytedance.sdk.component.a.j):void");
    }

    /* renamed from: b */
    private void m29424b() {
        if (this.f25304g) {
            C10231i.m29375a((RuntimeException) new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
