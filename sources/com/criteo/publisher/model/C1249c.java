package com.criteo.publisher.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* renamed from: com.criteo.publisher.model.c */
/* compiled from: $AutoValue_Publisher */
abstract class C1249c extends C1281v {

    /* renamed from: a */
    private final String f3882a;

    /* renamed from: b */
    private final String f3883b;

    /* renamed from: c */
    private final Map<String, Object> f3884c;

    C1249c(String str, String str2, Map<String, Object> map) {
        if (str != null) {
            this.f3882a = str;
            if (str2 != null) {
                this.f3883b = str2;
                if (map != null) {
                    this.f3884c = map;
                    return;
                }
                throw new NullPointerException("Null ext");
            }
            throw new NullPointerException("Null criteoPublisherId");
        }
        throw new NullPointerException("Null bundleId");
    }

    /* renamed from: a */
    public String mo3494a() {
        return this.f3882a;
    }

    @SerializedName("cpId")
    /* renamed from: b */
    public String mo3495b() {
        return this.f3883b;
    }

    /* renamed from: c */
    public Map<String, Object> mo3496c() {
        return this.f3884c;
    }

    public String toString() {
        return "Publisher{bundleId=" + this.f3882a + ", criteoPublisherId=" + this.f3883b + ", ext=" + this.f3884c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1281v)) {
            return false;
        }
        C1281v vVar = (C1281v) obj;
        if (!this.f3882a.equals(vVar.mo3494a()) || !this.f3883b.equals(vVar.mo3495b()) || !this.f3884c.equals(vVar.mo3496c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f3882a.hashCode() ^ 1000003) * 1000003) ^ this.f3883b.hashCode()) * 1000003) ^ this.f3884c.hashCode();
    }
}
