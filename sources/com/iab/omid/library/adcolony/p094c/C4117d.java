package com.iab.omid.library.adcolony.p094c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.adcolony.p094c.C4113a;
import com.iab.omid.library.adcolony.p095d.C4119b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.d */
public class C4117d implements C4113a {

    /* renamed from: a */
    private final int[] f9846a = new int[2];

    /* renamed from: a */
    private void m11340a(ViewGroup viewGroup, JSONObject jSONObject, C4113a.C4114a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo32185a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m11341b(ViewGroup viewGroup, JSONObject jSONObject, C4113a.C4114a aVar, boolean z) {
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
                aVar.mo32185a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo32183a(View view) {
        if (view == null) {
            return C4119b.m11349a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f9846a);
        int[] iArr = this.f9846a;
        return C4119b.m11349a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo32184a(View view, JSONObject jSONObject, C4113a.C4114a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m11340a(viewGroup, jSONObject, aVar, z2);
            } else {
                m11341b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
