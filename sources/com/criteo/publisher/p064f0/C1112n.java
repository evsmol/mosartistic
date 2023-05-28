package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1081a;
import com.criteo.publisher.p064f0.C1091e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* renamed from: com.criteo.publisher.f0.n */
/* compiled from: Metric */
public abstract class C1112n {
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Long mo3131b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Long mo3132c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Long mo3133d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract String mo3134e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Integer mo3136f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract String mo3137g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Integer mo3138h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo3140i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo3141j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo3142k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract C1113a mo3143l();

    /* renamed from: a */
    public static C1113a m5142a(String str) {
        return m5141a().mo3147a(str);
    }

    /* renamed from: a */
    public static TypeAdapter<C1112n> m5143a(Gson gson) {
        return new C1091e.C1092a(gson);
    }

    /* renamed from: com.criteo.publisher.f0.n$a */
    /* compiled from: Metric */
    static abstract class C1113a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1113a mo3145a(Integer num);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1113a mo3146a(Long l);

        /* access modifiers changed from: package-private */
        @Deprecated
        /* renamed from: a */
        public abstract C1113a mo3147a(String str);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1113a mo3148a(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1112n mo3149a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1113a mo3150b(Integer num);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1113a mo3151b(Long l);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1113a mo3152b(String str);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1113a mo3153b(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C1113a mo3154c(Long l);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C1113a mo3155c(boolean z);

        C1113a() {
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C1113a m5141a() {
        return new C1081a.C1083b().mo3155c(false).mo3153b(false).mo3148a(false);
    }
}
