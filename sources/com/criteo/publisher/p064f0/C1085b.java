package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1121t;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.criteo.publisher.f0.b */
/* compiled from: $AutoValue_MetricRequest */
abstract class C1085b extends C1121t {

    /* renamed from: a */
    private final List<C1121t.C1122a> f3524a;

    /* renamed from: b */
    private final String f3525b;

    /* renamed from: c */
    private final int f3526c;

    C1085b(List<C1121t.C1122a> list, String str, int i) {
        if (list != null) {
            this.f3524a = list;
            if (str != null) {
                this.f3525b = str;
                this.f3526c = i;
                return;
            }
            throw new NullPointerException("Null wrapperVersion");
        }
        throw new NullPointerException("Null feedbacks");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C1121t.C1122a> mo3160a() {
        return this.f3524a;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("wrapper_version")
    /* renamed from: c */
    public String mo3162c() {
        return this.f3525b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("profile_id")
    /* renamed from: b */
    public int mo3161b() {
        return this.f3526c;
    }

    public String toString() {
        return "MetricRequest{feedbacks=" + this.f3524a + ", wrapperVersion=" + this.f3525b + ", profileId=" + this.f3526c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1121t)) {
            return false;
        }
        C1121t tVar = (C1121t) obj;
        if (!this.f3524a.equals(tVar.mo3160a()) || !this.f3525b.equals(tVar.mo3162c()) || this.f3526c != tVar.mo3161b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f3524a.hashCode() ^ 1000003) * 1000003) ^ this.f3525b.hashCode()) * 1000003) ^ this.f3526c;
    }
}
