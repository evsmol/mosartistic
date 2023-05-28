package com.applovin.impl.p233b;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.b.j */
public class C8043j {

    /* renamed from: a */
    private String f19477a;

    /* renamed from: b */
    private String f19478b;

    private C8043j() {
    }

    /* renamed from: a */
    public static C8043j m23941a(C8622s sVar, C8043j jVar, C8490n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            if (jVar == null) {
                try {
                    jVar = new C8043j();
                } catch (Throwable th) {
                    nVar.mo57320D();
                    if (!C8626v.m26252a()) {
                        return null;
                    }
                    nVar.mo57320D().mo57819b("VastSystemInfo", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (!StringUtils.isValidString(jVar.f19477a)) {
                String c = sVar.mo57799c();
                if (StringUtils.isValidString(c)) {
                    jVar.f19477a = c;
                }
            }
            if (!StringUtils.isValidString(jVar.f19478b)) {
                String str = sVar.mo57797b().get("version");
                if (StringUtils.isValidString(str)) {
                    jVar.f19478b = str;
                }
            }
            return jVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8043j)) {
            return false;
        }
        C8043j jVar = (C8043j) obj;
        String str = this.f19477a;
        if (str == null ? jVar.f19477a != null : !str.equals(jVar.f19477a)) {
            return false;
        }
        String str2 = this.f19478b;
        String str3 = jVar.f19478b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f19477a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19478b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f19477a + '\'' + ", version='" + this.f19478b + '\'' + '}';
    }
}
