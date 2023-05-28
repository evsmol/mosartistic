package com.appnext.core;

import android.os.Handler;
import com.appnext.core.C8898d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.appnext.core.a */
public final class C8890a {
    private ArrayList<?> ads = null;

    /* renamed from: fH */
    private Long f22517fH = 0L;
    /* access modifiers changed from: private */

    /* renamed from: fI */
    public ArrayList<C8898d.C8905a> f22518fI = new ArrayList<>();

    /* renamed from: fJ */
    private String f22519fJ = "";
    private String placementID;
    private int state = 0;

    /* renamed from: a */
    public final void mo58953a(C8898d.C8905a aVar) {
        if (aVar != null) {
            this.f22518fI.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo58952a(C8890a aVar) {
        ArrayList<C8898d.C8905a> arrayList;
        if (aVar != null && (arrayList = aVar.f22518fI) != null) {
            this.f22518fI.addAll(arrayList);
        }
    }

    /* renamed from: b */
    public final void mo58957b(C8898d.C8905a aVar) {
        if (aVar != null) {
            this.f22518fI.remove(aVar);
        }
    }

    /* renamed from: aU */
    public final Long mo58956aU() {
        return this.f22517fH;
    }

    public final ArrayList<?> getAds() {
        if (this.ads == null) {
            return null;
        }
        ArrayList<?> arrayList = new ArrayList<>();
        Iterator<?> it = this.ads.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final void setPlacementID(String str) {
        this.placementID = str;
    }

    public final int getState() {
        return this.state;
    }

    public final String getPlacementID() {
        return this.placementID;
    }

    public final void setState(int i) {
        this.state = i;
    }

    /* renamed from: a */
    public final void mo58954a(Long l) {
        this.f22517fH = l;
    }

    /* renamed from: d */
    public final void mo58958d(ArrayList<?> arrayList) {
        mo58955a(arrayList, true);
    }

    /* renamed from: a */
    public final void mo58955a(ArrayList<?> arrayList, boolean z) {
        this.ads = arrayList;
        if (z) {
            this.f22517fH = Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: A */
    public final String mo58949A() {
        return this.f22519fJ;
    }

    /* renamed from: N */
    public final void mo58950N(String str) {
        this.f22519fJ = str;
    }

    /* renamed from: e */
    public final synchronized void mo58959e(final ArrayList<?> arrayList) {
        new Handler().post(new Runnable() {
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C8890a.this.f22518fI);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C8898d.C8905a aVar = (C8898d.C8905a) it.next();
                    if (aVar != null) {
                        aVar.mo58343a(arrayList);
                    }
                }
                C8890a.this.f22518fI.clear();
            }
        });
    }

    /* renamed from: O */
    public final synchronized void mo58951O(final String str) {
        new Handler().post(new Runnable() {
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C8890a.this.f22518fI);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C8898d.C8905a aVar = (C8898d.C8905a) it.next();
                    if (aVar != null) {
                        aVar.error(str);
                    }
                }
                C8890a.this.f22518fI.clear();
            }
        });
    }
}
