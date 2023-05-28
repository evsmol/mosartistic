package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1094f;
import com.criteo.publisher.p064f0.C1096g;
import com.criteo.publisher.p064f0.C1098h;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.criteo.publisher.f0.t */
/* compiled from: MetricRequest */
public abstract class C1121t {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<C1122a> mo3160a();

    /* access modifiers changed from: package-private */
    @SerializedName("profile_id")
    /* renamed from: b */
    public abstract int mo3161b();

    /* access modifiers changed from: package-private */
    @SerializedName("wrapper_version")
    /* renamed from: c */
    public abstract String mo3162c();

    /* renamed from: a */
    static C1121t m5183a(Collection<C1112n> collection, String str, int i) {
        ArrayList arrayList = new ArrayList();
        for (C1112n a : collection) {
            arrayList.add(C1122a.m5188a(a));
        }
        return new C1094f(arrayList, str, i);
    }

    /* renamed from: a */
    public static TypeAdapter<C1121t> m5184a(Gson gson) {
        return new C1094f.C1095a(gson);
    }

    /* renamed from: com.criteo.publisher.f0.t$a */
    /* compiled from: MetricRequest */
    public static abstract class C1122a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Long mo3167a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo3168b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Long mo3169c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract String mo3170d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract List<C1123b> mo3171e();

        /* access modifiers changed from: package-private */
        @SerializedName("isTimeout")
        /* renamed from: f */
        public abstract boolean mo3173f();

        /* renamed from: a */
        static C1122a m5188a(C1112n nVar) {
            return new C1096g(Collections.singletonList(C1123b.m5197a(nVar.mo3134e(), nVar.mo3138h(), nVar.mo3140i())), m5190a(nVar.mo3133d(), nVar.mo3132c()), nVar.mo3141j(), 0, m5190a(nVar.mo3131b(), nVar.mo3132c()), nVar.mo3137g());
        }

        /* renamed from: a */
        public static TypeAdapter<C1122a> m5189a(Gson gson) {
            return new C1096g.C1097a(gson);
        }

        /* renamed from: a */
        private static Long m5190a(Long l, Long l2) {
            if (l == null || l2 == null) {
                return null;
            }
            return Long.valueOf(l.longValue() - l2.longValue());
        }
    }

    /* renamed from: com.criteo.publisher.f0.t$b */
    /* compiled from: MetricRequest */
    public static abstract class C1123b {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo3176a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract String mo3177b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Integer mo3178c();

        /* renamed from: a */
        static C1123b m5197a(String str, Integer num, boolean z) {
            return new C1098h(str, num, z);
        }

        /* renamed from: a */
        public static TypeAdapter<C1123b> m5198a(Gson gson) {
            return new C1098h.C1099a(gson);
        }
    }
}
