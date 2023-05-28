package com.yandex.metrica.impl.p082ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ln */
public class C3168ln extends C3043hn<Map<String, String>, C2727Xm> {

    /* renamed from: b */
    private final C3136kn f8259b;

    /* renamed from: c */
    private final C3136kn f8260c;

    /* renamed from: d */
    private Comparator<Map.Entry<String, String>> f8261d;

    /* renamed from: com.yandex.metrica.impl.ob.ln$a */
    class C3169a implements Comparator<Map.Entry<String, String>> {
        C3169a(C3168ln lnVar) {
        }

        public int compare(Object obj, Object obj2) {
            int length = C2814b.m9072b((String) ((Map.Entry) obj).getValue()).length;
            int length2 = C2814b.m9072b((String) ((Map.Entry) obj2).getValue()).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public C3168ln(int i, int i2, int i3) {
        this(i, new C3136kn(i2), new C3136kn(i3));
    }

    public C3168ln(int i, C3136kn knVar, C3136kn knVar2) {
        super(i);
        this.f8261d = new C3169a(this);
        this.f8259b = knVar;
        this.f8260c = knVar2;
    }

    /* renamed from: a */
    public C3011gn<Map<String, String>, C2727Xm> mo17691a(Map<String, String> map) {
        int i;
        HashMap hashMap;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f8261d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                C3011gn<String, C2671Vm> a = this.f8259b.mo17691a((String) entry.getKey());
                C3011gn<String, C2671Vm> a2 = this.f8260c.mo17691a((String) entry.getValue());
                int length2 = C2814b.m9072b((String) entry.getKey()).length + C2814b.m9072b((String) entry.getValue()).length;
                int length3 = C2814b.m9072b((String) a.f7938a).length + C2814b.m9072b((String) a2.f7938a).length;
                if (z || length3 + i4 > mo17690a()) {
                    i3++;
                    i += length2;
                    z = true;
                } else {
                    i = i + a.f7939b.mo16355a() + a2.f7939b.mo16355a();
                    i4 += C2814b.m9072b((String) a.f7938a).length + C2814b.m9072b((String) a2.f7938a).length;
                    hashMap.put(a.f7938a, a2.f7938a);
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new C3011gn<>(hashMap, new C2727Xm(i2, i));
    }
}
