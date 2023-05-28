package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p234a.C8070a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.h */
public class C8287h {

    /* renamed from: a */
    private final List<C8288a> f20371a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.mediation.h$a */
    public interface C8288a {
        /* renamed from: a */
        void mo56676a(C8070a aVar);
    }

    /* renamed from: a */
    public void mo56673a(C8070a aVar) {
        Iterator it = new ArrayList(this.f20371a).iterator();
        while (it.hasNext()) {
            ((C8288a) it.next()).mo56676a(aVar);
        }
    }

    /* renamed from: a */
    public void mo56674a(C8288a aVar) {
        this.f20371a.add(aVar);
    }

    /* renamed from: b */
    public void mo56675b(C8288a aVar) {
        this.f20371a.remove(aVar);
    }
}
