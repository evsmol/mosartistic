package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.base.b */
abstract class C7124b<T> implements Iterator<T> {

    /* renamed from: a */
    private C7126a f15635a = C7126a.NOT_READY;
    @NullableDecl

    /* renamed from: b */
    private T f15636b;

    /* renamed from: com.applovin.exoplayer2.common.base.b$1 */
    static /* synthetic */ class C71251 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15637a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.exoplayer2.common.base.b$a[] r0 = com.applovin.exoplayer2.common.base.C7124b.C7126a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15637a = r0
                com.applovin.exoplayer2.common.base.b$a r1 = com.applovin.exoplayer2.common.base.C7124b.C7126a.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15637a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.exoplayer2.common.base.b$a r1 = com.applovin.exoplayer2.common.base.C7124b.C7126a.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.C7124b.C71251.<clinit>():void");
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.b$a */
    private enum C7126a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C7124b() {
    }

    /* renamed from: c */
    private boolean mo53723c() {
        this.f15635a = C7126a.FAILED;
        this.f15636b = mo53689a();
        if (this.f15635a == C7126a.DONE) {
            return false;
        }
        this.f15635a = C7126a.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo53689a();

    /* access modifiers changed from: protected */
    @NullableDecl
    /* renamed from: b */
    public final T mo53727b() {
        this.f15635a = C7126a.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.checkState(this.f15635a != C7126a.FAILED);
        int i = C71251.f15637a[this.f15635a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return mo53723c();
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.f15635a = C7126a.NOT_READY;
            T t = this.f15636b;
            this.f15636b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
