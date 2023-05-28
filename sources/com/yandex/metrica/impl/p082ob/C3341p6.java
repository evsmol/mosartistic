package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.p6 */
public class C3341p6 implements C3310o6 {

    /* renamed from: a */
    private final List<C3240mm<String>> f8555a;

    /* renamed from: b */
    private final C3608w7 f8556b;

    /* renamed from: c */
    private final C3240mm<String> f8557c;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    class C3342a implements C3240mm<String> {
        C3342a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C3341p6.m10292a(C3341p6.this, (String) obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3341p6(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.w7 r0 = new com.yandex.metrica.impl.ob.w7
            java.lang.String r1 = com.yandex.metrica.impl.p082ob.C2814b.m9061a((android.content.Context) r4)
            java.io.File r4 = com.yandex.metrica.coreutils.p080io.FileUtils.getStorageDirectory(r4)
            if (r4 != 0) goto L_0x000e
            r4 = 0
            goto L_0x0028
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.String r4 = "appmetrica_native_crashes"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x0028:
            r0.<init>(r1, r4)
            r3.<init>((com.yandex.metrica.impl.p082ob.C3608w7) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3341p6.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public synchronized void mo17909a(C3240mm<String> mmVar) {
        this.f8555a.add(mmVar);
    }

    /* renamed from: b */
    public synchronized void mo17910b(C3240mm<String> mmVar) {
        this.f8555a.remove(mmVar);
    }

    /* renamed from: a */
    public void mo15575a() {
        this.f8556b.mo18357a(this.f8557c);
    }

    /* renamed from: b */
    public void mo15576b() {
        this.f8556b.mo18358b(this.f8557c);
    }

    /* renamed from: a */
    static void m10292a(C3341p6 p6Var, String str) {
        ArrayList arrayList;
        synchronized (p6Var) {
            arrayList = new ArrayList(p6Var.f8555a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3240mm) it.next()).mo15447b(str);
        }
    }

    C3341p6(C3608w7 w7Var) {
        this.f8555a = new ArrayList();
        this.f8557c = new C3342a();
        this.f8556b = w7Var;
    }
}
