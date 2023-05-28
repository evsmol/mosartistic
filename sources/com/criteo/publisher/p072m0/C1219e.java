package com.criteo.publisher.p072m0;

import com.criteo.publisher.C1319p;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.model.C1221a0;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p074n0.C1314r;
import com.criteo.publisher.p074n0.C1315s;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.criteo.publisher.m0.e */
/* compiled from: WebViewDataTask */
public class C1219e extends C1330x {

    /* renamed from: c */
    private final String f3816c;

    /* renamed from: d */
    private final C1221a0 f3817d;

    /* renamed from: e */
    private final C1278u f3818e;

    /* renamed from: f */
    private final C1217d f3819f;

    /* renamed from: g */
    private final C1166g f3820g;

    public C1219e(String str, C1221a0 a0Var, C1278u uVar, C1217d dVar, C1166g gVar) {
        this.f3816c = str;
        this.f3817d = a0Var;
        this.f3818e = uVar;
        this.f3819f = dVar;
        this.f3820g = gVar;
    }

    /* renamed from: a */
    public void mo3040a() throws Exception {
        try {
            String b = mo3358b();
            if (C1315s.m5789a((CharSequence) b)) {
                mo3359c();
            } else {
                mo3357a(b);
            }
        } catch (Throwable th) {
            if (C1315s.m5789a((CharSequence) null)) {
                mo3359c();
            } else {
                mo3357a((String) null);
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo3358b() throws Exception {
        InputStream a = this.f3820g.mo3266a(new URL(this.f3816c), this.f3818e.mo3602b().get());
        try {
            String a2 = C1314r.m5787a(a);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3357a(String str) {
        this.f3817d.mo3404a(str);
        this.f3817d.mo3407c();
        this.f3819f.mo3356a(C1319p.VALID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3359c() {
        this.f3817d.mo3403a();
        this.f3819f.mo3356a(C1319p.INVALID_CREATIVE);
    }
}
