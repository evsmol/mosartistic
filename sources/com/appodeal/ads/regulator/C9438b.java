package com.appodeal.ads.regulator;

import com.appodeal.consent.Consent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.regulator.b */
public interface C9438b {

    /* renamed from: com.appodeal.ads.regulator.b$a */
    public static final class C9439a implements C9438b {

        /* renamed from: a */
        public static final C9439a f23964a = new C9439a();
    }

    /* renamed from: com.appodeal.ads.regulator.b$b */
    public static final class C9440b implements C9438b {

        /* renamed from: a */
        public static final C9440b f23965a = new C9440b();
    }

    /* renamed from: com.appodeal.ads.regulator.b$c */
    public static final class C9441c implements C9438b {

        /* renamed from: a */
        public static final C9441c f23966a = new C9441c();
    }

    /* renamed from: com.appodeal.ads.regulator.b$d */
    public static final class C9442d implements C9438b {

        /* renamed from: a */
        public static final C9442d f23967a = new C9442d();
    }

    /* renamed from: com.appodeal.ads.regulator.b$e */
    public static final class C9443e implements C9438b {

        /* renamed from: a */
        public static final C9443e f23968a = new C9443e();
    }

    /* renamed from: com.appodeal.ads.regulator.b$f */
    public interface C9444f extends C9438b {

        /* renamed from: com.appodeal.ads.regulator.b$f$a */
        public static final class C9445a implements C9444f {
            public C9445a(Throwable th) {
                Intrinsics.checkNotNullParameter(th, "cause");
            }
        }

        /* renamed from: com.appodeal.ads.regulator.b$f$b */
        public static final class C9446b implements C9444f {

            /* renamed from: a */
            public final Consent f23969a;

            public C9446b(Consent consent) {
                Intrinsics.checkNotNullParameter(consent, "consent");
                this.f23969a = consent;
            }

            /* renamed from: a */
            public final Consent mo60657a() {
                return this.f23969a;
            }
        }
    }
}
