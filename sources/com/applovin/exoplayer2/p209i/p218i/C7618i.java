package com.applovin.exoplayer2.p209i.p218i;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.i.i */
final class C7618i implements C7585f {

    /* renamed from: a */
    private final List<C7609e> f17795a;

    /* renamed from: b */
    private final long[] f17796b;

    /* renamed from: c */
    private final long[] f17797c;

    public C7618i(List<C7609e> list) {
        this.f17795a = Collections.unmodifiableList(new ArrayList(list));
        this.f17796b = new long[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            C7609e eVar = list.get(i);
            int i2 = i * 2;
            this.f17796b[i2] = eVar.f17766b;
            this.f17796b[i2 + 1] = eVar.f17767c;
        }
        long[] jArr = this.f17796b;
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        this.f17797c = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public int mo54694a(long j) {
        int b = C7728ai.m22228b(this.f17797c, j, false, false);
        if (b < this.f17797c.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo54695a(int i) {
        boolean z = true;
        C7717a.m22118a(i >= 0);
        if (i >= this.f17797c.length) {
            z = false;
        }
        C7717a.m22118a(z);
        return this.f17797c[i];
    }

    /* renamed from: b */
    public List<C7540a> mo54696b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f17795a.size(); i++) {
            long[] jArr = this.f17796b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C7609e eVar = this.f17795a.get(i);
                if (eVar.f17765a.f17405f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(eVar.f17765a);
                }
            }
        }
        Collections.sort(arrayList2, $$Lambda$i$0tJQUjq4SOd_D0syoU6EjHsKTHY.INSTANCE);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C7609e) arrayList2.get(i3)).f17765a.mo54635a().mo54639a((float) (-1 - i3), 1).mo54656e());
        }
        return arrayList;
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return this.f17797c.length;
    }
}
