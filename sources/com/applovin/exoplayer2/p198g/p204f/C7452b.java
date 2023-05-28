package com.applovin.exoplayer2.p198g.p204f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p184b.C7058d;
import com.applovin.exoplayer2.p198g.C7399a;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.f.b */
public final class C7452b implements C7399a.C7401a {
    public static final Parcelable.Creator<C7452b> CREATOR = new Parcelable.Creator<C7452b>() {
        /* renamed from: a */
        public C7452b createFromParcel(Parcel parcel) {
            return new C7452b(parcel);
        }

        /* renamed from: a */
        public C7452b[] newArray(int i) {
            return new C7452b[i];
        }
    };

    /* renamed from: a */
    public final long f17072a;

    /* renamed from: b */
    public final long f17073b;

    /* renamed from: c */
    public final long f17074c;

    /* renamed from: d */
    public final long f17075d;

    /* renamed from: e */
    public final long f17076e;

    public C7452b(long j, long j2, long j3, long j4, long j5) {
        this.f17072a = j;
        this.f17073b = j2;
        this.f17074c = j3;
        this.f17075d = j4;
        this.f17076e = j5;
    }

    private C7452b(Parcel parcel) {
        this.f17072a = parcel.readLong();
        this.f17073b = parcel.readLong();
        this.f17074c = parcel.readLong();
        this.f17075d = parcel.readLong();
        this.f17076e = parcel.readLong();
    }

    /* renamed from: a */
    public /* synthetic */ C7864v mo54213a() {
        return C7399a.C7401a.CC.$default$a(this);
    }

    /* renamed from: a */
    public /* synthetic */ void mo54214a(C6797ac.C6799a aVar) {
        C7399a.C7401a.CC.$default$a(this, aVar);
    }

    /* renamed from: b */
    public /* synthetic */ byte[] mo54215b() {
        return C7399a.C7401a.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7452b bVar = (C7452b) obj;
        return this.f17072a == bVar.f17072a && this.f17073b == bVar.f17073b && this.f17074c == bVar.f17074c && this.f17075d == bVar.f17075d && this.f17076e == bVar.f17076e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + C7058d.m18936a(this.f17072a)) * 31) + C7058d.m18936a(this.f17073b)) * 31) + C7058d.m18936a(this.f17074c)) * 31) + C7058d.m18936a(this.f17075d)) * 31) + C7058d.m18936a(this.f17076e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f17072a + ", photoSize=" + this.f17073b + ", photoPresentationTimestampUs=" + this.f17074c + ", videoStartPosition=" + this.f17075d + ", videoSize=" + this.f17076e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17072a);
        parcel.writeLong(this.f17073b);
        parcel.writeLong(this.f17074c);
        parcel.writeLong(this.f17075d);
        parcel.writeLong(this.f17076e);
    }
}
