package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.q */
public class C8549q {

    /* renamed from: a */
    private final String f21589a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final String f21590b;

    /* renamed from: c */
    private final Map<String, Object> f21591c;

    /* renamed from: d */
    private final long f21592d;

    public C8549q(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f21590b = str;
        Map<String, Object> map3 = CollectionUtils.map();
        this.f21591c = map3;
        map3.putAll(map);
        this.f21591c.put("applovin_sdk_super_properties", map2);
        this.f21592d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public String mo57645a() {
        return this.f21590b;
    }

    /* renamed from: b */
    public Map<String, Object> mo57646b() {
        return this.f21591c;
    }

    /* renamed from: c */
    public long mo57647c() {
        return this.f21592d;
    }

    /* renamed from: d */
    public String mo57648d() {
        return this.f21589a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8549q qVar = (C8549q) obj;
        if (this.f21592d != qVar.f21592d) {
            return false;
        }
        String str = this.f21590b;
        if (str == null ? qVar.f21590b != null : !str.equals(qVar.f21590b)) {
            return false;
        }
        Map<String, Object> map = this.f21591c;
        if (map == null ? qVar.f21591c != null : !map.equals(qVar.f21591c)) {
            return false;
        }
        String str2 = this.f21589a;
        String str3 = qVar.f21589a;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f21590b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f21591c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.f21592d;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f21589a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Event{name='" + this.f21590b + '\'' + ", id='" + this.f21589a + '\'' + ", creationTimestampMillis=" + this.f21592d + ", parameters=" + this.f21591c + '}';
    }
}
