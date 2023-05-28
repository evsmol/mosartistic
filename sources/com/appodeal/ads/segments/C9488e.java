package com.appodeal.ads.segments;

import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.segments.e */
public final class C9488e extends Lambda implements Function0<Integer> {

    /* renamed from: a */
    public final /* synthetic */ C9489f f24084a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9488e(C9489f fVar) {
        super(0);
        this.f24084a = fVar;
    }

    public final Object invoke() {
        int i;
        Integer valueOf = Integer.valueOf(this.f24084a.f24085a.mo60773b());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf == null) {
            Integer valueOf2 = Integer.valueOf(new Random().nextInt(100) + 1);
            this.f24084a.f24085a.mo60771a(valueOf2.intValue());
            i = valueOf2.intValue();
        } else {
            i = valueOf.intValue();
        }
        return Integer.valueOf(i);
    }
}
