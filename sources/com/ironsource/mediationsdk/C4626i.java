package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.i */
public final class C4626i {

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<C4627a>> f11461a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f11462b;

    /* renamed from: com.ironsource.mediationsdk.i$a */
    public enum C4627a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C4626i(List<String> list, int i) {
        this.f11462b = i;
        for (String put : list) {
            ArrayList arrayList = new ArrayList();
            this.f11461a.put(put, arrayList);
        }
    }

    /* renamed from: a */
    public final String mo33910a(String str) {
        ArrayList arrayList = this.f11461a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((C4627a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo33911a(ConcurrentHashMap<String, C4627a> concurrentHashMap) {
        if (this.f11462b != 0) {
            for (String next : this.f11461a.keySet()) {
                C4627a aVar = C4627a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f11461a.get(next);
                if (this.f11462b != -1 && arrayList.size() == this.f11462b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}
