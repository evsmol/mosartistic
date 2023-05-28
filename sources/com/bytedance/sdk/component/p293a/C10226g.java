package com.bytedance.sdk.component.p293a;

import com.bytedance.sdk.component.p293a.C10221d;
import com.bytedance.sdk.component.p293a.C10247t;
import com.bytedance.sdk.component.p293a.C10250v;
import com.bytedance.sdk.component.p293a.C10255w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: com.bytedance.sdk.component.a.g */
/* compiled from: CallHandler */
class C10226g implements C10255w.C10256a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10230h f25247a;

    /* renamed from: b */
    private final C10249u f25248b;

    /* renamed from: c */
    private final Map<String, C10219b> f25249c = new HashMap();

    /* renamed from: d */
    private final Map<String, C10221d.C10223b> f25250d = new HashMap();

    /* renamed from: e */
    private final List<C10242q> f25251e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Set<C10221d> f25252f = new HashSet();

    /* renamed from: g */
    private final C10238m f25253g;

    /* renamed from: h */
    private final boolean f25254h;

    /* renamed from: i */
    private final boolean f25255i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10217a f25256j;

    C10226g(C10232j jVar, C10217a aVar, C10250v vVar) {
        this.f25256j = aVar;
        this.f25247a = jVar.f25269d;
        C10249u uVar = new C10249u(vVar, jVar.f25277l, jVar.f25278m);
        this.f25248b = uVar;
        uVar.mo63079a((C10255w.C10256a) this);
        this.f25248b.mo63078a(jVar.f25281p);
        this.f25253g = jVar.f25274i;
        this.f25254h = jVar.f25273h;
        this.f25255i = jVar.f25280o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10229a mo63036a(C10242q qVar, C10225f fVar) throws Exception {
        C10219b bVar = this.f25249c.get(qVar.f25286d);
        if (bVar != null) {
            try {
                C10257x b = m29363b(fVar.f25244b, bVar);
                fVar.f25246d = b;
                if (b == null) {
                    if (this.f25253g != null) {
                        this.f25253g.mo63057a(fVar.f25244b, qVar.f25286d, 1);
                    }
                    C10231i.m29376a("Permission denied, call: " + qVar);
                    throw new C10246s(-1);
                } else if (bVar instanceof C10224e) {
                    C10231i.m29376a("Processing stateless call: " + qVar);
                    return m29359a(qVar, (C10224e) bVar, fVar);
                } else if (bVar instanceof C10220c) {
                    C10231i.m29376a("Processing raw call: " + qVar);
                    return m29357a(qVar, (C10220c) bVar, b);
                }
            } catch (C10250v.C10252a e) {
                C10231i.m29377a("No remote permission config fetched, call pending: " + qVar, e);
                this.f25251e.add(qVar);
                return new C10229a(false, C10258y.m29450a());
            }
        }
        C10221d.C10223b bVar2 = this.f25250d.get(qVar.f25286d);
        if (bVar2 != null) {
            C10221d a = bVar2.mo2557a();
            a.mo63025a(qVar.f25286d);
            C10257x b2 = m29363b(fVar.f25244b, a);
            fVar.f25246d = b2;
            if (b2 != null) {
                C10231i.m29376a("Processing stateful call: " + qVar);
                return m29358a(qVar, a, fVar);
            }
            C10231i.m29376a("Permission denied, call: " + qVar);
            a.mo63032e();
            throw new C10246s(-1);
        }
        C10238m mVar = this.f25253g;
        if (mVar != null) {
            mVar.mo63057a(fVar.f25244b, qVar.f25286d, 2);
        }
        C10231i.m29379b("Received call: " + qVar + ", but not registered.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63039a(String str, C10224e<?, ?> eVar) {
        eVar.mo63025a(str);
        this.f25249c.put(str, eVar);
        C10231i.m29376a("JsBridge stateless method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63038a(String str, C10221d.C10223b bVar) {
        this.f25250d.put(str, bVar);
        C10231i.m29376a("JsBridge stateful method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63037a() {
        for (C10221d f : this.f25252f) {
            f.mo63033f();
        }
        this.f25252f.clear();
        this.f25249c.clear();
        this.f25250d.clear();
        this.f25248b.mo63081b(this);
    }

    /* renamed from: a */
    private C10229a m29359a(C10242q qVar, C10224e eVar, C10225f fVar) throws Exception {
        return new C10229a(true, C10258y.m29451a(this.f25247a.mo63041a(eVar.mo216a(m29360a(qVar.f25287e, (C10219b) eVar), fVar))));
    }

    /* renamed from: a */
    private C10229a m29358a(final C10242q qVar, final C10221d dVar, C10225f fVar) throws Exception {
        this.f25252f.add(dVar);
        dVar.mo63029a(m29360a(qVar.f25287e, (C10219b) dVar), fVar, new C10221d.C10222a() {
            /* renamed from: a */
            public void mo63034a(Object obj) {
                if (C10226g.this.f25256j != null) {
                    C10226g.this.f25256j.mo63021b(C10258y.m29451a(C10226g.this.f25247a.mo63041a(obj)), qVar);
                    C10226g.this.f25252f.remove(dVar);
                }
            }

            /* renamed from: a */
            public void mo63035a(Throwable th) {
                if (C10226g.this.f25256j != null) {
                    C10226g.this.f25256j.mo63021b(C10258y.m29452a(th), qVar);
                    C10226g.this.f25252f.remove(dVar);
                }
            }
        });
        return new C10229a(false, C10258y.m29450a());
    }

    /* renamed from: a */
    private C10229a m29357a(final C10242q qVar, C10220c cVar, C10257x xVar) throws Exception {
        cVar.mo63027a(qVar, new C10247t(qVar.f25286d, xVar, new C10247t.C10248a() {
        }));
        return new C10229a(false, C10258y.m29450a());
    }

    /* renamed from: a */
    private Object m29360a(String str, C10219b bVar) throws JSONException {
        return this.f25247a.mo63040a(str, m29361a((Object) bVar)[0]);
    }

    /* renamed from: b */
    private C10257x m29363b(String str, C10219b bVar) {
        if (this.f25255i) {
            return C10257x.PRIVATE;
        }
        return this.f25248b.mo63077a(this.f25254h, str, bVar);
    }

    /* renamed from: a */
    private static Type[] m29361a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* renamed from: com.bytedance.sdk.component.a.g$a */
    /* compiled from: CallHandler */
    static final class C10229a {

        /* renamed from: a */
        boolean f25262a;

        /* renamed from: b */
        String f25263b;

        private C10229a(boolean z, String str) {
            this.f25262a = z;
            this.f25263b = str;
        }
    }
}
