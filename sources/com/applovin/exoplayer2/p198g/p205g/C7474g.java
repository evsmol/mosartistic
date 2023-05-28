package com.applovin.exoplayer2.p198g.p205g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.g.g.g */
public final class C7474g extends C7463b {
    public static final Parcelable.Creator<C7474g> CREATOR = new Parcelable.Creator<C7474g>() {
        /* renamed from: a */
        public C7474g createFromParcel(Parcel parcel) {
            return new C7474g(parcel.readLong(), parcel.readLong());
        }

        /* renamed from: a */
        public C7474g[] newArray(int i) {
            return new C7474g[i];
        }
    };

    /* renamed from: a */
    public final long f17120a;

    /* renamed from: b */
    public final long f17121b;

    private C7474g(long j, long j2) {
        this.f17120a = j;
        this.f17121b = j2;
    }

    /* renamed from: a */
    static long m20792a(C7772y yVar, long j) {
        long h = (long) yVar.mo55084h();
        if ((128 & h) != 0) {
            return 8589934591L & ((((h & 1) << 32) | yVar.mo55091o()) + j);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    static C7474g m20793a(C7772y yVar, long j, C7726ag agVar) {
        long a = m20792a(yVar, j);
        return new C7474g(a, agVar.mo54989b(a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17120a);
        parcel.writeLong(this.f17121b);
    }
}
