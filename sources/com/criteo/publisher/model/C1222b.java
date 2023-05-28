package com.criteo.publisher.model;

import com.google.gson.annotations.SerializedName;
import java.util.Collection;

/* renamed from: com.criteo.publisher.model.b */
/* compiled from: $AutoValue_CdbRequestSlot */
abstract class C1222b extends C1270q {

    /* renamed from: a */
    private final String f3832a;

    /* renamed from: b */
    private final String f3833b;

    /* renamed from: c */
    private final Boolean f3834c;

    /* renamed from: d */
    private final Boolean f3835d;

    /* renamed from: e */
    private final Boolean f3836e;

    /* renamed from: f */
    private final Collection<String> f3837f;

    C1222b(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Collection<String> collection) {
        if (str != null) {
            this.f3832a = str;
            if (str2 != null) {
                this.f3833b = str2;
                this.f3834c = bool;
                this.f3835d = bool2;
                this.f3836e = bool3;
                if (collection != null) {
                    this.f3837f = collection;
                    return;
                }
                throw new NullPointerException("Null getSizes");
            }
            throw new NullPointerException("Null getPlacementId");
        }
        throw new NullPointerException("Null getImpressionId");
    }

    @SerializedName("impId")
    /* renamed from: a */
    public String mo3412a() {
        return this.f3832a;
    }

    @SerializedName("placementId")
    /* renamed from: b */
    public String mo3413b() {
        return this.f3833b;
    }

    @SerializedName("isNative")
    /* renamed from: e */
    public Boolean mo3416e() {
        return this.f3834c;
    }

    @SerializedName("interstitial")
    /* renamed from: d */
    public Boolean mo3415d() {
        return this.f3835d;
    }

    @SerializedName("rewarded")
    /* renamed from: f */
    public Boolean mo3418f() {
        return this.f3836e;
    }

    @SerializedName("sizes")
    /* renamed from: c */
    public Collection<String> mo3414c() {
        return this.f3837f;
    }

    public String toString() {
        return "CdbRequestSlot{getImpressionId=" + this.f3832a + ", getPlacementId=" + this.f3833b + ", isNativeAd=" + this.f3834c + ", isInterstitial=" + this.f3835d + ", isRewarded=" + this.f3836e + ", getSizes=" + this.f3837f + "}";
    }

    public boolean equals(Object obj) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1270q)) {
            return false;
        }
        C1270q qVar = (C1270q) obj;
        if (!this.f3832a.equals(qVar.mo3412a()) || !this.f3833b.equals(qVar.mo3413b()) || ((bool = this.f3834c) != null ? !bool.equals(qVar.mo3416e()) : qVar.mo3416e() != null) || ((bool2 = this.f3835d) != null ? !bool2.equals(qVar.mo3415d()) : qVar.mo3415d() != null) || ((bool3 = this.f3836e) != null ? !bool3.equals(qVar.mo3418f()) : qVar.mo3418f() != null) || !this.f3837f.equals(qVar.mo3414c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((this.f3832a.hashCode() ^ 1000003) * 1000003) ^ this.f3833b.hashCode()) * 1000003;
        Boolean bool = this.f3834c;
        int i = 0;
        int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.f3835d;
        int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.f3836e;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f3837f.hashCode();
    }
}
