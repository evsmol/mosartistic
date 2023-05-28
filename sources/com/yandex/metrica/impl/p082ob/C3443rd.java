package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.network.UserAgent;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.rd */
public final class C3443rd {

    /* renamed from: a */
    private static final Map<C3396qd, ExponentialBackoffDataHolder> f9007a = new LinkedHashMap();

    /* renamed from: b */
    private static final String f9008b = UserAgent.getFor("com.yandex.mobile.metrica.sdk", "5.3.0", "45003240");

    /* renamed from: c */
    public static final C3443rd f9009c = new C3443rd();

    private C3443rd() {
    }

    /* renamed from: a */
    private final synchronized ExponentialBackoffDataHolder m10614a(C3396qd qdVar) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        Map<C3396qd, ExponentialBackoffDataHolder> map = f9007a;
        exponentialBackoffDataHolder = map.get(qdVar);
        if (exponentialBackoffDataHolder == null) {
            C2007F0 g = C2007F0.m7154g();
            Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
            C2917e9 s = g.mo15756s();
            Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…ance().servicePreferences");
            exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C3349pd(s, qdVar));
            map.put(qdVar, exponentialBackoffDataHolder);
        }
        return exponentialBackoffDataHolder;
    }

    /* renamed from: a */
    public static final NetworkTask m10616a(Context context, ConfigProvider<C1943D4> configProvider, C2851c0 c0Var, C1976E4 e4, C2827b8 b8Var) {
        FullUrlFormer fullUrlFormer = new FullUrlFormer(new C2401Og(), configProvider);
        C2068Gm gm = new C2068Gm();
        Context context2 = context;
        C3318od odVar = new C3318od(context);
        C3156ld ldVar = new C3156ld(f9009c.m10614a(C3396qd.DIAGNOSTIC));
        C1881B4 b4 = new C1881B4(configProvider, c0Var, e4, b8Var, new DefaultNetworkResponseHandler(), new RequestDataHolder(), new ResponseDataHolder(new C3259nd()), fullUrlFormer);
        return new NetworkTask(gm, odVar, ldVar, b4, CollectionsKt.listOf(C1848A2.m6793a()), f9008b);
    }

    /* renamed from: a */
    public static final NetworkTask m10615a(Context context, C2995gd gdVar, C3464s2 s2Var, C2022Fc fc) {
        C3743zm zmVar = new C3743zm();
        C2434Pg pg = new C2434Pg(zmVar);
        C1908C0 c0 = new C1908C0(gdVar);
        Context context2 = context;
        return new NetworkTask(new C2068Gm(), new C3318od(context2), new C3156ld(f9009c.m10614a(C3396qd.LOCATION)), new C2865cd(context2, s2Var, fc, pg, c0, new RequestDataHolder(), new ResponseDataHolder(new C3259nd()), new FullUrlFormer(pg, c0), zmVar), CollectionsKt.listOf(C1848A2.m6793a()), f9008b);
    }

    /* renamed from: a */
    public static final NetworkTask m10617a(C2259L3 l3) {
        C3743zm zmVar = new C3743zm();
        C2460Qg qg = new C2460Qg(zmVar);
        C2259L3 l32 = l3;
        C2879d1 d1Var = new C2879d1(l32);
        return new NetworkTask(new C2068Gm(), new C3318od(l3.mo16129g()), new C3156ld(f9009c.m10614a(C3396qd.REPORT)), new C2412P1(l32, qg, d1Var, new FullUrlFormer(qg, d1Var), new RequestDataHolder(), new ResponseDataHolder(new C3259nd()), zmVar), CollectionsKt.listOf(C1848A2.m6793a()), f9008b);
    }

    /* renamed from: a */
    public static final NetworkTask m10618a(C3450ri riVar, C2312Mg mg) {
        C2244Kg kg = new C2244Kg();
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        C2494Rg rg = new C2494Rg(kg, g.mo15747j());
        C1908C0 c0 = new C1908C0(mg);
        C2467Qm qm = new C2467Qm();
        C3318od odVar = new C3318od(riVar.mo18173b());
        C3156ld ldVar = new C3156ld(f9009c.m10614a(C3396qd.STARTUP));
        C3384q2 q2Var = new C3384q2(riVar, new FullUrlFormer(rg, c0), new RequestDataHolder(), new ResponseDataHolder(new C3259nd()), c0);
        return new NetworkTask(qm, odVar, ldVar, q2Var, CollectionsKt.emptyList(), f9008b);
    }
}
