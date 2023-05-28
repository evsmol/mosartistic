package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.segments.C9495j;
import com.appodeal.ads.segments.C9503n;
import com.appodeal.ads.segments.C9507o;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.v1 */
public final class C9677v1 {

    /* renamed from: a */
    public final Context f24502a;

    public C9677v1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24502a = context;
    }

    /* renamed from: a */
    public final void mo61209a(JSONObject jSONObject) {
        if (C9495j.m28104b().mo60750b(jSONObject)) {
            Context context = this.f24502a;
            Lazy lazy = C9503n.f24120a;
            C9503n.m28132a(context, (Function0<Unit>) C9507o.f24128a);
        }
    }
}
