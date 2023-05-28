package com.iab.omid.library.appodeal.p106c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.appodeal.p106c.C4270a;
import com.iab.omid.library.appodeal.p107d.C4276b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.c.d */
public class C4274d implements C4270a {

    /* renamed from: a */
    private final int[] f10204a = new int[2];

    /* renamed from: a */
    private void m12051a(ViewGroup viewGroup, JSONObject jSONObject, C4270a.C4271a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo32791a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m12052b(ViewGroup viewGroup, JSONObject jSONObject, C4270a.C4271a aVar) {
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
                aVar.mo32791a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo32789a(View view) {
        if (view == null) {
            return C4276b.m12060a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10204a);
        int[] iArr = this.f10204a;
        return C4276b.m12060a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo32790a(View view, JSONObject jSONObject, C4270a.C4271a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m12051a(viewGroup, jSONObject, aVar);
            } else {
                m12052b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
