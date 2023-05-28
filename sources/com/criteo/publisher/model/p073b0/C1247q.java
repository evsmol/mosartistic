package com.criteo.publisher.model.p073b0;

import com.criteo.publisher.model.p073b0.C1238k;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.q */
/* compiled from: NativePrivacy */
public abstract class C1247q {
    /* access modifiers changed from: package-private */
    @SerializedName("optoutClickUrl")
    /* renamed from: a */
    public abstract URI mo3450a();

    /* access modifiers changed from: package-private */
    @SerializedName("optoutImageUrl")
    /* renamed from: b */
    public abstract URL mo3451b();

    /* access modifiers changed from: package-private */
    @SerializedName("longLegalText")
    /* renamed from: c */
    public abstract String mo3452c();

    /* renamed from: a */
    public static TypeAdapter<C1247q> m5551a(Gson gson) {
        return new C1238k.C1239a(gson);
    }
}
