package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.b */
public abstract class C6982b<T> extends C6980ax<T> {

    /* renamed from: a */
    private C6984a f15415a = C6984a.NOT_READY;
    @NullableDecl

    /* renamed from: b */
    private T f15416b;

    /* renamed from: com.applovin.exoplayer2.common.a.b$1 */
    static /* synthetic */ class C69831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15417a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.exoplayer2.common.a.b$a[] r0 = com.applovin.exoplayer2.common.p183a.C6982b.C6984a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15417a = r0
                com.applovin.exoplayer2.common.a.b$a r1 = com.applovin.exoplayer2.common.p183a.C6982b.C6984a.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15417a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.exoplayer2.common.a.b$a r1 = com.applovin.exoplayer2.common.p183a.C6982b.C6984a.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.p183a.C6982b.C69831.<clinit>():void");
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.b$a */
    private enum C6984a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C6982b() {
    }

    /* renamed from: c */
    private boolean m18619c() {
        this.f15415a = C6984a.FAILED;
        this.f15416b = mo53270a();
        if (this.f15415a == C6984a.DONE) {
            return false;
        }
        this.f15415a = C6984a.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo53270a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo53292b() {
        this.f15415a = C6984a.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.checkState(this.f15415a != C6984a.FAILED);
        int i = C69831.f15417a[this.f15415a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m18619c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f15415a = C6984a.NOT_READY;
            T t = this.f15416b;
            this.f15416b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
