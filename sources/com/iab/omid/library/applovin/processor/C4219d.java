package com.iab.omid.library.applovin.processor;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.processor.C4215a;
import com.iab.omid.library.applovin.utils.C4226c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.processor.d */
public class C4219d implements C4215a {

    /* renamed from: a */
    private final int[] f10085a = new int[2];

    /* renamed from: a */
    private void m11813a(ViewGroup viewGroup, JSONObject jSONObject, C4215a.C4216a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo32593a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m11814b(ViewGroup viewGroup, JSONObject jSONObject, C4215a.C4216a aVar, boolean z) {
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
                aVar.mo32593a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo32591a(View view) {
        if (view == null) {
            return C4226c.m11854a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10085a);
        int[] iArr = this.f10085a;
        return C4226c.m11854a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo32592a(View view, JSONObject jSONObject, C4215a.C4216a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m11813a(viewGroup, jSONObject, aVar, z2);
            } else {
                m11814b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
