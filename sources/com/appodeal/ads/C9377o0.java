package com.appodeal.ads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.appodeal.ads.o0 */
public final class C9377o0 extends Lambda implements Function0<CoroutineScope> {

    /* renamed from: a */
    public static final C9377o0 f23798a = new C9377o0();

    public C9377o0() {
        super(0);
    }

    public final Object invoke() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }
}
