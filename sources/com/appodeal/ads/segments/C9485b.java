package com.appodeal.ads.segments;

/* renamed from: com.appodeal.ads.segments.b */
public enum C9485b {
    ;
    

    /* renamed from: a */
    public final String f24082a;

    /* renamed from: b */
    public final C9486c f24083b;

    /* access modifiers changed from: public */
    C9485b(String str, C9486c cVar) {
        this.f24082a = str;
        this.f24083b = cVar;
    }

    /* renamed from: a */
    public static C9485b m28063a(String str) {
        for (C9485b bVar : values()) {
            if (bVar.f24082a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
