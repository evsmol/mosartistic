package com.iab.omid.library.ironsrc.p112c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.p112c.C4320a;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.d */
public class C4324d implements C4320a {

    /* renamed from: a */
    private final int[] f10318a = new int[2];

    /* renamed from: a */
    private void m12272a(ViewGroup viewGroup, JSONObject jSONObject, C4320a.C4321a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo32977a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m12273b(ViewGroup viewGroup, JSONObject jSONObject, C4320a.C4321a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo32977a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo32975a(View view) {
        if (view == null) {
            return C4326b.m12281a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10318a);
        int[] iArr = this.f10318a;
        return C4326b.m12281a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo32976a(View view, JSONObject jSONObject, C4320a.C4321a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m12272a(viewGroup, jSONObject, aVar);
            } else {
                m12273b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
