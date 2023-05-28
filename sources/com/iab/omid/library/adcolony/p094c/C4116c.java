package com.iab.omid.library.adcolony.p094c;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p093b.C4104a;
import com.iab.omid.library.adcolony.p094c.C4113a;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.p095d.C4124f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.c */
public class C4116c implements C4113a {

    /* renamed from: a */
    private final C4113a f9845a;

    public C4116c(C4113a aVar) {
        this.f9845a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo32188a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4104a a = C4104a.m11278a();
        if (a != null) {
            Collection<C4102a> c = a.mo32140c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4102a e : c) {
                View e2 = e.mo32106e();
                if (e2 != null && C4124f.m11384c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4124f.m11382a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4124f.m11382a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo32183a(View view) {
        return C4119b.m11349a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo32184a(View view, JSONObject jSONObject, C4113a.C4114a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo32188a().iterator();
        while (it.hasNext()) {
            aVar.mo32185a(it.next(), this.f9845a, jSONObject, z2);
        }
    }
}
