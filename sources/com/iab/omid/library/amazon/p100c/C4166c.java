package com.iab.omid.library.amazon.p100c;

import android.view.View;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p099b.C4154a;
import com.iab.omid.library.amazon.p100c.C4163a;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.p101d.C4174f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.c.c */
public class C4166c implements C4163a {

    /* renamed from: a */
    private final C4163a f9962a;

    public C4166c(C4163a aVar) {
        this.f9962a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo32387a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4154a a = C4154a.m11508a();
        if (a != null) {
            Collection<C4152a> c = a.mo32339c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4152a e : c) {
                View e2 = e.mo32305e();
                if (e2 != null && C4174f.m11614c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4174f.m11612a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4174f.m11612a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo32382a(View view) {
        return C4169b.m11579a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo32383a(View view, JSONObject jSONObject, C4163a.C4164a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo32387a().iterator();
        while (it.hasNext()) {
            aVar.mo32384a(it.next(), this.f9962a, jSONObject, z2);
        }
    }
}
