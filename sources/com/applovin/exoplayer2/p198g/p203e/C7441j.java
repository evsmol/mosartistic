package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.j */
public final class C7441j extends C7438h {
    public static final Parcelable.Creator<C7441j> CREATOR = new Parcelable.Creator<C7441j>() {
        /* renamed from: a */
        public C7441j createFromParcel(Parcel parcel) {
            return new C7441j(parcel);
        }

        /* renamed from: a */
        public C7441j[] newArray(int i) {
            return new C7441j[i];
        }
    };

    /* renamed from: a */
    public final int f17047a;

    /* renamed from: b */
    public final int f17048b;

    /* renamed from: c */
    public final int f17049c;

    /* renamed from: d */
    public final int[] f17050d;

    /* renamed from: e */
    public final int[] f17051e;

    public C7441j(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f17047a = i;
        this.f17048b = i2;
        this.f17049c = i3;
        this.f17050d = iArr;
        this.f17051e = iArr2;
    }

    C7441j(Parcel parcel) {
        super("MLLT");
        this.f17047a = parcel.readInt();
        this.f17048b = parcel.readInt();
        this.f17049c = parcel.readInt();
        this.f17050d = (int[]) C7728ai.m22198a(parcel.createIntArray());
        this.f17051e = (int[]) C7728ai.m22198a(parcel.createIntArray());
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
        C7441j jVar = (C7441j) obj;
        return this.f17047a == jVar.f17047a && this.f17048b == jVar.f17048b && this.f17049c == jVar.f17049c && Arrays.equals(this.f17050d, jVar.f17050d) && Arrays.equals(this.f17051e, jVar.f17051e);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17047a) * 31) + this.f17048b) * 31) + this.f17049c) * 31) + Arrays.hashCode(this.f17050d)) * 31) + Arrays.hashCode(this.f17051e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17047a);
        parcel.writeInt(this.f17048b);
        parcel.writeInt(this.f17049c);
        parcel.writeIntArray(this.f17050d);
        parcel.writeIntArray(this.f17051e);
    }
}
