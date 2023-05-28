package com.criteo.publisher.p067i0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.criteo.publisher.i0.b */
/* compiled from: IntegrationDetector.kt */
public class C1148b {
    static {
        new C1149a((DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public boolean mo3245b() {
        return m5270a("com.criteo.mediation.mopub.CriteoBannerAdapter");
    }

    /* renamed from: a */
    public boolean mo3244a() {
        return m5270a("com.criteo.mediation.google.CriteoAdapter");
    }

    /* renamed from: a */
    private boolean m5270a(String str) {
        try {
            Class.forName(str, false, C1148b.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }

    /* renamed from: com.criteo.publisher.i0.b$a */
    /* compiled from: IntegrationDetector.kt */
    private static final class C1149a {
        private C1149a() {
        }

        public /* synthetic */ C1149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
