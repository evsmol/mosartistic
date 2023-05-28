package com.criteo.publisher.model;

import com.criteo.publisher.model.C1259j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* renamed from: com.criteo.publisher.model.v */
/* compiled from: Publisher */
public abstract class C1281v {
    /* renamed from: a */
    public abstract String mo3494a();

    @SerializedName("cpId")
    /* renamed from: b */
    public abstract String mo3495b();

    /* renamed from: c */
    public abstract Map<String, Object> mo3496c();

    /* renamed from: a */
    public static C1281v m5683a(String str, String str2, Map<String, Object> map) {
        return new C1259j(str, str2, map);
    }

    /* renamed from: a */
    public static TypeAdapter<C1281v> m5684a(Gson gson) {
        return new C1259j.C1260a(gson);
    }
}
