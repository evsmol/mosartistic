package com.ironsource.p117b;

import android.util.Pair;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.p119d.C4371b;
import com.ironsource.p119d.C4374c;
import java.util.ArrayList;

/* renamed from: com.ironsource.b.b */
public final class C4365b implements Runnable {

    /* renamed from: a */
    private C4366c f10399a;

    /* renamed from: b */
    private String f10400b;

    /* renamed from: c */
    private String f10401c;

    /* renamed from: d */
    private ArrayList<C4532c> f10402d;

    public C4365b(C4366c cVar, String str, String str2, ArrayList<C4532c> arrayList) {
        this.f10399a = cVar;
        this.f10400b = str;
        this.f10401c = str2;
        this.f10402d = arrayList;
    }

    public final void run() {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C4374c a = C4371b.m12425a(this.f10401c, this.f10400b, arrayList);
            if (a.f10421a == 200 || a.f10421a == 204) {
                z = true;
            }
        } catch (Exception unused) {
        }
        C4366c cVar = this.f10399a;
        if (cVar != null) {
            cVar.mo33151a((ArrayList<C4532c>) null, z);
        }
    }
}
