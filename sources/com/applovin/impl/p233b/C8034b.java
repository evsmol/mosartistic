package com.applovin.impl.p233b;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.b.b */
public class C8034b {

    /* renamed from: a */
    private final String f19425a;

    /* renamed from: b */
    private final List<C8040h> f19426b;

    /* renamed from: c */
    private final String f19427c;

    /* renamed from: d */
    private final Set<C8044k> f19428d;

    private C8034b(String str, List<C8040h> list, String str2, Set<C8044k> set) {
        this.f19425a = str;
        this.f19426b = list;
        this.f19427c = str2;
        this.f19428d = set;
    }

    /* renamed from: a */
    public static C8034b m23903a(C8622s sVar, C8037e eVar, C8490n nVar) {
        try {
            String str = sVar.mo57797b().get("vendor");
            C8622s c = sVar.mo57798c("VerificationParameters");
            String c2 = c != null ? c.mo57799c() : null;
            List<C8622s> a = sVar.mo57795a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            for (C8622s a2 : a) {
                C8040h a3 = C8040h.m23931a(a2, nVar);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            Map map = CollectionUtils.map();
            C8046m.m23956a(sVar, (Map<String, Set<C8044k>>) map, eVar, nVar);
            return new C8034b(str, arrayList, c2, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57819b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo55876a() {
        return this.f19425a;
    }

    /* renamed from: b */
    public List<C8040h> mo55877b() {
        return this.f19426b;
    }

    /* renamed from: c */
    public String mo55878c() {
        return this.f19427c;
    }

    /* renamed from: d */
    public Set<C8044k> mo55879d() {
        return this.f19428d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8034b bVar = (C8034b) obj;
        String str = this.f19425a;
        if (str == null ? bVar.f19425a != null : !str.equals(bVar.f19425a)) {
            return false;
        }
        List<C8040h> list = this.f19426b;
        if (list == null ? bVar.f19426b != null : !list.equals(bVar.f19426b)) {
            return false;
        }
        String str2 = this.f19427c;
        if (str2 == null ? bVar.f19427c != null : !str2.equals(bVar.f19427c)) {
            return false;
        }
        Set<C8044k> set = this.f19428d;
        Set<C8044k> set2 = bVar.f19428d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f19425a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C8040h> list = this.f19426b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f19427c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<C8044k> set = this.f19428d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f19425a + '\'' + "javascriptResources='" + this.f19426b + '\'' + "verificationParameters='" + this.f19427c + '\'' + "errorEventTrackers='" + this.f19428d + '\'' + '}';
    }
}
