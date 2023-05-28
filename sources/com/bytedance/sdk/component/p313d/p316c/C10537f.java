package com.bytedance.sdk.component.p313d.p316c;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.p313d.C10492b;
import com.bytedance.sdk.component.p313d.C10498c;
import com.bytedance.sdk.component.p313d.C10540d;
import com.bytedance.sdk.component.p313d.C10562k;
import com.bytedance.sdk.component.p313d.C10563l;
import com.bytedance.sdk.component.p313d.C10566o;
import com.bytedance.sdk.component.p313d.C10567p;
import com.bytedance.sdk.component.p313d.C10568q;
import com.bytedance.sdk.component.p313d.p314a.C10489b;
import com.bytedance.sdk.component.p313d.p314a.C10491c;
import com.bytedance.sdk.component.p313d.p315b.C10494b;
import com.bytedance.sdk.component.p313d.p316c.p317a.C10500a;
import com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10508b;
import com.bytedance.sdk.component.p313d.p316c.p317a.p319b.C10513a;
import com.bytedance.sdk.component.p313d.p316c.p317a.p319b.C10519e;
import com.bytedance.sdk.component.p313d.p316c.p320b.C10522a;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.f */
/* compiled from: LoadFactory */
public class C10537f {

    /* renamed from: a */
    private Map<String, List<C10523c>> f26320a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C10563l f26321b;

    /* renamed from: c */
    private Map<String, C10567p> f26322c = new HashMap();

    /* renamed from: d */
    private Map<String, C10568q> f26323d = new HashMap();

    /* renamed from: e */
    private Map<String, C10498c> f26324e = new HashMap();

    /* renamed from: f */
    private C10540d f26325f;

    /* renamed from: g */
    private C10562k f26326g;

    /* renamed from: h */
    private ExecutorService f26327h;

    /* renamed from: i */
    private C10566o f26328i;

    public C10537f(Context context, C10563l lVar) {
        this.f26321b = (C10563l) C10539h.m30905a(lVar);
        C10500a.m30669a(context, lVar.mo64128h());
    }

    /* renamed from: a */
    public Collection<C10568q> mo64136a() {
        return this.f26323d.values();
    }

    /* renamed from: b */
    public Collection<C10498c> mo64138b() {
        return this.f26324e.values();
    }

    /* renamed from: a */
    public C10567p mo64135a(C10492b bVar) {
        if (bVar == null) {
            bVar = C10500a.m30670f();
        }
        String file = bVar.mo64001e().toString();
        C10567p pVar = this.f26322c.get(file);
        if (pVar != null) {
            return pVar;
        }
        C10567p d = m30885d(bVar);
        this.f26322c.put(file, d);
        return d;
    }

    /* renamed from: d */
    private C10567p m30885d(C10492b bVar) {
        C10567p d = this.f26321b.mo64124d();
        if (d != null) {
            return C10513a.m30740a(d);
        }
        return C10513a.m30739a(bVar.mo63998b());
    }

    /* renamed from: b */
    public C10568q mo64137b(C10492b bVar) {
        if (bVar == null) {
            bVar = C10500a.m30670f();
        }
        String file = bVar.mo64001e().toString();
        C10568q qVar = this.f26323d.get(file);
        if (qVar != null) {
            return qVar;
        }
        C10568q e = m30886e(bVar);
        this.f26323d.put(file, e);
        return e;
    }

    /* renamed from: e */
    private C10568q m30886e(C10492b bVar) {
        C10568q e = this.f26321b.mo64125e();
        if (e != null) {
            return e;
        }
        return C10519e.m30764a(bVar.mo63998b());
    }

    /* renamed from: c */
    public C10498c mo64139c(C10492b bVar) {
        if (bVar == null) {
            bVar = C10500a.m30670f();
        }
        String file = bVar.mo64001e().toString();
        C10498c cVar = this.f26324e.get(file);
        if (cVar != null) {
            return cVar;
        }
        C10498c f = m30887f(bVar);
        this.f26324e.put(file, f);
        return f;
    }

    /* renamed from: a */
    public C10498c mo64134a(String str) {
        return mo64139c(C10500a.m30668a(new File(str)));
    }

    /* renamed from: f */
    private C10498c m30887f(C10492b bVar) {
        C10498c f = this.f26321b.mo64126f();
        if (f != null) {
            return f;
        }
        return new C10508b(bVar.mo64001e(), bVar.mo63997a(), mo64142e());
    }

    /* renamed from: c */
    public C10540d mo64140c() {
        if (this.f26325f == null) {
            this.f26325f = m30888h();
        }
        return this.f26325f;
    }

    /* renamed from: h */
    private C10540d m30888h() {
        C10540d c = this.f26321b.mo64123c();
        return c == null ? C10494b.m30650a() : c;
    }

    /* renamed from: d */
    public C10562k mo64141d() {
        if (this.f26326g == null) {
            this.f26326g = m30889i();
        }
        return this.f26326g;
    }

    /* renamed from: i */
    private C10562k m30889i() {
        C10562k a = this.f26321b.mo64121a();
        if (a != null) {
            return a;
        }
        return C10489b.m30637a();
    }

    /* renamed from: e */
    public ExecutorService mo64142e() {
        if (this.f26327h == null) {
            this.f26327h = m30890j();
        }
        return this.f26327h;
    }

    /* renamed from: j */
    private ExecutorService m30890j() {
        ExecutorService b = this.f26321b.mo64122b();
        if (b != null) {
            return b;
        }
        return C10491c.m30641a();
    }

    /* renamed from: f */
    public Map<String, List<C10523c>> mo64143f() {
        return this.f26320a;
    }

    /* renamed from: a */
    public C10522a mo64133a(C10523c cVar) {
        ImageView.ScaleType d = cVar.mo64082d();
        if (d == null) {
            d = C10522a.f26235a;
        }
        Bitmap.Config h = cVar.mo64086h();
        if (h == null) {
            h = C10522a.f26236b;
        }
        return new C10522a(cVar.mo64079b(), cVar.mo64081c(), d, h);
    }

    /* renamed from: g */
    public C10566o mo64144g() {
        if (this.f26328i == null) {
            this.f26328i = m30891k();
        }
        return this.f26328i;
    }

    /* renamed from: k */
    private C10566o m30891k() {
        C10566o g = this.f26321b.mo64127g();
        return g == null ? new C10538g() : g;
    }
}
