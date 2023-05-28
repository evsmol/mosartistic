package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.j4 */
public class C3079j4 {

    /* renamed from: a */
    private final Object f8095a;

    /* renamed from: b */
    private final C3339p4 f8096b;

    /* renamed from: c */
    private final HashMap<C3049i4, C3116k4> f8097c;

    /* renamed from: d */
    private final C3458rm<C3080a, C3049i4> f8098d;

    /* renamed from: e */
    private final Context f8099e;

    /* renamed from: f */
    private volatile int f8100f;

    /* renamed from: g */
    private final C3200m4 f8101g;

    /* renamed from: com.yandex.metrica.impl.ob.j4$a */
    private static final class C3080a {

        /* renamed from: a */
        private final String f8102a;

        /* renamed from: b */
        private final Integer f8103b;

        /* renamed from: c */
        private final String f8104c;

        C3080a(String str, Integer num, String str2) {
            this.f8102a = str;
            this.f8103b = num;
            this.f8104c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3080a.class != obj.getClass()) {
                return false;
            }
            C3080a aVar = (C3080a) obj;
            if (!this.f8102a.equals(aVar.f8102a)) {
                return false;
            }
            Integer num = this.f8103b;
            if (num == null ? aVar.f8103b != null : !num.equals(aVar.f8103b)) {
                return false;
            }
            String str = this.f8104c;
            String str2 = aVar.f8104c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f8102a.hashCode() * 31;
            Integer num = this.f8103b;
            int i = 0;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f8104c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public C3079j4(Context context, C3339p4 p4Var) {
        this(context, p4Var, new C3200m4());
    }

    /* renamed from: a */
    public C3116k4 mo17728a(C3049i4 i4Var, C1941D3 d3) {
        C3116k4 k4Var;
        synchronized (this.f8095a) {
            k4Var = this.f8097c.get(i4Var);
            if (k4Var == null) {
                k4Var = this.f8101g.mo17837a(i4Var).mo17798a(this.f8099e, this.f8096b, i4Var, d3);
                this.f8097c.put(i4Var, k4Var);
                this.f8098d.mo18181a(new C3080a(i4Var.mo17703b(), i4Var.mo17704c(), i4Var.mo17705d()), i4Var);
                this.f8100f++;
            }
        }
        return k4Var;
    }

    C3079j4(Context context, C3339p4 p4Var, C3200m4 m4Var) {
        this.f8095a = new Object();
        this.f8097c = new HashMap<>();
        this.f8098d = new C3458rm<>();
        this.f8100f = 0;
        this.f8099e = context.getApplicationContext();
        this.f8096b = p4Var;
        this.f8101g = m4Var;
    }

    /* renamed from: a */
    public void mo17729a(String str, int i, String str2) {
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.f8095a) {
            Collection<C3049i4> b = this.f8098d.mo18183b(new C3080a(str, valueOf, str2));
            if (!C1848A2.m6814b((Collection) b)) {
                this.f8100f -= b.size();
                ArrayList arrayList = new ArrayList(b.size());
                for (C3049i4 remove : b) {
                    arrayList.add(this.f8097c.remove(remove));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C3116k4) it.next()).mo17621a();
                }
            }
        }
    }
}
