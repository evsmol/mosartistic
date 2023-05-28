package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.mc */
public class C3208mc {

    /* renamed from: a */
    public final long f8307a;

    /* renamed from: b */
    public final float f8308b;

    /* renamed from: c */
    public final int f8309c;

    /* renamed from: d */
    public final int f8310d;

    /* renamed from: e */
    public final long f8311e;

    /* renamed from: f */
    public final int f8312f;

    /* renamed from: g */
    public final boolean f8313g;

    /* renamed from: h */
    public final long f8314h;

    /* renamed from: i */
    public final boolean f8315i;

    /* renamed from: j */
    public final boolean f8316j;

    /* renamed from: k */
    public final boolean f8317k;

    /* renamed from: l */
    public final boolean f8318l;

    /* renamed from: m */
    public final C2713Xb f8319m;

    /* renamed from: n */
    public final C2713Xb f8320n;

    /* renamed from: o */
    public final C2713Xb f8321o;

    /* renamed from: p */
    public final C2713Xb f8322p;

    /* renamed from: q */
    public final C2864cc f8323q;

    public C3208mc(long j, float f, int i, int i2, long j2, int i3, boolean z, long j3, boolean z2, boolean z3, boolean z4, boolean z5, C2713Xb xb, C2713Xb xb2, C2713Xb xb3, C2713Xb xb4, C2864cc ccVar) {
        this.f8307a = j;
        this.f8308b = f;
        this.f8309c = i;
        this.f8310d = i2;
        this.f8311e = j2;
        this.f8312f = i3;
        this.f8313g = z;
        this.f8314h = j3;
        this.f8315i = z2;
        this.f8316j = z3;
        this.f8317k = z4;
        this.f8318l = z5;
        this.f8319m = xb;
        this.f8320n = xb2;
        this.f8321o = xb3;
        this.f8322p = xb4;
        this.f8323q = ccVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3208mc.class != obj.getClass()) {
            return false;
        }
        C3208mc mcVar = (C3208mc) obj;
        if (this.f8307a != mcVar.f8307a || Float.compare(mcVar.f8308b, this.f8308b) != 0 || this.f8309c != mcVar.f8309c || this.f8310d != mcVar.f8310d || this.f8311e != mcVar.f8311e || this.f8312f != mcVar.f8312f || this.f8313g != mcVar.f8313g || this.f8314h != mcVar.f8314h || this.f8315i != mcVar.f8315i || this.f8316j != mcVar.f8316j || this.f8317k != mcVar.f8317k || this.f8318l != mcVar.f8318l) {
            return false;
        }
        C2713Xb xb = this.f8319m;
        if (xb == null ? mcVar.f8319m != null : !xb.equals(mcVar.f8319m)) {
            return false;
        }
        C2713Xb xb2 = this.f8320n;
        if (xb2 == null ? mcVar.f8320n != null : !xb2.equals(mcVar.f8320n)) {
            return false;
        }
        C2713Xb xb3 = this.f8321o;
        if (xb3 == null ? mcVar.f8321o != null : !xb3.equals(mcVar.f8321o)) {
            return false;
        }
        C2713Xb xb4 = this.f8322p;
        if (xb4 == null ? mcVar.f8322p != null : !xb4.equals(mcVar.f8322p)) {
            return false;
        }
        C2864cc ccVar = this.f8323q;
        C2864cc ccVar2 = mcVar.f8323q;
        if (ccVar != null) {
            return ccVar.equals(ccVar2);
        }
        if (ccVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f8307a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        float f = this.f8308b;
        int i2 = 0;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j2 = this.f8311e;
        long j3 = this.f8314h;
        int i3 = (((((((((((((((((((((i + floatToIntBits) * 31) + this.f8309c) * 31) + this.f8310d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f8312f) * 31) + (this.f8313g ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f8315i ? 1 : 0)) * 31) + (this.f8316j ? 1 : 0)) * 31) + (this.f8317k ? 1 : 0)) * 31) + (this.f8318l ? 1 : 0)) * 31;
        C2713Xb xb = this.f8319m;
        int hashCode = (i3 + (xb != null ? xb.hashCode() : 0)) * 31;
        C2713Xb xb2 = this.f8320n;
        int hashCode2 = (hashCode + (xb2 != null ? xb2.hashCode() : 0)) * 31;
        C2713Xb xb3 = this.f8321o;
        int hashCode3 = (hashCode2 + (xb3 != null ? xb3.hashCode() : 0)) * 31;
        C2713Xb xb4 = this.f8322p;
        int hashCode4 = (hashCode3 + (xb4 != null ? xb4.hashCode() : 0)) * 31;
        C2864cc ccVar = this.f8323q;
        if (ccVar != null) {
            i2 = ccVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "LocationArguments{updateTimeInterval=" + this.f8307a + ", updateDistanceInterval=" + this.f8308b + ", recordsCountToForceFlush=" + this.f8309c + ", maxBatchSize=" + this.f8310d + ", maxAgeToForceFlush=" + this.f8311e + ", maxRecordsToStoreLocally=" + this.f8312f + ", collectionEnabled=" + this.f8313g + ", lbsUpdateTimeInterval=" + this.f8314h + ", lbsCollectionEnabled=" + this.f8315i + ", passiveCollectionEnabled=" + this.f8316j + ", allCellsCollectingEnabled=" + this.f8317k + ", connectedCellCollectingEnabled=" + this.f8318l + ", wifiAccessConfig=" + this.f8319m + ", lbsAccessConfig=" + this.f8320n + ", gpsAccessConfig=" + this.f8321o + ", passiveAccessConfig=" + this.f8322p + ", gplConfig=" + this.f8323q + '}';
    }
}
