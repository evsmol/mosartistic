package com.yandex.metrica.impl.p082ob;

import android.os.Build;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Jl */
public class C2210Jl {

    /* renamed from: a */
    private final Set<String> f5921a;

    public C2210Jl(Set<String> set) {
        this.f5921a = set;
    }

    /* renamed from: a */
    public String mo16050a() {
        if (C1848A2.m6808a(21)) {
            String a = m7586a(Build.SUPPORTED_64_BIT_ABIS);
            return a != null ? a : m7586a(Build.SUPPORTED_32_BIT_ABIS);
        }
        return m7586a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
    }

    /* renamed from: a */
    private String m7586a(String[] strArr) {
        for (String str : strArr) {
            if (this.f5921a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}
