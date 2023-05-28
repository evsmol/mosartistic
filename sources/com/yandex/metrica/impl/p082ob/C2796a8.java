package com.yandex.metrica.impl.p082ob;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.a8 */
public final class C2796a8 {

    /* renamed from: a */
    private final C2860c8 f7380a;

    /* renamed from: com.yandex.metrica.impl.ob.a8$a */
    static final class C2797a implements C2887d8 {

        /* renamed from: a */
        public static final C2797a f7381a = new C2797a();

        C2797a() {
        }

        /* renamed from: a */
        public final JSONObject mo17171a(JSONObject jSONObject, JSONObject jSONObject2) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("device_id", C2572Tl.m8516a(jSONObject, jSONObject2, "device_id"));
            jSONObject3.put("device_id_hash", C2572Tl.m8516a(jSONObject, jSONObject2, "device_id_hash"));
            jSONObject3.put("referrer", C2572Tl.m8516a(jSONObject, jSONObject2, "referrer"));
            jSONObject3.put("referrer_checked", C2572Tl.m8508a(jSONObject2, "referrer_checked", C2572Tl.m8508a(jSONObject, "referrer_checked", Boolean.FALSE)));
            jSONObject3.put("location_id", C2572Tl.m8510a(jSONObject2, "location_id", C2572Tl.m8510a(jSONObject, "location_id", (Long) -1L)));
            jSONObject3.put("lbs_id", C2572Tl.m8510a(jSONObject2, "lbs_id", C2572Tl.m8510a(jSONObject, "lbs_id", (Long) -1L)));
            jSONObject3.put("location_request_id", C2572Tl.m8510a(jSONObject2, "location_request_id", C2572Tl.m8510a(jSONObject, "location_request_id", (Long) -1L)));
            jSONObject3.put("last_migration_api_level", C2572Tl.m8509a(jSONObject2, "last_migration_api_level", C2572Tl.m8509a(jSONObject, "last_migration_api_level", (Integer) -1)));
            return jSONObject3;
        }
    }

    public C2796a8(C2945f8 f8Var, C2945f8 f8Var2) {
        this.f7380a = new C2860c8(f8Var, f8Var2, "[VitalCommonDataProvider]", C2797a.f7381a);
    }

    /* renamed from: a */
    public final synchronized String mo17154a() {
        return C2572Tl.m8530b(this.f7380a.mo17381a(), "device_id");
    }

    /* renamed from: b */
    public final synchronized String mo17161b() {
        return C2572Tl.m8530b(this.f7380a.mo17381a(), "device_id_hash");
    }

    /* renamed from: c */
    public final synchronized void mo17165c(long j) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("location_request_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…CATION_REQUEST_ID, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: d */
    public final synchronized long mo17166d() {
        return this.f7380a.mo17381a().optLong("lbs_id", -1);
    }

    /* renamed from: e */
    public final synchronized long mo17167e() {
        return this.f7380a.mo17381a().optLong("location_id", -1);
    }

    /* renamed from: f */
    public final synchronized long mo17168f() {
        return this.f7380a.mo17381a().optLong("location_request_id", -1);
    }

    /* renamed from: g */
    public final synchronized C2895dg mo17169g() {
        C2895dg dgVar;
        String b = C2572Tl.m8530b(this.f7380a.mo17381a(), "referrer");
        if (b != null) {
            try {
                byte[] bytes = b.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                dgVar = C2895dg.m9369a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
            }
        }
        dgVar = null;
        return dgVar;
    }

    /* renamed from: h */
    public final synchronized boolean mo17170h() {
        return this.f7380a.mo17381a().optBoolean("referrer_checked", false);
    }

    /* renamed from: a */
    public final synchronized void mo17158a(String str) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("device_id", str);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…put(KEY_DEVICE_ID, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: b */
    public final synchronized void mo17163b(String str) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("device_id_hash", str);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…EY_DEVICE_ID_HASH, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: c */
    public final synchronized int mo17164c() {
        return this.f7380a.mo17381a().optInt("last_migration_api_level", -1);
    }

    /* renamed from: a */
    public final synchronized void mo17157a(C2895dg dgVar) {
        String str;
        C2860c8 c8Var = this.f7380a;
        JSONObject a = c8Var.mo17381a();
        if (dgVar != null) {
            byte[] encode = Base64.encode(dgVar.mo17458a(), 0);
            Intrinsics.checkNotNullExpressionValue(encode, "Base64.encode(toProto(), 0)");
            str = new String(encode, Charsets.UTF_8);
        } else {
            str = null;
        }
        JSONObject put = a.put("referrer", str);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…value?.toEncodedString())");
        c8Var.mo17382a(put);
    }

    /* renamed from: b */
    public final synchronized void mo17162b(long j) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("location_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…t(KEY_LOCATION_ID, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: a */
    public final synchronized void mo17160a(boolean z) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("referrer_checked", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…_REFERRER_CHECKED, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: a */
    public final synchronized void mo17156a(long j) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("lbs_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…().put(KEY_LBS_ID, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: a */
    public final synchronized void mo17155a(int i) {
        C2860c8 c8Var = this.f7380a;
        JSONObject put = c8Var.mo17381a().put("last_migration_api_level", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…GRATION_API_LEVEL, value)");
        c8Var.mo17382a(put);
    }

    /* renamed from: a */
    public final synchronized void mo17159a(String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3, Integer num) {
        JSONObject put = new JSONObject().put("device_id", str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put("location_id", l).put("lbs_id", l2).put("location_request_id", l3).put("last_migration_api_level", num);
        C2860c8 c8Var = this.f7380a;
        Intrinsics.checkNotNullExpressionValue(put, "json");
        c8Var.mo17382a(put);
    }
}
