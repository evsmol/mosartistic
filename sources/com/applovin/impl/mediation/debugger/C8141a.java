package com.applovin.impl.mediation.debugger;

import com.applovin.impl.mediation.debugger.p238b.p240b.C8157a;
import com.applovin.impl.mediation.debugger.p238b.p240b.C8158b;
import com.applovin.impl.mediation.debugger.p242c.C8165a;
import com.applovin.impl.mediation.debugger.p242c.C8168b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p256e.C8401a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.a */
public class C8141a implements C8165a.C8167a, C8168b.C8170a {

    /* renamed from: a */
    private final C8490n f19855a;

    /* renamed from: b */
    private final C8142a f19856b;

    /* renamed from: c */
    private C8157a f19857c;

    /* renamed from: com.applovin.impl.mediation.debugger.a$a */
    public interface C8142a {
        /* renamed from: a */
        void mo56305a();

        /* renamed from: a */
        void mo56306a(C8157a aVar);
    }

    public C8141a(C8490n nVar, C8142a aVar) {
        this.f19855a = nVar;
        this.f19856b = aVar;
    }

    /* renamed from: a */
    public void mo56300a() {
        C8157a aVar = this.f19857c;
        if (aVar != null) {
            this.f19856b.mo56306a(aVar);
            return;
        }
        this.f19855a.mo57337V().mo57227a((C8401a) new C8168b(this.f19855a, this));
    }

    /* renamed from: a */
    public void mo56301a(String str) {
        this.f19855a.mo57337V().mo57227a((C8401a) new C8165a(this.f19855a, str, this));
    }

    /* renamed from: b */
    public void mo56302b() {
        this.f19856b.mo56305a();
    }

    /* renamed from: b */
    public void mo56303b(String str) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            C8158b bVar = new C8158b(split[i2], i);
            if (bVar.mo56354e()) {
                String a = bVar.mo56349a();
                List arrayList2 = hashMap.containsKey(a) ? (List) hashMap.get(a) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(bVar);
                    hashMap.put(a, arrayList2);
                }
            } else {
                arrayList.add(bVar);
            }
            i2++;
            i = i3;
        }
        C8157a aVar = new C8157a(hashMap, arrayList);
        this.f19857c = aVar;
        this.f19856b.mo56306a(aVar);
    }

    /* renamed from: c */
    public void mo56304c() {
        this.f19856b.mo56305a();
    }
}
