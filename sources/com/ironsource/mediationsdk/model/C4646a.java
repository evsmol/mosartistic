package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.a */
public final class C4646a {

    /* renamed from: a */
    public NetworkSettings f11591a;

    /* renamed from: b */
    public JSONObject f11592b;

    /* renamed from: c */
    public boolean f11593c;

    /* renamed from: d */
    public int f11594d;

    /* renamed from: e */
    public int f11595e;

    /* renamed from: f */
    public IronSource.AD_UNIT f11596f;

    public C4646a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f11591a = networkSettings;
        this.f11592b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f11594d = optInt;
        this.f11593c = optInt == 2;
        this.f11595e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f11596f = ad_unit;
    }
}
