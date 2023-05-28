package com.criteo.publisher.p067i0;

import android.content.SharedPreferences;
import com.criteo.publisher.p074n0.C1311o;
import com.criteo.publisher.p074n0.C1313q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.i0.c */
/* compiled from: IntegrationRegistry.kt */
public class C1150c {

    /* renamed from: a */
    private final C1313q f3656a;

    /* renamed from: b */
    private final SharedPreferences f3657b;

    /* renamed from: c */
    private final C1148b f3658c;

    static {
        new C1151a((DefaultConstructorMarker) null);
    }

    public C1150c(SharedPreferences sharedPreferences, C1148b bVar) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(bVar, "integrationDetector");
        this.f3657b = sharedPreferences;
        this.f3658c = bVar;
        this.f3656a = new C1313q(sharedPreferences);
    }

    /* renamed from: b */
    public int mo3247b() {
        return mo3248c().mo3243a();
    }

    /* renamed from: a */
    public void mo3246a(C1147a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        this.f3657b.edit().putString("CriteoCachedIntegration", aVar.name()).apply();
    }

    /* renamed from: c */
    public C1147a mo3248c() {
        C1147a a = m5273a();
        if (a != null) {
            return a;
        }
        String a2 = this.f3656a.mo3662a("CriteoCachedIntegration", C1147a.FALLBACK.name());
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "safeSharedPreferences.ge…ion.FALLBACK.name\n    )!!");
        try {
            return C1147a.valueOf(a2);
        } catch (IllegalArgumentException e) {
            C1311o.m5779a((Throwable) e);
            return C1147a.FALLBACK;
        }
    }

    /* renamed from: a */
    private C1147a m5273a() {
        boolean b = this.f3658c.mo3245b();
        boolean a = this.f3658c.mo3244a();
        if (b && a) {
            return C1147a.FALLBACK;
        }
        if (b) {
            return C1147a.MOPUB_MEDIATION;
        }
        if (a) {
            return C1147a.ADMOB_MEDIATION;
        }
        return null;
    }

    /* renamed from: com.criteo.publisher.i0.c$a */
    /* compiled from: IntegrationRegistry.kt */
    private static final class C1151a {
        private C1151a() {
        }

        public /* synthetic */ C1151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
