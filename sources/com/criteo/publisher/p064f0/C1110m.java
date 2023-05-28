package com.criteo.publisher.p064f0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p064f0.C1118r;
import com.criteo.publisher.p074n0.C1309m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;

/* renamed from: com.criteo.publisher.f0.m */
/* compiled from: FileMetricRepository */
class C1110m extends C1118r {

    /* renamed from: a */
    private final C1195g f3593a = C1197h.m5407b(getClass());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1114o f3594b;

    /* renamed from: c */
    private final ConcurrentMap<File, C1090d0> f3595c = new ConcurrentHashMap();

    C1110m(C1114o oVar) {
        this.f3594b = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3207a(String str, C1118r.C1119a aVar) {
        try {
            m5133a(this.f3594b.mo3213a(str)).mo3185a(aVar);
        } catch (IOException e) {
            this.f3593a.mo3338a("Error while updating metric", (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3206a(String str, C1116p pVar) {
        try {
            m5133a(this.f3594b.mo3213a(str)).mo3184a(pVar);
        } catch (IOException e) {
            this.f3593a.mo3338a("Error while moving metric", (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection<C1112n> mo3205a() {
        Collection<File> b = this.f3594b.mo3214b();
        ArrayList arrayList = new ArrayList(b.size());
        for (File a : b) {
            try {
                arrayList.add(m5133a(a).mo3186b());
            } catch (IOException e) {
                this.f3593a.mo3338a("Error while reading metric", (Throwable) e);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3209b() {
        int i = 0;
        for (File length : this.f3594b.mo3214b()) {
            i = (int) (((long) i) + length.length());
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3208a(String str) {
        return this.f3594b.mo3214b().contains(this.f3594b.mo3213a(str));
    }

    /* renamed from: com.criteo.publisher.f0.m$a */
    /* compiled from: FileMetricRepository */
    class C1111a implements Function0<C1090d0> {

        /* renamed from: a */
        final /* synthetic */ File f3596a;

        C1111a(File file) {
            this.f3596a = file;
        }

        /* renamed from: a */
        public C1090d0 invoke() {
            return C1110m.this.f3594b.mo3211a(this.f3596a);
        }
    }

    /* renamed from: a */
    private C1090d0 m5133a(File file) {
        return (C1090d0) C1309m.m5776a(this.f3595c, file, new C1111a(file));
    }
}
