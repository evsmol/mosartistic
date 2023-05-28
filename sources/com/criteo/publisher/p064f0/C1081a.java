package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1112n;

/* renamed from: com.criteo.publisher.f0.a */
/* compiled from: $AutoValue_Metric */
abstract class C1081a extends C1112n {

    /* renamed from: a */
    private final Long f3504a;

    /* renamed from: b */
    private final Long f3505b;

    /* renamed from: c */
    private final boolean f3506c;

    /* renamed from: d */
    private final boolean f3507d;

    /* renamed from: e */
    private final Long f3508e;

    /* renamed from: f */
    private final String f3509f;

    /* renamed from: g */
    private final String f3510g;

    /* renamed from: h */
    private final Integer f3511h;

    /* renamed from: i */
    private final Integer f3512i;

    /* renamed from: j */
    private final boolean f3513j;

    C1081a(Long l, Long l2, boolean z, boolean z2, Long l3, String str, String str2, Integer num, Integer num2, boolean z3) {
        this.f3504a = l;
        this.f3505b = l2;
        this.f3506c = z;
        this.f3507d = z2;
        this.f3508e = l3;
        if (str != null) {
            this.f3509f = str;
            this.f3510g = str2;
            this.f3511h = num;
            this.f3512i = num2;
            this.f3513j = z3;
            return;
        }
        throw new NullPointerException("Null impressionId");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Long mo3132c() {
        return this.f3504a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Long mo3131b() {
        return this.f3505b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo3141j() {
        return this.f3506c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo3140i() {
        return this.f3507d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Long mo3133d() {
        return this.f3508e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo3134e() {
        return this.f3509f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo3137g() {
        return this.f3510g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Integer mo3138h() {
        return this.f3511h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Integer mo3136f() {
        return this.f3512i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo3142k() {
        return this.f3513j;
    }

    public String toString() {
        return "Metric{cdbCallStartTimestamp=" + this.f3504a + ", cdbCallEndTimestamp=" + this.f3505b + ", cdbCallTimeout=" + this.f3506c + ", cachedBidUsed=" + this.f3507d + ", elapsedTimestamp=" + this.f3508e + ", impressionId=" + this.f3509f + ", requestGroupId=" + this.f3510g + ", zoneId=" + this.f3511h + ", profileId=" + this.f3512i + ", readyToSend=" + this.f3513j + "}";
    }

    public boolean equals(Object obj) {
        Long l;
        String str;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1112n)) {
            return false;
        }
        C1112n nVar = (C1112n) obj;
        Long l2 = this.f3504a;
        if (l2 != null ? l2.equals(nVar.mo3132c()) : nVar.mo3132c() == null) {
            Long l3 = this.f3505b;
            if (l3 != null ? l3.equals(nVar.mo3131b()) : nVar.mo3131b() == null) {
                if (this.f3506c != nVar.mo3141j() || this.f3507d != nVar.mo3140i() || ((l = this.f3508e) != null ? !l.equals(nVar.mo3133d()) : nVar.mo3133d() != null) || !this.f3509f.equals(nVar.mo3134e()) || ((str = this.f3510g) != null ? !str.equals(nVar.mo3137g()) : nVar.mo3137g() != null) || ((num = this.f3511h) != null ? !num.equals(nVar.mo3138h()) : nVar.mo3138h() != null) || ((num2 = this.f3512i) != null ? !num2.equals(nVar.mo3136f()) : nVar.mo3136f() != null) || this.f3513j != nVar.mo3142k()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Long l = this.f3504a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.f3505b;
        int i2 = 1231;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f3506c ? 1231 : 1237)) * 1000003) ^ (this.f3507d ? 1231 : 1237)) * 1000003;
        Long l3 = this.f3508e;
        int hashCode3 = (((hashCode2 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003) ^ this.f3509f.hashCode()) * 1000003;
        String str = this.f3510g;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.f3511h;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f3512i;
        if (num2 != null) {
            i = num2.hashCode();
        }
        int i3 = (hashCode5 ^ i) * 1000003;
        if (!this.f3513j) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1112n.C1113a mo3143l() {
        return new C1083b(this);
    }

    /* renamed from: com.criteo.publisher.f0.a$b */
    /* compiled from: $AutoValue_Metric */
    static class C1083b extends C1112n.C1113a {

        /* renamed from: a */
        private Long f3514a;

        /* renamed from: b */
        private Long f3515b;

        /* renamed from: c */
        private Boolean f3516c;

        /* renamed from: d */
        private Boolean f3517d;

        /* renamed from: e */
        private Long f3518e;

        /* renamed from: f */
        private String f3519f;

        /* renamed from: g */
        private String f3520g;

        /* renamed from: h */
        private Integer f3521h;

        /* renamed from: i */
        private Integer f3522i;

        /* renamed from: j */
        private Boolean f3523j;

        C1083b() {
        }

        private C1083b(C1112n nVar) {
            this.f3514a = nVar.mo3132c();
            this.f3515b = nVar.mo3131b();
            this.f3516c = Boolean.valueOf(nVar.mo3141j());
            this.f3517d = Boolean.valueOf(nVar.mo3140i());
            this.f3518e = nVar.mo3133d();
            this.f3519f = nVar.mo3134e();
            this.f3520g = nVar.mo3137g();
            this.f3521h = nVar.mo3138h();
            this.f3522i = nVar.mo3136f();
            this.f3523j = Boolean.valueOf(nVar.mo3142k());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1112n.C1113a mo3151b(Long l) {
            this.f3514a = l;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1112n.C1113a mo3146a(Long l) {
            this.f3515b = l;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1112n.C1113a mo3153b(boolean z) {
            this.f3516c = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1112n.C1113a mo3148a(boolean z) {
            this.f3517d = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1112n.C1113a mo3154c(Long l) {
            this.f3518e = l;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1112n.C1113a mo3147a(String str) {
            if (str != null) {
                this.f3519f = str;
                return this;
            }
            throw new NullPointerException("Null impressionId");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1112n.C1113a mo3152b(String str) {
            this.f3520g = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1112n.C1113a mo3150b(Integer num) {
            this.f3521h = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1112n.C1113a mo3145a(Integer num) {
            this.f3522i = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1112n.C1113a mo3155c(boolean z) {
            this.f3523j = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1112n mo3149a() {
            String str = "";
            if (this.f3516c == null) {
                str = str + " cdbCallTimeout";
            }
            if (this.f3517d == null) {
                str = str + " cachedBidUsed";
            }
            if (this.f3519f == null) {
                str = str + " impressionId";
            }
            if (this.f3523j == null) {
                str = str + " readyToSend";
            }
            if (str.isEmpty()) {
                return new C1091e(this.f3514a, this.f3515b, this.f3516c.booleanValue(), this.f3517d.booleanValue(), this.f3518e, this.f3519f, this.f3520g, this.f3521h, this.f3522i, this.f3523j.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
