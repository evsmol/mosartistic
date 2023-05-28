package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.appsetid.C10703c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ab */
public final class C1861Ab {

    /* renamed from: a */
    private final String f5037a;

    /* renamed from: b */
    private final C10703c f5038b;

    public C1861Ab(String str, C10703c cVar) {
        this.f5037a = str;
        this.f5038b = cVar;
    }

    /* renamed from: a */
    public final String mo15453a() {
        return this.f5037a;
    }

    /* renamed from: b */
    public final C10703c mo15454b() {
        return this.f5038b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1861Ab)) {
            return false;
        }
        C1861Ab ab = (C1861Ab) obj;
        return Intrinsics.areEqual((Object) this.f5037a, (Object) ab.f5037a) && Intrinsics.areEqual((Object) this.f5038b, (Object) ab.f5038b);
    }

    public int hashCode() {
        String str = this.f5037a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C10703c cVar = this.f5038b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppSetId(id=" + this.f5037a + ", scope=" + this.f5038b + ")";
    }
}
