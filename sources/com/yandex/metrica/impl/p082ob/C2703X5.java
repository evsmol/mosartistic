package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.X5 */
public class C2703X5 {

    /* renamed from: a */
    private final C2943f6 f7122a;

    /* renamed from: b */
    private final Long f7123b;

    /* renamed from: c */
    private final Long f7124c;

    /* renamed from: d */
    private final Integer f7125d;

    /* renamed from: e */
    private final Long f7126e;

    /* renamed from: f */
    private final Boolean f7127f;

    /* renamed from: g */
    private final Long f7128g;

    /* renamed from: h */
    private final Long f7129h;

    /* renamed from: com.yandex.metrica.impl.ob.X5$b */
    static final class C2705b {

        /* renamed from: a */
        public Long f7130a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2943f6 f7131b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Long f7132c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Long f7133d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f7134e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Long f7135f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Boolean f7136g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Long f7137h;

        private C2705b(C2759Z5 z5) {
            this.f7131b = z5.mo17090b();
            this.f7134e = z5.mo17089a();
        }

        /* renamed from: a */
        public C2705b mo17022a(Long l) {
            this.f7133d = l;
            return this;
        }

        /* renamed from: b */
        public C2705b mo17023b(Long l) {
            this.f7135f = l;
            return this;
        }

        /* renamed from: c */
        public C2705b mo17024c(Long l) {
            this.f7132c = l;
            return this;
        }

        /* renamed from: d */
        public C2705b mo17025d(Long l) {
            this.f7137h = l;
            return this;
        }

        /* renamed from: a */
        public C2705b mo17021a(Boolean bool) {
            this.f7136g = bool;
            return this;
        }
    }

    /* renamed from: a */
    public C2943f6 mo17015a() {
        return this.f7122a;
    }

    /* renamed from: b */
    public long mo17017b(long j) {
        Long l = this.f7126e;
        return l == null ? j : l.longValue();
    }

    /* renamed from: c */
    public long mo17018c(long j) {
        Long l = this.f7123b;
        return l == null ? j : l.longValue();
    }

    /* renamed from: d */
    public long mo17019d(long j) {
        Long l = this.f7129h;
        return l == null ? j : l.longValue();
    }

    /* renamed from: e */
    public long mo17020e(long j) {
        Long l = this.f7128g;
        return l == null ? j : l.longValue();
    }

    private C2703X5(C2705b bVar) {
        this.f7122a = bVar.f7131b;
        this.f7125d = bVar.f7134e;
        this.f7123b = bVar.f7132c;
        this.f7124c = bVar.f7133d;
        this.f7126e = bVar.f7135f;
        this.f7127f = bVar.f7136g;
        this.f7128g = bVar.f7137h;
        this.f7129h = bVar.f7130a;
    }

    /* renamed from: a */
    public long mo17014a(long j) {
        Long l = this.f7124c;
        return l == null ? j : l.longValue();
    }

    /* renamed from: a */
    public int mo17013a(int i) {
        Integer num = this.f7125d;
        return num == null ? i : num.intValue();
    }

    /* renamed from: a */
    public boolean mo17016a(boolean z) {
        Boolean bool = this.f7127f;
        return bool == null ? z : bool.booleanValue();
    }
}
