package com.applovin.exoplayer2.p198g.p204f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.g.f.c */
public final class C7454c implements C7399a.C7401a {
    public static final Parcelable.Creator<C7454c> CREATOR = new Parcelable.Creator<C7454c>() {
        /* renamed from: a */
        public C7454c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C7456a.class.getClassLoader());
            return new C7454c(arrayList);
        }

        /* renamed from: a */
        public C7454c[] newArray(int i) {
            return new C7454c[i];
        }
    };

    /* renamed from: a */
    public final List<C7456a> f17077a;

    /* renamed from: com.applovin.exoplayer2.g.f.c$a */
    public static final class C7456a implements Parcelable {
        public static final Parcelable.Creator<C7456a> CREATOR = new Parcelable.Creator<C7456a>() {
            /* renamed from: a */
            public C7456a createFromParcel(Parcel parcel) {
                return new C7456a(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: a */
            public C7456a[] newArray(int i) {
                return new C7456a[i];
            }
        };

        /* renamed from: a */
        public static final Comparator<C7456a> f17078a = $$Lambda$c$a$P3NDQmXkrLM2N1UQsk6agOSgdE.INSTANCE;

        /* renamed from: b */
        public final long f17079b;

        /* renamed from: c */
        public final long f17080c;

        /* renamed from: d */
        public final int f17081d;

        public C7456a(long j, long j2, int i) {
            C7717a.m22118a(j < j2);
            this.f17079b = j;
            this.f17080c = j2;
            this.f17081d = i;
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
            C7456a aVar = (C7456a) obj;
            return this.f17079b == aVar.f17079b && this.f17080c == aVar.f17080c && this.f17081d == aVar.f17081d;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f17079b), Long.valueOf(this.f17080c), Integer.valueOf(this.f17081d));
        }

        public String toString() {
            return C7728ai.m22200a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f17079b), Long.valueOf(this.f17080c), Integer.valueOf(this.f17081d));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f17079b);
            parcel.writeLong(this.f17080c);
            parcel.writeInt(this.f17081d);
        }
    }

    public C7454c(List<C7456a> list) {
        this.f17077a = list;
        C7717a.m22118a(!m20749a(list));
    }

    /* renamed from: a */
    private static boolean m20749a(List<C7456a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f17080c;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f17079b < j) {
                return true;
            }
            j = list.get(i).f17080c;
        }
        return false;
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
        return this.f17077a.equals(((C7454c) obj).f17077a);
    }

    public int hashCode() {
        return this.f17077a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f17077a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f17077a);
    }
}
