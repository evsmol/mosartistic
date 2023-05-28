package com.yandex.metrica.impl.p082ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.lb */
public class C3154lb implements C3207mb, C3257nb {

    /* renamed from: a */
    private final Set<Integer> f8237a;

    /* renamed from: b */
    private AtomicLong f8238b;

    public C3154lb(C2265L7 l7) {
        HashSet hashSet = new HashSet();
        this.f8237a = hashSet;
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_FIRST_ACTIVATION.mo17139b()));
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_APP_UPDATE.mo17139b()));
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_INIT.mo17139b()));
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_IDENTITY.mo17139b()));
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_SEND_REFERRER.mo17139b()));
        l7.mo16157a((C3257nb) this);
        this.f8238b = new AtomicLong(l7.mo16150a((Set<Integer>) hashSet));
    }

    /* renamed from: a */
    public boolean mo17804a() {
        return this.f8238b.get() > 0;
    }

    /* renamed from: b */
    public void mo17805b(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f8237a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f8238b.addAndGet((long) (-i));
    }

    /* renamed from: a */
    public void mo17803a(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f8237a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f8238b.addAndGet((long) i);
    }
}
