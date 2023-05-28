package com.criteo.publisher.model;

import com.criteo.publisher.model.C1265m;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* renamed from: com.criteo.publisher.model.z */
/* compiled from: User */
public abstract class C1285z {
    /* renamed from: a */
    public abstract String mo3522a();

    /* renamed from: b */
    public abstract String mo3523b();

    /* renamed from: c */
    public abstract String mo3524c();

    /* renamed from: d */
    public abstract Map<String, Object> mo3525d();

    /* renamed from: e */
    public abstract String mo3526e();

    /* renamed from: f */
    public abstract String mo3528f();

    /* renamed from: g */
    public abstract String mo3529g();

    /* renamed from: a */
    public static C1285z m5710a(String str, String str2, String str3, String str4, Map<String, Object> map) {
        return new C1265m(str, "gaid", "android", str2, str3, str4, map);
    }

    /* renamed from: a */
    public static TypeAdapter<C1285z> m5711a(Gson gson) {
        return new C1265m.C1266a(gson);
    }
}
