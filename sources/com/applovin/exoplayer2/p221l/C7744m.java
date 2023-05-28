package com.applovin.exoplayer2.p221l;

import android.util.SparseBooleanArray;

/* renamed from: com.applovin.exoplayer2.l.m */
public final class C7744m {

    /* renamed from: a */
    private final SparseBooleanArray f18286a;

    /* renamed from: com.applovin.exoplayer2.l.m$a */
    public static final class C7746a {

        /* renamed from: a */
        private final SparseBooleanArray f18287a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f18288b;

        /* renamed from: a */
        public C7746a mo55015a(int i) {
            C7717a.m22121b(!this.f18288b);
            this.f18287a.append(i, true);
            return this;
        }

        /* renamed from: a */
        public C7746a mo55016a(int i, boolean z) {
            return z ? mo55015a(i) : this;
        }

        /* renamed from: a */
        public C7746a mo55017a(C7744m mVar) {
            for (int i = 0; i < mVar.mo55009a(); i++) {
                mo55015a(mVar.mo55012b(i));
            }
            return this;
        }

        /* renamed from: a */
        public C7746a mo55018a(int... iArr) {
            for (int a : iArr) {
                mo55015a(a);
            }
            return this;
        }

        /* renamed from: a */
        public C7744m mo55019a() {
            C7717a.m22121b(!this.f18288b);
            this.f18288b = true;
            return new C7744m(this.f18287a);
        }
    }

    private C7744m(SparseBooleanArray sparseBooleanArray) {
        this.f18286a = sparseBooleanArray;
    }

    /* renamed from: a */
    public int mo55009a() {
        return this.f18286a.size();
    }

    /* renamed from: a */
    public boolean mo55010a(int i) {
        return this.f18286a.get(i);
    }

    /* renamed from: a */
    public boolean mo55011a(int... iArr) {
        for (int a : iArr) {
            if (mo55010a(a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public int mo55012b(int i) {
        C7717a.m22114a(i, 0, mo55009a());
        return this.f18286a.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7744m)) {
            return false;
        }
        C7744m mVar = (C7744m) obj;
        if (C7728ai.f18249a >= 24) {
            return this.f18286a.equals(mVar.f18286a);
        }
        if (mo55009a() != mVar.mo55009a()) {
            return false;
        }
        for (int i = 0; i < mo55009a(); i++) {
            if (mo55012b(i) != mVar.mo55012b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (C7728ai.f18249a >= 24) {
            return this.f18286a.hashCode();
        }
        int a = mo55009a();
        for (int i = 0; i < mo55009a(); i++) {
            a = (a * 31) + mo55012b(i);
        }
        return a;
    }
}
