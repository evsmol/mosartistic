package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.context.C9148b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.storage.q */
public final class C9564q {

    /* renamed from: a */
    public final Lazy f24255a;

    public C9564q(C9148b bVar, String str) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(bVar, "contextProvider");
        this.f24255a = LazyKt.lazy(new C9563p(bVar, str));
    }

    /* renamed from: a */
    public final SharedPreferences mo60826a() {
        Object value = this.f24255a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }
}
