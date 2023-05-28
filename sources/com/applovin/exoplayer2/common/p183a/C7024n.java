package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.p184b.C7054a;
import com.applovin.exoplayer2.common.p184b.C7056c;
import com.applovin.exoplayer2.common.p184b.C7058d;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.n */
public abstract class C7024n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C7024n f15492a = new C7024n() {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C7024n mo53506a(int i) {
            return i < 0 ? C7024n.f15493b : i > 0 ? C7024n.f15494c : C7024n.f15492a;
        }

        /* renamed from: a */
        public C7024n mo53500a(int i, int i2) {
            return mo53506a(C7056c.m18925a(i, i2));
        }

        /* renamed from: a */
        public C7024n mo53501a(long j, long j2) {
            return mo53506a(C7058d.m18937a(j, j2));
        }

        /* renamed from: a */
        public <T> C7024n mo53502a(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return mo53506a(comparator.compare(t, t2));
        }

        /* renamed from: a */
        public C7024n mo53503a(boolean z, boolean z2) {
            return mo53506a(C7054a.m18922a(z2, z));
        }

        /* renamed from: b */
        public int mo53504b() {
            return 0;
        }

        /* renamed from: b */
        public C7024n mo53505b(boolean z, boolean z2) {
            return mo53506a(C7054a.m18922a(z, z2));
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C7024n f15493b = new C7026a(-1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C7024n f15494c = new C7026a(1);

    /* renamed from: com.applovin.exoplayer2.common.a.n$a */
    private static final class C7026a extends C7024n {

        /* renamed from: a */
        final int f15495a;

        C7026a(int i) {
            super();
            this.f15495a = i;
        }

        /* renamed from: a */
        public C7024n mo53500a(int i, int i2) {
            return this;
        }

        /* renamed from: a */
        public C7024n mo53501a(long j, long j2) {
            return this;
        }

        /* renamed from: a */
        public <T> C7024n mo53502a(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        /* renamed from: a */
        public C7024n mo53503a(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: b */
        public int mo53504b() {
            return this.f15495a;
        }

        /* renamed from: b */
        public C7024n mo53505b(boolean z, boolean z2) {
            return this;
        }
    }

    private C7024n() {
    }

    /* renamed from: a */
    public static C7024n m18757a() {
        return f15492a;
    }

    /* renamed from: a */
    public abstract C7024n mo53500a(int i, int i2);

    /* renamed from: a */
    public abstract C7024n mo53501a(long j, long j2);

    /* renamed from: a */
    public abstract <T> C7024n mo53502a(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    /* renamed from: a */
    public abstract C7024n mo53503a(boolean z, boolean z2);

    /* renamed from: b */
    public abstract int mo53504b();

    /* renamed from: b */
    public abstract C7024n mo53505b(boolean z, boolean z2);
}
