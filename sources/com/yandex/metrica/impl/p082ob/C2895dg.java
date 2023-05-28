package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.p091ym.MessageNano;

/* renamed from: com.yandex.metrica.impl.ob.dg */
public final class C2895dg {

    /* renamed from: a */
    public final String f7645a;

    /* renamed from: b */
    public final long f7646b;

    /* renamed from: c */
    public final long f7647c;

    /* renamed from: d */
    public final C2896a f7648d;

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public enum C2896a {
        UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
        GP("gpl"),
        HMS("hms-content-provider");
        

        /* renamed from: a */
        public final String f7653a;

        private C2896a(String str) {
            this.f7653a = str;
        }
    }

    private C2895dg(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C3509tf a = C3509tf.m10734a(bArr);
        this.f7645a = a.f9153a;
        this.f7646b = a.f9155c;
        this.f7647c = a.f9154b;
        this.f7648d = m9368a(a.f9156d);
    }

    /* renamed from: a */
    public static C2895dg m9369a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (C1848A2.m6811a(bArr)) {
            return null;
        }
        return new C2895dg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2895dg.class != obj.getClass()) {
            return false;
        }
        C2895dg dgVar = (C2895dg) obj;
        if (this.f7646b == dgVar.f7646b && this.f7647c == dgVar.f7647c && this.f7645a.equals(dgVar.f7645a) && this.f7648d == dgVar.f7648d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7646b;
        long j2 = this.f7647c;
        return (((((this.f7645a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f7648d.hashCode();
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.f7645a + '\'' + ", referrerClickTimestampSeconds=" + this.f7646b + ", installBeginTimestampSeconds=" + this.f7647c + ", source=" + this.f7648d + '}';
    }

    /* renamed from: a */
    public byte[] mo17458a() {
        C3509tf tfVar = new C3509tf();
        tfVar.f9153a = this.f7645a;
        tfVar.f9155c = this.f7646b;
        tfVar.f9154b = this.f7647c;
        int ordinal = this.f7648d.ordinal();
        int i = 2;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal != 2) {
            i = 0;
        }
        tfVar.f9156d = i;
        return MessageNano.toByteArray(tfVar);
    }

    public C2895dg(String str, long j, long j2, C2896a aVar) {
        this.f7645a = str;
        this.f7646b = j;
        this.f7647c = j2;
        this.f7648d = aVar;
    }

    /* renamed from: a */
    private C2896a m9368a(int i) {
        if (i == 1) {
            return C2896a.GP;
        }
        if (i != 2) {
            return C2896a.UNKNOWN;
        }
        return C2896a.HMS;
    }
}
