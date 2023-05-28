package com.iab.omid.library.amazon.p100c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.amazon.p100c.C4163a;
import com.iab.omid.library.amazon.p101d.C4169b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.c.d */
public class C4167d implements C4163a {

    /* renamed from: a */
    private final int[] f9963a = new int[2];

    /* renamed from: a */
    private void m11570a(ViewGroup viewGroup, JSONObject jSONObject, C4163a.C4164a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo32384a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m11571b(ViewGroup viewGroup, JSONObject jSONObject, C4163a.C4164a aVar, boolean z) {
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
                aVar.mo32384a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo32382a(View view) {
        if (view == null) {
            return C4169b.m11579a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f9963a);
        int[] iArr = this.f9963a;
        return C4169b.m11579a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo32383a(View view, JSONObject jSONObject, C4163a.C4164a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m11570a(viewGroup, jSONObject, aVar, z2);
            } else {
                m11571b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
