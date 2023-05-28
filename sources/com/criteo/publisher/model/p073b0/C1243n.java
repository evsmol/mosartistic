package com.criteo.publisher.model.p073b0;

import com.criteo.publisher.model.p073b0.C1224b;
import com.criteo.publisher.model.p073b0.C1232h;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.criteo.publisher.model.b0.n */
/* compiled from: NativeAssets */
public abstract class C1243n {
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C1242m mo3428b();

    /* access modifiers changed from: package-private */
    @SerializedName("products")
    /* renamed from: h */
    public abstract List<C1248r> mo3430h();

    /* access modifiers changed from: package-private */
    @SerializedName("impressionPixels")
    /* renamed from: i */
    public abstract List<C1246p> mo3432i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract C1247q mo3433j();

    /* renamed from: a */
    public static TypeAdapter<C1243n> m5525a(Gson gson) {
        return new C1232h.C1233a(gson);
    }

    /* renamed from: n */
    public C1248r mo3491n() {
        return mo3430h().iterator().next();
    }

    /* renamed from: c */
    public String mo3483c() {
        return mo3428b().mo3421a();
    }

    /* renamed from: d */
    public String mo3484d() {
        return mo3428b().mo3422b();
    }

    /* renamed from: f */
    public URL mo3486f() {
        return mo3428b().mo3423c().mo3442a();
    }

    /* renamed from: e */
    public URI mo3485e() {
        return mo3428b().mo3424d();
    }

    /* renamed from: l */
    public URI mo3489l() {
        return mo3433j().mo3450a();
    }

    /* renamed from: m */
    public URL mo3490m() {
        return mo3433j().mo3451b();
    }

    /* renamed from: k */
    public String mo3488k() {
        return mo3433j().mo3452c();
    }

    /* renamed from: g */
    public List<URL> mo3487g() {
        ArrayList arrayList = new ArrayList();
        for (C1246p a : mo3432i()) {
            arrayList.add(a.mo3446a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C1244a m5524a() {
        return new C1224b.C1225a();
    }

    /* renamed from: com.criteo.publisher.model.b0.n$a */
    /* compiled from: NativeAssets */
    static abstract class C1244a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1244a mo3435a(C1242m mVar);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1244a mo3436a(C1247q qVar);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1244a mo3437a(List<C1248r> list);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1243n mo3438a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1244a mo3439b(List<C1246p> list);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract List<C1248r> mo3440c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract List<C1246p> mo3441d();

        C1244a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1243n mo3492b() {
            if (mo3440c().isEmpty()) {
                throw new JsonParseException("Expect that native payload has, at least, one product.");
            } else if (!mo3441d().isEmpty()) {
                return mo3438a();
            } else {
                throw new JsonParseException("Expect that native payload has, at least, one impression pixel.");
            }
        }
    }
}
