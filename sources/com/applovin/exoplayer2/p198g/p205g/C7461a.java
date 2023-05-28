package com.applovin.exoplayer2.p198g.p205g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.g.g.a */
public final class C7461a extends C7463b {
    public static final Parcelable.Creator<C7461a> CREATOR = new Parcelable.Creator<C7461a>() {
        /* renamed from: a */
        public C7461a createFromParcel(Parcel parcel) {
            return new C7461a(parcel);
        }

        /* renamed from: a */
        public C7461a[] newArray(int i) {
            return new C7461a[i];
        }
    };

    /* renamed from: a */
    public final long f17084a;

    /* renamed from: b */
    public final long f17085b;

    /* renamed from: c */
    public final byte[] f17086c;

    private C7461a(long j, byte[] bArr, long j2) {
        this.f17084a = j2;
        this.f17085b = j;
        this.f17086c = bArr;
    }

    private C7461a(Parcel parcel) {
        this.f17084a = parcel.readLong();
        this.f17085b = parcel.readLong();
        this.f17086c = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    /* renamed from: a */
    static C7461a m20765a(C7772y yVar, int i, long j) {
        long o = yVar.mo55091o();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        yVar.mo55071a(bArr, 0, i2);
        return new C7461a(o, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17084a);
        parcel.writeLong(this.f17085b);
        parcel.writeByteArray(this.f17086c);
    }
}
