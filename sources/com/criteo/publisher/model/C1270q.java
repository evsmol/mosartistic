package com.criteo.publisher.model;

import com.criteo.publisher.model.C1257i;
import com.criteo.publisher.p074n0.C1288a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.criteo.publisher.model.q */
/* compiled from: CdbRequestSlot */
public abstract class C1270q {
    @SerializedName("impId")
    /* renamed from: a */
    public abstract String mo3412a();

    @SerializedName("placementId")
    /* renamed from: b */
    public abstract String mo3413b();

    @SerializedName("sizes")
    /* renamed from: c */
    public abstract Collection<String> mo3414c();

    @SerializedName("interstitial")
    /* renamed from: d */
    public abstract Boolean mo3415d();

    @SerializedName("isNative")
    /* renamed from: e */
    public abstract Boolean mo3416e();

    @SerializedName("rewarded")
    /* renamed from: f */
    public abstract Boolean mo3418f();

    /* renamed from: a */
    public static C1270q m5624a(String str, String str2, C1288a aVar, AdSize adSize) {
        return new C1257i(str, str2, aVar == C1288a.CRITEO_CUSTOM_NATIVE ? true : null, aVar == C1288a.CRITEO_INTERSTITIAL ? true : null, aVar == C1288a.CRITEO_REWARDED ? true : null, Collections.singletonList(adSize.getFormattedSize()));
    }

    /* renamed from: a */
    public static TypeAdapter<C1270q> m5625a(Gson gson) {
        return new C1257i.C1258a(gson);
    }
}
