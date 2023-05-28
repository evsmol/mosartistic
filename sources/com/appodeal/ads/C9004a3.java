package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import com.appodeal.ads.networking.C9328b;
import com.appodeal.ads.services.C9513b;
import com.appodeal.ads.utils.Log;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* renamed from: com.appodeal.ads.a3 */
public final class C9004a3 {

    /* renamed from: a */
    public final C9261l1 f22785a;

    public C9004a3(C9261l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "getServiceOptions");
        this.f22785a = l1Var;
    }

    /* renamed from: a */
    public static Object m27120a(C9004a3 a3Var, Context context, C9328b bVar, C9680v4 v4Var) {
        ServicesRegistry a = C9513b.m28142a();
        boolean z = C9422r0.f23913b || C9182f1.m27291l() || C9422r0.f23915d == Log.LogLevel.verbose;
        String a2 = C9700x2.m28499a();
        C9174e1 e1Var = C9174e1.f23026a;
        Intrinsics.checkNotNullExpressionValue(e1Var, "instance");
        C9227j0 j0Var = C9227j0.f23188c;
        C9280m5 m5Var = C9280m5.f23344c;
        Intrinsics.checkNotNullExpressionValue(m5Var, "instance");
        a3Var.getClass();
        return CoroutineScopeKt.coroutineScope(new C9730z2(a3Var, context, bVar, z, a2, j0Var, e1Var, m5Var, a, (Continuation<? super C9730z2>) null), v4Var);
    }
}
