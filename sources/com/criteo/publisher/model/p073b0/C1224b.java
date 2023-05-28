package com.criteo.publisher.model.p073b0;

import com.criteo.publisher.model.p073b0.C1243n;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.criteo.publisher.model.b0.b */
/* compiled from: $AutoValue_NativeAssets */
abstract class C1224b extends C1243n {

    /* renamed from: a */
    private final List<C1248r> f3842a;

    /* renamed from: b */
    private final C1242m f3843b;

    /* renamed from: c */
    private final C1247q f3844c;

    /* renamed from: d */
    private final List<C1246p> f3845d;

    C1224b(List<C1248r> list, C1242m mVar, C1247q qVar, List<C1246p> list2) {
        if (list != null) {
            this.f3842a = list;
            if (mVar != null) {
                this.f3843b = mVar;
                if (qVar != null) {
                    this.f3844c = qVar;
                    if (list2 != null) {
                        this.f3845d = list2;
                        return;
                    }
                    throw new NullPointerException("Null pixels");
                }
                throw new NullPointerException("Null privacy");
            }
            throw new NullPointerException("Null advertiser");
        }
        throw new NullPointerException("Null nativeProducts");
    }

    /* access modifiers changed from: package-private */
    @SerializedName("products")
    /* renamed from: h */
    public List<C1248r> mo3430h() {
        return this.f3842a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1242m mo3428b() {
        return this.f3843b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1247q mo3433j() {
        return this.f3844c;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("impressionPixels")
    /* renamed from: i */
    public List<C1246p> mo3432i() {
        return this.f3845d;
    }

    public String toString() {
        return "NativeAssets{nativeProducts=" + this.f3842a + ", advertiser=" + this.f3843b + ", privacy=" + this.f3844c + ", pixels=" + this.f3845d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1243n)) {
            return false;
        }
        C1243n nVar = (C1243n) obj;
        if (!this.f3842a.equals(nVar.mo3430h()) || !this.f3843b.equals(nVar.mo3428b()) || !this.f3844c.equals(nVar.mo3433j()) || !this.f3845d.equals(nVar.mo3432i())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f3842a.hashCode() ^ 1000003) * 1000003) ^ this.f3843b.hashCode()) * 1000003) ^ this.f3844c.hashCode()) * 1000003) ^ this.f3845d.hashCode();
    }

    /* renamed from: com.criteo.publisher.model.b0.b$a */
    /* compiled from: $AutoValue_NativeAssets */
    static class C1225a extends C1243n.C1244a {

        /* renamed from: a */
        private List<C1248r> f3846a;

        /* renamed from: b */
        private C1242m f3847b;

        /* renamed from: c */
        private C1247q f3848c;

        /* renamed from: d */
        private List<C1246p> f3849d;

        C1225a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1243n.C1244a mo3437a(List<C1248r> list) {
            if (list != null) {
                this.f3846a = list;
                return this;
            }
            throw new NullPointerException("Null nativeProducts");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public List<C1248r> mo3440c() {
            List<C1248r> list = this.f3846a;
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Property \"nativeProducts\" has not been set");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1243n.C1244a mo3435a(C1242m mVar) {
            if (mVar != null) {
                this.f3847b = mVar;
                return this;
            }
            throw new NullPointerException("Null advertiser");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1243n.C1244a mo3436a(C1247q qVar) {
            if (qVar != null) {
                this.f3848c = qVar;
                return this;
            }
            throw new NullPointerException("Null privacy");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1243n.C1244a mo3439b(List<C1246p> list) {
            if (list != null) {
                this.f3849d = list;
                return this;
            }
            throw new NullPointerException("Null pixels");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public List<C1246p> mo3441d() {
            List<C1246p> list = this.f3849d;
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Property \"pixels\" has not been set");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1243n mo3438a() {
            String str = "";
            if (this.f3846a == null) {
                str = str + " nativeProducts";
            }
            if (this.f3847b == null) {
                str = str + " advertiser";
            }
            if (this.f3848c == null) {
                str = str + " privacy";
            }
            if (this.f3849d == null) {
                str = str + " pixels";
            }
            if (str.isEmpty()) {
                return new C1232h(this.f3846a, this.f3847b, this.f3848c, this.f3849d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
