package com.applovin.impl.mediation.debugger.p238b.p239a;

import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.d */
public class C8155d implements Comparable<C8155d> {

    /* renamed from: a */
    private final String f19897a;

    /* renamed from: b */
    private final String f19898b;

    /* renamed from: c */
    private final boolean f19899c;

    /* renamed from: d */
    private final C8160b f19900d;

    C8155d(String str, String str2, boolean z, C8160b bVar) {
        this.f19897a = str;
        this.f19898b = str2;
        this.f19899c = z;
        this.f19900d = bVar;
    }

    /* renamed from: a */
    public int compareTo(C8155d dVar) {
        return this.f19898b.compareToIgnoreCase(dVar.f19898b);
    }

    /* renamed from: a */
    public String mo56340a() {
        return this.f19897a;
    }

    /* renamed from: b */
    public String mo56341b() {
        return this.f19898b;
    }

    /* renamed from: c */
    public C8160b mo56342c() {
        return this.f19900d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8155d dVar = (C8155d) obj;
        String str = this.f19897a;
        if (str == null ? dVar.f19897a != null : !str.equals(dVar.f19897a)) {
            return false;
        }
        String str2 = this.f19898b;
        if (str2 == null ? dVar.f19898b == null : str2.equals(dVar.f19898b)) {
            return this.f19899c == dVar.f19899c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f19897a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19898b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + (this.f19899c ? 1 : 0);
    }
}
