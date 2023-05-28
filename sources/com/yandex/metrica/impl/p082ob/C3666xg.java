package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.p082ob.C2895dg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xg */
public final class C3666xg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2780Zl<C2895dg.C2896a, Integer> f9467a;

    /* renamed from: b */
    private final long f9468b;

    /* renamed from: c */
    private final String f9469c;

    /* renamed from: d */
    private final String f9470d;

    /* renamed from: e */
    private final Context f9471e;

    /* renamed from: f */
    private final C3241mn f9472f;

    /* renamed from: g */
    private final C2291M0 f9473g;

    /* renamed from: com.yandex.metrica.impl.ob.xg$a */
    public static final class C3667a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Comparable) ((Pair) t).getSecond(), (Comparable) ((Pair) t2).getSecond());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xg$b */
    static final class C3668b<T> implements Comparator<C2895dg> {

        /* renamed from: a */
        final /* synthetic */ C3666xg f9474a;

        C3668b(C3666xg xgVar) {
            this.f9474a = xgVar;
        }

        /* renamed from: a */
        public final int compare(C2895dg dgVar, C2895dg dgVar2) {
            int sign = MathKt.getSign(dgVar.f7647c - dgVar2.f7647c);
            if (sign != 0) {
                return sign;
            }
            int intValue = ((Number) this.f9474a.f9467a.mo17126a(dgVar.f7648d)).intValue();
            Object a = this.f9474a.f9467a.mo17126a(dgVar2.f7648d);
            Intrinsics.checkNotNullExpressionValue(a, "sourcePriorities[second.source]");
            return intValue - ((Number) a).intValue();
        }
    }

    public C3666xg(Context context, C3241mn mnVar, C2291M0 m0) {
        this.f9471e = context;
        this.f9472f = mnVar;
        this.f9473g = m0;
        C2780Zl<C2895dg.C2896a, Integer> zl = new C2780Zl<>(0);
        zl.mo17128a(C2895dg.C2896a.HMS, 1);
        zl.mo17128a(C2895dg.C2896a.GP, 2);
        this.f9467a = zl;
        this.f9468b = TimeUnit.DAYS.toSeconds(1);
        this.f9469c = "com.android.vending";
        this.f9470d = "com.huawei.appmarket";
    }

    /* renamed from: c */
    private final JSONObject m11033c(C2895dg dgVar) {
        JSONObject put = new JSONObject().put("referrer", dgVar.f7645a).put("install_timestamp_seconds", dgVar.f7647c).put("click_timestamp_seconds", dgVar.f7646b).put("source", dgVar.f7648d.f7653a);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …eferrerInfo.source.value)");
        return put;
    }

    /* renamed from: b */
    public final boolean mo18407b(C2895dg dgVar) {
        String str = dgVar != null ? dgVar.f7645a : null;
        return !(str == null || str.length() == 0);
    }

    /* renamed from: a */
    public final boolean mo18406a(C2895dg dgVar) {
        if (dgVar == null) {
            return false;
        }
        C3241mn mnVar = this.f9472f;
        Context context = this.f9471e;
        String packageName = context.getPackageName();
        mnVar.getClass();
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (C1848A2.m6808a(30)) {
                str = C3294nn.m10192a(packageManager, packageName);
            } else {
                str = packageManager.getInstallerPackageName(packageName);
            }
        } catch (Throwable unused) {
        }
        int ordinal = dgVar.f7648d.ordinal();
        if (ordinal == 1) {
            return Intrinsics.areEqual((Object) this.f9469c, (Object) str);
        }
        if (ordinal != 2) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f9470d, (Object) str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3666xg(android.content.Context r1, com.yandex.metrica.impl.p082ob.C3241mn r2, com.yandex.metrica.impl.p082ob.C2291M0 r3, int r4) {
        /*
            r0 = this;
            r2 = r4 & 2
            r3 = 0
            if (r2 == 0) goto L_0x000b
            com.yandex.metrica.impl.ob.mn r2 = new com.yandex.metrica.impl.ob.mn
            r2.<init>()
            goto L_0x000c
        L_0x000b:
            r2 = r3
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0019
            com.yandex.metrica.impl.ob.M0 r3 = com.yandex.metrica.impl.p082ob.C3322oh.m10248a()
            java.lang.String r4 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L_0x0019:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3666xg.<init>(android.content.Context, com.yandex.metrica.impl.ob.mn, com.yandex.metrica.impl.ob.M0, int):void");
    }

    /* renamed from: a */
    public final C2895dg mo18405a(List<C2895dg> list) {
        C2895dg dgVar = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        C3241mn mnVar = this.f9472f;
        Context context = this.f9471e;
        PackageInfo b = mnVar.mo17880b(context, context.getPackageName(), 0);
        if (b != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b.firstInstallTime);
            C3667a aVar = new C3667a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                C2895dg dgVar2 = (C2895dg) it.next();
                Pair pair = TuplesKt.m14544to(dgVar2, Long.valueOf(Math.abs(dgVar2.f7647c - seconds)));
                while (it.hasNext()) {
                    C2895dg dgVar3 = (C2895dg) it.next();
                    Pair pair2 = TuplesKt.m14544to(dgVar3, Long.valueOf(Math.abs(dgVar3.f7647c - seconds)));
                    if (aVar.compare(pair, pair2) > 0) {
                        pair = pair2;
                    }
                }
                C2895dg dgVar4 = (C2895dg) pair.component1();
                if (((Number) pair.component2()).longValue() < this.f9468b) {
                    dgVar = dgVar4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (dgVar == null) {
            C3668b bVar = new C3668b(this);
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                C2895dg dgVar5 = (C2895dg) it2.next();
                while (it2.hasNext()) {
                    C2895dg dgVar6 = (C2895dg) it2.next();
                    if (bVar.compare(dgVar5, dgVar6) < 0) {
                        dgVar5 = dgVar6;
                    }
                }
                dgVar = dgVar5;
            } else {
                throw new NoSuchElementException();
            }
        }
        this.f9473g.reportEvent("several_filled_referrers", m11032a(list, dgVar, b).toString());
        return dgVar;
    }

    /* renamed from: a */
    private final JSONObject m11032a(List<C2895dg> list, C2895dg dgVar, PackageInfo packageInfo) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C2895dg c : list) {
            arrayList.add(m11033c(c));
        }
        JSONObject putOpt = jSONObject.put("candidates", C2572Tl.m8534b((List<?>) arrayList)).put("chosen", m11033c(dgVar)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        Intrinsics.checkNotNullExpressionValue(putOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return putOpt;
    }
}
