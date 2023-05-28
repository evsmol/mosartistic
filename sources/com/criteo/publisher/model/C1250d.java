package com.criteo.publisher.model;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.criteo.publisher.model.d */
/* compiled from: $AutoValue_RemoteConfigRequest */
abstract class C1250d extends C1282w {

    /* renamed from: a */
    private final String f3885a;

    /* renamed from: b */
    private final String f3886b;

    /* renamed from: c */
    private final String f3887c;

    /* renamed from: d */
    private final int f3888d;

    /* renamed from: e */
    private final String f3889e;

    /* renamed from: f */
    private final String f3890f;

    C1250d(String str, String str2, String str3, int i, String str4, String str5) {
        if (str != null) {
            this.f3885a = str;
            if (str2 != null) {
                this.f3886b = str2;
                if (str3 != null) {
                    this.f3887c = str3;
                    this.f3888d = i;
                    this.f3889e = str4;
                    if (str5 != null) {
                        this.f3890f = str5;
                        return;
                    }
                    throw new NullPointerException("Null deviceOs");
                }
                throw new NullPointerException("Null sdkVersion");
            }
            throw new NullPointerException("Null bundleId");
        }
        throw new NullPointerException("Null criteoPublisherId");
    }

    @SerializedName("cpId")
    /* renamed from: b */
    public String mo3501b() {
        return this.f3885a;
    }

    /* renamed from: a */
    public String mo3500a() {
        return this.f3886b;
    }

    /* renamed from: f */
    public String mo3506f() {
        return this.f3887c;
    }

    @SerializedName("rtbProfileId")
    /* renamed from: e */
    public int mo3504e() {
        return this.f3888d;
    }

    /* renamed from: c */
    public String mo3502c() {
        return this.f3889e;
    }

    /* renamed from: d */
    public String mo3503d() {
        return this.f3890f;
    }

    public String toString() {
        return "RemoteConfigRequest{criteoPublisherId=" + this.f3885a + ", bundleId=" + this.f3886b + ", sdkVersion=" + this.f3887c + ", profileId=" + this.f3888d + ", deviceId=" + this.f3889e + ", deviceOs=" + this.f3890f + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1282w)) {
            return false;
        }
        C1282w wVar = (C1282w) obj;
        if (!this.f3885a.equals(wVar.mo3501b()) || !this.f3886b.equals(wVar.mo3500a()) || !this.f3887c.equals(wVar.mo3506f()) || this.f3888d != wVar.mo3504e() || ((str = this.f3889e) != null ? !str.equals(wVar.mo3502c()) : wVar.mo3502c() != null) || !this.f3890f.equals(wVar.mo3503d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((((this.f3885a.hashCode() ^ 1000003) * 1000003) ^ this.f3886b.hashCode()) * 1000003) ^ this.f3887c.hashCode()) * 1000003) ^ this.f3888d) * 1000003;
        String str = this.f3889e;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3890f.hashCode();
    }
}
