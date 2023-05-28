package com.criteo.publisher.model;

import com.criteo.publisher.model.C1261k;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.criteo.publisher.model.w */
/* compiled from: RemoteConfigRequest */
public abstract class C1282w {
    /* renamed from: a */
    public abstract String mo3500a();

    @SerializedName("cpId")
    /* renamed from: b */
    public abstract String mo3501b();

    /* renamed from: c */
    public abstract String mo3502c();

    /* renamed from: d */
    public abstract String mo3503d();

    @SerializedName("rtbProfileId")
    /* renamed from: e */
    public abstract int mo3504e();

    /* renamed from: f */
    public abstract String mo3506f();

    /* renamed from: a */
    public static C1282w m5688a(String str, String str2, String str3, int i, String str4) {
        return new C1261k(str, str2, str3, i, str4, "android");
    }

    /* renamed from: a */
    public static TypeAdapter<C1282w> m5689a(Gson gson) {
        return new C1261k.C1262a(gson);
    }
}
