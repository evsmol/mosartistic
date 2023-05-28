package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e0 */
class C6288e0 {

    /* renamed from: c */
    static C6288e0 f13492c = new C6288e0(3, true);

    /* renamed from: d */
    static C6288e0 f13493d = new C6288e0(2, false);

    /* renamed from: e */
    static C6288e0 f13494e = new C6288e0(2, true);

    /* renamed from: f */
    static C6288e0 f13495f = new C6288e0(1, false);

    /* renamed from: g */
    static C6288e0 f13496g = new C6288e0(1, true);

    /* renamed from: h */
    static C6288e0 f13497h = new C6288e0(0, false);

    /* renamed from: i */
    static C6288e0 f13498i = new C6288e0(0, true);

    /* renamed from: a */
    private final int f13499a;

    /* renamed from: b */
    private final boolean f13500b;

    /* renamed from: com.adcolony.sdk.e0$a */
    static class C6289a {

        /* renamed from: a */
        StringBuilder f13501a = new StringBuilder();

        C6289a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6289a mo50644a(String str) {
            this.f13501a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6289a mo50643a(Object obj) {
            if (obj != null) {
                this.f13501a.append(obj.toString());
            } else {
                this.f13501a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6289a mo50642a(int i) {
            this.f13501a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo50645a(C6288e0 e0Var) {
            e0Var.m15199a(this.f13501a.toString());
        }
    }

    static {
        new C6288e0(3, false);
    }

    C6288e0(int i, boolean z) {
        this.f13499a = i;
        this.f13500b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15199a(String str) {
        C6185a.m14887b().mo50806q().mo50721a(this.f13499a, str, this.f13500b);
    }
}
