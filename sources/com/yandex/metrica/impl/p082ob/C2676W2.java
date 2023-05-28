package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.W2 */
public final class C2676W2 {

    /* renamed from: a */
    private static final YandexMetricaPlugins f7073a;

    static {
        C2410P g = C2410P.m8089g();
        Intrinsics.checkNotNullExpressionValue(g, "ClientServiceLocator.getInstance()");
        ICommonExecutor c = g.mo16430c();
        Intrinsics.checkNotNullExpressionValue(c, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f7073a = new C2649V2(new C2563Tf(c));
    }

    /* renamed from: a */
    public static final YandexMetricaPlugins m8800a() {
        return f7073a;
    }
}
