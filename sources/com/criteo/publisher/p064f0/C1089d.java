package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1121t;

/* renamed from: com.criteo.publisher.f0.d */
/* compiled from: $AutoValue_MetricRequest_MetricRequestSlot */
abstract class C1089d extends C1121t.C1123b {

    /* renamed from: a */
    private final String f3535a;

    /* renamed from: b */
    private final Integer f3536b;

    /* renamed from: c */
    private final boolean f3537c;

    C1089d(String str, Integer num, boolean z) {
        this.f3535a = str;
        this.f3536b = num;
        this.f3537c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo3177b() {
        return this.f3535a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo3178c() {
        return this.f3536b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3176a() {
        return this.f3537c;
    }

    public String toString() {
        return "MetricRequestSlot{impressionId=" + this.f3535a + ", zoneId=" + this.f3536b + ", cachedBidUsed=" + this.f3537c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1121t.C1123b)) {
            return false;
        }
        C1121t.C1123b bVar = (C1121t.C1123b) obj;
        String str = this.f3535a;
        if (str != null ? str.equals(bVar.mo3177b()) : bVar.mo3177b() == null) {
            Integer num = this.f3536b;
            if (num != null ? num.equals(bVar.mo3178c()) : bVar.mo3178c() == null) {
                if (this.f3537c == bVar.mo3176a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3535a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.f3536b;
        if (num != null) {
            i = num.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.f3537c ? 1231 : 1237);
    }
}
