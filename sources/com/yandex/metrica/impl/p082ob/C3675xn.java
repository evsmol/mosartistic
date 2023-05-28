package com.yandex.metrica.impl.p082ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.xn */
public class C3675xn<T> implements Comparator<Collection<T>> {

    /* renamed from: a */
    private final C3561un<T> f9479a;

    /* renamed from: b */
    private final Comparator<T> f9480b;

    public C3675xn(C3561un<T> unVar, Comparator<T> comparator) {
        this.f9479a = unVar;
        this.f9480b = comparator;
    }

    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        boolean z = true;
        boolean z2 = collection == null;
        if (collection2 != null) {
            z = false;
        }
        if (!(z ^ z2)) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap hashMap = new HashMap();
                for (Object next : collection) {
                    hashMap.put(this.f9479a.mo15574a(next), next);
                }
                for (Object next2 : collection2) {
                    Object obj3 = hashMap.get(this.f9479a.mo15574a(next2));
                    if (obj3 != null) {
                        if (this.f9480b.compare(obj3, next2) != 0) {
                        }
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
