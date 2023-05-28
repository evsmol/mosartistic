package com.yandex.metrica.impl.p082ob;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.v3 */
public final class C3566v3 implements C3462s0<C3567a, C3567a> {

    /* renamed from: a */
    private final C3567a f9299a;

    /* renamed from: b */
    private final List<C3567a> f9300b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    public static final class C3567a implements C3563v0 {

        /* renamed from: a */
        private final Map<String, String> f9301a;

        /* renamed from: b */
        private final C3522u0 f9302b;

        public C3567a(Map<String, String> map, C3522u0 u0Var) {
            this.f9301a = map;
            this.f9302b = u0Var;
        }

        /* renamed from: a */
        public C3522u0 mo17550a() {
            return this.f9302b;
        }

        /* renamed from: b */
        public final Map<String, String> mo18318b() {
            return this.f9301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3567a)) {
                return false;
            }
            C3567a aVar = (C3567a) obj;
            return Intrinsics.areEqual((Object) this.f9301a, (Object) aVar.f9301a) && Intrinsics.areEqual((Object) this.f9302b, (Object) aVar.f9302b);
        }

        public int hashCode() {
            Map<String, String> map = this.f9301a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            C3522u0 u0Var = this.f9302b;
            if (u0Var != null) {
                i = u0Var.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Candidate(clids=" + this.f9301a + ", source=" + this.f9302b + ")";
        }
    }

    public C3566v3(C3567a aVar, List<C3567a> list) {
        this.f9299a = aVar;
        this.f9300b = list;
    }

    /* renamed from: a */
    public List<C3567a> mo16767a() {
        return this.f9300b;
    }

    /* renamed from: b */
    public Object mo16768b() {
        return this.f9299a;
    }

    /* renamed from: c */
    public C3567a mo18314c() {
        return this.f9299a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3566v3)) {
            return false;
        }
        C3566v3 v3Var = (C3566v3) obj;
        return Intrinsics.areEqual((Object) this.f9299a, (Object) v3Var.f9299a) && Intrinsics.areEqual((Object) this.f9300b, (Object) v3Var.f9300b);
    }

    public int hashCode() {
        C3567a aVar = this.f9299a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<C3567a> list = this.f9300b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ClidsInfo(chosen=" + this.f9299a + ", candidates=" + this.f9300b + ")";
    }
}
