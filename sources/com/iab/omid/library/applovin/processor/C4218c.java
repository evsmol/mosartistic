package com.iab.omid.library.applovin.processor;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4207c;
import com.iab.omid.library.applovin.processor.C4215a;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4230e;
import com.iab.omid.library.applovin.utils.C4234h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.processor.c */
public class C4218c implements C4215a {

    /* renamed from: a */
    private final C4215a f10084a;

    public C4218c(C4215a aVar) {
        this.f10084a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo32596a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4207c c = C4207c.m11754c();
        if (c != null) {
            Collection<C4197a> a = c.mo32544a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            for (C4197a c2 : a) {
                View c3 = c2.mo32495c();
                if (c3 != null && C4234h.m11897e(c3) && (rootView = c3.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c4 = C4234h.m11895c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4234h.m11895c(arrayList.get(size - 1)) > c4) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo32591a(View view) {
        JSONObject a = C4226c.m11854a(0, 0, 0, 0);
        C4226c.m11856a(a, C4230e.m11875a());
        return a;
    }

    /* renamed from: a */
    public void mo32592a(View view, JSONObject jSONObject, C4215a.C4216a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo32596a().iterator();
        while (it.hasNext()) {
            aVar.mo32593a(it.next(), this.f10084a, jSONObject, z2);
        }
    }
}
