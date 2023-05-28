package com.appnext.core;

/* renamed from: com.appnext.core.b */
public final class C8896b {
    private String cat = "";
    private int cnt;

    /* renamed from: fM */
    private String f22533fM = "";

    /* renamed from: fN */
    private int f22534fN;

    /* renamed from: fO */
    private int f22535fO;
    private String pbk = "";

    public C8896b(C8874Ad ad) {
        this.f22533fM = ad.getPlacementID();
        this.cat = ad.getCategories();
        this.pbk = ad.getPostback();
        this.f22534fN = ad.getMinVideoLength();
        this.f22535fO = ad.getMaxVideoLength();
        this.cnt = ad.getCount();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().isInstance(obj) && !obj.getClass().isInstance(this)) {
            return false;
        }
        if (!(obj instanceof C8896b)) {
            return super.equals(obj);
        }
        C8896b bVar = (C8896b) obj;
        return bVar.f22533fM.equals(this.f22533fM) && bVar.cat.equals(this.cat) && bVar.pbk.equals(this.pbk) && bVar.f22534fN == this.f22534fN && bVar.f22535fO == this.f22535fO && bVar.cnt == this.cnt;
    }

    public final int hashCode() {
        return (((((((((this.f22533fM.hashCode() * 31) + this.cat.hashCode()) * 31) + this.pbk.hashCode()) * 31) + this.f22534fN) * 31) + this.f22535fO) * 31) + this.cnt;
    }
}
