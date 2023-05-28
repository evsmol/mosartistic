package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gh */
public class C3003gh {

    /* renamed from: a */
    private final ProtobufStateStorage<C2926eh> f7922a;

    /* renamed from: b */
    private final C2968fh f7923b;

    /* renamed from: c */
    private final C2291M0 f7924c;

    public C3003gh(ProtobufStateStorage<C2926eh> protobufStateStorage) {
        this(protobufStateStorage, new C2968fh(), C3322oh.m10248a());
    }

    /* renamed from: a */
    public void mo17639a() {
        C2291M0 m0 = this.f7924c;
        C2968fh fhVar = this.f7923b;
        List<C3034hh> list = ((C2926eh) this.f7922a.read()).f7761a;
        fhVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (C3034hh next : list) {
            ArrayList arrayList2 = new ArrayList(next.f7989b.size());
            for (String next2 : next.f7989b) {
                if (C3015h2.m9660a(next2)) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C3034hh(next.f7988a, arrayList2));
            }
        }
        fhVar.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3034hh hhVar = (C3034hh) it.next();
            try {
                jSONObject.put(hhVar.f7988a, new JSONObject().put("classes", new JSONArray(hhVar.f7989b)));
            } catch (Throwable unused) {
            }
        }
        m0.reportEvent("sdk_list", jSONObject.toString());
    }

    public C3003gh(ProtobufStateStorage<C2926eh> protobufStateStorage, C2968fh fhVar, C2291M0 m0) {
        this.f7922a = protobufStateStorage;
        this.f7923b = fhVar;
        this.f7924c = m0;
    }
}
