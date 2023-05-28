package com.appodeal.ads.context;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.context.d */
public final class C9151d extends Lambda implements Function1<Activity, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9153f f22960a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9151d(C9153f fVar) {
        super(1);
        this.f22960a = fVar;
    }

    public final Object invoke(Object obj) {
        C9153f.m27238b(this.f22960a, (Activity) obj);
        return Unit.INSTANCE;
    }
}
