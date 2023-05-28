package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1121t;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.criteo.publisher.f0.c */
/* compiled from: $AutoValue_MetricRequest_MetricRequestFeedback */
abstract class C1087c extends C1121t.C1122a {

    /* renamed from: a */
    private final List<C1121t.C1123b> f3529a;

    /* renamed from: b */
    private final Long f3530b;

    /* renamed from: c */
    private final boolean f3531c;

    /* renamed from: d */
    private final long f3532d;

    /* renamed from: e */
    private final Long f3533e;

    /* renamed from: f */
    private final String f3534f;

    C1087c(List<C1121t.C1123b> list, Long l, boolean z, long j, Long l2, String str) {
        if (list != null) {
            this.f3529a = list;
            this.f3530b = l;
            this.f3531c = z;
            this.f3532d = j;
            this.f3533e = l2;
            this.f3534f = str;
            return;
        }
        throw new NullPointerException("Null slots");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C1121t.C1123b> mo3171e() {
        return this.f3529a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Long mo3169c() {
        return this.f3530b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("isTimeout")
    /* renamed from: f */
    public boolean mo3173f() {
        return this.f3531c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo3168b() {
        return this.f3532d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Long mo3167a() {
        return this.f3533e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo3170d() {
        return this.f3534f;
    }

    public String toString() {
        return "MetricRequestFeedback{slots=" + this.f3529a + ", elapsed=" + this.f3530b + ", timeout=" + this.f3531c + ", cdbCallStartElapsed=" + this.f3532d + ", cdbCallEndElapsed=" + this.f3533e + ", requestGroupId=" + this.f3534f + "}";
    }

    public boolean equals(Object obj) {
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1121t.C1122a)) {
            return false;
        }
        C1121t.C1122a aVar = (C1121t.C1122a) obj;
        if (this.f3529a.equals(aVar.mo3171e()) && ((l = this.f3530b) != null ? l.equals(aVar.mo3169c()) : aVar.mo3169c() == null) && this.f3531c == aVar.mo3173f() && this.f3532d == aVar.mo3168b() && ((l2 = this.f3533e) != null ? l2.equals(aVar.mo3167a()) : aVar.mo3167a() == null)) {
            String str = this.f3534f;
            if (str == null) {
                if (aVar.mo3170d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo3170d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f3529a.hashCode() ^ 1000003) * 1000003;
        Long l = this.f3530b;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        int i2 = this.f3531c ? 1231 : 1237;
        long j = this.f3532d;
        int i3 = (((hashCode2 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l2 = this.f3533e;
        int hashCode3 = (i3 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str = this.f3534f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 ^ i;
    }
}
