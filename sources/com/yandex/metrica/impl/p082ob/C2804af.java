package com.yandex.metrica.impl.p082ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p082ob.C3586vf;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.af */
public class C2804af {

    /* renamed from: c */
    private static final int[] f7393c = {0, 1, 2, 3};

    /* renamed from: a */
    private final SparseArray<HashMap<String, C3586vf.C3587a>> f7394a;

    /* renamed from: b */
    private int f7395b;

    public C2804af() {
        this(f7393c);
    }

    /* renamed from: a */
    public C3586vf.C3587a mo17188a(int i, String str) {
        return (C3586vf.C3587a) this.f7394a.get(i).get(str);
    }

    /* renamed from: b */
    public void mo17190b() {
        this.f7395b++;
    }

    /* renamed from: c */
    public C3586vf mo17191c() {
        C3586vf vfVar = new C3586vf();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f7394a.size(); i++) {
            SparseArray<HashMap<String, C3586vf.C3587a>> sparseArray = this.f7394a;
            for (C3586vf.C3587a add : sparseArray.get(sparseArray.keyAt(i)).values()) {
                arrayList.add(add);
            }
        }
        vfVar.f9338a = (C3586vf.C3587a[]) arrayList.toArray(new C3586vf.C3587a[arrayList.size()]);
        return vfVar;
    }

    C2804af(int[] iArr) {
        this.f7394a = new SparseArray<>();
        this.f7395b = 0;
        for (int put : iArr) {
            this.f7394a.put(put, new HashMap());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17189a(C3586vf.C3587a aVar) {
        this.f7394a.get(aVar.f9341b).put(new String(aVar.f9340a), aVar);
    }

    /* renamed from: a */
    public int mo17187a() {
        return this.f7395b;
    }
}
