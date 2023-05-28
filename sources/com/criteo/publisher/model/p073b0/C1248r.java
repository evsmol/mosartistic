package com.criteo.publisher.model.p073b0;

import com.criteo.publisher.model.p073b0.C1240l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.net.URI;
import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.r */
/* compiled from: NativeProduct */
public abstract class C1248r {
    /* renamed from: a */
    public abstract String mo3456a();

    /* renamed from: b */
    public abstract URI mo3457b();

    /* renamed from: c */
    public abstract String mo3458c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C1245o mo3459d();

    /* renamed from: f */
    public abstract String mo3461f();

    /* renamed from: g */
    public abstract String mo3462g();

    /* renamed from: a */
    public static TypeAdapter<C1248r> m5555a(Gson gson) {
        return new C1240l.C1241a(gson);
    }

    /* renamed from: e */
    public URL mo3493e() {
        return mo3459d().mo3442a();
    }
}
