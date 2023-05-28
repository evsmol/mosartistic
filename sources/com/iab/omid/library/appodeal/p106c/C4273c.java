package com.iab.omid.library.appodeal.p106c;

import android.view.View;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.p105b.C4261a;
import com.iab.omid.library.appodeal.p106c.C4270a;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.p107d.C4281f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.c.c */
public class C4273c implements C4270a {

    /* renamed from: a */
    private final C4270a f10203a;

    public C4273c(C4270a aVar) {
        this.f10203a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo32794a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4261a a = C4261a.m11989a();
        if (a != null) {
            Collection<C4259a> c = a.mo32746c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4259a d : c) {
                View d2 = d.mo32712d();
                if (d2 != null && C4281f.m12093c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4281f.m12091a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4281f.m12091a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo32789a(View view) {
        return C4276b.m12060a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo32790a(View view, JSONObject jSONObject, C4270a.C4271a aVar, boolean z) {
        Iterator<View> it = mo32794a().iterator();
        while (it.hasNext()) {
            aVar.mo32791a(it.next(), this.f10203a, jSONObject);
        }
    }
}
