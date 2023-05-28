package com.applovin.impl.p233b;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.b.c */
public class C8035c {

    /* renamed from: a */
    private final List<C8034b> f19429a;

    private C8035c(List<C8034b> list) {
        this.f19429a = list;
    }

    /* renamed from: a */
    public static C8035c m23908a(C8622s sVar, C8035c cVar, C8037e eVar, C8490n nVar) {
        List list;
        if (cVar != null) {
            try {
                list = cVar.mo55883a();
            } catch (Throwable th) {
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57819b("VastAdVerifications", "Error occurred while initializing", th);
                return null;
            }
        } else {
            list = new ArrayList();
        }
        for (C8622s a : sVar.mo57795a("Verification")) {
            C8034b a2 = C8034b.m23903a(a, eVar, nVar);
            if (a2 != null) {
                list.add(a2);
            }
        }
        return new C8035c(list);
    }

    /* renamed from: a */
    public List<C8034b> mo55883a() {
        return this.f19429a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8035c)) {
            return false;
        }
        return this.f19429a.equals(((C8035c) obj).f19429a);
    }

    public int hashCode() {
        return this.f19429a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f19429a + '\'' + '}';
    }
}
