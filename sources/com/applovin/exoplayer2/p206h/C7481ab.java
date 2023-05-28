package com.applovin.exoplayer2.p206h;

import android.util.SparseArray;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7736h;

/* renamed from: com.applovin.exoplayer2.h.ab */
final class C7481ab<V> {

    /* renamed from: a */
    private int f17165a;

    /* renamed from: b */
    private final SparseArray<V> f17166b;

    /* renamed from: c */
    private final C7736h<V> f17167c;

    public C7481ab() {
        this($$Lambda$ab$Ac6li4hPX9FXnIWZSUJXLaI9Cps.INSTANCE);
    }

    public C7481ab(C7736h<V> hVar) {
        this.f17166b = new SparseArray<>();
        this.f17167c = hVar;
        this.f17165a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m20842a(Object obj) {
    }

    /* renamed from: a */
    public V mo54471a() {
        SparseArray<V> sparseArray = this.f17166b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0019 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V mo54472a(int r3) {
        /*
            r2 = this;
            int r0 = r2.f17165a
            r1 = -1
            if (r0 != r1) goto L_0x0008
            r0 = 0
        L_0x0006:
            r2.f17165a = r0
        L_0x0008:
            int r0 = r2.f17165a
            if (r0 <= 0) goto L_0x0019
            android.util.SparseArray<V> r1 = r2.f17166b
            int r0 = r1.keyAt(r0)
            if (r3 >= r0) goto L_0x0019
            int r0 = r2.f17165a
            int r0 = r0 + -1
            goto L_0x0006
        L_0x0019:
            int r0 = r2.f17165a
            android.util.SparseArray<V> r1 = r2.f17166b
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x0038
            android.util.SparseArray<V> r0 = r2.f17166b
            int r1 = r2.f17165a
            int r1 = r1 + 1
            int r0 = r0.keyAt(r1)
            if (r3 < r0) goto L_0x0038
            int r0 = r2.f17165a
            int r0 = r0 + 1
            r2.f17165a = r0
            goto L_0x0019
        L_0x0038:
            android.util.SparseArray<V> r3 = r2.f17166b
            int r0 = r2.f17165a
            java.lang.Object r3 = r3.valueAt(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7481ab.mo54472a(int):java.lang.Object");
    }

    /* renamed from: a */
    public void mo54473a(int i, V v) {
        boolean z = false;
        if (this.f17165a == -1) {
            C7717a.m22121b(this.f17166b.size() == 0);
            this.f17165a = 0;
        }
        if (this.f17166b.size() > 0) {
            SparseArray<V> sparseArray = this.f17166b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z = true;
            }
            C7717a.m22118a(z);
            if (keyAt == i) {
                C7736h<V> hVar = this.f17167c;
                SparseArray<V> sparseArray2 = this.f17166b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f17166b.append(i, v);
    }

    /* renamed from: b */
    public void mo54474b() {
        for (int i = 0; i < this.f17166b.size(); i++) {
            this.f17167c.accept(this.f17166b.valueAt(i));
        }
        this.f17165a = -1;
        this.f17166b.clear();
    }

    /* renamed from: b */
    public void mo54475b(int i) {
        int i2 = 0;
        while (i2 < this.f17166b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f17166b.keyAt(i3)) {
                this.f17167c.accept(this.f17166b.valueAt(i2));
                this.f17166b.removeAt(i2);
                int i4 = this.f17165a;
                if (i4 > 0) {
                    this.f17165a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo54476c(int i) {
        int size = this.f17166b.size() - 1;
        while (size >= 0 && i < this.f17166b.keyAt(size)) {
            this.f17167c.accept(this.f17166b.valueAt(size));
            this.f17166b.removeAt(size);
            size--;
        }
        this.f17165a = this.f17166b.size() > 0 ? Math.min(this.f17165a, this.f17166b.size() - 1) : -1;
    }

    /* renamed from: c */
    public boolean mo54477c() {
        return this.f17166b.size() == 0;
    }
}
