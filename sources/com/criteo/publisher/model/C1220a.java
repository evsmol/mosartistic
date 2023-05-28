package com.criteo.publisher.model;

import com.criteo.publisher.p070l0.p071d.C1177c;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.criteo.publisher.model.a */
/* compiled from: $AutoValue_CdbRequest */
abstract class C1220a extends C1268o {

    /* renamed from: a */
    private final String f3821a;

    /* renamed from: b */
    private final C1281v f3822b;

    /* renamed from: c */
    private final C1285z f3823c;

    /* renamed from: d */
    private final String f3824d;

    /* renamed from: e */
    private final int f3825e;

    /* renamed from: f */
    private final C1177c f3826f;

    /* renamed from: g */
    private final List<C1270q> f3827g;

    C1220a(String str, C1281v vVar, C1285z zVar, String str2, int i, C1177c cVar, List<C1270q> list) {
        if (str != null) {
            this.f3821a = str;
            if (vVar != null) {
                this.f3822b = vVar;
                if (zVar != null) {
                    this.f3823c = zVar;
                    if (str2 != null) {
                        this.f3824d = str2;
                        this.f3825e = i;
                        this.f3826f = cVar;
                        if (list != null) {
                            this.f3827g = list;
                            return;
                        }
                        throw new NullPointerException("Null slots");
                    }
                    throw new NullPointerException("Null sdkVersion");
                }
                throw new NullPointerException("Null user");
            }
            throw new NullPointerException("Null publisher");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: b */
    public String mo3394b() {
        return this.f3821a;
    }

    /* renamed from: d */
    public C1281v mo3396d() {
        return this.f3822b;
    }

    /* renamed from: g */
    public C1285z mo3400g() {
        return this.f3823c;
    }

    /* renamed from: e */
    public String mo3397e() {
        return this.f3824d;
    }

    /* renamed from: c */
    public int mo3395c() {
        return this.f3825e;
    }

    @SerializedName("gdprConsent")
    /* renamed from: a */
    public C1177c mo3393a() {
        return this.f3826f;
    }

    /* renamed from: f */
    public List<C1270q> mo3399f() {
        return this.f3827g;
    }

    public String toString() {
        return "CdbRequest{id=" + this.f3821a + ", publisher=" + this.f3822b + ", user=" + this.f3823c + ", sdkVersion=" + this.f3824d + ", profileId=" + this.f3825e + ", gdprData=" + this.f3826f + ", slots=" + this.f3827g + "}";
    }

    public boolean equals(Object obj) {
        C1177c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1268o)) {
            return false;
        }
        C1268o oVar = (C1268o) obj;
        if (!this.f3821a.equals(oVar.mo3394b()) || !this.f3822b.equals(oVar.mo3396d()) || !this.f3823c.equals(oVar.mo3400g()) || !this.f3824d.equals(oVar.mo3397e()) || this.f3825e != oVar.mo3395c() || ((cVar = this.f3826f) != null ? !cVar.equals(oVar.mo3393a()) : oVar.mo3393a() != null) || !this.f3827g.equals(oVar.mo3399f())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f3821a.hashCode() ^ 1000003) * 1000003) ^ this.f3822b.hashCode()) * 1000003) ^ this.f3823c.hashCode()) * 1000003) ^ this.f3824d.hashCode()) * 1000003) ^ this.f3825e) * 1000003;
        C1177c cVar = this.f3826f;
        return ((hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003) ^ this.f3827g.hashCode();
    }
}
