package com.appnext.base.operations.imp;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C8864c;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.p264b.C8853f;
import com.appnext.base.p264b.C8855h;
import com.appnext.base.p264b.C8857j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class acap extends C8864c {

    /* renamed from: et */
    private static final long f22466et = 1;

    /* renamed from: eu */
    private static final String f22467eu = "ft";

    /* renamed from: ev */
    private static final String f22468ev = "nfga";

    /* renamed from: ew */
    private static final String f22469ew = "android";

    public acap(C8838c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: aF */
    public final boolean mo58783aF() {
        if (Build.VERSION.SDK_INT < 21) {
            return C8853f.m26677a(C8852e.getContext(), "android.permission.GET_TASKS");
        }
        return C8857j.m26708f(C8852e.getContext().getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public List<C8837b> getData() {
        try {
            List<String> a = C8857j.m26699a(C8852e.getContext(), (long) C8857j.m26709g(mo58788ay().mo58703al(), mo58788ay().mo58704am()), mo58788ay().mo58700a(f22467eu, 1));
            if (a == null) {
                a = null;
            } else {
                Iterator<String> it = a.iterator();
                while (it.hasNext()) {
                    if (it.next().equalsIgnoreCase(f22469ew)) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (a == null || a.isEmpty()) {
                arrayList.add(new C8837b(getKey(), f22468ev, C8850d.C8851a.String.toString()));
            } else {
                for (String bVar : a) {
                    arrayList.add(new C8837b(getKey(), bVar, C8850d.C8851a.String.toString()));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C8837b> mo58789b(List<C8837b> list) {
        if (list == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C8837b next : list) {
            String L = C8855h.m26688aO().mo58752L(next.mo58695ai());
            if (!TextUtils.isEmpty(L) && !L.equals(f22468ev) && !hashMap.containsKey(L)) {
                hashMap.put(L, next);
            }
        }
        if (hashMap.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new CollectedDataModelByDateComparator());
        return arrayList;
    }

    /* renamed from: f */
    private static List<String> m26756f(List<String> list) {
        if (list == null) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(f22469ew)) {
                it.remove();
            }
        }
        return list;
    }

    private class CollectedDataModelByDateComparator implements Comparator<C8837b> {
        private CollectedDataModelByDateComparator() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C8837b) obj).mo58696aj().getTime() > ((C8837b) obj2).mo58696aj().getTime() ? 1 : 0;
        }

        /* renamed from: a */
        public static int m26759a(C8837b bVar, C8837b bVar2) {
            return bVar.mo58696aj().getTime() > bVar2.mo58696aj().getTime() ? 1 : 0;
        }
    }

    /* access modifiers changed from: protected */
    public String getKey() {
        return acap.class.getSimpleName();
    }
}
