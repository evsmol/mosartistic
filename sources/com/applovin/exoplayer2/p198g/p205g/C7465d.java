package com.applovin.exoplayer2.p198g.p205g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.g.g.d */
public final class C7465d extends C7463b {
    public static final Parcelable.Creator<C7465d> CREATOR = new Parcelable.Creator<C7465d>() {
        /* renamed from: a */
        public C7465d createFromParcel(Parcel parcel) {
            return new C7465d(parcel);
        }

        /* renamed from: a */
        public C7465d[] newArray(int i) {
            return new C7465d[i];
        }
    };

    /* renamed from: a */
    public final long f17090a;

    /* renamed from: b */
    public final boolean f17091b;

    /* renamed from: c */
    public final boolean f17092c;

    /* renamed from: d */
    public final boolean f17093d;

    /* renamed from: e */
    public final boolean f17094e;

    /* renamed from: f */
    public final long f17095f;

    /* renamed from: g */
    public final long f17096g;

    /* renamed from: h */
    public final List<C7467a> f17097h;

    /* renamed from: i */
    public final boolean f17098i;

    /* renamed from: j */
    public final long f17099j;

    /* renamed from: k */
    public final int f17100k;

    /* renamed from: l */
    public final int f17101l;

    /* renamed from: m */
    public final int f17102m;

    /* renamed from: com.applovin.exoplayer2.g.g.d$a */
    public static final class C7467a {

        /* renamed from: a */
        public final int f17103a;

        /* renamed from: b */
        public final long f17104b;

        /* renamed from: c */
        public final long f17105c;

        private C7467a(int i, long j, long j2) {
            this.f17103a = i;
            this.f17104b = j;
            this.f17105c = j2;
        }

        /* renamed from: b */
        public static C7467a m20775b(Parcel parcel) {
            return new C7467a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: a */
        public void mo54413a(Parcel parcel) {
            parcel.writeInt(this.f17103a);
            parcel.writeLong(this.f17104b);
            parcel.writeLong(this.f17105c);
        }
    }

    private C7465d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C7467a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f17090a = j;
        this.f17091b = z;
        this.f17092c = z2;
        this.f17093d = z3;
        this.f17094e = z4;
        this.f17095f = j2;
        this.f17096g = j3;
        this.f17097h = Collections.unmodifiableList(list);
        this.f17098i = z5;
        this.f17099j = j4;
        this.f17100k = i;
        this.f17101l = i2;
        this.f17102m = i3;
    }

    private C7465d(Parcel parcel) {
        this.f17090a = parcel.readLong();
        boolean z = false;
        this.f17091b = parcel.readByte() == 1;
        this.f17092c = parcel.readByte() == 1;
        this.f17093d = parcel.readByte() == 1;
        this.f17094e = parcel.readByte() == 1;
        this.f17095f = parcel.readLong();
        this.f17096g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C7467a.m20775b(parcel));
        }
        this.f17097h = Collections.unmodifiableList(arrayList);
        this.f17098i = parcel.readByte() == 1 ? true : z;
        this.f17099j = parcel.readLong();
        this.f17100k = parcel.readInt();
        this.f17101l = parcel.readInt();
        this.f17102m = parcel.readInt();
    }

    /* renamed from: a */
    static C7465d m20772a(C7772y yVar, long j, C7726ag agVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        C7726ag agVar2 = agVar;
        long o = yVar.mo55091o();
        boolean z6 = (yVar.mo55084h() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int h = yVar.mo55084h();
            boolean z7 = (h & 128) != 0;
            boolean z8 = (h & 64) != 0;
            boolean z9 = (h & 32) != 0;
            boolean z10 = (h & 16) != 0;
            long a = (!z8 || z10) ? -9223372036854775807L : C7474g.m20792a(yVar, j);
            if (!z8) {
                int h2 = yVar.mo55084h();
                ArrayList arrayList = new ArrayList(h2);
                for (int i4 = 0; i4 < h2; i4++) {
                    int h3 = yVar.mo55084h();
                    long a2 = !z10 ? C7474g.m20792a(yVar, j) : -9223372036854775807L;
                    arrayList.add(new C7467a(h3, a2, agVar2.mo54989b(a2)));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long h4 = (long) yVar.mo55084h();
                boolean z11 = (128 & h4) != 0;
                j4 = ((((h4 & 1) << 32) | yVar.mo55091o()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = yVar.mo55085i();
            z = z8;
            i2 = yVar.mo55084h();
            i = yVar.mo55084h();
            list = emptyList;
            long j5 = a;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new C7465d(o, z6, z4, z, z3, j3, agVar2.mo54989b(j3), list, z2, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17090a);
        parcel.writeByte(this.f17091b ? (byte) 1 : 0);
        parcel.writeByte(this.f17092c ? (byte) 1 : 0);
        parcel.writeByte(this.f17093d ? (byte) 1 : 0);
        parcel.writeByte(this.f17094e ? (byte) 1 : 0);
        parcel.writeLong(this.f17095f);
        parcel.writeLong(this.f17096g);
        int size = this.f17097h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f17097h.get(i2).mo54413a(parcel);
        }
        parcel.writeByte(this.f17098i ? (byte) 1 : 0);
        parcel.writeLong(this.f17099j);
        parcel.writeInt(this.f17100k);
        parcel.writeInt(this.f17101l);
        parcel.writeInt(this.f17102m);
    }
}
