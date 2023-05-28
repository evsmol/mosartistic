package com.applovin.exoplayer2.p220k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.applovin.exoplayer2.k.y */
public class C7712y {

    /* renamed from: a */
    private static final Comparator<C7714a> f18202a = $$Lambda$y$k_Ds_OqbQQcE40fOFfIXdVboMIE.INSTANCE;

    /* renamed from: b */
    private static final Comparator<C7714a> f18203b = $$Lambda$y$ODZiL_ZurRSMwgJath8qEMUVo1Q.INSTANCE;

    /* renamed from: c */
    private final int f18204c;

    /* renamed from: d */
    private final ArrayList<C7714a> f18205d = new ArrayList<>();

    /* renamed from: e */
    private final C7714a[] f18206e = new C7714a[5];

    /* renamed from: f */
    private int f18207f = -1;

    /* renamed from: g */
    private int f18208g;

    /* renamed from: h */
    private int f18209h;

    /* renamed from: i */
    private int f18210i;

    /* renamed from: com.applovin.exoplayer2.k.y$a */
    private static class C7714a {

        /* renamed from: a */
        public int f18211a;

        /* renamed from: b */
        public int f18212b;

        /* renamed from: c */
        public float f18213c;

        private C7714a() {
        }
    }

    public C7712y(int i) {
        this.f18204c = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m22086b(C7714a aVar, C7714a aVar2) {
        return aVar.f18211a - aVar2.f18211a;
    }

    /* renamed from: b */
    private void m22087b() {
        if (this.f18207f != 1) {
            Collections.sort(this.f18205d, f18202a);
            this.f18207f = 1;
        }
    }

    /* renamed from: c */
    private void m22088c() {
        if (this.f18207f != 0) {
            Collections.sort(this.f18205d, f18203b);
            this.f18207f = 0;
        }
    }

    /* renamed from: a */
    public float mo54947a(float f) {
        m22088c();
        float f2 = f * ((float) this.f18209h);
        int i = 0;
        for (int i2 = 0; i2 < this.f18205d.size(); i2++) {
            C7714a aVar = this.f18205d.get(i2);
            i += aVar.f18212b;
            if (((float) i) >= f2) {
                return aVar.f18213c;
            }
        }
        if (this.f18205d.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C7714a> arrayList = this.f18205d;
        return arrayList.get(arrayList.size() - 1).f18213c;
    }

    /* renamed from: a */
    public void mo54948a() {
        this.f18205d.clear();
        this.f18207f = -1;
        this.f18208g = 0;
        this.f18209h = 0;
    }

    /* renamed from: a */
    public void mo54949a(int i, float f) {
        C7714a aVar;
        int i2;
        C7714a aVar2;
        m22087b();
        int i3 = this.f18210i;
        if (i3 > 0) {
            C7714a[] aVarArr = this.f18206e;
            int i4 = i3 - 1;
            this.f18210i = i4;
            aVar = aVarArr[i4];
        } else {
            aVar = new C7714a();
        }
        int i5 = this.f18208g;
        this.f18208g = i5 + 1;
        aVar.f18211a = i5;
        aVar.f18212b = i;
        aVar.f18213c = f;
        this.f18205d.add(aVar);
        int i6 = this.f18209h + i;
        while (true) {
            this.f18209h = i6;
            while (true) {
                int i7 = this.f18209h;
                int i8 = this.f18204c;
                if (i7 > i8) {
                    i2 = i7 - i8;
                    aVar2 = this.f18205d.get(0);
                    if (aVar2.f18212b > i2) {
                        break;
                    }
                    this.f18209h -= aVar2.f18212b;
                    this.f18205d.remove(0);
                    int i9 = this.f18210i;
                    if (i9 < 5) {
                        C7714a[] aVarArr2 = this.f18206e;
                        this.f18210i = i9 + 1;
                        aVarArr2[i9] = aVar2;
                    }
                } else {
                    return;
                }
            }
            aVar2.f18212b -= i2;
            i6 = this.f18209h - i2;
        }
    }
}
