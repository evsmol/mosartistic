package com.appodeal.ads.regulator;

import android.content.Context;
import com.appodeal.ads.regulator.usecases.C9461a;
import com.appodeal.consent.ConsentManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.appodeal.ads.regulator.c */
public final class C9447c {
    /* renamed from: a */
    public static C9448d m27957a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C9448d(context, new C9461a(ConsentManager.INSTANCE), CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()));
    }
}
