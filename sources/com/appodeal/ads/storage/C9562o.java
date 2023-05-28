package com.appodeal.ads.storage;

import com.appodeal.ads.C9422r0;
import com.appodeal.ads.C9690w4;
import com.appodeal.ads.C9725y4;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9531b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.storage.o */
public final class C9562o implements C9529a {

    /* renamed from: b */
    public static final C9562o f24251b = new C9562o();

    /* renamed from: a */
    public final /* synthetic */ C9531b f24252a = C9559m.m28214a();

    /* renamed from: a */
    public final Object mo60808a(C9422r0.C9423a aVar) {
        return this.f24252a.mo60779a(aVar);
    }

    /* renamed from: a */
    public final Object mo60765a(C9690w4 w4Var) {
        return this.f24252a.mo60765a(w4Var);
    }

    /* renamed from: a */
    public final Object mo60766a(C9725y4 y4Var) {
        return this.f24252a.mo60766a(y4Var);
    }

    /* renamed from: a */
    public final Object mo60767a(String str, C9725y4 y4Var) {
        return this.f24252a.mo60767a(str, y4Var);
    }

    /* renamed from: a */
    public final Object mo60809a(LinkedHashSet linkedHashSet, C9422r0.C9424b bVar) {
        return this.f24252a.mo60780a(linkedHashSet, bVar);
    }

    /* renamed from: a */
    public final Object mo60768a(ContinuationImpl continuationImpl) {
        return this.f24252a.mo60768a(continuationImpl);
    }

    /* renamed from: a */
    public final String mo60769a() {
        return this.f24252a.mo60769a();
    }

    /* renamed from: a */
    public final Triple<JSONObject, Long, Integer> mo60770a(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f24252a.mo60770a(str);
    }

    /* renamed from: a */
    public final void mo60771a(int i) {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        this.f24252a.mo60771a(i);
    }

    /* renamed from: a */
    public final void mo60772a(int i, long j, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "jsonString");
        this.f24252a.mo60772a(i, j, str, str2);
    }

    /* renamed from: a */
    public final void mo60810a(long j) {
        this.f24252a.mo60790c(j);
    }

    /* renamed from: a */
    public final void mo60811a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        this.f24252a.mo60783a(str, j);
    }

    /* renamed from: a */
    public final void mo60812a(String str, long j, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(str, Constants.UUID);
        this.f24252a.mo60784a(str, j, j2, j3, j4, j5);
    }

    /* renamed from: a */
    public final void mo60813a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(str2, "campaignData");
        this.f24252a.mo60785a(str, str2);
    }

    /* renamed from: a */
    public final void mo60814a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "campaigns");
        this.f24252a.mo60786a(jSONObject);
    }

    /* renamed from: b */
    public final int mo60773b() {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        return this.f24252a.mo60773b();
    }

    /* renamed from: b */
    public final void mo60774b(String str) {
        Intrinsics.checkNotNullParameter(str, "userToken");
        this.f24252a.mo60774b(str);
    }

    /* renamed from: b */
    public final void mo60815b(String str, long j) {
        Intrinsics.checkNotNullParameter(str, Constants.SESSIONS);
        this.f24252a.mo60788b(str, j);
    }

    /* renamed from: b */
    public final void mo60816b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f24252a.mo60789b(str, str2);
    }

    /* renamed from: c */
    public final String mo60775c() {
        return this.f24252a.mo60775c();
    }

    /* renamed from: c */
    public final void mo60776c(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f24252a.mo60776c(str);
    }

    /* renamed from: c */
    public final void mo60817c(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f24252a.mo60791c(str, j);
    }

    /* renamed from: c */
    public final void mo60818c(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "string");
        this.f24252a.mo60792c(str, str2);
    }

    /* renamed from: d */
    public final Long mo60819d() {
        C9531b bVar = this.f24252a;
        C9531b.C9532a aVar = C9531b.C9532a.Default;
        if (!bVar.mo60778a(aVar).contains("first_ad_session_launch_time")) {
            return null;
        }
        return Long.valueOf(bVar.mo60778a(aVar).getLong("first_ad_session_launch_time", 0));
    }

    /* renamed from: d */
    public final void mo60820d(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f24252a.mo60794d(str);
    }

    /* renamed from: e */
    public final String mo60821e(String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return this.f24252a.mo60795e(str);
    }

    /* renamed from: e */
    public final Map<String, String> mo60822e() {
        return this.f24252a.mo60798f();
    }

    /* renamed from: f */
    public final String mo60823f() {
        return this.f24252a.mo60778a(C9531b.C9532a.Default).getString(Constants.SESSIONS, (String) null);
    }

    /* renamed from: f */
    public final String mo60824f(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f24252a.mo60797f(str);
    }

    /* renamed from: g */
    public final Long mo60825g(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f24252a.mo60799g(str);
    }
}
