package com.applovin.impl.p233b;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;

/* renamed from: com.applovin.impl.b.h */
public class C8040h {

    /* renamed from: a */
    private final String f19467a;

    /* renamed from: b */
    private final String f19468b;

    private C8040h(String str, String str2) {
        this.f19467a = str;
        this.f19468b = str2;
    }

    /* renamed from: a */
    public static C8040h m23931a(C8622s sVar, C8490n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            try {
                return new C8040h(sVar.mo57797b().get("apiFramework"), sVar.mo57799c());
            } catch (Throwable th) {
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57819b("VastJavaScriptResource", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo55910a() {
        return this.f19467a;
    }

    /* renamed from: b */
    public String mo55911b() {
        return this.f19468b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8040h hVar = (C8040h) obj;
        String str = this.f19467a;
        if (str == null ? hVar.f19467a != null : !str.equals(hVar.f19467a)) {
            return false;
        }
        String str2 = this.f19468b;
        String str3 = hVar.f19468b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f19467a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19468b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f19467a + '\'' + ", javascriptResourceUrl='" + this.f19468b + '\'' + '}';
    }
}
