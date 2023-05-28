package com.iab.omid.library.ironsrc.p112c;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.p111b.C4311a;
import com.iab.omid.library.ironsrc.p112c.C4320a;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.p113d.C4331f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.c */
public class C4323c implements C4320a {

    /* renamed from: a */
    private final C4320a f10317a;

    public C4323c(C4320a aVar) {
        this.f10317a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo32980a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4311a a = C4311a.m12213a();
        if (a != null) {
            Collection<C4309a> c = a.mo32940c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4309a d : c) {
                View d2 = d.mo32906d();
                if (d2 != null && C4331f.m12314c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4331f.m12312a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4331f.m12312a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo32975a(View view) {
        return C4326b.m12281a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo32976a(View view, JSONObject jSONObject, C4320a.C4321a aVar, boolean z) {
        Iterator<View> it = mo32980a().iterator();
        while (it.hasNext()) {
            aVar.mo32977a(it.next(), this.f10317a, jSONObject);
        }
    }
}
