package com.applovin.exoplayer2.p198g.p205g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.g.g.f */
public final class C7470f extends C7463b {
    public static final Parcelable.Creator<C7470f> CREATOR = new Parcelable.Creator<C7470f>() {
        /* renamed from: a */
        public C7470f createFromParcel(Parcel parcel) {
            return new C7470f(parcel);
        }

        /* renamed from: a */
        public C7470f[] newArray(int i) {
            return new C7470f[i];
        }
    };

    /* renamed from: a */
    public final List<C7473b> f17106a;

    /* renamed from: com.applovin.exoplayer2.g.g.f$a */
    public static final class C7472a {

        /* renamed from: a */
        public final int f17107a;

        /* renamed from: b */
        public final long f17108b;

        private C7472a(int i, long j) {
            this.f17107a = i;
            this.f17108b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C7472a m20784b(Parcel parcel) {
            return new C7472a(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m20785c(Parcel parcel) {
            parcel.writeInt(this.f17107a);
            parcel.writeLong(this.f17108b);
        }
    }

    /* renamed from: com.applovin.exoplayer2.g.g.f$b */
    public static final class C7473b {

        /* renamed from: a */
        public final long f17109a;

        /* renamed from: b */
        public final boolean f17110b;

        /* renamed from: c */
        public final boolean f17111c;

        /* renamed from: d */
        public final boolean f17112d;

        /* renamed from: e */
        public final long f17113e;

        /* renamed from: f */
        public final List<C7472a> f17114f;

        /* renamed from: g */
        public final boolean f17115g;

        /* renamed from: h */
        public final long f17116h;

        /* renamed from: i */
        public final int f17117i;

        /* renamed from: j */
        public final int f17118j;

        /* renamed from: k */
        public final int f17119k;

        private C7473b(long j, boolean z, boolean z2, boolean z3, List<C7472a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f17109a = j;
            this.f17110b = z;
            this.f17111c = z2;
            this.f17112d = z3;
            this.f17114f = Collections.unmodifiableList(list);
            this.f17113e = j2;
            this.f17115g = z4;
            this.f17116h = j3;
            this.f17117i = i;
            this.f17118j = i2;
            this.f17119k = i3;
        }

        private C7473b(Parcel parcel) {
            this.f17109a = parcel.readLong();
            boolean z = false;
            this.f17110b = parcel.readByte() == 1;
            this.f17111c = parcel.readByte() == 1;
            this.f17112d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C7472a.m20784b(parcel));
            }
            this.f17114f = Collections.unmodifiableList(arrayList);
            this.f17113e = parcel.readLong();
            this.f17115g = parcel.readByte() == 1 ? true : z;
            this.f17116h = parcel.readLong();
            this.f17117i = parcel.readInt();
            this.f17118j = parcel.readInt();
            this.f17119k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C7473b m20789b(C7772y yVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long o = yVar.mo55091o();
            boolean z5 = (yVar.mo55084h() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int h = yVar.mo55084h();
                boolean z6 = (h & 128) != 0;
                boolean z7 = (h & 64) != 0;
                boolean z8 = (h & 32) != 0;
                long o2 = z7 ? yVar.mo55091o() : -9223372036854775807L;
                if (!z7) {
                    int h2 = yVar.mo55084h();
                    ArrayList arrayList3 = new ArrayList(h2);
                    for (int i4 = 0; i4 < h2; i4++) {
                        arrayList3.add(new C7472a(yVar.mo55084h(), yVar.mo55091o()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long h3 = (long) yVar.mo55084h();
                    boolean z9 = (128 & h3) != 0;
                    j3 = ((((h3 & 1) << 32) | yVar.mo55091o()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int i5 = yVar.mo55085i();
                int h4 = yVar.mo55084h();
                z = z7;
                i = yVar.mo55084h();
                j = j3;
                arrayList = arrayList2;
                long j4 = o2;
                i3 = i5;
                i2 = h4;
                j2 = j4;
                boolean z10 = z6;
                z2 = z4;
                z3 = z10;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            return new C7473b(o, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m20790b(Parcel parcel) {
            parcel.writeLong(this.f17109a);
            parcel.writeByte(this.f17110b ? (byte) 1 : 0);
            parcel.writeByte(this.f17111c ? (byte) 1 : 0);
            parcel.writeByte(this.f17112d ? (byte) 1 : 0);
            int size = this.f17114f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f17114f.get(i).m20785c(parcel);
            }
            parcel.writeLong(this.f17113e);
            parcel.writeByte(this.f17115g ? (byte) 1 : 0);
            parcel.writeLong(this.f17116h);
            parcel.writeInt(this.f17117i);
            parcel.writeInt(this.f17118j);
            parcel.writeInt(this.f17119k);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C7473b m20791c(Parcel parcel) {
            return new C7473b(parcel);
        }
    }

    private C7470f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C7473b.m20791c(parcel));
        }
        this.f17106a = Collections.unmodifiableList(arrayList);
    }

    private C7470f(List<C7473b> list) {
        this.f17106a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    static C7470f m20779a(C7772y yVar) {
        int h = yVar.mo55084h();
        ArrayList arrayList = new ArrayList(h);
        for (int i = 0; i < h; i++) {
            arrayList.add(C7473b.m20789b(yVar));
        }
        return new C7470f((List<C7473b>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f17106a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f17106a.get(i2).m20790b(parcel);
        }
    }
}
