package com.appodeal.ads.context;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.context.e */
public final class C9152e extends Lambda implements Function1<Activity, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9153f f22961a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9152e(C9153f fVar) {
        super(1);
        this.f22961a = fVar;
    }

    public final Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        Intrinsics.checkNotNullParameter(activity, "destroyedActivity");
        C9153f.m27237a(this.f22961a, activity);
        return Unit.INSTANCE;
    }
}
