package com.yandex.metrica;

import java.util.Map;

/* renamed from: com.yandex.metrica.g */
public class C10723g {

    /* renamed from: a */
    private String f26866a;

    /* renamed from: b */
    private String f26867b;

    /* renamed from: c */
    private Map<String, String> f26868c;

    /* renamed from: a */
    public void mo64743a(String str) {
        this.f26867b = str;
    }

    /* renamed from: b */
    public void mo64746b(String str) {
        this.f26866a = str;
    }

    /* renamed from: c */
    public String mo64747c() {
        return this.f26866a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10723g.class != obj.getClass()) {
            return false;
        }
        C10723g gVar = (C10723g) obj;
        String str = this.f26866a;
        if (str == null ? gVar.f26866a != null : !str.equals(gVar.f26866a)) {
            return false;
        }
        String str2 = this.f26867b;
        if (str2 == null ? gVar.f26867b != null : !str2.equals(gVar.f26867b)) {
            return false;
        }
        Map<String, String> map = this.f26868c;
        Map<String, String> map2 = gVar.f26868c;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26866a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26867b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f26868c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: a */
    public Map<String, String> mo64742a() {
        return this.f26868c;
    }

    /* renamed from: b */
    public String mo64745b() {
        return this.f26867b;
    }

    /* renamed from: a */
    public void mo64744a(Map<String, String> map) {
        this.f26868c = map;
    }
}
