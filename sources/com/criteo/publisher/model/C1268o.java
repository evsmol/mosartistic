package com.criteo.publisher.model;

import com.criteo.publisher.model.C1255h;
import com.criteo.publisher.p070l0.p071d.C1177c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.criteo.publisher.model.o */
/* compiled from: CdbRequest */
public abstract class C1268o {
    @SerializedName("gdprConsent")
    /* renamed from: a */
    public abstract C1177c mo3393a();

    /* renamed from: b */
    public abstract String mo3394b();

    /* renamed from: c */
    public abstract int mo3395c();

    /* renamed from: d */
    public abstract C1281v mo3396d();

    /* renamed from: e */
    public abstract String mo3397e();

    /* renamed from: f */
    public abstract List<C1270q> mo3399f();

    /* renamed from: g */
    public abstract C1285z mo3400g();

    /* renamed from: a */
    public static C1268o m5609a(String str, C1281v vVar, C1285z zVar, String str2, int i, C1177c cVar, List<C1270q> list) {
        return new C1255h(str, vVar, zVar, str2, i, cVar, list);
    }

    /* renamed from: a */
    public static TypeAdapter<C1268o> m5610a(Gson gson) {
        return new C1255h.C1256a(gson);
    }
}
